package com.hyp.blog.controller.blog;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
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
@RequestMapping(value = {"/"})
@Slf4j
public class BlogListController {

    @ApiOperation("按照日志类型，进入对应的日志首页")
    @GetMapping("{blogType}")
    public ModelAndView showBlogList(@PathVariable Integer blogType, ModelAndView modelAndView) {
        log.info("日志类型：" + blogType);


        //向模型添加属性
        modelAndView.addObject("blogType", blogType);
        //设置视图名称
        modelAndView.setViewName("blog/showBlogList");
        return modelAndView;
    }


    @ApiOperation("查看日志的详细内容")
    @GetMapping("showBlogContent/{blogId}")
    public ModelAndView showBlogContent(@PathVariable Integer blogId, ModelAndView modelAndView) {
        log.info("日志ID：" + blogId);


        //向模型添加属性
        modelAndView.addObject("blogId", blogId);
        //设置视图名称
        modelAndView.setViewName("blog/showBlogContent");

        return modelAndView;
    }


}
