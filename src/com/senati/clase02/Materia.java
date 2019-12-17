package com.senati.clase02;

public class Materia {
	String idnombre;
	int  Nrohoras;
	
	public Materia(String idnombre, int nrohoras) {
		super();
		this.idnombre = idnombre;
		Nrohoras = nrohoras;
	}

	public Materia() {
		super();
	}

	public String getIdnombre() {
		return idnombre;
	}

	public void setIdnombre(String idnombre) {
		this.idnombre = idnombre;
	}

	public int getNrohoras() {
		return Nrohoras;
	}

	public void setNrohoras(int nrohoras) {
		Nrohoras = nrohoras;
	}

	@Override
	public String toString() {
		return "Materia [idnombre=" + idnombre + ", Nrohoras=" + Nrohoras + "]";
	}
	
	
	
	
}
