package ar.edu.unju.fi.banco.bancomaven;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CuentaBancaria {

	private int idCuenta;
	private Cliente cliente;
	private Date fechaIngreso;
	private float saldoActual;
	private boolean estado;
	private float limiteExt;
	private List<Movimientos> movimientos;
	
	
	public CuentaBancaria() {
		movimientos = new ArrayList<Movimientos>(); 
		
	}
	public CuentaBancaria (float saldo, int id, float limiteExt) {
		movimientos = new ArrayList<Movimientos>();
		this.saldoActual = saldo;
		this.idCuenta = id; 
		this.limiteExt = limiteExt;
		
	}
	
	
	public int getIdCuenta() {
		return idCuenta;
	}
	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public float getSaldoActual() {
		return saldoActual;
	}
	public void setSaldoActual(float saldoActual) {
		this.saldoActual = saldoActual;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public float getLimiteExt() {
		return limiteExt;
	}
	public void setLimiteExt(float limiteExt) {
		this.limiteExt = limiteExt;
	}
	

	
	public List<Movimientos> getMovimiento() {
		return movimientos;
	}
	public void setMovimiento(List<Movimientos> movimiento) {
		this.movimientos = movimiento;
	}
	
	public void extraer (float importe) {
		if (saldoActual>=importe && limiteExt>=importe) {
			saldoActual=saldoActual-importe;
		}
	}
	
	public void agregar (float importe) {

		saldoActual=saldoActual+importe;
		
	}
	
}
