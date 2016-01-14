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

import com.fortmocks.core.mock.soap.model.project.domain.SoapOperationMethod;
import com.fortmocks.core.mock.soap.model.project.domain.SoapOperationType;
import org.dozer.Mapping;

/**
 * @author Karl Dahlgren
 * @since 1.0
 */
public class SoapRequestDto {

    @Mapping("body")
    private String body;

    @Mapping("contentType")
    private String contentType;

    @Mapping("uri")
    private String uri;

    @Mapping("soapOperationMethod")
    private SoapOperationMethod soapOperationMethod;

    @Mapping("soapOperationName")
    private String soapOperationName;

    @Mapping("soapOperationIdentifier")
    private String soapOperationIdentifier;

    @Mapping("soapOperationType")
    private SoapOperationType soapOperationType;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public SoapOperationMethod getSoapOperationMethod() {
        return soapOperationMethod;
    }

    public void setSoapOperationMethod(SoapOperationMethod soapOperationMethod) {
        this.soapOperationMethod = soapOperationMethod;
    }

    public String getSoapOperationName() {
        return soapOperationName;
    }

    public void setSoapOperationName(String soapOperationName) {
        this.soapOperationName = soapOperationName;
    }

    public String getSoapOperationIdentifier() {
        return soapOperationIdentifier;
    }

    public void setSoapOperationIdentifier(String soapOperationIdentifier) {
        this.soapOperationIdentifier = soapOperationIdentifier;
    }

    public SoapOperationType getSoapOperationType() {
        return soapOperationType;
    }

    public void setSoapOperationType(SoapOperationType soapOperationType) {
        this.soapOperationType = soapOperationType;
    }
}
