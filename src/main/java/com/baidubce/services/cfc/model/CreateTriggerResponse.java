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

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response object for creating a trigger for Baidu CFC function
 */
public class CreateTriggerResponse extends CfcResponse {

    /**
     * Trigger relation
     */
    @JsonProperty(value = "Relation")
    private Relation Relation;

    /**
     * Get the trigger relation
     * @return The trigger relation
     */
    @JsonProperty(value = "Relation")
    public Relation getRelation() {
        return this.Relation;
    }

    /**
     * Set the trigger relation
     * @param relation The trigger relation
     */
    public void setRelation(Relation relation) {
        this.Relation = relation;
    }

}
