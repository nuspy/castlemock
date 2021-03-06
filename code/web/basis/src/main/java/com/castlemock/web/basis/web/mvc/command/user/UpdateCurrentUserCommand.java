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

package com.castlemock.web.basis.web.mvc.command.user;

import com.castlemock.core.basis.model.user.domain.User;
import com.castlemock.core.basis.model.user.dto.UserDto;
import com.castlemock.web.basis.web.mvc.controller.user.UpdateCurrentUserController;


/**
 * The command class is used when a user wants to update their own user information.
 * @see User
 * @see UserDto
 * @see UpdateCurrentUserController
 */
public class UpdateCurrentUserCommand {

    private UserDto user = new UserDto();
    private String verifiedPassword;

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public String getVerifiedPassword() {
        return verifiedPassword;
    }

    public void setVerifiedPassword(String verifiedPassword) {
        this.verifiedPassword = verifiedPassword;
    }
}

