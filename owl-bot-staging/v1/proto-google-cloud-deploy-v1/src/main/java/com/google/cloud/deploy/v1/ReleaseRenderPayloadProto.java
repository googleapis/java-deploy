// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/deploy/v1/release_render_payload.proto

package com.google.cloud.deploy.v1;

public final class ReleaseRenderPayloadProto {
  private ReleaseRenderPayloadProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_deploy_v1_ReleaseRenderEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_deploy_v1_ReleaseRenderEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/deploy/v1/release_render_" +
      "payload.proto\022\026google.cloud.deploy.v1\"6\n" +
      "\022ReleaseRenderEvent\022\017\n\007message\030\001 \001(\t\022\017\n\007" +
      "release\030\002 \001(\tBm\n\032com.google.cloud.deploy" +
      ".v1B\031ReleaseRenderPayloadProtoP\001Z2cloud." +
      "google.com/go/deploy/apiv1/deploypb;depl" +
      "oypbb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_cloud_deploy_v1_ReleaseRenderEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_deploy_v1_ReleaseRenderEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_deploy_v1_ReleaseRenderEvent_descriptor,
        new java.lang.String[] { "Message", "Release", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}