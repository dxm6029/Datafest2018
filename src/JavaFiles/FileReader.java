package JavaFiles;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileReader {

    private static BufferedReader bf;
    private static Map<String, Integer> map;

    public static void readFile (String file){
        map = new HashMap<>();

        try {
            InputStream in = new FileInputStream("newData/data.txt");
            BufferedReader bf = new BufferedReader(new InputStreamReader(in));
            //bf = new BufferedReader(new FileReader(new FileOutputStream("testFiles/Data.txt")));
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

            }
            for (String s : map.keySet()){
                System.out.println("State: " + s + "    count: " + map.get(s));
            }

        }
        catch (IOException e){System.exit(4);}

    }

    public static void main(String[] args) {
        System.out.println(args[0]);
        readFile(args[0]);
    }

}
