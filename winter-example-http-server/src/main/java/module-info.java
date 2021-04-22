/*
 * Copyright 2021 Jeremy KUHN
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
 * @author <a href="jeremy.kuhn@winterframework.io">Jeremy Kuhn</a>
 *
 */
@io.winterframework.core.annotation.Module
module io.winterframework.example.http.server {
	requires io.winterframework.mod.boot;
	requires io.winterframework.mod.http.server;
	
	requires io.netty.common;
	requires io.netty.codec.http;
	
	// needed for epoll: use --add-modules instead
//	requires io.netty.transport.unix.common;
//	requires io.netty.transport.epoll;
	
	// needed for ssl
//	requires jdk.crypto.ec;
	
	exports io.winterframework.example.http.server;
}