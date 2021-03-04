package com.sample.sample.application.extended.customer;

import com.sample.sample.application.core.customer.CustomerAppService;
import com.sample.sample.commons.logging.LoggingHelper;
import com.sample.sample.domain.extended.customer.ICustomerRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("customerAppServiceExtended")
public class CustomerAppServiceExtended extends CustomerAppService implements ICustomerAppServiceExtended {

    public CustomerAppServiceExtended(
        ICustomerRepositoryExtended customerRepositoryExtended,
        ICustomerMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(customerRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
