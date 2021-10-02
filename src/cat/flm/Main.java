package cat.flm;

import javax.swing.*;
import java.awt.*;

class HelloComponent extends JComponent {
    public void paintComponent(Graphics g) {
        g.drawString("Hello, Java!", 125, 95);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(args.length);
        JFrame frame = new JFrame("Hello, Java!");
        frame.add(new HelloComponent());
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
