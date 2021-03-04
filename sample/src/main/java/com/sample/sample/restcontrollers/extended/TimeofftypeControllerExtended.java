package com.sample.sample.restcontrollers.extended;

import com.sample.sample.application.extended.timeofftype.ITimeofftypeAppServiceExtended;
import com.sample.sample.application.extended.timesheetdetails.ITimesheetdetailsAppServiceExtended;
import com.sample.sample.commons.logging.LoggingHelper;
import com.sample.sample.restcontrollers.core.TimeofftypeController;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/timeofftype/extended")
public class TimeofftypeControllerExtended extends TimeofftypeController {

    public TimeofftypeControllerExtended(
        ITimeofftypeAppServiceExtended timeofftypeAppServiceExtended,
        ITimesheetdetailsAppServiceExtended timesheetdetailsAppServiceExtended,
        LoggingHelper helper,
        Environment env
    ) {
        super(timeofftypeAppServiceExtended, timesheetdetailsAppServiceExtended, helper, env);
    }
    //Add your custom code here

}
