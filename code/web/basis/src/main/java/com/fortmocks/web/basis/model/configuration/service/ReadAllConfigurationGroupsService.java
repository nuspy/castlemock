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

package com.fortmocks.web.basis.model.configuration.service;

import com.fortmocks.core.basis.model.Service;
import com.fortmocks.core.basis.model.ServiceResult;
import com.fortmocks.core.basis.model.ServiceTask;
import com.fortmocks.core.basis.model.configuration.dto.ConfigurationGroupDto;
import com.fortmocks.core.basis.model.configuration.service.message.input.ReadAllConfigurationGroupsInput;
import com.fortmocks.core.basis.model.configuration.service.message.output.ReadAllConfigurationGroupsOutput;

import java.util.List;

/**
 * @author Karl Dahlgren
 * @since 1.0
 */
@org.springframework.stereotype.Service
public class ReadAllConfigurationGroupsService extends AbstractConfigurationGroupService implements Service<ReadAllConfigurationGroupsInput, ReadAllConfigurationGroupsOutput> {

    /**
     * The process message is responsible for processing an incoming serviceTask and generate
     * a response based on the incoming serviceTask input
     * @param serviceTask The serviceTask that will be processed by the service
     * @return A result based on the processed incoming serviceTask
     * @see ServiceTask
     * @see ServiceResult
     */
    @Override
    public ServiceResult<ReadAllConfigurationGroupsOutput> process(final ServiceTask<ReadAllConfigurationGroupsInput> serviceTask) {
        final List<ConfigurationGroupDto> configurationGroups = findAll();
        final ReadAllConfigurationGroupsOutput output = new ReadAllConfigurationGroupsOutput();
        output.setConfigurationGroups(configurationGroups);
        return createServiceResult(output);
    }
}