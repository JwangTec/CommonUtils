package com.sssk.cloud.activity.service.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.sssk.cloud.common.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 优惠券表
 * </p>
 *
 * @author wangqi
 * @since 2022-01-07
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="ActivityCoupon对象", description="优惠券表")
public class ActivityCoupon extends BaseEntity {

    private static final long serialVersionUID=1L;

    @TableId(value = "activity_ticket_id", type = IdType.AUTO)
    private Integer activityTicketId;

    @ApiModelProperty(value = "优惠券名称")
    private String couponName;

    @ApiModelProperty(value = "租户id")
    private String spreadId;

    @ApiModelProperty(value = "商户id")
    private String shopId;

    @ApiModelProperty(value = "获取方式：1主动领取 2消费返券 3平台发放 4商家发放 5会员兑换")
    private Boolean receiveMethod;

    @ApiModelProperty(value = "优惠券面值")
    private BigDecimal ticketMoney;

    @ApiModelProperty(value = "使用门槛：满额多少可用")
    private BigDecimal fullPrice;

    @ApiModelProperty(value = "优惠券类型 1减免券 2打折券 3兑换券")
    private Boolean type;

    @ApiModelProperty(value = "状态，仅能控制领取状态，1-关闭，2-开启")
    private Integer status;

    @ApiModelProperty(value = "活动开始时间")
    private LocalDateTime startTime;

    @ApiModelProperty(value = "优惠券使用截止时间")
    private LocalDateTime deadTime;

    @ApiModelProperty(value = "是否重置 0全活动周期 1按天重置 2按月重置 3整点重置")
    private Integer resetAble;

    @ApiModelProperty(value = "是否需要领取 1需要 0不需要")
    private Boolean needReceive;

    @ApiModelProperty(value = "限制数量")
    private Integer limitNum;

    @ApiModelProperty(value = "适用范围")
    private Boolean userGroup;

    @ApiModelProperty(value = "限制方式 1指定对象 2指定群组")
    private Boolean limitMethod;

    @ApiModelProperty(value = "限制类型 1商户 2用户")
    private Boolean limitType;

    @ApiModelProperty(value = "1正常 0删除")
    private Boolean deleted;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
