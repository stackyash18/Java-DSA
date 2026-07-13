public class CollegeManangement {

  class Course
  {
    String courseName;
    int enrolledStudents;

    public static int maxCapicity;

    public void enrollStudent(String studentName)
    {
      maxCapicity--;
    }

    public void unenrollStudent(String studentName)
    {
      maxCapicity++;
    }

    public static int setMaxCapicity(int capacity)
    {
      return capacity;
    }
  }
  public static void main(String args[])
  {
    

  }
}
