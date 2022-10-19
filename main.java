package Mequi;

import java.util.Arrays;
import java.util.Scanner;
public class main {
    public static void menu() {
        System.out.println("Mequi");
        System.out.println("Bateu aquela #Fome de Méqui\n");
        System.out.println("1 - Cardápio");
        System.out.println("2 - Lançamentos");
        System.out.println("3 - Quem Somos");
        System.out.println("4 - Família");
        System.out.println("5 - Promoções");
        System.out.println("6 - Mequi pra você");
        System.out.println("7 - McDia Feliz");
        System.out.println("8- Sair do App ");
        System.out.println("Escolha sua opção: ");
    }
    public static void SanduíchesPremium() {
    	Scanner ler = new Scanner(System.in);
        int premium;
        do {
        System.out.print("\n\n-- Sanduíches Premium --\n\n");
        System.out.print("|____________________________|\n");
        System.out.print("| Opção 1  - McClub          |\n");
        System.out.print("| Opção 0  - retornar ao menu|\n");
        System.out.print("|____________________________|\n");
        premium=ler.nextInt();
        switch(premium) {
        case 1:
        System.out.print("|                            Opção 1                                    |\n");
        System.out.print("|----------------------------McClub-------------------------------------|\n");
        System.out.print("|                            767Kcal                                    |\n");
        System.out.print("|Sanduíche composto por pão tipo brioche, bacon crispy, molho especial, |\n");
	    System.out.print("|carne 100% bovina, queijo sabor emental, tomate e alface.|\n");
	    System.out.print("|----------------------Informação do produto----------------------------|\n");
	    System.out.print("|Informação nutricional :                                               |\n");
	    System.out.print("| 767kcal   ||      46g       ||  46g         ||     43g                |\n");
	    System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
		System.out.print("|_______________________________________________________________________|\n");
	    System.out.println("\n");
	    break;
        case 0:
        System.out.print("| Opção 0 - Para voltar ao menu                                         |\n");
        break;
        }
        }while(premium!=0);
    }
    public static void menuCardapio() {
        Scanner ler = new Scanner(System.in);
        int cardapio=0;
        int lancamentos=0;
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
            cardapio=ler.nextInt();
            switch (cardapio) {
                case 1:
                	 System.out.print("\n\n-- Lancamentos --\n\n");
                     System.out.print("|-----------------------------------------------------|\n");
                     System.out.print("|--------------infomações de todos os lanches---------|\n");
                     System.out.print("|-----------------------------------------------------|\n");
                     System.out.print("| Opção 1  - McBrasil                                 |\n");
                     System.out.print("| Opção 2  - McFlurry Brasil                          |\n");
                     System.out.print("| Opção 3  - McEspanha                                |\n");
                     System.out.print("| Opção 4  - McArgentina                              |\n");
                     System.out.print("| Opção 5  - McAlemanha                               |\n");
                     System.out.print("| Opção 6  - McMéxico                                 |\n");
                     System.out.print("| Opção 7  - McFrança                                 |\n");
                     System.out.print("| Opção 8  - McEua                                    |\n");
                     System.out.print("| Opção 9  - McCatar                                  |\n");
                     System.out.print("| Opção 10 - McFlurry Espetáculo Kopenhagen Morango   |\n");
                     System.out.print("| Opção 11 - McFlurry Espetáculo Kopenhagen Chocolate |\n");
                     System.out.print("| Opção 12 - McFlurry Espetáculo Kopenhagen Caramelo  |\n");
                     System.out.print("| Opção 13 - Blister CBO                              |\n");
                     System.out.print("| Opção 14 - Blister Tasty                            |\n");
                     System.out.print("| Opção 0 - Para voltar ao menu                       |\n");
                     System.out.print("|-----------------------------------------------------|\n");
                     System.out.print("Digite uma opção: ");
                     System.out.println("\n");
                     System.out.println(" Opção escolhida : ");
                     lancamentos=ler.nextInt();
                     switch(lancamentos) {
                     case 1: 	
                   	  		System.out.print("|                            Opção 1                                    |\n");
                            System.out.print("|----------------------------McBrasil-----------------------------------|\n");
 				            System.out.print("|                            1156Kcal                                   |\n");
 				            System.out.print("| Nosso grandioso e inigualável McBrasil, composto por pão tipo brioche,|\n");
 						    System.out.print("| um hamburguer (carne 100% bovina), molho temperado, empanado de       |\n");
 						    System.out.print("| queijo, alface, tomate e bacon.                                       |\n");
 						    System.out.print("|----------------------Informação do produto----------------------------|\n");
 						    System.out.print("|Informação nutricional :                                               |\n");
 						    System.out.print("| 1156kcal  ||      79g       ||  59g         ||     54g                |\n");
 						    System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
 							System.out.print("|_______________________________________________________________________|\n");
 						    System.out.println("\n");
 						    break;
 						
                       case 2: 
                    	   System.out.print(" |                            Opção 2                                    |\n");
                    	    System.out.print("|------------------------McFlurry Brasil--------------------------------|\n");
    				        System.out.print("|                             407kcal                                   |\n");
    				        System.out.print("| Para compor a Seleção do Méqui trouxemos a sobremesa que tem a cara do|\n");
    						System.out.print("| Brasil composta por massa gelada de baunilha, calda de banana comum   |\n");
    						System.out.print("| toque de canela , cobertura de caramelo e farofa crocante de amendoim.|\n");
    						System.out.print("|                  Você precisa experimentar!                           |\n");    						
    						System.out.print("|----------------------Informação do produto----------------------------|\n");
    						System.out.print("|Informação nutricional :                                               |\n");
    						System.out.print("|  407kcal  ||      12g       ||  68g         ||     7g                 |\n");
    						System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
    						System.out.print("|_______________________________________________________________________|\n");
    					    System.out.println("\n");
  						    break;
                       case 3:
                    	   System.out.print(" |                            Opção 3                                    |\n");
                    	    System.out.print("|----------------------------McEspanha----------------------------------|\n");
    				        System.out.print("|                             989kcal                                   |\n");
    				        System.out.print("| O maravilhoso McEspanha, mais um craque da Seleções do Méqui, é       |\n");
    						System.out.print("| composto por pão tipo brioche, um hamburguer (carne 100% bovina),     |\n");
    						System.out.print("| copa fatiada, molho temperado, alface e queijo sabor emental.         |\n");
    						System.out.print("|----------------------Informação do produto----------------------------|\n");
    						System.out.print("|Informação nutricional :                                               |\n");
    						System.out.print("|  989kcal  ||     67g        ||  45g         ||     52g                |\n");
    						System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
    						System.out.print("|_______________________________________________________________________|\n");
    						System.out.println("\n");
  						    break;
                       case 4:
                    	    System.out.print("|                            Opção 4                                    |\n");
                    	    System.out.print("|---------------------------McArgentina---------------------------------|\n");
    				        System.out.print("|                             805Kcal                                   |\n");
    				        System.out.print("| Para compor a Seleção do Méqui trouxemos o maravilhoso McArgentina,   |\n");
    						System.out.print("| composto por pão tipo brioche, um hamburguer (carne 100% bovina),     |\n");
    						System.out.print("| maionese sabor chimichurri, cebola fresca, alface, tomate, bacon, e   |\n");
    						System.out.print("| queijo sabor cheddar.                                                 |\n");
    						System.out.print("|----------------------Informação do produto----------------------------|\n");
    						System.out.print("|Informação nutricional :                                               |\n");
    						System.out.print("|  805kcal  ||      51g       ||    42g       ||     44g                |\n");
    						System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
    						System.out.print("|_______________________________________________________________________|\n");   
  						    System.out.println("\n");
    						break;
                       case 5:
                    	   System.out.print(" |                            Opção 5                                    |\n");
                    	    System.out.print("|----------------------------McAlemanha---------------------------------|\n");
    				        System.out.print("|                             828Kcal                                   |\n");
    				        System.out.print("| O novo McAlemanha, parte da Seleções do Méqui, é composto por pão     |\n");
    						System.out.print("| tipo brioche, um hamburguer (carne 100% bovina), salame com borda de  |\n");
    						System.out.print("| pimenta, maionese, mostarda, cebola fresca e queijo sabor emental.    |\n");
    						System.out.print("|----------------------Informação do produto----------------------------|\n");
    						System.out.print("|Informação nutricional :                                               |\n");
    						System.out.print("|  828kcal  ||        51g     ||     43g      ||     49g                |\n");
    						System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
    						System.out.print("|_______________________________________________________________________|\n");
    						System.out.println("\n");
  						    break;
                       case 6:
                    	    System.out.print("|                            Opção 6                                    |\n");
                    	    System.out.print("|----------------------------McMéxico-----------------------------------|\n");
   				            System.out.print("|                             629Kcal                                   |\n");
   				            System.out.print("| O McMéxico, parte da Seleções do Méqui, é especialmente composto      |\n");
   						    System.out.print("| por pão tipo brioche com batata, peito de frango temperado empanado,  |\n");
   						    System.out.print("| a nova maionese sabor pimenta jalapeño, alface e queijo sabor cheddar.|\n");
   						    System.out.print("|----------------------Informação do produto----------------------------|\n");
   						    System.out.print("|Informação nutricional :                                               |\n");
   						    System.out.print("|  628kcal  ||       33g      ||    50g       ||     33g                |\n");
   		 				    System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
   		 				    System.out.print("|_______________________________________________________________________|\n");
   						    System.out.println("\n");
						    break;
 					  
                       case 7:
                       	    System.out.print("|                            Opção 7                                    |\n");
                    	    System.out.print("|---------------------------McFrança------------------------------------|\n");
      				        System.out.print("|                            825Kcal                                    |\n");
      				        System.out.print("| Para compor a Seleção do Méqui trouxemos o incrível McFrança,         |\n");
      						System.out.print("| composto por pão tipo brioche, um hamburguer (carne 100% bovina),     |\n");
      						System.out.print("| molho sabor queijo brie, cebola crispy, tomate, bacon e queijo sabor  |\n");
      						System.out.print("| emental.                                                              |\n");
      						System.out.print("|----------------------Informação do produto----------------------------|\n");
      						System.out.print("|Informação nutricional :                                               |\n");
      						System.out.print("|  825kcal  ||        55g     ||    46g       ||      44g               |\n");
      						System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
      						System.out.print("|_______________________________________________________________________|\n");
      						System.out.println("\n");
  						    break;
 					 case 8: 
 						    System.out.print("|                            Opção 8                                    |\n");
 						    System.out.print("|----------------------------McEUA--------------------------------------|\n");
   				            System.out.print("|                           675 Kcal                                    |\n");
   				            System.out.print("| McEUA, parte da Seleções do Méqui, é composto por pão tipo brioche    |\n");
   						    System.out.print("| com batata, peito de frango temperado empanado, molho barbecue,       |\n");
   						    System.out.print("| cebola crispy, bacon, picles crinkle e queijo sabor cheddar.          |\n");
   						    System.out.print("|----------------------Informação do produto----------------------------|\n");
   						    System.out.print("|Informação nutricional :                                               |\n");
   						    System.out.print("|  675kcal  ||      31g       ||     63g      ||      35g               |\n");
   					     	System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
   					        System.out.print("|_______________________________________________________________________|\n");
   						    System.out.println("\n");
						    break;
 					 case 9: 
 					 	    System.out.print("|                            Opção 9                                    |\n");
 						    System.out.print("|----------------------------McCatar------------------------------------|\n");
   				            System.out.print("|                            989Kcal                                    |\n");
   				            System.out.print("| O incrível McCatar é composto por pão tipo brioche, um hamburguer     |\n");
   						    System.out.print("| (carne 100% bovina), molho árabe, cebola crispy, tomate e queijo sabor|\n");
   						    System.out.print("| emental.                                                              |\n");
   						    System.out.print("|----------------------Informação do produto----------------------------|\n");
   						    System.out.print("|Informação nutricional :                                               |\n");
   						    System.out.print("|  989Kcal  ||       68g      ||     48g      ||     47g                |\n");
   						    System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
   						    System.out.print("|_______________________________________________________________________|\n");
   					        System.out.println("\n");
						    break;
 					 case 10:
 						    System.out.print("|                            Opção 10                                   |\n");
 						    System.out.print("|--------------McFlurry Espetáculo Kopenhagen Morango-------------------|\n");
   				            System.out.print("|                            615Kcal                                    |\n");
   				            System.out.print("| A massa geladinha de baunilha, cobertura de morango e o delicioso     |\n");
   						    System.out.print("| tablete Kopenhagen de chocolate ao leite compõe essa sobremesa e      |\n");
   						    System.out.print("| trazem o sabor único que só o chocolate ao leite Kopenhagen têm.      |\n");
   						    System.out.print("|----------------------Informação do produto----------------------------|\n");
   						    System.out.print("|Informação nutricional :                                               |\n");
   						    System.out.print("|  615kcal  ||       28g      ||     80g      ||      9g                |\n");
   						    System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
   						    System.out.print("|_______________________________________________________________________|\n");
   						    System.out.println("\n");
						    break;
 					 case 11:
 						    System.out.print("|                            Opção 11                                   |\n");
 						    System.out.print("|--------------McFlurry Espetáculo Kopenhagen Chocolate-----------------|\n");
   				            System.out.print("|                            633Kcal                                    |\n");
   				            System.out.print("| A massa geladinha de baunilha, cobertura sabor chocolate e o delicioso|\n");
   						    System.out.print("| tablete Kopenhagen de chocolate ao leite compõe essa sobremesa e      |\n");
   						    System.out.print("| trazem o sabor único que só o chocolate ao leite Kopenhagen têm.      |\n");
   						    System.out.print("|----------------------Informação do produto----------------------------|\n");
   						    System.out.print("|Informação nutricional :                                               |\n");
   						    System.out.print("|  633kcal  ||      30g       ||   80g      ||     10g                  |\n");
   						    System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
   						    System.out.print("|_______________________________________________________________________|\n");
   						    System.out.println("\n");
						    break;
 					 case 12:
 						    System.out.print("|                            Opção 12                                   |\n");
 						    System.out.print("|--------------McFlurry Espetáculo Kopenhagen Caramelo------------------|\n");
   				            System.out.print("|                             639Kcal                                   |\n");
   				            System.out.print("| A massa geladinha de baunilha, cobertura de caramelo e o delicioso    |\n");
   						    System.out.print("| tablete Kopenhagen de chocolate ao leite compõe essa sobremesa e      |\n");
   						    System.out.print("| trazem o sabor único que só o chocolate ao leite Kopenhagen têm       |\n");
   						    System.out.print("|----------------------Informação do produto----------------------------|\n");
   						    System.out.print("|Informação nutricional :                                               |\n");
   						    System.out.print("|  639kcal  ||       29g      ||     84g      ||      10g               |\n");
   						    System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
   						    System.out.print("|_______________________________________________________________________|\n");
   						    System.out.println("\n");
						    break;
 					 case 13:
 						    System.out.print("|                           Opção13                                     |\n");
 						    System.out.print("|-------------------------Blister CBO-----------------------------------|\n");
   				            System.out.print("|                           100Kcal                                     |\n");
   				            System.out.print("| O Molho do CBO complementa um dos nossos produtos mais amados         |\n");
   						    System.out.print("| pelo público, ele é composto por especiarias e possui sabor e         |\n");
   						    System.out.print("| cremosidade icônicos.                                                 |\n");
   						    System.out.print("|----------------------Informação do produto----------------------------|\n");
   						    System.out.print("|Informação nutricional :                                               |\n");
   						    System.out.print("|  100kcal  ||        9g      ||    4g        ||      0g                |\n");
   						    System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
   						    System.out.print("|_______________________________________________________________________|\n");
   						    System.out.println("\n");
						    break;
 					 case 14: 
 						    System.out.print("|                            Opção 14                                   |\n");
 						    System.out.print("|------------------------ Blister Tasty---------------------------------|\n");
   				            System.out.print("|                            80Kcal                                     |\n");
   				            System.out.print("| Único por seu sabor defumado, cremosidade e textura. O Molho Tasty é  |\n");
   						    System.out.print("| exclusivo McDonald´s                                                  |\n");
   						    System.out.print("|----------------------Informação do produto----------------------------|\n");
   						    System.out.print("|Informação nutricional :                                               |\n");
   						    System.out.print("|   80kcal  ||        8g      ||      4g      ||      0g                |\n");
   						    System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
   						    System.out.print("|_______________________________________________________________________|\n");
   						    System.out.println("\n");
						    break;
 					 case 0:
 						     System.out.println(" retornando para o menu.....");
                     }
                     break;

                case 2:
                	   SanduíchesPremium();
                	   break;
                case 3: 
                	   lanchecarne();
                	   break;
                case 4: 
                	  tasty();
                	  break;
                case 5:
                	  sanduichefrango();
                	  break;
                case 6: 
                	  Seleções();
                  	  break;
                case 7:
                      McLancheFeliz();               	
                	  break;
                case 8:
                	  Mequi1000();	
                	  break;
                case 9:
                	  acompanhamentos();
                	  break;
                case 10:
                	  sobremesas();
                	  break;
                case 11:
                	  BebidasFrias();
                	  break;
                case 12:
                	  CaféDaManha();
                	  break;
                case 13:
                	  BebidasQuentes();
                	  break;
                case 14:
                	  McOfertas();
                	  break;
                	
            }


        } while ( cardapio!= 0 || lancamentos!=0);
    }
    public static void lancamentos() {
    	
    	Scanner ler = new Scanner(System.in);
        int sandubalancamento;
        do {
        System.out.print("\n\n-- Lancamentos --\n\n");
        System.out.print("|-----------------------------------------------------|\n");
        System.out.print("| Opção 1  - McBrasil                                 |\n");
        System.out.print("| Opção 2  - McFlurry Brasil                          |\n");
        System.out.print("| Opção 3  - McEspanha                                |\n");
        System.out.print("| Opção 4  - McArgentina                              |\n");
        System.out.print("| Opção 5  - McAlemanha                               |\n");
        System.out.print("| Opção 6  - McMéxico                                 |\n");
        System.out.print("| Opção 7  - McFrança                                 |\n");
        System.out.print("| Opção 8  - McEua                                    |\n");
        System.out.print("| Opção 9  - McCatar                                  |\n");
        System.out.print("| Opção 10 - McFlurry Espetáculo Kopenhagen Morango   |\n");
        System.out.print("| Opção 11 - McFlurry Espetáculo Kopenhagen Chocolate |\n");
        System.out.print("| Opção 12 - McFlurry Espetáculo Kopenhagen Caramelo  |\n");
        System.out.print("| Opção 13 - Blister CBO                              |\n");
        System.out.print("| Opção 14 - Blister Tasty                            |\n");
        System.out.print("| Opção 0 - Para voltar ao menu                       |\n");
        System.out.print("|-----------------------------------------------------|\n");
        System.out.print("\n");
        System.out.print(" Opção escolhida : ");
        sandubalancamento = ler.nextInt();
        switch(sandubalancamento){
        case 1: 	
   	  		    System.out.print("|                            Opção 1                                    |\n");
                System.out.print("|----------------------------McBrasil-----------------------------------|\n");
	            System.out.print("|                            1156Kcal                                   |\n");
	            System.out.print("| Nosso grandioso e inigualável McBrasil, composto por pão tipo brioche,|\n");
			    System.out.print("| um hamburguer (carne 100% bovina), molho temperado, empanado de       |\n");
			    System.out.print("| queijo, alface, tomate e bacon.                                       |\n");
			    System.out.print("|----------------------Informação do produto----------------------------|\n");
			    System.out.print("|Informação nutricional :                                               |\n");
			    System.out.print("| 1156kcal  ||      79g       ||  59g         ||     54g                |\n");
			    System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
				System.out.print("|_______________________________________________________________________|\n");
			    System.out.println("\n");
			   
			    break;
			
       case 2: 
    	    System.out.print("|                            Opção 2                                    |\n");
    	    System.out.print("|------------------------McFlurry Brasil--------------------------------|\n");
	        System.out.print("|                             407kcal                                   |\n");
	        System.out.print("| Para compor a Seleção do Méqui trouxemos a sobremesa que tem a cara do|\n");
			System.out.print("| Brasil composta por massa gelada de baunilha, calda de banana comum   |\n");
			System.out.print("| toque de canela , cobertura de caramelo e farofa crocante de amendoim.|\n");
			System.out.print("|                  Você precisa experimentar!                           |\n");    						
			System.out.print("|----------------------Informação do produto----------------------------|\n");
			System.out.print("|Informação nutricional :                                               |\n");
			System.out.print("|  407kcal  ||      12g       ||  68g         ||     7g                 |\n");
			System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
			System.out.print("|_______________________________________________________________________|\n");
		    System.out.println("\n");
		    
		    break;
       case 3:
    	   System.out.print(" |                            Opção 3                                    |\n");
    	    System.out.print("|----------------------------McEspanha----------------------------------|\n");
	        System.out.print("|                             989kcal                                   |\n");
	        System.out.print("| O maravilhoso McEspanha, mais um craque da Seleções do Méqui, é       |\n");
			System.out.print("| composto por pão tipo brioche, um hamburguer (carne 100% bovina),     |\n");
			System.out.print("| copa fatiada, molho temperado, alface e queijo sabor emental.         |\n");
			System.out.print("|----------------------Informação do produto----------------------------|\n");
			System.out.print("|Informação nutricional :                                               |\n");
			System.out.print("|  989kcal  ||     67g        ||  45g         ||     52g                |\n");
			System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
			System.out.print("|_______________________________________________________________________|\n");
			System.out.println("\n");
			
			break;
       case 4:
    	    System.out.print("|                            Opção 4                                    |\n");
    	    System.out.print("|---------------------------McArgentina---------------------------------|\n");
	        System.out.print("|                             805Kcal                                   |\n");
	        System.out.print("| Para compor a Seleção do Méqui trouxemos o maravilhoso McArgentina,   |\n");
			System.out.print("| composto por pão tipo brioche, um hamburguer (carne 100% bovina),     |\n");
			System.out.print("| maionese sabor chimichurri, cebola fresca, alface, tomate, bacon, e   |\n");
			System.out.print("| queijo sabor cheddar.                                                 |\n");
			System.out.print("|----------------------Informação do produto----------------------------|\n");
			System.out.print("|Informação nutricional :                                               |\n");
			System.out.print("|  805kcal  ||      51g       ||    42g       ||     44g                |\n");
			System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
			System.out.print("|_______________________________________________________________________|\n");   
			System.out.println("\n");
			
			break;
       case 5:
    	   System.out.print(" |                            Opção 5                                    |\n");
    	    System.out.print("|----------------------------McAlemanha---------------------------------|\n");
	        System.out.print("|                             828Kcal                                   |\n");
	        System.out.print("| O novo McAlemanha, parte da Seleções do Méqui, é composto por pão     |\n");
			System.out.print("| tipo brioche, um hamburguer (carne 100% bovina), salame com borda de  |\n");
			System.out.print("| pimenta, maionese, mostarda, cebola fresca e queijo sabor emental.    |\n");
			System.out.print("|----------------------Informação do produto----------------------------|\n");
			System.out.print("|Informação nutricional :                                               |\n");
			System.out.print("|  828kcal  ||        51g     ||     43g      ||     49g                |\n");
			System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
			System.out.print("|_______________________________________________________________________|\n");
			System.out.println("\n");
			
			break;
       case 6:
    	        System.out.print("|                            Opção 6                                    |\n");
    	        System.out.print("|----------------------------McMéxico-----------------------------------|\n");
	            System.out.print("|                             629Kcal                                   |\n");
	            System.out.print("| O McMéxico, parte da Seleções do Méqui, é especialmente composto      |\n");
			    System.out.print("| por pão tipo brioche com batata, peito de frango temperado empanado,  |\n");
			    System.out.print("| a nova maionese sabor pimenta jalapeño, alface e queijo sabor cheddar.|\n");
			    System.out.print("|----------------------Informação do produto----------------------------|\n");
			    System.out.print("|Informação nutricional :                                               |\n");
			    System.out.print("|  628kcal  ||       33g      ||    50g       ||     33g                |\n");
			    System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
			    System.out.print("|_______________________________________________________________________|\n");
			    System.out.println("\n");
			  
			    break;
		  
       case 7:
       	        System.out.print("|                            Opção 7                                    |\n");
    	        System.out.print("|---------------------------McFrança------------------------------------|\n");
		        System.out.print("|                            825Kcal                                    |\n");
		        System.out.print("| Para compor a Seleção do Méqui trouxemos o incrível McFrança,         |\n");
				System.out.print("| composto por pão tipo brioche, um hamburguer (carne 100% bovina),     |\n");
				System.out.print("| molho sabor queijo brie, cebola crispy, tomate, bacon e queijo sabor  |\n");
				System.out.print("| emental.                                                              |\n");
				System.out.print("|----------------------Informação do produto----------------------------|\n");
				System.out.print("|Informação nutricional :                                               |\n");
				System.out.print("|  825kcal  ||        55g     ||    46g       ||      44g               |\n");
				System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
				System.out.print("|_______________________________________________________________________|\n");
				System.out.println("\n");
				
				break;
		 case 8: 
			    System.out.print("|                            Opção 8                                    |\n");
			    System.out.print("|----------------------------McEUA--------------------------------------|\n");
	            System.out.print("|                           675 Kcal                                    |\n");
	            System.out.print("| McEUA, parte da Seleções do Méqui, é composto por pão tipo brioche    |\n");
			    System.out.print("| com batata, peito de frango temperado empanado, molho barbecue,       |\n");
			    System.out.print("| cebola crispy, bacon, picles crinkle e queijo sabor cheddar.          |\n");
			    System.out.print("|----------------------Informação do produto----------------------------|\n");
			    System.out.print("|Informação nutricional :                                               |\n");
			    System.out.print("|  675kcal  ||      31g       ||     63g      ||      35g               |\n");
		     	System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
		        System.out.print("|_______________________________________________________________________|\n");
			    System.out.println("\n");
			   
			    break;
		 case 9: 
		 	    System.out.print("|                            Opção 9                                    |\n");
			    System.out.print("|----------------------------McCatar------------------------------------|\n");
	            System.out.print("|                            989Kcal                                    |\n");
	            System.out.print("| O incrível McCatar é composto por pão tipo brioche, um hamburguer     |\n");
			    System.out.print("| (carne 100% bovina), molho árabe, cebola crispy, tomate e queijo sabor|\n");
			    System.out.print("| emental.                                                              |\n");
			    System.out.print("|----------------------Informação do produto----------------------------|\n");
			    System.out.print("|Informação nutricional :                                               |\n");
			    System.out.print("|  989Kcal  ||       68g      ||     48g      ||     47g                |\n");
			    System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
			    System.out.print("|_______________________________________________________________________|\n");
		        System.out.println("\n");
		       
		        break;
		 case 10:
			    System.out.print("|                            Opção 10                                   |\n");
			    System.out.print("|--------------McFlurry Espetáculo Kopenhagen Morango-------------------|\n");
	            System.out.print("|                            615Kcal                                    |\n");
	            System.out.print("| A massa geladinha de baunilha, cobertura de morango e o delicioso     |\n");
			    System.out.print("| tablete Kopenhagen de chocolate ao leite compõe essa sobremesa e      |\n");
			    System.out.print("| trazem o sabor único que só o chocolate ao leite Kopenhagen têm.      |\n");
			    System.out.print("|----------------------Informação do produto----------------------------|\n");
			    System.out.print("|Informação nutricional :                                               |\n");
			    System.out.print("|  615kcal  ||       28g      ||     80g      ||      9g                |\n");
			    System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
			    System.out.print("|_______________________________________________________________________|\n");
			    System.out.println("\n");
			   
			    break;
		 case 11:
			    System.out.print("|                            Opção 11                                   |\n");
			    System.out.print("|--------------McFlurry Espetáculo Kopenhagen Chocolate-----------------|\n");
	            System.out.print("|                            633Kcal                                    |\n");
	            System.out.print("| A massa geladinha de baunilha, cobertura sabor chocolate e o delicioso|\n");
			    System.out.print("| tablete Kopenhagen de chocolate ao leite compõe essa sobremesa e      |\n");
			    System.out.print("| trazem o sabor único que só o chocolate ao leite Kopenhagen têm.      |\n");
			    System.out.print("|----------------------Informação do produto----------------------------|\n");
			    System.out.print("|Informação nutricional :                                               |\n");
			    System.out.print("|  633kcal  ||      30g       ||   80g      ||     10g                  |\n");
			    System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
			    System.out.print("|_______________________________________________________________________|\n");
			    System.out.println("\n");
			    
			    break;
		 case 12:
			    System.out.print("|                            Opção 12                                   |\n");
			    System.out.print("|--------------McFlurry Espetáculo Kopenhagen Caramelo------------------|\n");
	            System.out.print("|                             639Kcal                                   |\n");
	            System.out.print("| A massa geladinha de baunilha, cobertura de caramelo e o delicioso    |\n");
			    System.out.print("| tablete Kopenhagen de chocolate ao leite compõe essa sobremesa e      |\n");
			    System.out.print("| trazem o sabor único que só o chocolate ao leite Kopenhagen têm       |\n");
			    System.out.print("|----------------------Informação do produto----------------------------|\n");
			    System.out.print("|Informação nutricional :                                               |\n");
			    System.out.print("|  639kcal  ||       29g      ||     84g      ||      10g               |\n");
			    System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
			    System.out.print("|_______________________________________________________________________|\n");
			    System.out.println("\n");
			    
			    break;
		 case 13:
			    System.out.print("|                           Opção13                                     |\n");
			    System.out.print("|-------------------------Blister CBO-----------------------------------|\n");
	            System.out.print("|                           100Kcal                                     |\n");
	            System.out.print("| O Molho do CBO complementa um dos nossos produtos mais amados         |\n");
			    System.out.print("| pelo público, ele é composto por especiarias e possui sabor e         |\n");
			    System.out.print("| cremosidade icônicos.                                                 |\n");
			    System.out.print("|----------------------Informação do produto----------------------------|\n");
			    System.out.print("|Informação nutricional :                                               |\n");
			    System.out.print("|  100kcal  ||        9g      ||    4g        ||      0g                |\n");
			    System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
			    System.out.print("|_______________________________________________________________________|\n");
			    System.out.println("\n");
			   
			    break;
		 case 14: 
			    System.out.print("|                            Opção 14                                   |\n");
			    System.out.print("|------------------------ Blister Tasty---------------------------------|\n");
	            System.out.print("|                            80Kcal                                     |\n");
	            System.out.print("| Único por seu sabor defumado, cremosidade e textura. O Molho Tasty é  |\n");
			    System.out.print("| exclusivo McDonald´s                                                  |\n");
			    System.out.print("|----------------------Informação do produto----------------------------|\n");
			    System.out.print("|Informação nutricional :                                               |\n");
			    System.out.print("|   80kcal  ||        8g      ||      4g      ||      0g                |\n");
			    System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
			    System.out.print("|_______________________________________________________________________|\n");
			    System.out.print("\n");
			   
		       break;
		 case 0:
			 System.out.println(" Voltando para o menu ");
			 System.out.println(" Aperte 0 para confirmar ");
            }
        }while ( sandubalancamento!= 0);
     }
    public static void Seleções() {
    	 Scanner ler = new Scanner(System.in);
    	 int seleções;
do {
    	 System.out.print("\n\n-- Seleções do Méqui  --\n\n");
         System.out.print("|-----------------------------------------------------|\n");
         System.out.print("| Opção 1  - McBrasil                                 |\n");
         System.out.print("| Opção 2  - McFlurry Brasil                          |\n");
         System.out.print("| Opção 3  - McEspanha                                |\n");
         System.out.print("| Opção 4  - McArgentina                              |\n");
         System.out.print("| Opção 5  - McAlemanha                               |\n");
         System.out.print("| Opção 6  - McMéxico                                 |\n");
         System.out.print("| Opção 7  - McFrança                                 |\n");
         System.out.print("| Opção 8  - McEua                                    |\n");
         System.out.print("| Opção 9  - McCatar                                  |\n");
         System.out.print("| Opção 0 - Para voltar ao menu                       |\n");
         System.out.print("|-----------------------------------------------------|\n");
         System.out.print("\n");
         System.out.print(" Opção escolhida : ");
         seleções=ler.nextInt();
         switch(seleções){
         case 1: 	
    	  		    System.out.print("|                            Opção 1                                    |\n");
                 System.out.print("|----------------------------McBrasil-----------------------------------|\n");
 	            System.out.print("|                            1156Kcal                                   |\n");
 	            System.out.print("| Nosso grandioso e inigualável McBrasil, composto por pão tipo brioche,|\n");
 			    System.out.print("| um hamburguer (carne 100% bovina), molho temperado, empanado de       |\n");
 			    System.out.print("| queijo, alface, tomate e bacon.                                       |\n");
 			    System.out.print("|----------------------Informação do produto----------------------------|\n");
 			    System.out.print("|Informação nutricional :                                               |\n");
 			    System.out.print("| 1156kcal  ||      79g       ||  59g         ||     54g                |\n");
 			    System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
 				System.out.print("|_______________________________________________________________________|\n");
 			    System.out.println("\n");
 			   
 			    break;
 			
        case 2: 
     	    System.out.print("|                            Opção 2                                    |\n");
     	    System.out.print("|------------------------McFlurry Brasil--------------------------------|\n");
 	        System.out.print("|                             407kcal                                   |\n");
 	        System.out.print("| Para compor a Seleção do Méqui trouxemos a sobremesa que tem a cara do|\n");
 			System.out.print("| Brasil composta por massa gelada de baunilha, calda de banana comum   |\n");
 			System.out.print("| toque de canela , cobertura de caramelo e farofa crocante de amendoim.|\n");
 			System.out.print("|                  Você precisa experimentar!                           |\n");    						
 			System.out.print("|----------------------Informação do produto----------------------------|\n");
 			System.out.print("|Informação nutricional :                                               |\n");
 			System.out.print("|  407kcal  ||      12g       ||  68g         ||     7g                 |\n");
 			System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
 			System.out.print("|_______________________________________________________________________|\n");
 		    System.out.println("\n");
 		    
 		    break;
        case 3:
     	   System.out.print(" |                            Opção 3                                    |\n");
     	    System.out.print("|----------------------------McEspanha----------------------------------|\n");
 	        System.out.print("|                             989kcal                                   |\n");
 	        System.out.print("| O maravilhoso McEspanha, mais um craque da Seleções do Méqui, é       |\n");
 			System.out.print("| composto por pão tipo brioche, um hamburguer (carne 100% bovina),     |\n");
 			System.out.print("| copa fatiada, molho temperado, alface e queijo sabor emental.         |\n");
 			System.out.print("|----------------------Informação do produto----------------------------|\n");
 			System.out.print("|Informação nutricional :                                               |\n");
 			System.out.print("|  989kcal  ||     67g        ||  45g         ||     52g                |\n");
 			System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
 			System.out.print("|_______________________________________________________________________|\n");
 			System.out.println("\n");
 			
 			break;
        case 4:
     	    System.out.print("|                            Opção 4                                    |\n");
     	    System.out.print("|---------------------------McArgentina---------------------------------|\n");
 	        System.out.print("|                             805Kcal                                   |\n");
 	        System.out.print("| Para compor a Seleção do Méqui trouxemos o maravilhoso McArgentina,   |\n");
 			System.out.print("| composto por pão tipo brioche, um hamburguer (carne 100% bovina),     |\n");
 			System.out.print("| maionese sabor chimichurri, cebola fresca, alface, tomate, bacon, e   |\n");
 			System.out.print("| queijo sabor cheddar.                                                 |\n");
 			System.out.print("|----------------------Informação do produto----------------------------|\n");
 			System.out.print("|Informação nutricional :                                               |\n");
 			System.out.print("|  805kcal  ||      51g       ||    42g       ||     44g                |\n");
 			System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
 			System.out.print("|_______________________________________________________________________|\n");   
 			System.out.println("\n");
 			
 			break;
        case 5:
     	   System.out.print(" |                            Opção 5                                    |\n");
     	    System.out.print("|----------------------------McAlemanha---------------------------------|\n");
 	        System.out.print("|                             828Kcal                                   |\n");
 	        System.out.print("| O novo McAlemanha, parte da Seleções do Méqui, é composto por pão     |\n");
 			System.out.print("| tipo brioche, um hamburguer (carne 100% bovina), salame com borda de  |\n");
 			System.out.print("| pimenta, maionese, mostarda, cebola fresca e queijo sabor emental.    |\n");
 			System.out.print("|----------------------Informação do produto----------------------------|\n");
 			System.out.print("|Informação nutricional :                                               |\n");
 			System.out.print("|  828kcal  ||        51g     ||     43g      ||     49g                |\n");
 			System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
 			System.out.print("|_______________________________________________________________________|\n");
 			System.out.println("\n");
 			
 			break;
        case 6:
     	        System.out.print("|                            Opção 6                                    |\n");
     	        System.out.print("|----------------------------McMéxico-----------------------------------|\n");
 	            System.out.print("|                             629Kcal                                   |\n");
 	            System.out.print("| O McMéxico, parte da Seleções do Méqui, é especialmente composto      |\n");
 			    System.out.print("| por pão tipo brioche com batata, peito de frango temperado empanado,  |\n");
 			    System.out.print("| a nova maionese sabor pimenta jalapeño, alface e queijo sabor cheddar.|\n");
 			    System.out.print("|----------------------Informação do produto----------------------------|\n");
 			    System.out.print("|Informação nutricional :                                               |\n");
 			    System.out.print("|  628kcal  ||       33g      ||    50g       ||     33g                |\n");
 			    System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
 			    System.out.print("|_______________________________________________________________________|\n");
 			    System.out.println("\n");
 			  
 			    break;
 		  
        case 7:
        	        System.out.print("|                            Opção 7                                    |\n");
     	        System.out.print("|---------------------------McFrança------------------------------------|\n");
 		        System.out.print("|                            825Kcal                                    |\n");
 		        System.out.print("| Para compor a Seleção do Méqui trouxemos o incrível McFrança,         |\n");
 				System.out.print("| composto por pão tipo brioche, um hamburguer (carne 100% bovina),     |\n");
 				System.out.print("| molho sabor queijo brie, cebola crispy, tomate, bacon e queijo sabor  |\n");
 				System.out.print("| emental.                                                              |\n");
 				System.out.print("|----------------------Informação do produto----------------------------|\n");
 				System.out.print("|Informação nutricional :                                               |\n");
 				System.out.print("|  825kcal  ||        55g     ||    46g       ||      44g               |\n");
 				System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
 				System.out.print("|_______________________________________________________________________|\n");
 				System.out.println("\n");
 				
 				break;
 		 case 8: 
 			    System.out.print("|                            Opção 8                                    |\n");
 			    System.out.print("|----------------------------McEUA--------------------------------------|\n");
 	            System.out.print("|                           675 Kcal                                    |\n");
 	            System.out.print("| McEUA, parte da Seleções do Méqui, é composto por pão tipo brioche    |\n");
 			    System.out.print("| com batata, peito de frango temperado empanado, molho barbecue,       |\n");
 			    System.out.print("| cebola crispy, bacon, picles crinkle e queijo sabor cheddar.          |\n");
 			    System.out.print("|----------------------Informação do produto----------------------------|\n");
 			    System.out.print("|Informação nutricional :                                               |\n");
 			    System.out.print("|  675kcal  ||      31g       ||     63g      ||      35g               |\n");
 		     	System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
 		        System.out.print("|_______________________________________________________________________|\n");
 			    System.out.println("\n");
 			   
 			    break;
 		 case 9: 
 		 	    System.out.print("|                            Opção 9                                    |\n");
 			    System.out.print("|----------------------------McCatar------------------------------------|\n");
 	            System.out.print("|                            989Kcal                                    |\n");
 	            System.out.print("| O incrível McCatar é composto por pão tipo brioche, um hamburguer     |\n");
 			    System.out.print("| (carne 100% bovina), molho árabe, cebola crispy, tomate e queijo sabor|\n");
 			    System.out.print("| emental.                                                              |\n");
 			    System.out.print("|----------------------Informação do produto----------------------------|\n");
 			    System.out.print("|Informação nutricional :                                               |\n");
 			    System.out.print("|  989Kcal  ||       68g      ||     48g      ||     47g                |\n");
 			    System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
 			    System.out.print("|_______________________________________________________________________|\n");
 		        System.out.println("\n");
 		       
 		        break;
         
                }
           }while(seleções!=0);
    }
    public static void sair() {
    	System.out.println("|____________________________________|\n");
    	System.out.println("| Obrigado por usar o App do Méqui   |\n");
    	System.out.println("|       Pedrinho braço curto 10/22   |\n");
    	System.out.println("|          De nada Jailson           |\n");
    	System.out.println("|____________________________________|\n");
    }
    public static void lanchecarne() {
    	Scanner ler = new Scanner(System.in);
    	int lanchecarne;
    	do {
    	System.out.print("\n\n---------------Sanduíches de Carne Bovina---------------\n\n");
        System.out.print("|-----------------------------------------------------|\n");
        System.out.print("|_____________________________________________________|\n");
        System.out.print("| Opção 1  - Big Mac                                  |\n");
        System.out.print("| Opção 2  - Duplo Quarterão                          |\n");
        System.out.print("| Opção 3  - Quarterão com Queijo                     |\n");
        System.out.print("| Opção 4  - McNífico Bacon                           |\n");
        System.out.print("| Opção 5  - Duplo Cheddar McMelt                     |\n");
        System.out.print("| Opção 6  - Cheddar McMelt                           |\n");
        System.out.print("| Opção 7  - Duplo Burguer Bacon                      |\n");
        System.out.print("| Opção 8  - Duplo Burguer com Queijo                 |\n");
        System.out.print("| Opção 9  - Triplo Cheeseburguer                     |\n");
        System.out.print("| Opção 10 - McFiesta                                 |\n");
        System.out.print("| Opção 11 - Cheeseburguer                            |\n");
        System.out.print("| Opção 12 - Hamburguer                               |\n");
        System.out.print("| Opção 0 - Para voltar ao menu                       |\n");
        System.out.print("|_____________________________________________________|\n");
        lanchecarne=ler.nextInt();
        switch(lanchecarne) {
        case 1:
        	System.out.print("|                            Opção1                                      |\n");
            System.out.print("|----------------------------Big Mac-------------------------------------|\n");
            System.out.print("|                            503Kcal                                     |\n");
            System.out.print("|Dois hambúrgueres (100% carne bovina), alface americana, queijo sabor   |\n");
    	    System.out.print("|cheddar, molho especial, cebola, picles e pão com gergelim.             |\n");
    	    System.out.print("|----------------------Informação do produto-----------------------------|\n");
    	    System.out.print("|Informação nutricional :                                                |\n");
    	    System.out.print("| 503kcal   ||      26g       ||      41g     ||     26g       ||        |\n");
    	    System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas   ||        |\n");
    		System.out.print("|________________________________________________________________________|\n");
    	    System.out.println("\n");
    	    break;
        case 2:
        	System.out.print("|                            Opção2                                     |\n");
            System.out.print("|-------------------------Duplo Quarterão-------------------------------|\n");
            System.out.print("|                            762Kcal                                    |\n");
            System.out.print("|Dois hambúrgueres (100% carne bovina), mostarda, ketchup, cebola,      |\n");
    	    System.out.print("|queijo sabor cheddar e pão com gergelim.                               |\n");
    	    System.out.print("|----------------------Informação do produto----------------------------|\n");
    	    System.out.print("|Informação nutricional :                                               |\n");
    	    System.out.print("| 762kcal   ||      47g       ||      35g     ||     50g     ||         |\n");
    	    System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas ||         |\n");
    		System.out.print("|_______________________________________________________________________|\n");
    	    System.out.println("\n");
    	    break;
        case 3:
        	System.out.print("|                             Opção3                                    |\n");
            System.out.print("|----------------------Quarterão com Queijo-----------------------------|\n");
            System.out.print("|                            523Kcal                                    |\n");
            System.out.print("|Um hambúrguer (100% carne bovina), queijo sabor cheddar, picles,       |\n");
    	    System.out.print("|cebola, ketchup, mostarda e pão com gergelim.                          |\n");
    	    System.out.print("|----------------------Informação do produto----------------------------|\n");
    	    System.out.print("|Informação nutricional :                                               |\n");
    	    System.out.print("| 523kcal   ||      29g       ||     35g      ||     30g    ||          |\n");
    	    System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas||          |\n");
    		System.out.print("|_______________________________________________________________________|\n");
    	    System.out.println("\n");
    	    break;
        case 4:
        	System.out.print("|                            Opção4                                     |\n");
            System.out.print("|-------------------------McNífico Bacon--------------------------------|\n");
            System.out.print("|                            571Kcal                                    |\n");
            System.out.print("|Um hambúrguer (100% carne bovina), bacon, alface americana, cebola,    |\n");
    	    System.out.print("|queijo sabor cheddar, tomate, maionese, ketchup, mostarda e pão com    |\n");
    	    System.out.print("|gergelim.                                                              |\n");
    	    System.out.print("|----------------------Informação do produto----------------------------|\n");
    	    System.out.print("|Informação nutricional :                                               |\n");
    	    System.out.print("|  571kcal   ||      46g       ||  46g         ||     43g      ||       |\n");
    	    System.out.print("|  Calorias  ||  Gordura total || Carboidratos ||   Proteínas  ||       |\n");
    		System.out.print("|_______________________________________________________________________|\n");
    	    System.out.println("\n");
    	    break;
        case 5:
        	System.out.print("|                            Opção5                                     |\n");
            System.out.print("|----------------------Duplo Cheddar McMelt-----------------------------|\n");
            System.out.print("|                            786Kcal                                    |\n");
            System.out.print("|Dois hambúrgueres (100% carne bovina), molho sabor cheddar, cebola ao  |\n");
    	    System.out.print("|molho shoyu e pão escuro com gergelim.                                 |\n");
    	    System.out.print("|----------------------Informação do produto----------------------------|\n");
    	    System.out.print("|Informação nutricional :                                               |\n");
    	    System.out.print("| 786kcal   ||      50g       ||     34g      ||     49g     ||         |\n");
    	    System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas ||         |\n");
    		System.out.print("|_______________________________________________________________________|\n");
    	    System.out.println("\n");
    	    break;
        case 6:
        	System.out.print("|                            Opção6                                     |\n");
            System.out.print("|------------------------Cheddar McMelt---------------------------------|\n");
            System.out.print("|                            474Kcal                                    |\n");
            System.out.print("|Um hambúrguer (100% carne bovina), molho sabor cheddar, cebola ao      |\n");
    	    System.out.print("|molho shoyu e pão escuro com gergelim.                                 |\n");
    	    System.out.print("|----------------------Informação do produto----------------------------|\n");
    	    System.out.print("|Informação nutricional :                                               |\n");
    	    System.out.print("|  474kcal   ||      27g       ||     31g      ||     28g     ||        |\n");
    	    System.out.print("|  Calorias  ||  Gordura total || Carboidratos ||   Proteínas ||        |\n");
    		System.out.print("|_______________________________________________________________________|\n");
    	    System.out.println("\n");
    	    break;
        case 7:
        	System.out.print("|                            Opção7                                     |\n");
            System.out.print("|----------------------Duplo Burguer Bacon------------------------------|\n");
            System.out.print("|                            447kcal                                    |\n");
            System.out.print("|Dois hambúrgueres (100% carne bovina), queijo sabor cheddar, cebola,   |\n");
    	    System.out.print("|fatias de bacon, ketchup, mostarda e pão com gergelim.                 |\n");
    	    System.out.print("|----------------------Informação do produto----------------------------|\n");
    	    System.out.print("|Informação nutricional :                                               |\n");
    	    System.out.print("| 447kcal   ||      24g       ||     32g      ||     26g      ||        |\n");
    	    System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas  ||        |\n");
    		System.out.print("|_______________________________________________________________________|\n");
    	    System.out.println("\n");
    	    break;
        case 8:
        	System.out.print("|                            Opção8                                     |\n");
            System.out.print("|---------------------Duplo Burguer com Queijo--------------------------|\n");
            System.out.print("|                           478kcal                                     |\n");
            System.out.print("|Dois hambúrgueres, uma explosão de sabor. Dois deliciosos|\n");
            System.out.print("|hambúrgueres de carne 100% bovina, queijo sabor cheddar derretido,     |\n");
            System.out.print("|picles, cebola picada, ketchup, mostarda e pão com gergelim.           |\n");
    	    System.out.print("|----------------------Informação do produto----------------------------|\n");
    	    System.out.print("|Informação nutricional :                                               |\n");
    	    System.out.print("|  478kcal   ||      25g       ||     35g         ||     27g     ||     |\n");
    	    System.out.print("| Calorias   ||  Gordura total || Carboidratos    ||   Proteínas ||     |\n");
    		System.out.print("|_______________________________________________________________________|\n");
    	    System.out.println("\n");
    	    break;
        case 9:
        	System.out.print("|                            Opção9                                     |\n");
            System.out.print("|------------------------Triplo CheeseBurguer---------------------------|\n");
            System.out.print("|                            559Kcal                                    |\n");
            System.out.print("|Três hambúrgueres (100% carne bovina), queijo sabor cheddar, cebola,  |\n");
    	    System.out.print("|picles, ketchup, mostarda e pão com gergelim.                          |\n");
    	    System.out.print("|----------------------Informação do produto----------------------------|\n");
    	    System.out.print("|Informação nutricional :                                               |\n");
    	    System.out.print("| 559kcal   ||      32g       ||    33g         ||     35g     ||       |\n");
    	    System.out.print("| Calorias  ||  Gordura total || Carboidratos   ||   Proteínas ||       |\n");
    		System.out.print("|_______________________________________________________________________|\n");
    	    System.out.println("\n");
    	    break;
        case 10:
        	System.out.print("|                            Opção10                                    |\n");
            System.out.print("|----------------------------McFiesta-----------------------------------|\n");
            System.out.print("|                            272Kcal                                    |\n");
            System.out.print("|Hambúrguer de carne 100% bovina, alface, tomate e maionese no pão      |\n");
    	    System.out.print("|quentinho.|\n");
    	    System.out.print("|----------------------Informação do produto----------------------------|\n");
    	    System.out.print("|Informação nutricional :                                               |\n");
    	    System.out.print("|  272kcal   ||      12g       ||     27g      ||     13g     ||        |\n");
    	    System.out.print("| Calorias   ||  Gordura total || Carboidratos ||   Proteínas ||        |\n");
    		System.out.print("|_______________________________________________________________________|\n");
    	    System.out.println("\n");
    	    break;
        case 11:
        	System.out.print("|                            Opção11                                    |\n");
            System.out.print("|--------------------------Cheeseburguer--------------------------------|\n");
            System.out.print("|                            302Kcal                                    |\n");
            System.out.print("|Um hamburguer (100% carne bovina), queijo sabor cheddar, cebola,       |\n");
    	    System.out.print("|picles, ketchup, mostarda e pão sem gergelim                           |\n");
    	    System.out.print("|----------------------Informação do produto----------------------------|\n");
    	    System.out.print("|Informação nutricional :                                               |\n");
    	    System.out.print("| 767kcal   ||      46g       ||  46g         ||     43g       ||       |\n");
    	    System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas   ||       |\n");
    		System.out.print("|_______________________________________________________________________|\n");
    	    System.out.println("\n");
    	    break;
        case 12:
        	System.out.print("|                            Opção12                                     |\n");
            System.out.print("|---------------------------Hamburguer-----------------------------------|\n");
            System.out.print("|                            247Kcal                                     |\n");
            System.out.print("|Um Hamburguer (100% carne bovina), cebola, picles, ketchup, mostarda    |\n");
    	    System.out.print("|e pão sem gergelim.                                                     |\n");
    	    System.out.print("|----------------------Informação do produto-----------------------------|\n");
    	    System.out.print("|Informação nutricional :                                                |\n");
    	    System.out.print("| 247kcal   ||      9g        ||      29g     ||     13g     ||          |\n");
    	    System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas ||          |\n");
    		System.out.print("|________________________________________________________________________|\n");
    	    System.out.println("\n");
    	    break;
        case 0:
        	System.out.println(" Voltando para o menu.......");
        	break;
        }
        
    }while(lanchecarne!=0);
   }
    public static void tasty() {
    	Scanner ler = new Scanner(System.in);
    	int tasty;
    	do {
    	System.out.print("\n\n----------------Família Tasty--------------------\n\n");
        System.out.print("|-----------------------------------------------------|\n");
        System.out.print("|_____________________________________________________|\n");
        System.out.print("| Opção 1  - Big Tasty                                |\n");
        System.out.print("| Opção 2  - Big Tasty Turbo Bacon                    |\n");
        System.out.print("| Opção 0 - Para voltar ao menu                       |\n");
        System.out.print("|_____________________________________________________|\n");
        tasty=ler.nextInt();
        switch(tasty) {
        case 1:
        	  System.out.print("|                            Opção 1                                    |\n");
              System.out.print("|---------------------------Big Tasty-----------------------------------|\n");
              System.out.print("|                            944Kcal                                    |\n");
              System.out.print("|Um hambúrguer (100% carne bovina), queijo sabor emental, tomate,       |\n");
      	      System.out.print("|alface americana, cebola, molho Tasty e pão com gergelim.              |\n");
      	      System.out.print("|----------------------Informação do produto----------------------------|\n");
      	      System.out.print("|Informação nutricional :                                               |\n");
      	      System.out.print("| 944kcal   ||      66g       ||     45g      ||     43g     ||         |\n");
      	      System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas ||         |\n");
      		  System.out.print("|_______________________________________________________________________|\n");
        	  break;
        case 2: 
        	  System.out.print("|                            Opção 2                                    |\n");
              System.out.print("|----------------------Big Tasty Turbo Bacon----------------------------|\n");
              System.out.print("|                            944Kcal                                    |\n");
              System.out.print("|Um Hambúrguer (100% carne bovina), bacon em fatias, bacon crispy,      |\n");
     	      System.out.print("|queijo sabor emental, tomate, alface americana, cebola, molho Tasty e  |\n");
     	      System.out.print("|pão com gergelim.                                                      |\n");
     	      System.out.print("|----------------------Informação do produto----------------------------|\n");
     	      System.out.print("|Informação nutricional :                                               |\n");
     	      System.out.print("| 1015kcal  ||      72g       ||     45g      ||     47g     ||         |\n");
     	      System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas ||         |\n");
     		  System.out.print("|_______________________________________________________________________|\n");
        	  break;
        case 0:
        	System.out.println(" Voltando para o menu......");
        	break;
        }
        
    	}while(tasty!=0);
  	} 
    public static void sanduichefrango() {
    	Scanner ler = new Scanner(System.in);
    	int sanduichefrango;
    	do {
    	System.out.print("\n\n---------Sanduíches de Frango--------------------\n\n");
        System.out.print("|-----------------------------------------------------|\n");
        System.out.print("|_____________________________________________________|\n");
        System.out.print("| Opção 1  - McCrispy Chicken Deluxe                  |\n");
        System.out.print("| Opção 2  - McCrispy Chicken Classic                 |\n");
        System.out.print("| Opção 3  - McCrispy Chicken Spicy                   |\n");
        System.out.print("| Opção 4  - McChicken Bacon                          |\n");
        System.out.print("| Opção 5  - McChicken                                |\n");
        System.out.print("| Opção 6  - Chicken Jr                               |\n");
        System.out.print("| Opção 0 - Para voltar ao menu                       |\n");
        System.out.print("|_____________________________________________________|\n");
        sanduichefrango=ler.nextInt();
        switch(sanduichefrango){
        case 1:
        	  System.out.print("|                            Opção 1                                    |\n");
              System.out.print("|--------------------McCrispy Chicken Deluxe----------------------------|\n");
              System.out.print("|                            497Kcal                                    |\n");
              System.out.print("|Sanduiche composto por tipo brioche com batata, carne 100% de peito    |\n");
    	      System.out.print("|de frango, temperada e empanada, maionese, alface americana e          |\n");
    	      System.out.print("|tomate.                                                                |\n");
    	      System.out.print("|----------------------Informação do produto----------------------------|\n");
    	      System.out.print("|Informação nutricional :                                               |\n");
    	      System.out.print("| 497kcal   ||      16g       ||     59g      ||     29g     ||         |\n");
    	      System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas ||         |\n");
    		  System.out.print("|_______________________________________________________________________|\n");
      	  break;
        case 2:
        	  System.out.print("|                            Opção 2                                    |\n");
              System.out.print("|-------------------McCrispy Chicken Classic----------------------------|\n");
              System.out.print("|                            582Kcal                                    |\n");
              System.out.print("|Sanduiche composto por pão tipo brioche com batata, carne 100% de      |\n");
    	      System.out.print("|peito de frango, temperada e empanada, manteiga e picles crinkle.      |\n");
    	      System.out.print("|----------------------Informação do produto----------------------------|\n");
    	      System.out.print("|Informação nutricional :                                               |\n");
    	      System.out.print("| 582kcal   ||      22g       ||     47g      ||     28g     ||         |\n");
    	      System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas ||         |\n");
    		  System.out.print("|_______________________________________________________________________|\n");
      	  break;
        	
        case 3:
        	  System.out.print("|                            Opção 3                                    |\n");
              System.out.print("|--------------------McCrispy Chicken Spicy-----------------------------|\n");
              System.out.print("|                           616Kcal                                     |\n");
              System.out.print("|Sanduiche composto por tipo brioche com batata, carne 100% de peito    |\n");
	          System.out.print("|de frango, temperada e empanada, molho de pimenta e picles crinkle.    |\n");
	          System.out.print("|----------------------Informação do produto----------------------------|\n");
	          System.out.print("|Informação nutricional :                                               |\n");
	          System.out.print("| 616kcal   ||      25g       ||     48g      ||     29g     ||         |\n");
	          System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas ||         |\n");
		      System.out.print("|_______________________________________________________________________|\n");
  	  break;
        	
        case 4:
        	  System.out.print("|                            Opção 4                                    |\n");
              System.out.print("|----------------------- McChicken Bacon--------------------------------|\n");
              System.out.print("|                            430Kcal                                    |\n");
              System.out.print("|Frango empanado, maionese, bacon, alface americana e pão com           |\n");
    	      System.out.print("|gergelim.                                                              |\n");
    	      System.out.print("|----------------------Informação do produto----------------------------|\n");
    	      System.out.print("|Informação nutricional :                                               |\n");
    	      System.out.print("| 430kcal   ||      23g       ||     38g      ||     19g     ||         |\n");
    	      System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas ||         |\n");
    		  System.out.print("|_______________________________________________________________________|\n");
      	  break;
        case 5:
        	  System.out.print("|                             Opção 5                                   |\n");
              System.out.print("|----------------------------McChicken----------------------------------|\n");
              System.out.print("|                            395kcal                                    |\n");
    	      System.out.print("|Frango empanado, maionese, alface americana e pão com gergelim.        |\n");
    	      System.out.print("|----------------------Informação do produto----------------------------|\n");
    	      System.out.print("|Informação nutricional :                                               |\n");
    	      System.out.print("| 395kcal   ||      20g       ||     38g      ||     17g     ||         |\n");
    	      System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas ||         |\n");
    		  System.out.print("|_______________________________________________________________________|\n");
      	  break;
        case 6:
        	  System.out.print("|                             Opção 6                                   |\n");
              System.out.print("|----------------------------Chicken Jr---------------------------------|\n");
              System.out.print("|                             454Kcal                                   |\n");
              System.out.print("|Frango empanado, maionese, alface americana e pão com gergelim.      |\n");
    	      System.out.print("|----------------------Informação do produto----------------------------|\n");
    	      System.out.print("|Informação nutricional :                                               |\n");
    	      System.out.print("| 454kcal   ||      27g       ||     40g      ||     14g     ||         |\n");
    	      System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas ||         |\n");
    		  System.out.print("|_______________________________________________________________________|\n");
      	  break;
        case 0:
        	   System.out.println(" Voltando ao menu.....");
        	break;
       
        	
        }
      }while(sanduichefrango!=0);
    }
     public static void McLancheFeliz() {
    	Scanner ler = new Scanner(System.in);
    	int McLancheFeliz;
    	System.out.print("\n\n---------------McLanche Feliz------------------------------------\n\n");
        System.out.print("|-------------------------------------------------------------------------------------------|\n");
        System.out.print("|                                     Produtos                                              |\n");
        System.out.print("|___________________________________________________________________________________________|\n");
        System.out.print("| Opção 1  - Chicken McNuggets 4  unidades   ||Opção 2 - McFiesta   || opção 3 - Hamburguer |\n");
        System.out.print("|             unidades                                                                      |\n");
        System.out.print("|             166kcal                        ||   272kcal           ||  247kcal             |\n");
        System.out.print("\n");
        System.out.print("|                                 Acompanhamentos                                           |\n");
        System.out.print("|___________________________________________________________________________________________|\n");
        System.out.print("| Opção 4  - McFritas Kids  ||   Opção 5 - Tomatinhos                                       |\n");
        System.out.print("|               90kcal      ||          12kcal                                              |\n");
        System.out.print("\n");
        System.out.print("|                                     Bebidas                                               |\n");
        System.out.print("|___________________________________________________________________________________________|\n");
        System.out.print("| Opção 6  - Água Mineral   ||    Opção 7 -  Del Valle 100% Uva                             |\n");
        System.out.print("|                                             (McLanche Feliz)                              |\n");
        System.out.print("|                0kcal                             183kcal                                  |\n");
        System.out.print("\n");
        System.out.print("|                                     Sobremesa                                             |\n");
        System.out.print("|___________________________________________________________________________________________|\n");
        System.out.print("| Opção 8  - Petit Suisse Sabor                                                             |\n");
        System.out.print("|                 Morango                                                                   |\n");
        System.out.print("|                                                                                           |\n");
        System.out.print("|                 42kcal                                                                    |\n");
        System.out.print("\n");
        System.out.print("| Opção 0 - Para voltar ao menu                                                             |\n");
        System.out.print("|___________________________________________________________________________________________|\n");
        McLancheFeliz=ler.nextInt();
    }
    public static void Méqui1000() {
    	
    }
    public static void acompanhamentos() {
    	 
    	Scanner ler = new Scanner(System.in);
    	 int acompanhamentos;
    	do {
    	 System.out.print("\n\n-- Seleções do Méqui  --\n\n");
         System.out.print("|-----------------------------------------------------|\n");
         System.out.print("| Opção 1  - McFritas Cheddar e Bacon                 |\n");
         System.out.print("| Opção 2  - McFritas Grande                          |\n");
         System.out.print("| Opção 3  - McFritas Média                           |\n");
         System.out.print("| Opção 4  - McFritas Pequena                         |\n");
         System.out.print("| Opção 5  - McFritas Kids                            |\n");
         System.out.print("| Opção 6  - Chicken McNuggets 6 unidades             |\n");
         System.out.print("| Opção 7  - Chicken McNuggets 4 unidades             |\n");
         System.out.print("| Opção 8  - Chicken McNuggets 10 unidades            |\n");
         System.out.print("| Opção 9  - Molho Agridoce                           |\n");
         System.out.print("| Opção 10  - Molho Barbecue                           |\n");
         System.out.print("| Opção 11 - Molho Ranch                              |\n");
         System.out.print("| Opção 12 - Molho Caipira                            |\n");
         System.out.print("| Opção 13 - MegaMcNuggets                            |\n");
         System.out.print("| Opção 14 - Ketchup                                  |\n");
         System.out.print("| Opção 15 - Mostarda                                 |\n");
         System.out.print("| Opção 16 - Tomatinho                                |\n");
         System.out.print("| Opção 17 - Mega McFritas                            |\n");
         System.out.print("| Opção 18 - Blister Cbo                              |\n");
         System.out.print("| Opção 19 - Blister Tasty                            |\n");
         System.out.print("| Opção 20 - |\n");
         System.out.print("| Opção 0 - Para voltar ao menu                       |\n");
         System.out.print("|-----------------------------------------------------|\n");
         System.out.print("\n");
         System.out.print(" Opção escolhida : ");
         acompanhamentos=ler.nextInt();
         switch(acompanhamentos) {
         case 1:
                System.out.print("|                           Opção1                                      |\n");
		        System.out.print("|--------------------McFritas Cheddar e Bacon --------------------------|\n");
                System.out.print("|                           377Kcal                                     |\n");
                System.out.print("|A batata frita mais famosa do mundo, agora com melt sabor cheddar e    |\n");
		        System.out.print("|bacon crispy. Não dá para resistir, experimente!                       |\n");
		        System.out.print("|----------------------Informação do produto----------------------------|\n");
		        System.out.print("|Informação nutricional :                                               |\n");
		        System.out.print("|  377kcal  ||       22g      ||    37g       ||      8g       ||       |\n");
		        System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas   ||       |\n");
		        System.out.print("|_______________________________________________________________________|\n");
		        System.out.println("\n");
		    break;
         case 2:
         	    System.out.print("|                           Opção2                                      |\n");
 		        System.out.print("|-----------------------McFritas Grande---------------------------------|\n");
                System.out.print("|                           422Kcal                                     |\n");
                System.out.print("|A batata frita mais famosa do mundo. Deliciosas batatas selecionadas,  |\n");
 		        System.out.print("|fritas, crocantes por fora, macias por dentro, douradas, irresistíveis,|\n");
 		        System.out.print("|saborosas, famosas, e todos os outros adjetivos positivos que você     |\n");
 		        System.out.print("|quiser dar.                                                            |\n");
 		        System.out.print("|----------------------Informação do produto----------------------------|\n");
 		        System.out.print("|Informação nutricional :                                               |\n");
 		        System.out.print("|  422kcal  ||        22g     ||    50g       ||      7g                |\n");
 		        System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
 		        System.out.print("|_______________________________________________________________________|\n");
 		        System.out.println("\n");
 		    break;
         case 3:
             	System.out.print("|                           Opção3                                      |\n");
		        System.out.print("|-----------------------McFritas Média-------------------------- -------|\n");
                System.out.print("|                           295 Kcal                                    |\n");
                System.out.print("|A batata frita mais famosa do mundo. Deliciosas batatas selecionadas,  |\n");
		        System.out.print("|fritas, crocantes por fora, macias por dentro, douradas, irresistíveis,|\n");
		        System.out.print("|saborosas, famosas, e todos os outros adjetivos positivos que você     |\n");
		        System.out.print("|quiser dar.                                                            |\n");
		        System.out.print("|----------------------Informação do produto----------------------------|\n");
		        System.out.print("|Informação nutricional :                                               |\n");
		        System.out.print("|  295kcal  ||       15g      ||     35g      ||      5g                |\n");
		        System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
		        System.out.print("|_______________________________________________________________________|\n");
		        System.out.println("\n");
		    break;
         case 4:
        	    System.out.print("|                           Opção4                                      |\n");
 		        System.out.print("|-----------------------McFritas Pequena--------------------------------|\n");
                System.out.print("|                           211Kcal                                     |\n");
                System.out.print("|A batata frita mais famosa do mundo. Deliciosas batatas selecionadas,  |\n");
 		        System.out.print("|fritas, crocantes por fora, macias por dentro, douradas, irresistíveis,|\n");
 		        System.out.print("|saborosas, famosas, e todos os outros adjetivos positivos que você     |\n");
 		        System.out.print("|quiser dar.");
 		        System.out.print("|----------------------Informação do produto----------------------------|\n");
 		        System.out.print("|Informação nutricional :                                               |\n");
 		        System.out.print("|  211kcal  ||       11g      ||    25g       ||      3g                |\n");
 		        System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
 		        System.out.print("|_______________________________________________________________________|\n");
 		        System.out.println("\n");
 		    break;
         case 5:
                System.out.print("|                           Opção5                                      |\n");
 		        System.out.print("|-------------------------McFritas Kids---------------------------------|\n");
                System.out.print("|                           90Kcal                                      |\n");
                System.out.print("|Nossas clássicas McFritas douradas e crocantes com toque ideal de sal  |\n");
 		        System.out.print("|em uma porção perfeita pras crianças|\n");
 		        System.out.print("|----------------------Informação do produto----------------------------|\n");
 		        System.out.print("|Informação nutricional :                                               |\n");
 		        System.out.print("|  90kcal  ||        5g       ||     11g      ||      1g                |\n");
 		        System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
 		        System.out.print("|_______________________________________________________________________|\n");
 		        System.out.println("\n");
 		    break;
         case 6:
        	    System.out.print("|                           Opção6                                      |\n");
 		        System.out.print("|---------------- Chicken McNuggets 6 unidades--------------------------|\n");
                System.out.print("|                           249Kcal                                     |\n");
                System.out.print("|Crocantes, leves e deliciosos. Os frangos empanados mais irresistíveis |\n");
 		        System.out.print("|do McDonald’s                                                          |\n");
 		        System.out.print("|----------------------Informação do produto----------------------------|\n");
 		        System.out.print("|Informação nutricional :                                               |\n");
 		        System.out.print("|  249kcal  ||        15g     ||    15g       ||      14g               |\n");
 		        System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
 		        System.out.print("|_______________________________________________________________________|\n");
 		        System.out.println("\n");
 		    break;
         case 7:
        	    System.out.print("|                           Opção7                                      |\n");
 		        System.out.print("|-----------------Chicken McNuggets 4 unidades--------------------------|\n");
                System.out.print("|                           166Kcal                                     |\n");
 		        System.out.print("| 4 Chicken McNuggets saborosos e crocantes de peito de frango.         |\n");
 		        System.out.print("|----------------------Informação do produto----------------------------|\n");
 		        System.out.print("|Informação nutricional :                                               |\n");
 		        System.out.print("|  166kcal  ||        10g     ||    10g       ||      9g                |\n");
 		        System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
 		        System.out.print("|_______________________________________________________________________|\n");
 		        System.out.println("\n");
 		    break;
         case 8:
        	    System.out.print("|                           Opção8                                             |\n");
 		        System.out.print("|-----------------Chicken McNuggets 10 unidades--------------------------------|\n");
                System.out.print("|                          414Kcal                                             |\n");
                System.out.print("|Crocantes, leves e deliciosos. Os frangos empanados mais irresistíveis        |\n");
 		        System.out.print("|do McDonald’s.                                                                |\n");
 		        System.out.print("|----------------------Informação do produto-----------------------------------|\n");
 		        System.out.print("|Informação nutricional :                                                      |\n");
 		        System.out.print("|  414kcal  ||        25g     ||    24g       ||      23g                      |\n");
 		        System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas                   |\n");
 		        System.out.print("|______________________________________________________________________________|\n");
 		        System.out.println("\n");
 		    break;
         case 9:
        	    System.out.print("|                           Opção9                                         |\n");
 		        System.out.print("|-----------------------Molho Agridoce-------------------------------------|\n");
 		        System.out.print("|                           46Kcal                                         |\n");
                System.out.print("|Blister 23g. O difícil é escolher qual o melhor molho para se deliciar com|\n");
		        System.out.print("|os McNuggets! Para hoje que tal o molho Agridoce                          |\n");
		        System.out.print("|----------------------Informação do produto-------------------------------|\n");
		        System.out.print("|Informação nutricional :                                                  |\n");
		        System.out.print("|  46kcal  ||        0g       ||     11g      ||      0g                   |\n");
		        System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas               |\n");
		        System.out.print("|__________________________________________________________________________|\n");
		        System.out.println("\n");
		    break;
         case 10:
     	        System.out.print("|                           Opção10                                         |\n");
		        System.out.print("|-----------------------Molho Barbecue--------------------------------------|\n");
                System.out.print("|                           44Kcal                                          |\n");
                System.out.print("|Blister 23g. O difícil é escolher qual o melhor molho para se deliciar com |\n");
 		        System.out.print("|os McNuggets! Para hoje que tal o molho Barbecue       |\n");
 		        System.out.print("|----------------------Informação do produto--------------------------------|\n");
 		        System.out.print("|Informação nutricional :                                                   |\n");
 		        System.out.print("|  44kcal  ||        0g       ||     10g      ||      0g                    |\n");
 		        System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas                |\n");
 		        System.out.print("|_______________________________________________________________________|\n");
 		        System.out.println("\n");
 		    break;
         case 11:
        	    System.out.print("|                           Opção11                                        |\n");
 		        System.out.print("|------------------------Molho Ranch---------------------------------------|\n");
 		        System.out.print("|                           111Kcal                                        |\n");
                System.out.print("|Blister 23g. O difícil é escolher qual o melhor molho para se deliciar com|\n");
		        System.out.print("|os McNuggets! Para hoje que tal o molho ranch?       |\n");
		        System.out.print("|----------------------Informação do produto-------------------------------|\n");
		        System.out.print("|Informação nutricional :                                                  |\n");
		        System.out.print("| 111kcal   ||        12g     ||    1g        ||      0g                   |\n");
		        System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas               |\n");
		        System.out.print("|__________________________________________________________________________|\n");
		        System.out.println("\n");
		    break;
 		
         case 12:
        	    System.out.print("|                           Opção12                                        |\n");
 		        System.out.print("|-------------------------Molho Caipira------------------------------------|\n");
                System.out.print("|                           52Kcal                                         |\n");
                System.out.print("|Blister 23g. O difícil é escolher qual o melhor molho para se deliciar com|\n");
 		        System.out.print("|os McNuggets! Para hoje que tal o molho caipira?                          |\n");
 		        System.out.print("|----------------------Informação do produto----------------------------   |\n");
 		        System.out.print("|Informação nutricional :                                                  |\n");
 		        System.out.print("|  52kcal  ||        2g       ||    7g        ||      0g                   |\n");
 		        System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas               |\n");
 		        System.out.print("|__________________________________________________________________________|\n");
 		        System.out.println("\n");
 		    break;
         case 13:
        	    System.out.print("|                           Opção13                                     |\n");
 		        System.out.print("|------------------------MegaMcNuggets----------------------------------|\n");
                System.out.print("|                           622Kcal                                     |\n");
                System.out.print("|Crocantes, leves e deliciosos. Os frangos empanados mais irresistíveis |\n");
 		        System.out.print("|do McDonald’s agora na versão Mega, ideal para compartilhar. Composto  |\n");
 		        System.out.print("|por 15 unidades de Chicken McNuggets.                                  |\n");
 		        System.out.print("|----------------------Informação do produto----------------------------|\n");
 		        System.out.print("|Informação nutricional :                                               |\n");
 		        System.out.print("|  622kcal  ||       37g      ||    36g       ||      36g               |\n");
 		        System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
 		        System.out.print("|_______________________________________________________________________|\n");
 		        System.out.println("\n");
         break;
         case 14:
        	    System.out.print("|                          Opção14                                     |\n");
		        System.out.print("|--------------------------Ketchup------------------------------------- |\n");
                System.out.print("|                           9Kcal                                       |\n");
		        System.out.print("|Sachê de Ketchup do Méqui                                              |\n");
		        System.out.print("|----------------------Informação do produto----------------------------|\n");
		        System.out.print("|Informação nutricional :                                               |\n");
		        System.out.print("|  9kcal  ||        0g        ||      2g      ||      0g                  |\n");
		        System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
		        System.out.print("|_______________________________________________________________________|\n");
		        System.out.println("\n");
        	break; 
         case 15:
        	    System.out.print("|                           Opção15                                     |\n");
 		        System.out.print("|--------------------------Mostarda-------------------------------------|\n");
                System.out.print("|                           4Kcal                                       |\n");
 		        System.out.print("|Sachê de mostarda do Méqui                                             |\n");
 		        System.out.print("|----------------------Informação do produto----------------------------|\n");
 		        System.out.print("|Informação nutricional :                                               |\n");
 		        System.out.print("|  4kcal  ||        0g      ||    0g        ||      0g                  |\n");
 		        System.out.print("|Caloriad ||  Gordura total || Carboidratos ||   Proteínas            |\n");
 		        System.out.print("|_______________________________________________________________________|\n");
 		        System.out.println("\n");
 		    break;
         case 16: 
        	    System.out.print("|                           Opção16                                     |\n");
 		        System.out.print("|--------------------------Tomatinho------------------------------------|\n");
                System.out.print("|                           12Kcal                                      |\n");
                System.out.print("| Mais um opção leve de acompanhamento: tomatinhos fresquinhos.         |\n");
 		        System.out.print("|----------------------Informação do produto----------------------------|\n");
 		        System.out.print("|Informação nutricional :                                               |\n");
 		        System.out.print("|  12kcal  ||        0.2g     ||    2g        ||      1g                |\n");
 		        System.out.print("| Calorias ||  Gordura total  || Carboidratos ||   Proteínas            |\n");
 		        System.out.print("|_______________________________________________________________________|\n");
 		        System.out.println("\n");
 		    break;
         case 17:
        	    System.out.print("|                           Opção17                                    |\n");
 		        System.out.print("|-------------------------Mega McFritas---------------------------------|\n");
                System.out.print("|                           890kcal                                     |\n");
                System.out.print("|A batata frita mais famosa do mundo, agora no tamanho Mega.            |\n");
 		        System.out.print("|Deliciosas batatas selecionadas, fritas, crocantes por fora, macias por|\n");
 		        System.out.print("|dentro, douradas, irresistíveis, saborosas, famosas, e todos os outros |\n");
 		        System.out.print("|adjetivos positivos que você quiser dar.                               |\n");
 		        System.out.print("|----------------------Informação do produto----------------------------|\n");
 		        System.out.print("|Informação nutricional :                                               |\n");
 		        System.out.print("|  890kcal  ||        46g     ||    105g      ||      14g               |\n");
 		        System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
 		        System.out.print("|_______________________________________________________________________|\n");
 		        System.out.println("\n");
 		    break;
         case 18:
        	    System.out.print("|                           Opção18                                     |\n");
 		        System.out.print("|-------------------------Blister CBO-----------------------------------|\n");
                System.out.print("|                           100Kcal                                     |\n");
                System.out.print("| O Molho do CBO complementa um dos nossos produtos mais amados         |\n");
 		        System.out.print("| pelo público, ele é composto por especiarias e possui sabor e         |\n");
 		        System.out.print("| cremosidade icônicos.                                                 |\n");
 		        System.out.print("|----------------------Informação do produto----------------------------|\n");
 		        System.out.print("|Informação nutricional :                                               |\n");
 		        System.out.print("|  100kcal  ||        9g      ||    4g        ||      0g                |\n");
 		        System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
 		        System.out.print("|_______________________________________________________________________|\n");
 		        System.out.println("\n");
 		     break;
         case 19:
        	    System.out.print("|                           Opção19                                   |\n");
        	    System.out.print("|------------------------ Blister Tasty---------------------------------|\n");
	            System.out.print("|                            80Kcal                                     |\n");
	            System.out.print("| Único por seu sabor defumado, cremosidade e textura. O Molho Tasty é  |\n");
			    System.out.print("| exclusivo McDonald´s                                                  |\n");
			    System.out.print("|----------------------Informação do produto----------------------------|\n");
			    System.out.print("|Informação nutricional :                                               |\n");
			    System.out.print("|   80kcal  ||        8g      ||      4g      ||      0g                |\n");
			    System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas            |\n");
			    System.out.print("|_______________________________________________________________________|\n");
			    System.out.print("\n");
			    break;
         
         
         }
    	}while(acompanhamentos!=0);
    }
    public static void sobremesas() {
    	System.out.print("\n\n--      Sobremesas  --\n\n");
        System.out.print("|-----------------------------------------------------|\n");
        System.out.print("| Opção 1  - Casquinha Baunilha                       |\n");
        System.out.print("| Opção 2  - Casquinha Chocolate                      |\n");
        System.out.print("| Opção 3  - Casquinha Mista                          |\n");
        System.out.print("| Opção 4  - Sundae Morango                           |\n");
        System.out.print("| Opção 5  - Sundae Chocolate                         |\n");
        System.out.print("| Opção 6  - Sundae Caramelo                          |\n");
        System.out.print("| Opção 7  - Top Sundae Morango                       |\n");
        System.out.print("| Opção 8  - Top Sundae Chocolate                     |\n");
        System.out.print("| Opção 9  - Top Sundae Caramelo                      |\n");
        System.out.print("| Opção 10 - McColosso Chocolate                      |\n");
        System.out.print("| Opção 11 - McColosso Caramelo                       |\n");
        System.out.print("| Opção 12 - Petit Suisse Sabor Morango               |\n");
        System.out.print("| Opção 13 - Torta de Maça                            |\n");
        System.out.print("| Opção 14 - Torta de Banana                          |\n");
        System.out.print("| Opção 15 - McShake Morango                          |\n");
        System.out.print("| Opção 16 - McShake Ovomaltine                       |\n");
        System.out.print("| Opção 17 - McShake Kopenhagen                       |\n");
        System.out.print("| Opção 18 - McFlurry M&M´s                           |\n");
        System.out.print("| Opção 19 - McFlurry Espetáculo Kopenhagen Chocolate |\n");
        System.out.print("| Opção 20 - McFlurry Espetáculo Kopenhagen Morango   |\n");
        System.out.print("| Opção 21 - McFlurry Espetáculo Kopenhagen Caramelo  |\n");
        System.out.print("| Opção 22 - McFlurry Ovomaltine                      |\n");
        System.out.print("| Opção 23 - McFlurry Prestigío Chocolate             |\n");
        System.out.print("| Opção 24 - McFlurry Prestigío Morango               |\n");
        System.out.print("| Opção 25 - McFlurry Prestigío Caramelo              |\n");
        System.out.print("\n");
        System.out.print("| Opção 0 - Para voltar ao menu                       |\n");
        System.out.print("|-----------------------------------------------------|\n");
        System.out.print("\n");
        System.out.print(" Opção escolhida : ");
    
    }
    public static void BebidasFrias() {
    	System.out.print("\n\n--      Bebidas Frias  --\n\n");
        System.out.print("|-----------------------------------------------------|\n");
        System.out.print("| Opção 1  - Coca-Cola 300ml                          |\n");
        System.out.print("| Opção 2  - Fanta Laranja 500ml                      |\n");
        System.out.print("| Opção 3  - Fanta Laranja 700ml                      |\n");
        System.out.print("| Opção 4  - Coca-Cola 500ml                          |\n");
        System.out.print("| Opção 5  - Coca-Cola 700ml                          |\n");
        System.out.print("| Opção 6  - Coca-Cola Zer  300ml                     |\n");
        System.out.print("| Opção 7  - Coca-Cola Zero 500ml                     |\n");
        System.out.print("| Opção 8  - Coca-Cola Zero 700ml                     |\n");
        System.out.print("| Opção 9  - Fanta Laranja 300ml                      |\n");
        System.out.print("| Opção 10 - Fanta Guanará 300ml                      |\n");
        System.out.print("| Opção 11 - Fanta Guanará 500ml                      |\n");
        System.out.print("| Opção 12 - Fanta Guanará 700ml                      |\n");
        System.out.print("| Opção 13 - Del Valle Laranja 300ml                  |\n");
        System.out.print("| Opção 14 - Del Valle Laranja 500ml                  |\n");
        System.out.print("| Opção 15 - Del Valle Laranja 700ml                  |\n");
        System.out.print("| Opção 16 - Del Valle Uva 300ml                      |\n");
        System.out.print("| Opção 17 - Del Valle Uva 500ml                      |\n");
        System.out.print("| Opção 18 - Del Valle Uva 700ml                      |\n");
        System.out.print("| Opção 19 - Água Mineral                             |\n");
        System.out.print("| Opção 20 - Del Valle 100% Uva (McLanche Feliz )     |\n");
        System.out.print("\n");
        System.out.print("| Opção 0 - Para voltar ao menu                       |\n");
        System.out.print("|-----------------------------------------------------|\n");
        System.out.print("\n");
        System.out.print(" Opção escolhida : ");
    	
    }
    public static void CaféDaManha() {
    	System.out.print("\n\n--      Café da Manha  --\n\n");
        System.out.print("|-----------------------------------------------------|\n");
        System.out.print("| Opção 1  - Quijo Quente                             |\n");
        System.out.print("| Opção 2  - Croissant de Presunto e Queijo           |\n");
        System.out.print("| Opção 3  - Pão de Quiejo                            |\n");
        System.out.print("| Opção 4  - Capuccino 300ml                          |\n");
        System.out.print("| Opção 5  - Capuccino 200ml                          |\n");
        System.out.print("| Opção 6  - Café com Leite 200ml                     |\n");
        System.out.print("| Opção 7  - Café com Leite 300ml                     |\n");
        System.out.print("| Opção 8  - Café Premium 300ml                       |\n");
        System.out.print("| Opção 9  - Café Premium 100ml                       |\n");
        System.out.print("| Opção 10 - Café Premium 200ml                       |\n");
        System.out.print("| Opção 11 - Chocolate Quente 300ml                   |\n");
        System.out.print("| Opção 12 - Chocolate Quente 200ml                   |\n");
        System.out.print("\n");
        System.out.print("| Opção 0 - Para voltar ao menu                       |\n");
        System.out.print("|-----------------------------------------------------|\n");
        System.out.print("\n");
        System.out.print(" Opção escolhida : ");
    }
    public static void BebidasQuentes() {
    	System.out.print("\n\n--      Bebidas Quentes --\n\n");
        System.out.print("|-----------------------------------------------------|\n");
        System.out.print("| Opção 1  - Café Premium 100ml                       |\n");
        System.out.print("| Opção 2  - Café Premium 200ml                       |\n");
        System.out.print("| Opção 3  - Café Premium 300ml                       |\n");
        System.out.print("| Opção 4  - Café com Leite 200ml                     |\n");
        System.out.print("| Opção 5  - Café com Leite 300ml                     |\n");
        System.out.print("| Opção 6  - Capuccino 200ml                          |\n");
        System.out.print("| Opção 7  - Capuccino 300ml                          |\n");
        System.out.print("| Opção 8  - Chocolate Quente 200ml                   |\n");
        System.out.print("| Opção 9  - Chocolate Quente 300ml                   |\n");
        System.out.print("\n");
        System.out.print("| Opção 0 - Para voltar ao menu                       |\n");
        System.out.print("|-----------------------------------------------------|\n");
        System.out.print("\n");
        System.out.print(" Opção escolhida : ");
    	
    }
    public static void McOfertas() {
    	
    	System.out.print("\n\n---------------------------------McOfertas------------------------------------\n\n");
        System.out.print("|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|\n");
        System.out.print("|                                     Produtos                                                                                                                                              |\n");
        System.out.print("|___________________________________________________________________________________________________________________________________________________________________________________________|\n");
        System.out.print("| ||Opção 1- BigMac|| ||Opção 2 -Quarteirão com Queijo || Opção 3- Cheddar McMelt || Opção 4- McChicken || Opção 5-  Big Tasty   || Opção 6-McNífico Bacon || Opção 7- Chicken McNugetts 10 |\n");
        System.out.print("|                                                                                                                                                                          unidades         |\n");
        System.out.print("| ||      503Kcal  || ||               523kcal         ||            474kcal      ||        395kcal     ||            944kcal    ||         571kcal        ||             414kcal           |\n");
        System.out.print("|___________________________________________________________________________________________________________________________________________________________________________________________|\n");
        System.out.print("\n");
        System.out.print("|                                 Acompanhamentos                                                                                                                                           |\n");
        System.out.print("|___________________________________________________________________________________________________________________________________________________________________________________________|\n");
        System.out.print("| ||Opção 8  - McFritas Grande  || Opção 9 - McFritas Média || Opção 10 -   Chicken McNugetts 4         ||     Opção 11 - Tomatinhos   ||                                                   |\n");
        System.out.print("|                                                                                unidades                                                                                                   |\n");
        System.out.print("| ||              422kcal       ||              295kcal     ||                    166kcal               ||             12kcal          ||                                                   |\n");
        System.out.print("|___________________________________________________________________________________________________________________________________________________________________________________________|\n");
        System.out.print("\n");
        System.out.print("|                                     Bebidas                                                                                                                                               |\n");
        System.out.print("|______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________|\n");
        System.out.print("| || Opção 12  - Fanta Laranja 500ml   ||    Opção 13 -  Fanta Laranja 700ml || Opção 14- Coca-Cola 500ml || Opção 15- Coca-Cola 700ml ||Opção 16- Coca-Cola Zero 500ml|| Opção 17- Coca-Cola Zero 700ml||Opção 18- Fanta Guaraná 500ml ||Opção 19- Fanta Guaraná 700ml||Opção 20- Del Valle Laranja 500ml ||Opção 21- Del Valle Laranja 700ml ||Opção 22- Del Valle Uva 500ml||Opção 23- Del Valle Uva 700ml|||\n");
        System.out.print("| ||                   155kcal         ||                      217kcal       ||              215kcal      ||              301kcal      ||                 0kcal        ||                 0kcal         ||                210kcal       ||                294kcal      ||                  205kcal         ||                 287kcal          ||              200kcal        ||             280kcal         |||\n");
        System.out.print("|______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________|\n");
        System.out.print("\n");
        System.out.print("| Opção 0 - Para voltar ao menu                                                                                                                                                                                                                                                                                                                                                                                |\n");
    }
    public static void MéquiOfertas() {
    	
    }
    public static void quemSomos() {
    	Scanner ler = new Scanner(System.in);
        int quemSomos;
        do {
        System.out.print("\n\n-- Quem Somos  --\n\n");
        System.out.print("|_______________________________________|\n");
        System.out.print("|Opção 1 -  Institucional               |\n");
        System.out.print("|Opção 2-   Franquias                   |\n");
        System.out.print("|Opção 3-   Trabalhe Conosco            |\n");
        System.out.print("|Opção 4-   Privacidade                 |\n");
        System.out.print("|Opção 5-  Desenvolvimento sustentável e|\n");
        System.out.print("|          Compromisso Socail           |\n");
        System.out.print("|Opção 6-  Publicidade Responsável      |\n");
        System.out.print("|Opção 0-  retornar ao menu             |\n");
        System.out.print("|_______________________________________|\n");
        quemSomos=ler.nextInt();
        switch(quemSomos) {
        case 1:
        	System.out.print("\n\n-- Institucional  --\n\n");
            System.out.print("|____________________________________________________________________________________________________________________________________________________|\n");
            System.out.print("|A Arcos Dorados é a maior franquia independente direitos exclusivos de possuir, operar e conceder o McDonald’s do mundo e a principal rede de       |\n");
            System.out.print("|alimentação rápida em toda América Latina e Caribe. A companhia tem as franquias de restaurantes McDonald's em 20 países e territórios, incluindo   |\n");
            System.out.print("|Argentina, Aruba, Brasil, Chile, Colômbia, Costa Rica, Curaçao, Equador, Guiana Francesa, Guadalupe, Martinica, México, Panamá, Peru, Porto Rico, St|\n");
            System.out.print("|Croix, St. Thomas, Trinidad & Tobago, Uruguai e Venezuela.|\n");
            System.out.print("\n");
            System.out.print("|Desde sua fundação, em 2007, a companhia preza por compromissos que norteiam sua operação, como qualidade, transparência e segurança do             |\n");
            System.out.print("|alimento, geração de empregos formais para jovens, apoio às comunidades onde está presente, cadeia de suprimentos sustentável e impacto             |\n");
            System.out.print("|ambiental, diversidade e inclusão e experiências inovadoras para toda a família                                                                     |\n");
            System.out.print("\n");
            System.out.print("|Atualmente, a rede conta com mais de 2.200 restaurantes em toda América Latina, entre unidades próprias e subfranqueadas, além de mais de 240       |\n");	
            System.out.print("|McCafés e cerca de 3.300 desert centers. Para isso, contamos com mais de 100 mil funcionários em toda região. No Brasil, são cerca de 1.020         |\n");
            System.out.print("|restaurantes, mais de 75 McCafés e 2.010 desert centers, empregando mais de 50 mil pessoas.                                                         |\n");
            System.out.print("\n");
            System.out.print("|Para saber mais sobre a companhia, visite o site: www.arcosdorados.com.                                                                             |\n");
            System.out.print("|____________________________________________________________________________________________________________________________________________________|\n");
            break;
        case 2:
        	System.out.print("\n\n-- Franquias  --\n\n");
        	System.out.print("|_______________________________________________________________________________________________________________________________________________|");
        	System.out.print("|Líder absoluto no segmento de alimentação rápida e com produtos de qualidade reconhecida, o McDonald’s é uma das melhores franquias para       |\n");
        	System.out.print("|investir e administrar. O modelo de negócios apoiado pelas franquias foi o fator que permitiu ao McDonald’s se tornar a rede de restaurantes de|\n");
        	System.out.print("|maior sucesso do mundo.                                                                                                                        |\n");
        	System.out.print("\n");
        	System.out.print("|Entre os motivos que fazem do McDonald’s líder em seu segmento, estão:                                                                         |\n");
        	System.out.print("|✔ Marca com reconhecimento mundial|\n");
        	System.out.print("|✔ Modelo de negócios testado e bem-sucedido                                                                                                   |\n");
        	System.out.print("|✔ Sistema que proporciona altos níveis de treinamento                                                                                         |\n");
        	System.out.print("|✔ Provedores de excelência|\n");
        	System.out.print("|✔ Oferece rede de suporte profissional                                                                                                        |\n");
        	System.out.print("|✔ Desde suas origens, desenvolveu as franquias como modelo de                                                                                 |\n");
        	System.out.print("| negócio predominante                                                                                                                          |\n");
        	System.out.print("\n");
        	System.out.print("|Quero ser um franqueado!                                                                                                                       |\n");
        	System.out.print("|Para entrar em contato com a área de Franquias da Rede, envie um e-mail para infofranquia@br.mcd.com                                           |\n");
        	System.out.print("|_______________________________________________________________________________________________________________________________________________|");
        break;
        case 3:
        	System.out.print("\n\n-- Trabalhe conosco  --\n\n");
        	System.out.print("|_____________________________________________________________________________________________________________________________________________|");
        	System.out.print("|Com mais de 50 mil funcionários no Brasil, o McDonald's é um dos maiores empregadores de jovens do país. Todos os anos, realizamos o sonho do|\n");
        	System.out.print("|primeiro emprego de muita gente! Do nosso atual quadro de funcionários, cerca de 76% têm menos de 25 anos de idade e estão em sua primeira   |\n");
        	System.out.print("|experiência                                                                                                                                  |\n");
        	System.out.print("\n");
        	System.out.print("|Somos uma das empresas que mais oferece chances de ascensão profissional. Pois, quem trabalha com a gente tem várias oportunidades de        |\n");
        	System.out.print("|desenvolvimento. Incentivamos o estudo e o aprimoramento, e temos orgulho de dizer que hoje aqui no Brasil, mais da metade dos gerentes      |\n");
        	System.out.print("|ingressaram na companhia como atendentes, o primeiro degrau na escala hierárquica da empresa. Anualmente, são investidos cerca de R$40       |\n");
        	System.out.print("|milhões em treinamento e desenvolvimento de funcionários                                                                                     |\n");
        	System.out.print("\n");
        	System.out.print("|Aqui, todos têm espaço e oportunidade, não admitimos discriminação e exigimos o mesmo respeito para todos os nossos funcionários, sem        |\n");
        	System.out.print("|qualquer distinção de sexo, idade, raça, orientação sexual, religião ou aparência física.                                                    |\n");
        	System.out.print("\n");
        	System.out.print("|Quer fazer parte da nossa equipe?                                                                                                            |\n");
        	System.out.print("|• Se você procura uma oportunidade como Atendente ou Jovem Aprendiz no restaurante McDonald’s, clique aqui para cadastrar seu currículo.     |\n");
        	System.out.print("|• Para se candidatar a outras oportunidades na área corporativa e programa de estágio do McDonald’s, por favor, clique aqui.                 |\n");
        	System.out.print("|• Agora, se você tem algum tipo de deficiência, será muito bem-vindo neste time, clicando aqui.                                              |\n");
        	System.out.print("|_____________________________________________________________________________________________________________________________________________|");
        break;
            case 4:
        	System.out.print("\n\n-- Privacidade  --\n\n");
        	System.out.print("|____________________________________________________________________________________|");
        	System.out.print("| Página fora do ar   rsrs                                                           |\n");
        	System.out.print("|____________________________________________________________________________________|");
        break;
            case 5:
            System.out.print("\n\n-- Desenvolvimento Sustentável e Compromisso  social   --\n\n");
    	    System.out.print("|_____________________________________________________________________________________________________________________________________________|");
    	    System.out.print("\n");
    	    System.out.print("|RECEITA DO FUTURO|\n");
    	    System.out.print("|Na Arcos Dorados, temos o compromisso de ser uma parte ativa da solução aos desafios que nossa sociedade enfrenta atualmente, sempre         |\n");
    	    System.out.print("|trazendo propostas inovadoras. Dessa forma, nasceu nossa estratégia socioambiental “Receita do Futuro”, promovida com o objetivo de impactar |\n");
    	    System.out.print("|positivamente os setores onde temos mais oportunidades de alcançar mudanças significativas. A \"Receita do Futuro\" está no centro dos nossos|\n");
    	    System.out.print("|valores e direciona a maneira de fazermos a diferença no meio ambiente e nas comunidades onde estamos presentes, ao lado de milhões de       |\n");
    	    System.out.print("|clientes, funcionários, fornecedores e empresas do setor.                                                                                    |\n");
    	    System.out.print("\n");
    	    System.out.print("|Pilares de atuação:                                                                                                                          |\n");
    	    System.out.print("|Como empresa líder na região, assumimos a responsabilidade de atuar em seis frentes                                                          |\n");
    	    System.out.print("|prioritárias.                                                                                                                                |\n");
    	    System.out.print("\n");
    	    System.out.print("|Emprego Jovem - Somos o maior empregador de jovens da América Latina, dando a                                                                |\n");
    	    System.out.print("|oportunidade a milhares de pessoas de conquistarem seu primeiro emprego formal.                                                              |\n");
    	    System.out.print("\n");
    	    System.out.print("|Mudanças Climáticas - Implementamos ações para minimizar os impactos ambientais                                                              |\n");
    	    System.out.print("|em toda nossa cadeia de operações.                                                                                                           |\n");
    	    System.out.print("\n");
    	    System.out.print("|Embalagem e Reciclagem - Priorizamos a utilização de materiais renováveis e                                                                  |\n");
    	    System.out.print("|buscamos promover a mudança de antigos hábitos em nossos restaurantes.                                                                       |\n");
    	    System.out.print("\n");
    	    System.out.print("|Fornecimento Sustentável - Promovemos o bem-estar animal e buscamos                                                                          |\n");
    	    System.out.print("|ingredientes produzidos com respeito ao meio-ambiente.                                                                                       |\n");
    	    System.out.print("\n");
    	    System.out.print("|Família e Bem-estar - Mantemos nosso compromisso com as famílias, evoluindo as                                                               |\n");
    	    System.out.print("|opções de nosso menu com foco em oferecer mais qualidade de vida.                                                                            |\n");
    	    System.out.print("\n");
    	    System.out.print("|Diversidade e Inclusão - Promovemos equipes diversificadas e um ambiente de                                                                  |\n");
    	    System.out.print("|trabalho que estimule o respeito e incentive a participação de todas as pessoas,                                                             |\n");
    	    System.out.print("|favorecendo a inclusão e a igualdade de oportunidades.                                                                                       |\n");
    	    System.out.print("\n");
    	    System.out.print("|Conheça mais sobre nossas ações no site: https://recetadelfuturo.com/                                                                        |\n");
    	    System.out.print("|_____________________________________________________________________________________________________________________________________________|");
        break;
            case 6:
        	System.out.print("\n\n-- PUBLICIDADE RESPONSÁVEL E CRITÉRIOS NUTRICIONAIS  --\n\n");
        	System.out.print("|____________________________________________________________________________________|");
        	System.out.print("||\\n");
        	System.out.print("||\\n");
        	System.out.print("||\\n");
        	System.out.print("||\\n");
        	System.out.print("||\\n");
        	System.out.print("||\\n");
        	System.out.print("||\\n");
        	System.out.print("||\\n");
        	System.out.print("||\\n");
        	System.out.print("||\\n");
        	System.out.print("||\\n");
        	System.out.print("||\n");
        	System.out.print("|____________________________________________________________________________________|");
        break;
            case 0:
            	System.out.println(" Voltando pro menu......");
            	System.out.println("Digite 0 para confirmar ");
            	System.out.print("\n");
        }
        }while(quemSomos!=0);
    }
    public static void familía() {
    	Scanner ler = new Scanner(System.in);
        int Família;
    	System.out.print("\n\n-- Família  --\n\n");
        System.out.print("|_______________________________________|\n");
        System.out.print("|Opção 1 -  Lançamentos                 |\n");
        System.out.print("|Opção 2-   McLanche Feliz              |\n");
        System.out.print("|Opção 3-   Méqui Box                   |\n");
        System.out.print("|Opção 4-   McLanche Feliz App          |\n");
        System.out.print("|Opção 5-   Compromissos com as Famílias|\n");
        System.out.print("|Opção 0-  retornar ao menu             |\n");
        System.out.print("|_______________________________________|\n");
    }
    public static void Promoções() {
    	Scanner ler = new Scanner(System.in);
        int Promoções;
    	System.out.print("\n\n-- Promoções  --\n\n");
        System.out.print("|_______________________________________|\n");
        System.out.print("|Opção 1 -  Promoções Ifood             |\n");
        System.out.print("|Opção 2-   Promoções App               |\n");
        System.out.print("|Opção 0-  retornar ao menu             |\n");
        System.out.print("|_______________________________________|\n");
    }
    public static void méquiPraVc() {
    	System.out.print("\n\n-- Méqui Pra Você  --\n\n");
        System.out.print("|_______________________________________|\n");
        System.out.print("|Opção 1- App do Méqui                  |\n");
        System.out.print("|Opção 2- McDelivery                    |\n");
        System.out.print("|Opção 3- Méqui no Ifood                |\n");
        System.out.print("|Opção 4- Peça e Retire                 |\n");
        System.out.print("|Opção 5- Vale Méqui                    |\n");
        System.out.print("|Opção 6- Méqui Zap                     |\n");
        System.out.print("|Opção 7- Drive-tudo                    |\n");
        System.out.print("|Opção 8- Portas Abertas                |\n");
        System.out.print("|Opção 9- Projeto Grafite               |\n");
        System.out.print("|Opção 0-  retornar ao menu             |\n");
        System.out.print("|_______________________________________|\n");
    }
    
    
    public static void McdiaFeliz() {
    	Scanner ler = new Scanner(System.in);
        int McdiaFeliz;
    	System.out.print("\n\n-- McDia Feliz --\n\n");
        System.out.print("|_______________________________________|\n");
        System.out.print("|Opção 1- Sobre a Causa                 |\n");
        System.out.print("|Opção 2- Participe                     |\n");
        System.out.print("|Opção 3- Contato                       |\n");
        System.out.print("|Opção 4- Regulamento e Restaurantes    |\n");
        System.out.print("          Participantes                 |\n");
        System.out.print("|Opção 6- Receita do Futuro             |\n");
        System.out.print("|_______________________________________|\n");
    }
    public static void Mequi1000(){
    	 Scanner ler = new Scanner(System.in);
    	 int Mequi1000;
    	 do {
    	 System.out.print("\n\n-- Méqui 1000  --\n\n");
         System.out.print("|-----------------------------------------------------|\n");
         System.out.print("| Opção 1  - SuperMc                                  |\n");
         System.out.print("| Opção 2  - McRings Cheddar Bacon                    |\n");
         System.out.print("| Opção 3  - Caldo&Freddo Chocolate                   |\n");
         System.out.print("| Opção 4  - Caldo&Freddo Morango                     |\n");
         System.out.print("| Opção 5  - Caldo&Freddo Caramelo                    |\n");
         System.out.print("| Opção 6  - McRings Bacon                            |\n");
         System.out.print("| Opção 0 - Para voltar ao menu                       |\n");
         System.out.print("|-----------------------------------------------------|\n");
         System.out.print("\n");
         Mequi1000=ler.nextInt();
         switch(Mequi1000){
         case 1:
         	  System.out.print("|                            Opção1                                      |\n");
              System.out.print("|----------------------------SuperMc-------------------------------------|\n");
              System.out.print("|                            475Kcal                                     |\n");
              System.out.print("|Um hamburguer (100% bovino), alface americana, cebola, ketchup, molho   |\n");
     	      System.out.print("|tasty, maionese, picles, queijo sabor cheddar, tomate e pão com gergelim|\n");
     	      System.out.print("|----------------------Informação do produto-----------------------------|\n");
     	      System.out.print("|Informação nutricional :                                                |\n");
     	      System.out.print("| 475kcal   ||      27g       ||      45g     ||     13g       ||        |\n");
     	      System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas   ||        |\n");
     		  System.out.print("|________________________________________________________________________|\n");
     	      System.out.println("\n");
        	  break;
         case 2:
         	  System.out.print("|                            Opção2                                      |\n");
              System.out.print("|---------------------McRings Cheddar Bacon------------------------------|\n");
              System.out.print("|                            1089 Kcal                                   |\n");
              System.out.print("|A crocante e deliciosa cebola empanada do Méqui, agora com melt         |\n");
     	      System.out.print("|sabor cheddar e bacon crispy. Não dá para resistir, experimente! Produto|\n");
     	      System.out.print("|exclusivo da loja Méqui 1000 (Avenida Paulista, 1811 –São Paulo - SP).|\n");
     	      System.out.print("|----------------------Informação do produto-----------------------------|\n");
     	      System.out.print("|Informação nutricional :                                                |\n");
     	      System.out.print("| 1089kcal  ||      70g       ||      100g    ||     15g       ||        |\n");
     	      System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas   ||        |\n");
     		  System.out.print("|________________________________________________________________________|\n");
     	      System.out.println("\n");
     	      break;
         case 3:
     
         	  System.out.print("|                            Opção3                                      |\n");
              System.out.print("|---------------------Caldo&Freddo Chocolate-----------------------------|\n");
              System.out.print("|                            495Kcal                                     |\n");
              System.out.print("|Sobremesa composta por mix de baunilha, cobertura sabor chocolate e     |\n");
     	      System.out.print("|torta de maçã.                                                          |\n");
     	      System.out.print("|----------------------Informação do produto-----------------------------|\n");
     	      System.out.print("|Informação nutricional :                                                |\n");
     	      System.out.print("| 495kcal   ||      17g       ||      79g     ||      6g       ||        |\n");
     	      System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas   ||        |\n");
     		  System.out.print("|________________________________________________________________________|\n");
     	      System.out.println("\n");
     	      break;
         case 4:
        
         	  System.out.print("|                             Opção4                                     |\n");
              System.out.print("|----------------------Caldo&Freddo Morango -----------------------------|\n");
              System.out.print("|                            478Kcal                                     |\n");
              System.out.print("|Sobremesa composta por mix de baunilha, cobertura de morango e torta    |\n");
     	      System.out.print("|de maçã. |\n");
     	      System.out.print("|----------------------Informação do produto-----------------------------|\n");
     	      System.out.print("|Informação nutricional :                                                |\n");
     	      System.out.print("| 478kcal   ||      15g       ||      81g     ||      6g       ||        |\n");
     	      System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas   ||        |\n");
     		  System.out.print("|________________________________________________________________________|\n");
     	      System.out.println("\n");
              break;
         case 5: 
        	  System.out.print("|                            Opção5                                      |\n");
              System.out.print("|----------------------Caldo&Freddo Caramelo-----------------------------|\n");
              System.out.print("|                            502Kcal                                     |\n");
              System.out.print("|Sobremesa composta por mix de baunilha, cobertura de caramelo e         |\n");
    	      System.out.print("|torta de maçã.                                                          |\n");
    	      System.out.print("|----------------------Informação do produto-----------------------------|\n");
    	      System.out.print("|Informação nutricional :                                                |\n");
    	      System.out.print("| 502kcal   ||      16g       ||      83g     ||      6g       ||        |\n");
    	      System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas   ||        |\n");
    		  System.out.print("|________________________________________________________________________|\n");
    	      System.out.println("\n");
    	      break;
         case 6: 
        	  System.out.print("|                            Opção6                                      |\n");
              System.out.print("|-------------------------McRings Bacon----------------------------------|\n");
              System.out.print("|                            959kcal                                     |\n");
              System.out.print("|Esse delicioso sanduiche é composto por um hambúrguer (100% carne       |\n");
              System.out.print("|bovina), queijo sabor emental, bacon, cebola frita empanada, maionese,  |\n");
    	      System.out.print("|ketchup e pão tipo brioche. Produto exclusivo da loja Méqui 1000        |\n");
    	      System.out.print("|(Avenida Paulista, 1811 –São Paulo -SP.)                                |\n");
    	      System.out.print("|----------------------Informação do produto-----------------------------|\n");
    	      System.out.print("|Informação nutricional :                                                |\n");
    	      System.out.print("| 959kcal   ||      54g       ||      83g     ||     32g       ||        |\n");
    	      System.out.print("| Calorias  ||  Gordura total || Carboidratos ||   Proteínas   ||        |\n");
    		  System.out.print("|________________________________________________________________________|\n");
    	      System.out.println("\n");
    	      break;
    	}
    	 }while(Mequi1000!=0); 
    }
    public static void MequiBox() {
    	
    	System.out.print("\n\n--      MequiBox   --\n\n");
        System.out.print("|-----------------------------------------------------|\n");
        System.out.print("| Opção 1  - Family Box para 2                        |\n");
        System.out.print("| Opção 2  - Family Box para 3                        |\n");
        System.out.print("| Opção 3  - Méqui Box  Clássico para 4               |\n");
        System.out.print("| Opção 4  - Méqui Box  Clássico para 3               |\n");
        System.out.print("\n");
        System.out.print("| Opção 0 - Para voltar ao menu                       |\n");
        System.out.print("|-----------------------------------------------------|\n");
        System.out.print("\n");
        System.out.print(" Opção escolhida : ");
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
                    switch(opcao) 
                    {
                    
                    case 1:lancamentos();
                    break;
                    
                    case 2:SanduíchesPremium();
                    break;
                    
                    case 3:lanchecarne();
                    break;
                    
                    case 4:tasty();
                   	break;
                   	
                    case 5:sanduichefrango();
                    break;
                    
                    case 6:Seleções();
                    break;
                    
                    case 7: McLancheFeliz();
                    break;
                    
                    case 8 : Mequi1000();
                    break;
                    
                    case 9 : acompanhamentos();
                    break;
                    
                    case 10 : sobremesas();
                    break;
                    
                    case 11 : BebidasFrias();
                    break;
                    
                    case 12 : CaféDaManha();
                    break;
                    
                    case 13 : BebidasQuentes();
                    break;
                    
                    case 14 : McOfertas();
                   	break;
                  
                    case 15 : MequiBox();
                   	break;
                    
                    } 
                    break;


                case 2:
                     lancamentos();
                     opcao=ler.nextInt();
                     break;
                case 3:
                     quemSomos();
                     opcao=ler.nextInt();
                     break;
                case 4:
                	 familía();
                	 opcao=ler.nextInt();
                	 break;
                case 5:
                	 Promoções();
                	 opcao=ler.nextInt();
                	 break;
                case 6:
                	 méquiPraVc();
                	 opcao=ler.nextInt();
                	 break;
                case 7:
                	 McdiaFeliz();
                	 opcao=ler.nextInt();
                	 break;
                case 8:
                		sair();
                		break;
                default:
                    System.out.println(" Insira um valor valido.");

            }
        } while (opcao != 8 || opcao==0);
    }
}






