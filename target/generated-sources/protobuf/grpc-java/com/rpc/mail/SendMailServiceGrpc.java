package com.rpc.mail;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.7.0)",
    comments = "Source: send_mail.proto")
public final class SendMailServiceGrpc {

  private SendMailServiceGrpc() {}

  public static final String SERVICE_NAME = "SendMailService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.rpc.mail.SendMailRequest,
      com.rpc.mail.SendMailResponse> METHOD_SEND_MAIL =
      io.grpc.MethodDescriptor.<com.rpc.mail.SendMailRequest, com.rpc.mail.SendMailResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "SendMailService", "sendMail"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.rpc.mail.SendMailRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.rpc.mail.SendMailResponse.getDefaultInstance()))
          .setSchemaDescriptor(new SendMailServiceMethodDescriptorSupplier("sendMail"))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SendMailServiceStub newStub(io.grpc.Channel channel) {
    return new SendMailServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SendMailServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SendMailServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SendMailServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SendMailServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SendMailServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendMail(com.rpc.mail.SendMailRequest request,
        io.grpc.stub.StreamObserver<com.rpc.mail.SendMailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEND_MAIL, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SEND_MAIL,
            asyncUnaryCall(
              new MethodHandlers<
                com.rpc.mail.SendMailRequest,
                com.rpc.mail.SendMailResponse>(
                  this, METHODID_SEND_MAIL)))
          .build();
    }
  }

  /**
   */
  public static final class SendMailServiceStub extends io.grpc.stub.AbstractStub<SendMailServiceStub> {
    private SendMailServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SendMailServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SendMailServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SendMailServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendMail(com.rpc.mail.SendMailRequest request,
        io.grpc.stub.StreamObserver<com.rpc.mail.SendMailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEND_MAIL, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SendMailServiceBlockingStub extends io.grpc.stub.AbstractStub<SendMailServiceBlockingStub> {
    private SendMailServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SendMailServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SendMailServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SendMailServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.rpc.mail.SendMailResponse sendMail(com.rpc.mail.SendMailRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEND_MAIL, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SendMailServiceFutureStub extends io.grpc.stub.AbstractStub<SendMailServiceFutureStub> {
    private SendMailServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SendMailServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SendMailServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SendMailServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rpc.mail.SendMailResponse> sendMail(
        com.rpc.mail.SendMailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEND_MAIL, getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_MAIL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SendMailServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SendMailServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_MAIL:
          serviceImpl.sendMail((com.rpc.mail.SendMailRequest) request,
              (io.grpc.stub.StreamObserver<com.rpc.mail.SendMailResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SendMailServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SendMailServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.rpc.mail.SendMailServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SendMailService");
    }
  }

  private static final class SendMailServiceFileDescriptorSupplier
      extends SendMailServiceBaseDescriptorSupplier {
    SendMailServiceFileDescriptorSupplier() {}
  }

  private static final class SendMailServiceMethodDescriptorSupplier
      extends SendMailServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SendMailServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SendMailServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SendMailServiceFileDescriptorSupplier())
              .addMethod(METHOD_SEND_MAIL)
              .build();
        }
      }
    }
    return result;
  }
}
