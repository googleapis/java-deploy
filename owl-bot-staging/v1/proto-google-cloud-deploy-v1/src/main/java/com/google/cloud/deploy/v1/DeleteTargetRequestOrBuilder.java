// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

public interface DeleteTargetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.DeleteTargetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the `Target` to delete. Format should be
   * projects/{project_id}/locations/{location_name}/targets/{target_name}.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the `Target` to delete. Format should be
   * projects/{project_id}/locations/{location_name}/targets/{target_name}.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. A request ID to identify requests. Specify a unique request ID
   * so that if you must retry your request, the server will know to ignore
   * the request if it has already been completed. The server will guarantee
   * that for at least 60 minutes after the first request.
   * For example, consider a situation where you make an initial request and the
   * request times out. If you make the request again with the same request ID,
   * the server can check if original operation with the same request ID was
   * received, and if so, will ignore the second request. This prevents clients
   * from accidentally creating duplicate commitments.
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * Optional. A request ID to identify requests. Specify a unique request ID
   * so that if you must retry your request, the server will know to ignore
   * the request if it has already been completed. The server will guarantee
   * that for at least 60 minutes after the first request.
   * For example, consider a situation where you make an initial request and the
   * request times out. If you make the request again with the same request ID,
   * the server can check if original operation with the same request ID was
   * received, and if so, will ignore the second request. This prevents clients
   * from accidentally creating duplicate commitments.
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();

  /**
   * <pre>
   * Optional. If set to true, then deleting an already deleted or non-existing
   * DeliveryPipeline will succeed.
   * </pre>
   *
   * <code>bool allow_missing = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The allowMissing.
   */
  boolean getAllowMissing();

  /**
   * <pre>
   * Optional. If set, validate the request and preview the review, but do not
   * actually post it.
   * </pre>
   *
   * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();

  /**
   * <pre>
   * Optional. This checksum is computed by the server based on the value of
   * other fields, and may be sent on update and delete requests to ensure the
   * client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   * <pre>
   * Optional. This checksum is computed by the server based on the value of
   * other fields, and may be sent on update and delete requests to ensure the
   * client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString
      getEtagBytes();
}