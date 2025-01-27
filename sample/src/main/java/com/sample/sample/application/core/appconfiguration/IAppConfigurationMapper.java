package com.sample.sample.application.core.appconfiguration;

import com.sample.sample.application.core.appconfiguration.dto.*;
import com.sample.sample.domain.core.appconfiguration.AppConfigurationEntity;
import java.time.*;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IAppConfigurationMapper {
    AppConfigurationEntity createAppConfigurationInputToAppConfigurationEntity(
        CreateAppConfigurationInput appconfigurationDto
    );
    CreateAppConfigurationOutput appConfigurationEntityToCreateAppConfigurationOutput(AppConfigurationEntity entity);

    AppConfigurationEntity updateAppConfigurationInputToAppConfigurationEntity(
        UpdateAppConfigurationInput appConfigurationDto
    );

    UpdateAppConfigurationOutput appConfigurationEntityToUpdateAppConfigurationOutput(AppConfigurationEntity entity);

    FindAppConfigurationByIdOutput appConfigurationEntityToFindAppConfigurationByIdOutput(
        AppConfigurationEntity entity
    );
}
