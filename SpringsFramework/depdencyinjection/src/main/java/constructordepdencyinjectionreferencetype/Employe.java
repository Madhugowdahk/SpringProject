package constructordepdencyinjectionreferencetype;

public class Employe {
private String ename;
private String esal;
private Depe depe;
public Employe(String ename, String esal, Depe depe) {
	
	this.ename = ename;
	this.esal = esal;
	this.depe = depe;
}
@Override
public String toString() {
	return "Employe [ename=" + ename + ", esal=" + esal + ", depe=" + depe + "]";
}


}
