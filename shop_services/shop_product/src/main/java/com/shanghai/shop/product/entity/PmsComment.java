package com.shanghai.shop.product.entity;

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
 * 商品评价
 * </p>
 *
 * @author caizhengjun
 * @since 2021-03-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="PmsComment对象", description="商品评价")
public class PmsComment implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "sku_id")
    private Long skuId;

    @ApiModelProperty(value = "spu_id")
    private Long spuId;

    @ApiModelProperty(value = "商品名字")
    private String spuName;

    @ApiModelProperty(value = "会员昵称")
    private String nickName;

    @ApiModelProperty(value = "星级")
    private Boolean star;

    @ApiModelProperty(value = "会员ip")
    private String ip;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(value = "显示状态[0-不显示，1-显示]")
    private Boolean status;

    @ApiModelProperty(value = "购买时属性组合")
    private String spuAttributes;

    @ApiModelProperty(value = "点赞数")
    private Integer followCount;

    @ApiModelProperty(value = "回复数")
    private Integer replyCount;

    @ApiModelProperty(value = "评论图片/视频[json数据；[{type:文件类型,url:资源路径}]]")
    private String resources;

    @ApiModelProperty(value = "内容")
    private String content;

    @ApiModelProperty(value = "用户头像")
    private String icon;

    @ApiModelProperty(value = "评论类型[0 - 对商品的直接评论，1 - 对评论的回复]")
    private Integer type;


}
