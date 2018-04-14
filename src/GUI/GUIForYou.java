package JavaFiles;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class GUIForYou extends Application{

    public HBox buttons(){
        HBox buttons = new HBox();
        buttons.getChildren().add(new Button("STATES"));
        buttons.getChildren().add(new Button("CITIES"));
        return buttons;
    }

    public VBox getThatData(){
        VBox dataview = new VBox();
        dataview.getChildren().add(new Label("Out Here Learning"));
        return dataview;
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("DataFest Graphs");
        VBox mainView = new VBox();
        HBox buttons =  buttons();
        VBox dataView = getThatData();
        mainView.getChildren().add(buttons);
        mainView.getChildren().add(dataView);
        //add buttons to main view

        Scene graphDisplay = new Scene(mainView);
        stage.setScene(graphDisplay);
        stage.show();
    }
}
