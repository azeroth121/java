import javax.swing.*;
import java.awt.*;
class App {
    public static void main(String args[]) {

        
        JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);

        
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("File");
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        mb.add(m1);
        m1.add(m11);
        m1.add(m22);

        
        JPanel panel = new JPanel(); 
        JPanel panel2 = new JPanel(); 
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(5); 
        JTextField tf2 = new JTextField(5);
        JTextField tf3 = new JTextField(5);
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        JTextArea ta = new JTextArea();
        panel.add(label); 
        panel.add(label); 
        panel.add(tf);
        panel.add(tf2);
        panel.add(tf3);
        panel.add(send);
        panel.add(reset);

     
      

        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.getContentPane().add(BorderLayout.WEST, panel2);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
}