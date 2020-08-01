package com.hyp.blog.pojo.modal;

import java.util.Date;
import javax.persistence.*;

public class Journal {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 创建人
     */
    @Column(name = "create_user")
    private String createUser;

    /**
     * 日志类型 0 何亚培 1去投票 
     */
    @Column(name = "journal_type")
    private Integer journalType;

    /**
     * 封面图
     */
    @Column(name = "journal_cover_img")
    private String journalCoverImg;

    /**
     * 标题
     */
    private String title;

    /**
     * 描述
     */
    @Column(name = "explain_word")
    private String explainWord;

    /**
     * 日志分类
     */
    @Column(name = "journal_classify")
    private String journalClassify;

    /**
     * 查看人数
     */
    @Column(name = "view_num")
    private Integer viewNum;

    /**
     * 评论人数
     */
    @Column(name = "comment_num")
    private Integer commentNum;

    /**
     * 密码
     */
    @Column(name = "pass_word")
    private String passWord;

    /**
     * 可查看权限
     */
    @Column(name = "access_role")
    private String accessRole;

    /**
     * 状态值 0 默认
     */
    private Integer status;

    /**
     * 排序
     */
    @Column(name = "show_order")
    private Integer showOrder;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 备用字段
     */
    private String ext1;

    private String ext2;

    private String ext3;

    private String ext4;

    private String ext5;

    /**
     * 日志内容
     */
    @Column(name = "journal_content")
    private String journalContent;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取创建人
     *
     * @return create_user - 创建人
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建人
     *
     * @param createUser 创建人
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取日志类型 0 何亚培 1去投票 
     *
     * @return journal_type - 日志类型 0 何亚培 1去投票 
     */
    public Integer getJournalType() {
        return journalType;
    }

    /**
     * 设置日志类型 0 何亚培 1去投票 
     *
     * @param journalType 日志类型 0 何亚培 1去投票 
     */
    public void setJournalType(Integer journalType) {
        this.journalType = journalType;
    }

    /**
     * 获取封面图
     *
     * @return journal_cover_img - 封面图
     */
    public String getJournalCoverImg() {
        return journalCoverImg;
    }

    /**
     * 设置封面图
     *
     * @param journalCoverImg 封面图
     */
    public void setJournalCoverImg(String journalCoverImg) {
        this.journalCoverImg = journalCoverImg;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取描述
     *
     * @return explain_word - 描述
     */
    public String getExplainWord() {
        return explainWord;
    }

    /**
     * 设置描述
     *
     * @param explainWord 描述
     */
    public void setExplainWord(String explainWord) {
        this.explainWord = explainWord;
    }

    /**
     * 获取日志分类
     *
     * @return journal_classify - 日志分类
     */
    public String getJournalClassify() {
        return journalClassify;
    }

    /**
     * 设置日志分类
     *
     * @param journalClassify 日志分类
     */
    public void setJournalClassify(String journalClassify) {
        this.journalClassify = journalClassify;
    }

    /**
     * 获取查看人数
     *
     * @return view_num - 查看人数
     */
    public Integer getViewNum() {
        return viewNum;
    }

    /**
     * 设置查看人数
     *
     * @param viewNum 查看人数
     */
    public void setViewNum(Integer viewNum) {
        this.viewNum = viewNum;
    }

    /**
     * 获取评论人数
     *
     * @return comment_num - 评论人数
     */
    public Integer getCommentNum() {
        return commentNum;
    }

    /**
     * 设置评论人数
     *
     * @param commentNum 评论人数
     */
    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    /**
     * 获取密码
     *
     * @return pass_word - 密码
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 设置密码
     *
     * @param passWord 密码
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * 获取可查看权限
     *
     * @return access_role - 可查看权限
     */
    public String getAccessRole() {
        return accessRole;
    }

    /**
     * 设置可查看权限
     *
     * @param accessRole 可查看权限
     */
    public void setAccessRole(String accessRole) {
        this.accessRole = accessRole;
    }

    /**
     * 获取状态值 0 默认
     *
     * @return status - 状态值 0 默认
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态值 0 默认
     *
     * @param status 状态值 0 默认
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取排序
     *
     * @return show_order - 排序
     */
    public Integer getShowOrder() {
        return showOrder;
    }

    /**
     * 设置排序
     *
     * @param showOrder 排序
     */
    public void setShowOrder(Integer showOrder) {
        this.showOrder = showOrder;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取备用字段
     *
     * @return ext1 - 备用字段
     */
    public String getExt1() {
        return ext1;
    }

    /**
     * 设置备用字段
     *
     * @param ext1 备用字段
     */
    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    /**
     * @return ext2
     */
    public String getExt2() {
        return ext2;
    }

    /**
     * @param ext2
     */
    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    /**
     * @return ext3
     */
    public String getExt3() {
        return ext3;
    }

    /**
     * @param ext3
     */
    public void setExt3(String ext3) {
        this.ext3 = ext3;
    }

    /**
     * @return ext4
     */
    public String getExt4() {
        return ext4;
    }

    /**
     * @param ext4
     */
    public void setExt4(String ext4) {
        this.ext4 = ext4;
    }

    /**
     * @return ext5
     */
    public String getExt5() {
        return ext5;
    }

    /**
     * @param ext5
     */
    public void setExt5(String ext5) {
        this.ext5 = ext5;
    }

    /**
     * 获取日志内容
     *
     * @return journal_content - 日志内容
     */
    public String getJournalContent() {
        return journalContent;
    }

    /**
     * 设置日志内容
     *
     * @param journalContent 日志内容
     */
    public void setJournalContent(String journalContent) {
        this.journalContent = journalContent;
    }
}