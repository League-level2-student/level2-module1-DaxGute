package intro_to_array_lists;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JButton but1;
	JButton but2;
	ArrayList <String> dog = new <String> ArrayList();
	public static void main(String[] args) {
		GuestBook book = new GuestBook();
		book.setup();
	}
	public void setup() {
		JFrame frame = new JFrame("Guest Book");
		frame.setSize(720, 480);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		but1 = new JButton("Add Name");
		but2 = new JButton("View Name");
		frame.add(but1);
		frame.add(but2);
		but1.addActionListener(this);
		but2.addActionListener(this);
		frame.setLayout(new FlowLayout());
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == but1) {
			String cat = JOptionPane.showInputDialog(null, "Enter name");
			dog.add(cat);
		}else if(e.getSource() == but2) {
			for(int i = 0; i < dog.size(); i ++) {
				System.out.println("Guest #" + (i + 1) + ": " + dog.get(i));
				
			}
		}
	}
}
