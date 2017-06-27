import java.awt.EventQueue;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Button;

public class Window extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowListenerEvent());
		TextField tf = new TextField();
		Button bi = new Button("Click");
		frame.add(tf, BorderLayout.NORTH);
		frame.add(bi, BorderLayout.CENTER);
		frame.setSize(300, 500);
		frame.setDefaultCloseOperation(2);
		/*bi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tf.setText("Hello");
			}
			
		});*/
		bi.addActionListener(new ButtonClickEvent(tf));
	}

	class ButtonClickEvent implements ActionListener {
		
		private TextField tf;

		public ButtonClickEvent(TextField tf) {
			this.tf = tf;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			tf.setText("Hello");
		}
		
	}
	
	class WindowListenerEvent implements WindowListener {
		
		public WindowListenerEvent() {
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Window activated.");
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Window closed.");
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Window closing...");
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Window deiconified.");
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Window iconified.");
		}

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Window opened.");
		}
		
	}
	
}
