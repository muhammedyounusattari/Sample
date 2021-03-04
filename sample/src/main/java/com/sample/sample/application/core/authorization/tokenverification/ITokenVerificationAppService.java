package com.sample.sample.application.core.authorization.tokenverification;

import com.sample.sample.domain.core.authorization.tokenverification.TokenverificationEntity;

public interface ITokenVerificationAppService {
    TokenverificationEntity findByTokenAndType(String token, String type);

    TokenverificationEntity generateToken(String type, Long usersId);

    TokenverificationEntity findByUsersIdAndType(Long usersId, String type);

    void deleteToken(TokenverificationEntity entity);
}
