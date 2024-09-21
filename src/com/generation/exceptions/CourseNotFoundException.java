package com.generation.exceptions;

public class CourseNotFoundException extends Exception
{

    public CourseNotFoundException(String string)
    {
        super("course not found!!");
    }
}