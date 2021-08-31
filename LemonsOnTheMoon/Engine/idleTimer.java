import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import java.util.Timer;
import java.util.TimerTask;
	
public class idleTimer {
	static int second = 60;
	static int lemonCounter = 0;
	static int trees = 0;
	private Timer timer;

	public void main(TextField tx, ImageView p1, ImageView p2, ImageView p3){

        timer = new Timer();
        TimerTask task = new TimerTask(){
        	
            public void run() {
            	
                second--;
                String lemons = String.valueOf(lemonCounter);
                
                if (second >40 && second <60){
                	tx.setText(lemons);
                	p1.setVisible(true);
                	p2.setVisible(false);
                	p3.setVisible(false);
                  
                }else if(second < 40 && second >20){
                	tx.setText(lemons);
                	p1.setVisible(false);
                	p2.setVisible(true);
                	p3.setVisible(false);
                	  
                }else if(second < 20 && second > 1){
                	tx.setText(lemons);
                	p1.setVisible(false);
                	p2.setVisible(false);
                	p3.setVisible(true);
                	 
                }if(second <0){
                    second = 60;
                }
              
            }

            };
            timer.scheduleAtFixedRate(task,0,1000);
        };
	}