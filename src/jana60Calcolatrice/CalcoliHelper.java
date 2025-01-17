package jana60Calcolatrice;

public class CalcoliHelper {

	private CalcoliHelper() {

	}

	/**
	 * Somma fra due numeri
	 * 
	 * @param numeroSomma1
	 * @param numeroSomma2
	 * @return
	 */
	public static int somma(int numeroSomma1, int numeroSomma2) {
		return numeroSomma1 + numeroSomma2;
	}

	// Differenza fra due interi con risultato positivo
	public static int differenza(int numeroDifferenza1, int numeroDifferenza2) {
		if (numeroDifferenza2 >= numeroDifferenza1) {
			return numeroDifferenza2 - numeroDifferenza1;
		} else {
			return numeroDifferenza1 - numeroDifferenza2;
		}
	}

	// Valore assoluto

	public static int numeroAssoluto(int numAssoluto) {
		if (numAssoluto < 0) {
			return numAssoluto = -numAssoluto;
		} else {
			return numAssoluto;
		}
	}

	// Moltiplicazione

	public static int moltiplicazione(int numeroProdotto1, int numeroProdotto2) {
		return numeroProdotto1 * numeroProdotto2;
	}

	// Minimo fra due Valori

	public static int minimo(int numeroMinimo1, int numeroMinimo2) {
		if (numeroMinimo2 > numeroMinimo1) {
			return numeroMinimo1;
		} else {
			return numeroMinimo2;
		}
	}

	// Massimo fra due Valori

	public static int massimo(int numeroMassimo1, int numeroMassimo2) {
		if (numeroMassimo2 > numeroMassimo1) {
			return numeroMassimo2;
		} else {
			return numeroMassimo1;
		}

	}

	// Il principio per scrivere lo stesso metodo ma con parametri diversi �
	// l'OVERLOAD
	/**
	 * Somma fra due numeri
	 */
	public static double somma(double numeroSomma1, double numeroSomma2) {
		return numeroSomma1 + numeroSomma2;
	}

// Differenza fra due interi con risultato positivo
	public static double differenza(double numeroDifferenza1, double numeroDifferenza2) {
		if (numeroDifferenza2 >= numeroDifferenza1) {
			return numeroDifferenza2 - numeroDifferenza1;
		} else {
			return numeroDifferenza1 - numeroDifferenza2;
		}
	}

// Valore assoluto

	public static double numeroAssoluto(double numAssoluto) {
		if (numAssoluto < 0) {
			return numAssoluto = -numAssoluto;
		} else {
			return numAssoluto;
		}
	}

// Moltiplicazione

	public static double moltiplicazione(double numeroProdotto1, double numeroProdotto2) {
		return numeroProdotto1 * numeroProdotto2;
	}

// Minimo fra due Valori

	public static double minimo(double numeroMinimo1, double numeroMinimo2) {
		if (numeroMinimo2 > numeroMinimo1) {
			return numeroMinimo1;
		} else {
			return numeroMinimo2;
		}
	}

// Massimo fra due Valori

	public static double massimo(double numeroMassimo1, double numeroMassimo2) {
		if (numeroMassimo2 > numeroMassimo1) {
			return numeroMassimo2;
		} else {
			return numeroMassimo1;
		}

	}

//Potenza

	/*
	 * Metodo for fatto da francesco for (int n = 1; n <=numeroAssoluto(esponente);
	 * n++) { risultato=base*risultato; }
	 */
	public static double potenza(int base, int esponente) {
		double risultato = 0.0;
		if (base == 0 && esponente == 0)
			risultato = 1;
		if (esponente < 0) {
			double calc = base;
			for (int i = 1; i < -esponente; i++) {
				calc *= base;
			}

			risultato = 1 / calc;
		}

		if (esponente > 0) {
			int calc = base;
			for (int i = 1; i < esponente; i++) {
				calc *= base;
			}
			risultato = calc;
		}

		return risultato;
	}
}
