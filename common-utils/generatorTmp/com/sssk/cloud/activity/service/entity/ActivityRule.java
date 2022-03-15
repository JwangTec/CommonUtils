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
 * 营销活动优惠方案表
 * </p>
 *
 * @author wangqi
 * @since 2022-01-07
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="ActivityRule对象", description="营销活动优惠方案表")
public class ActivityRule extends BaseEntity {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "活动id")
    private Integer activityId;

    @ApiModelProperty(value = "优惠规则")
    private String rule;

    @ApiModelProperty(value = "优惠类型：1阶梯 2循环")
    private Boolean ruleType;

    @ApiModelProperty(value = "优惠内容id")
    private Integer contentId;

    @ApiModelProperty(value = "类型：1减金额 2打折 3赠品 4优惠券 5道具")
    private Boolean contentType;

    @ApiModelProperty(value = "具体数值")
    private BigDecimal amount;

    @ApiModelProperty(value = "条件值")
    private BigDecimal condition;

    @ApiModelProperty(value = "1正常 0删除")
    private Boolean deleted;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
