package Mequi;

import java.util.Arrays;
import java.util.Scanner;

public class Lulu {
    public static void menu() {
        System.out.println("Mequi");
        System.out.println("Bateu aquela #Fome de Méqui\n");
        System.out.print("Selecione a sua opção :\n");
        System.out.println("1 - Cardápio");
        System.out.println("2 - Lançamentos");
        System.out.println("3 - Quem Somos");
        System.out.println("4 - Família");
        System.out.println("5 - Promoções");
        System.out.println("6 - Mequi pra você");
        System.out.println("7 - McDia Feliz");
        System.out.println("Escolha sua opção: ");
    }

    public static void menuCardapio() {

        Scanner ler = new Scanner(System.in);
        int opcao;
        do {
            System.out.print("\n\n-- Cardápio --\n\n");
            System.out.print("|----------------------------------------|\n");
            System.out.print("| Opção 1 - Lançamentos                  |\n");
            System.out.print("| Opção 2 - Sanduíches Premium           |\n");
            System.out.print("| Opção 3 - Sanduíches de Carne Bovina   |\n");
            System.out.print("| Opção 4 - Família Tasty                |\n");
            System.out.print("| Opção 5 - Sanduíches de Frango         |\n");
            System.out.print("| Opção 6 - Seleções do Mequi            |\n");
            System.out.print("| Opção 7 - McLanche Feliz               |\n");
            System.out.print("| Opção 8 - Mequi1000                    |\n");
            System.out.print("| Opção 9 - Acompanhamentos              |\n");
            System.out.print("| Opção 10 - Sobremesas                  |\n");
            System.out.print("| Opção 11 - Bebidas Frias               |\n");
            System.out.print("| Opção 12 - Café da Manhã               |\n");
            System.out.print("| Opção 13 - Bebidas Quentes             |\n");
            System.out.print("| Opção 14 - McOfertas                   |\n");
            System.out.print("| Opção 15 - Méqui Box                   |\n");
            System.out.print("| Opção 0 - Para voltar ao menu          |\n");
            System.out.print("|----------------------------------------|\n");
            System.out.print("Digite uma opção: ");
            opcao = ler.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Lançamentos");
                    
                    
                    break;

                case 2:
                    String McBrasil = "Nome: McBrasil \n" +
                            "Calorias: 1156 kcal \n" +
                            "Descrição: Nosso grandioso e inigualável McBrasil, composto por pão tipo brioche,um hamburguer (carne 100% bovina), molho temperado, empanado de queijo, alface, tomate e bacon.\n";
                    String McEUA = "Nome: McEUA\n" +
                            "Calorias: 1156 kcal\n" +
                            "Descrição: McEUA\n";
                    /*String McEUA = "Nome: McEUA\n" +
                            "Calorias: 1156 kcal\n" +
                            "Descrição: McEUA\n";
                    */
                    String[] a = new String[]
                    {
                    McBrasil,McEUA
                    };
                    System.out.println("--Sanduíches Premium--");
                    System.out.println(Arrays.toString(a));
            }


        } while (opcao != 0);
    }

    public static void quemSomos() { 
    	
    	System.out.print("\n\n-- QuemSomos --\n\n");
        System.out.print("|-----------------------------------------------------------------------------|\n");
        System.out.print("|1-institucional         || 2- Franquias               || 3- Trabalhe Conosco |\n");
        System.out.print("|-----------------------------------------------------------------------------|\n");
        System.out.print("|4-Privacidade   || 5- Desenvolvimento sustentavel  e compromisso social      |\n");
        System.out.print("|6- publicidade responsável                                                   |\n");
        System.out.print("|-----------------------------------------------------------------------------|\n");
        System.out.print("Digite uma opção: ");
    	
    }
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao;
        do {
            menu();
            opcao = ler.nextInt();
            switch (opcao) {

                case 1:
                    menuCardapio();
                    break;


                case 2:
                    //FAZER O MENU DOS OUTROS
                    break;

                case 3:
                    quemSomos();
                    break;

                default:
                    System.out.println(" Favor escolher um valor válido");

            }
        } while (opcao != 0);
    }
}






	


