package com.hrms.hrms.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.hrms.business.abstracts.CandidateService;
import com.hrms.hrms.dataAccess.abstracts.CandidateDao;
import com.hrms.hrms.dataAccess.abstracts.UserDao;
import com.hrms.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService{

private	CandidateDao candidateDao;
	
	
	@Autowired
	public CandidateManager(UserDao userDao,CandidateDao candidateDao) {
		this.candidateDao = candidateDao;
	}


	@Override
	
	public List<Candidate> getCandidateAll() {
		// TODO Auto-generated method stub
		return this.candidateDao.findAll();
	}


	@Override
	
	public Candidate addCandidate(Candidate candidate) {
		// TODO Auto-generated method stub
		
		return this.candidateDao.save(candidate);
		
	}

}
