package com.abdul.main;

public class Job {
	private int jobId;
	private String jobName;
	
	public Job(int jodId,String jobName){
		this.jobId=jodId;
		this.jobName=jobName;
		
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
   public String toString(){
	   return String.format("job id is %d and job name is %s", jobId,jobName);
   }
}
