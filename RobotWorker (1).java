package com.jah.isp.refactored;

public class RobotWorker implements Workable, Codeable {

    @Override
    public void work()      { System.out.println("Robot working..."); }

    @Override
    public void writeCode() { System.out.println("Robot writing code..."); }
}
