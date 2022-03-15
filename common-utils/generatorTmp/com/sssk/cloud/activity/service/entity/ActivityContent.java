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
 * 营销活动内容表
 * </p>
 *
 * @author wangqi
 * @since 2022-01-07
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="ActivityContent对象", description="营销活动内容表")
public class ActivityContent extends BaseEntity {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "租户id")
    private String spreadId;

    @ApiModelProperty(value = "活动id")
    private Integer activityId;

    @ApiModelProperty(value = "奖励内容（具体值）")
    private String content;

    @ApiModelProperty(value = "类型：1减金额 2打折 3赠品 4优惠券 5道具")
    private Boolean contentType;

    @ApiModelProperty(value = "1正常 0删除")
    private Boolean deleted;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
