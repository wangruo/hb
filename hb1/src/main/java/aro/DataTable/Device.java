package aro.DataTable;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by Administrator on 2015/05/25.
 */
@Entity
@Table(name = "Device")
public class Device implements Serializable{

    private Integer ID;
    private String SN;
    private boolean IsOnline;
    private Date OnlineTime;
    private Date OfflineTime;
    private String IP;

    public Device(){

    }

    public Device(String sn, boolean isOnline, Date onlineTime, Date offlineTime, String ip) {
        this.SN = sn;
        this.IsOnline = isOnline;
        this.OnlineTime = onlineTime;
        this.OfflineTime = offlineTime;
        this.IP = ip;
    }

    @GenericGenerator(name = "generator", strategy = "increment")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID")
    public Integer getID() {
        return ID;
    }

    @Column(name = "SN")
    public String getSN() {
        return SN;
    }

    @Column(name = "IsOnline")
    public boolean getIsOnline() {
        return IsOnline;
    }

    @Column(name = "OnlineTime")
    public Date getOnlineTime() {
        return OnlineTime;
    }

    @Column(name = "OfflineTime")
    public Date getOfflineTime() {
        return OfflineTime;
    }

    @Column(name = "IP")
    public String getIP() {
        return IP;
    }

    public void setID(Integer id) {
        this.ID = id;
    }

    public void setSN(String sn) {
        this.SN = sn;
    }

    public void setIsOnline(boolean isOnline){
        this.IsOnline = isOnline;
    }

    public void setOnlineTime(Date onlineTime) {
        this.OnlineTime = onlineTime;
    }

    public void setOfflineTime(Date offlineTime) {
        this.OfflineTime = offlineTime;
    }

    public void setIP(String ip) {
        this.IP = ip;
    }

    @Override
    public String toString() {
        return "Device{" +
                "ID=" + ID +
                ", SN='" + SN + '\'' +
                ", IsOnline=" + IsOnline +
                ", OnlineTime=" + OnlineTime +
                ", OfflineTime=" + OfflineTime +
                ", IP='" + IP + '\'' +
                '}';
    }
}
