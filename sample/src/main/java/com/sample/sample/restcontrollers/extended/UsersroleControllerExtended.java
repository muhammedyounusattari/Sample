package com.sample.sample.restcontrollers.extended;

import com.sample.sample.application.extended.authorization.role.IRoleAppServiceExtended;
import com.sample.sample.application.extended.authorization.users.IUsersAppServiceExtended;
import com.sample.sample.application.extended.authorization.usersrole.IUsersroleAppServiceExtended;
import com.sample.sample.commons.logging.LoggingHelper;
import com.sample.sample.restcontrollers.core.UsersroleController;
import com.sample.sample.security.JWTAppService;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usersrole/extended")
public class UsersroleControllerExtended extends UsersroleController {

    public UsersroleControllerExtended(
        IUsersroleAppServiceExtended usersroleAppServiceExtended,
        IRoleAppServiceExtended roleAppServiceExtended,
        IUsersAppServiceExtended usersAppServiceExtended,
        JWTAppService jwtAppService,
        LoggingHelper helper,
        Environment env
    ) {
        super(usersroleAppServiceExtended, roleAppServiceExtended, usersAppServiceExtended, jwtAppService, helper, env);
    }
    //Add your custom code here

}
