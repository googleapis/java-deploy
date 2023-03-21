// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

public interface RuntimeConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.RuntimeConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Kubernetes runtime configuration.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.KubernetesConfig kubernetes = 1;</code>
   * @return Whether the kubernetes field is set.
   */
  boolean hasKubernetes();
  /**
   * <pre>
   * Kubernetes runtime configuration.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.KubernetesConfig kubernetes = 1;</code>
   * @return The kubernetes.
   */
  com.google.cloud.deploy.v1.KubernetesConfig getKubernetes();
  /**
   * <pre>
   * Kubernetes runtime configuration.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.KubernetesConfig kubernetes = 1;</code>
   */
  com.google.cloud.deploy.v1.KubernetesConfigOrBuilder getKubernetesOrBuilder();

  /**
   * <pre>
   * Cloud Run runtime configuration.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.CloudRunConfig cloud_run = 2;</code>
   * @return Whether the cloudRun field is set.
   */
  boolean hasCloudRun();
  /**
   * <pre>
   * Cloud Run runtime configuration.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.CloudRunConfig cloud_run = 2;</code>
   * @return The cloudRun.
   */
  com.google.cloud.deploy.v1.CloudRunConfig getCloudRun();
  /**
   * <pre>
   * Cloud Run runtime configuration.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.CloudRunConfig cloud_run = 2;</code>
   */
  com.google.cloud.deploy.v1.CloudRunConfigOrBuilder getCloudRunOrBuilder();

  public com.google.cloud.deploy.v1.RuntimeConfig.RuntimeConfigCase getRuntimeConfigCase();
}
