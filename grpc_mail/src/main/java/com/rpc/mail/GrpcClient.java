package com.rpc.mail;  
  
import java.util.concurrent.TimeUnit;

import com.rpc.mail.SendMailServiceGrpc.SendMailServiceBlockingStub;

import io.grpc.ManagedChannel;  
import io.grpc.netty.NettyChannelBuilder;  
  

public class GrpcClient {  
	public static void client_exe(){
		 ManagedChannel channel = NettyChannelBuilder.forAddress("localhost", 8080).usePlaintext(true).build();  
	        //ͬ������: SendMailServiceGrpc.newBlockingStub(channel)
	        //�첽���õĻ������ǣ�SendMailServiceGrpc.newFutureStub(channel))  
	        SendMailServiceBlockingStub stub = SendMailServiceGrpc.newBlockingStub(channel);  
	          
	        //�����������  
	        SendMailRequest param = SendMailRequest.newBuilder()
	        		.setRecipient("admin@google.com")
	        		.setTitle("��ά�ʼ�")
	        		.setContent("SOA�������")
	        		.build();  
	        SendMailResponse resp = stub.sendMail(param);  
	        System.out.println(resp.getMsg() + "\t" + resp.getCode());  
	          
	        //close  
	        try {
				channel.shutdown().awaitTermination(1, TimeUnit.SECONDS);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
	}
    public static void main(String[] args) {  
       GrpcClient.client_exe();
    }  
}  