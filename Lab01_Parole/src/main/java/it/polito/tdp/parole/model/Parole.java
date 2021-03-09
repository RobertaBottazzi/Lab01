package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
	
	private List<String> parole;
	
	public Parole() {
		parole= new ArrayList<>();
	}
	
	public void addParola(String p) {
		char[] parolaInCaratteri=p.toCharArray();
		boolean alphabetic=true;
		for(char c: parolaInCaratteri) {
			if(!Character.isAlphabetic(c))
				alphabetic=false;			
		}
		if(alphabetic)
			parole.add(p);
	}
	
	public List<String> getElenco() {
		parole.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}			
		});
		return parole;
	}
	
	public void reset() {
		parole.clear();
	}
	
	public void remove(String p) {
		parole.remove(p);
	}
	public List<String> getParole() {
		return parole;
	}

	public void setParole(List<String> parole) {
		this.parole = parole;
	}

	@Override
	public String toString() {
		return parole + "\n";
	}

	
	
	

}
