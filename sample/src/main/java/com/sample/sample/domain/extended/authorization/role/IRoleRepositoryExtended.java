package com.sample.sample.domain.extended.authorization.role;

import com.sample.sample.domain.core.authorization.role.IRoleRepository;
import org.springframework.stereotype.Repository;

@Repository("roleRepositoryExtended")
public interface IRoleRepositoryExtended extends IRoleRepository {
    //Add your custom code here
}
