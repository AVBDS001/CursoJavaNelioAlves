int tabuada[] = new int[10];
        System.out.println("Digite o número que você quer a tabuada: ");
        int num = sc.nextInt();
        
        for(int i = 0; i < tabuada.length; i++) {
            tabuada[i] = num;
            System.out.printf("Resultado %d X %d = %d \n",num, i, tabuada[i] * i);
        }



//Enunciado: Faça uma classe executável que receba por meio da linha de comando do programa(prompt) um número natural(de 1 a 10) e informe a sua tabuada
//Não consegui fazer ele pelo prompt faz fiz com array
