package main;

public class Prodotto {
	//## java-inheritance-shop Nel progetto java-inheritance-shop
		//Creare la classe Prodotto che gestisce i prodotti dello shop. 
		//Un prodotto è caratterizzato da: codice (numero intero) nome marca prezzo iva
		//Usate opportunamente i livelli di accesso (public, private), i costruttori, 
		//i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che: 
		//il codice prodotto sia accessibile solo in lettura gli altri attributi siano accessibili sia 
		//in lettura che in scrittura il prodotto esponga sia un metodo per avere il prezzo base che uno
		//per avere il prezzo comprensivo di iva formattato
	
	//creare gli attributi (codice, nome, marca,prezzo e iva)
	private int codice;
	private String nome;
	private String marca;
	private double prezzo;
	private double iva;
	
	
	//metodo esporre prezzo
	//metodo prezzo con iva
	
	//metodi getter setter
	//mettere il setter privato per codice
	public int getCodice() {
		return codice;
	}
	private void setCodice(int codice) {
		if(codice >= 0) {
			this.codice = codice;
		}
		
	
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome != "") {
			this.nome = nome;
		}
		
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		if(marca != "") {
			this.marca = marca;
		}
		
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		if(prezzo > 0) {
			this.prezzo = prezzo;
		}
		
	}
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		if(iva > 0) {
			this.iva = iva;
		}
		
	}
	
	//creare i costruttori
	public Prodotto(String nome, String marca, double prezzo, double iva) {
		setNome(nome);
		setMarca(marca);
		setPrezzo(prezzo);
		setIva(iva);
		
	}
	
	//metodo esporre prezzo
	
	public void esporrePrezzo() {
		System.out.println(prezzo);
	}
		//metodo prezzo con iva
	public void prezzoIva() {
		System.out.println(((prezzo/100)*iva)+prezzo);
	}
	
}
