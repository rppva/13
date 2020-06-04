import java.awt.*;
import java.awt.event.*;
class TooSimpleFrame extends Frame {
    TooSimpleFrame(String s) {
        super (s);
        setSize(400, 150);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
               System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
     new TooSimpleFrame("Mo9 nporamma");
    }
}
