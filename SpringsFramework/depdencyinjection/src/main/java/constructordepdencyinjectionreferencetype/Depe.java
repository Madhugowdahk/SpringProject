package constructordepdencyinjectionreferencetype;

public class Depe {
private String depename;

public Depe(String depename) {
	super();
	this.depename = depename;
}

@Override
public String toString() {
	return "Depe [depename=" + depename + "]";
}

}
