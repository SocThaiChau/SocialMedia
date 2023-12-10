package com.ALOHCMUTE.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.ALOHCMUTE.entity.Profiles;
import com.ALOHCMUTE.entity.Users;


public interface IProfileService {

    List<Profiles> findAll(Sort sort);

    Page<Profiles> findAll(Pageable pageable);

    List<Profiles> findAll();

	Profiles findByUserId(int userId);



}
