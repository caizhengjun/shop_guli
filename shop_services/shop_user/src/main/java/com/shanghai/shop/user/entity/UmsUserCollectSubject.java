package com.shanghai.shop.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 关注活动表
 * </p>
 *
 * @author caizhengjun
 * @since 2021-03-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ums_user_collect_subject")
@ApiModel(value="UmsUserCollectSubject对象", description="关注活动表")
public class UmsUserCollectSubject implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "用户id")
    private Integer userId;

    @ApiModelProperty(value = "活动id")
    private Long subjectId;

    @ApiModelProperty(value = "活动名称")
    private String subjectName;

    @ApiModelProperty(value = "活动默认图片")
    private String subjectImage;

    @ApiModelProperty(value = "活动链接")
    private String subjectUrl;

    @ApiModelProperty(value = "关注时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;


}
