import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MygridLayout {
	
	JFrame f;
	
	
	MygridLayout(){
		
		f=new JFrame();
		JButton b1=new JButton("1");
		JButton b2=new JButton("2");
		JButton b3=new JButton("3");
		JButton b4=new JButton("4");
		
		
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		
		
		f.setLayout(new GridLayout(3,3,5,5));
		f.setSize(300,300);
		f.setVisible(true);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MygridLayout();
	}

}
