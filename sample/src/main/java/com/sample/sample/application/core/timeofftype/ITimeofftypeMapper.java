package com.sample.sample.application.core.timeofftype;

import com.sample.sample.application.core.timeofftype.dto.*;
import com.sample.sample.domain.core.timeofftype.TimeofftypeEntity;
import java.time.*;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITimeofftypeMapper {
    TimeofftypeEntity createTimeofftypeInputToTimeofftypeEntity(CreateTimeofftypeInput timeofftypeDto);
    CreateTimeofftypeOutput timeofftypeEntityToCreateTimeofftypeOutput(TimeofftypeEntity entity);

    TimeofftypeEntity updateTimeofftypeInputToTimeofftypeEntity(UpdateTimeofftypeInput timeofftypeDto);

    UpdateTimeofftypeOutput timeofftypeEntityToUpdateTimeofftypeOutput(TimeofftypeEntity entity);

    FindTimeofftypeByIdOutput timeofftypeEntityToFindTimeofftypeByIdOutput(TimeofftypeEntity entity);
}
