package com.sample.sample.application.extended.authorization.permission;

import com.sample.sample.application.core.authorization.permission.PermissionAppService;
import com.sample.sample.commons.logging.LoggingHelper;
import com.sample.sample.domain.extended.authorization.permission.IPermissionRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("permissionAppServiceExtended")
public class PermissionAppServiceExtended extends PermissionAppService implements IPermissionAppServiceExtended {

    public PermissionAppServiceExtended(
        IPermissionRepositoryExtended permissionRepositoryExtended,
        IPermissionMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(permissionRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
