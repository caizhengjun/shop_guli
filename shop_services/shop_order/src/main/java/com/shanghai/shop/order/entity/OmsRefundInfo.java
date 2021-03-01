package com.shanghai.shop.order.entity;

import java.math.BigDecimal;
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
 * 退款信息
 * </p>
 *
 * @author caizhengjun
 * @since 2021-03-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="OmsRefundInfo对象", description="退款信息")
public class OmsRefundInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "退款的订单")
    private Long orderReturnId;

    @ApiModelProperty(value = "退款金额")
    private BigDecimal refund;

    @ApiModelProperty(value = "退款交易流水号")
    private String refundSn;

    @ApiModelProperty(value = "退款状态")
    private Boolean refundStatus;

    @ApiModelProperty(value = "退款渠道[1-支付宝，2-微信，3-银联，4-汇款]")
    private Integer refundChannel;

    private String refundContent;


}
