package Strings;

public class Employee {
private String name,id,city;
int sal;

public String getName() {
	return name;
}

public Employee(String name, String id, String city, int sal) {
	super();
	this.name = name;
	this.id = id;
	this.city = city;
	this.sal = sal;
}

@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", city=" + city + ", sal=" + sal + "]";
}

public void setName(String name) {
	this.name = name;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public int getSal() {
	return sal;
}

public void setSal(int sal) {
	this.sal = sal;
}
}
