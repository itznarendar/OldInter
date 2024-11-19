package sort;
public class Subject {
public Subject(Integer marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
private Integer marks;
private String name;
}
