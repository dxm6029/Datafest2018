package GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

public class GUIForYou extends Application{

    private int colSize = 75;
    private int rowSize = 75;
    private Stage mainStage;
    private Map<String, String> params = null;
    private GridPane grid;
    private StateLabel [][] labels = new StateLabel[rowSize][colSize];
    private GridPane statePane;

    private GridPane makeGridPane(int cols, int rows, Map<String, GUI.State> jobs){
        grid = new GridPane();

        for(int x = 0; x < cols; x ++){
            for(int y = 0; y < rows; y++){
                StateLabel label = new StateLabel();
                label.setMaxSize(colSize,rowSize);
                label.setMinSize(colSize,rowSize);
                switch(x){
                    case 0:
                        if(y == 0){
                            label.setText("AK");
                            GUI.State state = jobs.get("AK");
                            label.colorChange(state.getNumJobs());
                        }
                        else if(y == 8){ label.setText("HI");
                            label.colorChange(jobs.get("HI").getNumJobs());
                        }
                        break;
                    case 1:
                        switch(y){
                            case 2:
                                label.setText("WA");
                                label.colorChange(jobs.get("WA").getNumJobs());
                                break;
                            case 3:
                                label.setText("OR");
                                label.colorChange(jobs.get("OR").getNumJobs());
                                break;
                            case 4:
                                label.setText("CA");
                                label.colorChange(jobs.get("CA").getNumJobs());
                                break;
                        }
                        break;
                    case 2:
                        switch (y){
                            case 2:
                                label.setText("ID");
                                label.colorChange(jobs.get("ID").getNumJobs());
                                break;
                            case 3:
                                label.setText("NV");
                                label.colorChange(jobs.get("NV").getNumJobs());
                                break;
                            case 4:
                                label.setText("UT");
                                label.colorChange(jobs.get("UT").getNumJobs());
                                break;
                            case 5:
                                label.setText("AZ");
                                label.colorChange(jobs.get("AZ").getNumJobs());
                                break;
                        }
                        break;
                    case 3:
                        switch (y){
                            case 2:
                                label.setText("MT");
                                label.colorChange(jobs.get("MT").getNumJobs());
                                break;
                            case 3:
                                label.setText("WY");
                                label.colorChange(jobs.get("WY").getNumJobs());
                                break;
                            case 4:
                                label.setText("CO");
                                label.colorChange(jobs.get("CO").getNumJobs());
                                break;
                            case 5:
                                label.setText("NM");
                                label.colorChange(jobs.get("NM").getNumJobs());
                                break;
                        }
                        break;
                    case 4:
                        switch (y){
                            case 2:
                                label.setText("ND");
                                label.colorChange(jobs.get("ND").getNumJobs());
                                break;
                            case 3:
                                label.setText("SD");
                                label.colorChange(jobs.get("SD").getNumJobs());
                                break;
                            case 4:
                                label.setText("NA");
                                label.colorChange(jobs.get("NA").getNumJobs());
                                break;
                            case 5:
                                label.setText("KA");
                                label.colorChange(jobs.get("KA").getNumJobs());
                                break;
                            case 6:
                                label.setText("OK");
                                label.colorChange(jobs.get("OK").getNumJobs());
                                break;
                            case 7:
                                label.setText("TX");
                                label.colorChange(jobs.get("TX").getNumJobs());
                                break;
                        }
                        break;
                    case 5:
                        switch (y){
                            case 2:
                                label.setText("MI");
                                label.colorChange(jobs.get("MI").getNumJobs());
                                break;
                            case 3:
                                label.setText("IA");
                                label.colorChange(jobs.get("IA").getNumJobs());
                                break;
                            case 4:
                                label.setText("MO");
                                label.colorChange(jobs.get("MO").getNumJobs());
                                break;
                            case 5:
                                label.setText("AR");
                                label.colorChange(jobs.get("AR").getNumJobs());
                                break;
                            case 6:
                                label.setText("LA");
                                label.colorChange(jobs.get("LA").getNumJobs());
                                break;
                        }
                        break;
                    case 6:
                        switch (y){
                            case 2:
                                label.setText("IL");
                                label.colorChange(jobs.get("IL").getNumJobs());
                                break;
                            case 3:
                                label.setText("IN");
                                label.colorChange(jobs.get("IN").getNumJobs());
                                break;
                            case 4:
                                label.setText("KY");
                                label.colorChange(jobs.get("KY").getNumJobs());
                                break;
                            case 5:
                                label.setText("TN");
                                label.colorChange(jobs.get("TN").getNumJobs());
                                break;
                            case 6:
                                label.setText("MS");
                                label.colorChange(jobs.get("MS").getNumJobs());
                                break;
                        }
                        break;
                    case 7:
                        switch (y){
                            case 2:
                                label.setText("WI");
                                label.colorChange(jobs.get("WI").getNumJobs());
                                break;
                            case 3:
                                label.setText("OH");
                                label.colorChange(jobs.get("OH").getNumJobs());
                                break;
                            case 4:
                                label.setText("WV");
                                label.colorChange(jobs.get("WV").getNumJobs());
                                break;
                            case 5:
                                label.setText("NC");
                                label.colorChange(jobs.get("NC").getNumJobs());
                                break;
                            case 6:
                                label.setText("AL");
                                label.colorChange(jobs.get("AL").getNumJobs());
                                break;
                        }
                        break;
                    case 8:
                        switch (y){
                            case 2:
                                label.setText("MI");
                                label.colorChange(jobs.get("MI").getNumJobs());
                                break;
                            case 3:
                                label.setText("PA");
                                label.colorChange(jobs.get("PA").getNumJobs());
                                break;
                            case 4:
                                label.setText("VA");
                                label.colorChange(jobs.get("VA").getNumJobs());
                                break;
                            case 5:
                                label.setText("SC");
                                label.colorChange(jobs.get("SC").getNumJobs());
                                break;
                            case 6:
                                label.setText("GA");
                                label.colorChange(jobs.get("GA").getNumJobs());
                                break;
                        }
                        break;
                    case 9:
                        switch (y){
                            case 2:
                                label.setText("NY");
                                label.colorChange(jobs.get("NY").getNumJobs());
                                break;
                            case 3:
                                label.setText("NJ");
                                label.colorChange(jobs.get("NJ").getNumJobs());
                                break;
                            case 4:
                                label.setText("MD");
                                label.colorChange(jobs.get("MD").getNumJobs());
                                break;
                            case 5:
                                label.setText("D.C.");
                                label.colorChange(jobs.get("D.C.").getNumJobs());
                                break;
                            case 7:
                                label.setText("FL");
                                label.colorChange(jobs.get("FL").getNumJobs());
                                break;
                        }
                        break;
                    case 10:
                        switch (y){
                            case 1:
                                label.setText("VT");
                                label.colorChange(jobs.get("VT").getNumJobs());
                                break;
                            case 2:
                                label.setText("RI");
                                label.colorChange(jobs.get("RI").getNumJobs());
                                break;
                            case 3:
                                label.setText("CT");
                                label.colorChange(jobs.get("CT").getNumJobs());
                                break;
                            case 4:
                                label.setText("DA");
                                label.colorChange(jobs.get("DA").getNumJobs());
                                break;
                        }
                        break;
                    case 11:
                        switch (y){
                            case 0:
                                label.setText("ME");
                                label.colorChange(jobs.get("ME").getNumJobs());
                                break;
                            case 1:
                                label.setText("NH");
                                label.colorChange(jobs.get("NH").getNumJobs());
                                break;
                            case 2:
                                label.setText("MA");
                                label.colorChange(jobs.get("MA").getNumJobs());
                                break;
                        }
                        break;
                }
                grid.add(label, x, y);
                labels[x][y] = new StateLabel();
            }
        }
        return grid;
    }

    public void start(Stage mainStage) {
        System.out.println("HI");
        this.mainStage = mainStage;
        mainStage.setTitle("Data");
        BorderPane totalPane = new BorderPane();
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
        FileReader fr = new FileReader();
        Map<String, Integer> map = fr.readFile(getParamNamed("file"));
        Map<String, GUI.State> mapy = new HashMap<>();
        for(String s: map.keySet()){
            GUI.State state = new GUI.State(s,map.get(s).intValue());
            mapy.put(s,state);
        }
        final int COLUMNS = 12;
        final int ROWS = 9;
        GridPane statePane = makeGridPane(COLUMNS, ROWS, mapy);

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
