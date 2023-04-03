package constructordependencyinject;

public class Student {
private String ename;
private int eid;
private String esec;
public Student(String ename, int eid, String esec) {
	this.ename = ename;
	this.eid = eid;
	this.esec = esec;
}
@Override
public String toString() {
	return "Student [ename=" + ename + ", eid=" + eid + ", esec=" + esec + "]";
}

}
