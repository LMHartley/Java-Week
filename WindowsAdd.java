import java.awt.event.*;
import java.awt.*;

class WindowsAdd{
    public static void main(String XYZ[]){
        Frame F = new Frame("Calculations");
        TextField T1,T2,T3;
        Label L1,L2,L3;

        Button B1,B2,B3,B4;
        B1 = new Button("+");
        B2 = new Button("-");
        B3 = new Button("x");
        B4 = new Button("%");

        L1 = new Label("1st No.");
        L2 = new Label("2nd No.");
        L3 = new Label("Result");
        T1 = new TextField(10);
        T2 = new TextField(10);
        T3 = new TextField(10);
        FlowLayout Fl = new FlowLayout();
        F.setLayout(Fl);
        EventH E = new EventH(T1,T2,T3);
        

        B1.addActionListener(E);
        B2.addActionListener(E);
        B3.addActionListener(E);
        B4.addActionListener(E);

        F.add(L1);
        F.add(T1);
        F.add(L2);
        F.add(T2);

        F.add(B1);
        F.add(B2);
        F.add(B3);
        F.add(B4);


        F.add(L3);
        F.add(T3);
        F.setSize(400,400);
        F.setVisible(true);
    }
}

class EventH implements ActionListener{
    TextField No1,No2,Result;
    public EventH(TextField A, TextField B,TextField C){
        No1=A;
        No2=B;
        Result=C;
    }
    public void actionPerformed(ActionEvent X){
        int A,B,C;
        A=Integer.parseInt(No1.getText());
        B=Integer.parseInt(No2.getText());
        Button BTN= (Button) X.getSource();
        String Ch = BTN.getLabel();
        if(Ch.equals("+")){
            C=A+B;
            Result.setText(Integer.toString(C));
        }
        if(Ch.equals("-")){
            C=A-B;
            Result.setText(Integer.toString(C));
        }
        if(Ch.equals("x")){
            C=A*B;
            Result.setText(Integer.toString(C));
        }
        if(Ch.equals("%")){
            C=A/B;
            Result.setText(Integer.toString(C));
        }
    }
}

