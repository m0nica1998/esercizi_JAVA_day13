package main;

public class Smartphone extends Prodotto{

	//Lo shop gestisce diversi tipi di prodotto: 
	//Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
	
	//attributi
	private String imei;
	private int memoria;
	public Smartphone(String nome, String marca, double prezzo, double iva, String imei, int memoria) {
		super(nome, marca, prezzo, iva);
		setImei(imei);
		setMemoria(memoria);
		// TODO Auto-generated constructor stub
	}
	
	
	//getter e setter
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
}
