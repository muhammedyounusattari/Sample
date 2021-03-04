package com.sample.sample.restcontrollers.extended;

import com.sample.sample.application.extended.project.IProjectAppServiceExtended;
import com.sample.sample.application.extended.task.ITaskAppServiceExtended;
import com.sample.sample.application.extended.timesheetdetails.ITimesheetdetailsAppServiceExtended;
import com.sample.sample.application.extended.usertask.IUsertaskAppServiceExtended;
import com.sample.sample.commons.logging.LoggingHelper;
import com.sample.sample.restcontrollers.core.TaskController;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task/extended")
public class TaskControllerExtended extends TaskController {

    public TaskControllerExtended(
        ITaskAppServiceExtended taskAppServiceExtended,
        IProjectAppServiceExtended projectAppServiceExtended,
        ITimesheetdetailsAppServiceExtended timesheetdetailsAppServiceExtended,
        IUsertaskAppServiceExtended usertaskAppServiceExtended,
        LoggingHelper helper,
        Environment env
    ) {
        super(
            taskAppServiceExtended,
            projectAppServiceExtended,
            timesheetdetailsAppServiceExtended,
            usertaskAppServiceExtended,
            helper,
            env
        );
    }
    //Add your custom code here

}
