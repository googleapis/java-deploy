// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

/**
 * <pre>
 * CloudRunConfig contains the Cloud Run runtime configuration.
 * </pre>
 *
 * Protobuf type {@code google.cloud.deploy.v1.CloudRunConfig}
 */
public final class CloudRunConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.deploy.v1.CloudRunConfig)
    CloudRunConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CloudRunConfig.newBuilder() to construct.
  private CloudRunConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CloudRunConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CloudRunConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.deploy.v1.CloudDeployProto.internal_static_google_cloud_deploy_v1_CloudRunConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.deploy.v1.CloudDeployProto.internal_static_google_cloud_deploy_v1_CloudRunConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.deploy.v1.CloudRunConfig.class, com.google.cloud.deploy.v1.CloudRunConfig.Builder.class);
  }

  public static final int AUTOMATIC_TRAFFIC_CONTROL_FIELD_NUMBER = 1;
  private boolean automaticTrafficControl_ = false;
  /**
   * <pre>
   * Whether Cloud Deploy should update the traffic stanza in a Cloud Run
   * Service on the user's behalf to facilitate traffic splitting. This is
   * required to be true for CanaryDeployments, but optional for
   * CustomCanaryDeployments.
   * </pre>
   *
   * <code>bool automatic_traffic_control = 1;</code>
   * @return The automaticTrafficControl.
   */
  @java.lang.Override
  public boolean getAutomaticTrafficControl() {
    return automaticTrafficControl_;
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
    if (automaticTrafficControl_ != false) {
      output.writeBool(1, automaticTrafficControl_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (automaticTrafficControl_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, automaticTrafficControl_);
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
    if (!(obj instanceof com.google.cloud.deploy.v1.CloudRunConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.deploy.v1.CloudRunConfig other = (com.google.cloud.deploy.v1.CloudRunConfig) obj;

    if (getAutomaticTrafficControl()
        != other.getAutomaticTrafficControl()) return false;
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
    hash = (37 * hash) + AUTOMATIC_TRAFFIC_CONTROL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAutomaticTrafficControl());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.deploy.v1.CloudRunConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.deploy.v1.CloudRunConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.deploy.v1.CloudRunConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.deploy.v1.CloudRunConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.deploy.v1.CloudRunConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.deploy.v1.CloudRunConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.deploy.v1.CloudRunConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.deploy.v1.CloudRunConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.deploy.v1.CloudRunConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.deploy.v1.CloudRunConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.deploy.v1.CloudRunConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.deploy.v1.CloudRunConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.deploy.v1.CloudRunConfig prototype) {
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
   * CloudRunConfig contains the Cloud Run runtime configuration.
   * </pre>
   *
   * Protobuf type {@code google.cloud.deploy.v1.CloudRunConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.deploy.v1.CloudRunConfig)
      com.google.cloud.deploy.v1.CloudRunConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.deploy.v1.CloudDeployProto.internal_static_google_cloud_deploy_v1_CloudRunConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.deploy.v1.CloudDeployProto.internal_static_google_cloud_deploy_v1_CloudRunConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.deploy.v1.CloudRunConfig.class, com.google.cloud.deploy.v1.CloudRunConfig.Builder.class);
    }

    // Construct using com.google.cloud.deploy.v1.CloudRunConfig.newBuilder()
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
      automaticTrafficControl_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.deploy.v1.CloudDeployProto.internal_static_google_cloud_deploy_v1_CloudRunConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.CloudRunConfig getDefaultInstanceForType() {
      return com.google.cloud.deploy.v1.CloudRunConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.CloudRunConfig build() {
      com.google.cloud.deploy.v1.CloudRunConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.CloudRunConfig buildPartial() {
      com.google.cloud.deploy.v1.CloudRunConfig result = new com.google.cloud.deploy.v1.CloudRunConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.deploy.v1.CloudRunConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.automaticTrafficControl_ = automaticTrafficControl_;
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
      if (other instanceof com.google.cloud.deploy.v1.CloudRunConfig) {
        return mergeFrom((com.google.cloud.deploy.v1.CloudRunConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.deploy.v1.CloudRunConfig other) {
      if (other == com.google.cloud.deploy.v1.CloudRunConfig.getDefaultInstance()) return this;
      if (other.getAutomaticTrafficControl() != false) {
        setAutomaticTrafficControl(other.getAutomaticTrafficControl());
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
            case 8: {
              automaticTrafficControl_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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
    private int bitField0_;

    private boolean automaticTrafficControl_ ;
    /**
     * <pre>
     * Whether Cloud Deploy should update the traffic stanza in a Cloud Run
     * Service on the user's behalf to facilitate traffic splitting. This is
     * required to be true for CanaryDeployments, but optional for
     * CustomCanaryDeployments.
     * </pre>
     *
     * <code>bool automatic_traffic_control = 1;</code>
     * @return The automaticTrafficControl.
     */
    @java.lang.Override
    public boolean getAutomaticTrafficControl() {
      return automaticTrafficControl_;
    }
    /**
     * <pre>
     * Whether Cloud Deploy should update the traffic stanza in a Cloud Run
     * Service on the user's behalf to facilitate traffic splitting. This is
     * required to be true for CanaryDeployments, but optional for
     * CustomCanaryDeployments.
     * </pre>
     *
     * <code>bool automatic_traffic_control = 1;</code>
     * @param value The automaticTrafficControl to set.
     * @return This builder for chaining.
     */
    public Builder setAutomaticTrafficControl(boolean value) {
      
      automaticTrafficControl_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether Cloud Deploy should update the traffic stanza in a Cloud Run
     * Service on the user's behalf to facilitate traffic splitting. This is
     * required to be true for CanaryDeployments, but optional for
     * CustomCanaryDeployments.
     * </pre>
     *
     * <code>bool automatic_traffic_control = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAutomaticTrafficControl() {
      bitField0_ = (bitField0_ & ~0x00000001);
      automaticTrafficControl_ = false;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.deploy.v1.CloudRunConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.deploy.v1.CloudRunConfig)
  private static final com.google.cloud.deploy.v1.CloudRunConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.deploy.v1.CloudRunConfig();
  }

  public static com.google.cloud.deploy.v1.CloudRunConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CloudRunConfig>
      PARSER = new com.google.protobuf.AbstractParser<CloudRunConfig>() {
    @java.lang.Override
    public CloudRunConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<CloudRunConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CloudRunConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.deploy.v1.CloudRunConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
