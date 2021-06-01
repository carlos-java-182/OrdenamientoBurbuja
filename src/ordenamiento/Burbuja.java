package ordenamiento;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Burbuja {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int arreglo[] = null, nElementos, aux;

		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digita el número de elementos"));

		arreglo = new int[nElementos];

		for (int i = 0; i < nElementos; i++) {
			System.out.print((i + 1) + ".- Digita el número en el índice: ");
			arreglo[i] = entrada.nextInt();
		}

		for (int i = 0; i < nElementos - 1; i++) {
			for (int j = 0; j < nElementos - 1; j++) {

				if (arreglo[j] > arreglo[j + 1]) {

					aux = arreglo[j];
					arreglo[j] = arreglo[j + 1];
					arreglo[j + 1] = aux;

				}

			}
		}

		for (int i = 0; i < nElementos; i++) {
			System.out.println("El orden ascendente es: " + arreglo[i]);
		}

		for (int i = nElementos - 1; i >= 0; i--) {
			System.out.println("El orden descentende es: " + arreglo[i]);
		}

	}

}
