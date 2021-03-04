package com.sample.sample.application.core.authorization.role;

import com.sample.sample.application.core.authorization.role.dto.*;
import com.sample.sample.commons.search.SearchCriteria;
import java.util.*;
import org.springframework.data.domain.Pageable;

public interface IRoleAppService {
    //CRUD Operations

    CreateRoleOutput create(CreateRoleInput role);

    void delete(Long id);

    UpdateRoleOutput update(Long id, UpdateRoleInput input);

    FindRoleByIdOutput findById(Long id);

    List<FindRoleByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;

    FindRoleByNameOutput findByRoleName(String roleName);

    //Join Column Parsers

    Map<String, String> parseRolepermissionsJoinColumn(String keysString);

    Map<String, String> parseUsersrolesJoinColumn(String keysString);
}
