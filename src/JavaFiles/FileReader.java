package JavaFiles;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
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
    private static Map<String, Integer> njobMap;
    private static Map<String, Map<String, Integer>> jobMap;
    private static Map<String, Integer> sJobMap;
    private Stage mainStage;

    private int colSize = 75;
    private int rowSize = 75;

    private Map<String, String> params = null;

    public static void readFile(String file){
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
            /*
            //for (String s : map.keySet()){
            //    System.out.println("State: " + s + "    count: " + map.get(s));
            //}
            SortedSet<String> keys = new TreeSet<>(jobMap.keySet());
            System.out.println("START");
            for(String job: keys){
                for(String j: jobMap.get(job).keySet()){
                    System.out.print(String.format("%-30s%s", "Category: " + job,
                            String.format("%-30s%s%n", "Job: " + j, " count: " + jobMap.get(job).get(j))));
                }
            }
            */
        }
        catch (IOException e){System.exit(4);}

    }

    private GridPane makeGridPane(int cols, int rows){
        GridPane grid = new GridPane();
        for(int x = 0; x < cols; x ++){
            for(int y = 0; y < rows; y++){
                Label label = new Label();
                label.setMaxSize(colSize,rowSize);
                label.setMinSize(colSize,rowSize);
                switch(x){
                    case 0:
                        if(y == 0){ label.setText("AK"); }
                        else if(y == 7){ label.setText("HI"); }
                        break;
                    case 1:
                        switch(y){
                            case 2:
                                label.setText("WA");
                                break;
                            case 3:
                                label.setText("OR");
                                break;
                            case 4:
                                label.setText("CA");
                                break;
                        }
                        break;
                    case 2:
                        switch (y){
                            case 2:
                                label.setText("ID");
                                break;
                            case 3:
                                label.setText("NV");
                                break;
                            case 4:
                                label.setText("UT");
                                break;
                            case 5:
                                label.setText("AZ");
                                break;
                        }
                        break;
                    case 3:
                        switch (y){
                            case 2:
                                label.setText("MT");
                                break;
                            case 3:
                                label.setText("WY");
                                break;
                            case 4:
                                label.setText("CO");
                                break;
                            case 5:
                                label.setText("NM");
                                break;
                        }
                        break;
                    case 4:
                        switch (y){
                            case 2:
                                label.setText("ND");
                                break;
                            case 3:
                                label.setText("SD");
                                break;
                            case 4:
                                label.setText("NA");
                                break;
                            case 5:
                                label.setText("KA");
                                break;
                            case 6:
                                label.setText("OK");
                                break;
                            case 7:
                                label.setText("TX");
                                break;
                        }
                        break;
                    case 5:
                        switch (y){
                            case 2:
                                label.setText("MI");
                                break;
                            case 3:
                                label.setText("IA");
                                break;
                        }
                }
                grid.add(label, x, y);
            }
        }
        return grid;
    }

    public void start(Stage mainStage) {
        System.out.println("HI");
        this.mainStage = mainStage;
        final int COLUMNS = 12;
        final int ROWS = 8;
        mainStage.setTitle("Data");
        BorderPane totalPane = new BorderPane();
        GridPane statePane = makeGridPane(COLUMNS, ROWS);
        totalPane.setCenter(statePane);
        mainStage.setScene(new Scene(totalPane));
        mainStage.show();
        mainStage.setAlwaysOnTop(true);
        mainStage.setResizable(false);
    }

    /*
    initializes board and connects to server
     */
    @Override
    public void init() throws java.lang.Exception{
        readFile(getParamNamed("file"));
    }

    private String getParamNamed(String name)throws java.lang.Exception{
        if (params == null) {
            params = super.getParameters().getNamed();

        }
        if (!params.containsKey(name)) {
            throw new Exception(
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
