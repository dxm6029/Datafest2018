package GUI;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class StateLabel extends Label {

    private Color c;
    private int row;
    private int col;

    public StateLabel(){
        c = Color.color(0, 225, 0);
    }

    public void colorChange(int count){
        double incNum = count/2;
        c = Color.color(c.getRed() + incNum, c.getGreen() - incNum, 0);

    }

}
