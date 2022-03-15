package com.sssk.cloud.activity.service.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import com.sssk.cloud.common.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 外卖订单活动详情
 * </p>
 *
 * @author wangqi
 * @since 2022-01-07
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="OrderTakeawayActivity对象", description="外卖订单活动详情")
public class OrderTakeawayActivity extends BaseEntity {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "订单id")
    private Long orderId;

    @ApiModelProperty(value = "活动类型")
    private String activicyType;

    @ApiModelProperty(value = "活动id")
    private Long activicyId;

    @ApiModelProperty(value = "活动规则")
    private String activicyRule;

    @ApiModelProperty(value = "优惠金额")
    private BigDecimal discountPrice;

    @ApiModelProperty(value = "是否删除;1:正常0:删除")
    private Boolean deleted;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;


}
