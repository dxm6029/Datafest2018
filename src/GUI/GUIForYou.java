package GUI;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class GUIForYou extends Application{

    public HBox buttons(){
        HBox buttons = new HBox();
        Button states = new Button();
        VBox cities = new VBox();
        VBox state = new VBox();
        Button city = new Button("CITIES");
        Label lState = new Label("STATES");
        Label lCity = new Label("CITIES");

        //states formatting
        states.setMaxSize(225, 200);
        states.setMinSize(225, 200);
        //city formatting
        city.setMaxSize(225, 200);
        city.setMinSize(225, 200);
        //setting city image
        Image iCity = new Image(getClass().getResourceAsStream("cities-nyc_optimized.jpg"));
        ImageView imageCity = new ImageView(iCity);
        imageCity.setFitHeight(200);
        imageCity.setFitWidth(205);
        city.setGraphic(imageCity);
        //setting state image
        Image iState = new Image(getClass().getResourceAsStream("61POqINKAbL._SX425_.jpg"));
        ImageView imageState = new ImageView(iState);
        imageState.setFitHeight(200);
        imageState.setFitWidth(205);
        states.setGraphic(imageState);

        cities.getChildren().addAll(city,lCity);
        cities.setAlignment(Pos.CENTER);
        state.getChildren().addAll(states, lState);
        state.setAlignment(Pos.CENTER);

        buttons.getChildren().add(state);
        buttons.getChildren().add(cities);
        return buttons;
    }

    public VBox getThatData(){
        VBox dataview = new VBox();
        Label l = new Label("Out Here Learning");
        l.setStyle("");
        dataview.getChildren().add(l);
        dataview.setAlignment(Pos.CENTER);
        return dataview;
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("DataFest Graphs");
        VBox mainView = new VBox();
        HBox buttons =  buttons();
        buttons.setMaxSize(450, 250);
        buttons.setMinSize(450, 250);
        VBox dataView = getThatData();

        mainView.getChildren().add(buttons);
        mainView.getChildren().add(dataView);
        Scene graphDisplay = new Scene(mainView);
        stage.setScene(graphDisplay);
        stage.show();
    }
}
