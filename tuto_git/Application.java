package tuto_git;

import java.awt.Frame;
import java.awt.event.WindowAdapter;

public class Application extends Frame {

	public static void main(String[] args) {
		new Application();
	}
	
	public Application() {
		super();
		
		Modèle modl = new Modèle();
		Contrôleur ctrl = new Contrôleur(modl); 
		Vue vue = new Vue();
		modl.addObserver(vue);
		vue.addActionListener(ctrl);
		this.setTitle("Carla est belle");
		this.add(vue);

		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			}
		});
	};
}


