package com.fjs.backoffice.model;

public class Device {

    private int id;
    private String name;
    private String pic;
    private String introduction;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Device() {
    }

    public Device(int id, String name, String pic, String introduction) {
        this.id = id;
        this.name = name;
        this.pic = pic;
        this.introduction = introduction;
    }
}
