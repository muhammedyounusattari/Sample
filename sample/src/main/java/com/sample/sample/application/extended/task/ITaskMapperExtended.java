package com.sample.sample.application.extended.task;

import com.sample.sample.application.core.task.ITaskMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITaskMapperExtended extends ITaskMapper {}
