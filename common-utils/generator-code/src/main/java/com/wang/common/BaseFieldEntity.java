package com.wang.common;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Description 数据库公共字段
 * @Author lhy
 * @Date 2021/8/31
 * @Version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BaseFieldEntity extends BaseEntity {

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    public Integer createTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    public Integer updateTime;

}
