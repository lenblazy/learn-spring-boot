package com.lenibonje.learnspringboot;

public class Course {

    private int id;
    private String courseName;
    private String courseTitle;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public Course(int id, String courseName, String courseTitle) {
        this.id = id;
        this.courseName = courseName;
        this.courseTitle = courseTitle;
    }
}
