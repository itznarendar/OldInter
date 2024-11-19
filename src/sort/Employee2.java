package sort;

public class Employee2 {
private Integer exp;
private String dept;
private String name;
@Override
public String toString() {
	return "Employee2 [exp=" + exp + ", dept=" + dept + ", name=" + name + "]";
}
public Employee2(Integer exp, String dept, String name) {
	super();
	this.exp = exp;
	this.dept = dept;
	this.name = name;
}
public Integer getExp() {
	return exp;
}
public void setExp(Integer exp) {
	this.exp = exp;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
