package aro.DataTable;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "CraneStructure")
public class CraneStructure implements Serializable{

    private Integer ID;
    private Integer DeviceID;
    private float X;
    private float Y;
    private float Length;
    private float Height;
    private float BackLength;
    private float TopHeight;

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
    @Column(name = "X")
    public float getX() {
        return X;
    }
    @Column(name = "Y")
    public float getY() {
        return Y;
    }
    @Column(name = "Length")
    public float getLength() {
        return Length;
    }
    @Column(name = "Height")
    public float getHeight() {
        return Height;
    }
    @Column(name = "BackLength")
    public float getBackLength() {
        return BackLength;
    }
    @Column(name = "TopHeight")
    public float getTopHeight() {
        return TopHeight;
    }

    public void setID(Integer id) {
        ID = id;
    }
    public void setDeviceID(Integer deviceID) {
        DeviceID = deviceID;
    }
    public void setX(float x) {
        X = x;
    }
    public void setY(float y) {
        Y = y;
    }
    public void setLength(float length) {
        Length = length;
    }
    public void setHeight(float height) {
        Height = height;
    }
    public void setBackLength(float backLength) {
        BackLength = backLength;
    }
    public void setTopHeight(float topHeight) {
        TopHeight = topHeight;
    }

    public CraneStructure() {
    }

    public CraneStructure(Integer deviceID, float x, float y, float length, float height, float backLength, float topHeight) {
        DeviceID = deviceID;
        X = x;
        Y = y;
        Length = length;
        Height = height;
        BackLength = backLength;
        TopHeight = topHeight;
    }

    @Override
    public String toString() {
        return "CraneStructure{" +
                "ID=" + ID +
                ", DeviceID=" + DeviceID +
                ", X=" + X +
                ", Y=" + Y +
                ", Length=" + Length +
                ", Height=" + Height +
                ", BackLength=" + BackLength +
                ", TopHeight=" + TopHeight +
                '}';
    }
}
