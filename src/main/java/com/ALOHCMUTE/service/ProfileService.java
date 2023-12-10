package com.ALOHCMUTE.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ALOHCMUTE.entity.Profiles;
import com.ALOHCMUTE.repository.ProfileRepository;

@Service
public class ProfileService implements IProfileService{
	@Autowired
    private ProfileRepository profileRepository;
	
	@Autowired
    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }
	
	Profiles findProfileByUserId(int userId){
		return profileRepository.findByUsersUserId(userId);
		
	}
	
	@Override
	public List<Profiles> findAll() {
		return profileRepository.findAll();
	}

	@Override
	public List<Profiles> findAll(Sort sort) {
		return profileRepository.findAll(sort);
	}

	@Override
	public Page<Profiles> findAll(Pageable pageable) {
		return profileRepository.findAll(pageable);
	}


	@Override
	public Profiles findByUserId(int userId) {
		return profileRepository.findByUsersUserId(userId);
	}
}
