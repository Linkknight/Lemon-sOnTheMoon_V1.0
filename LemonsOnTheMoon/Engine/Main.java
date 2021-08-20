package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    JFrame window;
    JLabel counterLable;
    Font font1 = new Font("Arial", Font.PLAIN, 70);
    Timer timer;
    int second;
    int lemonCounter;
    Player player = new Player();
    JButton button;

    public static void main(String[] args) {
        new Main();
    }

    public Main(){
        window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);

        button = new JButton();
        button.setBounds(200,100,100,50);
        button.setSize(100,100);
        button.setVisible(true);

        window.add(button);

        counterLable = new JLabel("");
        counterLable.setBounds(300,230,200,100);
        counterLable.setHorizontalAlignment(JLabel.CENTER);
        counterLable.setFont(font1);

        window.add(counterLable);
        window.setVisible(true);


        treeGrowth();

        timer.start();

    }

    public void treeGrowth(){
        this.second = 60;
        this.lemonCounter = 0;
        button.addActionListener(e -> second -= 10);
        timer = new Timer(1000, new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        second--;
                        System.out.println(second);
                        counterLable.setText("" + second + " " + lemonCounter);



                        if (second >40){
                            //1st tree phase
                        }else if(second < 40 && second >20){
                            //2nd tree phase
                        }else if(second < 20 && second > 1){
                           //3rd tree phase
                        }if(second <=0){
                            second = 60;
                            lemonCounter += 3;
                        }
                    }

                });
    }

}
