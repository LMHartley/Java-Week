import java.awt.*;
import java.awt.event.*;

class Windows7{
    public static void main(String XYZ[]){
        Frame win=new Frame();
        Button B1=new Button("Click 1");
        win.add(B1,BorderLayout.SOUTH);
        Action1 E=new Action1();
        B1.addActionListener(E);
        win.setSize(400,400);
        win.setVisible(true);
    }
}
class Action1 implements ActionListener{
    public void actionPerformed(ActionEvent X){
        System.out.println("Hello my friends");
    }
}