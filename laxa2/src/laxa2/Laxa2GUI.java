package laxa2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class Laxa2GUI {

	private JFrame frame;
    private HouseConstructor house []; 
   //private int test[]=new int [10];
	
    /**
	 * Launch the application.]
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Laxa2GUI window = new Laxa2GUI();
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
	public Laxa2GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblHouseGui = new JLabel("House GUI");
		frame.getContentPane().add(lblHouseGui, BorderLayout.NORTH);
		
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		HouseConstructor house1 = new HouseConstructor(1944,21);
		HouseConstructor house2 = new HouseConstructor(1934,211);
		HouseConstructor house3 = new HouseConstructor(1734,72);
		HouseConstructor house4 = new HouseConstructor(1244,41);
		
		house = new HouseConstructor [10];
		house [0]= house1;
		house [1]= house2;
		house [2]= house3;
		house [3]= house4;
		for (int i = 0; i< house.length; i++){
			if(house[i]!=null){
				textArea.append("one house was built in the year"+house[i].getYear()+" and has a size of"+house[i].getSize()+" Kvm. \n \n");
		
			
			}
			
			
		}
		textArea.append("the totale number of houses is"+" "+HouseConstructor.getNumberOfHouses() );
	}

}
