package edu.javacourse.robot;

import java.util.ArrayList;
import java.util.List;

public class Robot
{
    private double x = 0;
    private double y = 0;
    protected double course = 0;
    private ArrayList<RobotLine> lines = ArrayList<RobotLine>();

    public Robot(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public void forward(int distance)
    {
        final double xOld = x;
        final double yOld = y;

        x += distance * Math.cos(course / 180 * Math.PI);
        y += distance * Math.sin(course / 180 * Math.PI);

        lines.add(new RobotLine(xOld, yOld, x, y));
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double getCourse()
    {
        return course;
    }

    public void setCourse(double course)
    {
        this.course = course;
    }

    public ArrayList<RobotLine> getLines()
    {
        return lines;
    }
}