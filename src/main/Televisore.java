package main;

public class Televisore extends Prodotto{

	 //Televisori, 
	//caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
	private int dimensioni;
	private boolean isSmart;
	public Televisore(String nome, String marca, double prezzo, double iva, int dimensioni, boolean isSmart) {
		super(nome, marca, prezzo, iva);
		// TODO Auto-generated constructor stub
		setDimensioni(dimensioni);
		setSmart(isSmart);
	}
	
	//getter e setter
	public int getDimensioni() {
		return dimensioni;
	}
	public void setDimensioni(int dimensioni) {
		if(dimensioni > 0) {
			this.dimensioni = dimensioni;
		}
		
	}
	public boolean isSmart() {
		return isSmart;
	}
	public void setSmart(boolean isSmart) {
		this.isSmart = isSmart;
	}

}
