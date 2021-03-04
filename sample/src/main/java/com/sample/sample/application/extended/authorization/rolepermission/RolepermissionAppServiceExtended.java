package com.sample.sample.application.extended.authorization.rolepermission;

import com.sample.sample.application.core.authorization.rolepermission.RolepermissionAppService;
import com.sample.sample.commons.logging.LoggingHelper;
import com.sample.sample.domain.extended.authorization.permission.IPermissionRepositoryExtended;
import com.sample.sample.domain.extended.authorization.role.IRoleRepositoryExtended;
import com.sample.sample.domain.extended.authorization.rolepermission.IRolepermissionRepositoryExtended;
import com.sample.sample.domain.extended.authorization.usersrole.IUsersroleRepositoryExtended;
import com.sample.sample.security.JWTAppService;
import org.springframework.stereotype.Service;

@Service("rolepermissionAppServiceExtended")
public class RolepermissionAppServiceExtended
    extends RolepermissionAppService
    implements IRolepermissionAppServiceExtended {

    public RolepermissionAppServiceExtended(
        JWTAppService jwtAppService,
        IUsersroleRepositoryExtended usersroleRepositoryExtended,
        IRolepermissionRepositoryExtended rolepermissionRepositoryExtended,
        IPermissionRepositoryExtended permissionRepositoryExtended,
        IRoleRepositoryExtended roleRepositoryExtended,
        IRolepermissionMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(
            jwtAppService,
            usersroleRepositoryExtended,
            rolepermissionRepositoryExtended,
            permissionRepositoryExtended,
            roleRepositoryExtended,
            mapper,
            logHelper
        );
    }
    //Add your custom code here

}
