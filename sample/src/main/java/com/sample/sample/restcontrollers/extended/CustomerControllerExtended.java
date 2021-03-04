package com.sample.sample.restcontrollers.extended;

import com.sample.sample.application.extended.customer.ICustomerAppServiceExtended;
import com.sample.sample.application.extended.project.IProjectAppServiceExtended;
import com.sample.sample.commons.logging.LoggingHelper;
import com.sample.sample.restcontrollers.core.CustomerController;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer/extended")
public class CustomerControllerExtended extends CustomerController {

    public CustomerControllerExtended(
        ICustomerAppServiceExtended customerAppServiceExtended,
        IProjectAppServiceExtended projectAppServiceExtended,
        LoggingHelper helper,
        Environment env
    ) {
        super(customerAppServiceExtended, projectAppServiceExtended, helper, env);
    }
    //Add your custom code here

}
