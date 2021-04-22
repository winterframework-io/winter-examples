/*
 * Copyright 2020 Jeremy KUHN
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

/**
 * <p>
 * This is an example application to demonstrate Winter Web module.
 * </p>
 * 
 * <p>
 * It especially shows how to create
 * {@link io.winterframework.mod.web.annotation.WebController WebController}
 * beans.
 * </p>
 * 
 * @author <a href="mailto:jeremy.kuhn@winterframework.io">Jeremy Kuhn</a>
 * 
 * @version 1.2.3
 */
@io.winterframework.core.annotation.Module

@io.winterframework.core.annotation.Wire(beans="io.winterframework.example.web:webRouterConfigurer", into="io.winterframework.mod.web:webRouterConfigurer")
module io.winterframework.example.web {
	requires io.winterframework.mod.boot;
	requires io.winterframework.mod.web;
	
	exports io.winterframework.example.web;
	exports io.winterframework.example.web.dto;
}
