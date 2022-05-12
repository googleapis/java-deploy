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
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

/**
 *
 *
 * <pre>
 * Information specifying a GKE Cluster.
 * </pre>
 *
 * Protobuf type {@code google.cloud.deploy.v1.GkeCluster}
 */
public final class GkeCluster extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.deploy.v1.GkeCluster)
    GkeClusterOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GkeCluster.newBuilder() to construct.
  private GkeCluster(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GkeCluster() {
    cluster_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GkeCluster();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private GkeCluster(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              cluster_ = s;
              break;
            }
          case 16:
            {
              internalIp_ = input.readBool();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_GkeCluster_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_GkeCluster_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.deploy.v1.GkeCluster.class,
            com.google.cloud.deploy.v1.GkeCluster.Builder.class);
  }

  public static final int CLUSTER_FIELD_NUMBER = 1;
  private volatile java.lang.Object cluster_;
  /**
   *
   *
   * <pre>
   * Information specifying a GKE Cluster. Format is
   * `projects/{project_id}/locations/{location_id}/clusters/{cluster_id}.
   * </pre>
   *
   * <code>string cluster = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The cluster.
   */
  @java.lang.Override
  public java.lang.String getCluster() {
    java.lang.Object ref = cluster_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cluster_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Information specifying a GKE Cluster. Format is
   * `projects/{project_id}/locations/{location_id}/clusters/{cluster_id}.
   * </pre>
   *
   * <code>string cluster = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for cluster.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getClusterBytes() {
    java.lang.Object ref = cluster_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      cluster_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INTERNAL_IP_FIELD_NUMBER = 2;
  private boolean internalIp_;
  /**
   *
   *
   * <pre>
   * Optional. If true, `cluster` is accessed using the private IP address of the control
   * plane endpoint. Otherwise, the default IP address of the control plane
   * endpoint is used. The default IP address is the private IP address for
   * clusters with private control-plane endpoints and the public IP address
   * otherwise.
   * Only specify this option when `cluster` is a [private GKE
   * cluster](https://cloud.google.com/kubernetes-engine/docs/concepts/private-cluster-concept).
   * </pre>
   *
   * <code>bool internal_ip = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The internalIp.
   */
  @java.lang.Override
  public boolean getInternalIp() {
    return internalIp_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cluster_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, cluster_);
    }
    if (internalIp_ != false) {
      output.writeBool(2, internalIp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cluster_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, cluster_);
    }
    if (internalIp_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, internalIp_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.deploy.v1.GkeCluster)) {
      return super.equals(obj);
    }
    com.google.cloud.deploy.v1.GkeCluster other = (com.google.cloud.deploy.v1.GkeCluster) obj;

    if (!getCluster().equals(other.getCluster())) return false;
    if (getInternalIp() != other.getInternalIp()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CLUSTER_FIELD_NUMBER;
    hash = (53 * hash) + getCluster().hashCode();
    hash = (37 * hash) + INTERNAL_IP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getInternalIp());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.deploy.v1.GkeCluster parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.GkeCluster parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.GkeCluster parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.GkeCluster parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.GkeCluster parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.GkeCluster parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.GkeCluster parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.GkeCluster parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.GkeCluster parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.GkeCluster parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.GkeCluster parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.GkeCluster parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.deploy.v1.GkeCluster prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Information specifying a GKE Cluster.
   * </pre>
   *
   * Protobuf type {@code google.cloud.deploy.v1.GkeCluster}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.deploy.v1.GkeCluster)
      com.google.cloud.deploy.v1.GkeClusterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_GkeCluster_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_GkeCluster_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.deploy.v1.GkeCluster.class,
              com.google.cloud.deploy.v1.GkeCluster.Builder.class);
    }

    // Construct using com.google.cloud.deploy.v1.GkeCluster.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      cluster_ = "";

      internalIp_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_GkeCluster_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.GkeCluster getDefaultInstanceForType() {
      return com.google.cloud.deploy.v1.GkeCluster.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.GkeCluster build() {
      com.google.cloud.deploy.v1.GkeCluster result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.GkeCluster buildPartial() {
      com.google.cloud.deploy.v1.GkeCluster result =
          new com.google.cloud.deploy.v1.GkeCluster(this);
      result.cluster_ = cluster_;
      result.internalIp_ = internalIp_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.deploy.v1.GkeCluster) {
        return mergeFrom((com.google.cloud.deploy.v1.GkeCluster) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.deploy.v1.GkeCluster other) {
      if (other == com.google.cloud.deploy.v1.GkeCluster.getDefaultInstance()) return this;
      if (!other.getCluster().isEmpty()) {
        cluster_ = other.cluster_;
        onChanged();
      }
      if (other.getInternalIp() != false) {
        setInternalIp(other.getInternalIp());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.deploy.v1.GkeCluster parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.deploy.v1.GkeCluster) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object cluster_ = "";
    /**
     *
     *
     * <pre>
     * Information specifying a GKE Cluster. Format is
     * `projects/{project_id}/locations/{location_id}/clusters/{cluster_id}.
     * </pre>
     *
     * <code>string cluster = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The cluster.
     */
    public java.lang.String getCluster() {
      java.lang.Object ref = cluster_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cluster_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Information specifying a GKE Cluster. Format is
     * `projects/{project_id}/locations/{location_id}/clusters/{cluster_id}.
     * </pre>
     *
     * <code>string cluster = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The bytes for cluster.
     */
    public com.google.protobuf.ByteString getClusterBytes() {
      java.lang.Object ref = cluster_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        cluster_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Information specifying a GKE Cluster. Format is
     * `projects/{project_id}/locations/{location_id}/clusters/{cluster_id}.
     * </pre>
     *
     * <code>string cluster = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The cluster to set.
     * @return This builder for chaining.
     */
    public Builder setCluster(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      cluster_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Information specifying a GKE Cluster. Format is
     * `projects/{project_id}/locations/{location_id}/clusters/{cluster_id}.
     * </pre>
     *
     * <code>string cluster = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCluster() {

      cluster_ = getDefaultInstance().getCluster();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Information specifying a GKE Cluster. Format is
     * `projects/{project_id}/locations/{location_id}/clusters/{cluster_id}.
     * </pre>
     *
     * <code>string cluster = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The bytes for cluster to set.
     * @return This builder for chaining.
     */
    public Builder setClusterBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      cluster_ = value;
      onChanged();
      return this;
    }

    private boolean internalIp_;
    /**
     *
     *
     * <pre>
     * Optional. If true, `cluster` is accessed using the private IP address of the control
     * plane endpoint. Otherwise, the default IP address of the control plane
     * endpoint is used. The default IP address is the private IP address for
     * clusters with private control-plane endpoints and the public IP address
     * otherwise.
     * Only specify this option when `cluster` is a [private GKE
     * cluster](https://cloud.google.com/kubernetes-engine/docs/concepts/private-cluster-concept).
     * </pre>
     *
     * <code>bool internal_ip = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The internalIp.
     */
    @java.lang.Override
    public boolean getInternalIp() {
      return internalIp_;
    }
    /**
     *
     *
     * <pre>
     * Optional. If true, `cluster` is accessed using the private IP address of the control
     * plane endpoint. Otherwise, the default IP address of the control plane
     * endpoint is used. The default IP address is the private IP address for
     * clusters with private control-plane endpoints and the public IP address
     * otherwise.
     * Only specify this option when `cluster` is a [private GKE
     * cluster](https://cloud.google.com/kubernetes-engine/docs/concepts/private-cluster-concept).
     * </pre>
     *
     * <code>bool internal_ip = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The internalIp to set.
     * @return This builder for chaining.
     */
    public Builder setInternalIp(boolean value) {

      internalIp_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. If true, `cluster` is accessed using the private IP address of the control
     * plane endpoint. Otherwise, the default IP address of the control plane
     * endpoint is used. The default IP address is the private IP address for
     * clusters with private control-plane endpoints and the public IP address
     * otherwise.
     * Only specify this option when `cluster` is a [private GKE
     * cluster](https://cloud.google.com/kubernetes-engine/docs/concepts/private-cluster-concept).
     * </pre>
     *
     * <code>bool internal_ip = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInternalIp() {

      internalIp_ = false;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.deploy.v1.GkeCluster)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.deploy.v1.GkeCluster)
  private static final com.google.cloud.deploy.v1.GkeCluster DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.deploy.v1.GkeCluster();
  }

  public static com.google.cloud.deploy.v1.GkeCluster getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GkeCluster> PARSER =
      new com.google.protobuf.AbstractParser<GkeCluster>() {
        @java.lang.Override
        public GkeCluster parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new GkeCluster(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<GkeCluster> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GkeCluster> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.deploy.v1.GkeCluster getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
