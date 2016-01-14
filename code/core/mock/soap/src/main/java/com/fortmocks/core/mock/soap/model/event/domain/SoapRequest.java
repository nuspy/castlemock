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

package com.fortmocks.core.mock.soap.model.event.domain;

import com.fortmocks.core.mock.soap.model.project.domain.SoapOperationMethod;
import com.fortmocks.core.mock.soap.model.project.domain.SoapOperationType;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Karl Dahlgren
 * @since 1.0
 */
@XmlRootElement
public class SoapRequest {

    private String body;
    private String contentType;
    private String uri;
    private SoapOperationMethod soapOperationMethod;
    private String soapOperationName;
    private String soapOperationIdentifier;
    private SoapOperationType soapOperationType;

    @XmlElement
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @XmlElement
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @XmlElement
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @XmlElement
    public SoapOperationMethod getSoapOperationMethod() {
        return soapOperationMethod;
    }

    public void setSoapOperationMethod(SoapOperationMethod soapOperationMethod) {
        this.soapOperationMethod = soapOperationMethod;
    }

    @XmlElement
    public String getSoapOperationName() {
        return soapOperationName;
    }

    public void setSoapOperationName(String soapOperationName) {
        this.soapOperationName = soapOperationName;
    }

    @XmlElement
    public String getSoapOperationIdentifier() {
        return soapOperationIdentifier;
    }

    public void setSoapOperationIdentifier(String soapOperationIdentifier) {
        this.soapOperationIdentifier = soapOperationIdentifier;
    }

    @XmlElement
    public SoapOperationType getSoapOperationType() {
        return soapOperationType;
    }

    public void setSoapOperationType(SoapOperationType soapOperationType) {
        this.soapOperationType = soapOperationType;
    }
}
