package com.ruoyi.project.dy.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 设备信息对象 dy_device_info
 * 
 * @author kk
 * @date 2022-11-28
 */
@TableName(value ="dy_device_info")
public class DeviceInfo
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 设备名称 */
    @Excel(name = "设备名称")
    private String deviceName;

    /** 设备ip */
    @Excel(name = "设备ip")
    private String deviceIp;

    /** 设备品牌 */
    @Excel(name = "设备品牌")
    private String deviceBrand;

    /** 设备型号 */
    @Excel(name = "设备型号")
    private String deviceModel;

    /** 安卓版本 */
    @Excel(name = "安卓版本")
    private String deviceRelease;

    /** 安卓id */
    @Excel(name = "安卓id")
    private String deviceAndroidId;

    /** 设备组 */
    @Excel(name = "设备组")
    private String deviceGroupId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDeviceName(String deviceName) 
    {
        this.deviceName = deviceName;
    }

    public String getDeviceName() 
    {
        return deviceName;
    }
    public void setDeviceIp(String deviceIp) 
    {
        this.deviceIp = deviceIp;
    }

    public String getDeviceIp() 
    {
        return deviceIp;
    }
    public void setDeviceBrand(String deviceBrand) 
    {
        this.deviceBrand = deviceBrand;
    }

    public String getDeviceBrand() 
    {
        return deviceBrand;
    }
    public void setDeviceModel(String deviceModel) 
    {
        this.deviceModel = deviceModel;
    }

    public String getDeviceModel() 
    {
        return deviceModel;
    }
    public void setDeviceRelease(String deviceRelease) 
    {
        this.deviceRelease = deviceRelease;
    }

    public String getDeviceRelease() 
    {
        return deviceRelease;
    }
    public void setDeviceAndroidId(String deviceAndroidId) 
    {
        this.deviceAndroidId = deviceAndroidId;
    }

    public String getDeviceAndroidId() 
    {
        return deviceAndroidId;
    }
    public void setDeviceGroupId(String deviceGroupId) 
    {
        this.deviceGroupId = deviceGroupId;
    }

    public String getDeviceGroupId() 
    {
        return deviceGroupId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("deviceName", getDeviceName())
            .append("deviceIp", getDeviceIp())
            .append("deviceBrand", getDeviceBrand())
            .append("deviceModel", getDeviceModel())
            .append("deviceRelease", getDeviceRelease())
            .append("deviceAndroidId", getDeviceAndroidId())
            .append("deviceGroupId", getDeviceGroupId())
            .toString();
    }
}
