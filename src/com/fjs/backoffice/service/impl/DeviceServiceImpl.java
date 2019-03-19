package com.fjs.backoffice.service.impl;

import com.fjs.backoffice.mapper.DeviceMapper;
import com.fjs.backoffice.model.Record;
import com.fjs.backoffice.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;

public class DeviceServiceImpl implements DeviceService {

    @Autowired
    private DeviceMapper deviceMapper;

    @Override
    public void insertRecord(Record record) {

        deviceMapper.insertRecord(record);

    }
}
