
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
	
	
public class idleTimer {
	
	public static void main(String[] args) {
		Timer timer = new Timer();
		long start = 30000l;
		long time = 60000l;
		TimerTask task = new TimerTask(){
		public void run() {
			System.out.println("IT WORKS");
			
		}
		
	};	
		timer.scheduleAtFixedRate(task,start,time);
		}
	}