package com.Rock.springboot;

import org.springframework.batch.item.ItemProcessor;

import com.Rock.springboot.model.JobDetails;

public class JobDetailsItemProcessor implements ItemProcessor<JobDetails, JobDetails>{

	
	public JobDetails process(JobDetails result) throws Exception {
		System.out.println("Processing result :"+result);
		
		/*
		 * Only return results which are more than 75%
		 * 
		 */
		
		
		return result;
	}

}
