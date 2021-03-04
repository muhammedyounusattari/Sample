package com.sample.sample.application.extended.timesheetdetails;

import com.sample.sample.application.core.timesheetdetails.TimesheetdetailsAppService;
import com.sample.sample.commons.logging.LoggingHelper;
import com.sample.sample.domain.extended.task.ITaskRepositoryExtended;
import com.sample.sample.domain.extended.timeofftype.ITimeofftypeRepositoryExtended;
import com.sample.sample.domain.extended.timesheet.ITimesheetRepositoryExtended;
import com.sample.sample.domain.extended.timesheetdetails.ITimesheetdetailsRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("timesheetdetailsAppServiceExtended")
public class TimesheetdetailsAppServiceExtended
    extends TimesheetdetailsAppService
    implements ITimesheetdetailsAppServiceExtended {

    public TimesheetdetailsAppServiceExtended(
        ITimesheetdetailsRepositoryExtended timesheetdetailsRepositoryExtended,
        ITaskRepositoryExtended taskRepositoryExtended,
        ITimeofftypeRepositoryExtended timeofftypeRepositoryExtended,
        ITimesheetRepositoryExtended timesheetRepositoryExtended,
        ITimesheetdetailsMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(
            timesheetdetailsRepositoryExtended,
            taskRepositoryExtended,
            timeofftypeRepositoryExtended,
            timesheetRepositoryExtended,
            mapper,
            logHelper
        );
    }
    //Add your custom code here

}
