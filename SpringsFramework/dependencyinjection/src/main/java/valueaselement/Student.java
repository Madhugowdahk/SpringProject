package valueaselement;

public class Student {
private int marks;
private int name;
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public int getName() {
	return name;
}
public void setName(int name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student [marks=" + marks + ", name=" + name + "]";
}

}
