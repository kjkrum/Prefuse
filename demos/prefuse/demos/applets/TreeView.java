package prefuse.demos.applets;

import prefuse.util.ui.JPrefuseApplet;


public class TreeView extends JPrefuseApplet {
	private static final long serialVersionUID = 1L;

    public void init() {
        this.setContentPane(
            prefuse.demos.TreeView.demo("/chi-ontology.xml.gz", "name"));
    }
    
} // end of class TreeView
