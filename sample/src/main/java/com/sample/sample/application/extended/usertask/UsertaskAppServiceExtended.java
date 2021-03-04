package com.sample.sample.application.extended.usertask;

import com.sample.sample.application.core.usertask.UsertaskAppService;
import com.sample.sample.commons.logging.LoggingHelper;
import com.sample.sample.domain.extended.authorization.users.IUsersRepositoryExtended;
import com.sample.sample.domain.extended.task.ITaskRepositoryExtended;
import com.sample.sample.domain.extended.usertask.IUsertaskRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("usertaskAppServiceExtended")
public class UsertaskAppServiceExtended extends UsertaskAppService implements IUsertaskAppServiceExtended {

    public UsertaskAppServiceExtended(
        IUsertaskRepositoryExtended usertaskRepositoryExtended,
        ITaskRepositoryExtended taskRepositoryExtended,
        IUsersRepositoryExtended usersRepositoryExtended,
        IUsertaskMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(usertaskRepositoryExtended, taskRepositoryExtended, usersRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
