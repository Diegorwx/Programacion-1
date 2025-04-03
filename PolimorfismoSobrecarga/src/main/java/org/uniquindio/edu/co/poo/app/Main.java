package org.uniquindio.edu.co.poo.app;


import org.uniquindio.edu.co.poo.model.Robot;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot("Wilson","1732");

        robot.saludar("Robinson");
        robot.saludar("Michael", "Smith");
        robot.saludar();
    }

}