// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

/**
 * <pre>
 * CanaryDeployment represents the canary deployment configuration
 * </pre>
 *
 * Protobuf type {@code google.cloud.deploy.v1.CanaryDeployment}
 */
public final class CanaryDeployment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.deploy.v1.CanaryDeployment)
    CanaryDeploymentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CanaryDeployment.newBuilder() to construct.
  private CanaryDeployment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CanaryDeployment() {
    percentages_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CanaryDeployment();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.deploy.v1.CloudDeployProto.internal_static_google_cloud_deploy_v1_CanaryDeployment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.deploy.v1.CloudDeployProto.internal_static_google_cloud_deploy_v1_CanaryDeployment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.deploy.v1.CanaryDeployment.class, com.google.cloud.deploy.v1.CanaryDeployment.Builder.class);
  }

  public static final int PERCENTAGES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.IntList percentages_;
  /**
   * <pre>
   * Required. The percentage based deployments that will occur as a part of a
   * `Rollout`. List is expected in ascending order and each integer n is
   * 0 &lt;= n &lt; 100.
   * </pre>
   *
   * <code>repeated int32 percentages = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the percentages.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getPercentagesList() {
    return percentages_;
  }
  /**
   * <pre>
   * Required. The percentage based deployments that will occur as a part of a
   * `Rollout`. List is expected in ascending order and each integer n is
   * 0 &lt;= n &lt; 100.
   * </pre>
   *
   * <code>repeated int32 percentages = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of percentages.
   */
  public int getPercentagesCount() {
    return percentages_.size();
  }
  /**
   * <pre>
   * Required. The percentage based deployments that will occur as a part of a
   * `Rollout`. List is expected in ascending order and each integer n is
   * 0 &lt;= n &lt; 100.
   * </pre>
   *
   * <code>repeated int32 percentages = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The percentages at the given index.
   */
  public int getPercentages(int index) {
    return percentages_.getInt(index);
  }
  private int percentagesMemoizedSerializedSize = -1;

  public static final int VERIFY_FIELD_NUMBER = 2;
  private boolean verify_ = false;
  /**
   * <pre>
   * Whether to run verify tests after each percentage deployment.
   * </pre>
   *
   * <code>bool verify = 2;</code>
   * @return The verify.
   */
  @java.lang.Override
  public boolean getVerify() {
    return verify_;
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
    getSerializedSize();
    if (getPercentagesList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(percentagesMemoizedSerializedSize);
    }
    for (int i = 0; i < percentages_.size(); i++) {
      output.writeInt32NoTag(percentages_.getInt(i));
    }
    if (verify_ != false) {
      output.writeBool(2, verify_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < percentages_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(percentages_.getInt(i));
      }
      size += dataSize;
      if (!getPercentagesList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      percentagesMemoizedSerializedSize = dataSize;
    }
    if (verify_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, verify_);
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
    if (!(obj instanceof com.google.cloud.deploy.v1.CanaryDeployment)) {
      return super.equals(obj);
    }
    com.google.cloud.deploy.v1.CanaryDeployment other = (com.google.cloud.deploy.v1.CanaryDeployment) obj;

    if (!getPercentagesList()
        .equals(other.getPercentagesList())) return false;
    if (getVerify()
        != other.getVerify()) return false;
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
    if (getPercentagesCount() > 0) {
      hash = (37 * hash) + PERCENTAGES_FIELD_NUMBER;
      hash = (53 * hash) + getPercentagesList().hashCode();
    }
    hash = (37 * hash) + VERIFY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getVerify());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.deploy.v1.CanaryDeployment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.deploy.v1.CanaryDeployment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.deploy.v1.CanaryDeployment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.deploy.v1.CanaryDeployment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.deploy.v1.CanaryDeployment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.deploy.v1.CanaryDeployment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.deploy.v1.CanaryDeployment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.deploy.v1.CanaryDeployment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.deploy.v1.CanaryDeployment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.deploy.v1.CanaryDeployment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.deploy.v1.CanaryDeployment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.deploy.v1.CanaryDeployment parseFrom(
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
  public static Builder newBuilder(com.google.cloud.deploy.v1.CanaryDeployment prototype) {
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
   * CanaryDeployment represents the canary deployment configuration
   * </pre>
   *
   * Protobuf type {@code google.cloud.deploy.v1.CanaryDeployment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.deploy.v1.CanaryDeployment)
      com.google.cloud.deploy.v1.CanaryDeploymentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.deploy.v1.CloudDeployProto.internal_static_google_cloud_deploy_v1_CanaryDeployment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.deploy.v1.CloudDeployProto.internal_static_google_cloud_deploy_v1_CanaryDeployment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.deploy.v1.CanaryDeployment.class, com.google.cloud.deploy.v1.CanaryDeployment.Builder.class);
    }

    // Construct using com.google.cloud.deploy.v1.CanaryDeployment.newBuilder()
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
      percentages_ = emptyIntList();
      verify_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.deploy.v1.CloudDeployProto.internal_static_google_cloud_deploy_v1_CanaryDeployment_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.CanaryDeployment getDefaultInstanceForType() {
      return com.google.cloud.deploy.v1.CanaryDeployment.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.CanaryDeployment build() {
      com.google.cloud.deploy.v1.CanaryDeployment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.CanaryDeployment buildPartial() {
      com.google.cloud.deploy.v1.CanaryDeployment result = new com.google.cloud.deploy.v1.CanaryDeployment(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.deploy.v1.CanaryDeployment result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        percentages_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.percentages_ = percentages_;
    }

    private void buildPartial0(com.google.cloud.deploy.v1.CanaryDeployment result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.verify_ = verify_;
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
      if (other instanceof com.google.cloud.deploy.v1.CanaryDeployment) {
        return mergeFrom((com.google.cloud.deploy.v1.CanaryDeployment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.deploy.v1.CanaryDeployment other) {
      if (other == com.google.cloud.deploy.v1.CanaryDeployment.getDefaultInstance()) return this;
      if (!other.percentages_.isEmpty()) {
        if (percentages_.isEmpty()) {
          percentages_ = other.percentages_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensurePercentagesIsMutable();
          percentages_.addAll(other.percentages_);
        }
        onChanged();
      }
      if (other.getVerify() != false) {
        setVerify(other.getVerify());
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
              int v = input.readInt32();
              ensurePercentagesIsMutable();
              percentages_.addInt(v);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensurePercentagesIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                percentages_.addInt(input.readInt32());
              }
              input.popLimit(limit);
              break;
            } // case 10
            case 16: {
              verify_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private com.google.protobuf.Internal.IntList percentages_ = emptyIntList();
    private void ensurePercentagesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        percentages_ = mutableCopy(percentages_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <pre>
     * Required. The percentage based deployments that will occur as a part of a
     * `Rollout`. List is expected in ascending order and each integer n is
     * 0 &lt;= n &lt; 100.
     * </pre>
     *
     * <code>repeated int32 percentages = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return A list containing the percentages.
     */
    public java.util.List<java.lang.Integer>
        getPercentagesList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(percentages_) : percentages_;
    }
    /**
     * <pre>
     * Required. The percentage based deployments that will occur as a part of a
     * `Rollout`. List is expected in ascending order and each integer n is
     * 0 &lt;= n &lt; 100.
     * </pre>
     *
     * <code>repeated int32 percentages = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The count of percentages.
     */
    public int getPercentagesCount() {
      return percentages_.size();
    }
    /**
     * <pre>
     * Required. The percentage based deployments that will occur as a part of a
     * `Rollout`. List is expected in ascending order and each integer n is
     * 0 &lt;= n &lt; 100.
     * </pre>
     *
     * <code>repeated int32 percentages = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index of the element to return.
     * @return The percentages at the given index.
     */
    public int getPercentages(int index) {
      return percentages_.getInt(index);
    }
    /**
     * <pre>
     * Required. The percentage based deployments that will occur as a part of a
     * `Rollout`. List is expected in ascending order and each integer n is
     * 0 &lt;= n &lt; 100.
     * </pre>
     *
     * <code>repeated int32 percentages = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index to set the value at.
     * @param value The percentages to set.
     * @return This builder for chaining.
     */
    public Builder setPercentages(
        int index, int value) {
      
      ensurePercentagesIsMutable();
      percentages_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The percentage based deployments that will occur as a part of a
     * `Rollout`. List is expected in ascending order and each integer n is
     * 0 &lt;= n &lt; 100.
     * </pre>
     *
     * <code>repeated int32 percentages = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The percentages to add.
     * @return This builder for chaining.
     */
    public Builder addPercentages(int value) {
      
      ensurePercentagesIsMutable();
      percentages_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The percentage based deployments that will occur as a part of a
     * `Rollout`. List is expected in ascending order and each integer n is
     * 0 &lt;= n &lt; 100.
     * </pre>
     *
     * <code>repeated int32 percentages = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param values The percentages to add.
     * @return This builder for chaining.
     */
    public Builder addAllPercentages(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensurePercentagesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, percentages_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The percentage based deployments that will occur as a part of a
     * `Rollout`. List is expected in ascending order and each integer n is
     * 0 &lt;= n &lt; 100.
     * </pre>
     *
     * <code>repeated int32 percentages = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearPercentages() {
      percentages_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private boolean verify_ ;
    /**
     * <pre>
     * Whether to run verify tests after each percentage deployment.
     * </pre>
     *
     * <code>bool verify = 2;</code>
     * @return The verify.
     */
    @java.lang.Override
    public boolean getVerify() {
      return verify_;
    }
    /**
     * <pre>
     * Whether to run verify tests after each percentage deployment.
     * </pre>
     *
     * <code>bool verify = 2;</code>
     * @param value The verify to set.
     * @return This builder for chaining.
     */
    public Builder setVerify(boolean value) {
      
      verify_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether to run verify tests after each percentage deployment.
     * </pre>
     *
     * <code>bool verify = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearVerify() {
      bitField0_ = (bitField0_ & ~0x00000002);
      verify_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.deploy.v1.CanaryDeployment)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.deploy.v1.CanaryDeployment)
  private static final com.google.cloud.deploy.v1.CanaryDeployment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.deploy.v1.CanaryDeployment();
  }

  public static com.google.cloud.deploy.v1.CanaryDeployment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CanaryDeployment>
      PARSER = new com.google.protobuf.AbstractParser<CanaryDeployment>() {
    @java.lang.Override
    public CanaryDeployment parsePartialFrom(
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

  public static com.google.protobuf.Parser<CanaryDeployment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CanaryDeployment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.deploy.v1.CanaryDeployment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

