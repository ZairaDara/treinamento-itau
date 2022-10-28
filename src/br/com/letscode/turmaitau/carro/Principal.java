package br.com.letscode.turmaitau.carro;

public class Principal {

    public static void main(String[] args) {
        Carro audi = new Carro();
        audi.modelo = "A1";
        audi.marca = "Audi";
        audi.cor = "Branco";
        audi.anoDeFabricacao = 2020;
        audi.placa = "XYZ12345";

        Carro nissan = new Carro ();
        nissan.modelo = "March";
        nissan.marca = "Nissan";
        nissan.cor = "Branco";
        nissan.anoDeFabricacao = 2028;
        nissan.placa = "ABC12345";

        audi.acelerar();
        audi.acelerar();

        System.out.println("Audi: " + audi);
        System.out.println("Nissan: " + nissan);

    }


}
