package br.com.letscode.turmaitau.consumo;

import java.util.Scanner;

public class PrincipalConsumo {
    public static void main(String[] args) {
        Double distancia = 0.0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem vindo ao programa de Cálculo de Consumo de Combustível!");
        System.out.println("Informe o tempo da viagem, em horas:");
        double tempoViagem = entrada.nextDouble();

        System.out.println("Agora, informe a velocidade média da viagem, em KM|h:");
        double velocidade = entrada.nextDouble();

        DistanciaPercorrida distanciaPercorrida = new DistanciaPercorrida();

        distancia = distanciaPercorrida.calcularDistanciaPercorrida(tempoViagem, velocidade);

        new ConsumoCombustivel().calcularConsumoCombustivel(distancia);

    }
}
