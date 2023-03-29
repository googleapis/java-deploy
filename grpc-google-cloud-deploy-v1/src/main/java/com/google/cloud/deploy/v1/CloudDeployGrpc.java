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
package com.google.cloud.deploy.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 *
 *
 * <pre>
 * CloudDeploy service creates and manages Continuous Delivery operations
 * on Google Cloud Platform via Skaffold (https://skaffold.dev).
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/deploy/v1/cloud_deploy.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CloudDeployGrpc {

  private CloudDeployGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.deploy.v1.CloudDeploy";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.ListDeliveryPipelinesRequest,
          com.google.cloud.deploy.v1.ListDeliveryPipelinesResponse>
      getListDeliveryPipelinesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDeliveryPipelines",
      requestType = com.google.cloud.deploy.v1.ListDeliveryPipelinesRequest.class,
      responseType = com.google.cloud.deploy.v1.ListDeliveryPipelinesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.ListDeliveryPipelinesRequest,
          com.google.cloud.deploy.v1.ListDeliveryPipelinesResponse>
      getListDeliveryPipelinesMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.deploy.v1.ListDeliveryPipelinesRequest,
            com.google.cloud.deploy.v1.ListDeliveryPipelinesResponse>
        getListDeliveryPipelinesMethod;
    if ((getListDeliveryPipelinesMethod = CloudDeployGrpc.getListDeliveryPipelinesMethod) == null) {
      synchronized (CloudDeployGrpc.class) {
        if ((getListDeliveryPipelinesMethod = CloudDeployGrpc.getListDeliveryPipelinesMethod)
            == null) {
          CloudDeployGrpc.getListDeliveryPipelinesMethod =
              getListDeliveryPipelinesMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.deploy.v1.ListDeliveryPipelinesRequest,
                          com.google.cloud.deploy.v1.ListDeliveryPipelinesResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "ListDeliveryPipelines"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.ListDeliveryPipelinesRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.ListDeliveryPipelinesResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new CloudDeployMethodDescriptorSupplier("ListDeliveryPipelines"))
                      .build();
        }
      }
    }
    return getListDeliveryPipelinesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.GetDeliveryPipelineRequest,
          com.google.cloud.deploy.v1.DeliveryPipeline>
      getGetDeliveryPipelineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDeliveryPipeline",
      requestType = com.google.cloud.deploy.v1.GetDeliveryPipelineRequest.class,
      responseType = com.google.cloud.deploy.v1.DeliveryPipeline.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.GetDeliveryPipelineRequest,
          com.google.cloud.deploy.v1.DeliveryPipeline>
      getGetDeliveryPipelineMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.deploy.v1.GetDeliveryPipelineRequest,
            com.google.cloud.deploy.v1.DeliveryPipeline>
        getGetDeliveryPipelineMethod;
    if ((getGetDeliveryPipelineMethod = CloudDeployGrpc.getGetDeliveryPipelineMethod) == null) {
      synchronized (CloudDeployGrpc.class) {
        if ((getGetDeliveryPipelineMethod = CloudDeployGrpc.getGetDeliveryPipelineMethod) == null) {
          CloudDeployGrpc.getGetDeliveryPipelineMethod =
              getGetDeliveryPipelineMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.deploy.v1.GetDeliveryPipelineRequest,
                          com.google.cloud.deploy.v1.DeliveryPipeline>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "GetDeliveryPipeline"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.GetDeliveryPipelineRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.DeliveryPipeline.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new CloudDeployMethodDescriptorSupplier("GetDeliveryPipeline"))
                      .build();
        }
      }
    }
    return getGetDeliveryPipelineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.CreateDeliveryPipelineRequest,
          com.google.longrunning.Operation>
      getCreateDeliveryPipelineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDeliveryPipeline",
      requestType = com.google.cloud.deploy.v1.CreateDeliveryPipelineRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.CreateDeliveryPipelineRequest,
          com.google.longrunning.Operation>
      getCreateDeliveryPipelineMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.deploy.v1.CreateDeliveryPipelineRequest,
            com.google.longrunning.Operation>
        getCreateDeliveryPipelineMethod;
    if ((getCreateDeliveryPipelineMethod = CloudDeployGrpc.getCreateDeliveryPipelineMethod)
        == null) {
      synchronized (CloudDeployGrpc.class) {
        if ((getCreateDeliveryPipelineMethod = CloudDeployGrpc.getCreateDeliveryPipelineMethod)
            == null) {
          CloudDeployGrpc.getCreateDeliveryPipelineMethod =
              getCreateDeliveryPipelineMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.deploy.v1.CreateDeliveryPipelineRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "CreateDeliveryPipeline"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.CreateDeliveryPipelineRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new CloudDeployMethodDescriptorSupplier("CreateDeliveryPipeline"))
                      .build();
        }
      }
    }
    return getCreateDeliveryPipelineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.UpdateDeliveryPipelineRequest,
          com.google.longrunning.Operation>
      getUpdateDeliveryPipelineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDeliveryPipeline",
      requestType = com.google.cloud.deploy.v1.UpdateDeliveryPipelineRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.UpdateDeliveryPipelineRequest,
          com.google.longrunning.Operation>
      getUpdateDeliveryPipelineMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.deploy.v1.UpdateDeliveryPipelineRequest,
            com.google.longrunning.Operation>
        getUpdateDeliveryPipelineMethod;
    if ((getUpdateDeliveryPipelineMethod = CloudDeployGrpc.getUpdateDeliveryPipelineMethod)
        == null) {
      synchronized (CloudDeployGrpc.class) {
        if ((getUpdateDeliveryPipelineMethod = CloudDeployGrpc.getUpdateDeliveryPipelineMethod)
            == null) {
          CloudDeployGrpc.getUpdateDeliveryPipelineMethod =
              getUpdateDeliveryPipelineMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.deploy.v1.UpdateDeliveryPipelineRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "UpdateDeliveryPipeline"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.UpdateDeliveryPipelineRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new CloudDeployMethodDescriptorSupplier("UpdateDeliveryPipeline"))
                      .build();
        }
      }
    }
    return getUpdateDeliveryPipelineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.DeleteDeliveryPipelineRequest,
          com.google.longrunning.Operation>
      getDeleteDeliveryPipelineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDeliveryPipeline",
      requestType = com.google.cloud.deploy.v1.DeleteDeliveryPipelineRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.DeleteDeliveryPipelineRequest,
          com.google.longrunning.Operation>
      getDeleteDeliveryPipelineMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.deploy.v1.DeleteDeliveryPipelineRequest,
            com.google.longrunning.Operation>
        getDeleteDeliveryPipelineMethod;
    if ((getDeleteDeliveryPipelineMethod = CloudDeployGrpc.getDeleteDeliveryPipelineMethod)
        == null) {
      synchronized (CloudDeployGrpc.class) {
        if ((getDeleteDeliveryPipelineMethod = CloudDeployGrpc.getDeleteDeliveryPipelineMethod)
            == null) {
          CloudDeployGrpc.getDeleteDeliveryPipelineMethod =
              getDeleteDeliveryPipelineMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.deploy.v1.DeleteDeliveryPipelineRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "DeleteDeliveryPipeline"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.DeleteDeliveryPipelineRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new CloudDeployMethodDescriptorSupplier("DeleteDeliveryPipeline"))
                      .build();
        }
      }
    }
    return getDeleteDeliveryPipelineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.ListTargetsRequest,
          com.google.cloud.deploy.v1.ListTargetsResponse>
      getListTargetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTargets",
      requestType = com.google.cloud.deploy.v1.ListTargetsRequest.class,
      responseType = com.google.cloud.deploy.v1.ListTargetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.ListTargetsRequest,
          com.google.cloud.deploy.v1.ListTargetsResponse>
      getListTargetsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.deploy.v1.ListTargetsRequest,
            com.google.cloud.deploy.v1.ListTargetsResponse>
        getListTargetsMethod;
    if ((getListTargetsMethod = CloudDeployGrpc.getListTargetsMethod) == null) {
      synchronized (CloudDeployGrpc.class) {
        if ((getListTargetsMethod = CloudDeployGrpc.getListTargetsMethod) == null) {
          CloudDeployGrpc.getListTargetsMethod =
              getListTargetsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.deploy.v1.ListTargetsRequest,
                          com.google.cloud.deploy.v1.ListTargetsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTargets"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.ListTargetsRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.ListTargetsResponse.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudDeployMethodDescriptorSupplier("ListTargets"))
                      .build();
        }
      }
    }
    return getListTargetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.GetTargetRequest, com.google.cloud.deploy.v1.Target>
      getGetTargetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTarget",
      requestType = com.google.cloud.deploy.v1.GetTargetRequest.class,
      responseType = com.google.cloud.deploy.v1.Target.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.GetTargetRequest, com.google.cloud.deploy.v1.Target>
      getGetTargetMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.deploy.v1.GetTargetRequest, com.google.cloud.deploy.v1.Target>
        getGetTargetMethod;
    if ((getGetTargetMethod = CloudDeployGrpc.getGetTargetMethod) == null) {
      synchronized (CloudDeployGrpc.class) {
        if ((getGetTargetMethod = CloudDeployGrpc.getGetTargetMethod) == null) {
          CloudDeployGrpc.getGetTargetMethod =
              getGetTargetMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.deploy.v1.GetTargetRequest,
                          com.google.cloud.deploy.v1.Target>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTarget"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.GetTargetRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.Target.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudDeployMethodDescriptorSupplier("GetTarget"))
                      .build();
        }
      }
    }
    return getGetTargetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.CreateTargetRequest, com.google.longrunning.Operation>
      getCreateTargetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTarget",
      requestType = com.google.cloud.deploy.v1.CreateTargetRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.CreateTargetRequest, com.google.longrunning.Operation>
      getCreateTargetMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.deploy.v1.CreateTargetRequest, com.google.longrunning.Operation>
        getCreateTargetMethod;
    if ((getCreateTargetMethod = CloudDeployGrpc.getCreateTargetMethod) == null) {
      synchronized (CloudDeployGrpc.class) {
        if ((getCreateTargetMethod = CloudDeployGrpc.getCreateTargetMethod) == null) {
          CloudDeployGrpc.getCreateTargetMethod =
              getCreateTargetMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.deploy.v1.CreateTargetRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTarget"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.CreateTargetRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudDeployMethodDescriptorSupplier("CreateTarget"))
                      .build();
        }
      }
    }
    return getCreateTargetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.UpdateTargetRequest, com.google.longrunning.Operation>
      getUpdateTargetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTarget",
      requestType = com.google.cloud.deploy.v1.UpdateTargetRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.UpdateTargetRequest, com.google.longrunning.Operation>
      getUpdateTargetMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.deploy.v1.UpdateTargetRequest, com.google.longrunning.Operation>
        getUpdateTargetMethod;
    if ((getUpdateTargetMethod = CloudDeployGrpc.getUpdateTargetMethod) == null) {
      synchronized (CloudDeployGrpc.class) {
        if ((getUpdateTargetMethod = CloudDeployGrpc.getUpdateTargetMethod) == null) {
          CloudDeployGrpc.getUpdateTargetMethod =
              getUpdateTargetMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.deploy.v1.UpdateTargetRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTarget"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.UpdateTargetRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudDeployMethodDescriptorSupplier("UpdateTarget"))
                      .build();
        }
      }
    }
    return getUpdateTargetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.DeleteTargetRequest, com.google.longrunning.Operation>
      getDeleteTargetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTarget",
      requestType = com.google.cloud.deploy.v1.DeleteTargetRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.DeleteTargetRequest, com.google.longrunning.Operation>
      getDeleteTargetMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.deploy.v1.DeleteTargetRequest, com.google.longrunning.Operation>
        getDeleteTargetMethod;
    if ((getDeleteTargetMethod = CloudDeployGrpc.getDeleteTargetMethod) == null) {
      synchronized (CloudDeployGrpc.class) {
        if ((getDeleteTargetMethod = CloudDeployGrpc.getDeleteTargetMethod) == null) {
          CloudDeployGrpc.getDeleteTargetMethod =
              getDeleteTargetMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.deploy.v1.DeleteTargetRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTarget"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.DeleteTargetRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudDeployMethodDescriptorSupplier("DeleteTarget"))
                      .build();
        }
      }
    }
    return getDeleteTargetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.ListReleasesRequest,
          com.google.cloud.deploy.v1.ListReleasesResponse>
      getListReleasesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListReleases",
      requestType = com.google.cloud.deploy.v1.ListReleasesRequest.class,
      responseType = com.google.cloud.deploy.v1.ListReleasesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.ListReleasesRequest,
          com.google.cloud.deploy.v1.ListReleasesResponse>
      getListReleasesMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.deploy.v1.ListReleasesRequest,
            com.google.cloud.deploy.v1.ListReleasesResponse>
        getListReleasesMethod;
    if ((getListReleasesMethod = CloudDeployGrpc.getListReleasesMethod) == null) {
      synchronized (CloudDeployGrpc.class) {
        if ((getListReleasesMethod = CloudDeployGrpc.getListReleasesMethod) == null) {
          CloudDeployGrpc.getListReleasesMethod =
              getListReleasesMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.deploy.v1.ListReleasesRequest,
                          com.google.cloud.deploy.v1.ListReleasesResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListReleases"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.ListReleasesRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.ListReleasesResponse.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudDeployMethodDescriptorSupplier("ListReleases"))
                      .build();
        }
      }
    }
    return getListReleasesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.GetReleaseRequest, com.google.cloud.deploy.v1.Release>
      getGetReleaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRelease",
      requestType = com.google.cloud.deploy.v1.GetReleaseRequest.class,
      responseType = com.google.cloud.deploy.v1.Release.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.GetReleaseRequest, com.google.cloud.deploy.v1.Release>
      getGetReleaseMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.deploy.v1.GetReleaseRequest, com.google.cloud.deploy.v1.Release>
        getGetReleaseMethod;
    if ((getGetReleaseMethod = CloudDeployGrpc.getGetReleaseMethod) == null) {
      synchronized (CloudDeployGrpc.class) {
        if ((getGetReleaseMethod = CloudDeployGrpc.getGetReleaseMethod) == null) {
          CloudDeployGrpc.getGetReleaseMethod =
              getGetReleaseMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.deploy.v1.GetReleaseRequest,
                          com.google.cloud.deploy.v1.Release>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRelease"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.GetReleaseRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.Release.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudDeployMethodDescriptorSupplier("GetRelease"))
                      .build();
        }
      }
    }
    return getGetReleaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.CreateReleaseRequest, com.google.longrunning.Operation>
      getCreateReleaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRelease",
      requestType = com.google.cloud.deploy.v1.CreateReleaseRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.CreateReleaseRequest, com.google.longrunning.Operation>
      getCreateReleaseMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.deploy.v1.CreateReleaseRequest, com.google.longrunning.Operation>
        getCreateReleaseMethod;
    if ((getCreateReleaseMethod = CloudDeployGrpc.getCreateReleaseMethod) == null) {
      synchronized (CloudDeployGrpc.class) {
        if ((getCreateReleaseMethod = CloudDeployGrpc.getCreateReleaseMethod) == null) {
          CloudDeployGrpc.getCreateReleaseMethod =
              getCreateReleaseMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.deploy.v1.CreateReleaseRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRelease"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.CreateReleaseRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudDeployMethodDescriptorSupplier("CreateRelease"))
                      .build();
        }
      }
    }
    return getCreateReleaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.AbandonReleaseRequest,
          com.google.cloud.deploy.v1.AbandonReleaseResponse>
      getAbandonReleaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AbandonRelease",
      requestType = com.google.cloud.deploy.v1.AbandonReleaseRequest.class,
      responseType = com.google.cloud.deploy.v1.AbandonReleaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.AbandonReleaseRequest,
          com.google.cloud.deploy.v1.AbandonReleaseResponse>
      getAbandonReleaseMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.deploy.v1.AbandonReleaseRequest,
            com.google.cloud.deploy.v1.AbandonReleaseResponse>
        getAbandonReleaseMethod;
    if ((getAbandonReleaseMethod = CloudDeployGrpc.getAbandonReleaseMethod) == null) {
      synchronized (CloudDeployGrpc.class) {
        if ((getAbandonReleaseMethod = CloudDeployGrpc.getAbandonReleaseMethod) == null) {
          CloudDeployGrpc.getAbandonReleaseMethod =
              getAbandonReleaseMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.deploy.v1.AbandonReleaseRequest,
                          com.google.cloud.deploy.v1.AbandonReleaseResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AbandonRelease"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.AbandonReleaseRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.AbandonReleaseResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new CloudDeployMethodDescriptorSupplier("AbandonRelease"))
                      .build();
        }
      }
    }
    return getAbandonReleaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.ApproveRolloutRequest,
          com.google.cloud.deploy.v1.ApproveRolloutResponse>
      getApproveRolloutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveRollout",
      requestType = com.google.cloud.deploy.v1.ApproveRolloutRequest.class,
      responseType = com.google.cloud.deploy.v1.ApproveRolloutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.ApproveRolloutRequest,
          com.google.cloud.deploy.v1.ApproveRolloutResponse>
      getApproveRolloutMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.deploy.v1.ApproveRolloutRequest,
            com.google.cloud.deploy.v1.ApproveRolloutResponse>
        getApproveRolloutMethod;
    if ((getApproveRolloutMethod = CloudDeployGrpc.getApproveRolloutMethod) == null) {
      synchronized (CloudDeployGrpc.class) {
        if ((getApproveRolloutMethod = CloudDeployGrpc.getApproveRolloutMethod) == null) {
          CloudDeployGrpc.getApproveRolloutMethod =
              getApproveRolloutMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.deploy.v1.ApproveRolloutRequest,
                          com.google.cloud.deploy.v1.ApproveRolloutResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApproveRollout"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.ApproveRolloutRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.ApproveRolloutResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new CloudDeployMethodDescriptorSupplier("ApproveRollout"))
                      .build();
        }
      }
    }
    return getApproveRolloutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.AdvanceRolloutRequest,
          com.google.cloud.deploy.v1.AdvanceRolloutResponse>
      getAdvanceRolloutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AdvanceRollout",
      requestType = com.google.cloud.deploy.v1.AdvanceRolloutRequest.class,
      responseType = com.google.cloud.deploy.v1.AdvanceRolloutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.AdvanceRolloutRequest,
          com.google.cloud.deploy.v1.AdvanceRolloutResponse>
      getAdvanceRolloutMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.deploy.v1.AdvanceRolloutRequest,
            com.google.cloud.deploy.v1.AdvanceRolloutResponse>
        getAdvanceRolloutMethod;
    if ((getAdvanceRolloutMethod = CloudDeployGrpc.getAdvanceRolloutMethod) == null) {
      synchronized (CloudDeployGrpc.class) {
        if ((getAdvanceRolloutMethod = CloudDeployGrpc.getAdvanceRolloutMethod) == null) {
          CloudDeployGrpc.getAdvanceRolloutMethod =
              getAdvanceRolloutMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.deploy.v1.AdvanceRolloutRequest,
                          com.google.cloud.deploy.v1.AdvanceRolloutResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AdvanceRollout"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.AdvanceRolloutRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.AdvanceRolloutResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new CloudDeployMethodDescriptorSupplier("AdvanceRollout"))
                      .build();
        }
      }
    }
    return getAdvanceRolloutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.CancelRolloutRequest,
          com.google.cloud.deploy.v1.CancelRolloutResponse>
      getCancelRolloutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelRollout",
      requestType = com.google.cloud.deploy.v1.CancelRolloutRequest.class,
      responseType = com.google.cloud.deploy.v1.CancelRolloutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.CancelRolloutRequest,
          com.google.cloud.deploy.v1.CancelRolloutResponse>
      getCancelRolloutMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.deploy.v1.CancelRolloutRequest,
            com.google.cloud.deploy.v1.CancelRolloutResponse>
        getCancelRolloutMethod;
    if ((getCancelRolloutMethod = CloudDeployGrpc.getCancelRolloutMethod) == null) {
      synchronized (CloudDeployGrpc.class) {
        if ((getCancelRolloutMethod = CloudDeployGrpc.getCancelRolloutMethod) == null) {
          CloudDeployGrpc.getCancelRolloutMethod =
              getCancelRolloutMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.deploy.v1.CancelRolloutRequest,
                          com.google.cloud.deploy.v1.CancelRolloutResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelRollout"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.CancelRolloutRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.CancelRolloutResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new CloudDeployMethodDescriptorSupplier("CancelRollout"))
                      .build();
        }
      }
    }
    return getCancelRolloutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.ListRolloutsRequest,
          com.google.cloud.deploy.v1.ListRolloutsResponse>
      getListRolloutsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRollouts",
      requestType = com.google.cloud.deploy.v1.ListRolloutsRequest.class,
      responseType = com.google.cloud.deploy.v1.ListRolloutsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.ListRolloutsRequest,
          com.google.cloud.deploy.v1.ListRolloutsResponse>
      getListRolloutsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.deploy.v1.ListRolloutsRequest,
            com.google.cloud.deploy.v1.ListRolloutsResponse>
        getListRolloutsMethod;
    if ((getListRolloutsMethod = CloudDeployGrpc.getListRolloutsMethod) == null) {
      synchronized (CloudDeployGrpc.class) {
        if ((getListRolloutsMethod = CloudDeployGrpc.getListRolloutsMethod) == null) {
          CloudDeployGrpc.getListRolloutsMethod =
              getListRolloutsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.deploy.v1.ListRolloutsRequest,
                          com.google.cloud.deploy.v1.ListRolloutsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRollouts"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.ListRolloutsRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.ListRolloutsResponse.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudDeployMethodDescriptorSupplier("ListRollouts"))
                      .build();
        }
      }
    }
    return getListRolloutsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.GetRolloutRequest, com.google.cloud.deploy.v1.Rollout>
      getGetRolloutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRollout",
      requestType = com.google.cloud.deploy.v1.GetRolloutRequest.class,
      responseType = com.google.cloud.deploy.v1.Rollout.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.GetRolloutRequest, com.google.cloud.deploy.v1.Rollout>
      getGetRolloutMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.deploy.v1.GetRolloutRequest, com.google.cloud.deploy.v1.Rollout>
        getGetRolloutMethod;
    if ((getGetRolloutMethod = CloudDeployGrpc.getGetRolloutMethod) == null) {
      synchronized (CloudDeployGrpc.class) {
        if ((getGetRolloutMethod = CloudDeployGrpc.getGetRolloutMethod) == null) {
          CloudDeployGrpc.getGetRolloutMethod =
              getGetRolloutMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.deploy.v1.GetRolloutRequest,
                          com.google.cloud.deploy.v1.Rollout>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRollout"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.GetRolloutRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.Rollout.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudDeployMethodDescriptorSupplier("GetRollout"))
                      .build();
        }
      }
    }
    return getGetRolloutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.CreateRolloutRequest, com.google.longrunning.Operation>
      getCreateRolloutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRollout",
      requestType = com.google.cloud.deploy.v1.CreateRolloutRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.CreateRolloutRequest, com.google.longrunning.Operation>
      getCreateRolloutMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.deploy.v1.CreateRolloutRequest, com.google.longrunning.Operation>
        getCreateRolloutMethod;
    if ((getCreateRolloutMethod = CloudDeployGrpc.getCreateRolloutMethod) == null) {
      synchronized (CloudDeployGrpc.class) {
        if ((getCreateRolloutMethod = CloudDeployGrpc.getCreateRolloutMethod) == null) {
          CloudDeployGrpc.getCreateRolloutMethod =
              getCreateRolloutMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.deploy.v1.CreateRolloutRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRollout"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.CreateRolloutRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudDeployMethodDescriptorSupplier("CreateRollout"))
                      .build();
        }
      }
    }
    return getCreateRolloutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.IgnoreJobRequest, com.google.cloud.deploy.v1.IgnoreJobResponse>
      getIgnoreJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IgnoreJob",
      requestType = com.google.cloud.deploy.v1.IgnoreJobRequest.class,
      responseType = com.google.cloud.deploy.v1.IgnoreJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.IgnoreJobRequest, com.google.cloud.deploy.v1.IgnoreJobResponse>
      getIgnoreJobMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.deploy.v1.IgnoreJobRequest,
            com.google.cloud.deploy.v1.IgnoreJobResponse>
        getIgnoreJobMethod;
    if ((getIgnoreJobMethod = CloudDeployGrpc.getIgnoreJobMethod) == null) {
      synchronized (CloudDeployGrpc.class) {
        if ((getIgnoreJobMethod = CloudDeployGrpc.getIgnoreJobMethod) == null) {
          CloudDeployGrpc.getIgnoreJobMethod =
              getIgnoreJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.deploy.v1.IgnoreJobRequest,
                          com.google.cloud.deploy.v1.IgnoreJobResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IgnoreJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.IgnoreJobRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.IgnoreJobResponse.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudDeployMethodDescriptorSupplier("IgnoreJob"))
                      .build();
        }
      }
    }
    return getIgnoreJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.RetryJobRequest, com.google.cloud.deploy.v1.RetryJobResponse>
      getRetryJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RetryJob",
      requestType = com.google.cloud.deploy.v1.RetryJobRequest.class,
      responseType = com.google.cloud.deploy.v1.RetryJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.RetryJobRequest, com.google.cloud.deploy.v1.RetryJobResponse>
      getRetryJobMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.deploy.v1.RetryJobRequest, com.google.cloud.deploy.v1.RetryJobResponse>
        getRetryJobMethod;
    if ((getRetryJobMethod = CloudDeployGrpc.getRetryJobMethod) == null) {
      synchronized (CloudDeployGrpc.class) {
        if ((getRetryJobMethod = CloudDeployGrpc.getRetryJobMethod) == null) {
          CloudDeployGrpc.getRetryJobMethod =
              getRetryJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.deploy.v1.RetryJobRequest,
                          com.google.cloud.deploy.v1.RetryJobResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RetryJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.RetryJobRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.RetryJobResponse.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudDeployMethodDescriptorSupplier("RetryJob"))
                      .build();
        }
      }
    }
    return getRetryJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.ListJobRunsRequest,
          com.google.cloud.deploy.v1.ListJobRunsResponse>
      getListJobRunsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListJobRuns",
      requestType = com.google.cloud.deploy.v1.ListJobRunsRequest.class,
      responseType = com.google.cloud.deploy.v1.ListJobRunsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.ListJobRunsRequest,
          com.google.cloud.deploy.v1.ListJobRunsResponse>
      getListJobRunsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.deploy.v1.ListJobRunsRequest,
            com.google.cloud.deploy.v1.ListJobRunsResponse>
        getListJobRunsMethod;
    if ((getListJobRunsMethod = CloudDeployGrpc.getListJobRunsMethod) == null) {
      synchronized (CloudDeployGrpc.class) {
        if ((getListJobRunsMethod = CloudDeployGrpc.getListJobRunsMethod) == null) {
          CloudDeployGrpc.getListJobRunsMethod =
              getListJobRunsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.deploy.v1.ListJobRunsRequest,
                          com.google.cloud.deploy.v1.ListJobRunsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListJobRuns"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.ListJobRunsRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.ListJobRunsResponse.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudDeployMethodDescriptorSupplier("ListJobRuns"))
                      .build();
        }
      }
    }
    return getListJobRunsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.GetJobRunRequest, com.google.cloud.deploy.v1.JobRun>
      getGetJobRunMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetJobRun",
      requestType = com.google.cloud.deploy.v1.GetJobRunRequest.class,
      responseType = com.google.cloud.deploy.v1.JobRun.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.GetJobRunRequest, com.google.cloud.deploy.v1.JobRun>
      getGetJobRunMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.deploy.v1.GetJobRunRequest, com.google.cloud.deploy.v1.JobRun>
        getGetJobRunMethod;
    if ((getGetJobRunMethod = CloudDeployGrpc.getGetJobRunMethod) == null) {
      synchronized (CloudDeployGrpc.class) {
        if ((getGetJobRunMethod = CloudDeployGrpc.getGetJobRunMethod) == null) {
          CloudDeployGrpc.getGetJobRunMethod =
              getGetJobRunMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.deploy.v1.GetJobRunRequest,
                          com.google.cloud.deploy.v1.JobRun>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetJobRun"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.GetJobRunRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.JobRun.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudDeployMethodDescriptorSupplier("GetJobRun"))
                      .build();
        }
      }
    }
    return getGetJobRunMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.TerminateJobRunRequest,
          com.google.cloud.deploy.v1.TerminateJobRunResponse>
      getTerminateJobRunMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TerminateJobRun",
      requestType = com.google.cloud.deploy.v1.TerminateJobRunRequest.class,
      responseType = com.google.cloud.deploy.v1.TerminateJobRunResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.TerminateJobRunRequest,
          com.google.cloud.deploy.v1.TerminateJobRunResponse>
      getTerminateJobRunMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.deploy.v1.TerminateJobRunRequest,
            com.google.cloud.deploy.v1.TerminateJobRunResponse>
        getTerminateJobRunMethod;
    if ((getTerminateJobRunMethod = CloudDeployGrpc.getTerminateJobRunMethod) == null) {
      synchronized (CloudDeployGrpc.class) {
        if ((getTerminateJobRunMethod = CloudDeployGrpc.getTerminateJobRunMethod) == null) {
          CloudDeployGrpc.getTerminateJobRunMethod =
              getTerminateJobRunMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.deploy.v1.TerminateJobRunRequest,
                          com.google.cloud.deploy.v1.TerminateJobRunResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TerminateJobRun"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.TerminateJobRunRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.TerminateJobRunResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new CloudDeployMethodDescriptorSupplier("TerminateJobRun"))
                      .build();
        }
      }
    }
    return getTerminateJobRunMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.GetConfigRequest, com.google.cloud.deploy.v1.Config>
      getGetConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConfig",
      requestType = com.google.cloud.deploy.v1.GetConfigRequest.class,
      responseType = com.google.cloud.deploy.v1.Config.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.deploy.v1.GetConfigRequest, com.google.cloud.deploy.v1.Config>
      getGetConfigMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.deploy.v1.GetConfigRequest, com.google.cloud.deploy.v1.Config>
        getGetConfigMethod;
    if ((getGetConfigMethod = CloudDeployGrpc.getGetConfigMethod) == null) {
      synchronized (CloudDeployGrpc.class) {
        if ((getGetConfigMethod = CloudDeployGrpc.getGetConfigMethod) == null) {
          CloudDeployGrpc.getGetConfigMethod =
              getGetConfigMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.deploy.v1.GetConfigRequest,
                          com.google.cloud.deploy.v1.Config>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetConfig"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.GetConfigRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.deploy.v1.Config.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudDeployMethodDescriptorSupplier("GetConfig"))
                      .build();
        }
      }
    }
    return getGetConfigMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static CloudDeployStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CloudDeployStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<CloudDeployStub>() {
          @java.lang.Override
          public CloudDeployStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new CloudDeployStub(channel, callOptions);
          }
        };
    return CloudDeployStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CloudDeployBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CloudDeployBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<CloudDeployBlockingStub>() {
          @java.lang.Override
          public CloudDeployBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new CloudDeployBlockingStub(channel, callOptions);
          }
        };
    return CloudDeployBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static CloudDeployFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CloudDeployFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<CloudDeployFutureStub>() {
          @java.lang.Override
          public CloudDeployFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new CloudDeployFutureStub(channel, callOptions);
          }
        };
    return CloudDeployFutureStub.newStub(factory, channel);
  }

  /**
   *
   *
   * <pre>
   * CloudDeploy service creates and manages Continuous Delivery operations
   * on Google Cloud Platform via Skaffold (https://skaffold.dev).
   * </pre>
   */
  public interface AsyncService {

    /**
     *
     *
     * <pre>
     * Lists DeliveryPipelines in a given project and location.
     * </pre>
     */
    default void listDeliveryPipelines(
        com.google.cloud.deploy.v1.ListDeliveryPipelinesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.ListDeliveryPipelinesResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getListDeliveryPipelinesMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets details of a single DeliveryPipeline.
     * </pre>
     */
    default void getDeliveryPipeline(
        com.google.cloud.deploy.v1.GetDeliveryPipelineRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.DeliveryPipeline> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getGetDeliveryPipelineMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a new DeliveryPipeline in a given project and location.
     * </pre>
     */
    default void createDeliveryPipeline(
        com.google.cloud.deploy.v1.CreateDeliveryPipelineRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getCreateDeliveryPipelineMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates the parameters of a single DeliveryPipeline.
     * </pre>
     */
    default void updateDeliveryPipeline(
        com.google.cloud.deploy.v1.UpdateDeliveryPipelineRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getUpdateDeliveryPipelineMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a single DeliveryPipeline.
     * </pre>
     */
    default void deleteDeliveryPipeline(
        com.google.cloud.deploy.v1.DeleteDeliveryPipelineRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getDeleteDeliveryPipelineMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists Targets in a given project and location.
     * </pre>
     */
    default void listTargets(
        com.google.cloud.deploy.v1.ListTargetsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.ListTargetsResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getListTargetsMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets details of a single Target.
     * </pre>
     */
    default void getTarget(
        com.google.cloud.deploy.v1.GetTargetRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.Target> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTargetMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a new Target in a given project and location.
     * </pre>
     */
    default void createTarget(
        com.google.cloud.deploy.v1.CreateTargetRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getCreateTargetMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates the parameters of a single Target.
     * </pre>
     */
    default void updateTarget(
        com.google.cloud.deploy.v1.UpdateTargetRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getUpdateTargetMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a single Target.
     * </pre>
     */
    default void deleteTarget(
        com.google.cloud.deploy.v1.DeleteTargetRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getDeleteTargetMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists Releases in a given project and location.
     * </pre>
     */
    default void listReleases(
        com.google.cloud.deploy.v1.ListReleasesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.ListReleasesResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getListReleasesMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets details of a single Release.
     * </pre>
     */
    default void getRelease(
        com.google.cloud.deploy.v1.GetReleaseRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.Release> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReleaseMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a new Release in a given project and location.
     * </pre>
     */
    default void createRelease(
        com.google.cloud.deploy.v1.CreateReleaseRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getCreateReleaseMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Abandons a Release in the Delivery Pipeline.
     * </pre>
     */
    default void abandonRelease(
        com.google.cloud.deploy.v1.AbandonReleaseRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.AbandonReleaseResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getAbandonReleaseMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Approves a Rollout.
     * </pre>
     */
    default void approveRollout(
        com.google.cloud.deploy.v1.ApproveRolloutRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.ApproveRolloutResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getApproveRolloutMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Advances a Rollout in a given project and location.
     * </pre>
     */
    default void advanceRollout(
        com.google.cloud.deploy.v1.AdvanceRolloutRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.AdvanceRolloutResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getAdvanceRolloutMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Cancels a Rollout in a given project and location.
     * </pre>
     */
    default void cancelRollout(
        com.google.cloud.deploy.v1.CancelRolloutRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.CancelRolloutResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getCancelRolloutMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists Rollouts in a given project and location.
     * </pre>
     */
    default void listRollouts(
        com.google.cloud.deploy.v1.ListRolloutsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.ListRolloutsResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getListRolloutsMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets details of a single Rollout.
     * </pre>
     */
    default void getRollout(
        com.google.cloud.deploy.v1.GetRolloutRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.Rollout> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRolloutMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a new Rollout in a given project and location.
     * </pre>
     */
    default void createRollout(
        com.google.cloud.deploy.v1.CreateRolloutRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getCreateRolloutMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Ignores the specified Job in a Rollout.
     * </pre>
     */
    default void ignoreJob(
        com.google.cloud.deploy.v1.IgnoreJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.IgnoreJobResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIgnoreJobMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Retries the specified Job in a Rollout.
     * </pre>
     */
    default void retryJob(
        com.google.cloud.deploy.v1.RetryJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.RetryJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetryJobMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists JobRuns in a given project and location.
     * </pre>
     */
    default void listJobRuns(
        com.google.cloud.deploy.v1.ListJobRunsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.ListJobRunsResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getListJobRunsMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets details of a single JobRun.
     * </pre>
     */
    default void getJobRun(
        com.google.cloud.deploy.v1.GetJobRunRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.JobRun> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetJobRunMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Terminates a Job Run in a given project and location.
     * </pre>
     */
    default void terminateJobRun(
        com.google.cloud.deploy.v1.TerminateJobRunRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.TerminateJobRunResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getTerminateJobRunMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets the configuration for a location.
     * </pre>
     */
    default void getConfig(
        com.google.cloud.deploy.v1.GetConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.Config> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetConfigMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CloudDeploy.
   *
   * <pre>
   * CloudDeploy service creates and manages Continuous Delivery operations
   * on Google Cloud Platform via Skaffold (https://skaffold.dev).
   * </pre>
   */
  public abstract static class CloudDeployImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return CloudDeployGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CloudDeploy.
   *
   * <pre>
   * CloudDeploy service creates and manages Continuous Delivery operations
   * on Google Cloud Platform via Skaffold (https://skaffold.dev).
   * </pre>
   */
  public static final class CloudDeployStub
      extends io.grpc.stub.AbstractAsyncStub<CloudDeployStub> {
    private CloudDeployStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudDeployStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CloudDeployStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Lists DeliveryPipelines in a given project and location.
     * </pre>
     */
    public void listDeliveryPipelines(
        com.google.cloud.deploy.v1.ListDeliveryPipelinesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.ListDeliveryPipelinesResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDeliveryPipelinesMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets details of a single DeliveryPipeline.
     * </pre>
     */
    public void getDeliveryPipeline(
        com.google.cloud.deploy.v1.GetDeliveryPipelineRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.DeliveryPipeline> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDeliveryPipelineMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a new DeliveryPipeline in a given project and location.
     * </pre>
     */
    public void createDeliveryPipeline(
        com.google.cloud.deploy.v1.CreateDeliveryPipelineRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDeliveryPipelineMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates the parameters of a single DeliveryPipeline.
     * </pre>
     */
    public void updateDeliveryPipeline(
        com.google.cloud.deploy.v1.UpdateDeliveryPipelineRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDeliveryPipelineMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a single DeliveryPipeline.
     * </pre>
     */
    public void deleteDeliveryPipeline(
        com.google.cloud.deploy.v1.DeleteDeliveryPipelineRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDeliveryPipelineMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists Targets in a given project and location.
     * </pre>
     */
    public void listTargets(
        com.google.cloud.deploy.v1.ListTargetsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.ListTargetsResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTargetsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets details of a single Target.
     * </pre>
     */
    public void getTarget(
        com.google.cloud.deploy.v1.GetTargetRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.Target> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTargetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a new Target in a given project and location.
     * </pre>
     */
    public void createTarget(
        com.google.cloud.deploy.v1.CreateTargetRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTargetMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates the parameters of a single Target.
     * </pre>
     */
    public void updateTarget(
        com.google.cloud.deploy.v1.UpdateTargetRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTargetMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a single Target.
     * </pre>
     */
    public void deleteTarget(
        com.google.cloud.deploy.v1.DeleteTargetRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTargetMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists Releases in a given project and location.
     * </pre>
     */
    public void listReleases(
        com.google.cloud.deploy.v1.ListReleasesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.ListReleasesResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListReleasesMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets details of a single Release.
     * </pre>
     */
    public void getRelease(
        com.google.cloud.deploy.v1.GetReleaseRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.Release> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReleaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a new Release in a given project and location.
     * </pre>
     */
    public void createRelease(
        com.google.cloud.deploy.v1.CreateReleaseRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateReleaseMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Abandons a Release in the Delivery Pipeline.
     * </pre>
     */
    public void abandonRelease(
        com.google.cloud.deploy.v1.AbandonReleaseRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.AbandonReleaseResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAbandonReleaseMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Approves a Rollout.
     * </pre>
     */
    public void approveRollout(
        com.google.cloud.deploy.v1.ApproveRolloutRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.ApproveRolloutResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveRolloutMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Advances a Rollout in a given project and location.
     * </pre>
     */
    public void advanceRollout(
        com.google.cloud.deploy.v1.AdvanceRolloutRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.AdvanceRolloutResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAdvanceRolloutMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Cancels a Rollout in a given project and location.
     * </pre>
     */
    public void cancelRollout(
        com.google.cloud.deploy.v1.CancelRolloutRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.CancelRolloutResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelRolloutMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists Rollouts in a given project and location.
     * </pre>
     */
    public void listRollouts(
        com.google.cloud.deploy.v1.ListRolloutsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.ListRolloutsResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRolloutsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets details of a single Rollout.
     * </pre>
     */
    public void getRollout(
        com.google.cloud.deploy.v1.GetRolloutRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.Rollout> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRolloutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a new Rollout in a given project and location.
     * </pre>
     */
    public void createRollout(
        com.google.cloud.deploy.v1.CreateRolloutRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRolloutMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Ignores the specified Job in a Rollout.
     * </pre>
     */
    public void ignoreJob(
        com.google.cloud.deploy.v1.IgnoreJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.IgnoreJobResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIgnoreJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Retries the specified Job in a Rollout.
     * </pre>
     */
    public void retryJob(
        com.google.cloud.deploy.v1.RetryJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.RetryJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetryJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists JobRuns in a given project and location.
     * </pre>
     */
    public void listJobRuns(
        com.google.cloud.deploy.v1.ListJobRunsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.ListJobRunsResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListJobRunsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets details of a single JobRun.
     * </pre>
     */
    public void getJobRun(
        com.google.cloud.deploy.v1.GetJobRunRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.JobRun> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetJobRunMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Terminates a Job Run in a given project and location.
     * </pre>
     */
    public void terminateJobRun(
        com.google.cloud.deploy.v1.TerminateJobRunRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.TerminateJobRunResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTerminateJobRunMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets the configuration for a location.
     * </pre>
     */
    public void getConfig(
        com.google.cloud.deploy.v1.GetConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.Config> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetConfigMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CloudDeploy.
   *
   * <pre>
   * CloudDeploy service creates and manages Continuous Delivery operations
   * on Google Cloud Platform via Skaffold (https://skaffold.dev).
   * </pre>
   */
  public static final class CloudDeployBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CloudDeployBlockingStub> {
    private CloudDeployBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudDeployBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CloudDeployBlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Lists DeliveryPipelines in a given project and location.
     * </pre>
     */
    public com.google.cloud.deploy.v1.ListDeliveryPipelinesResponse listDeliveryPipelines(
        com.google.cloud.deploy.v1.ListDeliveryPipelinesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDeliveryPipelinesMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets details of a single DeliveryPipeline.
     * </pre>
     */
    public com.google.cloud.deploy.v1.DeliveryPipeline getDeliveryPipeline(
        com.google.cloud.deploy.v1.GetDeliveryPipelineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDeliveryPipelineMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a new DeliveryPipeline in a given project and location.
     * </pre>
     */
    public com.google.longrunning.Operation createDeliveryPipeline(
        com.google.cloud.deploy.v1.CreateDeliveryPipelineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDeliveryPipelineMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Updates the parameters of a single DeliveryPipeline.
     * </pre>
     */
    public com.google.longrunning.Operation updateDeliveryPipeline(
        com.google.cloud.deploy.v1.UpdateDeliveryPipelineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDeliveryPipelineMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a single DeliveryPipeline.
     * </pre>
     */
    public com.google.longrunning.Operation deleteDeliveryPipeline(
        com.google.cloud.deploy.v1.DeleteDeliveryPipelineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDeliveryPipelineMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists Targets in a given project and location.
     * </pre>
     */
    public com.google.cloud.deploy.v1.ListTargetsResponse listTargets(
        com.google.cloud.deploy.v1.ListTargetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTargetsMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets details of a single Target.
     * </pre>
     */
    public com.google.cloud.deploy.v1.Target getTarget(
        com.google.cloud.deploy.v1.GetTargetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTargetMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a new Target in a given project and location.
     * </pre>
     */
    public com.google.longrunning.Operation createTarget(
        com.google.cloud.deploy.v1.CreateTargetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTargetMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Updates the parameters of a single Target.
     * </pre>
     */
    public com.google.longrunning.Operation updateTarget(
        com.google.cloud.deploy.v1.UpdateTargetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTargetMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a single Target.
     * </pre>
     */
    public com.google.longrunning.Operation deleteTarget(
        com.google.cloud.deploy.v1.DeleteTargetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTargetMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists Releases in a given project and location.
     * </pre>
     */
    public com.google.cloud.deploy.v1.ListReleasesResponse listReleases(
        com.google.cloud.deploy.v1.ListReleasesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListReleasesMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets details of a single Release.
     * </pre>
     */
    public com.google.cloud.deploy.v1.Release getRelease(
        com.google.cloud.deploy.v1.GetReleaseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReleaseMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a new Release in a given project and location.
     * </pre>
     */
    public com.google.longrunning.Operation createRelease(
        com.google.cloud.deploy.v1.CreateReleaseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateReleaseMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Abandons a Release in the Delivery Pipeline.
     * </pre>
     */
    public com.google.cloud.deploy.v1.AbandonReleaseResponse abandonRelease(
        com.google.cloud.deploy.v1.AbandonReleaseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAbandonReleaseMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Approves a Rollout.
     * </pre>
     */
    public com.google.cloud.deploy.v1.ApproveRolloutResponse approveRollout(
        com.google.cloud.deploy.v1.ApproveRolloutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveRolloutMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Advances a Rollout in a given project and location.
     * </pre>
     */
    public com.google.cloud.deploy.v1.AdvanceRolloutResponse advanceRollout(
        com.google.cloud.deploy.v1.AdvanceRolloutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAdvanceRolloutMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Cancels a Rollout in a given project and location.
     * </pre>
     */
    public com.google.cloud.deploy.v1.CancelRolloutResponse cancelRollout(
        com.google.cloud.deploy.v1.CancelRolloutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelRolloutMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists Rollouts in a given project and location.
     * </pre>
     */
    public com.google.cloud.deploy.v1.ListRolloutsResponse listRollouts(
        com.google.cloud.deploy.v1.ListRolloutsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRolloutsMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets details of a single Rollout.
     * </pre>
     */
    public com.google.cloud.deploy.v1.Rollout getRollout(
        com.google.cloud.deploy.v1.GetRolloutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRolloutMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a new Rollout in a given project and location.
     * </pre>
     */
    public com.google.longrunning.Operation createRollout(
        com.google.cloud.deploy.v1.CreateRolloutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRolloutMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Ignores the specified Job in a Rollout.
     * </pre>
     */
    public com.google.cloud.deploy.v1.IgnoreJobResponse ignoreJob(
        com.google.cloud.deploy.v1.IgnoreJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIgnoreJobMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Retries the specified Job in a Rollout.
     * </pre>
     */
    public com.google.cloud.deploy.v1.RetryJobResponse retryJob(
        com.google.cloud.deploy.v1.RetryJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetryJobMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists JobRuns in a given project and location.
     * </pre>
     */
    public com.google.cloud.deploy.v1.ListJobRunsResponse listJobRuns(
        com.google.cloud.deploy.v1.ListJobRunsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListJobRunsMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets details of a single JobRun.
     * </pre>
     */
    public com.google.cloud.deploy.v1.JobRun getJobRun(
        com.google.cloud.deploy.v1.GetJobRunRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetJobRunMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Terminates a Job Run in a given project and location.
     * </pre>
     */
    public com.google.cloud.deploy.v1.TerminateJobRunResponse terminateJobRun(
        com.google.cloud.deploy.v1.TerminateJobRunRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTerminateJobRunMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets the configuration for a location.
     * </pre>
     */
    public com.google.cloud.deploy.v1.Config getConfig(
        com.google.cloud.deploy.v1.GetConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetConfigMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CloudDeploy.
   *
   * <pre>
   * CloudDeploy service creates and manages Continuous Delivery operations
   * on Google Cloud Platform via Skaffold (https://skaffold.dev).
   * </pre>
   */
  public static final class CloudDeployFutureStub
      extends io.grpc.stub.AbstractFutureStub<CloudDeployFutureStub> {
    private CloudDeployFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudDeployFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CloudDeployFutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Lists DeliveryPipelines in a given project and location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.deploy.v1.ListDeliveryPipelinesResponse>
        listDeliveryPipelines(com.google.cloud.deploy.v1.ListDeliveryPipelinesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDeliveryPipelinesMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets details of a single DeliveryPipeline.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.deploy.v1.DeliveryPipeline>
        getDeliveryPipeline(com.google.cloud.deploy.v1.GetDeliveryPipelineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDeliveryPipelineMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a new DeliveryPipeline in a given project and location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        createDeliveryPipeline(com.google.cloud.deploy.v1.CreateDeliveryPipelineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDeliveryPipelineMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Updates the parameters of a single DeliveryPipeline.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        updateDeliveryPipeline(com.google.cloud.deploy.v1.UpdateDeliveryPipelineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDeliveryPipelineMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a single DeliveryPipeline.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        deleteDeliveryPipeline(com.google.cloud.deploy.v1.DeleteDeliveryPipelineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDeliveryPipelineMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists Targets in a given project and location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.deploy.v1.ListTargetsResponse>
        listTargets(com.google.cloud.deploy.v1.ListTargetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTargetsMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets details of a single Target.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.deploy.v1.Target>
        getTarget(com.google.cloud.deploy.v1.GetTargetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTargetMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a new Target in a given project and location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        createTarget(com.google.cloud.deploy.v1.CreateTargetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTargetMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Updates the parameters of a single Target.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        updateTarget(com.google.cloud.deploy.v1.UpdateTargetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTargetMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a single Target.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        deleteTarget(com.google.cloud.deploy.v1.DeleteTargetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTargetMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists Releases in a given project and location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.deploy.v1.ListReleasesResponse>
        listReleases(com.google.cloud.deploy.v1.ListReleasesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListReleasesMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets details of a single Release.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.deploy.v1.Release>
        getRelease(com.google.cloud.deploy.v1.GetReleaseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReleaseMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a new Release in a given project and location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        createRelease(com.google.cloud.deploy.v1.CreateReleaseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateReleaseMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Abandons a Release in the Delivery Pipeline.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.deploy.v1.AbandonReleaseResponse>
        abandonRelease(com.google.cloud.deploy.v1.AbandonReleaseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAbandonReleaseMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Approves a Rollout.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.deploy.v1.ApproveRolloutResponse>
        approveRollout(com.google.cloud.deploy.v1.ApproveRolloutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveRolloutMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Advances a Rollout in a given project and location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.deploy.v1.AdvanceRolloutResponse>
        advanceRollout(com.google.cloud.deploy.v1.AdvanceRolloutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAdvanceRolloutMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Cancels a Rollout in a given project and location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.deploy.v1.CancelRolloutResponse>
        cancelRollout(com.google.cloud.deploy.v1.CancelRolloutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelRolloutMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists Rollouts in a given project and location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.deploy.v1.ListRolloutsResponse>
        listRollouts(com.google.cloud.deploy.v1.ListRolloutsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRolloutsMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets details of a single Rollout.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.deploy.v1.Rollout>
        getRollout(com.google.cloud.deploy.v1.GetRolloutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRolloutMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a new Rollout in a given project and location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        createRollout(com.google.cloud.deploy.v1.CreateRolloutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRolloutMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Ignores the specified Job in a Rollout.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.deploy.v1.IgnoreJobResponse>
        ignoreJob(com.google.cloud.deploy.v1.IgnoreJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIgnoreJobMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Retries the specified Job in a Rollout.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.deploy.v1.RetryJobResponse>
        retryJob(com.google.cloud.deploy.v1.RetryJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetryJobMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists JobRuns in a given project and location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.deploy.v1.ListJobRunsResponse>
        listJobRuns(com.google.cloud.deploy.v1.ListJobRunsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListJobRunsMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets details of a single JobRun.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.deploy.v1.JobRun>
        getJobRun(com.google.cloud.deploy.v1.GetJobRunRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetJobRunMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Terminates a Job Run in a given project and location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.deploy.v1.TerminateJobRunResponse>
        terminateJobRun(com.google.cloud.deploy.v1.TerminateJobRunRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTerminateJobRunMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets the configuration for a location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.deploy.v1.Config>
        getConfig(com.google.cloud.deploy.v1.GetConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetConfigMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_DELIVERY_PIPELINES = 0;
  private static final int METHODID_GET_DELIVERY_PIPELINE = 1;
  private static final int METHODID_CREATE_DELIVERY_PIPELINE = 2;
  private static final int METHODID_UPDATE_DELIVERY_PIPELINE = 3;
  private static final int METHODID_DELETE_DELIVERY_PIPELINE = 4;
  private static final int METHODID_LIST_TARGETS = 5;
  private static final int METHODID_GET_TARGET = 6;
  private static final int METHODID_CREATE_TARGET = 7;
  private static final int METHODID_UPDATE_TARGET = 8;
  private static final int METHODID_DELETE_TARGET = 9;
  private static final int METHODID_LIST_RELEASES = 10;
  private static final int METHODID_GET_RELEASE = 11;
  private static final int METHODID_CREATE_RELEASE = 12;
  private static final int METHODID_ABANDON_RELEASE = 13;
  private static final int METHODID_APPROVE_ROLLOUT = 14;
  private static final int METHODID_ADVANCE_ROLLOUT = 15;
  private static final int METHODID_CANCEL_ROLLOUT = 16;
  private static final int METHODID_LIST_ROLLOUTS = 17;
  private static final int METHODID_GET_ROLLOUT = 18;
  private static final int METHODID_CREATE_ROLLOUT = 19;
  private static final int METHODID_IGNORE_JOB = 20;
  private static final int METHODID_RETRY_JOB = 21;
  private static final int METHODID_LIST_JOB_RUNS = 22;
  private static final int METHODID_GET_JOB_RUN = 23;
  private static final int METHODID_TERMINATE_JOB_RUN = 24;
  private static final int METHODID_GET_CONFIG = 25;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_DELIVERY_PIPELINES:
          serviceImpl.listDeliveryPipelines(
              (com.google.cloud.deploy.v1.ListDeliveryPipelinesRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.deploy.v1.ListDeliveryPipelinesResponse>)
                  responseObserver);
          break;
        case METHODID_GET_DELIVERY_PIPELINE:
          serviceImpl.getDeliveryPipeline(
              (com.google.cloud.deploy.v1.GetDeliveryPipelineRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.DeliveryPipeline>)
                  responseObserver);
          break;
        case METHODID_CREATE_DELIVERY_PIPELINE:
          serviceImpl.createDeliveryPipeline(
              (com.google.cloud.deploy.v1.CreateDeliveryPipelineRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_DELIVERY_PIPELINE:
          serviceImpl.updateDeliveryPipeline(
              (com.google.cloud.deploy.v1.UpdateDeliveryPipelineRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_DELETE_DELIVERY_PIPELINE:
          serviceImpl.deleteDeliveryPipeline(
              (com.google.cloud.deploy.v1.DeleteDeliveryPipelineRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_LIST_TARGETS:
          serviceImpl.listTargets(
              (com.google.cloud.deploy.v1.ListTargetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.ListTargetsResponse>)
                  responseObserver);
          break;
        case METHODID_GET_TARGET:
          serviceImpl.getTarget(
              (com.google.cloud.deploy.v1.GetTargetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.Target>) responseObserver);
          break;
        case METHODID_CREATE_TARGET:
          serviceImpl.createTarget(
              (com.google.cloud.deploy.v1.CreateTargetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_TARGET:
          serviceImpl.updateTarget(
              (com.google.cloud.deploy.v1.UpdateTargetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_DELETE_TARGET:
          serviceImpl.deleteTarget(
              (com.google.cloud.deploy.v1.DeleteTargetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_LIST_RELEASES:
          serviceImpl.listReleases(
              (com.google.cloud.deploy.v1.ListReleasesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.ListReleasesResponse>)
                  responseObserver);
          break;
        case METHODID_GET_RELEASE:
          serviceImpl.getRelease(
              (com.google.cloud.deploy.v1.GetReleaseRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.Release>) responseObserver);
          break;
        case METHODID_CREATE_RELEASE:
          serviceImpl.createRelease(
              (com.google.cloud.deploy.v1.CreateReleaseRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_ABANDON_RELEASE:
          serviceImpl.abandonRelease(
              (com.google.cloud.deploy.v1.AbandonReleaseRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.AbandonReleaseResponse>)
                  responseObserver);
          break;
        case METHODID_APPROVE_ROLLOUT:
          serviceImpl.approveRollout(
              (com.google.cloud.deploy.v1.ApproveRolloutRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.ApproveRolloutResponse>)
                  responseObserver);
          break;
        case METHODID_ADVANCE_ROLLOUT:
          serviceImpl.advanceRollout(
              (com.google.cloud.deploy.v1.AdvanceRolloutRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.AdvanceRolloutResponse>)
                  responseObserver);
          break;
        case METHODID_CANCEL_ROLLOUT:
          serviceImpl.cancelRollout(
              (com.google.cloud.deploy.v1.CancelRolloutRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.CancelRolloutResponse>)
                  responseObserver);
          break;
        case METHODID_LIST_ROLLOUTS:
          serviceImpl.listRollouts(
              (com.google.cloud.deploy.v1.ListRolloutsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.ListRolloutsResponse>)
                  responseObserver);
          break;
        case METHODID_GET_ROLLOUT:
          serviceImpl.getRollout(
              (com.google.cloud.deploy.v1.GetRolloutRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.Rollout>) responseObserver);
          break;
        case METHODID_CREATE_ROLLOUT:
          serviceImpl.createRollout(
              (com.google.cloud.deploy.v1.CreateRolloutRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_IGNORE_JOB:
          serviceImpl.ignoreJob(
              (com.google.cloud.deploy.v1.IgnoreJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.IgnoreJobResponse>)
                  responseObserver);
          break;
        case METHODID_RETRY_JOB:
          serviceImpl.retryJob(
              (com.google.cloud.deploy.v1.RetryJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.RetryJobResponse>)
                  responseObserver);
          break;
        case METHODID_LIST_JOB_RUNS:
          serviceImpl.listJobRuns(
              (com.google.cloud.deploy.v1.ListJobRunsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.ListJobRunsResponse>)
                  responseObserver);
          break;
        case METHODID_GET_JOB_RUN:
          serviceImpl.getJobRun(
              (com.google.cloud.deploy.v1.GetJobRunRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.JobRun>) responseObserver);
          break;
        case METHODID_TERMINATE_JOB_RUN:
          serviceImpl.terminateJobRun(
              (com.google.cloud.deploy.v1.TerminateJobRunRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.TerminateJobRunResponse>)
                  responseObserver);
          break;
        case METHODID_GET_CONFIG:
          serviceImpl.getConfig(
              (com.google.cloud.deploy.v1.GetConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.deploy.v1.Config>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
            getListDeliveryPipelinesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.deploy.v1.ListDeliveryPipelinesRequest,
                    com.google.cloud.deploy.v1.ListDeliveryPipelinesResponse>(
                    service, METHODID_LIST_DELIVERY_PIPELINES)))
        .addMethod(
            getGetDeliveryPipelineMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.deploy.v1.GetDeliveryPipelineRequest,
                    com.google.cloud.deploy.v1.DeliveryPipeline>(
                    service, METHODID_GET_DELIVERY_PIPELINE)))
        .addMethod(
            getCreateDeliveryPipelineMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.deploy.v1.CreateDeliveryPipelineRequest,
                    com.google.longrunning.Operation>(service, METHODID_CREATE_DELIVERY_PIPELINE)))
        .addMethod(
            getUpdateDeliveryPipelineMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.deploy.v1.UpdateDeliveryPipelineRequest,
                    com.google.longrunning.Operation>(service, METHODID_UPDATE_DELIVERY_PIPELINE)))
        .addMethod(
            getDeleteDeliveryPipelineMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.deploy.v1.DeleteDeliveryPipelineRequest,
                    com.google.longrunning.Operation>(service, METHODID_DELETE_DELIVERY_PIPELINE)))
        .addMethod(
            getListTargetsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.deploy.v1.ListTargetsRequest,
                    com.google.cloud.deploy.v1.ListTargetsResponse>(
                    service, METHODID_LIST_TARGETS)))
        .addMethod(
            getGetTargetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.deploy.v1.GetTargetRequest, com.google.cloud.deploy.v1.Target>(
                    service, METHODID_GET_TARGET)))
        .addMethod(
            getCreateTargetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.deploy.v1.CreateTargetRequest,
                    com.google.longrunning.Operation>(service, METHODID_CREATE_TARGET)))
        .addMethod(
            getUpdateTargetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.deploy.v1.UpdateTargetRequest,
                    com.google.longrunning.Operation>(service, METHODID_UPDATE_TARGET)))
        .addMethod(
            getDeleteTargetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.deploy.v1.DeleteTargetRequest,
                    com.google.longrunning.Operation>(service, METHODID_DELETE_TARGET)))
        .addMethod(
            getListReleasesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.deploy.v1.ListReleasesRequest,
                    com.google.cloud.deploy.v1.ListReleasesResponse>(
                    service, METHODID_LIST_RELEASES)))
        .addMethod(
            getGetReleaseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.deploy.v1.GetReleaseRequest,
                    com.google.cloud.deploy.v1.Release>(service, METHODID_GET_RELEASE)))
        .addMethod(
            getCreateReleaseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.deploy.v1.CreateReleaseRequest,
                    com.google.longrunning.Operation>(service, METHODID_CREATE_RELEASE)))
        .addMethod(
            getAbandonReleaseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.deploy.v1.AbandonReleaseRequest,
                    com.google.cloud.deploy.v1.AbandonReleaseResponse>(
                    service, METHODID_ABANDON_RELEASE)))
        .addMethod(
            getApproveRolloutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.deploy.v1.ApproveRolloutRequest,
                    com.google.cloud.deploy.v1.ApproveRolloutResponse>(
                    service, METHODID_APPROVE_ROLLOUT)))
        .addMethod(
            getAdvanceRolloutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.deploy.v1.AdvanceRolloutRequest,
                    com.google.cloud.deploy.v1.AdvanceRolloutResponse>(
                    service, METHODID_ADVANCE_ROLLOUT)))
        .addMethod(
            getCancelRolloutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.deploy.v1.CancelRolloutRequest,
                    com.google.cloud.deploy.v1.CancelRolloutResponse>(
                    service, METHODID_CANCEL_ROLLOUT)))
        .addMethod(
            getListRolloutsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.deploy.v1.ListRolloutsRequest,
                    com.google.cloud.deploy.v1.ListRolloutsResponse>(
                    service, METHODID_LIST_ROLLOUTS)))
        .addMethod(
            getGetRolloutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.deploy.v1.GetRolloutRequest,
                    com.google.cloud.deploy.v1.Rollout>(service, METHODID_GET_ROLLOUT)))
        .addMethod(
            getCreateRolloutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.deploy.v1.CreateRolloutRequest,
                    com.google.longrunning.Operation>(service, METHODID_CREATE_ROLLOUT)))
        .addMethod(
            getIgnoreJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.deploy.v1.IgnoreJobRequest,
                    com.google.cloud.deploy.v1.IgnoreJobResponse>(service, METHODID_IGNORE_JOB)))
        .addMethod(
            getRetryJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.deploy.v1.RetryJobRequest,
                    com.google.cloud.deploy.v1.RetryJobResponse>(service, METHODID_RETRY_JOB)))
        .addMethod(
            getListJobRunsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.deploy.v1.ListJobRunsRequest,
                    com.google.cloud.deploy.v1.ListJobRunsResponse>(
                    service, METHODID_LIST_JOB_RUNS)))
        .addMethod(
            getGetJobRunMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.deploy.v1.GetJobRunRequest, com.google.cloud.deploy.v1.JobRun>(
                    service, METHODID_GET_JOB_RUN)))
        .addMethod(
            getTerminateJobRunMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.deploy.v1.TerminateJobRunRequest,
                    com.google.cloud.deploy.v1.TerminateJobRunResponse>(
                    service, METHODID_TERMINATE_JOB_RUN)))
        .addMethod(
            getGetConfigMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.deploy.v1.GetConfigRequest, com.google.cloud.deploy.v1.Config>(
                    service, METHODID_GET_CONFIG)))
        .build();
  }

  private abstract static class CloudDeployBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CloudDeployBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.deploy.v1.CloudDeployProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CloudDeploy");
    }
  }

  private static final class CloudDeployFileDescriptorSupplier
      extends CloudDeployBaseDescriptorSupplier {
    CloudDeployFileDescriptorSupplier() {}
  }

  private static final class CloudDeployMethodDescriptorSupplier
      extends CloudDeployBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CloudDeployMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CloudDeployGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new CloudDeployFileDescriptorSupplier())
                      .addMethod(getListDeliveryPipelinesMethod())
                      .addMethod(getGetDeliveryPipelineMethod())
                      .addMethod(getCreateDeliveryPipelineMethod())
                      .addMethod(getUpdateDeliveryPipelineMethod())
                      .addMethod(getDeleteDeliveryPipelineMethod())
                      .addMethod(getListTargetsMethod())
                      .addMethod(getGetTargetMethod())
                      .addMethod(getCreateTargetMethod())
                      .addMethod(getUpdateTargetMethod())
                      .addMethod(getDeleteTargetMethod())
                      .addMethod(getListReleasesMethod())
                      .addMethod(getGetReleaseMethod())
                      .addMethod(getCreateReleaseMethod())
                      .addMethod(getAbandonReleaseMethod())
                      .addMethod(getApproveRolloutMethod())
                      .addMethod(getAdvanceRolloutMethod())
                      .addMethod(getCancelRolloutMethod())
                      .addMethod(getListRolloutsMethod())
                      .addMethod(getGetRolloutMethod())
                      .addMethod(getCreateRolloutMethod())
                      .addMethod(getIgnoreJobMethod())
                      .addMethod(getRetryJobMethod())
                      .addMethod(getListJobRunsMethod())
                      .addMethod(getGetJobRunMethod())
                      .addMethod(getTerminateJobRunMethod())
                      .addMethod(getGetConfigMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
