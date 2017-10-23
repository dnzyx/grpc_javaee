package com.rpc.mail;

import io.grpc.Server;
import io.grpc.netty.NettyServerBuilder;
import io.grpc.ServerCallHandler;

public class GrpcServer {
	public static void server_exe(){
		  try {
	        	
				Server server = NettyServerBuilder.forPort(8080).
						addService(SendMailServiceGrpc.
								bindService(
										new SendMailServiceImpl())).
						build();  
				server.start();
				System.out.println("server startup at 8080");
				server.awaitTermination();
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				System.out.println("error");
			}
	}
    public static void main(String[] args) {  
      GrpcServer.server_exe();
    }  
}