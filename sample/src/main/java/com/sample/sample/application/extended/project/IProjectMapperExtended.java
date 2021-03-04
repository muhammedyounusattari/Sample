package com.sample.sample.application.extended.project;

import com.sample.sample.application.core.project.IProjectMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IProjectMapperExtended extends IProjectMapper {}
