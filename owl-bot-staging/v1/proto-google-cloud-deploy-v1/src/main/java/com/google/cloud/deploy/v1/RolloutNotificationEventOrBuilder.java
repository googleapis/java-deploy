// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/deploy/v1/rollout_notification_payload.proto

package com.google.cloud.deploy.v1;

public interface RolloutNotificationEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.RolloutNotificationEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Debug message for when a notification fails to send.
   * </pre>
   *
   * <code>string message = 1;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * Debug message for when a notification fails to send.
   * </pre>
   *
   * <code>string message = 1;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <pre>
   * Unique identifier of the `DeliveryPipeline`.
   * </pre>
   *
   * <code>string pipeline_uid = 2;</code>
   * @return The pipelineUid.
   */
  java.lang.String getPipelineUid();
  /**
   * <pre>
   * Unique identifier of the `DeliveryPipeline`.
   * </pre>
   *
   * <code>string pipeline_uid = 2;</code>
   * @return The bytes for pipelineUid.
   */
  com.google.protobuf.ByteString
      getPipelineUidBytes();

  /**
   * <pre>
   * Unique identifier of the `Release`.
   * </pre>
   *
   * <code>string release_uid = 3;</code>
   * @return The releaseUid.
   */
  java.lang.String getReleaseUid();
  /**
   * <pre>
   * Unique identifier of the `Release`.
   * </pre>
   *
   * <code>string release_uid = 3;</code>
   * @return The bytes for releaseUid.
   */
  com.google.protobuf.ByteString
      getReleaseUidBytes();

  /**
   * <pre>
   * The name of the `Rollout`.
   * </pre>
   *
   * <code>string rollout = 4;</code>
   * @return The rollout.
   */
  java.lang.String getRollout();
  /**
   * <pre>
   * The name of the `Rollout`.
   * </pre>
   *
   * <code>string rollout = 4;</code>
   * @return The bytes for rollout.
   */
  com.google.protobuf.ByteString
      getRolloutBytes();

  /**
   * <pre>
   * Type of this notification, e.g. for a Pub/Sub failure.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Type type = 5;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Type of this notification, e.g. for a Pub/Sub failure.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Type type = 5;</code>
   * @return The type.
   */
  com.google.cloud.deploy.v1.Type getType();

  /**
   * <pre>
   * ID of the `Target` that the rollout is deployed to.
   * </pre>
   *
   * <code>string target_id = 6;</code>
   * @return The targetId.
   */
  java.lang.String getTargetId();
  /**
   * <pre>
   * ID of the `Target` that the rollout is deployed to.
   * </pre>
   *
   * <code>string target_id = 6;</code>
   * @return The bytes for targetId.
   */
  com.google.protobuf.ByteString
      getTargetIdBytes();
}