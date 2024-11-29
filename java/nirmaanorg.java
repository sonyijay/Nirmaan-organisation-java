package Day6;
import java.util.Scanner;
public class nirmaanorg {
 String studentname;
String course;
int rollno;

public static void main(String[] args){
	Scanner sc =new Scanner(System.in);

nirmaanorg details=new nirmaanorg();
 
//details.studentname="sony.v";
//
//details.course="java";
//
//details.rollno=12;
//
//System.out.println(details.studentname);
//System.out.println(details.course);
//System.out.println(details.rollno );
System.out.println("enter your name");
details.studentname =sc.next();
System.out.println("enter your course");
details.course=sc.next();
System.out.println("enter your roll no");
details.rollno=sc.nextInt();

System.out.println(details.studentname);
System.out.println(details.course);
System.out.println(details.rollno);
}

}
