package aro.DataTable;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@Entity
@Table(name = "LiveData")
public class LiveData implements Serializable {

    private Integer ID;
    private int DeviceID;
    private Date UpdateTime;
    private Date RecordTime;
    private float LoadValue;
    private float Radius;
    private float Height;
    private float Angle;
    private float WindSpeed;
    private float DipAngleX;
    private float DipAngleY;
    private float SafeLoad;
    private int TorquePercent;
    private int Fall;
    private int AlarmState;
    private int RelayState;

    public LiveData(int deviceID, Date updateTime, Date recordTime, float loadValue, float radius, float height,
                    float angle, float windSpeed, float dipAngleX, float dipAngleY, float safeLoad, int torquePercent,
                    int fall, int alarmState, int relayState) {
        DeviceID = deviceID;
        UpdateTime = updateTime;
        RecordTime = recordTime;
        LoadValue = loadValue;
        Radius = radius;
        Height = height;
        Angle = angle;
        WindSpeed = windSpeed;
        DipAngleX = dipAngleX;
        DipAngleY = dipAngleY;
        SafeLoad = safeLoad;
        TorquePercent = torquePercent;
        Fall = fall;
        AlarmState = alarmState;
        RelayState = relayState;
    }

    public LiveData() {

    }

    @GenericGenerator(name = "generator", strategy = "increment")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID")
    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    @Column(name = "DeviceID")
    public int getDeviceID() {
        return DeviceID;
    }

    public void setDeviceID(int deviceID) {
        DeviceID = deviceID;
    }

    @Column(name = "UpdateTime")
    public Date getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(Date updateTime) {
        UpdateTime = updateTime;
    }

    @Column(name = "RecordTime")
    public Date getRecordTime() {
        return RecordTime;
    }

    public void setRecordTime(Date recordTime) {
        RecordTime = recordTime;
    }

    @Column(name = "LoadValue")
    public float getLoadValue() {
        return LoadValue;
    }

    public void setLoadValue(float loadValue) {
        LoadValue = loadValue;
    }

    @Column(name = "Radius")
    public float getRadius() {
        return Radius;
    }

    public void setRadius(float radius) {
        Radius = radius;
    }

    @Column(name = "Height")
    public float getHeight() {
        return Height;
    }

    public void setHeight(float height) {
        Height = height;
    }

    @Column(name = "Angle")
    public float getAngle() {
        return Angle;
    }

    public void setAngle(float angle) {
        Angle = angle;
    }

    @Column(name = "WindSpeed")
    public float getWindSpeed() {
        return WindSpeed;
    }

    public void setWindSpeed(float windSpeed) {
        WindSpeed = windSpeed;
    }

    @Column(name = "DipAngleX")
    public float getDipAngleX() {
        return DipAngleX;
    }

    public void setDipAngleX(float dipAngleX) {
        DipAngleX = dipAngleX;
    }

    @Column(name = "DipAngleY")
    public float getDipAngleY() {
        return DipAngleY;
    }

    public void setDipAngleY(float dipAngleY) {
        DipAngleY = dipAngleY;
    }

    @Column(name = "SafeLoad")
    public float getSafeLoad() {
        return SafeLoad;
    }

    public void setSafeLoad(float safeLoad) {
        SafeLoad = safeLoad;
    }

    @Column(name = "TorquePercent")
    public int getTorquePercent() {
        return TorquePercent;
    }

    public void setTorquePercent(int torquePercent) {
        TorquePercent = torquePercent;
    }

    @Column(name = "Fall")
    public int getFall() {
        return Fall;
    }

    public void setFall(int fall) {
        Fall = fall;
    }

    @Column(name = "AlarmState")
    public int getAlarmState() {
        return AlarmState;
    }

    public void setAlarmState(int alarmState) {
        AlarmState = alarmState;
    }

    @Column(name = "RelayState")
    public int getRelayState() {
        return RelayState;
    }

    public void setRelayState(int relayState) {
        RelayState = relayState;
    }

    @Override
    public String toString() {
        return "LiveData{" +
                "UpdateTime=" + UpdateTime +
                ", RecordTime=" + RecordTime +
                ", LoadValue=" + LoadValue +
                ", Radius=" + Radius +
                ", Height=" + Height +
                ", Angle=" + Angle +
                ", WindSpeed=" + WindSpeed +
                ", DipAngleX=" + DipAngleX +
                ", DipAngleY=" + DipAngleY +
                ", SafeLoad=" + SafeLoad +
                ", TorquePercent=" + TorquePercent +
                ", Fall=" + Fall +
                ", AlarmState=" + AlarmState +
                ", RelayState=" + RelayState +
                ", ID=" + ID +
                ", DeviceID=" + DeviceID +
                '}';
    }
}
