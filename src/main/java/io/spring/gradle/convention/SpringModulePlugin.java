/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package io.spring.gradle.convention;

import org.gradle.api.Project;
import org.gradle.api.plugins.MavenPlugin;
import org.gradle.api.plugins.PluginManager;

/**
 * @author Rob Winch
 */
public class SpringModulePlugin extends AbstractSpringJavaPlugin {

	@Override
	public void additionalPlugins(Project project) {
		PluginManager pluginManager = project.getPluginManager();
		pluginManager.apply(MavenPlugin.class);
		pluginManager.apply("io.spring.convention.maven");
		pluginManager.apply("io.spring.convention.springio");
		pluginManager.apply("io.spring.convention.jacoco");
		pluginManager.apply("io.spring.convention.merge");
	}
}
