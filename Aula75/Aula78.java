package com.fraga.intermediario.Aula75;

public class Aula78 {
    public static void main(String[] args) {
        String ola  = "Olá";
        String ola2 = "OLÁ";
        String ola3 = "Olá";
        String ola4 = new String(ola);

        System.out.println("ola equals ola2 "+ ola.equals(ola2)); //false
        System.out.println("ola equals ola3 "+ ola.equals(ola3)); //true

        System.out.println("ola equalsIgnoreCase ola3 "+ ola.equalsIgnoreCase(ola3)); //true

        System.out.println("ola == ola2 "+ (ola == ola2)); //false
        System.out.println("ola == ola3 "+ (ola == ola3)); //true

        System.out.println("ola == ola4 "+ (ola == ola4)); //false
        System.out.println("ola equals ola4 "+ ola.equals(ola4)); //true

        String banana = "banana";
        String ana = "ana";
        String ban = "Ban";

        System.out.println(banana.regionMatches(1, ana, 0, 3));
        System.out.println(banana.regionMatches(true, 0, ban, 0, 3));

        System.out.println(banana.startsWith(ban));
        System.out.println(banana.endsWith(ana));

        String a = "a";
        String b = "b";
        String A = "A";

        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(A));
        System.out.println(b.compareTo(a));
        System.out.println(a.compareTo("a"));

    }
}
