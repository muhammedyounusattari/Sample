package com.sample.sample.domain.core.appconfiguration;

import java.time.*;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository("appConfigurationRepository")
public interface IAppConfigurationRepository
    extends JpaRepository<AppConfigurationEntity, Long>, QuerydslPredicateExecutor<AppConfigurationEntity> {}
