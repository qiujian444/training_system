package com.ruoyi.exam.domain;

import com.ruoyi.common.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.base.BaseEntity;

import javax.persistence.Id;
import java.util.Date;

/**
 * 我的考试记录表 exam_user_examination
 *
 * @author zhujj
 * @date 2019-01-12
 */
public class ExamUserExamination {
    private static final long serialVersionUID = 1L;

    /**
     * 考试记录编码
     */
    @Id
    private Integer id;
    /**
     * 会员代码
     */
    private Integer vipUserId;
    /**
     * 试题编码
     */
    private Integer examExaminationId;
    /**
     * 试卷编码
     */
    private Integer examPaperId;
    /**
     * 考试得分
     */
    @Excel(name = "考试得分", order = 7)
    private Integer score;
    /**
     * 创建者
     */
    private String createBy;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 更新者
     */
    private String updateBy;
    /**
     * 更新时间
     */
    private Date updateDate;
    /**
     * 备注信息
     */
    private String remarks;
    /**
     * 删除标记 0.正常 1.删除
     */
    private String delFlag;

    /**
     * 设置考试记录编码
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取考试记录编码
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置会员代码
     */
    public void setVipUserId(Integer vipUserId) {
        this.vipUserId = vipUserId;
    }

    /**
     * 获取会员代码
     */
    public Integer getVipUserId() {
        return vipUserId;
    }

    /**
     * 设置试题编码
     */
    public void setExamExaminationId(Integer examExaminationId) {
        this.examExaminationId = examExaminationId;
    }

    /**
     * 获取试题编码
     */
    public Integer getExamExaminationId() {
        return examExaminationId;
    }

    /**
     * 设置试卷编码
     */
    public void setExamPaperId(Integer examPaperId) {
        this.examPaperId = examPaperId;
    }

    /**
     * 获取试卷编码
     */
    public Integer getExamPaperId() {
        return examPaperId;
    }

    /**
     * 设置考试得分
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 获取考试得分
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 设置创建者
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取创建者
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置更新者
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 获取更新者
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置备注信息
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * 获取备注信息
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置删除标记
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * 获取删除标记
     */
    public String getDelFlag() {
        return delFlag;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("vipUserId", getVipUserId())
                .append("examExaminationId", getExamExaminationId())
                .append("examPaperId", getExamPaperId())
                .append("score", getScore())
                .append("createBy", getCreateBy())
                .append("createDate", getCreateDate())
                .append("updateBy", getUpdateBy())
                .append("updateDate", getUpdateDate())
                .append("remarks", getRemarks())
                .append("delFlag", getDelFlag())
                .toString();
    }
}
