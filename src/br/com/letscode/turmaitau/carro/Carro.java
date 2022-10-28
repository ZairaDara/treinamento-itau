package br.com.letscode.turmaitau.carro;

public class Carro extends Object{
    String marca; //se não faço nada na String ele sempre será do tipo null
    String modelo;
    String placa;
    String cor;
    Integer anoDeFabricacao; //Qdo não inicializo um Integer ele sempre será nulo, se fosse int seria 0
    int velocidade;

    boolean ligado; // do tipo bollean sempre nasce false


    void ligar(){
        this.ligado = true;
    }

    void acelerar(){
        this.velocidade = this.velocidade + 13;
    }
    public String toString(){
        final StringBuilder sb = new StringBuilder("Carro {");
        sb.append("marca = ").append(marca).append("\n");
        sb.append("modelo = ").append(modelo).append("\n");
        sb.append("placa = ").append(placa).append("\n");
        sb.append("cor = ").append(cor).append("\n");
        sb.append("ligado = ").append(ligado).append("\n");
        sb.append("ano de fabricação = ").append(anoDeFabricacao).append("\n");
        sb.append("velocidade = ").append(velocidade).append("\n");

        return sb.toString();
    }
}
