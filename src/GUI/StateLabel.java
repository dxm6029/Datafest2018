package GUI;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class StateLabel extends Label {

    private String []c;

    public StateLabel(){
        c = new String[6];
        c[0] = "purple";
        c[1] = "blue";
        c[2] = "green";
        c[3] = "yellow";
        c[4] = "orange";
        c[5] = "red";
        }

    public void colorChange(int count){
        double incNum = count/400;
        this.setText("HI");

        if (count < 30)
            this.setStyle("-fx-background-color: " + c[0]);
        else if (count < 80)
            this.setStyle("-fx-background-color: " + c[1]);
        else if (count < 110)
            this.setStyle("-fx-background-color: " + c[2]);
        else if (count < 150)
            this.setStyle("-fx-background-color: " + c[3]);
        else if (count < 180)
            this.setStyle("-fx-background-color: " + c[4]);
        else if (count < 210)
            this.setStyle("-fx-background-color: " + c[5]);
        else
            this.setStyle("-fx-background-color: " + c[6]);


        //c = Color.color(c.getRed() + incNum, c.getGreen() - incNum, 0);

    }

}
