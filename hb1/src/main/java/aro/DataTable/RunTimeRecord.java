package aro.DataTable;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by Administrator on 2015/05/25.
 */
@Entity
@Table(name = "RunTimeRecord")
public class RunTimeRecord implements Serializable{

    private Integer ID;
    private Integer DeviceID;
    private Date OnlineTime;
    private Integer RunSecond;
    private String IP;

    public RunTimeRecord(){

    }

    public RunTimeRecord(Integer deviceID, Date onlineTime, Integer runSecond, String ip) {
        DeviceID = deviceID;
        OnlineTime = onlineTime;
        RunSecond = runSecond;
        IP = ip;
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
    public Integer getDeviceID() {
        return DeviceID;
    }

    public void setDeviceID(Integer deviceID) {
        DeviceID = deviceID;
    }

    @Column(name = "OnlineTime")
    public Date getOnlineTime() {
        return OnlineTime;
    }

    public void setOnlineTime(Date onlineTime) {
        OnlineTime = onlineTime;
    }

    @Column(name = "RunSecond")
    public Integer getRunSecond() {
        return RunSecond;
    }

    public void setRunSecond(Integer runSecond) {
        RunSecond = runSecond;
    }

    @Column(name = "IP")
    public String getIP() {
        return IP;
    }

    public void setIP(String ip) {
        IP = ip;
    }
}
