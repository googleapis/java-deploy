// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

public interface ExecutionConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.ExecutionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Usages when this configuration should be applied.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.ExecutionConfig.ExecutionEnvironmentUsage usages = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the usages.
   */
  java.util.List<com.google.cloud.deploy.v1.ExecutionConfig.ExecutionEnvironmentUsage> getUsagesList();
  /**
   * <pre>
   * Required. Usages when this configuration should be applied.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.ExecutionConfig.ExecutionEnvironmentUsage usages = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of usages.
   */
  int getUsagesCount();
  /**
   * <pre>
   * Required. Usages when this configuration should be applied.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.ExecutionConfig.ExecutionEnvironmentUsage usages = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The usages at the given index.
   */
  com.google.cloud.deploy.v1.ExecutionConfig.ExecutionEnvironmentUsage getUsages(int index);
  /**
   * <pre>
   * Required. Usages when this configuration should be applied.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.ExecutionConfig.ExecutionEnvironmentUsage usages = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the enum numeric values on the wire for usages.
   */
  java.util.List<java.lang.Integer>
  getUsagesValueList();
  /**
   * <pre>
   * Required. Usages when this configuration should be applied.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.ExecutionConfig.ExecutionEnvironmentUsage usages = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of usages at the given index.
   */
  int getUsagesValue(int index);

  /**
   * <pre>
   * Optional. Use default Cloud Build pool.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.DefaultPool default_pool = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the defaultPool field is set.
   */
  boolean hasDefaultPool();
  /**
   * <pre>
   * Optional. Use default Cloud Build pool.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.DefaultPool default_pool = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The defaultPool.
   */
  com.google.cloud.deploy.v1.DefaultPool getDefaultPool();
  /**
   * <pre>
   * Optional. Use default Cloud Build pool.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.DefaultPool default_pool = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.deploy.v1.DefaultPoolOrBuilder getDefaultPoolOrBuilder();

  /**
   * <pre>
   * Optional. Use private Cloud Build pool.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.PrivatePool private_pool = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the privatePool field is set.
   */
  boolean hasPrivatePool();
  /**
   * <pre>
   * Optional. Use private Cloud Build pool.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.PrivatePool private_pool = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The privatePool.
   */
  com.google.cloud.deploy.v1.PrivatePool getPrivatePool();
  /**
   * <pre>
   * Optional. Use private Cloud Build pool.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.PrivatePool private_pool = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.deploy.v1.PrivatePoolOrBuilder getPrivatePoolOrBuilder();

  public com.google.cloud.deploy.v1.ExecutionConfig.ExecutionEnvironmentCase getExecutionEnvironmentCase();
}