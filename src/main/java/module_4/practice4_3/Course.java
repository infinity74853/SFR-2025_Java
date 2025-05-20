package module_4.practice4_3;

import java.util.Objects;

public class Course {
  private String name;
  private String instructor;

  public Course(String name, String instructor) {
    this.name = name;
    this.instructor = instructor;
  }

  public String getName() {
    return name;
  }

  public String getInstructor() {
    return instructor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Course course = (Course) o;
    return Objects.equals(name, course.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return "Course: " + name + " - Instructor: " + instructor;
  }
}
