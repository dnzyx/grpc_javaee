package com.rpc.mail;  
  
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.TimeUnit;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLite;
import com.rpc.mail.SendMailServiceGrpc.SendMailServiceBlockingStub;

import io.grpc.ManagedChannel;  
import io.grpc.netty.NettyChannelBuilder;  
  

public class GrpcClient {  
    public static void main(String[] args) throws Exception {  
        ManagedChannel channel = NettyChannelBuilder.forAddress("localhost", 8080).usePlaintext(true).build();  
        //ͬ������: SendMailServiceGrpc.newBlockingStub(channel)
        //�첽���õĻ������ǣ�SendMailServiceGrpc.newFutureStub(channel))  
        SendMailServiceBlockingStub stub = SendMailServiceGrpc.newBlockingStub(channel);  
          
        //�����������  
        test t=new test("hhh", "abcde");
        
        byte[] bytes = null;  
        try {  
            // object to byteArray  
            ByteArrayOutputStream bo = new ByteArrayOutputStream();  
            ObjectOutputStream oo = new ObjectOutputStream(bo);  
            oo.writeObject(t);
            bytes = bo.toByteArray();  
      
            bo.close();  
            oo.close(); 
        } catch (Exception e) {  
            System.out.println("translation" + e.getMessage());  
            e.printStackTrace();  
        }  
        
        SendMailRequest param = SendMailRequest.newBuilder().setName("dnzyx").setPwd("123456").setObj(ByteString.copyFrom(bytes)).build(); 
        SendMailResponse resp = stub.sendMail(param);  
        System.out.println(resp.getMsg() + "\t" + resp.getCode());  
          
        //close  
        channel.shutdown().awaitTermination(1, TimeUnit.SECONDS);
    }  
}
