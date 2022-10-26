package br.com.letscode.turmaitau.consumo;

public class DistanciaPercorrida {


    public double calcularDistanciaPercorrida (double tempo, double velocidade){
        double distancia = tempo * velocidade;
        System.out.println("Sua viagem foi realizada em "+ tempo + " horas. Em velocidade média de " + velocidade + " km|h.");
        System.out.print("A distância percorrida foi de " + distancia + " km.");
        return distancia;
    }
}
