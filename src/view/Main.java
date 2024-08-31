//@author Daiane Tararam

package view;

import controller.SomaThread;

public class Main {

	public static void main(String[] args) {
		int [][] matriz = new int[3][5];
		
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = (int)((Math.random() * 100 )+1);
            }
        }
		for (int i = 0; i < 3; i++) {
			SomaThread somaT = new SomaThread(matriz[i], i + 1);
		    somaT.start();
		}
	}

}
