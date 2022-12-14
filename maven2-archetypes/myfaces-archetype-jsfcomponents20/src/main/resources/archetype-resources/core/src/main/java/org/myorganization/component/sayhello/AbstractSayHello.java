/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.myorganization.component.sayhello;

import javax.faces.component.UIOutput;
import org.apache.myfaces.buildtools.maven2.plugin.builder.annotation.JSFComponent;
import org.apache.myfaces.buildtools.maven2.plugin.builder.annotation.JSFProperty;

/**
 *   
 *   
 */
@JSFComponent(
        name = "mycomponents:sayHello",
        clazz="org.myorganization.component.sayhello.SayHello",
        tagClass = "org.myorganization.component.sayhello.SayHelloTag")
public abstract class AbstractSayHello extends UIOutput
{
    public static final String COMPONENT_TYPE = "org.myorganization.SayHello";
    public static final String DEFAULT_RENDERER_TYPE = "org.myorganization.SayHelloRenderer";
    public static final String COMPONENT_FAMILY = "javax.faces.Output";

    /**
     * User's first name.
     * 
     */
    @JSFProperty
    public abstract String getFirstName();


    /**
     * User's last name.
     * 
     */
    @JSFProperty
    public abstract String getLastName();
    
    /**
     * Rendered property.
     * 
     */
    @JSFProperty(defaultValue="true")
    public abstract boolean isRendered();                   
}
