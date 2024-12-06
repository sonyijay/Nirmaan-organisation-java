package day11;

public class Company {
	private String name;
	private int age;
	private String department;
	 Company(){
		 
	 }
//	Company(String name,int age,String department){
//		this.name=name;
//		this.age=age;
//		this.department=department;

 public String getName() {
	return name;
}
 public  int getAge() {
	return age;
}
 public String getDepartment() {
	return department;
}
 
 public void  setName(String name) {
	 this.name=name;
 }
 public void setAge(int age) {
	 this.age=age;
 }
 public void setDepartment(String department) {
	 this.department=department;
 }
 public String toString()
 {
	 return( "my name is :"+name +"\nmy age is :"+ age +"\nmy department is :"+department);
 }

}
