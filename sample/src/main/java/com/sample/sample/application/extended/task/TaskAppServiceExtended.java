package com.sample.sample.application.extended.task;

import com.sample.sample.application.core.task.TaskAppService;
import com.sample.sample.commons.logging.LoggingHelper;
import com.sample.sample.domain.extended.project.IProjectRepositoryExtended;
import com.sample.sample.domain.extended.task.ITaskRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("taskAppServiceExtended")
public class TaskAppServiceExtended extends TaskAppService implements ITaskAppServiceExtended {

    public TaskAppServiceExtended(
        ITaskRepositoryExtended taskRepositoryExtended,
        IProjectRepositoryExtended projectRepositoryExtended,
        ITaskMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(taskRepositoryExtended, projectRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
