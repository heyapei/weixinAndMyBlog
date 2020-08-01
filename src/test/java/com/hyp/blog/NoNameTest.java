package com.hyp.blog;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @Author 何亚培
 * @Version V1.0
 * @Date 2020/6/11 18:50
 * @Description: TODO
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class NoNameTest {


    @Test
    public void testResult() {

        log.error("你好");
    }
}
