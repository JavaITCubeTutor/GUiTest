package org.example;

import javax.swing.*;

public class Main extends JFrame{
  private JTextField textField1;
  private JPasswordField passwordField1;
  private JButton button1;
  private JButton button2;
  private JPanel mainPanel;

  public Main(){
    setVisible(true);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setContentPane(mainPanel);
    pack();
  }
  public static void main(String[] args) {
    Main mainWindow = new Main();

  }
}
