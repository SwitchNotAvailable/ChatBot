package main.java;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.JTextArea;

public class ChatGui {

	private JFrame frame;
	private final JTextArea textArea = new JTextArea();
	private final JButton chatButton = new JButton("Enter");
	private final JLabel chatLabel = new JLabel("ChatBox");
	private final JTextField chatField = new JTextField();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatGui window = new ChatGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ChatGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		chatField.setBounds(10, 494, 372, 25);
		chatField.setColumns(10);
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setBackground(new Color(0, 0, 0));
		frame.getContentPane().setBackground(new Color(51, 204, 255));
		frame.setBounds(800, 800, 510, 569);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		chatButton.setBackground(new Color(0, 255, 153));
		
		chatButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Event Handler for Chat Box...Supposed to read what is written in the Box AN d store it and give answer at the same time
			if (e.getSource()==chatButton) {
				String text=chatField.getText().toLowerCase();
				textArea.setForeground(Color.darkGray);
				textArea.append("You : "+text+"\n");
			chatField.setText("");
			if(text.contains("hi")){	
				
				replyMethod("Hey there are you trying to find out what the weather will be like"); 
				
				
			}else if(text.contains("how are you?")) {
				replyMethod("I am well");  

			}else if(text.contains("no")) {
				replyMethod("Ok thats fine but be sure to know what the"+"\n"+"                  weather for the day will be like and"+"\n"+"                  have a wonderful day cheers");  
			}else if(text.contains("yes")) {
				replyMethod("Lovely what place would you"+"\n"+"                  love to know what the weather"+"\n"+"                  is like");  
			}else if(text.contains("island of hawaii")) {
				replyMethod("Nice, according to my predictions it"+"\n"+"                  will be raining most of the day so"+"\n"+"                  i would advice you to carry an"+"\n"+"                  umbrella or a rain coat");  
			}else if(text.contains("grand canyon")) {
				replyMethod("Wonderful, according to my"+"\n"+"                  predictions it will be suuny most"+"\n"+"                  of the day so i would advice you "+"\n"+"                      to carry some light clothes and some" +"\n"+"                    water to hydrate");  
			}else if(text.contains("columbia river")) {
				replyMethod("Wonderful, according to my"+"\n"+"                  predictions it will be  rainy"+"\n"+"                  so i suggest you"+"\n"+"                  carry an umberalla or a rain coat");
			}else if(text.contains("south lake tahoe")) {
				replyMethod("Wonderful, according to my"+"\n"+"                  predictions it will be snowing"+"\n"+"                  so i suggest you carry some heavy"+"\n"+"                  clothes and boots");
			}else if(text.contains("mount rainier")) {
				replyMethod("Wonderful, according to my"+"\n"+"                  predictions it will be snowing"+"\n"+"                  so i suggest you carry some heavy"+"\n"+"                  clothes and boots");
			}else if(text.contains("thank you for the heads up suggestions of what to wear")) {
				replyMethod("Your welcome have a"+"\n"+"                  wonderful and safe trip and "+"\n"+"                  hopefully we can be of "+"\n"+"                 help to you again");
			}
			else {
				replyMethod("I can't Understand you");
			}
			}
			}
		});
		chatButton.setBounds(402, 492, 82, 29);
		frame.getContentPane().add(chatButton);
		chatLabel.setForeground(SystemColor.activeCaptionBorder);
		chatLabel.setBounds(179, 491, 52, 31);
		frame.getContentPane().add(chatLabel);
		
		frame.getContentPane().add(chatField);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(new Color(204, 255, 255));
		textArea_1.setBounds(10, 11, 378, 469);
		frame.getContentPane().add(textArea_1);
		
		
		textArea.setBackground(new Color(204, 255, 255));
		textArea.setBounds(45, 23, 343, 386);
		frame.getContentPane().add(textArea);
	}
	public void replyMethod(String s) {
		textArea.append("ChatBot : "+s+"\n");
	}
}
