//Just doing the same thing for required courses that has been done for electives, program title, program description so far
//Ryan Parent

import java.util.*;

public class RequiredCourses{

  private static ArrayList<String> requiredCoursesList = new ArrayList<String>();

  public static void listRequiredCourses(){
    if (requiredCoursesList.size() == 0){
      System.out.println("There are no required courses");
    } else {
      for (int i = 0; i < requiredCoursesList.size(); i++ ){
        System.out.println(requiredCoursesList.get(i));
      }
    }
  }

  public static void addRequiredCourses(String rc){
    requiredCoursesList.add(rc);
  }

  public static void removeRequiredCourses(String rc){
    if (requiredCoursesList.contains(rc)){
      requiredCoursesList.remove(rc);
    } else {
      System.out.println("Required course "+rc+" was not found.");
      System.out.println("Make sure you spelled it correctly.");
    }
  }
}
