import javafx.animation.Animation;
	import javafx.animation.KeyFrame;
	import javafx.animation.Timeline;
	import javafx.event.Event;
	import javafx.event.EventHandler;
	import javafx.event.EventType;
	import javafx.scene.Node;
	import javafx.scene.Scene;
	import javafx.util.Duration;

import java.awt.event.ActionEvent;

import javax.swing.Timer;
	
	
public class idleTimer {
	MyController con = new MyController();
	Timer idleTime = new Timer(300000, null);
	int lemons;
	
	
	//1000 = 1 sec
	//60 sec = 1 min
	//300 sec = 5 min
	//300 * 1000 = 300000 sec
	public void setTimer() {
		
		if(con.onSubmitClick == true) {
			(idleTime(300000) - 10000);
		}
			
		if(idleTime == 0) {
				lemons +1;
					}	
		
	}
}