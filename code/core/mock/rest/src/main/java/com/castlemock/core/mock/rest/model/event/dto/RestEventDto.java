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

package com.castlemock.core.mock.rest.model.event.dto;

import com.castlemock.core.basis.model.event.dto.EventDto;
import org.dozer.Mapping;

import java.util.Date;

/**
 * @author Karl Dahlgren
 * @since 1.0
 */
public class RestEventDto extends EventDto {

    @Mapping("request")
    private RestRequestDto request;

    @Mapping("response")
    private RestResponseDto response;

    @Mapping("projectId")
    private String projectId;

    @Mapping("applicationId")
    private String applicationId;

    @Mapping("resourceId")
    private String resourceId;

    @Mapping("methodId")
    private String methodId;

    /**
     * Default constructor for the REST event DTO
     */
    public RestEventDto() {
    }

    /**
     * Default constructor for the REST event DTO
     */
    public RestEventDto(final EventDto eventDto) {
        super(eventDto);
    }

    /**
     * Constructor for the REST event DTO
     * @param request The REST request that the event is representing
     * @param projectId The project id that the event belongs to
     * @param applicationId The application id that the event belongs to
     * @param resourceId The resource id that the event belongs to
     * @param methodId The id of the REST operation that is affected by the provided REST request
     */
    public RestEventDto(final String resourceName, final RestRequestDto request, final String projectId, final String applicationId, final String resourceId, final String methodId) {
        super(resourceName);
        this.request = request;
        this.projectId = projectId;
        this.applicationId = applicationId;
        this.resourceId = resourceId;
        this.methodId = methodId;
    }

    /**
     * The finish method is used to sent the response that was sent back, but was also
     * to set the date/time for when the event ended.
     * @param restResponse
     */
    public void finish(final RestResponseDto restResponse) {
        this.response = restResponse;
        setEndDate(new Date());
    }

    public RestRequestDto getRequest() {
        return request;
    }

    public void setRequest(RestRequestDto request) {
        this.request = request;
    }

    public RestResponseDto getResponse() {
        return response;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public void setResponse(RestResponseDto response) {
        this.response = response;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getMethodId() {
        return methodId;
    }

    public void setMethodId(String methodId) {
        this.methodId = methodId;
    }
}
