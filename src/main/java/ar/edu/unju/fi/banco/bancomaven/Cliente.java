package ar.edu.unju.fi.banco.bancomaven;

import java.util.ArrayList;


public class Cliente {
	
	private int id;
	private int dni;
	private String nombre;
	private String correo;
	private String domicilio;
	private boolean estado;
	private ArrayList<Cliente> adherentes;
	private Cliente adherenteDe;
	private CuentaBancaria cuenta;
	private int numCliente;


	public Cliente(){
		
	}
	
	public Cliente (int dni,String nombre, CuentaBancaria cuenta,int id ) {
		this.dni = dni;
		this.nombre = nombre;
		this.cuenta = cuenta;
		this.id = id;
	}
	
	public int getId () {
		return id;
	}
	public void setId (int val) {
		this.id = val;
	}
	
	public int getDni () {
		return dni;
	}
	public void setDni (int val) {
		this.dni = val;
	}
	
	public String getNombre () {
		return nombre;
	}
	public void setNombre (String val) {
		this.nombre = val;
	}
	
	public String getCorreo () {
		return correo;
	}
	public void setCorreo (String val) {
		this.correo = val;
	}
	
	public String getDomicilio () {
		return domicilio;
	}
	public void setDomicilio (String val) {
		this.domicilio = val;
	}
	
	public boolean getEstado () {
		return estado;
	}
	public void setEstado (boolean val) {
		this.estado = val;
	}

	public ArrayList<Cliente> getAdherentes() {
		return adherentes;
	}

	public void setAdherentes(ArrayList<Cliente> adherentes) {
		this.adherentes = adherentes;
	}

	public Cliente getAdherenteDe() {
		return adherenteDe;
	}

	public void setAdherenteDe(Cliente adherenteDe) {
		this.adherenteDe = adherenteDe;
	}
	
	public CuentaBancaria getCuenta() {
		return cuenta;
	}

	public void setCuenta(CuentaBancaria cuenta) {
		this.cuenta = cuenta;
	}

	public int getNumCliente() {
		return numCliente;
	}

	public void setNum_cliente(int numCliente) {
		this.numCliente = numCliente;
	}	

}
