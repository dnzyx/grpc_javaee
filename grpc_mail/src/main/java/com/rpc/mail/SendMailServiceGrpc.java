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
    value = "by gRPC proto compiler (version 0.14.1)",
    comments = "Source: send_mail.proto")
public class SendMailServiceGrpc {

  private SendMailServiceGrpc() {}

  public static final String SERVICE_NAME = "SendMailService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<com.rpc.mail.SendMailRequest,
      com.rpc.mail.SendMailResponse> METHOD_SEND_MAIL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "SendMailService", "sendMail"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.rpc.mail.SendMailRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.rpc.mail.SendMailResponse.getDefaultInstance()));

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
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static SendMailServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SendMailServiceFutureStub(channel);
  }

  /**
   */
  public static interface SendMailService {

    /**
     */
    public void sendMail(com.rpc.mail.SendMailRequest request,
        io.grpc.stub.StreamObserver<com.rpc.mail.SendMailResponse> responseObserver);
  }

  @io.grpc.ExperimentalApi
  public static abstract class AbstractSendMailService implements SendMailService, io.grpc.BindableService {

    public void sendMail(com.rpc.mail.SendMailRequest request,
        io.grpc.stub.StreamObserver<com.rpc.mail.SendMailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEND_MAIL, responseObserver);
    }

    public io.grpc.ServerServiceDefinition bindService() {
      return SendMailServiceGrpc.bindService(this);
    }
  }

  /**
   */
  public static interface SendMailServiceBlockingClient {

    /**
     */
    public com.rpc.mail.SendMailResponse sendMail(com.rpc.mail.SendMailRequest request);
  }

  /**
   */
  public static interface SendMailServiceFutureClient {

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rpc.mail.SendMailResponse> sendMail(
        com.rpc.mail.SendMailRequest request);
  }

  public static class SendMailServiceStub extends io.grpc.stub.AbstractStub<SendMailServiceStub>
      implements SendMailService {
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

    public void sendMail(com.rpc.mail.SendMailRequest request,
        io.grpc.stub.StreamObserver<com.rpc.mail.SendMailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEND_MAIL, getCallOptions()), request, responseObserver);
    }
  }

  public static class SendMailServiceBlockingStub extends io.grpc.stub.AbstractStub<SendMailServiceBlockingStub>
      implements SendMailServiceBlockingClient {
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

    public com.rpc.mail.SendMailResponse sendMail(com.rpc.mail.SendMailRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEND_MAIL, getCallOptions(), request);
    }
  }

  public static class SendMailServiceFutureStub extends io.grpc.stub.AbstractStub<SendMailServiceFutureStub>
      implements SendMailServiceFutureClient {
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

    public com.google.common.util.concurrent.ListenableFuture<com.rpc.mail.SendMailResponse> sendMail(
        com.rpc.mail.SendMailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEND_MAIL, getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_MAIL = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SendMailService serviceImpl;
    private final int methodId;

    public MethodHandlers(SendMailService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

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

    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final SendMailService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_SEND_MAIL,
          asyncUnaryCall(
            new MethodHandlers<
              com.rpc.mail.SendMailRequest,
              com.rpc.mail.SendMailResponse>(
                serviceImpl, METHODID_SEND_MAIL)))
        .build();
  }
}
