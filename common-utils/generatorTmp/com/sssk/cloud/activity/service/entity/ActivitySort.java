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
 * 营销活动优先级表
 * </p>
 *
 * @author wangqi
 * @since 2022-01-07
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="ActivitySort对象", description="营销活动优先级表")
public class ActivitySort extends BaseEntity {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "1:店铺 2:租户")
    private Boolean objectType;

    @ApiModelProperty(value = "活动类型")
    private Boolean activityType;

    @ApiModelProperty(value = "活动优先级")
    private Integer sort;

    @ApiModelProperty(value = "对象id")
    private Integer objectId;

    @ApiModelProperty(value = "1正常 0删除")
    private Boolean deleted;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
