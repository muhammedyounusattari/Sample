package com.sample.sample.application.extended.authorization.users;

import com.sample.sample.application.core.authorization.users.UsersAppService;
import com.sample.sample.commons.logging.LoggingHelper;
import com.sample.sample.domain.core.authorization.userspreference.IUserspreferenceRepository;
import com.sample.sample.domain.extended.authorization.users.IUsersRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("usersAppServiceExtended")
public class UsersAppServiceExtended extends UsersAppService implements IUsersAppServiceExtended {

    public UsersAppServiceExtended(
        IUsersRepositoryExtended usersRepositoryExtended,
        IUserspreferenceRepository userspreferenceRepository,
        IUsersMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(usersRepositoryExtended, userspreferenceRepository, mapper, logHelper);
    }
    //Add your custom code here

}
