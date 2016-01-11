/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from protobuf

package org.apache.drill.exec.proto.beans;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import com.dyuproject.protostuff.ByteString;
import com.dyuproject.protostuff.GraphIOUtil;
import com.dyuproject.protostuff.Input;
import com.dyuproject.protostuff.Message;
import com.dyuproject.protostuff.Output;
import com.dyuproject.protostuff.Schema;

public final class QueryInfo implements Externalizable, Message<QueryInfo>, Schema<QueryInfo>
{

    public static Schema<QueryInfo> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static QueryInfo getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final QueryInfo DEFAULT_INSTANCE = new QueryInfo();

    static final String DEFAULT_USER = ByteString.stringDefaultValue("-");
    
    private String query;
    private long start;
    private QueryResult.QueryState state;
    private String user = DEFAULT_USER;
    private DrillbitEndpoint foreman;

    public QueryInfo()
    {
        
    }

    // getters and setters

    // query

    public String getQuery()
    {
        return query;
    }

    public QueryInfo setQuery(String query)
    {
        this.query = query;
        return this;
    }

    // start

    public long getStart()
    {
        return start;
    }

    public QueryInfo setStart(long start)
    {
        this.start = start;
        return this;
    }

    // state

    public QueryResult.QueryState getState()
    {
        return state == null ? QueryResult.QueryState.STARTING : state;
    }

    public QueryInfo setState(QueryResult.QueryState state)
    {
        this.state = state;
        return this;
    }

    // user

    public String getUser()
    {
        return user;
    }

    public QueryInfo setUser(String user)
    {
        this.user = user;
        return this;
    }

    // foreman

    public DrillbitEndpoint getForeman()
    {
        return foreman;
    }

    public QueryInfo setForeman(DrillbitEndpoint foreman)
    {
        this.foreman = foreman;
        return this;
    }

    // java serialization

    public void readExternal(ObjectInput in) throws IOException
    {
        GraphIOUtil.mergeDelimitedFrom(in, this, this);
    }

    public void writeExternal(ObjectOutput out) throws IOException
    {
        GraphIOUtil.writeDelimitedTo(out, this, this);
    }

    // message method

    public Schema<QueryInfo> cachedSchema()
    {
        return DEFAULT_INSTANCE;
    }

    // schema methods

    public QueryInfo newMessage()
    {
        return new QueryInfo();
    }

    public Class<QueryInfo> typeClass()
    {
        return QueryInfo.class;
    }

    public String messageName()
    {
        return QueryInfo.class.getSimpleName();
    }

    public String messageFullName()
    {
        return QueryInfo.class.getName();
    }

    public boolean isInitialized(QueryInfo message)
    {
        return true;
    }

    public void mergeFrom(Input input, QueryInfo message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    message.query = input.readString();
                    break;
                case 2:
                    message.start = input.readInt64();
                    break;
                case 3:
                    message.state = QueryResult.QueryState.valueOf(input.readEnum());
                    break;
                case 4:
                    message.user = input.readString();
                    break;
                case 5:
                    message.foreman = input.mergeObject(message.foreman, DrillbitEndpoint.getSchema());
                    break;

                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, QueryInfo message) throws IOException
    {
        if(message.query != null)
            output.writeString(1, message.query, false);

        if(message.start != 0)
            output.writeInt64(2, message.start, false);

        if(message.state != null)
             output.writeEnum(3, message.state.number, false);

        if(message.user != null && message.user != DEFAULT_USER)
            output.writeString(4, message.user, false);

        if(message.foreman != null)
             output.writeObject(5, message.foreman, DrillbitEndpoint.getSchema(), false);

    }

    public String getFieldName(int number)
    {
        switch(number)
        {
            case 1: return "query";
            case 2: return "start";
            case 3: return "state";
            case 4: return "user";
            case 5: return "foreman";
            default: return null;
        }
    }

    public int getFieldNumber(String name)
    {
        final Integer number = __fieldMap.get(name);
        return number == null ? 0 : number.intValue();
    }

    private static final java.util.HashMap<String,Integer> __fieldMap = new java.util.HashMap<String,Integer>();
    static
    {
        __fieldMap.put("query", 1);
        __fieldMap.put("start", 2);
        __fieldMap.put("state", 3);
        __fieldMap.put("user", 4);
        __fieldMap.put("foreman", 5);
    }
    
}