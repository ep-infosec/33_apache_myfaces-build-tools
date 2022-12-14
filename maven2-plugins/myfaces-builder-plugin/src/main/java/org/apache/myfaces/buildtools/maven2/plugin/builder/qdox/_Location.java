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

import java.io.Serializable;

public class _Location implements Serializable
{
    private static final long serialVersionUID = 1L;

    private int column;
    private int line;
    private String path;
    
    public _Location(String path, int line, int column)
    {
        this.column = column;
        this.line = line;
        this.path = path;        
    }
    
    public int getColumn()
    {
        return column;
    }
    
    public int getLine()
    {
        return line;
    }
    
    public String getPath()
    {
        return path;
    }
    
    public String toString()
    {
        return path + " at line " + line + " and column " + column;
    }
}
