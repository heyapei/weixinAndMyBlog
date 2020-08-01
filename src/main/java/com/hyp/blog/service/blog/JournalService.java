package com.hyp.blog.service.blog;

import com.hyp.blog.exception.MyDefinitionException;
import com.hyp.blog.pojo.blog.model.Journal;

/**
 * @Author 何亚培
 * @Version V1.0
 * @Date 2020/8/1 14:08
 * @Description: TODO
 */
public interface JournalService {


    /*通用*/

    /**
     * 获取日志详细信息
     * @param pkId
     * @return
     * @throws MyDefinitionException
     */
    Journal selectJournalById(Integer pkId) throws MyDefinitionException;


}
