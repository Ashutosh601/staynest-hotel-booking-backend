package com.ashutosh.airBnbApp.service;

import com.ashutosh.airBnbApp.dto.ProfileUpdateRequestDto;
import com.ashutosh.airBnbApp.dto.UserDto;
import com.ashutosh.airBnbApp.entity.User;

public interface UserService {

    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();
}
