package com.gl.student;

/**
 * A simple Java class representing a Student.
 */
public class Student {
    
    // Fields for student information
    private int rollno;
    private String name;

    /**
     * Constructor to create a new Student object.
     * 
     * @param rollno The roll number of the student.
     * @param name The name of the student.
     */
    public Student(int rollno, String name) {
        super();
        this.rollno = rollno;
        this.name = name;
    }

    /**
     * Getter method to retrieve the roll number.
     * 
     * @return The roll number of the student.
     */
    public int getRollno() {
        return rollno;
    }

    /**
     * Setter method to set the roll number.
     * 
     * @param rollno The roll number to set.
     */
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    /**
     * Getter method to retrieve the name.
     * 
     * @return The name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method to set the name.
     * 
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Overrides the default toString() method to provide a string representation of the Student object.
     * 
     * @return A string representation of the Student object.
     */
    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + "]";
    }

}
