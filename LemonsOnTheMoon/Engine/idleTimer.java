
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
import java.util.Timer;
import java.util.TimerTask;
	
	
class idleTimer {
	Timer timer = new Timer();
	void schedulde(TimerTask task, long milliseconds) {
		
	
 timer.schedule(new TimerTask(){
	public void run() {
		System.out.println("IT WORKS");
	}
 },60000l);
	}
}	
