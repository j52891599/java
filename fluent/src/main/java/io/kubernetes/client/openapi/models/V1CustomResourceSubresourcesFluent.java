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

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;

/** Generated */
public interface V1CustomResourceSubresourcesFluent<A extends V1CustomResourceSubresourcesFluent<A>>
    extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildScale instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1CustomResourceSubresourceScale getScale();

  public V1CustomResourceSubresourceScale buildScale();

  public A withScale(V1CustomResourceSubresourceScale scale);

  public Boolean hasScale();

  public V1CustomResourceSubresourcesFluent.ScaleNested<A> withNewScale();

  public V1CustomResourceSubresourcesFluent.ScaleNested<A> withNewScaleLike(
      V1CustomResourceSubresourceScale item);

  public V1CustomResourceSubresourcesFluent.ScaleNested<A> editScale();

  public V1CustomResourceSubresourcesFluent.ScaleNested<A> editOrNewScale();

  public V1CustomResourceSubresourcesFluent.ScaleNested<A> editOrNewScaleLike(
      V1CustomResourceSubresourceScale item);

  public Object getStatus();

  public A withStatus(Object status);

  public Boolean hasStatus();

  public interface ScaleNested<N>
      extends Nested<N>,
          V1CustomResourceSubresourceScaleFluent<
              V1CustomResourceSubresourcesFluent.ScaleNested<N>> {
    public N and();

    public N endScale();
  }
}
