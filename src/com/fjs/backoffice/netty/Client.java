package com.fjs.backoffice.netty;

import java.net.InetSocketAddress;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.jboss.netty.bootstrap.ClientBootstrap;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelFuture;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory;
import org.jboss.netty.handler.codec.string.StringDecoder;
import org.jboss.netty.handler.codec.string.StringEncoder;
import org.springframework.stereotype.Service;

@Service
public class Client {

	public void send(String msg,String IP,int PORT) {
		
		//服务类
		ClientBootstrap bootstrap = new ClientBootstrap();
		
		//线程池
		ExecutorService boss = Executors.newCachedThreadPool();
		ExecutorService worker = Executors.newCachedThreadPool();
		
		//socket工厂
		bootstrap.setFactory(new NioClientSocketChannelFactory(boss,worker));
		
		//设置管道工厂
		bootstrap.setPipelineFactory(new ChannelPipelineFactory() {
			
			@Override
			public ChannelPipeline getPipeline() throws Exception {
				ChannelPipeline pipeline = Channels.pipeline();
				pipeline.addLast("decoder", new StringDecoder());
				pipeline.addLast("hiHandler", new HiHandler());
				pipeline.addLast("encoder", new StringEncoder());
				return pipeline;
				}				
		});
		//连接服务端
		ChannelFuture connect = bootstrap.connect(new InetSocketAddress(IP,PORT));


		Channel channel = connect.getChannel();
		//向硬件发送数据
		channel.write(msg);
		
	}
	
	
}
