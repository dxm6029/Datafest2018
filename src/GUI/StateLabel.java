package GUI;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class StateLabel extends Label {

    private Color c;

    public StateLabel(){
        c = Color.color(0, 1, 0);
    }

    public void colorChange(int count){
        double incNum = count/400;
        this.setText("HI");
        this.setStyle("-fx-background-color: red");
        //c = Color.color(c.getRed() + incNum, c.getGreen() - incNum, 0);

    }

}
