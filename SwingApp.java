import javax.swing.*;
import java.awt.*;
import java.io.*; 

public class SwingApp extends JFrame implements ActionListener{
	//reference to the swing components
	JButton btnButtonClicks;
	JLabel lblDisplay;
	Container contentPane;


	//Declare a variable to represent the no of clicks 
	int noOfClicks;
	public static void main(String []agrs){
		new SwingApp();
	}// end of main	


	public SwingApp(){
		//set frame properties
		createContainer();
		createComponents();
		addComponents();
		handleEvents();
		createFrame();
	}//end of constructor



	private  void createFrame(){
		setTitle("GUI APPLICATION");
		setSize(200, 150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	private void createComponents(){
		//create components objects 
		noOfClicks= 0;
		btnButtonClicks= new JButton("I'am a swing button!");
		lblDisplay = new JLabel("Number of button clicks:" + noOfClicks);
	}
	private void createContainer(){
		//create container object
		contentPane = getContentPane();
	
	}//end of constructor 

	public void  addComponents(){
		contentPane.add(btnButtonClicks);
		contentPane.add(lblDisplay);
	}//end of container

 	public void actionPerformed(ActionEvent e){
		if(e.getSource() == btnButtonClicks){
		noOfClicks++;
		lblDisplay.setText("Number of Button CLicks:" +noOfClicks);
		
		}
	
	}//end of actionPerformed
	
	public handleEvents(){
	btnButtonClicks.addActionListener(this);
	}


} //end of SwingApp
