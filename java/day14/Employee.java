package day14;

public class Employee {
	
	private String name;
	private String dept;
	private int age;
	private long mobileNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Employee() {
	
	}
	public Employee(String name, String dept, int age, long mobileNo) {
	
		this.name = name;
		this.dept = dept;
		this.age = age;
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + "\n dept=" + dept + "\n age=" + age + "\n mobileNo=" + mobileNo + "]";
	}
	
}
