package GUI;


import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Reader {
    private static Map<String, State> States;
    private static Map<String, Integer> Jobs;

    public static void read(String file){
        States = new HashMap<>();
        try {
            InputStream in = new FileInputStream(file);
            BufferedReader bf = new BufferedReader(new InputStreamReader(in));
            bf.readLine();
            String[] line;
            String l;
            while ((l = bf.readLine()) != null) {
                Jobs = new HashMap<>();
                line = l.split(",");
                String state = line[0];
                int numJobs = Integer.parseInt(line[1]);
                for(int i=2; i<line.length; i++){
                    if(i%2 == 0)
                        Jobs.put(line[i], Integer.parseInt(line[i+1]));
                }
                Job job = new Job(Jobs);
                State s = new State(state, numJobs, job);
                States.put(state, s);
            }
        }
        catch (IOException e){System.exit(4);}
    }

    public static int getNumJobs(String state){
        if(States.containsKey(state))
            return States.get(state).getNumJobs();
        else
            return -1;
    }

    public static int getNumSpecificJob(String state, String job){
        if(States.containsKey(state))
            return States.get(state).getJobs().getNumber(job);
        else
            return -1;
    }

    public static void main(String[] args) {
        read(args[0]);
        System.out.println(getNumJobs("IOWA"));
    }
}