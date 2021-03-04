package com.sample.sample.application.extended.project;

import com.sample.sample.application.core.project.ProjectAppService;
import com.sample.sample.commons.logging.LoggingHelper;
import com.sample.sample.domain.extended.customer.ICustomerRepositoryExtended;
import com.sample.sample.domain.extended.project.IProjectRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("projectAppServiceExtended")
public class ProjectAppServiceExtended extends ProjectAppService implements IProjectAppServiceExtended {

    public ProjectAppServiceExtended(
        IProjectRepositoryExtended projectRepositoryExtended,
        ICustomerRepositoryExtended customerRepositoryExtended,
        IProjectMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(projectRepositoryExtended, customerRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
