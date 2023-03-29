// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

/**
 * <pre>
 * RuntimeConfig contains the runtime specific configurations for a deployment
 * strategy.
 * </pre>
 *
 * Protobuf type {@code google.cloud.deploy.v1.RuntimeConfig}
 */
public final class RuntimeConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.deploy.v1.RuntimeConfig)
    RuntimeConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RuntimeConfig.newBuilder() to construct.
  private RuntimeConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RuntimeConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RuntimeConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.deploy.v1.CloudDeployProto.internal_static_google_cloud_deploy_v1_RuntimeConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.deploy.v1.CloudDeployProto.internal_static_google_cloud_deploy_v1_RuntimeConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.deploy.v1.RuntimeConfig.class, com.google.cloud.deploy.v1.RuntimeConfig.Builder.class);
  }

  private int runtimeConfigCase_ = 0;
  private java.lang.Object runtimeConfig_;
  public enum RuntimeConfigCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    KUBERNETES(1),
    CLOUD_RUN(2),
    RUNTIMECONFIG_NOT_SET(0);
    private final int value;
    private RuntimeConfigCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static RuntimeConfigCase valueOf(int value) {
      return forNumber(value);
    }

    public static RuntimeConfigCase forNumber(int value) {
      switch (value) {
        case 1: return KUBERNETES;
        case 2: return CLOUD_RUN;
        case 0: return RUNTIMECONFIG_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public RuntimeConfigCase
  getRuntimeConfigCase() {
    return RuntimeConfigCase.forNumber(
        runtimeConfigCase_);
  }

  public static final int KUBERNETES_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Kubernetes runtime configuration.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.KubernetesConfig kubernetes = 1;</code>
   * @return Whether the kubernetes field is set.
   */
  @java.lang.Override
  public boolean hasKubernetes() {
    return runtimeConfigCase_ == 1;
  }
  /**
   * <pre>
   * Kubernetes runtime configuration.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.KubernetesConfig kubernetes = 1;</code>
   * @return The kubernetes.
   */
  @java.lang.Override
  public com.google.cloud.deploy.v1.KubernetesConfig getKubernetes() {
    if (runtimeConfigCase_ == 1) {
       return (com.google.cloud.deploy.v1.KubernetesConfig) runtimeConfig_;
    }
    return com.google.cloud.deploy.v1.KubernetesConfig.getDefaultInstance();
  }
  /**
   * <pre>
   * Kubernetes runtime configuration.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.KubernetesConfig kubernetes = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.deploy.v1.KubernetesConfigOrBuilder getKubernetesOrBuilder() {
    if (runtimeConfigCase_ == 1) {
       return (com.google.cloud.deploy.v1.KubernetesConfig) runtimeConfig_;
    }
    return com.google.cloud.deploy.v1.KubernetesConfig.getDefaultInstance();
  }

  public static final int CLOUD_RUN_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Cloud Run runtime configuration.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.CloudRunConfig cloud_run = 2;</code>
   * @return Whether the cloudRun field is set.
   */
  @java.lang.Override
  public boolean hasCloudRun() {
    return runtimeConfigCase_ == 2;
  }
  /**
   * <pre>
   * Cloud Run runtime configuration.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.CloudRunConfig cloud_run = 2;</code>
   * @return The cloudRun.
   */
  @java.lang.Override
  public com.google.cloud.deploy.v1.CloudRunConfig getCloudRun() {
    if (runtimeConfigCase_ == 2) {
       return (com.google.cloud.deploy.v1.CloudRunConfig) runtimeConfig_;
    }
    return com.google.cloud.deploy.v1.CloudRunConfig.getDefaultInstance();
  }
  /**
   * <pre>
   * Cloud Run runtime configuration.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.CloudRunConfig cloud_run = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.deploy.v1.CloudRunConfigOrBuilder getCloudRunOrBuilder() {
    if (runtimeConfigCase_ == 2) {
       return (com.google.cloud.deploy.v1.CloudRunConfig) runtimeConfig_;
    }
    return com.google.cloud.deploy.v1.CloudRunConfig.getDefaultInstance();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (runtimeConfigCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.deploy.v1.KubernetesConfig) runtimeConfig_);
    }
    if (runtimeConfigCase_ == 2) {
      output.writeMessage(2, (com.google.cloud.deploy.v1.CloudRunConfig) runtimeConfig_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (runtimeConfigCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.google.cloud.deploy.v1.KubernetesConfig) runtimeConfig_);
    }
    if (runtimeConfigCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.google.cloud.deploy.v1.CloudRunConfig) runtimeConfig_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.deploy.v1.RuntimeConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.deploy.v1.RuntimeConfig other = (com.google.cloud.deploy.v1.RuntimeConfig) obj;

    if (!getRuntimeConfigCase().equals(other.getRuntimeConfigCase())) return false;
    switch (runtimeConfigCase_) {
      case 1:
        if (!getKubernetes()
            .equals(other.getKubernetes())) return false;
        break;
      case 2:
        if (!getCloudRun()
            .equals(other.getCloudRun())) return false;
        break;
      case 0:
      default:
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (runtimeConfigCase_) {
      case 1:
        hash = (37 * hash) + KUBERNETES_FIELD_NUMBER;
        hash = (53 * hash) + getKubernetes().hashCode();
        break;
      case 2:
        hash = (37 * hash) + CLOUD_RUN_FIELD_NUMBER;
        hash = (53 * hash) + getCloudRun().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.deploy.v1.RuntimeConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.deploy.v1.RuntimeConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.deploy.v1.RuntimeConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.deploy.v1.RuntimeConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.deploy.v1.RuntimeConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.deploy.v1.RuntimeConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.deploy.v1.RuntimeConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.deploy.v1.RuntimeConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.deploy.v1.RuntimeConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.deploy.v1.RuntimeConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.deploy.v1.RuntimeConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.deploy.v1.RuntimeConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.deploy.v1.RuntimeConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * RuntimeConfig contains the runtime specific configurations for a deployment
   * strategy.
   * </pre>
   *
   * Protobuf type {@code google.cloud.deploy.v1.RuntimeConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.deploy.v1.RuntimeConfig)
      com.google.cloud.deploy.v1.RuntimeConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.deploy.v1.CloudDeployProto.internal_static_google_cloud_deploy_v1_RuntimeConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.deploy.v1.CloudDeployProto.internal_static_google_cloud_deploy_v1_RuntimeConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.deploy.v1.RuntimeConfig.class, com.google.cloud.deploy.v1.RuntimeConfig.Builder.class);
    }

    // Construct using com.google.cloud.deploy.v1.RuntimeConfig.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (kubernetesBuilder_ != null) {
        kubernetesBuilder_.clear();
      }
      if (cloudRunBuilder_ != null) {
        cloudRunBuilder_.clear();
      }
      runtimeConfigCase_ = 0;
      runtimeConfig_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.deploy.v1.CloudDeployProto.internal_static_google_cloud_deploy_v1_RuntimeConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.RuntimeConfig getDefaultInstanceForType() {
      return com.google.cloud.deploy.v1.RuntimeConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.RuntimeConfig build() {
      com.google.cloud.deploy.v1.RuntimeConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.RuntimeConfig buildPartial() {
      com.google.cloud.deploy.v1.RuntimeConfig result = new com.google.cloud.deploy.v1.RuntimeConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.deploy.v1.RuntimeConfig result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.cloud.deploy.v1.RuntimeConfig result) {
      result.runtimeConfigCase_ = runtimeConfigCase_;
      result.runtimeConfig_ = this.runtimeConfig_;
      if (runtimeConfigCase_ == 1 &&
          kubernetesBuilder_ != null) {
        result.runtimeConfig_ = kubernetesBuilder_.build();
      }
      if (runtimeConfigCase_ == 2 &&
          cloudRunBuilder_ != null) {
        result.runtimeConfig_ = cloudRunBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.deploy.v1.RuntimeConfig) {
        return mergeFrom((com.google.cloud.deploy.v1.RuntimeConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.deploy.v1.RuntimeConfig other) {
      if (other == com.google.cloud.deploy.v1.RuntimeConfig.getDefaultInstance()) return this;
      switch (other.getRuntimeConfigCase()) {
        case KUBERNETES: {
          mergeKubernetes(other.getKubernetes());
          break;
        }
        case CLOUD_RUN: {
          mergeCloudRun(other.getCloudRun());
          break;
        }
        case RUNTIMECONFIG_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getKubernetesFieldBuilder().getBuilder(),
                  extensionRegistry);
              runtimeConfigCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getCloudRunFieldBuilder().getBuilder(),
                  extensionRegistry);
              runtimeConfigCase_ = 2;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int runtimeConfigCase_ = 0;
    private java.lang.Object runtimeConfig_;
    public RuntimeConfigCase
        getRuntimeConfigCase() {
      return RuntimeConfigCase.forNumber(
          runtimeConfigCase_);
    }

    public Builder clearRuntimeConfig() {
      runtimeConfigCase_ = 0;
      runtimeConfig_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.deploy.v1.KubernetesConfig, com.google.cloud.deploy.v1.KubernetesConfig.Builder, com.google.cloud.deploy.v1.KubernetesConfigOrBuilder> kubernetesBuilder_;
    /**
     * <pre>
     * Kubernetes runtime configuration.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.KubernetesConfig kubernetes = 1;</code>
     * @return Whether the kubernetes field is set.
     */
    @java.lang.Override
    public boolean hasKubernetes() {
      return runtimeConfigCase_ == 1;
    }
    /**
     * <pre>
     * Kubernetes runtime configuration.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.KubernetesConfig kubernetes = 1;</code>
     * @return The kubernetes.
     */
    @java.lang.Override
    public com.google.cloud.deploy.v1.KubernetesConfig getKubernetes() {
      if (kubernetesBuilder_ == null) {
        if (runtimeConfigCase_ == 1) {
          return (com.google.cloud.deploy.v1.KubernetesConfig) runtimeConfig_;
        }
        return com.google.cloud.deploy.v1.KubernetesConfig.getDefaultInstance();
      } else {
        if (runtimeConfigCase_ == 1) {
          return kubernetesBuilder_.getMessage();
        }
        return com.google.cloud.deploy.v1.KubernetesConfig.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Kubernetes runtime configuration.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.KubernetesConfig kubernetes = 1;</code>
     */
    public Builder setKubernetes(com.google.cloud.deploy.v1.KubernetesConfig value) {
      if (kubernetesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        runtimeConfig_ = value;
        onChanged();
      } else {
        kubernetesBuilder_.setMessage(value);
      }
      runtimeConfigCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Kubernetes runtime configuration.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.KubernetesConfig kubernetes = 1;</code>
     */
    public Builder setKubernetes(
        com.google.cloud.deploy.v1.KubernetesConfig.Builder builderForValue) {
      if (kubernetesBuilder_ == null) {
        runtimeConfig_ = builderForValue.build();
        onChanged();
      } else {
        kubernetesBuilder_.setMessage(builderForValue.build());
      }
      runtimeConfigCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Kubernetes runtime configuration.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.KubernetesConfig kubernetes = 1;</code>
     */
    public Builder mergeKubernetes(com.google.cloud.deploy.v1.KubernetesConfig value) {
      if (kubernetesBuilder_ == null) {
        if (runtimeConfigCase_ == 1 &&
            runtimeConfig_ != com.google.cloud.deploy.v1.KubernetesConfig.getDefaultInstance()) {
          runtimeConfig_ = com.google.cloud.deploy.v1.KubernetesConfig.newBuilder((com.google.cloud.deploy.v1.KubernetesConfig) runtimeConfig_)
              .mergeFrom(value).buildPartial();
        } else {
          runtimeConfig_ = value;
        }
        onChanged();
      } else {
        if (runtimeConfigCase_ == 1) {
          kubernetesBuilder_.mergeFrom(value);
        } else {
          kubernetesBuilder_.setMessage(value);
        }
      }
      runtimeConfigCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Kubernetes runtime configuration.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.KubernetesConfig kubernetes = 1;</code>
     */
    public Builder clearKubernetes() {
      if (kubernetesBuilder_ == null) {
        if (runtimeConfigCase_ == 1) {
          runtimeConfigCase_ = 0;
          runtimeConfig_ = null;
          onChanged();
        }
      } else {
        if (runtimeConfigCase_ == 1) {
          runtimeConfigCase_ = 0;
          runtimeConfig_ = null;
        }
        kubernetesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Kubernetes runtime configuration.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.KubernetesConfig kubernetes = 1;</code>
     */
    public com.google.cloud.deploy.v1.KubernetesConfig.Builder getKubernetesBuilder() {
      return getKubernetesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Kubernetes runtime configuration.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.KubernetesConfig kubernetes = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.deploy.v1.KubernetesConfigOrBuilder getKubernetesOrBuilder() {
      if ((runtimeConfigCase_ == 1) && (kubernetesBuilder_ != null)) {
        return kubernetesBuilder_.getMessageOrBuilder();
      } else {
        if (runtimeConfigCase_ == 1) {
          return (com.google.cloud.deploy.v1.KubernetesConfig) runtimeConfig_;
        }
        return com.google.cloud.deploy.v1.KubernetesConfig.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Kubernetes runtime configuration.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.KubernetesConfig kubernetes = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.deploy.v1.KubernetesConfig, com.google.cloud.deploy.v1.KubernetesConfig.Builder, com.google.cloud.deploy.v1.KubernetesConfigOrBuilder> 
        getKubernetesFieldBuilder() {
      if (kubernetesBuilder_ == null) {
        if (!(runtimeConfigCase_ == 1)) {
          runtimeConfig_ = com.google.cloud.deploy.v1.KubernetesConfig.getDefaultInstance();
        }
        kubernetesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.deploy.v1.KubernetesConfig, com.google.cloud.deploy.v1.KubernetesConfig.Builder, com.google.cloud.deploy.v1.KubernetesConfigOrBuilder>(
                (com.google.cloud.deploy.v1.KubernetesConfig) runtimeConfig_,
                getParentForChildren(),
                isClean());
        runtimeConfig_ = null;
      }
      runtimeConfigCase_ = 1;
      onChanged();
      return kubernetesBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.deploy.v1.CloudRunConfig, com.google.cloud.deploy.v1.CloudRunConfig.Builder, com.google.cloud.deploy.v1.CloudRunConfigOrBuilder> cloudRunBuilder_;
    /**
     * <pre>
     * Cloud Run runtime configuration.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.CloudRunConfig cloud_run = 2;</code>
     * @return Whether the cloudRun field is set.
     */
    @java.lang.Override
    public boolean hasCloudRun() {
      return runtimeConfigCase_ == 2;
    }
    /**
     * <pre>
     * Cloud Run runtime configuration.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.CloudRunConfig cloud_run = 2;</code>
     * @return The cloudRun.
     */
    @java.lang.Override
    public com.google.cloud.deploy.v1.CloudRunConfig getCloudRun() {
      if (cloudRunBuilder_ == null) {
        if (runtimeConfigCase_ == 2) {
          return (com.google.cloud.deploy.v1.CloudRunConfig) runtimeConfig_;
        }
        return com.google.cloud.deploy.v1.CloudRunConfig.getDefaultInstance();
      } else {
        if (runtimeConfigCase_ == 2) {
          return cloudRunBuilder_.getMessage();
        }
        return com.google.cloud.deploy.v1.CloudRunConfig.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Cloud Run runtime configuration.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.CloudRunConfig cloud_run = 2;</code>
     */
    public Builder setCloudRun(com.google.cloud.deploy.v1.CloudRunConfig value) {
      if (cloudRunBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        runtimeConfig_ = value;
        onChanged();
      } else {
        cloudRunBuilder_.setMessage(value);
      }
      runtimeConfigCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Cloud Run runtime configuration.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.CloudRunConfig cloud_run = 2;</code>
     */
    public Builder setCloudRun(
        com.google.cloud.deploy.v1.CloudRunConfig.Builder builderForValue) {
      if (cloudRunBuilder_ == null) {
        runtimeConfig_ = builderForValue.build();
        onChanged();
      } else {
        cloudRunBuilder_.setMessage(builderForValue.build());
      }
      runtimeConfigCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Cloud Run runtime configuration.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.CloudRunConfig cloud_run = 2;</code>
     */
    public Builder mergeCloudRun(com.google.cloud.deploy.v1.CloudRunConfig value) {
      if (cloudRunBuilder_ == null) {
        if (runtimeConfigCase_ == 2 &&
            runtimeConfig_ != com.google.cloud.deploy.v1.CloudRunConfig.getDefaultInstance()) {
          runtimeConfig_ = com.google.cloud.deploy.v1.CloudRunConfig.newBuilder((com.google.cloud.deploy.v1.CloudRunConfig) runtimeConfig_)
              .mergeFrom(value).buildPartial();
        } else {
          runtimeConfig_ = value;
        }
        onChanged();
      } else {
        if (runtimeConfigCase_ == 2) {
          cloudRunBuilder_.mergeFrom(value);
        } else {
          cloudRunBuilder_.setMessage(value);
        }
      }
      runtimeConfigCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Cloud Run runtime configuration.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.CloudRunConfig cloud_run = 2;</code>
     */
    public Builder clearCloudRun() {
      if (cloudRunBuilder_ == null) {
        if (runtimeConfigCase_ == 2) {
          runtimeConfigCase_ = 0;
          runtimeConfig_ = null;
          onChanged();
        }
      } else {
        if (runtimeConfigCase_ == 2) {
          runtimeConfigCase_ = 0;
          runtimeConfig_ = null;
        }
        cloudRunBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Cloud Run runtime configuration.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.CloudRunConfig cloud_run = 2;</code>
     */
    public com.google.cloud.deploy.v1.CloudRunConfig.Builder getCloudRunBuilder() {
      return getCloudRunFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Cloud Run runtime configuration.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.CloudRunConfig cloud_run = 2;</code>
     */
    @java.lang.Override
    public com.google.cloud.deploy.v1.CloudRunConfigOrBuilder getCloudRunOrBuilder() {
      if ((runtimeConfigCase_ == 2) && (cloudRunBuilder_ != null)) {
        return cloudRunBuilder_.getMessageOrBuilder();
      } else {
        if (runtimeConfigCase_ == 2) {
          return (com.google.cloud.deploy.v1.CloudRunConfig) runtimeConfig_;
        }
        return com.google.cloud.deploy.v1.CloudRunConfig.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Cloud Run runtime configuration.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.CloudRunConfig cloud_run = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.deploy.v1.CloudRunConfig, com.google.cloud.deploy.v1.CloudRunConfig.Builder, com.google.cloud.deploy.v1.CloudRunConfigOrBuilder> 
        getCloudRunFieldBuilder() {
      if (cloudRunBuilder_ == null) {
        if (!(runtimeConfigCase_ == 2)) {
          runtimeConfig_ = com.google.cloud.deploy.v1.CloudRunConfig.getDefaultInstance();
        }
        cloudRunBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.deploy.v1.CloudRunConfig, com.google.cloud.deploy.v1.CloudRunConfig.Builder, com.google.cloud.deploy.v1.CloudRunConfigOrBuilder>(
                (com.google.cloud.deploy.v1.CloudRunConfig) runtimeConfig_,
                getParentForChildren(),
                isClean());
        runtimeConfig_ = null;
      }
      runtimeConfigCase_ = 2;
      onChanged();
      return cloudRunBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.deploy.v1.RuntimeConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.deploy.v1.RuntimeConfig)
  private static final com.google.cloud.deploy.v1.RuntimeConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.deploy.v1.RuntimeConfig();
  }

  public static com.google.cloud.deploy.v1.RuntimeConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RuntimeConfig>
      PARSER = new com.google.protobuf.AbstractParser<RuntimeConfig>() {
    @java.lang.Override
    public RuntimeConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<RuntimeConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RuntimeConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.deploy.v1.RuntimeConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
