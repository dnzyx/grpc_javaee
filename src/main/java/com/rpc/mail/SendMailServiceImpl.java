package com.rpc.mail;  
  
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

import io.grpc.stub.StreamObserver;
  
public class SendMailServiceImpl extends SendMailServiceGrpc.SendMailServiceImplBase {  
    public void sendMail(SendMailRequest request, StreamObserver<SendMailResponse> responseObserver) {  
    	test obj = null;  
    	try {  
    	    // byteArray to object  
    	    ByteArrayInputStream bi = new ByteArrayInputStream(request.getObj().toByteArray());  
    	    ObjectInputStream oi = new ObjectInputStream(bi);  
    	  
    	    obj = (test)oi.readObject();  
    	    bi.close();  
    	    oi.close();  
    	} catch (Exception e) {  
    	    System.out.println("translation" + e.getMessage());  
    	    e.printStackTrace();  
    	}  
    	
        System.out.println(request.getName() + "\t" + request.getPwd() + "\t"+obj.getName()+"\t"+obj.getPwd()); 
        //�����Ǿ����ҵ���߼�  
        SendMailResponse resp = SendMailResponse.newBuilder().setCode(0).setMsg("OK").build();  
        //���÷��ؽ��  
        responseObserver.onNext(resp); 
        responseObserver.onCompleted();
    }  
}  