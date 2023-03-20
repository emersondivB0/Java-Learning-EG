package model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso implements Comparable<Curso> {
	
	private String nombre;
	private int tiempo;
	private List<Aula> aulaList = new LinkedList<Aula>();
	
	public Curso(String nombre, int tiempo) {
		super();
		this.nombre = nombre;
		this.tiempo = tiempo;
	}

	public Curso(String nombre, int tiempo, List<Aula> aulaList) {
		super();
		this.nombre = nombre;
		this.tiempo = tiempo;
		this.aulaList = aulaList;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	
	public List<Aula> getAulaList() {
		return Collections.unmodifiableList(aulaList);
	}

	public void setAulaList(List<Aula> claseList) {
		this.aulaList = claseList;
	}

	public void addAula(Aula aula) {
		this.aulaList.add(aula);
	}
	
	@Override
	public String toString() {
		return this.nombre;
	}
	@Override
	public int compareTo(Curso o) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(o.getNombre());
	}


	
	

}
