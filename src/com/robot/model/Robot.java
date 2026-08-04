package com.robot.model;

import com.robot.strategy.fly.Flyable;
import com.robot.strategy.talk.Talkable;
import com.robot.strategy.walk.Walkable;

public class Robot {
    
    private Walkable walkable;
    private Talkable talkable;
    private Flyable flyable;
     
    public Robot(Walkable walk,Talkable talk, Flyable fly)
    {
        this.talkable=talk;
        this.walkable=walk;
        this.flyable=fly;
    }

    public void walk()
    {
        walkable.walk();
    }
    public void talk()
    {
        talkable.talk();
    }
    public void fly()
    {
        flyable.fly();
    }
    public void allfunctionality()
    {
        walkable.walk();
        talkable.talk();
        flyable.fly();
    }
}
