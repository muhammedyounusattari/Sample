package com.sample.sample.application.extended.timesheet;

import com.sample.sample.application.core.timesheet.TimesheetAppService;
import com.sample.sample.commons.logging.LoggingHelper;
import com.sample.sample.domain.extended.authorization.users.IUsersRepositoryExtended;
import com.sample.sample.domain.extended.timesheet.ITimesheetRepositoryExtended;
import com.sample.sample.domain.extended.timesheetstatus.ITimesheetstatusRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("timesheetAppServiceExtended")
public class TimesheetAppServiceExtended extends TimesheetAppService implements ITimesheetAppServiceExtended {

    public TimesheetAppServiceExtended(
        ITimesheetRepositoryExtended timesheetRepositoryExtended,
        ITimesheetstatusRepositoryExtended timesheetstatusRepositoryExtended,
        IUsersRepositoryExtended usersRepositoryExtended,
        ITimesheetMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(
            timesheetRepositoryExtended,
            timesheetstatusRepositoryExtended,
            usersRepositoryExtended,
            mapper,
            logHelper
        );
    }
    //Add your custom code here

}
