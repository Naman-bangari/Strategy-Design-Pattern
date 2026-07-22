package com.robot.strategy.walk;
public class Notwalk implements Walkable {
    public void walk()
    {
        System.out.println("Robot can't walk");
    }
}
