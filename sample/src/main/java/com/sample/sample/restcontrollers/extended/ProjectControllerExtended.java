package com.sample.sample.restcontrollers.extended;

import com.sample.sample.application.extended.customer.ICustomerAppServiceExtended;
import com.sample.sample.application.extended.project.IProjectAppServiceExtended;
import com.sample.sample.application.extended.task.ITaskAppServiceExtended;
import com.sample.sample.commons.logging.LoggingHelper;
import com.sample.sample.restcontrollers.core.ProjectController;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/project/extended")
public class ProjectControllerExtended extends ProjectController {

    public ProjectControllerExtended(
        IProjectAppServiceExtended projectAppServiceExtended,
        ICustomerAppServiceExtended customerAppServiceExtended,
        ITaskAppServiceExtended taskAppServiceExtended,
        LoggingHelper helper,
        Environment env
    ) {
        super(projectAppServiceExtended, customerAppServiceExtended, taskAppServiceExtended, helper, env);
    }
    //Add your custom code here

}
