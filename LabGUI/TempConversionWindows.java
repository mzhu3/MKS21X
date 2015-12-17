import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TempConversionWindows extends JFrame implements ActionListener{
    private Container pane;
    private JLabel j;
    private JTextField t;
   
    public TempConversionWindows(){
	this.setTitle("Temperature Conversion");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	pane = this.getContentPane();
	pane.setLayout(new GridBagLayout());
	JButton b = new JButton("Celsius to Fahreinheit");
	b.addActionListener(this);
	b.setActionCommand("Convert to Fahreinheit");
	JButton b2 = new JButton("Fahreinheit to Celsius");
	b2.addActionListener(this);
	b2.setActionCommand("Convert to Celsius");
	t = new JTextField(10);
	pane.add(b);
	pane.add(b2);
	pane.add(t);
    }
    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if(event.equals("Convert to Fahreinheit")){
	    double s = Integer.parseInt( t.getText());
	    s = CtoF(s);
	    j.setText(Double.toString(s));

	}
	    
	if(event.equals("Convert to Celsius")){
	    double s = Integer.parseInt(t.getText());
	    s=FtoC(s);
	    j.setText(Double.toString(s));
	}
    }
		
		    
	    
    public static double CtoF(double t){
	return (t * (9.0 / 5.0) + 32.0);
    }
    public static double FtoC(double t){
	return ((t - 32.0) * (5.0 / 9.0));
    }
}
