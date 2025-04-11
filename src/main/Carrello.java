package main;



import java.util.ArrayList;
import java.util.Scanner;

public class Carrello {
 //Create una classe Carrello con metodo main, in cui chiedete 
	//all’utente di valorizzare un carrello di prodotti con dati inseriti tramite scanner. 
	//Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo uno
	//Smarphone o un Televisore o Cuffie e in base alla scelta dell’utente utilizzate
	//il costruttore opportuno. Al termine dell’inserimento stampate il carrello
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//fare una lista che contiene i prodotti inseriti
		
		ArrayList<Object> arrayList = new ArrayList<Object>();
		boolean bool = true;
		// fare un ciclo while che dice all'utente di inserire articoli nel carrello
		while (bool) {
			System.out.println("Cosa vuoi acquistare? Inserisci se smartphone, televisore o cuffie altrimenti premi esc");
			
			
			String prodotto = scan.next();
			
			if(prodotto.toLowerCase().equals("smartphone")) {
				Smartphone mySmartphone = new Smartphone("iphone", "apple", 1500, 20, "0002", 32);
				arrayList.add(mySmartphone);
			}else if(prodotto.toLowerCase().equals("televisore")) {
				Televisore myTV = new Televisore("smartTV", "LG", 3000, 20, 32, true);
				arrayList.add(myTV);
			}else if(prodotto.toLowerCase().equals("cuffie")) {
				Cuffia myCuffie = new Cuffia("cuffie","samsung", 250, 15, "nero", true);
				arrayList.add(myCuffie);
			} else if(prodotto.toLowerCase().equals("esc")) {
				
				bool = false;
			}
			
			
			
		}
		
		//stamoare la lista
		
		for(Object elemento : arrayList) {
			System.out.println(elemento.toString());
		}
		
		
		scan.close();
		
	}
}
