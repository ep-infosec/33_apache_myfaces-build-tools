/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.apache.myfaces.buildtools.maven2.plugin.builder.qdox;

import java.util.ArrayList;
import java.util.List;

import org.apache.myfaces.buildtools.maven2.plugin.builder.model.Model;
import org.apache.myfaces.buildtools.maven2.plugin.builder.qdox.parse.JavaClassParsingStrategy;

import com.thoughtworks.qdox.model.JavaClass;

/**
 * 
 * @author Leonardo Uribe
 * @since 1.0.9
 *
 */
public class ParsingContext
{
    private List strategies;
    
    public ParsingContext()
    {
        strategies = new ArrayList();
    }
    
    public void addStrategy(JavaClassParsingStrategy s)
    {
        strategies.add(s);
    }
    
    public void parseClass(JavaClass clazz, Model model)
    {
        for (int i = 0; i < strategies.size(); i++)
        {
            ((JavaClassParsingStrategy)strategies.get(i)).parseClass(clazz, model);
            
        }
    }
}
