package com.fjs.backoffice.netty;

import com.fjs.backoffice.model.Record;
import com.fjs.backoffice.service.DeviceService;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 硬件端消息处理
 */
public class ServerHandler extends SimpleChannelInboundHandler<String>{

	@Autowired
	private DeviceService deviceService;

	@Override
	protected void messageReceived(ChannelHandlerContext ctx, String msg) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(msg);
		//ctx.channel().writeAndFlush("hi");

		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


		//这里处理消息请求,存入数据库
		JSONObject json = JSONObject.fromObject(msg);
		int device_id = (int) json.get("device_id");
		String record_time = (String) json.get("record_time");
		Date date = sf.parse(record_time);
		int temperature = (int) json.get("temperature");
		int humidity = (int) json.get("humidity");



		Record record = new Record();
		record.setDevice_id(device_id);
		record.setRecord_time(date);
		record.setTemperature(temperature);
		record.setHumidity(humidity);

		deviceService.insertRecord(record);
	}

}
