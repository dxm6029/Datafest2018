package GUI;

import java.awt.*;

public class Messages {
    private Label message;

    public Messages(Label message){
        this.message = message;
    }

    public void write(String text){
        message.setText(text);
    }

}
