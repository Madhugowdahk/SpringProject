package com.Appstandaloneapplication;


	import java.util.List;
	import java.util.Set;
	import java.util.Map;
import java.util.Properties;

	public class Employe {
		
		
	private List<String>phono;
	private Set<String>email;
	private Map<String,String>name;
	private Properties dpdrop;

	public Employe(Properties dpdrop) {
		super();
		this.dpdrop = dpdrop;
	}
	public List<String> getPhono() {
		return phono;
	}
	public void setPhono(List<String> phono) {
		this.phono = phono;
	}
	public Set<String> getEmail() {
		return email;
	}
	public void setEmail(Set<String> email) {
		this.email = email;
	}
	public Map<String, String> getName() {
		return name;
	}
	public void setName(Map<String, String> name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employe [dpdrop=" + dpdrop + "]";
	}

	}


