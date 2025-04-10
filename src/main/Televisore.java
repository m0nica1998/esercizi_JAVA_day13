package main;

public class Televisore extends Prodotto{

	 //Televisori, 
	//caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
	private int dimensioni;
	private boolean isSmart;
	public Televisore(String nome, String marca, double prezzo, double iva) {
		super(nome, marca, prezzo, iva);
		// TODO Auto-generated constructor stub
	}
	public int getDimensioni() {
		return dimensioni;
	}
	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}

}
