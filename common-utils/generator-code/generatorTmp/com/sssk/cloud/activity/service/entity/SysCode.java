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
 * 系统业务码表
 * </p>
 *
 * @author wangqi
 * @since 2022-01-14
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="SysCode对象", description="系统业务码表")
public class SysCode extends BaseEntity {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "码")
    private String code;

    @ApiModelProperty(value = "描述")
    private String msg;

    @ApiModelProperty(value = "类型描述")
    private String type;

    @ApiModelProperty(value = "是否删除;1:正常 0:删除")
    private Boolean deleted;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;


}
