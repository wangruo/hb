package aro.DataTable;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by Administrator on 2015/05/25.
 */
@Entity
@Table(name = "devices")
public class RealTimeRecord implements Serializable{

    private Integer id;
    private String sn;
    private boolean isOnline;
    private Date online;
    private Date offline;
    private String ip;

    public RealTimeRecord(){

    }

    public RealTimeRecord(String sn, boolean isOnline, Date online, Date offline, String ip) {
        this.sn = sn;
        this.isOnline = isOnline;
        this.online = online;
        this.offline = offline;
        this.ip = ip;
    }

    @GenericGenerator(name = "generator", strategy = "increment")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    @Column(name = "sn")
    public String getSn() {
        return sn;
    }

    @Column(name = "isOnline")
    public boolean isOnline() {
        return isOnline;
    }

    @Column(name = "online")
    public Date getOnline() {
        return online;
    }

    @Column(name = "offline")
    public Date getOffline() {
        return offline;
    }

    @Column(name = "ip")
    public String getIp() {
        return ip;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public void setOnline(Date online) {
        this.online = online;
    }

    public void setOffline(Date offline) {
        this.offline = offline;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "Devices{" +
                "id=" + id +
                ", sn='" + sn + '\'' +
                ", isOnline=" + isOnline +
                ", online=" + online +
                ", offline=" + offline +
                ", ip='" + ip + '\'' +
                '}';
    }
}
