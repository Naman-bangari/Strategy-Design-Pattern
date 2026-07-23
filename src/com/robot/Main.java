package com.robot;

import java.util.Scanner;

import com.robot.model.Robot;
import com.robot.strategy.fly.Flyable;
import com.robot.strategy.fly.NormalFly;
import com.robot.strategy.fly.NotFly;
import com.robot.strategy.talk.NormalTalk;
import com.robot.strategy.talk.NotTalk;
import com.robot.strategy.talk.Talkable;
import com.robot.strategy.walk.NormalWalk;
import com.robot.strategy.walk.Notwalk;
import com.robot.strategy.walk.Walkable;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("please select number \n 1 Walk \n 2 No Walk\n");
        Integer walk = sc.nextInt();
        Walkable walkable;
        if (walk.equals(1))
            walkable = new NormalWalk();
        else
            walkable = new Notwalk();

        
        System.out.println("\nplease select number \n 1 Talk \n 2 No Talk\n");
        Integer talk = sc.nextInt();
        Talkable talkable;
        if (talk.equals(1))
            talkable = new NormalTalk();
        else
            talkable = new NotTalk();

        System.out.println("\nplease select number \n 1 Fly \n 2 No Fly\n");
        Integer fly = sc.nextInt();
        Flyable flyable;
        if (fly.equals(1))
            flyable = new NormalFly();
        else
            flyable = new NotFly();

        Robot robot = new Robot(walkable, talkable, flyable);
        robot.allfunctionality();

    }
}
