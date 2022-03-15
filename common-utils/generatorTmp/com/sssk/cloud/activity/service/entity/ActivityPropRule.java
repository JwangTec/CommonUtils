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
 * 营销活动道具表
 * </p>
 *
 * @author wangqi
 * @since 2022-01-07
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="ActivityPropRule对象", description="营销活动道具表")
public class ActivityPropRule extends BaseEntity {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "租户id")
    private Integer spreadId;

    @ApiModelProperty(value = "商户id")
    private Integer shopId;

    @ApiModelProperty(value = "道具名")
    private String propName;

    @ApiModelProperty(value = "消费x元 获得x道具")
    private BigDecimal consumeGetProp;

    @ApiModelProperty(value = "抵扣1道具，抵现金额")
    private BigDecimal deductionMoney;

    @ApiModelProperty(value = "1正常 0删除")
    private Boolean deleted;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
