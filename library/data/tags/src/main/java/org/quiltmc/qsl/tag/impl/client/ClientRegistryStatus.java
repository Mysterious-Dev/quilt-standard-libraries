/*
 * Copyright 2022 QuiltMC
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

package org.quiltmc.qsl.tag.impl.client;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;

@ApiStatus.Internal
public enum ClientRegistryStatus {
	STATIC(true),
	WAITING(false),
	LOCAL(true),
	REMOTE(true);

	private final boolean ready;

	ClientRegistryStatus(boolean ready) {
		this.ready = ready;
	}

	@Contract(pure = true)
	public boolean isReady() {
		return this.ready;
	}
}
