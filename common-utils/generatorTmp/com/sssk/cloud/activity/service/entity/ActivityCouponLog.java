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
 * 优惠券领取记录表
 * </p>
 *
 * @author wangqi
 * @since 2022-01-07
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="ActivityCouponLog对象", description="优惠券领取记录表")
public class ActivityCouponLog extends BaseEntity {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "抵扣券id")
    private Integer activityTicketId;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "商户id")
    private String shopId;

    @ApiModelProperty(value = "获取方式：1主动领取 2消费返券 3平台发放 4商家发放 5会员兑换")
    private Boolean receiveMethod;

    @ApiModelProperty(value = "优惠券面值")
    private BigDecimal ticketMoney;

    @ApiModelProperty(value = "使用门槛：满额多少可用")
    private BigDecimal logFullMoney;

    @ApiModelProperty(value = "状态,1-未使用，2-已使用，3被禁用")
    private Boolean status;

    @ApiModelProperty(value = "指定开始使用时间")
    private LocalDateTime logStartTime;

    @ApiModelProperty(value = "优惠券使用截止时间")
    private LocalDateTime logDeadTime;

    @ApiModelProperty(value = "1正常 0删除")
    private Boolean deleted;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
