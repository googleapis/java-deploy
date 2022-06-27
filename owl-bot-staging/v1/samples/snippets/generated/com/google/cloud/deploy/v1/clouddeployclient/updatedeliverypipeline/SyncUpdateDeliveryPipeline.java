/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.deploy.v1.samples;

// [START deploy_v1_generated_clouddeployclient_updatedeliverypipeline_sync]
import com.google.cloud.deploy.v1.CloudDeployClient;
import com.google.cloud.deploy.v1.DeliveryPipeline;
import com.google.cloud.deploy.v1.UpdateDeliveryPipelineRequest;
import com.google.protobuf.FieldMask;

public class SyncUpdateDeliveryPipeline {

  public static void main(String[] args) throws Exception {
    syncUpdateDeliveryPipeline();
  }

  public static void syncUpdateDeliveryPipeline() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CloudDeployClient cloudDeployClient = CloudDeployClient.create()) {
      UpdateDeliveryPipelineRequest request =
          UpdateDeliveryPipelineRequest.newBuilder()
              .setUpdateMask(FieldMask.newBuilder().build())
              .setDeliveryPipeline(DeliveryPipeline.newBuilder().build())
              .setRequestId("requestId693933066")
              .setAllowMissing(true)
              .setValidateOnly(true)
              .build();
      DeliveryPipeline response = cloudDeployClient.updateDeliveryPipelineAsync(request).get();
    }
  }
}
// [END deploy_v1_generated_clouddeployclient_updatedeliverypipeline_sync]
