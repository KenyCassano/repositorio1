import java.util.Scanner;
 
public class MultiplosNumeros {
 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
 
		int multiplos[];
		int tamañoArreglo = 0;
		int numero = 0;
 
		var in = new Scanner(System.in);
 
		System.out.println("Tamaño del arreglo: ");
		tamañoArreglo = in.nextInt();
 
		System.out.println("Entre un numero para hallar sus multiplos: ");
		numero = in.nextInt();
 
		multiplos = new int[tamañoArreglo];
		for(int i =0; i < tamañoArreglo; i++){
			multiplos[i] = (i+1)*numero;
		}
 
		for(int i =0; i < multiplos.length; i++){
			System.out.print(multiplos[i]+" ");
		}
 
	}

	public class TamañoNombres {
 
		/**
		 * @param args
		 */
		public static void main(String[] args) {

	 
			Scanner in = new Scanner(System.in);
	 
			String nombres[];
			int tamañoNombre[];
			String nombre;
			int tamañoArreglo = 0;
	 
			System.out.println("Entre el tamaño de los arreglos");
			tamañoArreglo = Integer.parseInt(in.nextLine());
	 
			nombres = new String[tamañoArreglo];
			for (int i = 0; i < nombres.length; i++) {
				System.out.println("Entre el nombre" + (i + 1));
				nombres[i] = in.nextLine();
			}
	 
			tamañoNombre = new int[tamañoArreglo];
			for (int y = 0; y < tamañoNombre.length; y++) {
				tamañoNombre[y] = nombres[y].length();
			}
	 
			for (int z = 0; z < tamañoArreglo; z++) {
				System.out.println(nombres[z] + " -- " + tamañoNombre[z]);
			}
		}
	 
	}
 
}