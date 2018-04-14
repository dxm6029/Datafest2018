package JavaFiles;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import javafx.application.Application;

import java.io.PrintWriter;
import java.util.*;

import javafx.application.Platform;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class FileReader extends Application{

    private static BufferedReader bf;
    private static Map<String, Integer> map;
    private Map<String, String> params = null;

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

    public void start(Stage mainStage) {

    }

    /*
    initializes board and connects to server
     */
    @Override
    public void init() {
        readFile(getParamNamed("host"));
    }

    private String getParamNamed(String name){
        if (params == null) {
            params = super.getParameters().getNamed();

        }
        if (!params.containsKey(name)) {
            throw new ReversiException(
                    "Parameter '--" + name + "=xxx' missing."
            );
        } else {
            return params.get(name);
        }
    }

    public static void displayMap(){

    }

    public static void main(String[] args) {
        //System.out.println(args[0]);
        //readFile(args[0]);
        Application.launch(args);
    }

}
