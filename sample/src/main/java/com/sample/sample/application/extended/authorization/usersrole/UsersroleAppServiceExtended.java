package com.sample.sample.application.extended.authorization.usersrole;

import com.sample.sample.application.core.authorization.usersrole.UsersroleAppService;
import com.sample.sample.commons.logging.LoggingHelper;
import com.sample.sample.domain.extended.authorization.role.IRoleRepositoryExtended;
import com.sample.sample.domain.extended.authorization.users.IUsersRepositoryExtended;
import com.sample.sample.domain.extended.authorization.usersrole.IUsersroleRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("usersroleAppServiceExtended")
public class UsersroleAppServiceExtended extends UsersroleAppService implements IUsersroleAppServiceExtended {

    public UsersroleAppServiceExtended(
        IUsersroleRepositoryExtended usersroleRepositoryExtended,
        IRoleRepositoryExtended roleRepositoryExtended,
        IUsersRepositoryExtended usersRepositoryExtended,
        IUsersroleMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(usersroleRepositoryExtended, roleRepositoryExtended, usersRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
