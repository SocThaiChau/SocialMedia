package com.ALOHCMUTE.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ALOHCMUTE.entity.Profiles;
import com.ALOHCMUTE.entity.Users;
import com.ALOHCMUTE.repository.ProfileRepository;
import com.ALOHCMUTE.service.IProfileService;

@Service
public class ProfileServiceImpl implements IProfileService{
	@Autowired
	ProfileRepository profileRepository;
	
	@Override
	public List<Profiles> findAll(Sort sort) {
		return profileRepository.findAll(sort);
	}

	@Override
	public Page<Profiles> findAll(Pageable pageable) {
		return profileRepository.findAll(pageable);
	}

	@Override
	public List<Profiles> findAll() {
		return profileRepository.findAll();
	}

	@Override
	public Profiles findByUserId(int userId) {
		return profileRepository.findProfileByUsers_UserId(userId);
	}

}
