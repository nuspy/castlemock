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

package com.castlemock.web.basis.model.configuration.service;

import com.castlemock.core.basis.model.Service;
import com.castlemock.core.basis.model.ServiceResult;
import com.castlemock.core.basis.model.ServiceTask;
import com.castlemock.core.basis.model.configuration.domain.ConfigurationGroup;
import com.castlemock.core.basis.model.configuration.dto.ConfigurationDto;
import com.castlemock.core.basis.model.configuration.dto.ConfigurationGroupDto;
import com.castlemock.core.basis.model.configuration.service.message.input.UpdateAllConfigurationGroupsInput;
import com.castlemock.core.basis.model.configuration.service.message.output.UpdateAllConfigurationGroupsOutput;
import com.google.common.base.Preconditions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Karl Dahlgren
 * @since 1.0
 */
@org.springframework.stereotype.Service
public class UpdateAllConfigurationGroupsService extends AbstractConfigurationGroupService implements Service<UpdateAllConfigurationGroupsInput, UpdateAllConfigurationGroupsOutput> {

    /**
     * The process message is responsible for processing an incoming serviceTask and generate
     * a response based on the incoming serviceTask input
     * @param serviceTask The serviceTask that will be processed by the service
     * @return A result based on the processed incoming serviceTask
     * @see ServiceTask
     * @see ServiceResult
     */
    @Override
    public ServiceResult<UpdateAllConfigurationGroupsOutput> process(final ServiceTask<UpdateAllConfigurationGroupsInput> serviceTask) {
        final UpdateAllConfigurationGroupsInput input = serviceTask.getInput();
        final List<ConfigurationGroupDto> configurationGroupDtos = input.getConfigurationGroups();
        Preconditions.checkNotNull(configurationGroupDtos, "The updated configuration group cannot be null");
        final List<ConfigurationGroupDto> sourceConfigurationGroups = findAll();
        Preconditions.checkNotNull(sourceConfigurationGroups, "The source configuration group cannot be null");
        final List<ConfigurationGroupDto> updateConfigurations = new ArrayList<ConfigurationGroupDto>();

        for(ConfigurationGroupDto sourceConfigurationGroup : sourceConfigurationGroups){
            for(ConfigurationGroupDto configurationGroup : configurationGroupDtos){
                if(sourceConfigurationGroup.getId().equals(configurationGroup.getId())){
                    update(sourceConfigurationGroup, configurationGroup);
                    ConfigurationGroupDto updateConfigurationGroup = update(sourceConfigurationGroup, configurationGroup);
                    updateConfigurations.add(updateConfigurationGroup);
                    save(updateConfigurationGroup);
                }
            }
        }

        final UpdateAllConfigurationGroupsOutput output = new UpdateAllConfigurationGroupsOutput();
        output.setUpdatedConfigurationGroups(updateConfigurations);

        return createServiceResult(output);
    }

    /**
     * The method update provides functionality to update an entire configuration group with new set of data
     * @param sourceConfigurationGroupDto The current version of the configuration group
     * @param updatedConfigurationGroupDto The updated version of the configuration group
     * @return The updated version of the configuration group
     * @see ConfigurationGroup
     * @see ConfigurationGroupDto
     */
    private ConfigurationGroupDto update(final ConfigurationGroupDto sourceConfigurationGroupDto, final ConfigurationGroupDto updatedConfigurationGroupDto){
        Preconditions.checkNotNull(sourceConfigurationGroupDto, "The source configuration group cannot be null");
        Preconditions.checkNotNull(updatedConfigurationGroupDto, "The updated configuration group cannot be null");
        for(ConfigurationDto sourceConfigurationDto : sourceConfigurationGroupDto.getConfigurations()){
            for(ConfigurationDto updatedConfigurationDto : updatedConfigurationGroupDto.getConfigurations()){
                if(sourceConfigurationDto.getKey().equals(updatedConfigurationDto.getKey())){
                    sourceConfigurationDto.setValue(updatedConfigurationDto.getValue());
                }
            }
        }
        return sourceConfigurationGroupDto;
    }
}
