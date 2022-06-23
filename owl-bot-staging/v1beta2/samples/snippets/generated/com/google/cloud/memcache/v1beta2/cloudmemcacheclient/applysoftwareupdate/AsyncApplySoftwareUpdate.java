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

package com.google.cloud.memcache.v1beta2.samples;

// [START memcache_v1beta2_generated_cloudmemcacheclient_applysoftwareupdate_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.memcache.v1beta2.ApplySoftwareUpdateRequest;
import com.google.cloud.memcache.v1beta2.CloudMemcacheClient;
import com.google.cloud.memcache.v1beta2.InstanceName;
import com.google.longrunning.Operation;
import java.util.ArrayList;

public class AsyncApplySoftwareUpdate {

  public static void main(String[] args) throws Exception {
    asyncApplySoftwareUpdate();
  }

  public static void asyncApplySoftwareUpdate() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
      ApplySoftwareUpdateRequest request =
          ApplySoftwareUpdateRequest.newBuilder()
              .setInstance(InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]").toString())
              .addAllNodeIds(new ArrayList<String>())
              .setApplyAll(true)
              .build();
      ApiFuture<Operation> future =
          cloudMemcacheClient.applySoftwareUpdateCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END memcache_v1beta2_generated_cloudmemcacheclient_applysoftwareupdate_async]
