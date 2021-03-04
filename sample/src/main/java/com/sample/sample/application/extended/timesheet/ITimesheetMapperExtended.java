package com.sample.sample.application.extended.timesheet;

import com.sample.sample.application.core.timesheet.ITimesheetMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITimesheetMapperExtended extends ITimesheetMapper {}
