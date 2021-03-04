package com.sample.sample.application.extended.timesheetstatus;

import com.sample.sample.application.core.timesheetstatus.TimesheetstatusAppService;
import com.sample.sample.commons.logging.LoggingHelper;
import com.sample.sample.domain.extended.timesheetstatus.ITimesheetstatusRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("timesheetstatusAppServiceExtended")
public class TimesheetstatusAppServiceExtended
    extends TimesheetstatusAppService
    implements ITimesheetstatusAppServiceExtended {

    public TimesheetstatusAppServiceExtended(
        ITimesheetstatusRepositoryExtended timesheetstatusRepositoryExtended,
        ITimesheetstatusMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(timesheetstatusRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
