// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/deploy/v1/jobrun_notification_payload.proto

package com.google.cloud.deploy.v1;

public final class JobRunNotificationPayloadProto {
  private JobRunNotificationPayloadProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_deploy_v1_JobRunNotificationEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_deploy_v1_JobRunNotificationEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/deploy/v1/jobrun_notifica" +
      "tion_payload.proto\022\026google.cloud.deploy." +
      "v1\032&google/cloud/deploy/v1/log_enums.pro" +
      "to\"\272\001\n\027JobRunNotificationEvent\022\017\n\007messag" +
      "e\030\001 \001(\t\022\017\n\007job_run\030\002 \001(\t\022\024\n\014pipeline_uid" +
      "\030\003 \001(\t\022\023\n\013release_uid\030\004 \001(\t\022\023\n\013rollout_u" +
      "id\030\005 \001(\t\022\021\n\ttarget_id\030\006 \001(\t\022*\n\004type\030\007 \001(" +
      "\0162\034.google.cloud.deploy.v1.TypeBr\n\032com.g" +
      "oogle.cloud.deploy.v1B\036JobRunNotificatio" +
      "nPayloadProtoP\001Z2cloud.google.com/go/dep" +
      "loy/apiv1/deploypb;deploypbb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.cloud.deploy.v1.LogEnumsProto.getDescriptor(),
        });
    internal_static_google_cloud_deploy_v1_JobRunNotificationEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_deploy_v1_JobRunNotificationEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_deploy_v1_JobRunNotificationEvent_descriptor,
        new java.lang.String[] { "Message", "JobRun", "PipelineUid", "ReleaseUid", "RolloutUid", "TargetId", "Type", });
    com.google.cloud.deploy.v1.LogEnumsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}