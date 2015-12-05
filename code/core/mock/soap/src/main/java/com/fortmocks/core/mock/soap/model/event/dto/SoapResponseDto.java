/*
 * Copyright 2015 Karl Dahlgren
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.fortmocks.core.mock.soap.model.event.dto;

import org.dozer.Mapping;

/**
 * @author Karl Dahlgren
 * @since 1.0
 */

public class SoapResponseDto {

    @Mapping("body")
    private String body;

    @Mapping("mockResponseName")
    private String mockResponseName;

    @Mapping("httpStatusCode")
    private Integer httpStatusCode;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getMockResponseName() {
        return mockResponseName;
    }

    public void setMockResponseName(String mockResponseName) {
        this.mockResponseName = mockResponseName;
    }

    public Integer getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }
}
