package com.hrms.hrms.business.abstracts;

import java.util.List;

import com.hrms.hrms.entities.concretes.Candidate;

public interface CandidateService {

	List<Candidate> getCandidateAll();
	Candidate addCandidate(Candidate candidate);
}
