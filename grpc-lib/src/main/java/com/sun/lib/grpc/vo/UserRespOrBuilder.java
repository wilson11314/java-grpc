// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user_vo.proto

package com.sun.lib.grpc.vo;

public interface UserRespOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.sun.lib.grpc.vo.UserResp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 age = 3;</code>
   * @return The age.
   */
  int getAge();

  /**
   * <code>string address = 4;</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 4;</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();
}