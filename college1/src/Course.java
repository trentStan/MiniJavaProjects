/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LMQF353S5
 */
public class Course {
    
    private String courseName;
    private String courseID;
    
    
    public Course(String courseID, String course )
    {
        this.courseName = course;
        this.courseID = courseID;
    }
    public void setCourse(String change)
    {
        this.courseName = change;
    }
    public String getCourse()
    {
        return this.courseName;
    }
     public void setCourseID(String change)
    {
        this.courseID = change;
    }
    public String getCourseID()
    {
        return this.courseID;
    }
   
}
