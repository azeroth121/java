import javax.swing.JFrame;
import javax.swing.SwingUtilities;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new Mainframe("Hello World Swing!");
				frame.setSize(500,400);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				
			}
		});

	}

}
