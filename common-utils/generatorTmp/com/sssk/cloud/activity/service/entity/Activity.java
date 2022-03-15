package com.sssk.cloud.activity.service.entity;

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
 * 营销活动主表
 * </p>
 *
 * @author wangqi
 * @since 2022-01-07
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="Activity对象", description="营销活动主表")
public class Activity extends BaseEntity {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "租户id")
    private String spreadId;

    @ApiModelProperty(value = "店铺id")
    private String shopId;

    @ApiModelProperty(value = "活动类型：1满额 2满件 3第X单 4第X件 5关注 6分享")
    private String activityType;

    @ApiModelProperty(value = "参与方式 1满足条件 2触发事件 3参与抽奖")
    private String participationMode;

    @ApiModelProperty(value = "活动周期 1：长期有效 2：限制时间")
    private String timeLimit;

    @ApiModelProperty(value = "活动开始时间")
    private LocalDateTime startTime;

    @ApiModelProperty(value = "活动结束时间")
    private LocalDateTime endTime;

    @ApiModelProperty(value = "活动名称")
    private String activityName;

    @ApiModelProperty(value = "活动适用范围")
    private String userGroup;

    @ApiModelProperty(value = "是否限制")
    private String limited;

    @ApiModelProperty(value = "限制方式 1活动 2商品")
    private String limitType;

    @ApiModelProperty(value = "限制数量")
    private Integer limitNum;

    @ApiModelProperty(value = "是否重置 0全活动周期 1按天 2按月 3整点")
    private String resetAble;

    @ApiModelProperty(value = "限制方式 1指定对象 2指定群组")
    private String limitMethod;

    @ApiModelProperty(value = "互斥活动id")
    private String mutexId;

    @ApiModelProperty(value = "互斥类型")
    private String mutexType;
}
