/*-
 * #%L
 * TESLERDOC - APP
 * %%
 * Copyright (C) 2020 Tesler Contributors
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

package io.tesler.app;

import io.tesler.app.conf.TESLERDOCApplicationConfig;
import io.tesler.app.conf.TESLERDOCRedirectConfig;
import io.tesler.app.conf.TESLERDOCSecurityConfig;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class TESLERDOCApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		new SpringApplicationBuilder()
				.sources(
						TESLERDOCApplicationConfig.class,
						TESLERDOCRedirectConfig.class,
						TESLERDOCSecurityConfig.class
				).build().run(args);
	}

}
