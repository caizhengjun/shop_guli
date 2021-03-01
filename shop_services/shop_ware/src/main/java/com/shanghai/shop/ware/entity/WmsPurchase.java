package com.shanghai.shop.ware.entity;

import java.math.BigDecimal;
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
 * 采购信息
 * </p>
 *
 * @author caizhengjun
 * @since 2021-03-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="WmsPurchase对象", description="采购信息")
public class WmsPurchase implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "采购单id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "采购人id")
    private Long assigneeId;

    @ApiModelProperty(value = "采购人名")
    private String assigneeName;

    @ApiModelProperty(value = "联系方式")
    private String phone;

    @ApiModelProperty(value = "优先级")
    private Integer priority;

    @ApiModelProperty(value = "状态")
    private Integer status;

    @ApiModelProperty(value = "仓库id")
    private Long wareId;

    @ApiModelProperty(value = "总金额")
    private BigDecimal amount;

    @ApiModelProperty(value = "创建日期")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(value = "更新日期")
    private Date updateTime;


}
