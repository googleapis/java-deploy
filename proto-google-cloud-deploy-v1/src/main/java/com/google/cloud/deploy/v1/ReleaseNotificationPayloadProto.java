/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/deploy/v1/release_notification_payload.proto

package com.google.cloud.deploy.v1;

public final class ReleaseNotificationPayloadProto {
  private ReleaseNotificationPayloadProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_deploy_v1_ReleaseNotificationEvent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_deploy_v1_ReleaseNotificationEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/deploy/v1/release_notific"
          + "ation_payload.proto\022\026google.cloud.deploy"
          + ".v1\032&google/cloud/deploy/v1/log_enums.pr"
          + "oto\"h\n\030ReleaseNotificationEvent\022\017\n\007messa"
          + "ge\030\001 \001(\t\022\017\n\007release\030\002 \001(\t\022*\n\004type\030\003 \001(\0162"
          + "\034.google.cloud.deploy.v1.TypeBs\n\032com.goo"
          + "gle.cloud.deploy.v1B\037ReleaseNotification"
          + "PayloadProtoP\001Z2cloud.google.com/go/depl"
          + "oy/apiv1/deploypb;deploypbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.cloud.deploy.v1.LogEnumsProto.getDescriptor(),
            });
    internal_static_google_cloud_deploy_v1_ReleaseNotificationEvent_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_deploy_v1_ReleaseNotificationEvent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_deploy_v1_ReleaseNotificationEvent_descriptor,
            new java.lang.String[] {
              "Message", "Release", "Type",
            });
    com.google.cloud.deploy.v1.LogEnumsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
