// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProductRetrieval.proto

package via.sdj3.animalregistrationapi.protobuf;

public interface AnimalMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AnimalMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 registrationNumber = 1;</code>
   * @return The registrationNumber.
   */
  int getRegistrationNumber();

  /**
   * <code>double weight = 2;</code>
   * @return The weight.
   */
  double getWeight();

  /**
   * <code>string date = 3;</code>
   * @return The date.
   */
  java.lang.String getDate();
  /**
   * <code>string date = 3;</code>
   * @return The bytes for date.
   */
  com.google.protobuf.ByteString
      getDateBytes();

  /**
   * <code>string origin = 4;</code>
   * @return The origin.
   */
  java.lang.String getOrigin();
  /**
   * <code>string origin = 4;</code>
   * @return The bytes for origin.
   */
  com.google.protobuf.ByteString
      getOriginBytes();
}