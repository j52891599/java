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

public class V1SubjectBuilder extends V1SubjectFluentImpl<V1SubjectBuilder>
    implements VisitableBuilder<V1Subject, V1SubjectBuilder> {
  public V1SubjectBuilder() {
    this(false);
  }

  public V1SubjectBuilder(Boolean validationEnabled) {
    this(new V1Subject(), validationEnabled);
  }

  public V1SubjectBuilder(V1SubjectFluent<?> fluent) {
    this(fluent, false);
  }

  public V1SubjectBuilder(V1SubjectFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1Subject(), validationEnabled);
  }

  public V1SubjectBuilder(V1SubjectFluent<?> fluent, V1Subject instance) {
    this(fluent, instance, false);
  }

  public V1SubjectBuilder(
      V1SubjectFluent<?> fluent, V1Subject instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiGroup(instance.getApiGroup());

    fluent.withKind(instance.getKind());

    fluent.withName(instance.getName());

    fluent.withNamespace(instance.getNamespace());

    this.validationEnabled = validationEnabled;
  }

  public V1SubjectBuilder(V1Subject instance) {
    this(instance, false);
  }

  public V1SubjectBuilder(V1Subject instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withApiGroup(instance.getApiGroup());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

    this.validationEnabled = validationEnabled;
  }

  V1SubjectFluent<?> fluent;
  Boolean validationEnabled;

  public V1Subject build() {
    V1Subject buildable = new V1Subject();
    buildable.setApiGroup(fluent.getApiGroup());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    return buildable;
  }
}
