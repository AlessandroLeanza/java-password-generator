//Il programma deve fare quanto segue: salvare in opportune variabili il 
//nome, cognome, colore preferito e data di nascita di un utente 
//suddivisa in giorno, mese e anno in numero generare (e stampare a video) 
//una password concatenando nome, cognome, colore preferito e somma di 
//giorno, mese e anno di nascita, separate dal carattere -
//Esempio: ho un utente che si chiama Pinco Pallo, nato il 12/05/1994, 
//il cui colore preferito è il magenta La sua password sarà Pinco-Pallo-magenta-2011 

package org.lessons.java.security;

public class PasswordGenerator {

	public static void main(String[] args) {
		String nome = "Alessandro";
		String cognome = "Leanza";
		String colorePreferito = "Rosso";
		int giornoNascita = 31;
		int meseNascita = 07;
		int annoDiNascita = 1991;
		int sommaNascita = giornoNascita + meseNascita + annoDiNascita;
		
		System.out.println("La tua password è: " + nome  + "-" +cognome + "-" + colorePreferito + "-" + sommaNascita );
	}

}
