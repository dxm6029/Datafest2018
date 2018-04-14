package JavaFiles;

import java.util.HashMap;
import java.util.Map;

public class Job {
    private Map<String, Integer> jobs;

    public Job(Map<String, Integer> jobs){
        this.jobs = jobs;
    }

    public int getTotalJobs(){
        int totalJobs = 0;
        for(int numJob: jobs.values()){
            totalJobs+=numJob;
        }
        return totalJobs;
    }

    public void addJob(String name, int number){
        jobs.put(name, number);
    }

    public int getNumber(String name){
        if(jobs.containsKey(name)){
            return jobs.get(name);
        }
        System.out.println("Cannot find job");
        return -1;
    }
}
