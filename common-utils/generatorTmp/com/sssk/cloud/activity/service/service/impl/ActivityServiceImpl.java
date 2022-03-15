package com.sssk.cloud.activity.service.service.impl;

import com.sssk.cloud.activity.service.entity.Activity;
import com.sssk.cloud.activity.service.mapper.ActivityMapper;
import com.sssk.cloud.activity.service.service.IActivityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 营销活动主表 服务实现类
 * </p>
 *
 * @author wangqi
 * @since 2022-01-07
 */
@Service
public class ActivityServiceImpl extends ServiceImpl<ActivityMapper, Activity> implements IActivityService {

}
