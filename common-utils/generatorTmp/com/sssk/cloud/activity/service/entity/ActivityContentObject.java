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
 * 营销活动内容对象表
 * </p>
 *
 * @author wangqi
 * @since 2022-01-07
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="ActivityContentObject对象", description="营销活动内容对象表")
public class ActivityContentObject extends BaseEntity {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "活动id")
    private Integer activityId;

    @ApiModelProperty(value = "活动内容id")
    private Integer contentId;

    @ApiModelProperty(value = "活动对象id")
    private Integer objectId;

    @ApiModelProperty(value = "对象类型 1:商品 2:优惠券 3:商户")
    private Boolean objectType;

    @ApiModelProperty(value = "1正常 0删除")
    private Boolean deleted;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
