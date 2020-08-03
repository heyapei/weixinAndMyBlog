package com.hyp.blog.pojo.blog.vo;

import lombok.Data;

import java.util.Date;

/**
 * @Author 何亚培
 * @Version V1.0
 * @Date 2020/8/1 15:33
 * @Description: TODO
 */
@Data
public class BlogListVO {

    private Integer id;
    private Integer createUserId;
    private String journalCoverImg;
    private String title;
    private Integer commentNum;
    private Integer viewNum;
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    private Integer journalType;
    private Integer showOrder;
    private String journalTypeMsg;

    /**创建人信息*/
    private String avatarImg;
    private String name;


}
