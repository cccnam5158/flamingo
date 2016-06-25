/**
 * Copyright (C) 2013 The Flamingo developers (admin@exem-oss.org)
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.exem.flamingo.shared.util;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextRegistryTest {

    @Test
    public void getApplicationContext() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:org/exem/flamingo/shared/util/dummy-applicationContext.xml");

        ApplicationContextRegistry acr = new ApplicationContextRegistry();
        acr.setApplicationContext(ctx);

        Assert.assertEquals(ctx, ApplicationContextRegistry.getApplicationContext());

        Assert.assertNotNull(ApplicationContextRegistry.getApplicationContext().getBean("string"));


    }
}
