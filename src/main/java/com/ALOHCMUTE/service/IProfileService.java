package com.ALOHCMUTE.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.ALOHCMUTE.entity.Profiles;


public interface IProfileService {
	void deleteAll();

    void delete(Profiles entity);

    void deleteById(Integer id);

    long count();

    Optional<Profiles> findById(Integer id);

    List<Profiles> findAllById(Iterable<Integer> ids);

    List<Profiles> findAll(Sort sort);

    Page<Profiles> findAll(Pageable pageable);

    List<Profiles> findAll();

    <S extends Profiles> S save(S entity);
}
