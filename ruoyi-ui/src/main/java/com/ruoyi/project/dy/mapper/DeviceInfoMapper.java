package com.ruoyi.project.dy.mapper;

import java.util.List;
import com.ruoyi.project.dy.domain.DeviceInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * 设备信息Mapper接口
 * 
 * @author kk
 * @date 2022-11-28
 */
public interface DeviceInfoMapper extends BaseMapper<DeviceInfo>
{
    /**
     * 查询设备信息列表
     *
     * @param deviceInfo 设备信息
     * @return 设备信息集合
     */
    public List<DeviceInfo> selectDeviceInfoList(DeviceInfo deviceInfo);

}
