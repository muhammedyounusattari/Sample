package com.sample.sample.application.core.authorization.rolepermission;

import com.sample.sample.application.core.authorization.rolepermission.dto.*;
import com.sample.sample.commons.search.SearchCriteria;
import com.sample.sample.domain.core.authorization.rolepermission.RolepermissionId;
import java.util.*;
import org.springframework.data.domain.Pageable;

public interface IRolepermissionAppService {
    //CRUD Operations

    CreateRolepermissionOutput create(CreateRolepermissionInput rolepermission);

    void delete(RolepermissionId rolepermissionId);

    UpdateRolepermissionOutput update(RolepermissionId rolepermissionId, UpdateRolepermissionInput input);

    FindRolepermissionByIdOutput findById(RolepermissionId rolepermissionId);

    List<FindRolepermissionByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;

    void deleteUserTokens(Long roleId);
    //Relationship Operations
    //Relationship Operations

    GetPermissionOutput getPermission(RolepermissionId rolepermissionId);

    GetRoleOutput getRole(RolepermissionId rolepermissionId);

    //Join Column Parsers

    RolepermissionId parseRolepermissionKey(String keysString);
}
