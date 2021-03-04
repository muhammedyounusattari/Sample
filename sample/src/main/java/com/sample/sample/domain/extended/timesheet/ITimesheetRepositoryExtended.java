package com.sample.sample.domain.extended.timesheet;

import com.sample.sample.domain.core.timesheet.ITimesheetRepository;
import org.springframework.stereotype.Repository;

@Repository("timesheetRepositoryExtended")
public interface ITimesheetRepositoryExtended extends ITimesheetRepository {
    //Add your custom code here
}
