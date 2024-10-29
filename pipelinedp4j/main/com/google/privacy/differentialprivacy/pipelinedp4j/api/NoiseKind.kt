/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.privacy.differentialprivacy.pipelinedp4j.api

import com.google.privacy.differentialprivacy.pipelinedp4j.core.NoiseKind as InternalNoiseKind

/** The kind of noise that can be applied to the data. */
enum class NoiseKind {
  LAPLACE,
  GAUSSIAN,
}

/**
 * Converts the [NoiseKind] to the [InternalNoiseKind].
 *
 * We delibaretly do not expose the internal classes in the public API to limit the surface of the
 * API. This will give us more flexibility to change the implementation.
 */
internal fun NoiseKind.toInternalNoiseKind() =
  when (this) {
    NoiseKind.LAPLACE -> InternalNoiseKind.LAPLACE
    NoiseKind.GAUSSIAN -> InternalNoiseKind.GAUSSIAN
  }