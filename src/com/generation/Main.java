package com.generation;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*String universidades[];
        universidades = new String[5];
        String universidades[] = new String[5];
        universidades[0] = "ITVH";
        universidades[1] = "ULA";
        universidades[2] = "UAM";
        universidades[3] = "UADM";
        universidades[4] = "UNAM";*/
        /*universidades[5] = "IPM";
        universidades[6] = "TESCO";
        universidades[7] = "TEC";
        for(String universidad : universidades) {
            System.out.println(universidad);
        }*/
        /*Set<String> frutas = new LinkedHashSet<>( );
        //Caracteristicas principales de Set
        //No puede contener elementos duplicados
        //El orden de los elementos puede variar
        frutas.add("Mango");
        frutas.add("Manzana");
        frutas.add("Melon");
        frutas.add("Fresa");
        frutas.add("Pera");
        frutas.add("Lima");
        frutas.add("Naranja");

        for(String fruta : frutas) {
            System.out.println(fruta);
        }
        System.out.println("Hola Soy David Ruiz");
        final Set hashSet = new HashSet(1_000_000);
        final Long startHashSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            hashSet.add(i);
        }
        final Long endHashSetTime = System.currentTimeMillis();
        System.out.println("Time spent by HashSet: " + (endHashSetTime - startHashSetTime));

        final Set treeSet = new TreeSet();
        final Long startTreeSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            treeSet.add(i);
        }
        final Long endTreeSetTime = System.currentTimeMillis();
        System.out.println("Time spent by TreeSet: " + (endTreeSetTime - startTreeSetTime));

        final Set linkedHashSet = new LinkedHashSet(1_000_000);
        final Long startLinkedHashSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            linkedHashSet.add(i);
        }
        final Long endLinkedHashSetTime = System.currentTimeMillis();
        System.out.println("Time spent by LinkedHashSet: " + (endLinkedHashSetTime - startLinkedHashSetTime));*/


        Map<Integer,String> colores = new HashMap<Integer,String>();
        colores.put(1,"Azul");
        colores.put(2,"Cafe");
        colores.put(3,"Celeste");
        colores.put(4,"Negro");
        colores.put(5,"Rojo");
        System.out.println(colores.get(3));

    }
}
