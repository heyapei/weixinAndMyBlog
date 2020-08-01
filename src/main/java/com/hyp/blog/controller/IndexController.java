package com.hyp.blog.controller;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 何亚培
 * @Version V1.0
 * @Date 2020/8/1 11:08
 * @Description: TODO 进入日志首页
 */
@RestController
@RequestMapping(value = {"/", "/index"})
@Slf4j
public class IndexController {


    @ApiOperation("进入日志首页")
    @RequestMapping
    public String weixinBlogIndexPage() {
        return "bootstraptest/test1";
    }

}
