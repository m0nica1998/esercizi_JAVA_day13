# Java Inheritance Shop

Questo progetto è un semplice esempio di applicazione Java orientata agli oggetti, che simula il funzionamento di un carrello per uno shop online. Utilizza i concetti di ereditarietà per gestire diversi tipi di prodotto.

## Descrizione

L'applicazione permette all'utente di inserire nel carrello tre tipologie di prodotti:

- **Smartphone**
- **Televisori**
- **Cuffie**

Ogni prodotto eredita dalla classe `Prodotto`, che contiene le proprietà comuni: `nome`, `marca`, `prezzo` e `iva`.

L'utente può scegliere i prodotti da inserire e visualizzare il contenuto del carrello al termine dell'inserimento. È anche prevista una funzionalità **BONUS** che applica sconti sui prodotti se l'utente possiede una carta fedeltà.

### Sconti (BONUS)

Se l’utente possiede la carta fedeltà:

- **Prodotti generici**: sconto del 2%
- **Smartphone**: sconto del 5% se la memoria è < 32GB, altrimenti 2%
- **Televisori**: sconto del 10% se non smart, altrimenti 2%
- **Cuffie**: sconto del 7% se cablate, altrimenti 2%

## Struttura del Progetto

- `Prodotto.java`: Classe base con attributi comuni e metodi per calcolare il prezzo con IVA e con sconto.
- `Smartphone.java`: Estende `Prodotto` e aggiunge attributi `imei` e `memoria`.
- `Televisore.java`: Estende `Prodotto` con attributi `dimensioni` e `isSmart`.
- `Cuffia.java`: Estende `Prodotto` con attributi `colore` e `isWireless`.
- `Carrello.java`: Contiene il metodo `main()` per interazione utente e gestione del carrello.

## Esecuzione

Compila ed esegui il file `Carrello.java` con un ambiente Java (JDK 11+). L'applicazione chiederà all'utente di inserire i prodotti uno alla volta.



