package com.hyp.blog.controller.blog;

import com.github.pagehelper.PageInfo;
import com.hyp.blog.exception.MyDefinitionException;
import com.hyp.blog.exception.returnresult.MyError;
import com.hyp.blog.pojo.blog.model.JournalModalJournalTypeEnum;
import com.hyp.blog.pojo.blog.query.BlogListQuery;
import com.hyp.blog.pojo.blog.vo.BlogShowVO;
import com.hyp.blog.service.blog.JournalService;
import com.hyp.blog.utils.MyEnumUtil;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author 何亚培
 * @Version V1.0
 * @Date 2020/8/1 13:44
 * @Description: TODO
 */
@RestController
@RequestMapping(value = {"/b"})
@Slf4j
public class BlogShowController {

    @Autowired
    private JournalService journalService;

    @ApiOperation("按照日志类型，进入对应的日志首页")
    @GetMapping("{blogType}")
    public ModelAndView showBlogList(@PathVariable Integer blogType
            , ModelAndView modelAndView) {
        //log.info("日志类型：" + blogType);

        BlogListQuery blogListQuery = BlogListQuery.init();
        blogListQuery.setJournalType(blogType);

        PageInfo pageInfo = null;
        try {
            pageInfo = journalService.selectPageInfoByBlogListQuery(blogListQuery);
        } catch (MyDefinitionException e) {
            MyError myError =  MyError.requestErrorInit();
            myError.setCodeMsg(e.getMessage());
            modelAndView.addObject("myError",myError);
            //设置视图名称
            modelAndView.setViewName("error");
            return modelAndView;
        }


        //向模型添加属性
        modelAndView.addObject("pageInfo", pageInfo);
        modelAndView.addObject("blogTypeMsg", MyEnumUtil.getByIntegerTypeCode(JournalModalJournalTypeEnum.class, "getCode", blogType).getMsg());
        //设置视图名称
        modelAndView.setViewName("blog/showBlogList");
        return modelAndView;
    }


    @ApiOperation("查看日志的详细内容")
    @GetMapping("showBlogContent/{blogId}")
    public ModelAndView showBlogContent(@PathVariable Integer blogId, ModelAndView modelAndView) {
        // log.info("日志ID：" + blogId);

        BlogShowVO blogShowVO = null;
        try {
            blogShowVO = journalService.showBlogByPkId(blogId);
        } catch (MyDefinitionException e) {
            MyError myError =  MyError.requestErrorInit();
            myError.setCodeMsg(e.getMessage());
            modelAndView.addObject("myError",myError);
            //设置视图名称
            modelAndView.setViewName("error");
            return modelAndView;
        }
        //向模型添加属性
        modelAndView.addObject("blogShowVO", blogShowVO);
        //设置视图名称
        modelAndView.setViewName("blog/showBlogContent");

        return modelAndView;
    }


}
