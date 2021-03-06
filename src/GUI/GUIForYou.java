package GUI;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.awt.*;
import java.util.*;

public class GUIForYou extends Application{

    private int size = 75;
    private Map<String, String> params = null;
    private GridPane grid;
    final int COLUMNS = 12;
    final int ROWS = 9;
    private StateLabel [][] labels = new StateLabel[COLUMNS][ROWS];
    private Map<String, Integer> map;
    private int mostJobs;

    private GridPane makeGridPane(int cols, int rows, Map<String, Integer> jobs){
        grid = new GridPane();

        for(int x = 0; x < cols; x ++){
            for(int y = 0; y < rows; y++){
                Label label = new Label();
                label.setMaxSize(size,size);
                label.setMinSize(size,size);
                System.out.println("" + x +" " + y);
                switch(x){
                    case 0:
                        if(y == 0){
                            label.setText("AK");
                            label.setAlignment(Pos.CENTER);
                            if(jobs.containsKey("AK")) {
                                colorize(label, jobs.get("AK").intValue());
                                label.setTextFill(Paint.valueOf("white"));
                            }

                        }
                        else if(y == 8){ label.setText("HI");
                            label.setAlignment(Pos.CENTER);
                            if(jobs.containsKey("HI")) {
                                colorize(label, jobs.get("HI").intValue());
                                label.setTextFill(Paint.valueOf("white"));
                            }
                        }
                        break;
                    case 1:
                        switch(y){
                            case 2:
                                label.setText("WA");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("WA")) {
                                    colorize(label, jobs.get("WA").intValue());
                                    label.setTextFill(Paint.valueOf("white"));

                                }
                                break;
                            case 3:
                                label.setText("OR");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("OR")) {
                                    colorize(label, jobs.get("OR").intValue());
                                    label.setTextFill(Paint.valueOf("white"));
                                }
                                break;
                            case 4:
                                label.setText("CA");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("CA")) {
                                    colorize(label, jobs.get("CA").intValue());
                                    label.setTextFill(Paint.valueOf("white"));
                                }
                                break;
                        }
                        break;
                    case 2:
                        switch (y){
                            case 2:
                                label.setText("ID");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("ID")) {
                                    colorize(label, jobs.get("ID").intValue());
                                    label.setTextFill(Paint.valueOf("white"));
                                }
                                break;
                            case 3:
                                label.setText("NV");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("NV")) {
                                    label.setTextFill(Paint.valueOf("white"));
                                    colorize(label, jobs.get("NV").intValue());
                                }
                                break;
                            case 4:
                                label.setText("UT");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("UT")) {
                                    label.setTextFill(Paint.valueOf("white"));
                                    colorize(label, jobs.get("UT").intValue());
                                }
                                break;
                            case 5:
                                label.setText("AZ");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("AZ")) {
                                    label.setTextFill(Paint.valueOf("white"));
                                    colorize(label, jobs.get("AZ").intValue());
                                }
                                break;
                        }
                        break;
                    case 3:
                        switch (y){
                            case 2:
                                label.setText("MT");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("MT")) {
                                    label.setTextFill(Paint.valueOf("white"));
                                    colorize(label, jobs.get("MT").intValue());
                                }
                                break;
                            case 3:
                                label.setText("WY");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("WY")) {
                                    label.setTextFill(Paint.valueOf("white"));
                                    colorize(label, jobs.get("WY").intValue());
                                }
                                break;
                            case 4:
                                label.setText("CO");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("CO")) {
                                    colorize(label, jobs.get("CO").intValue());
                                    label.setTextFill(Paint.valueOf("white"));
                                }
                                break;
                            case 5:
                                label.setText("NM");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("NM")) {
                                    label.setTextFill(Paint.valueOf("white"));
                                    colorize(label, jobs.get("NM").intValue());
                                }
                                break;
                        }
                        break;
                    case 4:
                        switch (y){
                            case 2:
                                label.setText("ND");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("ND")) {
                                    label.setTextFill(Paint.valueOf("white"));
                                    colorize(label, jobs.get("ND").intValue());
                                }
                                break;
                            case 3:
                                label.setText("SD");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("SD")) {
                                    label.setTextFill(Paint.valueOf("white"));
                                    colorize(label, jobs.get("SD").intValue());
                                }
                                break;
                            case 4:
                                label.setText("NB");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("NB")) {
                                    label.setTextFill(Paint.valueOf("white"));
                                    colorize(label, jobs.get("NB").intValue());
                                }
                                break;
                            case 5:
                                label.setText("KS");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("KS")) {
                                    label.setTextFill(Paint.valueOf("white"));
                                    colorize(label, jobs.get("KS").intValue());
                                }
                                break;
                            case 6:
                                label.setText("OK");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("OK")) {
                                    label.setTextFill(Paint.valueOf("white"));
                                    colorize(label, jobs.get("OK").intValue());
                                }
                                break;
                            case 7:
                                label.setText("TX");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("TX")) {
                                    label.setTextFill(Paint.valueOf("white"));
                                    colorize(label, jobs.get("TX").intValue());
                                }
                                break;
                        }
                        break;
                    case 5:
                        switch (y){
                            case 2:
                                label.setText("MI");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("MI")) {
                                    label.setTextFill(Paint.valueOf("white"));
                                    colorize(label, jobs.get("MI").intValue());
                                }
                                break;
                            case 3:
                                label.setText("IA");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("IA")) {
                                    label.setTextFill(Paint.valueOf("white"));
                                    colorize(label, jobs.get("IA").intValue());
                                }
                                break;
                            case 4:
                                label.setText("MO");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("MO")) {
                                    label.setTextFill(Paint.valueOf("white"));
                                    colorize(label, jobs.get("MO").intValue());
                                }
                                break;
                            case 5:
                                label.setText("AR");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("AR")) {
                                    label.setTextFill(Paint.valueOf("white"));
                                    colorize(label, jobs.get("AR").intValue());
                                }
                                break;
                            case 6:
                                label.setText("LA");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("LA")) {
                                    label.setTextFill(Paint.valueOf("white"));
                                    colorize(label, jobs.get("LA").intValue());
                                }
                                break;
                        }
                        break;
                    case 6:
                        switch (y){
                            case 2:
                                label.setText("IL");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("IL")) {
                                    label.setTextFill(Paint.valueOf("white"));
                                    colorize(label, jobs.get("IL").intValue());
                                }
                                break;
                            case 3:
                                label.setText("IN");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("IN")) {
                                    label.setTextFill(Paint.valueOf("white"));
                                    colorize(label, jobs.get("IN").intValue());
                                }
                                break;
                            case 4:
                                label.setText("KY");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("KY")) {
                                    label.setTextFill(Paint.valueOf("white"));
                                    colorize(label, jobs.get("KY").intValue());
                                }
                                break;
                            case 5:
                                label.setText("TN");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("TN")) {
                                    label.setTextFill(Paint.valueOf("white"));
                                    colorize(label, jobs.get("TN").intValue());
                                }
                                break;
                            case 6:
                                label.setText("MS");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("MS")) {
                                    label.setTextFill(Paint.valueOf("white"));
                                    colorize(label, jobs.get("MS").intValue());
                                }
                                break;
                        }
                        break;
                    case 7:
                        switch (y){
                            case 2:
                                label.setText("WI");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("WI")) {
                                    colorize(label, jobs.get("WI").intValue());
                                    label.setTextFill(Paint.valueOf("white"));
                                }
                                break;
                            case 3:
                                label.setText("OH");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("OH")) {
                                    colorize(label, jobs.get("OH").intValue());
                                    label.setTextFill(Paint.valueOf("white"));
                                }
                                break;
                            case 4:
                                label.setText("WV");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("WV")) {
                                    colorize(label, jobs.get("WV").intValue());
                                    label.setTextFill(Paint.valueOf("white"));
                                }
                                break;
                            case 5:
                                label.setText("NC");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("NC")) {
                                    colorize(label, jobs.get("NC").intValue());
                                    label.setTextFill(Paint.valueOf("white"));
                                }
                                break;
                            case 6:
                                label.setText("AL");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("AL")) {
                                    colorize(label, jobs.get("AL").intValue());
                                    label.setTextFill(Paint.valueOf("white"));
                                }
                                break;
                        }
                        break;
                    case 8:
                        switch (y){
                            case 2:
                                label.setText("MI");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("MI")) {
                                    colorize(label, jobs.get("MI").intValue());
                                    label.setTextFill(Paint.valueOf("white"));
                                }
                                break;
                            case 3:
                                label.setText("PA");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("PA")) {
                                    colorize(label, jobs.get("PA").intValue());
                                    label.setTextFill(Paint.valueOf("white"));
                                }
                                break;
                            case 4:
                                label.setText("VA");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("VA")) {
                                    colorize(label, jobs.get("VA").intValue());
                                    label.setTextFill(Paint.valueOf("white"));
                                }
                                break;
                            case 5:
                                label.setText("SC");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("SC")) {
                                    colorize(label, jobs.get("SC").intValue());
                                    label.setTextFill(Paint.valueOf("white"));
                                }
                                break;
                            case 6:
                                label.setText("GA");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("GA")) {
                                    colorize(label, jobs.get("GA").intValue());
                                    label.setTextFill(Paint.valueOf("white"));
                                }
                                break;
                        }
                        break;
                    case 9:
                        switch (y){
                            case 2:
                                label.setText("NY");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("NY")) {
                                    colorize(label, jobs.get("NY").intValue());
                                    label.setTextFill(Paint.valueOf("white"));
                                }
                                break;
                            case 3:
                                label.setText("NJ");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("NJ")) {
                                    colorize(label, jobs.get("NJ").intValue());
                                    label.setTextFill(Paint.valueOf("white"));
                                }
                                break;
                            case 4:
                                label.setText("MD");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("MD")) {
                                    colorize(label, jobs.get("MD").intValue());
                                    label.setTextFill(Paint.valueOf("white"));
                                }
                                break;
                            case 5:
                                label.setText("D.C.");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("DC")) {
                                    colorize(label, jobs.get("DC").intValue());
                                    label.setTextFill(Paint.valueOf("white"));
                                }
                                break;

                            case 7:
                                label.setText("FL");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("FL")) {
                                    colorize(label, jobs.get("FL").intValue());
                                    label.setTextFill(Paint.valueOf("white"));
                                }
                                break;
                        }
                        break;
                    case 10:
                        switch (y){
                            case 1:
                                label.setText("VT");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("VT")) {
                                    colorize(label, jobs.get("VT").intValue());
                                    label.setTextFill(Paint.valueOf("white"));
                                }
                                break;
                            case 2:
                                label.setText("RI");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("RI")) {
                                    colorize(label, jobs.get("RI").intValue());
                                    label.setTextFill(Paint.valueOf("white"));
                                }
                                break;
                            case 3:
                                label.setText("CT");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("CT")) {
                                    colorize(label, jobs.get("CT").intValue());
                                    label.setTextFill(Paint.valueOf("white"));
                                }
                                break;
                            case 4:
                                label.setText("DE");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("DE")) {
                                    colorize(label, jobs.get("DE").intValue());
                                    label.setTextFill(Paint.valueOf("white"));
                                }
                                break;
                        }
                        break;
                    case 11:
                        switch (y){
                            case 0:
                                label.setText("ME");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("ME")) {
                                    colorize(label, jobs.get("ME").intValue());
                                    label.setTextFill(Paint.valueOf("white"));
                                }
                                break;
                            case 1:
                                label.setText("NH");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("NH")) {
                                    colorize(label, jobs.get("NH").intValue());
                                    label.setTextFill(Paint.valueOf("white"));
                                }
                                break;
                            case 2:
                                label.setText("MA");
                                label.setAlignment(Pos.CENTER);
                                if(jobs.containsKey("MA")) {
                                    colorize(label, jobs.get("MA").intValue());
                                    label.setTextFill(Paint.valueOf("white"));
                                }
                                break;
                        }
                        break;
                }
                grid.add(label, x, y);
                //labels[x][y] = label;
            }
        }
        return grid;
    }


    private void colorize(Label label, int num) {
        String[] c;

        c = new String[6];
        c[0] = "darkgreen";
        c[1] = "green";
        c[2] = "lightgreen";
        c[3] = "lightblue";
        c[4] = "blue";
        c[5] = "darkblue";

        double incNum = mostJobs / 6;

        if (num < incNum*.5)
            label.setStyle("-fx-background-color: " + c[0]);
        else if (num < incNum )
            label.setStyle("-fx-background-color: " + c[1]);
        else if (num < incNum * 2)
            label.setStyle("-fx-background-color: " + c[2]);
        else if (num < incNum * 3)
            label.setStyle("-fx-background-color: " + c[3]);
        else if (num < incNum * 4)
            label.setStyle("-fx-background-color: " + c[4]);
        else
            label.setStyle("-fx-background-color: " + c[5]);
    }


    public void start(Stage mainStage) {
        System.out.println("HI");
        mainStage.setTitle("Data");
        BorderPane totalPane = new BorderPane();
        Map<String, GUI.State> mapy = new HashMap<>();
        System.out.println(map);
        GridPane statesPane = makeGridPane(COLUMNS, ROWS, map);
        totalPane.setCenter(statesPane);
        HBox hbox = new HBox();
        hbox.getChildren().add(new Label("Least Jobs"));
        String[] c = new String[6];
        c[0] = "darkgreen";
        c[1] = "green";
        c[2] = "lightgreen";
        c[3] = "lightblue";
        c[4] = "blue";
        c[5] = "darkblue";
        for(String color: c){
            Label label = new Label();
            label.setStyle("-fx-background-color: " + color);
            label.setMaxSize(25, 25);
            label.setMinSize(25, 25);
            hbox.getChildren().add(label);
        }
        hbox.getChildren().add(new Label("Most Jobs"));
        hbox.setAlignment(Pos.BOTTOM_RIGHT);
        totalPane.setBottom(hbox);
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
        FileReader fr = new FileReader();
        map = fr.readFile(getParamNamed("file"));
        System.out.println(map);
        getMostJobs(map);
        System.out.println(map);

    }

    private void getMostJobs(Map<String, Integer> mapy){
        int hold = 0;
        Iterator it = mapy.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            Integer temp = (Integer)pair.getValue();
            if(temp.intValue() > hold)
                hold = temp.intValue();
            //it.remove();//avoid exception
        }
        mostJobs = hold;
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



    public void displayMap(int row, int col , int count){
        labels[row][col].colorChange(count);
    }

    public static void main(String[] args) {
        //System.out.println(args[0]);
        //readFile(args[0]);
        Application.launch(args);
    }


}
