package McDonalds;



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
    public static void sair() {
    	System.out.println("|____________________________________|\n");
    	System.out.println("| Obrigado por usar o App do Méqui   |\n");
    	System.out.println("|       Pedrinho braço curto 10/22   |\n");
    	System.out.println("|          De nada Jailson           |\n");
    	System.out.println("|____________________________________|\n");
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
                    
                    case 3:
                    	break;
                    case 4:
                    	break;
                    case 5:
                    	break;
                    case 6:
                    	break;
                    case 7:
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