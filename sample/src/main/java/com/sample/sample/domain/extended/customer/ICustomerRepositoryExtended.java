package com.sample.sample.domain.extended.customer;

import com.sample.sample.domain.core.customer.ICustomerRepository;
import org.springframework.stereotype.Repository;

@Repository("customerRepositoryExtended")
public interface ICustomerRepositoryExtended extends ICustomerRepository {
    //Add your custom code here
}
