package com.sample.sample.domain.extended.authorization.users;

import com.sample.sample.domain.core.authorization.users.IUsersRepository;
import org.springframework.stereotype.Repository;

@Repository("usersRepositoryExtended")
public interface IUsersRepositoryExtended extends IUsersRepository {
    //Add your custom code here
}
