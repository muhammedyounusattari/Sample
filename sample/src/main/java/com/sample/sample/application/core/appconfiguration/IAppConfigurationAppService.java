package com.sample.sample.application.core.appconfiguration;

import com.sample.sample.application.core.appconfiguration.dto.*;
import com.sample.sample.commons.search.SearchCriteria;
import java.util.*;
import org.springframework.data.domain.Pageable;

public interface IAppConfigurationAppService {
    //CRUD Operations

    CreateAppConfigurationOutput create(CreateAppConfigurationInput appconfiguration);

    void delete(Long id);

    UpdateAppConfigurationOutput update(Long id, UpdateAppConfigurationInput input);

    FindAppConfigurationByIdOutput findById(Long id);

    List<FindAppConfigurationByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;
    //Join Column Parsers
}
