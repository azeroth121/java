import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

class SetCalculator extends JFrame implements ActionListener{
 JLabel label1, label2, label3;

 JButton btnPlus, btnMinus, btnMultiply, btnClear;
 JTextField txtField1, txtField2, txtField3;
 
 public SetCalculator(){
  setLayout(new GridLayout(5,2));
  setTitle("Kalkulator");

  label1 = new JLabel("Broj 1 :",JLabel.LEFT);
  label2 = new JLabel("Broj 2 :",JLabel.LEFT);
  label3 = new JLabel("Rezultat :",JLabel.LEFT);
  

  btnPlus = new JButton("Zbroj");
  btnMinus = new JButton("Dijeljenje");
  btnMultiply = new JButton("Množenje");
  btnClear = new JButton("Poništi");
  

  btnPlus.addActionListener(this);
  btnMinus.addActionListener(this);
  btnMultiply.addActionListener(this);
  btnClear.addActionListener(this);
  
   txtField1 = new JTextField();
   txtField2 = new JTextField();
   txtField3 = new JTextField();
   
  //adding to the frame
  add(label1,0);
  add(txtField1);
  add(label2);
  add(txtField2);
  add(label3);
  add(txtField3);
  add(btnPlus);
  add(btnMinus);
  add(btnMultiply);
  add(btnClear);
 }//end of constructor
 
 
 //action listener method
 public void actionPerformed(ActionEvent event){
  String opt = event.getActionCommand();
  int num1, num2, num = 0;
  num1 = Integer.parseInt(txtField1.getText());
  num2 = Integer.parseInt(txtField2.getText());
  
  
   if(opt.equals("Zbroj"))
    num = num1 + num2;
   else if(opt.equals("Dijeljenje"))
    num = num1 - num2;
   else if(opt.equals("Množenje"))
    num = num1 * num2;
   else if(opt.equals("Poništi")){
    txtField1.setText("");
    txtField2.setText("");
    txtField3.setText("");
   }
   txtField3.setText(Integer.toString(num));
  
 }
}

public class App {
 public static void main(String args[]){
  SetCalculator demo = new SetCalculator();
  demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  demo.setVisible(true);
  demo.setSize(1000,550);
 }
}