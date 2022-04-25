package com.company;

import java.util.Objects;

 class Students {
    private String name="ss";
    private int course=1;

     public Students(String name) {
         this.name = name;
     }

     public Students(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Students)) return false;
        Students students = (Students) o;
        return getCourse() == students.getCourse() && getName().equals(students.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCourse());
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }



}
