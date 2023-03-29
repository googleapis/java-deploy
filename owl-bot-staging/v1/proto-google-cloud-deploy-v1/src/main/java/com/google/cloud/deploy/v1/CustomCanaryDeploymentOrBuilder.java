// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

public interface CustomCanaryDeploymentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.CustomCanaryDeployment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Configuration for each phase in the canary deployment in the
   * order executed.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.CustomCanaryDeployment.PhaseConfig phase_configs = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.cloud.deploy.v1.CustomCanaryDeployment.PhaseConfig> 
      getPhaseConfigsList();
  /**
   * <pre>
   * Required. Configuration for each phase in the canary deployment in the
   * order executed.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.CustomCanaryDeployment.PhaseConfig phase_configs = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.deploy.v1.CustomCanaryDeployment.PhaseConfig getPhaseConfigs(int index);
  /**
   * <pre>
   * Required. Configuration for each phase in the canary deployment in the
   * order executed.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.CustomCanaryDeployment.PhaseConfig phase_configs = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getPhaseConfigsCount();
  /**
   * <pre>
   * Required. Configuration for each phase in the canary deployment in the
   * order executed.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.CustomCanaryDeployment.PhaseConfig phase_configs = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.cloud.deploy.v1.CustomCanaryDeployment.PhaseConfigOrBuilder> 
      getPhaseConfigsOrBuilderList();
  /**
   * <pre>
   * Required. Configuration for each phase in the canary deployment in the
   * order executed.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.CustomCanaryDeployment.PhaseConfig phase_configs = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.deploy.v1.CustomCanaryDeployment.PhaseConfigOrBuilder getPhaseConfigsOrBuilder(
      int index);
}
