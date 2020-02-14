package com.sr.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sr.springboot.domain.Journal;

@Repository
public interface JournalRepository extends JpaRepository<Journal, Long> {

}
