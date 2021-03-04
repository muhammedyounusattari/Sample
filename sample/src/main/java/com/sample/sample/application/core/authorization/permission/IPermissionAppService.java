package com.sample.sample.application.core.authorization.permission;

import com.sample.sample.application.core.authorization.permission.dto.*;
import com.sample.sample.commons.search.SearchCriteria;
import java.util.*;
import org.springframework.data.domain.Pageable;

public interface IPermissionAppService {
    //CRUD Operations

    CreatePermissionOutput create(CreatePermissionInput permission);

    void delete(Long id);

    UpdatePermissionOutput update(Long id, UpdatePermissionInput input);

    FindPermissionByIdOutput findById(Long id);

    List<FindPermissionByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;

    FindPermissionByNameOutput findByPermissionName(String permissionName);

    //Join Column Parsers

    Map<String, String> parseRolepermissionsJoinColumn(String keysString);

    Map<String, String> parseUserspermissionsJoinColumn(String keysString);
}
