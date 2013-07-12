/*
 * Copyright 1999-2006 University of Chicago
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.globus.replica.rls;

/**
 * Used to add/delete catalog to index update configuration.
 */
public class RLIUpdate {

	protected String url;
	protected int flags;
	protected String pattern;
	
	public RLIUpdate(String url, int flags, String pattern) {
		this.url = url;
		this.flags = flags;
		this.pattern = pattern;
	}
	
	public RLIUpdate(String url, String pattern) {
		this(url, 0, pattern);
	}

	public int getFlags() {
		return flags;
	}

	public String getPattern() {
		return pattern;
	}

	public String getUrl() {
		return url;
	}
}
