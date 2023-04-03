package constructordepdencyinjection;

public class Employe {
private String ename;
private int eid;
private String erole;
public Employe(String ename, int eid, String erole) {
	super();
	this.ename = ename;
	this.eid = eid;
	this.erole = erole;
}
@Override
public String toString() {
	return "Employe [ename=" + ename + ", eid=" + eid + ", erole=" + erole + "]";
}

}
