package com.sample.sample.application.core.authorization.userspermission;

import com.sample.sample.application.core.authorization.userspermission.dto.*;
import com.sample.sample.commons.search.SearchCriteria;
import com.sample.sample.domain.core.authorization.userspermission.UserspermissionId;
import java.util.*;
import org.springframework.data.domain.Pageable;

public interface IUserspermissionAppService {
    //CRUD Operations

    CreateUserspermissionOutput create(CreateUserspermissionInput userspermission);

    void delete(UserspermissionId userspermissionId);

    UpdateUserspermissionOutput update(UserspermissionId userspermissionId, UpdateUserspermissionInput input);

    FindUserspermissionByIdOutput findById(UserspermissionId userspermissionId);

    List<FindUserspermissionByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;
    //Relationship Operations
    //Relationship Operations

    GetPermissionOutput getPermission(UserspermissionId userspermissionId);

    GetUsersOutput getUsers(UserspermissionId userspermissionId);

    //Join Column Parsers

    UserspermissionId parseUserspermissionKey(String keysString);
}
