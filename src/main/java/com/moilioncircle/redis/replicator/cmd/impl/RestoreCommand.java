/*
 * Copyright 2016-2018 Leon Chen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.moilioncircle.redis.replicator.cmd.impl;

import com.moilioncircle.redis.replicator.cmd.Command;
import com.moilioncircle.redis.replicator.rdb.datatype.EvictType;

/**
 * @author Leon Chen
 * @since 2.1.0
 */
public class RestoreCommand implements Command {

    private static final long serialVersionUID = 1L;

    private byte[] key;
    private long ttl;
    private byte[] serializedValue;
    private boolean isReplace;
    private boolean absTtl;
    protected EvictType evictType = EvictType.NONE;
    protected Long evictValue;

    public RestoreCommand() {
    }

    public RestoreCommand(byte[] key, long ttl, byte[] serializedValue, boolean isReplace, boolean absTtl, EvictType evictType, Long evictValue) {
        this.key = key;
        this.ttl = ttl;
        this.serializedValue = serializedValue;
        this.isReplace = isReplace;
        this.absTtl = absTtl;
        this.evictType = evictType;
        this.evictValue = evictValue;
    }

    public byte[] getKey() {
        return key;
    }

    public void setKey(byte[] key) {
        this.key = key;
    }

    public long getTtl() {
        return ttl;
    }

    public void setTtl(long ttl) {
        this.ttl = ttl;
    }

    public byte[] getSerializedValue() {
        return serializedValue;
    }

    public void setSerializedValue(byte[] serializedValue) {
        this.serializedValue = serializedValue;
    }

    public boolean isReplace() {
        return isReplace;
    }

    public void setReplace(boolean replace) {
        isReplace = replace;
    }

    public boolean isAbsTtl() {
        return absTtl;
    }

    public void setAbsTtl(boolean absTtl) {
        this.absTtl = absTtl;
    }
    
    public EvictType getEvictType() {
        return evictType;
    }
    
    public void setEvictType(EvictType evictType) {
        this.evictType = evictType;
    }
    
    public Long getEvictValue() {
        return evictValue;
    }
    
    public void setEvictValue(Long evictValue) {
        this.evictValue = evictValue;
    }
}
