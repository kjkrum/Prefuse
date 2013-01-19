package prefuse.demos.applets;

import prefuse.util.ui.JPrefuseApplet;


public class FisheyeMenu extends JPrefuseApplet {
	private static final long serialVersionUID = 1L;
    
    public void init() {
        prefuse.demos.FisheyeMenu fm = prefuse.demos.FisheyeMenu.demo();
        this.getContentPane().add(fm);
        fm.getVisualization().run("init");
    }
    
} // end of class FisheyeMenu
