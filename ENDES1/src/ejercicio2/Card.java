package ejercicio2;

public class Card {
//Se indica que la carta tendrá un palo (suit) y un valor (value)
	public String suit;
	public String value;
//Public card nos sirve para construir una nueva carta
	public Card (String suit, String value) {
		this.suit = suit;
		this.value = value;
	}
//Nos devuelve la carta con el palo y el número
	public String toString () {
		return (this.suit+"-"+this.value);
	}
}
