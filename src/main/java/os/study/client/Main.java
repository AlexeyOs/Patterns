package os.study.client;

import os.study.Course;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Java Junior","Java","job4j");
        Course course2 = course.clone();
        boolean result = course.equals(course2);
        System.out.println("Test " + result);
    }
}
