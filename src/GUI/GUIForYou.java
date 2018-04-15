package GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

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
                            //GUI.State state = jobs.get("AK");
                            System.out.println(jobs);
                            if(jobs.containsKey("AK"))
                                colorize(label, jobs.get("AK").intValue());
                        }
                        else if(y == 8){ label.setText("HI");
                            if(jobs.containsKey("HI"))
                                colorize(label, jobs.get("HI").intValue());
                        }
                        break;
                    case 1:
                        switch(y){
                            case 2:
                                label.setText("WA");
                                if(jobs.containsKey("WA"))
                                    colorize(label, jobs.get("WA").intValue());
                                break;
                            case 3:
                                label.setText("OR");
                                if(jobs.containsKey("OR"))
                                    colorize(label, jobs.get("OR").intValue());
                                break;
                            case 4:
                                label.setText("CA");
                                if(jobs.containsKey("CA"))
                                    colorize(label, jobs.get("CA").intValue());
                                break;
                        }
                        break;
                    case 2:
                        switch (y){
                            case 2:
                                label.setText("ID");
                                if(jobs.containsKey("ID"))
                                    colorize(label, jobs.get("ID").intValue());
                                break;
                            case 3:
                                label.setText("NV");
                                if(jobs.containsKey("NV"))
                                    colorize(label, jobs.get("NV").intValue());
                                break;
                            case 4:
                                label.setText("UT");
                                if(jobs.containsKey("UT"))
                                    colorize(label, jobs.get("UT").intValue());
                                break;
                            case 5:
                                label.setText("AZ");
                                if(jobs.containsKey("AZ"))
                                    colorize(label, jobs.get("AZ").intValue());
                                break;
                        }
                        break;
                    case 3:
                        switch (y){
                            case 2:
                                label.setText("MT");
                                if(jobs.containsKey("MT"))
                                    colorize(label, jobs.get("MT").intValue());
                                break;
                            case 3:
                                label.setText("WY");
                                if(jobs.containsKey("WY"))
                                    colorize(label, jobs.get("WY").intValue());
                                break;
                            case 4:
                                label.setText("CO");
                                if(jobs.containsKey("CO"))
                                    colorize(label, jobs.get("CO").intValue());
                                break;
                            case 5:
                                label.setText("NM");
                                if(jobs.containsKey("NM"))
                                    colorize(label, jobs.get("NM").intValue());
                                break;
                        }
                        break;
                    case 4:
                        switch (y){
                            case 2:
                                label.setText("ND");
                                if(jobs.containsKey("ND"))
                                    colorize(label, jobs.get("ND").intValue());
                                break;
                            case 3:
                                label.setText("SD");
                                if(jobs.containsKey("SD"))
                                    colorize(label, jobs.get("SD").intValue());
                                break;
                            case 4:
                                label.setText("NB");
                                if(jobs.containsKey("NB"))
                                    colorize(label, jobs.get("NB").intValue());
                                break;
                            case 5:
                                label.setText("KS");
                                if(jobs.containsKey("KS"))
                                    colorize(label, jobs.get("KS").intValue());
                                break;
                            case 6:
                                label.setText("OK");
                                if(jobs.containsKey("OK"))
                                    colorize(label, jobs.get("OK").intValue());
                                break;
                            case 7:
                                label.setText("TX");
                                if(jobs.containsKey("TX"))
                                    colorize(label, jobs.get("TX").intValue());
                                break;
                        }
                        break;
                    case 5:
                        switch (y){
                            case 2:
                                label.setText("MI");
                                if(jobs.containsKey("MI"))
                                    colorize(label, jobs.get("MI").intValue());
                                break;
                            case 3:
                                label.setText("IA");
                                if(jobs.containsKey("IA"))
                                    colorize(label, jobs.get("IA").intValue());
                                break;
                            case 4:
                                label.setText("MO");
                                if(jobs.containsKey("MO"))
                                    colorize(label, jobs.get("MO").intValue());
                                break;
                            case 5:
                                label.setText("AR");
                                if(jobs.containsKey("AR"))
                                    colorize(label, jobs.get("AR").intValue());
                                break;
                            case 6:
                                label.setText("LA");
                                if(jobs.containsKey("LA"))
                                    colorize(label, jobs.get("LA").intValue());
                                break;
                        }
                        break;
                    case 6:
                        switch (y){
                            case 2:
                                label.setText("IL");
                                if(jobs.containsKey("IL"))
                                    colorize(label, jobs.get("IL").intValue());
                                break;
                            case 3:
                                label.setText("IN");
                                if(jobs.containsKey("IN"))
                                    colorize(label, jobs.get("IN").intValue());
                                break;
                            case 4:
                                label.setText("KY");
                                if(jobs.containsKey("KY"))
                                    colorize(label, jobs.get("KY").intValue());
                                break;
                            case 5:
                                label.setText("TN");
                                if(jobs.containsKey("TN"))
                                    colorize(label, jobs.get("TN").intValue());
                                break;
                            case 6:
                                label.setText("MS");
                                if(jobs.containsKey("MS"))
                                    colorize(label, jobs.get("MS").intValue());
                                break;
                        }
                        break;
                    case 7:
                        switch (y){
                            case 2:
                                label.setText("WI");
                                if(jobs.containsKey("WI"))
                                    colorize(label, jobs.get("WI").intValue());
                                break;
                            case 3:
                                label.setText("OH");
                                if(jobs.containsKey("OH"))
                                    colorize(label, jobs.get("OH").intValue());
                                break;
                            case 4:
                                label.setText("WV");
                                if(jobs.containsKey("WV"))
                                    colorize(label, jobs.get("WV").intValue());
                                break;
                            case 5:
                                label.setText("NC");
                                if(jobs.containsKey("NC"))
                                    colorize(label, jobs.get("NC").intValue());
                                break;
                            case 6:
                                label.setText("AL");
                                if(jobs.containsKey("AL"))
                                    colorize(label, jobs.get("AL").intValue());
                                break;
                        }
                        break;
                    case 8:
                        switch (y){
                            case 2:
                                label.setText("MI");
                                if(jobs.containsKey("MI"))
                                    colorize(label, jobs.get("MI").intValue());                                break;
                            case 3:
                                label.setText("PA");
                                if(jobs.containsKey("PA"))
                                    colorize(label, jobs.get("PA").intValue());                                break;
                            case 4:
                                label.setText("VA");
                                if(jobs.containsKey("VA"))
                                    colorize(label, jobs.get("VA").intValue());                                break;
                            case 5:
                                label.setText("SC");
                                if(jobs.containsKey("SC"))
                                    colorize(label, jobs.get("SC").intValue());                                break;
                            case 6:
                                label.setText("GA");
                                if(jobs.containsKey("GA"))
                                    colorize(label, jobs.get("GA").intValue());                                break;
                        }
                        break;
                    case 9:
                        switch (y){
                            case 2:
                                label.setText("NY");
                                if(jobs.containsKey("NY"))
                                    colorize(label, jobs.get("NY").intValue());                                break;
                            case 3:
                                label.setText("NJ");
                                if(jobs.containsKey("NJ"))
                                    colorize(label, jobs.get("NJ").intValue());                                break;
                            case 4:
                                label.setText("MD");
                                if(jobs.containsKey("MD"))
                                    colorize(label, jobs.get("MD").intValue());                                break;
                            case 5:
                                label.setText("D.C.");
                                if(jobs.containsKey("DC"))
                                    colorize(label, jobs.get("DC").intValue());                                break;
                            case 7:
                                label.setText("FL");
                                if(jobs.containsKey("FL"))
                                    colorize(label, jobs.get("FL").intValue());                                break;
                        }
                        break;
                    case 10:
                        switch (y){
                            case 1:
                                label.setText("VT");
                                if(jobs.containsKey("VT"))
                                    colorize(label, jobs.get("VT").intValue());                                break;
                            case 2:
                                label.setText("RI");
                                if(jobs.containsKey("RI"))
                                    colorize(label, jobs.get("RI").intValue());                                break;
                            case 3:
                                label.setText("CT");
                                if(jobs.containsKey("CT"))
                                    colorize(label, jobs.get("CT").intValue());                                break;
                            case 4:
                                label.setText("DE");
                                if(jobs.containsKey("DE"))
                                    colorize(label, jobs.get("DE").intValue());                                break;
                        }
                        break;
                    case 11:
                        switch (y){
                            case 0:
                                label.setText("ME");
                                if(jobs.containsKey("ME"))
                                    colorize(label, jobs.get("ME").intValue());                                break;
                            case 1:
                                label.setText("NH");
                                if(jobs.containsKey("NH"))
                                    colorize(label, jobs.get("NH").intValue());                                break;
                            case 2:
                                label.setText("MA");
                                if(jobs.containsKey("MA"))
                                    colorize(label, jobs.get("MA").intValue());                                break;
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
        c[0] = "purple";
        c[1] = "blue";
        c[2] = "green";
        c[3] = "yellow";
        c[4] = "orange";
        c[5] = "red";

        double incNum = mostJobs / 6;

        if (num < incNum)
            label.setStyle("-fx-background-color: " + c[0]);
        else if (num < incNum * 2)
            label.setStyle("-fx-background-color: " + c[1]);
        else if (num < incNum * 3)
            label.setStyle("-fx-background-color: " + c[2]);
        else if (num < incNum * 4)
            label.setStyle("-fx-background-color: " + c[3]);
        else if (num < incNum * 5)
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
