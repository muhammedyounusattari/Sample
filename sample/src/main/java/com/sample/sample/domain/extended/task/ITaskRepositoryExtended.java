package com.sample.sample.domain.extended.task;

import com.sample.sample.domain.core.task.ITaskRepository;
import org.springframework.stereotype.Repository;

@Repository("taskRepositoryExtended")
public interface ITaskRepositoryExtended extends ITaskRepository {
    //Add your custom code here
}
