import java.util.*;

public class RadarRodoviario {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Frequência do carro: ");
		double freqCarro = ler.nextDouble();
		System.out.println("Velocidade limite: ");
		int velLimite = ler.nextInt();

		double multa;
		double velCarro = 300 * (1/freqCarro - 1);
		if(velCarro < velLimite) { 
			multa = 0;
		} else if(velCarro > velLimite && velCarro < velLimite*1.20) {
			multa = 130.16;
		} else if(velCarro <= velLimite*1.5) {
			multa = 195.23;
		} else {
			multa = 880.41;
		}
		System.out.printf("Velocidade do carro %.1f km/h\n", velCarro);
		System.out.printf("Multa de R$ %.2f", multa);
	}
}
