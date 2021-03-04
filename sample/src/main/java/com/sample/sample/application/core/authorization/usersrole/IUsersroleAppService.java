package com.sample.sample.application.core.authorization.usersrole;

import com.sample.sample.application.core.authorization.usersrole.dto.*;
import com.sample.sample.commons.search.SearchCriteria;
import com.sample.sample.domain.core.authorization.usersrole.UsersroleId;
import java.util.*;
import org.springframework.data.domain.Pageable;

public interface IUsersroleAppService {
    //CRUD Operations

    CreateUsersroleOutput create(CreateUsersroleInput usersrole);

    void delete(UsersroleId usersroleId);

    UpdateUsersroleOutput update(UsersroleId usersroleId, UpdateUsersroleInput input);

    FindUsersroleByIdOutput findById(UsersroleId usersroleId);

    List<FindUsersroleByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;
    //Relationship Operations
    //Relationship Operations

    GetRoleOutput getRole(UsersroleId usersroleId);

    GetUsersOutput getUsers(UsersroleId usersroleId);

    //Join Column Parsers

    UsersroleId parseUsersroleKey(String keysString);
}
