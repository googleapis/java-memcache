/*
 * Copyright 2021 Google LLC
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

package com.google.cloud.memcache.v1;

import static com.google.cloud.memcache.v1.CloudMemcacheClient.ListInstancesPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.memcache.v1.stub.CloudMemcacheStubSettings;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link CloudMemcacheClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li> The default service address (memcache.googleapis.com) and default port (443) are used.
 *   <li> Credentials are acquired automatically through Application Default Credentials.
 *   <li> Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of getInstance to 30 seconds:
 *
 * <pre>{@code
 * CloudMemcacheSettings.Builder cloudMemcacheSettingsBuilder = CloudMemcacheSettings.newBuilder();
 * cloudMemcacheSettingsBuilder
 *     .getInstanceSettings()
 *     .setRetrySettings(
 *         cloudMemcacheSettingsBuilder
 *             .getInstanceSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * CloudMemcacheSettings cloudMemcacheSettings = cloudMemcacheSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class CloudMemcacheSettings extends ClientSettings<CloudMemcacheSettings> {

  /** Returns the object with the settings used for calls to listInstances. */
  public PagedCallSettings<ListInstancesRequest, ListInstancesResponse, ListInstancesPagedResponse>
      listInstancesSettings() {
    return ((CloudMemcacheStubSettings) getStubSettings()).listInstancesSettings();
  }

  /** Returns the object with the settings used for calls to getInstance. */
  public UnaryCallSettings<GetInstanceRequest, Instance> getInstanceSettings() {
    return ((CloudMemcacheStubSettings) getStubSettings()).getInstanceSettings();
  }

  /** Returns the object with the settings used for calls to createInstance. */
  public UnaryCallSettings<CreateInstanceRequest, Operation> createInstanceSettings() {
    return ((CloudMemcacheStubSettings) getStubSettings()).createInstanceSettings();
  }

  /** Returns the object with the settings used for calls to createInstance. */
  public OperationCallSettings<CreateInstanceRequest, Instance, OperationMetadata>
      createInstanceOperationSettings() {
    return ((CloudMemcacheStubSettings) getStubSettings()).createInstanceOperationSettings();
  }

  /** Returns the object with the settings used for calls to updateInstance. */
  public UnaryCallSettings<UpdateInstanceRequest, Operation> updateInstanceSettings() {
    return ((CloudMemcacheStubSettings) getStubSettings()).updateInstanceSettings();
  }

  /** Returns the object with the settings used for calls to updateInstance. */
  public OperationCallSettings<UpdateInstanceRequest, Instance, OperationMetadata>
      updateInstanceOperationSettings() {
    return ((CloudMemcacheStubSettings) getStubSettings()).updateInstanceOperationSettings();
  }

  /** Returns the object with the settings used for calls to updateParameters. */
  public UnaryCallSettings<UpdateParametersRequest, Operation> updateParametersSettings() {
    return ((CloudMemcacheStubSettings) getStubSettings()).updateParametersSettings();
  }

  /** Returns the object with the settings used for calls to updateParameters. */
  public OperationCallSettings<UpdateParametersRequest, Instance, OperationMetadata>
      updateParametersOperationSettings() {
    return ((CloudMemcacheStubSettings) getStubSettings()).updateParametersOperationSettings();
  }

  /** Returns the object with the settings used for calls to deleteInstance. */
  public UnaryCallSettings<DeleteInstanceRequest, Operation> deleteInstanceSettings() {
    return ((CloudMemcacheStubSettings) getStubSettings()).deleteInstanceSettings();
  }

  /** Returns the object with the settings used for calls to deleteInstance. */
  public OperationCallSettings<DeleteInstanceRequest, Empty, OperationMetadata>
      deleteInstanceOperationSettings() {
    return ((CloudMemcacheStubSettings) getStubSettings()).deleteInstanceOperationSettings();
  }

  /** Returns the object with the settings used for calls to applyParameters. */
  public UnaryCallSettings<ApplyParametersRequest, Operation> applyParametersSettings() {
    return ((CloudMemcacheStubSettings) getStubSettings()).applyParametersSettings();
  }

  /** Returns the object with the settings used for calls to applyParameters. */
  public OperationCallSettings<ApplyParametersRequest, Instance, OperationMetadata>
      applyParametersOperationSettings() {
    return ((CloudMemcacheStubSettings) getStubSettings()).applyParametersOperationSettings();
  }

  public static final CloudMemcacheSettings create(CloudMemcacheStubSettings stub)
      throws IOException {
    return new CloudMemcacheSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return CloudMemcacheStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return CloudMemcacheStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return CloudMemcacheStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return CloudMemcacheStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return CloudMemcacheStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return CloudMemcacheStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return CloudMemcacheStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected CloudMemcacheSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for CloudMemcacheSettings. */
  public static class Builder extends ClientSettings.Builder<CloudMemcacheSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(CloudMemcacheStubSettings.newBuilder(clientContext));
    }

    protected Builder(CloudMemcacheSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(CloudMemcacheStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(CloudMemcacheStubSettings.newBuilder());
    }

    public CloudMemcacheStubSettings.Builder getStubSettingsBuilder() {
      return ((CloudMemcacheStubSettings.Builder) getStubSettings());
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'.
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to listInstances. */
    public PagedCallSettings.Builder<
            ListInstancesRequest, ListInstancesResponse, ListInstancesPagedResponse>
        listInstancesSettings() {
      return getStubSettingsBuilder().listInstancesSettings();
    }

    /** Returns the builder for the settings used for calls to getInstance. */
    public UnaryCallSettings.Builder<GetInstanceRequest, Instance> getInstanceSettings() {
      return getStubSettingsBuilder().getInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to createInstance. */
    public UnaryCallSettings.Builder<CreateInstanceRequest, Operation> createInstanceSettings() {
      return getStubSettingsBuilder().createInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to createInstance. */
    public OperationCallSettings.Builder<CreateInstanceRequest, Instance, OperationMetadata>
        createInstanceOperationSettings() {
      return getStubSettingsBuilder().createInstanceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to updateInstance. */
    public UnaryCallSettings.Builder<UpdateInstanceRequest, Operation> updateInstanceSettings() {
      return getStubSettingsBuilder().updateInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to updateInstance. */
    public OperationCallSettings.Builder<UpdateInstanceRequest, Instance, OperationMetadata>
        updateInstanceOperationSettings() {
      return getStubSettingsBuilder().updateInstanceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to updateParameters. */
    public UnaryCallSettings.Builder<UpdateParametersRequest, Operation>
        updateParametersSettings() {
      return getStubSettingsBuilder().updateParametersSettings();
    }

    /** Returns the builder for the settings used for calls to updateParameters. */
    public OperationCallSettings.Builder<UpdateParametersRequest, Instance, OperationMetadata>
        updateParametersOperationSettings() {
      return getStubSettingsBuilder().updateParametersOperationSettings();
    }

    /** Returns the builder for the settings used for calls to deleteInstance. */
    public UnaryCallSettings.Builder<DeleteInstanceRequest, Operation> deleteInstanceSettings() {
      return getStubSettingsBuilder().deleteInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to deleteInstance. */
    public OperationCallSettings.Builder<DeleteInstanceRequest, Empty, OperationMetadata>
        deleteInstanceOperationSettings() {
      return getStubSettingsBuilder().deleteInstanceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to applyParameters. */
    public UnaryCallSettings.Builder<ApplyParametersRequest, Operation> applyParametersSettings() {
      return getStubSettingsBuilder().applyParametersSettings();
    }

    /** Returns the builder for the settings used for calls to applyParameters. */
    public OperationCallSettings.Builder<ApplyParametersRequest, Instance, OperationMetadata>
        applyParametersOperationSettings() {
      return getStubSettingsBuilder().applyParametersOperationSettings();
    }

    @Override
    public CloudMemcacheSettings build() throws IOException {
      return new CloudMemcacheSettings(this);
    }
  }
}
