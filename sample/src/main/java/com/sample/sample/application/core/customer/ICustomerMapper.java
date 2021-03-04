package com.sample.sample.application.core.customer;

import com.sample.sample.application.core.customer.dto.*;
import com.sample.sample.domain.core.customer.CustomerEntity;
import java.time.*;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICustomerMapper {
    CustomerEntity createCustomerInputToCustomerEntity(CreateCustomerInput customerDto);
    CreateCustomerOutput customerEntityToCreateCustomerOutput(CustomerEntity entity);

    CustomerEntity updateCustomerInputToCustomerEntity(UpdateCustomerInput customerDto);

    UpdateCustomerOutput customerEntityToUpdateCustomerOutput(CustomerEntity entity);

    FindCustomerByIdOutput customerEntityToFindCustomerByIdOutput(CustomerEntity entity);
}
