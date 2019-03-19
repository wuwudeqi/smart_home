package com.fjs.backoffice.model;

import java.util.Date;

public class Record {

    private int id;
    private int device_id;
    private Date record_time;
    private int temperature;
    private int humidity;
    private String log;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDevice_id() {
        return device_id;
    }

    public void setDevice_id(int device_id) {
        this.device_id = device_id;
    }

    public Date getRecord_time() {
        return record_time;
    }

    public void setRecord_time(Date record_time) {
        this.record_time = record_time;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public Record() {
    }

    public Record(int id, int device_id, Date record_time, int temperature, int humidity, String log) {
        this.id = id;
        this.device_id = device_id;
        this.record_time = record_time;
        this.temperature = temperature;
        this.humidity = humidity;
        this.log = log;
    }
}
