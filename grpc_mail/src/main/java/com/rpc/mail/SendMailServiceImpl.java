package com.rpc.mail;  
  
import io.grpc.stub.StreamObserver;
  
public class SendMailServiceImpl implements SendMailServiceGrpc.SendMailService {  
    public void sendMail(SendMailRequest request, StreamObserver<SendMailResponse> responseObserver) {  
        System.out.println(request.getName() + "\t" + request.getPwd() + "\t" );  
        //�����Ǿ����ҵ���߼�  
        SendMailResponse resp = SendMailResponse.newBuilder().setCode(0).setMsg("OK").build();  
        //���÷��ؽ��  
        responseObserver.onNext(resp);  
        responseObserver.onCompleted();   
    }  
}  