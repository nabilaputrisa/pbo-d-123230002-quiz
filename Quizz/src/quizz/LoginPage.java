package quizz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

class LoginPage extends JFrame implements ActionListener {
    JLabel username = new JLabel("Username : ");
    JLabel password = new JLabel("password : ");
    JTextField usernameTextField = new JTextField();
    JTextField passwordTextField = new JTextField();
    JLabel judul = new JLabel("Selamat Datang di Aplikasi 123230002");
    JButton btnLogin = new JButton("Login");
    private Object JOPtionPane;
    private Object JoptionPane;
    private Object SwingContans;
    
    
    public LoginPage(){
        setTitle("Halaman Login");
        setVisible(true);
        setSize(350,180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        setLayout(null);
        add(username);
        add(password);
        add(usernameTextField);
        add(passwordTextField);
        add(judul);
        add(btnLogin);
        
        username.setBounds(10,20,150,35);
        password.setBounds(10,50,150,35);
        usernameTextField.setBounds(150,20,150,35);
        passwordTextField.setBounds(150,55,150,35);
        judul.setBounds(50,2,250,20);
        btnLogin.setBounds(100,100,75,20);
        btnLogin.addActionListener(this);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == btnLogin){
                String username = usernameTextField.getText();
                String password = passwordTextField.getText();
                
                if(username.equals("Salsa") && password.equals("pbo-d")){
                    new HalamanInputData();
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(this, "Gagal Login. Pastikan Username Terisi & Password Sesuai.", "Error" , JOptionPane.INFORMATION_MESSAGE);
                }    
            }
        
        } catch(Exception error){
            JOptionPane.showMessageDialog(this, "Gagal Login.", "Error" , JOptionPane.ERROR_MESSAGE);
        }
    }
}
