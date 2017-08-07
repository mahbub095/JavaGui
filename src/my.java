import javax.swing.JOptionPane;

public class my {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String num1,num2;
		int a,b;
		try{
			num1=JOptionPane.showInputDialog("Enter the 1st Number");
			num2=JOptionPane.showInputDialog("Enter the 2nd number ");
			a=Integer.parseInt(num1);
			b=Integer.parseInt(num2);
			JOptionPane.showMessageDialog(null,"The Result is "+(a+b));
			
		}
		catch(Exception e){
			
			JOptionPane.showMessageDialog(null,"Hey learner !! give a valid input " +e);
		}
		
		
		
		
		
	}

}
