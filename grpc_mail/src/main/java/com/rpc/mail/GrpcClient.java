package com.rpc.mail;  
  
import java.util.concurrent.TimeUnit;

import com.rpc.mail.SendMailServiceGrpc.SendMailServiceBlockingStub;

import io.grpc.ManagedChannel;  
import io.grpc.netty.NettyChannelBuilder;  
  

public class GrpcClient {  
    public static void main(String[] args) throws Exception {  
        ManagedChannel channel = NettyChannelBuilder.forAddress("localhost", 8080).usePlaintext(true).build();  
        //同步调用: SendMailServiceGrpc.newBlockingStub(channel)
        //异步调用的话，就是：SendMailServiceGrpc.newFutureStub(channel))  
        SendMailServiceBlockingStub stub = SendMailServiceGrpc.newBlockingStub(channel);  
          
        //设置请求参数  
        SendMailRequest param = SendMailRequest.newBuilder().setName("dnzyx").setPwd("123456").build();  
        SendMailResponse resp = stub.sendMail(param);  
        System.out.println(resp.getMsg() + "\t" + resp.getCode());  
          
        //close  
        channel.shutdown().awaitTermination(1, TimeUnit.SECONDS);  
    }  
}  