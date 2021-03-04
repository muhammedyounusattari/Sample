package com.sample.sample.application.extended.appconfiguration;

import com.sample.sample.application.core.appconfiguration.AppConfigurationAppService;
import com.sample.sample.commons.logging.LoggingHelper;
import com.sample.sample.domain.extended.appconfiguration.IAppConfigurationRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("appConfigurationAppServiceExtended")
public class AppConfigurationAppServiceExtended
    extends AppConfigurationAppService
    implements IAppConfigurationAppServiceExtended {

    public AppConfigurationAppServiceExtended(
        IAppConfigurationRepositoryExtended appConfigurationRepositoryExtended,
        IAppConfigurationMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(appConfigurationRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
