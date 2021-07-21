
package studentdatabaseapp;

import java.util.Scanner;

/**
 *
 * @author Davie
 */
public class students {
    
    private String firstname;
    private String lastname;
    private int gradeYear;
    private String studentID;
    private String courses= null;
  
    private int tuitionBalance =0;
    private static int costOfCourse=900;
    private static int id=1701;
    
    
    
    
    //constructor: prompt user to enter students name and year
    public students() {
      Scanner in=new Scanner(System.in);
      System.out.print("enter students first name:");
      this.firstname = in.nextLine();
      
       System.out.print("enter students last name:");
      this.lastname = in.nextLine();
      
       System.out.print("1-Freshman\n2-sophmore\n3-junior\n4-senior\nEnter students class level:");
      this.gradeYear = in.nextInt();
      setStudentID();
      
      System.out.println(firstname+""+lastname+""+gradeYear+""+ studentID);
      
      
      
      
    }
    //Generate an ID
    
    
    private void setStudentID (){
        System.out.println(firstname+ " "  +lastname+  " " +gradeYear+ " " +studentID);
        
    
    //grade level+ID
    
    id++;
    
    this.studentID = gradeYear+ " "  +id ;
    
    }
    
    //Enroll in courses
    
    public void  enroll() {
    
    
    //get inside a loop, user hits 0
        do  {
                System.out.print( "Enter course to enroll (Q to quit) :");
    
                 Scanner in = new Scanner(System.in);
                    String course= in.nextLine();
                if (!course.equals  ("Q" )) {
                courses= courses +" \n " + course ;
                tuitionBalance= tuitionBalance + costOfCourse;
                }
                
                else {
                    System.out.println("BREAK!");
                    break; }
        }while ( 1 != 0 );
                
                
                System.out.println( "ENROLLED IN"+courses);
                System.out.println ("TUITIONBALANCE: " +tuitionBalance);
            
        }
    
    //view balance
    public void viewBalance(); {
    
    System.out.println("YOUR BALANCE: ");
}
    //pay tuition
    
    // show status
    
}
