package com.sample.sample.domain.extended.authorization.permission;

import com.sample.sample.domain.core.authorization.permission.IPermissionRepository;
import org.springframework.stereotype.Repository;

@Repository("permissionRepositoryExtended")
public interface IPermissionRepositoryExtended extends IPermissionRepository {
    //Add your custom code here
}
