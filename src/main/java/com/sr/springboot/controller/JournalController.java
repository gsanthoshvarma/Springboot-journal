package com.sr.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sr.springboot.domain.Journal;
import com.sr.springboot.repository.JournalRepository;

@RestController
public class JournalController {

	@Autowired
	private JournalRepository journalRepository;
	
	@GetMapping("/")
	public ResponseEntity<List<Journal>> index() {
		List<Journal> journals = journalRepository.findAll();
		return new ResponseEntity<>(journals, HttpStatus.OK);
	}
}
