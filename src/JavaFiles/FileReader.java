package JavaFiles;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class FileReader {

    private static BufferedReader bf;
    private static Map<String, Integer> map;
    private static Map<String, Integer> njobMap;
    private static Map<String, Map<String, Integer>> jobMap;
    private static Map<String, Integer> sJobMap;

    public static void readFile(String file){
        map = new HashMap<>();
        njobMap = new HashMap<>();
        sJobMap = new HashMap<>();
        try {
            InputStream in = new FileInputStream(file);
            BufferedReader bf = new BufferedReader(new InputStreamReader(in));
            bf.readLine();
            String [] line = bf.readLine().split(",");
            String l;
            while ((l = bf.readLine()) !=null){
                line = l.split(",");
                if(map.containsKey(line[4])) {
                    map.put(line[4], map.get(line[4])+1);
                }
                else{
                    map.put(line[4], 1);
                }
                if(njobMap.containsKey(line[10])) {
                    njobMap.put(line[10], njobMap.get(line[10])+1);
                }
                else{
                    njobMap.put(line[10], 1);
                }
                if(sJobMap.containsKey(line[9])) {
                    sJobMap.put(line[9], sJobMap.get(line[9])+1);
                }
                else{
                    sJobMap.put(line[9], 1);
                }

            }
            //for (String s : map.keySet()){
            //    System.out.println("State: " + s + "    count: " + map.get(s));
            //}
            SortedSet<String> keys = new TreeSet<>(jobMap.keySet());
            for(String job: keys){
                System.out.print(String.format("%-30s%s%n", "Job: " + job, " count: " + jobMap.get(job)));
                //System.out.println("Job: " + job + " count: " + jobMap.get(job) );
            }

        }
        catch (IOException e){System.exit(4);}

    }

    public static void main(String[] args) {
        System.out.println(args[0]);
        readFile(args[0]);
    }

}
