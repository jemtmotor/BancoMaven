package ar.edu.unju.fi.banco.bancomaven;

import java.util.Date;


public class Movimientos {

	

	private static int idMovimiento;
	private Date fechaMovimiento;
	private CuentaBancaria cuenta;
	private float importe;
	
	public Movimientos() {
		idMovimiento = idMovimiento+1;
		
	}
	
	public int getIdMovimiento() {
		return idMovimiento;
	}

	public Date getFechaMovimiento() {
		return fechaMovimiento;
	}
	public void setFechaMovimiento(Date fechaMovimiento) {
		this.fechaMovimiento = fechaMovimiento;
	}
	public CuentaBancaria getCuenta() {
		return cuenta;
	}
	public void setCuenta(CuentaBancaria cuenta) {
		this.cuenta = cuenta;
	}
	public float getImporte() {
		return importe;
	}
	public void setImporte(float importe) {
		this.importe = importe;
	}


}
