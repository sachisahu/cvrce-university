package com.cvrce.service;

import com.cvrce.dto.LoginDto;

public interface IUserProfileService {

    boolean validateLogin(final LoginDto loginDto);

    boolean saveUser(final LoginDto loginDto);

}
