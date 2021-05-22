package com.hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.hrms.business.abstracts.JobService;
import com.hrms.hrms.dataAccess.abstracts.JobDao;
import com.hrms.hrms.entities.concretes.Job;

@Service
public class JobManager implements JobService{

 private JobDao jobDao;
 
	@Autowired	
	public JobManager(JobDao jobDao) {
	super();
	this.jobDao = jobDao;
}

	@Override
	public List<Job> getAllJob() {
		// TODO Auto-generated method stub
		return this.jobDao.findAll();
	}

	@Override
	public Job addJob(Job job) {
		// TODO Auto-generated method stub
		return this.jobDao.save(job);
	}

}
