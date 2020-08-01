package com.hyp.blog.controller;

import com.hyp.blog.exception.MyDefinitionException;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 何亚培
 * @Version V1.0
 * @Date 2020/8/1 11:08
 * @Description: TODO 进入日志首页
 */
@Controller
@RequestMapping(value = {"/", "/index"})
@Slf4j
public class IndexController {


    @ApiOperation("不接受直接http://blog.yapei.cool/进行访问要求必须指定")
    @RequestMapping
    public String weixinBlogIndexPage() {
        if (true) {
            throw new MyDefinitionException("我们无法解析你给的地址，请重试");
        }
        return "";
    }



}
