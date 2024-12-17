/*
 * Copyright 2024 Jeremy Kuhn
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.inverno.example.app_web_client;

import io.inverno.core.annotation.NestedBean;
import io.inverno.mod.configuration.Configuration;
import io.inverno.mod.discovery.http.meta.HttpMetaDiscoveryConfiguration;
import io.inverno.mod.web.client.WebClientConfiguration;

/**
 * <p>
 * The application configuration providing Web client and HTTP configuration Discovery service configurations.
 * </p>
 *
 * @author <a href="mailto:jeremy.kuhn@inverno.io">Jeremy Kuhn</a>
 */
@Configuration
public interface AppConfiguration {

	@NestedBean
	WebClientConfiguration web();

	@NestedBean
	HttpMetaDiscoveryConfiguration discovery_config();
}
