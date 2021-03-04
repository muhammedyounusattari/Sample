package com.sample.sample.restcontrollers.extended;

import com.sample.sample.application.extended.task.ITaskAppServiceExtended;
import com.sample.sample.application.extended.timeofftype.ITimeofftypeAppServiceExtended;
import com.sample.sample.application.extended.timesheet.ITimesheetAppServiceExtended;
import com.sample.sample.application.extended.timesheetdetails.ITimesheetdetailsAppServiceExtended;
import com.sample.sample.commons.logging.LoggingHelper;
import com.sample.sample.restcontrollers.core.TimesheetdetailsController;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/timesheetdetails/extended")
public class TimesheetdetailsControllerExtended extends TimesheetdetailsController {

    public TimesheetdetailsControllerExtended(
        ITimesheetdetailsAppServiceExtended timesheetdetailsAppServiceExtended,
        ITaskAppServiceExtended taskAppServiceExtended,
        ITimeofftypeAppServiceExtended timeofftypeAppServiceExtended,
        ITimesheetAppServiceExtended timesheetAppServiceExtended,
        LoggingHelper helper,
        Environment env
    ) {
        super(
            timesheetdetailsAppServiceExtended,
            taskAppServiceExtended,
            timeofftypeAppServiceExtended,
            timesheetAppServiceExtended,
            helper,
            env
        );
    }
    //Add your custom code here

}
