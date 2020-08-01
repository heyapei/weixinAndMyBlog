package com.hyp.blog.service.blog;


import com.hyp.blog.pojo.blog.model.Journal;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author 何亚培
 * @Version V1.0
 * @Date 2020/8/1 14:56
 * @Description: TODO
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class JournalServiceTest {

    @Autowired
    private JournalService journalService;

    @Test
    public void selectJournalById() {
        Journal journal = journalService.selectJournalById(17);
        log.info("查询结果：{}", journal);
    }
}