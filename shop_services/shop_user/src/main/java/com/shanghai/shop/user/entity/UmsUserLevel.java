package com.shanghai.shop.user.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 会员等级表
 * </p>
 *
 * @author caizhengjun
 * @since 2021-03-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ums_user_level")
@ApiModel(value="UmsUserLevel对象", description="会员等级表")
public class UmsUserLevel implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "等级名称")
    private String name;

    @ApiModelProperty(value = "等级需要的成长值")
    private Integer growthPoint;

    @ApiModelProperty(value = "默认等级")
    private Integer defaultStatus;

    @ApiModelProperty(value = "免运费标准")
    private BigDecimal freeFreightPoint;

    @ApiModelProperty(value = "每次评价获取的成长值")
    private Integer commentGrowthPoint;

    @ApiModelProperty(value = "是否有免邮特权")
    private Integer priviledgeFreeFreight;

    @ApiModelProperty(value = "是否有会员价格特权")
    private Integer priviledgeMemberPrice;

    @ApiModelProperty(value = "是否有生日特权")
    private Integer priviledgeBirthday;

    @ApiModelProperty(value = "备注")
    private String remark;


}