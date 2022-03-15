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
 * 营销活动抽奖奖池
 * </p>
 *
 * @author wangqi
 * @since 2022-01-07
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="ActivityJackpot对象", description="营销活动抽奖奖池")
public class ActivityJackpot extends BaseEntity {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "活动id")
    private Integer activityId;

    @ApiModelProperty(value = "商户id")
    private String shopId;

    @ApiModelProperty(value = "奖品类型 0谢谢惠顾 1商品 2优惠券 3道具")
    private Boolean type;

    @ApiModelProperty(value = "奖品id")
    private Integer objectId;

    @ApiModelProperty(value = "奖品数量")
    private Integer objectNum;

    @ApiModelProperty(value = "是否限制库存 0不限制 1限制")
    private Boolean limited;

    @ApiModelProperty(value = "限制数量")
    private Integer limitNum;

    @ApiModelProperty(value = "已抽取数量")
    private Integer extractNum;

    @ApiModelProperty(value = "1正常 0删除")
    private Boolean deleted;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
