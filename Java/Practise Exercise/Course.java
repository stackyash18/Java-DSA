 class Course
  {
    public static int maxCapicity = 240;

    String courseName;
    String studentName;
    int courseId;
    int enrollments;


    String[] enrolledStudents;

    Course(String courseName, int maxCapicity)
    {
      this.courseName = courseName;
      this.enrollments = 0;
      this.enrolledStudents = new String[maxCapicity];
    }
 


    static void setMaxCapacity(int maxCapicity)
    {
      Course.maxCapicity = maxCapicity;
    }

    public void enrollStudent(String studentName)
    {
      enrolledStudents[enrollments] = studentName;
      enrollments++;
      System.out.println("Congratulations! " + studentName + " Has been enrolled in the course " + courseName);
      maxCapicity--;
    }

    public void unenrollStudent(String studentName)
    {
      String target = studentName; 
        int targetIndex = -1;

        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null && enrolledStudents[i].equals(target)) {
                targetIndex = i;
                break; 
            }
        }
        if (targetIndex != -1) {
          for (int i = targetIndex; i < enrolledStudents.length - 1; i++) {
              enrolledStudents[i] = enrolledStudents[i + 1];
          }
          enrolledStudents[enrolledStudents.length - 1] = null; 
          System.out.println(studentName + " Has been unenrolled from the course " + courseName);
          enrollments--;
      } else {
          System.out.println("The student is not enrolled.");
      }
     
    }

  public static void main(String args[])
  {
    Course BCA = new Course("BCA",240);
    BCA.courseId = 114;
    BCA.enrollStudent("Yash Tomar");
    BCA.unenrollStudent("Yash Tomar");

  }
}
