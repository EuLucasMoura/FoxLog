package ADM;
import javax.swing.*;
import java.awt.*;/**
 * LoginScreen
 */
public class LoginScreen {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setLayout(null);

        // Create the panel 
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 102, 51));

        panel.setBounds(0, 0, 400, 500);
        panel.setLayout(null);

        // Logo
        JLabel logoLabel = new JLabel("Fox");
        java.net.URL imgUrl = LoginScreen.class.getResource("logo.png");
        if(imgUrl != null) {
            logoLabel.setIcon(new ImageIcon(imgUrl));
        } else {
            System.err.println("Couldn't find file: logo.png");
        }
        logoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        logoLabel.setBounds(100, 50, 200,150);
        panel.add(logoLabel);

        //Username label and field
        JLabel userLabel = new JLabel("Login");
        userLabel.setForeground(Color.WHITE);
        userLabel.setBounds(100, 150, 200, 25);
        userLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 180, 200, 30);
        panel.add(userText);

        // Password label and field
        JLabel passwordLabel = new JLabel("SENHA");
        passwordLabel.setForeground(Color.WHITE);
        passwordLabel.setBounds(100, 220, 200, 25);
        passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 250, 200, 30);
        panel.add(passwordText);

        // Login button
        JButton loginButton = new JButton("ENTRAR");
        loginButton.setBounds(150, 300, 100, 25);
        panel.add(loginButton);

        // Forgot password link
        JLabel forgotPasswordLabel = new JLabel("Esqueci minha senha");
        forgotPasswordLabel.setForeground(Color.WHITE);
        forgotPasswordLabel.setBounds(150, 340, 200, 25);
        panel.add(forgotPasswordLabel);

        // Add panel to frame
        frame.add(panel);

        // Set frame visibility
        frame.setVisible(true);
    }



}