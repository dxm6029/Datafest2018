package JavaFiles;

/**
 * Created by samueladams on 4/14/18.
 */
public class State {
    private String state;
    private int numJobs;
    private Job jobs;

    public State (String state, int numJobs, Job jobs){
        this.state = state;
        this.numJobs = numJobs;
        this.jobs = jobs;
    }

    public String getState() {
        return state;
    }

    public int getNumJobs() {
        return numJobs;
    }

    public Job getJobs() {
        return jobs;
    }
}