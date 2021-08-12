package Watson.James.Unit_36.ClickerEngine;

import javafx.animation.Animation;
	import javafx.animation.KeyFrame;
	import javafx.animation.Timeline;
	import javafx.event.Event;
	import javafx.event.EventHandler;
	import javafx.event.EventType;
	import javafx.scene.Node;
	import javafx.scene.Scene;
	import javafx.util.Duration;

public class idleTimer {
	
	    private final Timeline idleTimeline ;

	    private final EventHandler<Event> userEventHandler ;

	    public idleTimer(Duration idleTime, Runnable notifier, boolean startMonitoring) {
	        idleTimeline = new Timeline(new KeyFrame(idleTime, e -> notifier.run()));
	        idleTimeline.setCycleCount(Animation.INDEFINITE);

	        userEventHandler = e -> notIdle() ; 

	        if (startMonitoring) {
	            startMonitoring();
	        }
	    }

	    public idleTimer(Duration idleTime, Runnable notifier) {
	        this(idleTime, notifier, false);
	    }

	    public void register(Scene scene, EventType<? extends Event> eventType) {
	        scene.addEventFilter(eventType, userEventHandler);
	    }

	    public void register(Node node, EventType<? extends Event> eventType) {
	        node.addEventFilter(eventType, userEventHandler);
	    }

	    public void unregister(Scene scene, EventType<? extends Event> eventType) {
	        scene.removeEventFilter(eventType, userEventHandler);
	    }

	    public void unregister(Node node, EventType<? extends Event> eventType) {
	        node.removeEventFilter(eventType, userEventHandler);
	    }

	    public void notIdle() {
	        if (idleTimeline.getStatus() == Animation.Status.RUNNING) {
	            idleTimeline.playFromStart();
	        }
	    }

	    public void startMonitoring() {
	        idleTimeline.playFromStart();
	    }

	    public void stopMonitoring() {
	        idleTimeline.stop();
	    }
	}
}
