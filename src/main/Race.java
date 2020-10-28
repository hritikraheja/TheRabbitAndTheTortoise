package main;

import thread.rabbit.Rabbit;
import thread.tortoise.Tortoise;

import javax.swing.*;

public class Race {
    public static void main(String[] args) {
        String winner;
        Tortoise tortoise = new Tortoise();
        Rabbit rabbit = new Rabbit();
        rabbit.getRabbit().start();
        tortoise.getTortoise().start();

        while ((rabbit.getRabbit().isAlive() || tortoise.getTortoise().isAlive())) {

        }
            if (tortoise.getRaceTimeInSeconds() < rabbit.getRaceTimeInSeconds()) {
                winner = "TORTOISE";
            } else if(tortoise.getRaceTimeInSeconds() == rabbit.getRaceTimeInSeconds()){
                winner = "NOBODY";
            } else {
                winner = "RABBIT";
            }
        System.out.println("Rabbit has finished the race in " + rabbit.getRaceTimeInSeconds() + " seconds.");
        System.out.println("Tortoise has finished the race in " + tortoise.getRaceTimeInSeconds() + "seconds.");
            JOptionPane.showMessageDialog(null, winner + " HAS WON THE RACE.", "RESULT", JOptionPane.INFORMATION_MESSAGE);
        }
}
