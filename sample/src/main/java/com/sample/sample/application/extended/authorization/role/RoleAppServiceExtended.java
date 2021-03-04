package com.sample.sample.application.extended.authorization.role;

import com.sample.sample.application.core.authorization.role.RoleAppService;
import com.sample.sample.commons.logging.LoggingHelper;
import com.sample.sample.domain.extended.authorization.role.IRoleRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("roleAppServiceExtended")
public class RoleAppServiceExtended extends RoleAppService implements IRoleAppServiceExtended {

    public RoleAppServiceExtended(
        IRoleRepositoryExtended roleRepositoryExtended,
        IRoleMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(roleRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
