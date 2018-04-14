package GUI;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

//import com.sun.org.apache.bcel.internal.generic.LADD;


public class FileReader {

    private static BufferedReader bf;
    private static Map<String, Integer> map;
    private static Map<String, Map<String, Integer>> jobMap;
    private static Map<String, Integer> sJobMap;


    public static Map<String, Integer> readFile(String file){
        System.out.println("File: " + file);

        map = new HashMap<>();
        jobMap = new HashMap<>();
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
                if(jobMap.containsKey(line[10])) {
                    if(jobMap.get(line[10]).containsKey(line[9])){
                        sJobMap.put(line[9], sJobMap.get(line[9])+1);
                        jobMap.put(line[10], sJobMap);
                    }
                    else{
                        sJobMap.put(line[9], 1);
                        jobMap.put(line[10], sJobMap);
                    }
                }
                else{
                    jobMap.put(line[10], new HashMap<>());
                }
            }

            SortedSet<String> keys = new TreeSet<>(jobMap.keySet());
            for(String job: keys){
                System.out.println(job);
                //for(String j: jobMap.get(job).keySet()){
                    //System.out.print(String.format("%-30s%s", "Category: " + job,
                      //      String.format("%-30s%s%n", "Job: " + j, " count: " + jobMap.get(job).get(j))));
                //}
            }

        }
        catch (IOException e){System.exit(4);}
        return map;
    }


}
