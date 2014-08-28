import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MyFrame {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Frame f = new Frame("houhou");
		f.setSize(800,600);
		f.setLocation(500,100);
		f.setBackground(Color.gray);
		//f.setLayout(new BorderLayout(10,10));
		//f.setLayout(new FlowLayout(FlowLayout.LEFT));
		//f.setLayout(new GridLayout(3,2,10,10));
		Button btn1=new Button("btn1");
		Button btn2=new Button("btn2");
		Button btn3=new Button("btn3");
		Button btn4=new Button("btn4");
		Button btn5=new Button("btn5");
		
		btn1.setSize(10,20);
		btn2.setSize(10,20);
		btn3.setSize(10,20);
		btn4.setSize(10,20);
		btn5.setSize(10,20);
		
		f.add(btn1,"North");
		f.add(btn2,"West");
		f.add(btn3,"East");
		f.add(btn4,"South");
		f.add(btn5,"Center");
		//f.addWindowListener(new MyWindowListener2());

		f.show();

	}

}

class MyWindowListener1 implements WindowListener{
	public void windowOpened(WindowEvent e){
		
	}
	public void windowClosing(WindowEvent e){
		System.out.println("退出了");
		System.exit(0);
	}
	public void windowClosed(WindowEvent e){
		
	}

	public void windowIconified(WindowEvent e){
		
	}
	public void windowActivated(WindowEvent e) {
		
	}
	public void windowDeactivated(WindowEvent e){
		
	}
	public void windowDeiconified(WindowEvent e) {

		
	}

} 

class MyWindowListener2 extends WindowAdapter{
	public void windowClosing(WindowEvent e){
		System.out.println("退出了");
		System.exit(0);
	}
}