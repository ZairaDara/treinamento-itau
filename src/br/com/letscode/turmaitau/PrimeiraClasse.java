package br.com.letscode.turmaitau;

public class PrimeiraClasse {

    public static void main(String[] args){
        char conversaoAsc = 49;
        byte    nomeVariavelByte = '1';

        System.out.println("byte = " + nomeVariavelByte);
        System.out.println("char = " + conversaoAsc);

        //cast - transforma os tipos internamente
        System.out.println("byte = " + (byte) nomeVariavelByte);

    }
}
