package com.velocity.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Nominee;
import com.velocity.repository.NomineeRepository;
import com.velocity.service.NomineeService;


	@Service
	public class NomineeServiceImpl implements NomineeService {
	@Autowired
	 private NomineeRepository nomineeRepository;
		@Override
		public Nominee updateNominee(Nominee nominee) {
			Nominee nominee1=nomineeRepository.save(nominee);
			return nominee1;
		}

	}


