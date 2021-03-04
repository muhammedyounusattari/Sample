package com.sample.sample.application.extended.timeofftype;

import com.sample.sample.application.core.timeofftype.TimeofftypeAppService;
import com.sample.sample.commons.logging.LoggingHelper;
import com.sample.sample.domain.extended.timeofftype.ITimeofftypeRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("timeofftypeAppServiceExtended")
public class TimeofftypeAppServiceExtended extends TimeofftypeAppService implements ITimeofftypeAppServiceExtended {

    public TimeofftypeAppServiceExtended(
        ITimeofftypeRepositoryExtended timeofftypeRepositoryExtended,
        ITimeofftypeMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(timeofftypeRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
