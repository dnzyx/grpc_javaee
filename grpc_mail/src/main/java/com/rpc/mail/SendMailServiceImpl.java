package com.rpc.mail;  
  
import io.grpc.stub.StreamObserver;
  
public class SendMailServiceImpl implements SendMailServiceGrpc.SendMailService {  
    public void sendMail(SendMailRequest request, StreamObserver<SendMailResponse> responseObserver) {  
        System.out.println(request.getName() + "\t" + request.getPwd() + "\t" );  
        //这里是具体的业务逻辑  
        SendMailResponse resp = SendMailResponse.newBuilder().setCode(0).setMsg("OK").build();  
        //设置返回结果  
        responseObserver.onNext(resp);  
        responseObserver.onCompleted();   
    }  
}  