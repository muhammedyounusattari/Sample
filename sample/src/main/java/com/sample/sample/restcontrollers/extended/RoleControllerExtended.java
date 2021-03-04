package com.sample.sample.restcontrollers.extended;

import com.sample.sample.application.extended.authorization.role.IRoleAppServiceExtended;
import com.sample.sample.application.extended.authorization.rolepermission.IRolepermissionAppServiceExtended;
import com.sample.sample.application.extended.authorization.usersrole.IUsersroleAppServiceExtended;
import com.sample.sample.commons.logging.LoggingHelper;
import com.sample.sample.restcontrollers.core.RoleController;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role/extended")
public class RoleControllerExtended extends RoleController {

    public RoleControllerExtended(
        IRoleAppServiceExtended roleAppServiceExtended,
        IRolepermissionAppServiceExtended rolepermissionAppServiceExtended,
        IUsersroleAppServiceExtended usersroleAppServiceExtended,
        LoggingHelper helper,
        Environment env
    ) {
        super(roleAppServiceExtended, rolepermissionAppServiceExtended, usersroleAppServiceExtended, helper, env);
    }
    //Add your custom code here

}
