package com.generation.exceptions;

public class StudentNotFoundException
    extends Exception
{

    public StudentNotFoundException(String string )
    {
        super( "Student not found!" );
    }
}