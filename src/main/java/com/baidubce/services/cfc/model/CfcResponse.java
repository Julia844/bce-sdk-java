/*
 * Copyright  2019 Baidu, Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.baidubce.services.cfc.model;

import com.baidubce.BceResponseMetadata;
import com.baidubce.model.AbstractBceResponse;
import com.baidubce.util.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * Represent the data return by the baidu CFC service calls
 */
public class CfcResponse extends AbstractBceResponse {
    /**
     * @param metadata
     */
    public void setMetadata(BceResponseMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        try {
            return JsonUtils.toJsonPrettyString(this);
        } catch (JsonProcessingException e) {
            return "";
        }
    }
}
