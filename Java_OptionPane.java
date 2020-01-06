import javax.swing.*;
import java.awt.*;

class Java_OptionPane {
    
    void main() {
        
        String username = " ";
        String password = " ";
        char mask = '*';
        
        username = JOptionPane.showInputDialog ( null, "Enter username." );
        
        JPasswordField passwordField = new JPasswordField();
        passwordField.setEchoChar('*');
        Object[] obj = {"Please enter the password:\n", passwordField};
        Object stringArray[] = {"OK","Cancel"};
        if (JOptionPane.showOptionDialog(null, obj, "Need password", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, stringArray, obj) == JOptionPane.YES_OPTION)
            password = passwordField.getPassword().toString();
        
            
        if ((username.equals("")) && (password.equals("")))
        {   
            
            JOptionPane.showMessageDialog ( null, "Indruder! Indruder! Indruder!" );
        
        }
        
    }
}
