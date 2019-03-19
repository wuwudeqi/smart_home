package com.fjs.backoffice.netty;

import com.sun.beans.editors.StringEditor;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import org.springframework.stereotype.Service;

/**
 * netty5服务器
 * @author kiyoumi
 *
 */
@Service
public class Server {
	
	public void bind(int PORT) {
	//服务类
		ServerBootstrap bootstrap = new ServerBootstrap();
		
		
		
	//boss和worker
		EventLoopGroup boss = new NioEventLoopGroup();
		EventLoopGroup worker = new NioEventLoopGroup();
		
	//设置线程池
		bootstrap.group(boss, worker);
		
	//设置socket工厂
		bootstrap.channel(NioServerSocketChannel.class);
		
	//设置管道工厂
		bootstrap.childHandler(new ChannelInitializer<Channel>() {

			@Override
			protected void initChannel(Channel ch) throws Exception {
				ch.pipeline().addLast(new StringDecoder());
				ch.pipeline().addLast(new StringEncoder());
			    ch.pipeline().addLast(new ServerHandler());
				
			}
		});
		
		//绑定端口
		ChannelFuture future = bootstrap.bind(PORT);
		
		System.out.println("start");
		
		//等待服务端关闭
//		try {
//			future.channel().closeFuture().sync();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			//释放资源
//			boss.shutdownGracefully();
//			worker.shutdownGracefully();
//		}
	}
}
