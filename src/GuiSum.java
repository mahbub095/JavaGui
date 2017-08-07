import javax.swing.JOptionPane;





 class GuiSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String fn=JOptionPane.showInputDialog(" Enter first Number");
		String sn=JOptionPane.showInputDialog(" Enter second Number");
		
		int num1= Integer.parseInt(fn);
		int num2= Integer.parseInt(sn);
		int sum=num1+num2;
		
		JOptionPane.showMessageDialog(null, "The answer is "+ sum ,"the tite ",JOptionPane.PLAIN_MESSAGE);
	}

}
