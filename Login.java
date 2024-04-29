import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Login extends JFrame {
    private JTextField username;
    private JPasswordField passwoed;
    private JLabel labusername, labpassword;
    private JButton button, button1;
    public Login() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLocationRelativeTo(null);
        setLayout(null);
        username = new JTextField();
        passwoed = new JPasswordField();
        labusername = new JLabel("User Name");
        labpassword = new JLabel("Password");
        button = new JButton("Login");
        button1 = new JButton("Close");
        username.setBounds(120, 130, 260, 30);
        passwoed.setBounds(120, 185, 260, 30);
        labusername.setBounds(50, 130, 260, 30);
        labpassword.setBounds(50, 185, 260, 30);
        button.setBounds(145, 235, 80, 30);
        button1.setBounds(250, 235, 80, 30);
        button.setContentAreaFilled(false);
        button1.setContentAreaFilled(false);
        add(username);
        add(passwoed);
        add(labusername);
        add(labpassword);
        add(button);
        add(button1);

        setVisible(true);
        //close button
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = username.getText();
                String pass = passwoed.getText();
                if(user.compareToIgnoreCase("krar") == 0 && pass.compareTo("krar")==0) {
                    ShowMasg("تم تسجيل الدخول بنجاح");
                    User user1=new User();
                    user1.setVisible(true);

                } else  if(pass.compareTo("1234")!=0){
                    ShowMasg("كلمة السر الذي ادخلتها غير صحيحة");
                }
                else  if (user.compareToIgnoreCase("admin")!=0){
                    ShowMasg("اسم المستخدم الذي ادخلتها غير صحيح");

                }
            }
        });
    }

    public void ShowMasg(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }

}