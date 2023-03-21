// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

public interface SkaffoldVersionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.SkaffoldVersion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Release version number. For example, "1.20.3".
   * </pre>
   *
   * <code>string version = 1;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * Release version number. For example, "1.20.3".
   * </pre>
   *
   * <code>string version = 1;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   * The time at which this version of skaffold will enter maintenance mode.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp maintenance_mode_time = 3;</code>
   * @return Whether the maintenanceModeTime field is set.
   */
  boolean hasMaintenanceModeTime();
  /**
   * <pre>
   * The time at which this version of skaffold will enter maintenance mode.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp maintenance_mode_time = 3;</code>
   * @return The maintenanceModeTime.
   */
  com.google.protobuf.Timestamp getMaintenanceModeTime();
  /**
   * <pre>
   * The time at which this version of skaffold will enter maintenance mode.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp maintenance_mode_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getMaintenanceModeTimeOrBuilder();

  /**
   * <pre>
   * The time at which this version of skaffold will no longer be supported.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp support_expiration_time = 4;</code>
   * @return Whether the supportExpirationTime field is set.
   */
  boolean hasSupportExpirationTime();
  /**
   * <pre>
   * The time at which this version of skaffold will no longer be supported.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp support_expiration_time = 4;</code>
   * @return The supportExpirationTime.
   */
  com.google.protobuf.Timestamp getSupportExpirationTime();
  /**
   * <pre>
   * The time at which this version of skaffold will no longer be supported.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp support_expiration_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getSupportExpirationTimeOrBuilder();

  /**
   * <pre>
   * Date when this version is expected to no longer be supported.
   * </pre>
   *
   * <code>.google.type.Date support_end_date = 2;</code>
   * @return Whether the supportEndDate field is set.
   */
  boolean hasSupportEndDate();
  /**
   * <pre>
   * Date when this version is expected to no longer be supported.
   * </pre>
   *
   * <code>.google.type.Date support_end_date = 2;</code>
   * @return The supportEndDate.
   */
  com.google.type.Date getSupportEndDate();
  /**
   * <pre>
   * Date when this version is expected to no longer be supported.
   * </pre>
   *
   * <code>.google.type.Date support_end_date = 2;</code>
   */
  com.google.type.DateOrBuilder getSupportEndDateOrBuilder();
}
