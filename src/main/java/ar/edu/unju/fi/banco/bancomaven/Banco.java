package ar.edu.unju.fi.banco.bancomaven;

import java.util.ArrayList;
import java.util.List;


public class Banco {
		
	//Crear cuentas bancarias
		private List<CuentaBancaria> listacuentas;
		private List<Cliente> listaClientes;
		
		public Banco(){
			listacuentas = new ArrayList<CuentaBancaria>();
			listaClientes = new ArrayList<Cliente>();
		}
		
		public void Extraer(CuentaBancaria cuenta, float importe) {
			
		}
		
		
		public void agregarCuenta(CuentaBancaria cuenta){
			listacuentas.add(cuenta);		
		}
			
		public List<CuentaBancaria> getListacuentas() {
			return listacuentas;
		}

		public void setListacuentas(List<CuentaBancaria> listacuentas) {
			this.listacuentas = listacuentas;
		}
		
		//Crear clientes
		
		
		
		public void agregarCliente(Cliente cliente){
			listaClientes.add(cliente);		
		}
			
		public List<Cliente> getListaClientes() {
			return listaClientes;
		}

		public void setListaClientes(List<Cliente> listaClientes) {
			this.listaClientes = listaClientes;
		}
		
		

}
