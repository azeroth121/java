import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class Mainframe extends JFrame {
	
	private DetailsPanel detailsPanel;
	
	public Mainframe(String title) {
		super(title);
		
		setLayout(new BorderLayout());
		
		final JTextArea textArea = new JTextArea();
		
		
		detailsPanel = new DetailsPanel();
		
		detailsPanel.addDetailListener(new DetailListener() {
			public void detailEventOccured(DetailEvent event) {
				String text = event.getText();
				
				textArea.append(text);
			}
		});
		
		Container c= getContentPane();
		
		c.add(textArea, BorderLayout.CENTER);
		
		c.add(detailsPanel, BorderLayout.WEST);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	///	button.addActionListener(new ActionListener() {
		
	//	@Override
	//	public void actionPerformed(ActionEvent e) {
		//	textArea.append("Hello\n");
	//	}
//	});
		////c.add(button, BorderLayout.SOUTH);
		//JButton button = new JButton("Click me");
		
		
	}

}
