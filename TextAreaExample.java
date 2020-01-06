import java.awt.Color;
import javax.swing.*;

class TextAreaExample
{
    JTextArea area;
    JFrame f;
    
    TextAreaExample()
    {
        f = new JFrame();
        area = new JTextArea(300, 300);
        area.setBounds(10, 30, 300, 300);
        
        area.setBackground(Color.black);
        area.setForeground(Color.white);
        area.setText("Enter you Age: 11" + "\n" + "You are not eigible to vote!");
        
        f.add(area);
        
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        
    }
    static void main ()
    {
        new TextAreaExample();
    }
}
