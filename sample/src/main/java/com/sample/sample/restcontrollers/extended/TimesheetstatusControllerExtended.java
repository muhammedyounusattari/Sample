package com.sample.sample.restcontrollers.extended;

import com.sample.sample.application.extended.timesheet.ITimesheetAppServiceExtended;
import com.sample.sample.application.extended.timesheetstatus.ITimesheetstatusAppServiceExtended;
import com.sample.sample.commons.logging.LoggingHelper;
import com.sample.sample.restcontrollers.core.TimesheetstatusController;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/timesheetstatus/extended")
public class TimesheetstatusControllerExtended extends TimesheetstatusController {

    public TimesheetstatusControllerExtended(
        ITimesheetstatusAppServiceExtended timesheetstatusAppServiceExtended,
        ITimesheetAppServiceExtended timesheetAppServiceExtended,
        LoggingHelper helper,
        Environment env
    ) {
        super(timesheetstatusAppServiceExtended, timesheetAppServiceExtended, helper, env);
    }
    //Add your custom code here

}
