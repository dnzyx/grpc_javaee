// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: send_mail.proto

package com.rpc.mail;

public interface SendMailRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SendMailRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string recipient = 1;</code>
   */
  java.lang.String getRecipient();
  /**
   * <code>optional string recipient = 1;</code>
   */
  com.google.protobuf.ByteString
      getRecipientBytes();

  /**
   * <code>optional string title = 2;</code>
   */
  java.lang.String getTitle();
  /**
   * <code>optional string title = 2;</code>
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>optional string content = 3;</code>
   */
  java.lang.String getContent();
  /**
   * <code>optional string content = 3;</code>
   */
  com.google.protobuf.ByteString
      getContentBytes();
}