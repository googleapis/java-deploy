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

public interface ReleaseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.Release)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Name of the `Release`. Format is projects/{project}/
   * locations/{location}/deliveryPipelines/{deliveryPipeline}/
   * releases/[a-z][a-z0-9&#92;-]{0,62}.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Optional. Name of the `Release`. Format is projects/{project}/
   * locations/{location}/deliveryPipelines/{deliveryPipeline}/
   * releases/[a-z][a-z0-9&#92;-]{0,62}.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Unique identifier of the `Release`.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. Unique identifier of the `Release`.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Description of the `Release`. Max length is 255 characters.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Description of the `Release`. Max length is 255 characters.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * User annotations. These attributes can only be set and used by the
   * user, and not by Google Cloud Deploy. See
   * https://google.aip.dev/128#annotations for more details such as format and
   * size limitations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 4;</code>
   */
  int getAnnotationsCount();
  /**
   *
   *
   * <pre>
   * User annotations. These attributes can only be set and used by the
   * user, and not by Google Cloud Deploy. See
   * https://google.aip.dev/128#annotations for more details such as format and
   * size limitations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 4;</code>
   */
  boolean containsAnnotations(java.lang.String key);
  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();
  /**
   *
   *
   * <pre>
   * User annotations. These attributes can only be set and used by the
   * user, and not by Google Cloud Deploy. See
   * https://google.aip.dev/128#annotations for more details such as format and
   * size limitations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();
  /**
   *
   *
   * <pre>
   * User annotations. These attributes can only be set and used by the
   * user, and not by Google Cloud Deploy. See
   * https://google.aip.dev/128#annotations for more details such as format and
   * size limitations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 4;</code>
   */
  java.lang.String getAnnotationsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * User annotations. These attributes can only be set and used by the
   * user, and not by Google Cloud Deploy. See
   * https://google.aip.dev/128#annotations for more details such as format and
   * size limitations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 4;</code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Labels are attributes that can be set and used by both the
   * user and by Google Cloud Deploy. Labels must meet the following
   * constraints: Each resource is limited to 64 labels. Keys must conform to
   * the regexp: `[a-zA-Z][a-zA-Z0-9_-]{0,62}`. Values must conform to the
   * regexp: `[a-zA-Z0-9_-]{0,63}`. Both keys and values are additionally
   * constrained to be &lt;= 128 bytes in size.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels are attributes that can be set and used by both the
   * user and by Google Cloud Deploy. Labels must meet the following
   * constraints: Each resource is limited to 64 labels. Keys must conform to
   * the regexp: `[a-zA-Z][a-zA-Z0-9_-]{0,62}`. Values must conform to the
   * regexp: `[a-zA-Z0-9_-]{0,63}`. Both keys and values are additionally
   * constrained to be &lt;= 128 bytes in size.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels are attributes that can be set and used by both the
   * user and by Google Cloud Deploy. Labels must meet the following
   * constraints: Each resource is limited to 64 labels. Keys must conform to
   * the regexp: `[a-zA-Z][a-zA-Z0-9_-]{0,62}`. Values must conform to the
   * regexp: `[a-zA-Z0-9_-]{0,63}`. Both keys and values are additionally
   * constrained to be &lt;= 128 bytes in size.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels are attributes that can be set and used by both the
   * user and by Google Cloud Deploy. Labels must meet the following
   * constraints: Each resource is limited to 64 labels. Keys must conform to
   * the regexp: `[a-zA-Z][a-zA-Z0-9_-]{0,62}`. Values must conform to the
   * regexp: `[a-zA-Z0-9_-]{0,63}`. Both keys and values are additionally
   * constrained to be &lt;= 128 bytes in size.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  java.lang.String getLabelsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels are attributes that can be set and used by both the
   * user and by Google Cloud Deploy. Labels must meet the following
   * constraints: Each resource is limited to 64 labels. Keys must conform to
   * the regexp: `[a-zA-Z][a-zA-Z0-9_-]{0,62}`. Values must conform to the
   * regexp: `[a-zA-Z0-9_-]{0,63}`. Both keys and values are additionally
   * constrained to be &lt;= 128 bytes in size.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Time at which the `Release` was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time at which the `Release` was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time at which the `Release` was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time at which the render began.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp render_start_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the renderStartTime field is set.
   */
  boolean hasRenderStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Time at which the render began.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp render_start_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The renderStartTime.
   */
  com.google.protobuf.Timestamp getRenderStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Time at which the render began.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp render_start_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getRenderStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time at which the render completed.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp render_end_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the renderEndTime field is set.
   */
  boolean hasRenderEndTime();
  /**
   *
   *
   * <pre>
   * Output only. Time at which the render completed.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp render_end_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The renderEndTime.
   */
  com.google.protobuf.Timestamp getRenderEndTime();
  /**
   *
   *
   * <pre>
   * Output only. Time at which the render completed.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp render_end_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getRenderEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Cloud Storage URI of tar.gz archive containing Skaffold configuration.
   * </pre>
   *
   * <code>string skaffold_config_uri = 17;</code>
   *
   * @return The skaffoldConfigUri.
   */
  java.lang.String getSkaffoldConfigUri();
  /**
   *
   *
   * <pre>
   * Cloud Storage URI of tar.gz archive containing Skaffold configuration.
   * </pre>
   *
   * <code>string skaffold_config_uri = 17;</code>
   *
   * @return The bytes for skaffoldConfigUri.
   */
  com.google.protobuf.ByteString getSkaffoldConfigUriBytes();

  /**
   *
   *
   * <pre>
   * Filepath of the Skaffold config inside of the config URI.
   * </pre>
   *
   * <code>string skaffold_config_path = 9;</code>
   *
   * @return The skaffoldConfigPath.
   */
  java.lang.String getSkaffoldConfigPath();
  /**
   *
   *
   * <pre>
   * Filepath of the Skaffold config inside of the config URI.
   * </pre>
   *
   * <code>string skaffold_config_path = 9;</code>
   *
   * @return The bytes for skaffoldConfigPath.
   */
  com.google.protobuf.ByteString getSkaffoldConfigPathBytes();

  /**
   *
   *
   * <pre>
   * List of artifacts to pass through to Skaffold command.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.BuildArtifact build_artifacts = 10;</code>
   */
  java.util.List<com.google.cloud.deploy.v1.BuildArtifact> getBuildArtifactsList();
  /**
   *
   *
   * <pre>
   * List of artifacts to pass through to Skaffold command.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.BuildArtifact build_artifacts = 10;</code>
   */
  com.google.cloud.deploy.v1.BuildArtifact getBuildArtifacts(int index);
  /**
   *
   *
   * <pre>
   * List of artifacts to pass through to Skaffold command.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.BuildArtifact build_artifacts = 10;</code>
   */
  int getBuildArtifactsCount();
  /**
   *
   *
   * <pre>
   * List of artifacts to pass through to Skaffold command.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.BuildArtifact build_artifacts = 10;</code>
   */
  java.util.List<? extends com.google.cloud.deploy.v1.BuildArtifactOrBuilder>
      getBuildArtifactsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of artifacts to pass through to Skaffold command.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.BuildArtifact build_artifacts = 10;</code>
   */
  com.google.cloud.deploy.v1.BuildArtifactOrBuilder getBuildArtifactsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Snapshot of the parent pipeline taken at release creation time.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.DeliveryPipeline delivery_pipeline_snapshot = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the deliveryPipelineSnapshot field is set.
   */
  boolean hasDeliveryPipelineSnapshot();
  /**
   *
   *
   * <pre>
   * Output only. Snapshot of the parent pipeline taken at release creation time.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.DeliveryPipeline delivery_pipeline_snapshot = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The deliveryPipelineSnapshot.
   */
  com.google.cloud.deploy.v1.DeliveryPipeline getDeliveryPipelineSnapshot();
  /**
   *
   *
   * <pre>
   * Output only. Snapshot of the parent pipeline taken at release creation time.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.DeliveryPipeline delivery_pipeline_snapshot = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.deploy.v1.DeliveryPipelineOrBuilder getDeliveryPipelineSnapshotOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Snapshot of the parent pipeline's targets taken at release creation time.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.deploy.v1.Target target_snapshots = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.deploy.v1.Target> getTargetSnapshotsList();
  /**
   *
   *
   * <pre>
   * Output only. Snapshot of the parent pipeline's targets taken at release creation time.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.deploy.v1.Target target_snapshots = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.deploy.v1.Target getTargetSnapshots(int index);
  /**
   *
   *
   * <pre>
   * Output only. Snapshot of the parent pipeline's targets taken at release creation time.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.deploy.v1.Target target_snapshots = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getTargetSnapshotsCount();
  /**
   *
   *
   * <pre>
   * Output only. Snapshot of the parent pipeline's targets taken at release creation time.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.deploy.v1.Target target_snapshots = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.deploy.v1.TargetOrBuilder>
      getTargetSnapshotsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Snapshot of the parent pipeline's targets taken at release creation time.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.deploy.v1.Target target_snapshots = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.deploy.v1.TargetOrBuilder getTargetSnapshotsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Current state of the render operation.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.Release.RenderState render_state = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for renderState.
   */
  int getRenderStateValue();
  /**
   *
   *
   * <pre>
   * Output only. Current state of the render operation.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.Release.RenderState render_state = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The renderState.
   */
  com.google.cloud.deploy.v1.Release.RenderState getRenderState();

  /**
   *
   *
   * <pre>
   * This checksum is computed by the server based on the value of other
   * fields, and may be sent on update and delete requests to ensure the
   * client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 16;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * This checksum is computed by the server based on the value of other
   * fields, and may be sent on update and delete requests to ensure the
   * client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 16;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * The Skaffold version to use when operating on this release, such as
   * "1.20.0". Not all versions are valid; Google Cloud Deploy supports a
   * specific set of versions.
   * If unset, the most recent supported Skaffold version will be used.
   * </pre>
   *
   * <code>string skaffold_version = 19;</code>
   *
   * @return The skaffoldVersion.
   */
  java.lang.String getSkaffoldVersion();
  /**
   *
   *
   * <pre>
   * The Skaffold version to use when operating on this release, such as
   * "1.20.0". Not all versions are valid; Google Cloud Deploy supports a
   * specific set of versions.
   * If unset, the most recent supported Skaffold version will be used.
   * </pre>
   *
   * <code>string skaffold_version = 19;</code>
   *
   * @return The bytes for skaffoldVersion.
   */
  com.google.protobuf.ByteString getSkaffoldVersionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Map from target ID to the target artifacts created
   * during the render operation.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.deploy.v1.TargetArtifact&gt; target_artifacts = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getTargetArtifactsCount();
  /**
   *
   *
   * <pre>
   * Output only. Map from target ID to the target artifacts created
   * during the render operation.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.deploy.v1.TargetArtifact&gt; target_artifacts = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  boolean containsTargetArtifacts(java.lang.String key);
  /** Use {@link #getTargetArtifactsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.deploy.v1.TargetArtifact> getTargetArtifacts();
  /**
   *
   *
   * <pre>
   * Output only. Map from target ID to the target artifacts created
   * during the render operation.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.deploy.v1.TargetArtifact&gt; target_artifacts = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.deploy.v1.TargetArtifact>
      getTargetArtifactsMap();
  /**
   *
   *
   * <pre>
   * Output only. Map from target ID to the target artifacts created
   * during the render operation.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.deploy.v1.TargetArtifact&gt; target_artifacts = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.deploy.v1.TargetArtifact getTargetArtifactsOrDefault(
      java.lang.String key, com.google.cloud.deploy.v1.TargetArtifact defaultValue);
  /**
   *
   *
   * <pre>
   * Output only. Map from target ID to the target artifacts created
   * during the render operation.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.deploy.v1.TargetArtifact&gt; target_artifacts = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.deploy.v1.TargetArtifact getTargetArtifactsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Map from target ID to details of the render operation for that target.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.deploy.v1.Release.TargetRender&gt; target_renders = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getTargetRendersCount();
  /**
   *
   *
   * <pre>
   * Output only. Map from target ID to details of the render operation for that target.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.deploy.v1.Release.TargetRender&gt; target_renders = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  boolean containsTargetRenders(java.lang.String key);
  /** Use {@link #getTargetRendersMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.deploy.v1.Release.TargetRender>
      getTargetRenders();
  /**
   *
   *
   * <pre>
   * Output only. Map from target ID to details of the render operation for that target.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.deploy.v1.Release.TargetRender&gt; target_renders = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.deploy.v1.Release.TargetRender>
      getTargetRendersMap();
  /**
   *
   *
   * <pre>
   * Output only. Map from target ID to details of the render operation for that target.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.deploy.v1.Release.TargetRender&gt; target_renders = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.deploy.v1.Release.TargetRender getTargetRendersOrDefault(
      java.lang.String key, com.google.cloud.deploy.v1.Release.TargetRender defaultValue);
  /**
   *
   *
   * <pre>
   * Output only. Map from target ID to details of the render operation for that target.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.deploy.v1.Release.TargetRender&gt; target_renders = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.deploy.v1.Release.TargetRender getTargetRendersOrThrow(java.lang.String key);
}
