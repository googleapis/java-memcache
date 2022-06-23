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

package com.google.cloud.memcache.v1.samples;

// [START memcache_v1_generated_cloudmemcacheclient_updateparameters_stringfieldmaskmemcacheparameters_sync]
import com.google.cloud.memcache.v1.CloudMemcacheClient;
import com.google.cloud.memcache.v1.Instance;
import com.google.cloud.memcache.v1.InstanceName;
import com.google.cloud.memcache.v1.MemcacheParameters;
import com.google.protobuf.FieldMask;

public class SyncUpdateParametersStringFieldmaskMemcacheparameters {

  public static void main(String[] args) throws Exception {
    syncUpdateParametersStringFieldmaskMemcacheparameters();
  }

  public static void syncUpdateParametersStringFieldmaskMemcacheparameters() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
      String name = InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]").toString();
      FieldMask updateMask = FieldMask.newBuilder().build();
      MemcacheParameters parameters = MemcacheParameters.newBuilder().build();
      Instance response =
          cloudMemcacheClient.updateParametersAsync(name, updateMask, parameters).get();
    }
  }
}
// [END memcache_v1_generated_cloudmemcacheclient_updateparameters_stringfieldmaskmemcacheparameters_sync]
