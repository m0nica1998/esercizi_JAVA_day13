package main;

public class Cuffia extends Prodotto{
	//Cuffie,
	//caratterizzate dal colore e se sono wireless o cablate
	
	//attributi
	private String colore;
	private boolean isWireless;

	public Cuffia(String nome, String marca, double prezzo, double iva, String colore, boolean isWireless) {
		super(nome, marca, prezzo, iva);
		// TODO Auto-generated constructor stub
		setColore(colore);
		setWireless(isWireless);
	}

	//getter e setter
	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		if(colore != "") {
			this.colore = colore;
		}
		
	}

	public boolean isWireless() {
		return isWireless;
	}

	public void setWireless(boolean isWireless) {
		this.isWireless = isWireless;
	}

}
