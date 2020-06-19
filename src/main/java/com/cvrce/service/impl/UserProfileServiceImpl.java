package com.cvrce.service.impl;

import com.cvrce.domain.UserProfileEntity;
import com.cvrce.dto.LoginDto;
import com.cvrce.repository.UserProfileRepository;
import com.cvrce.service.IUserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserProfileServiceImpl implements IUserProfileService {

    @Autowired
    private UserProfileRepository userProfileRepository;


    @Override
    public boolean validateLogin(LoginDto loginDto) {

        Optional<UserProfileEntity> userProfileEntity = userProfileRepository.findByUsernameAndPassword(loginDto.getUsername(), loginDto.getPassword());

        return userProfileEntity.isPresent() ? true : false;
    }

    @Override
    public boolean saveUser(LoginDto loginDto) {

        UserProfileEntity userProfileEntity = new UserProfileEntity();
        userProfileEntity.setAddress(loginDto.getAddress());
        userProfileEntity.setPassword(loginDto.getPassword());
        userProfileEntity.setPhone(loginDto.getPhone());
        userProfileEntity.setUsername(loginDto.getUsername());
        userProfileEntity.setGender(loginDto.getGender());
        userProfileEntity.getName(loginDto.getName());
        //userProfileEntity.getPre(loginDto.getPre());

        userProfileEntity = userProfileRepository.save(userProfileEntity);
        System.out.println(userProfileEntity.getId());
        return true;
    }
}
