public class classe_Operadores {
    public static void main(String[] args){
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao ="?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        //repetição
        //numero++;
        //numero = numero +1;

        System.out.println(numero --);

        System.out.println(numero);

        boolean variavel = true;
        System.out.println(variavel);

        variavel = !variavel;

        System.out.println(variavel);
        int a, b;

        a = 6;
        b = 6;
        //String resultado = a==b ?"verdadeiro" : "falso";
        int resultado = a==b ? 1 : 0;

           System.out.println(resultado);

        String nomeUm = "Milton";
        String nomeDois = new String("Milton");

        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

           boolean simNao = numero1 == numero2;
           if(numero1 < numero2){
               System.out.println("a nossa condição é veradeira");

           }
            simNao = numero1 > numero2;

           System.out.println("numero 1 é maior a numero 2?= " + simNao);

    }

}


