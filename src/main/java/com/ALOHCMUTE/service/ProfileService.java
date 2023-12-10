package com.ALOHCMUTE.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ALOHCMUTE.entity.Profiles;
import com.ALOHCMUTE.repository.ProfileRepository;

@Service
public class ProfileService{
	@Autowired
    private ProfileRepository profileRepository;
	
	Profiles findProfileByUserId(int userId){
		return profileRepository.findProfileByUsers_UserId(userId);
		
	}
}
