package com.sample.sample.application.core.customer.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateCustomerOutput {

    private Long customerid;
    private String description;
    private Boolean isactive;
    private String name;
}
