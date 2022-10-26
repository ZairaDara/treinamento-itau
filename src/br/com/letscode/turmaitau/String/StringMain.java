package br.com.letscode.turmaitau.String;

public class  StringMain {

    public static void main (String[] args) {

        StringBuilder nome = new StringBuilder();

        nome.append("Zaira");
        nome.append(" ");
        nome.append("Dara");

        String nomeSB = nome.toString();
        System.out.println("O nome dela é " + nomeSB);
    }


}
