package com.hyp.blog.service.blog.impl;

import com.hyp.blog.exception.MyDefinitionException;
import com.hyp.blog.mapper.blog.JournalMapper;
import com.hyp.blog.pojo.blog.model.Journal;
import com.hyp.blog.service.blog.JournalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 何亚培
 * @Version V1.0
 * @Date 2020/8/1 14:08
 * @Description: TODO
 */
@Service
@Slf4j
public class JournalServiceImpl implements JournalService {


    @Autowired
    private JournalMapper journalMapper;


    /**
     * 获取日志详细信息
     *
     * @param pkId
     * @return
     * @throws MyDefinitionException
     */
    @Override
    public Journal selectJournalById(Integer pkId) throws MyDefinitionException {
        if (pkId == null) {
            throw new MyDefinitionException("必须指定日志ID");
        }

        Journal journal = null;
        try {
            journal = journalMapper.selectByPrimaryKey(pkId);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("获取日志详细信息操作过程错误，错误原因：{}", e.toString());
            throw new MyDefinitionException("获取日志详细信息操作过程错误");
        }

        return journal;
    }
}
