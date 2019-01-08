import javax.swing.JFrame;

	public class BasicElements{
    	public static void main(String[]args){
    	JFrame myFrame = new JFrame();
    	JButton myButton = new JButton();

    	myFrame.add(myButton);

    	myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
        myFrame.setSize(900, 600);

    System.out.println("basic java elements");
    }
}	