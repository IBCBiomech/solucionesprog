package trimestre2.prog;
/**
 * 
 * @author avellanedaprogramación
 *
 */
public class TestSquare {
	/** Main method */
	public static void main(String[] args) {
		
		// Creamos el objeto squares como array de Square
		// Podemos asignar valores con un for si lo deseamos
		Square[] squares = new Square[3];
		squares[0] = new Square(11.2);
		squares[1] = new Square(7.3);
		squares[2] = new Square(1.9);
		
		/*
		 * También podríamos haber realizado lo siguiente que es más eficiente al escribir código
		 */
		
		// Square[] squares = {new Square(2.7), new Square(3.1), new Square(7.8)};
	
		//Aquí se llama a los métodos de cada objeto square
		for (int i = 0; i < squares.length; i++) {
		 	System.out.println("\nSquare #" + (i + 1));
		 	System.out.println("lado: " + squares[i].getSide());
		 	System.out.println("Area: " + squares[i].getArea());
		 	System.out.println("Perímetro: " + squares[i].getPerimeter());
		 	System.out.println("How to color: " + squares[i].howToColor());
		 } 
	}
}