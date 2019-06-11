import java.awt.*;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class DigitsEvent implements ActionListener{
    TextField T1;
    public DigitsEvent(TextField T) {
    	T1=T;
    }
    public void actionPerformed(ActionEvent e){
        Button btn=(Button)e.getSource();
        T1.setText(T1.getText()+btn.getLabel());
    }
}
class OperationEvent implements ActionListener{
	TextField T1;
	int number1,number2,result;
	String opt,operator;
	
	public OperationEvent(TextField A) {
		T1=A;
	}	
	public void actionPerformed(ActionEvent e) {
		Button btn=(Button)e.getSource();
		opt=btn.getLabel();
		
		if(opt.equals("C")) {
			T1.setText("");
			}
		
		
		else if(opt.equals("=")){
			number2=Integer.parseInt(T1.getText());
			if(operator.equals("+")) {
				result=number1+number2;
			}
			if(operator.equals("-")) {
				result=number1-number2;
			}
			if(operator.equals("%")) {
				result=number1/number2;
			}
			if(operator.equals("x")) {
				result=number1*number2;
			}
			T1.setText(Integer.toString(result));
		}
		else {
            number1=Integer.parseInt(T1.getText());
			operator=btn.getLabel();
			T1.setText("");
		}
	}
}
class WindowsAdd {
	public static void main(String[] args) {
		Frame F = new Frame("Calculations");
        Panel P1 = new Panel();
        Panel P2 = new Panel();
        
        TextField T1 = new TextField(20);
        DigitsEvent DE = new DigitsEvent(T1);
        OperationEvent OE = new OperationEvent(T1);
        
        //button start
        Button B0,B1,B2,B3,B4,B5,B6,B7,B8,B9;
        Button btn_add,btn_sub,btn_div,btn_mult;
        Button btn_equals,btn_clear;
        
        B0 = new Button("0");
        	B0.addActionListener(DE);
        B1 = new Button("1");
        	B1.addActionListener(DE);
        B2 = new Button("2");
        	B2.addActionListener(DE);
        B3 = new Button("3");
        	B3.addActionListener(DE);
        B4 = new Button("4");
        	B4.addActionListener(DE);
        B5 = new Button("5");
        	B5.addActionListener(DE);
        B6 = new Button("6");
        	B6.addActionListener(DE);
        B7 = new Button("7");
        	B7.addActionListener(DE);
        B8 = new Button("8");
        	B8.addActionListener(DE);
        B9 = new Button("9");
        	B9.addActionListener(DE);
        
        btn_add = new Button("+");
        	btn_add.addActionListener(OE);
        btn_sub = new Button("-");
        	btn_sub.addActionListener(OE);
        btn_div = new Button("%");
        	btn_div.addActionListener(OE);
        btn_mult = new Button("x");
        	btn_mult.addActionListener(OE);
        btn_equals = new Button("=");
        	btn_equals.addActionListener(OE);
        btn_clear = new Button("C");
        	btn_clear.addActionListener(OE);
        //button end

        GridLayout G = new GridLayout(4,4);
        P2.setLayout(G);
       
        P1.add(T1);
        P2.add(B0);
        P2.add(B1);
        P2.add(B2);
        P2.add(B3);
        P2.add(B4);
        P2.add(B5);
        P2.add(B6);
        P2.add(B7);
        P2.add(B8);
        P2.add(B9);
        P2.add(btn_add);
        P2.add(btn_sub);
        P2.add(btn_div);
        P2.add(btn_mult);
        P2.add(btn_equals);
        P2.add(btn_clear);
        
        F.add(P1,BorderLayout.NORTH);
        F.add(P2,BorderLayout.CENTER);
        F.setSize(400,400);
        F.setVisible(true);
	}
}