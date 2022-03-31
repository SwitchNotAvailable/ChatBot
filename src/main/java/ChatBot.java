package src.main.java;

import javax.swing.*;

public class ChatBot extends JFrame {

    public ChatBot() {
        JFrame jframe = new JFrame();
        jframe.setTitle("CHATBOT");
        jframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jframe.setLayout(null);
        jframe.setVisible(true);
        jframe.setResizable(false);
        jframe.setSize(650,500);
    }

    public static void main(String[] args){
        new ChatBot();

    }
}