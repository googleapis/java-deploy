// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

/**
 * <pre>
 * The support state of a specific Skaffold version.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.deploy.v1.SkaffoldSupportState}
 */
public enum SkaffoldSupportState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Default value. This value is unused.
   * </pre>
   *
   * <code>SKAFFOLD_SUPPORT_STATE_UNSPECIFIED = 0;</code>
   */
  SKAFFOLD_SUPPORT_STATE_UNSPECIFIED(0),
  /**
   * <pre>
   * This skaffold version is currently supported.
   * </pre>
   *
   * <code>SKAFFOLD_SUPPORT_STATE_SUPPORTED = 1;</code>
   */
  SKAFFOLD_SUPPORT_STATE_SUPPORTED(1),
  /**
   * <pre>
   * This skaffold version is in maintenance mode.
   * </pre>
   *
   * <code>SKAFFOLD_SUPPORT_STATE_MAINTENANCE_MODE = 2;</code>
   */
  SKAFFOLD_SUPPORT_STATE_MAINTENANCE_MODE(2),
  /**
   * <pre>
   * This skaffold version is no longer supported.
   * </pre>
   *
   * <code>SKAFFOLD_SUPPORT_STATE_UNSUPPORTED = 3;</code>
   */
  SKAFFOLD_SUPPORT_STATE_UNSUPPORTED(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Default value. This value is unused.
   * </pre>
   *
   * <code>SKAFFOLD_SUPPORT_STATE_UNSPECIFIED = 0;</code>
   */
  public static final int SKAFFOLD_SUPPORT_STATE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * This skaffold version is currently supported.
   * </pre>
   *
   * <code>SKAFFOLD_SUPPORT_STATE_SUPPORTED = 1;</code>
   */
  public static final int SKAFFOLD_SUPPORT_STATE_SUPPORTED_VALUE = 1;
  /**
   * <pre>
   * This skaffold version is in maintenance mode.
   * </pre>
   *
   * <code>SKAFFOLD_SUPPORT_STATE_MAINTENANCE_MODE = 2;</code>
   */
  public static final int SKAFFOLD_SUPPORT_STATE_MAINTENANCE_MODE_VALUE = 2;
  /**
   * <pre>
   * This skaffold version is no longer supported.
   * </pre>
   *
   * <code>SKAFFOLD_SUPPORT_STATE_UNSUPPORTED = 3;</code>
   */
  public static final int SKAFFOLD_SUPPORT_STATE_UNSUPPORTED_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static SkaffoldSupportState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SkaffoldSupportState forNumber(int value) {
    switch (value) {
      case 0: return SKAFFOLD_SUPPORT_STATE_UNSPECIFIED;
      case 1: return SKAFFOLD_SUPPORT_STATE_SUPPORTED;
      case 2: return SKAFFOLD_SUPPORT_STATE_MAINTENANCE_MODE;
      case 3: return SKAFFOLD_SUPPORT_STATE_UNSUPPORTED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SkaffoldSupportState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SkaffoldSupportState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SkaffoldSupportState>() {
          public SkaffoldSupportState findValueByNumber(int number) {
            return SkaffoldSupportState.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.cloud.deploy.v1.CloudDeployProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final SkaffoldSupportState[] VALUES = values();

  public static SkaffoldSupportState valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private SkaffoldSupportState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.deploy.v1.SkaffoldSupportState)
}
