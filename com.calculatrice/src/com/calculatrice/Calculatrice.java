package com.calculatrice;

import com.addition.Addition;
import com.multiplication.multiplication;

public class Calculatrice {

	public static void main(String[] args) {
		Addition add = new Addition();
		multiplication multi = new multiplication();

		System.out.println("additon = "+add.add(2,6)+"\n");
		System.out.println("multiplication = "+multi.multi(2,6));

	}

}
