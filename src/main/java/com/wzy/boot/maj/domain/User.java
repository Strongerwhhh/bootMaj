package com.wzy.boot.maj.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private String id;
    @Column(nullable = false, unique = true)
    private String pwd;
    private String nickName="butters";
    private String img;
    private int happyBean=1000;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getHappyBean() {
        return happyBean;
    }

    public void setHappyBean(int happyBean) {
        this.happyBean = happyBean;
    }
}
