package com.hyp.blog.service.weixinmanager;

import com.hyp.blog.pojo.weixinmanager.model.UserSupplyInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author 何亚培
 * @Version V1.0
 * @Date 2020/8/1 15:15
 * @Description: TODO
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserSupplyInfoServiceTest {

    @Autowired
    private UserSupplyInfoService userSupplyInfoService;

    @Test
    public void selectByUserId() {
        UserSupplyInfo userSupplyInfo = userSupplyInfoService.selectByUserId(1);
        log.info("查询结果：{}", userSupplyInfo);
    }
}