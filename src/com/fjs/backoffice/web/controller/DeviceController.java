package com.fjs.backoffice.web.controller;


import com.fjs.backoffice.netty.Client;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * app发送控制命令
 * 调用client里面的send方法
 *
 */

/**
 * 控制
 *  1.升高温度/湿度
 *  2.降低温度/湿度
 *  3.开启关闭传感器
 *
 *  编码格式 总共9位
 *  3位      1位      3位       2位
 *  设备型号  开关状态  控制状态  温度信息
 *
 */
@Controller
@RequestMapping("device")
public class DeviceController {

    @Autowired
    private Client client;


    /**
     * 发送命令给硬件，使得其关闭或者开启
     * @param check
     */
    @RequestMapping("onOff")
    public void onOff(String check){
        JSONObject json = JSONObject.fromObject(check);
        //status表示想让其工作的状态
        String status = (String) json.get("status");
        String ip = (String) json.get("ip");
        int port = (int) json.get("port");
        client.send(status,ip,port);
    }


}
