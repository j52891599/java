/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;

public class V1PodFailurePolicyOnExitCodesRequirementBuilder
    extends V1PodFailurePolicyOnExitCodesRequirementFluentImpl<
        V1PodFailurePolicyOnExitCodesRequirementBuilder>
    implements VisitableBuilder<
        V1PodFailurePolicyOnExitCodesRequirement, V1PodFailurePolicyOnExitCodesRequirementBuilder> {
  public V1PodFailurePolicyOnExitCodesRequirementBuilder() {
    this(false);
  }

  public V1PodFailurePolicyOnExitCodesRequirementBuilder(Boolean validationEnabled) {
    this(new V1PodFailurePolicyOnExitCodesRequirement(), validationEnabled);
  }

  public V1PodFailurePolicyOnExitCodesRequirementBuilder(
      V1PodFailurePolicyOnExitCodesRequirementFluent<?> fluent) {
    this(fluent, false);
  }

  public V1PodFailurePolicyOnExitCodesRequirementBuilder(
      V1PodFailurePolicyOnExitCodesRequirementFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1PodFailurePolicyOnExitCodesRequirement(), validationEnabled);
  }

  public V1PodFailurePolicyOnExitCodesRequirementBuilder(
      V1PodFailurePolicyOnExitCodesRequirementFluent<?> fluent,
      V1PodFailurePolicyOnExitCodesRequirement instance) {
    this(fluent, instance, false);
  }

  public V1PodFailurePolicyOnExitCodesRequirementBuilder(
      V1PodFailurePolicyOnExitCodesRequirementFluent<?> fluent,
      V1PodFailurePolicyOnExitCodesRequirement instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withContainerName(instance.getContainerName());

    fluent.withOperator(instance.getOperator());

    fluent.withValues(instance.getValues());

    this.validationEnabled = validationEnabled;
  }

  public V1PodFailurePolicyOnExitCodesRequirementBuilder(
      V1PodFailurePolicyOnExitCodesRequirement instance) {
    this(instance, false);
  }

  public V1PodFailurePolicyOnExitCodesRequirementBuilder(
      V1PodFailurePolicyOnExitCodesRequirement instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withContainerName(instance.getContainerName());

    this.withOperator(instance.getOperator());

    this.withValues(instance.getValues());

    this.validationEnabled = validationEnabled;
  }

  V1PodFailurePolicyOnExitCodesRequirementFluent<?> fluent;
  Boolean validationEnabled;

  public V1PodFailurePolicyOnExitCodesRequirement build() {
    V1PodFailurePolicyOnExitCodesRequirement buildable =
        new V1PodFailurePolicyOnExitCodesRequirement();
    buildable.setContainerName(fluent.getContainerName());
    buildable.setOperator(fluent.getOperator());
    buildable.setValues(fluent.getValues());
    return buildable;
  }
}
