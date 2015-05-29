package aro.DataTable;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@Entity
@Table(name = "Device")
public class LimitParam implements Serializable{

    private Integer ID;
    private Integer DeviceID;
    private float InLimit;
    private float OutLimit;
    private float TorqueWarning;
    private float TorqueAlarm;
    private float TorqueStop;
    private float MaxLoad;
    private float LoadWarning;
    private float LoadAlarm;
    private float LoadStop;
    private float MaxWindSpeed;
    private float HeightWarning;
    private float HeightAlarm;
    private float DistanceWarningEnv;
    private float DistanceAlarmEnv;
    private float DistanceWarning;
    private float DistanceAlarm;
    private float ObliquityWaring;
    private float ObliquityAlarm;


    @GenericGenerator(name = "generator", strategy = "increment")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID")
    public Integer getID() {
        return ID;
    }

    @Column(name = "DeviceID")
    public Integer getDeviceID() {
        return DeviceID;
    }

    @Column(name = "InLimit")
    public float getInLimit() {
        return InLimit;
    }

    @Column(name = "OutLimit")
    public float getOutLimit() {
        return OutLimit;
    }

    @Column(name = "TorqueWarning")
    public float getTorqueWarning() {
        return TorqueWarning;
    }

    @Column(name = "TorqueAlarm")
    public float getTorqueAlarm() {
        return TorqueAlarm;
    }

    @Column(name = "TorqueStop")
    public float getTorqueStop() {
        return TorqueStop;
    }

    @Column(name = "MaxLoad")
    public float getMaxLoad() {
        return MaxLoad;
    }

    @Column(name = "LoadWarning")
    public float getLoadWarning() {
        return LoadWarning;
    }

    @Column(name = "LoadAlarm")
    public float getLoadAlarm() {
        return LoadAlarm;
    }

    @Column(name = "LoadStop")
    public float getLoadStop() {
        return LoadStop;
    }

    @Column(name = "MaxWindSpeed")
    public float getMaxWindSpeed() {
        return MaxWindSpeed;
    }

    @Column(name = "HeightWarning")
    public float getHeightWarning() {
        return HeightWarning;
    }

    @Column(name = "HeightAlarm")
    public float getHeightAlarm() {
        return HeightAlarm;
    }

    @Column(name = "DistanceWarningEnv")
    public float getDistanceWarningEnv() {
        return DistanceWarningEnv;
    }

    @Column(name = "DistanceAlarmEnv")
    public float getDistanceAlarmEnv() {
        return DistanceAlarmEnv;
    }

    @Column(name = "DistanceWarning")
    public float getDistanceWarning() {
        return DistanceWarning;
    }

    @Column(name = "DistanceAlarm")
    public float getDistanceAlarm() {
        return DistanceAlarm;
    }

    @Column(name = "ObliquityWaring")
    public float getObliquityWaring() {
        return ObliquityWaring;
    }

    @Column(name = "ObliquityAlarm")
    public float getObliquityAlarm() {
        return ObliquityAlarm;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setDeviceID(Integer deviceID) {
        DeviceID = deviceID;
    }
    public void setInLimit(float inLimit) {
        InLimit = inLimit;
    }
    public void setOutLimit(float outLimit) {
        OutLimit = outLimit;
    }
    public void setTorqueWarning(float torqueWarning) {
        TorqueWarning = torqueWarning;
    }
    public void setTorqueAlarm(float torqueAlarm) {
        TorqueAlarm = torqueAlarm;
    }
    public void setTorqueStop(float torqueStop) {
        TorqueStop = torqueStop;
    }
    public void setMaxLoad(float maxLoad) {
        MaxLoad = maxLoad;
    }
    public void setLoadWarning(float loadWarning) {
        LoadWarning = loadWarning;
    }
    public void setLoadAlarm(float loadAlarm) {
        LoadAlarm = loadAlarm;
    }
    public void setLoadStop(float loadStop) {
        LoadStop = loadStop;
    }
    public void setMaxWindSpeed(float maxWindSpeed) {
        MaxWindSpeed = maxWindSpeed;
    }
    public void setHeightWarning(float heightWarning) {
        HeightWarning = heightWarning;
    }
    public void setHeightAlarm(float heightAlarm) {
        HeightAlarm = heightAlarm;
    }
    public void setDistanceWarningEnv(float distanceWarningEnv) {
        DistanceWarningEnv = distanceWarningEnv;
    }
    public void setDistanceAlarmEnv(float distanceAlarmEnv) {
        DistanceAlarmEnv = distanceAlarmEnv;
    }
    public void setDistanceWarning(float distanceWarning) {
        DistanceWarning = distanceWarning;
    }
    public void setDistanceAlarm(float distanceAlarm) {
        DistanceAlarm = distanceAlarm;
    }
    public void setObliquityWaring(float obliquityWaring) {
        ObliquityWaring = obliquityWaring;
    }
    public void setObliquityAlarm(float obliquityAlarm) {
        ObliquityAlarm = obliquityAlarm;
    }

    public LimitParam(){

    }

    public LimitParam(Integer deviceID, float inLimit, float outLimit, float torqueWarning, float torqueAlarm,
                      float torqueStop, float maxLoad, float loadWarning, float loadAlarm, float loadStop,
                      float maxWindSpeed, float heightWarning, float heightAlarm, float distanceWarningEnv,
                      float distanceAlarmEnv, float distanceWarning, float distanceAlarm,
                      float obliquityWaring, float obliquityAlarm) {
        DeviceID = deviceID;
        InLimit = inLimit;
        OutLimit = outLimit;
        TorqueWarning = torqueWarning;
        TorqueAlarm = torqueAlarm;
        TorqueStop = torqueStop;
        MaxLoad = maxLoad;
        LoadWarning = loadWarning;
        LoadAlarm = loadAlarm;
        LoadStop = loadStop;
        MaxWindSpeed = maxWindSpeed;
        HeightWarning = heightWarning;
        HeightAlarm = heightAlarm;
        DistanceWarningEnv = distanceWarningEnv;
        DistanceAlarmEnv = distanceAlarmEnv;
        DistanceWarning = distanceWarning;
        DistanceAlarm = distanceAlarm;
        ObliquityWaring = obliquityWaring;
        ObliquityAlarm = obliquityAlarm;
    }

    @Override
    public String toString() {
        return "LimitParam{" +
                "ID=" + ID +
                ", DeviceID=" + DeviceID +
                ", InLimit=" + InLimit +
                ", OutLimit=" + OutLimit +
                ", TorqueWarning=" + TorqueWarning +
                ", TorqueAlarm=" + TorqueAlarm +
                ", TorqueStop=" + TorqueStop +
                ", MaxLoad=" + MaxLoad +
                ", LoadWarning=" + LoadWarning +
                ", LoadAlarm=" + LoadAlarm +
                ", LoadStop=" + LoadStop +
                ", MaxWindSpeed=" + MaxWindSpeed +
                ", HeightWarning=" + HeightWarning +
                ", HeightAlarm=" + HeightAlarm +
                ", DistanceWarningEnv=" + DistanceWarningEnv +
                ", DistanceAlarmEnv=" + DistanceAlarmEnv +
                ", DistanceWarning=" + DistanceWarning +
                ", DistanceAlarm=" + DistanceAlarm +
                ", ObliquityWaring=" + ObliquityWaring +
                ", ObliquityAlarm=" + ObliquityAlarm +
                '}';
    }
}
