package com.sample.sample.restcontrollers.extended;

import com.sample.sample.application.extended.authorization.users.IUsersAppServiceExtended;
import com.sample.sample.application.extended.timesheet.ITimesheetAppServiceExtended;
import com.sample.sample.application.extended.timesheetdetails.ITimesheetdetailsAppServiceExtended;
import com.sample.sample.application.extended.timesheetstatus.ITimesheetstatusAppServiceExtended;
import com.sample.sample.commons.logging.LoggingHelper;
import com.sample.sample.restcontrollers.core.TimesheetController;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/timesheet/extended")
public class TimesheetControllerExtended extends TimesheetController {

    public TimesheetControllerExtended(
        ITimesheetAppServiceExtended timesheetAppServiceExtended,
        ITimesheetdetailsAppServiceExtended timesheetdetailsAppServiceExtended,
        ITimesheetstatusAppServiceExtended timesheetstatusAppServiceExtended,
        IUsersAppServiceExtended usersAppServiceExtended,
        LoggingHelper helper,
        Environment env
    ) {
        super(
            timesheetAppServiceExtended,
            timesheetdetailsAppServiceExtended,
            timesheetstatusAppServiceExtended,
            usersAppServiceExtended,
            helper,
            env
        );
    }
    //Add your custom code here

}
