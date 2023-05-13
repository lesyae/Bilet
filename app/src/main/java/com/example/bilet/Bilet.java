package com.example.bilet;

import java.io.Serializable;

public class Bilet implements Serializable {

    private String idl;
    private String placel;
    private String time1l;
    private String time2l;
    private String summl;

    public Bilet(String idl,String placel,String time1l,String time2l,String summl){

        this.idl=idl;
        this.placel=placel;
        this.time1l=time1l;
        this.time2l=time2l;
        this.summl=summl;
    }

    public String getIdl() {return idl;}

    public String getPlacel() {return placel;}

    public String getTime1l() {return time1l;}

    public String getTime2l() {return time2l;}

    public String getSumml() {return summl;}

    public void setIdl(String idl) {this.idl = idl;}

    public void setPlacel(String placel) {this.placel = placel;}

    public void setTime1l(String time1l) {this.time1l = time1l;}

    public void setTime2l(String time2l) {this.time2l = time2l;}

    public void setSumml(String summl) {this.summl = summl;}
}
