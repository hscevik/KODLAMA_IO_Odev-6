package com.hrms.hrms.business.abstracts;

import java.util.List;

import com.hrms.hrms.entities.concretes.Job;

public interface JobService {
	
	List<Job> getAllJob();
	Job  addJob(Job job);

}
