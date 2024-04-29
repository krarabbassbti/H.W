
import javax.swing.*;

public class User extends JFrame {
    public User(){
        setTitle("user");
        setLayout(null);
        setSize(500,500);
        JLabel label=new JLabel("Name User");
        JTextField textField=new JTextField("Karrar Abbas Sebti");
        label.setBounds(125,100,100,30);
        textField.setBounds(225,100,200,30);
        add(label);
        add(textField);
        setVisible(true);
    }
}