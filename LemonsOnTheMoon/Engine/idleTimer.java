
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
	private long second;
	private int lemonCounter;
	private Timer timer;
	
	public void main(){
        this.second = 60;
        this.lemonCounter = 0;
        timer = new Timer();
        TimerTask task = new TimerTask(){
            public void run() {
                second--;
               
                if (second >40){
                    System.out.println("Phase One");
                }else if(second < 40 && second >20){
                    System.out.println("Phase Two");
                }else if(second < 20 && second > 1){
                   System.out.println("Phase Three");
                }if(second <=0){
                    second = 60;
                    lemonCounter += 3;
                    System.out.println("Lemons: " + lemonCounter);
                }
            }


            };
            timer.scheduleAtFixedRate(task,30l,second);
        };
	}