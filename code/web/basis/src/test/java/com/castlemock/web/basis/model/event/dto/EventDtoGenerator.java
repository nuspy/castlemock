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

package com.castlemock.web.basis.model.event.dto;

import com.castlemock.core.basis.model.event.domain.Event;
import com.castlemock.core.basis.model.event.dto.EventDto;

import java.util.Date;
import java.util.UUID;

/**
 * @author Karl Dahlgren
 * @since 1.0
 * @see Event
 * @see EventDtoGenerator
 */
public class EventDtoGenerator {

    public static EventDto generateEventDto(){
        EventDto eventDto = new EventDto();
        eventDto.setId(UUID.randomUUID().toString());
        eventDto.setStartDate(new Date());
        eventDto.setEndDate(new Date());
        return eventDto;
    }

}
