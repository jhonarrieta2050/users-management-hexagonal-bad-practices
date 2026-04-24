package com.jcaa.usersmanagement.application.service.mapper;

import com.jcaa.usersmanagement.application.service.dto.command.CreateUserCommand;
import com.jcaa.usersmanagement.domain.enums.UserRole;
import com.jcaa.usersmanagement.domain.enums.UserStatus;
import com.jcaa.usersmanagement.domain.model.UserModel;
import com.jcaa.usersmanagement.domain.valueobject.UserEmail;
import com.jcaa.usersmanagement.domain.valueobject.UserId;
import com.jcaa.usersmanagement.domain.valueobject.UserName;
import com.jcaa.usersmanagement.domain.valueobject.UserPassword;

public class UserFactory {

    public static UserModel createFromCommand(CreateUserCommand command) {
        return new UserModel(
                new UserId(command.id()),
                new UserName(command.name()),
                new UserEmail(command.email()),
                UserPassword.fromPlainText(command.password()),
                UserRole.fromString(command.role()),
                UserStatus.PENDING
        );
    }
}