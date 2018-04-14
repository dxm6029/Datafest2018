package JavaFiles;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUIForYou extends Application{

    //public void

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("DataFest Graphs");
        VBox mainView = new VBox();
        HBox buttons = new HBox();
        HBox dataView = new HBox();

        //add buttons to main view

        Scene graphDisplay = new Scene(mainView);
        stage.setScene(graphDisplay);
        stage.show();
    }
}
