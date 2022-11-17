package br.com.letscode.turmaitau.listaDeNumeros;

import java.util.*;

public class ListaDeNumeros {

    public static void main(String[] args) {

        String  entrada1= "1,2,3,4";
        String  entrada2= "2,5";

        List list1 = Arrays.asList(entrada1.split(","));

        List list2 = Arrays.asList(entrada2.split(","));

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1.size());
        System.out.println(list2.size());

        Set listaSemRepeticao = new HashSet();

        listaSemRepeticao.addAll(list1);
        listaSemRepeticao.addAll(list2);

        List saida = new ArrayList(listaSemRepeticao);

        Collections.sort(saida, Comparator.reverseOrder());
        System.out.println(saida);

    }

}
