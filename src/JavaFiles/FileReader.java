package JavaFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FileReader {

    private BufferedReader bf;
    private Map<String, Integer> map;

    public void readFile (){
        map = new HashMap<>();

        try {
            bf = new BufferedReader(new java.io.FileReader("datafest2018-Updated-April12.csv"));
            bf.readLine();
            String [] line = bf.readLine().split(",");
//            while (line != null){
//                if(map.containsKey(line)) {
//                    map.put(line[4], map.get(line)+1);
//                }
//                else{
//                    map.put(line[4], 1);
//                }
//            }
            for (int i = 0; i < 1000; i++){
                if(map.containsKey(line)) {
                    map.put(line[4], map.get(line)+1);
                }
                else{
                    map.put(line[4], 1);
                }
            }

        }
        catch (IOException e){System.exit(1);}



    }

}
