package com.rpc.mail;  
  
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.TimeUnit;

import javax.imageio.stream.FileImageInputStream;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLite;
import com.rpc.mail.SendMailServiceGrpc.SendMailServiceBlockingStub;

import io.grpc.ManagedChannel;  
import io.grpc.netty.NettyChannelBuilder;  
  

public class GrpcClient {  
    public static void main(String[] args) throws Exception {  
        ManagedChannel channel = NettyChannelBuilder.forAddress("localhost", 8080).usePlaintext(true).build();  
        //同步调用: SendMailServiceGrpc.newBlockingStub(channel)
        //异步调用的话，就是：SendMailServiceGrpc.newFutureStub(channel))  
        SendMailServiceBlockingStub stub = SendMailServiceGrpc.newBlockingStub(channel);  
         byte[] bytes = null;
        //设置请求参数  
         
        /*
        // object to byteArray  
         test t=new test("hhh", "abcde");
        try {  
            ByteArrayOutputStream bo = new ByteArrayOutputStream();  
            ObjectOutputStream oo = new ObjectOutputStream(bo);  
            oo.writeObject(t);
            bytes = bo.toByteArray();  
      
            bo.close();  
            oo.close(); 
        } catch (Exception e) {  
            System.out.println("translation" + e.getMessage());  
            e.printStackTrace();  
        }  */
         
        //bytes=file.readFile("F:\\mysoft\\Android\\WorkSpace\\test\\tower.jpg");
        SendMailRequest param = SendMailRequest.newBuilder().setName("dnzyx").setPwd("123456").setObj(ByteString.readFrom(new FileInputStream(new File("F:\\mysoft\\Android\\WorkSpace\\test\\tower.jpg")))).build(); 
        SendMailResponse resp = stub.sendMail(param);  
        System.out.println(resp.getMsg() + "\t" + resp.getCode());  
          
        //close  
        channel.shutdown().awaitTermination(1, TimeUnit.SECONDS);
    }  
}
