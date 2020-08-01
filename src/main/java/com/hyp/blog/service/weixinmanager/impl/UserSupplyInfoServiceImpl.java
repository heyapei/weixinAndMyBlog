package com.hyp.blog.service.weixinmanager.impl;

import com.hyp.blog.exception.MyDefinitionException;
import com.hyp.blog.mapper.weixinmanager.UserSupplyInfoMapper;
import com.hyp.blog.pojo.weixinmanager.model.UserSupplyInfo;
import com.hyp.blog.service.weixinmanager.UserSupplyInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

/**
 * @Author 何亚培
 * @Version V1.0
 * @Date 2020/8/1 15:12
 * @Description: TODO
 */

@Service
@Slf4j
public class UserSupplyInfoServiceImpl implements UserSupplyInfoService {

    @Autowired
    private UserSupplyInfoMapper userSupplyInfoMapper;

    /**
     * 通过userId查询用户补充信息
     *
     * @param userId
     * @return
     * @throws MyDefinitionException
     */
    @Override
    public UserSupplyInfo selectByUserId(Integer userId) throws MyDefinitionException {
        if (userId == null) {
            throw new MyDefinitionException("必须指定用户");
        }
        Example example = new Example(UserSupplyInfo.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userId", userId);
        try {
            return userSupplyInfoMapper.selectOneByExample(example);
        } catch (Exception e) {
            log.error("通过userId查询用户补充信息操作错误，错误原因：{}", e.toString());
            throw new MyDefinitionException("通过userId查询用户补充信息操作错误");
        }
    }
}
