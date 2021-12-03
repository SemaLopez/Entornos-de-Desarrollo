package ejercicio2;

import java.util.ArrayList;

public class DeckCards {
//Tenemos un método de clase string/cadena, dentro del cual podemos encontrar la cadena denominada "suits" (la cual contiene los palos de las cartas) y la cadena denominada como "values", (la cual contiene los valores de las cartas).
	public static void main(String[] args) {

		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
// Con el array que tenemos a continuación, estamos creando la baraja.
		ArrayList<Card> deck = new ArrayList<Card>();
// A continuación, tenemos un bucle doble. Señalar que si la "i" es menor que la longitud de la cadena "lenght" esta suma 1. De igual modo, si la "i" es menor que la longitud de la cadena "values", esta sumara 1 también. Así, por cada vez que itera los bucles me crea una carta nueva. El método ".add" añade un registro a la tabla. Cuando salgo de los dos bucles tengo todas las cartas creadas y guardadas y además tengo la baraja ordenada.

		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < values.length; j++) {
				Card card = new Card(suits[i], values[j]);
				deck.add(card);
			}
		}
//Se establece el bucle for con el tamaño de la baraja (52 deck. size), en el cual si la "i" es menor al tamaño de la baraja esta suma 1. A continuación, se intercambian las posiciones de las cartas para barajarlas con el objetivo de darnos algo los más aleatorio posible.
		for (int i = 0; i < deck.size(); i++) {
			int j = (int) Math.floor(Math.random() * i);
			Card tmp = deck.get(i);
			deck.set(i, deck.get(j));
			deck.set(j, tmp);
		}
// Para finalizar, tenemos un bucle de 0 a 5 en el que se está pidiendo que nos devuelva las 5 primeras cartas. Como las cartas están barajadas, nos devolverá las 5 primeras barajadas y aleatorias.
		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i));
		}

	}

}
