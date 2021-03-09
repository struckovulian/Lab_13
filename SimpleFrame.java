import java.awt.*;
import java.awt.event.*;
public class SimpleFrame extends Frame {
    SimpleFrame(String s){
        super (s);
        setSize(400,150);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });
    }
    public static void main (String[] args){
        new SimpleFrame("My Program");
    }
}
