package GUI;

import javafx.application.Application;
import javafx.geometry.Insets;
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

import java.awt.*;
import java.util.ArrayList;

public class GUIForYou extends Application{

//    public HBox buttons(){
//        HBox buttons = new HBox();
//        Button states = new Button();
//        VBox cities = new VBox();
//        VBox state = new VBox();
//        Button city = new Button("CITIES");
//        Label lState = new Label("STATES");
//        Label lCity = new Label("CITIES");
//
//        //making city and state label pretty
//        lCity.setStyle("-fx-font-size: 20px; -fx-font-weight: bold; -fx-text-fill: blue;");
//        lState.setStyle("-fx-font-size: 20px; -fx-font-weight: bold; -fx-text-fill: blue;");
//
//        //states formatting
//        states.setMaxSize(223, 200);
//        states.setMinSize(223, 200);
//        states.setStyle("-fx-background-color: lightblue");
//
//        //city formatting
//        city.setMaxSize(223, 200);
//        city.setMinSize(223, 200);
//        city.setStyle("-fx-background-color: lightblue");
//
//        //setting city image
//        Image iCity = new Image(getClass().getResourceAsStream("cities-nyc_optimized.jpg"));
//        ImageView imageCity = new ImageView(iCity);
//        imageCity.setFitHeight(200);
//        imageCity.setFitWidth(205);
//        city.setGraphic(imageCity);
//
//        //setting state image
//        Image iState = new Image(getClass().getResourceAsStream("61POqINKAbL._SX425_.jpg"));
//        ImageView imageState = new ImageView(iState);
//        imageState.setFitHeight(200);
//        imageState.setFitWidth(205);
//        states.setGraphic(imageState);
//
//        // adding stuff to vBoxes
//        cities.getChildren().addAll(city,lCity);
//        cities.setAlignment(Pos.CENTER);
//        state.getChildren().addAll(states, lState);
//        state.setAlignment(Pos.CENTER);
//
//        //adding stuff to final hBox
//        buttons.getChildren().add(state);
//        buttons.setSpacing(8);
//        buttons.getChildren().add(cities);
//        return buttons;
//    }
//
//    public VBox getThatData(){
//        VBox dataview = new VBox();
//        Label l = new Label("Out Here Learning");
//        l.setStyle("-fx-font-size: 50px; -fx-font-weight: bold; -fx-text-fill: blue; -fx-effect: innershadow(three-pass-box , rgba(0,0,0,0.7) , 6, 0.0 , 0 , 2); ");
//        dataview.getChildren().add(l);
//        dataview.setAlignment(Pos.CENTER);
//        return dataview;
//    }
//
//    @Override
//    public void start(Stage stage) throws Exception {
//        stage.setTitle("DataFest Graphs");
//        VBox mainView = new VBox();
//        HBox buttons =  buttons();
//        buttons.setMaxSize(456, 250);
//        buttons.setMinSize(456, 250);
//        VBox dataView = getThatData();
//
//        mainView.getChildren().add(buttons);
//        mainView.getChildren().add(dataView);
//        Scene graphDisplay = new Scene(mainView);
//        stage.setScene(graphDisplay);
//        stage.show();
//    }
}
