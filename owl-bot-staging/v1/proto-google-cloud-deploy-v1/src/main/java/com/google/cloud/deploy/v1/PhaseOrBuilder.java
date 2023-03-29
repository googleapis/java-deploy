// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

public interface PhaseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.Phase)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The ID of the Phase.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Output only. The ID of the Phase.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Output only. Current state of the Phase.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Phase.State state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. Current state of the Phase.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Phase.State state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.deploy.v1.Phase.State getState();

  /**
   * <pre>
   * Output only. Additional information on why the Phase was skipped, if
   * available.
   * </pre>
   *
   * <code>string skip_message = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The skipMessage.
   */
  java.lang.String getSkipMessage();
  /**
   * <pre>
   * Output only. Additional information on why the Phase was skipped, if
   * available.
   * </pre>
   *
   * <code>string skip_message = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for skipMessage.
   */
  com.google.protobuf.ByteString
      getSkipMessageBytes();

  /**
   * <pre>
   * Output only. Deployment job composition.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.DeploymentJobs deployment_jobs = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the deploymentJobs field is set.
   */
  boolean hasDeploymentJobs();
  /**
   * <pre>
   * Output only. Deployment job composition.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.DeploymentJobs deployment_jobs = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The deploymentJobs.
   */
  com.google.cloud.deploy.v1.DeploymentJobs getDeploymentJobs();
  /**
   * <pre>
   * Output only. Deployment job composition.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.DeploymentJobs deployment_jobs = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.deploy.v1.DeploymentJobsOrBuilder getDeploymentJobsOrBuilder();

  /**
   * <pre>
   * Output only. ChildRollout job composition.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.ChildRolloutJobs child_rollout_jobs = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the childRolloutJobs field is set.
   */
  boolean hasChildRolloutJobs();
  /**
   * <pre>
   * Output only. ChildRollout job composition.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.ChildRolloutJobs child_rollout_jobs = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The childRolloutJobs.
   */
  com.google.cloud.deploy.v1.ChildRolloutJobs getChildRolloutJobs();
  /**
   * <pre>
   * Output only. ChildRollout job composition.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.ChildRolloutJobs child_rollout_jobs = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.deploy.v1.ChildRolloutJobsOrBuilder getChildRolloutJobsOrBuilder();

  public com.google.cloud.deploy.v1.Phase.JobsCase getJobsCase();
}