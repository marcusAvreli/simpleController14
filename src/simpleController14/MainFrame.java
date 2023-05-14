package simpleController14;

import javax.swing.JFrame;
import javax.swing.JLabel;

import simpleController14.core.view.AbstractViewContainer;
import simpleController14.core.view.DefaultViewContainer;


public class MainFrame  extends JFrame{
	public MainFrame() {
		
		initComponents();
	}
	
	public void initComponents() {

	     setExtendedState(MAXIMIZED_BOTH);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 AbstractViewContainer viewContainer = new DefaultViewContainer();

		 JLabel lbl = new JLabel("test");


		 viewContainer.setComponent(lbl);
		 ViewManager viewManager = new ViewManager();
		 viewManager.setFrame(this);
		 viewManager.addView(viewContainer);
	}
}
