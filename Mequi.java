package Mequi;


import java.util.Scanner;

public class Mequi {

	

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int opcao1=0;
		do {
			System.out.println("Mequi");
			System.out.println("Bateu aquela #Fome de Méqui");
			System.out.println();
			System.out.print("Selecione a sua opção :");
			System.out.println();
			System.out.println("1 - Cardápio");
			System.out.println("2 - Lançamentos");
			System.out.println("3 - Quem Somos");
			System.out.println("4 - Família");
			System.out.println("5 - Promoções");
			System.out.println("6 - Mequi pra você");
			System.out.println("7 - McDia Feliz");
			opcao1 = ler.nextInt();
			System.out.println(" Opçao escolhida : " +opcao1);
			System.out.println("\n");
			}while(opcao1 ==0);
			switch (opcao1) {
						
			case 1:
		
					System.out.println("Cardápio  ");
				    System.out.println("0 - menu");	
				    System.out.println("\n");
					System.out.println("1 - Lançamentos");
					System.out.println("2 - Sanduíches Premium");
					System.out.println("3 - Sanduíches de Carne Bovina");
					System.out.println("4 - Família Tasty");
					System.out.println("5 - Sanduíches de Frango");
					System.out.println("6 - Seleções do Mequi");
					System.out.println("7 - McLanche Feliz");
					System.out.println("8 - Mequi1000");
					System.out.println("9 - Acompanhamentos");
					System.out.println("10 - Sobremesas");
					System.out.println("11 - Bebidas Frias");
					System.out.println("12 - Café da Manhã");
					System.out.println("13 - Bebidas Quentes");
					System.out.println("14 - McOfertas");
					System.out.println("15 - Méqui Box");
					int lancamentos=ler.nextInt();
					System.out.println("opção escolhida :  "+lancamentos);
					
			
					switch ( lancamentos) {
					case 1: System.out.println(" Lançamentos : ");
					System.out.println("1-McBrasil");
					System.out.println("2-McFlurry Brasil");
					System.out.println("3-McEspanha");
					System.out.println("4-McArgentina");
					System.out.println("5-McAlemanha");
					System.out.println("6-McMéxico");
					System.out.println("7-McFrança");
					System.out.println("8-McEUA");
					System.out.println("9-McCatar");
					System.out.println("10-McFlurry Espetáculo Kopenhagen Morango");
					System.out.println("11-McFlurry Espetáculo Kopenhagen Chocolate");
					System.out.println("12-McFlurry Espetáculo Kopenhagen Caramelo");
					System.out.println("13-Blister CBO");
					System.out.println("14-Blister Tasty");	
					int escolhaLancamentos=ler.nextInt();
					switch(escolhaLancamentos){
					case 1:
							System.out.println(" McBrasil ");
							System.out.println(" 1156 kcal");
							System.out.println( "Nosso grandioso e inigualável McBrasil, composto por pão tipo brioche,");
							System.out.println("um hamburguer (carne 100% bovina), molho temperado, empanado de queijo, alface, tomate e bacon.");
							break;
					case 2:
						
						    System.out.println(" McFlurry Brasil ");
						    System.out.println(" 407 kcal ");
						    System.out.println( "Para compor a Seleção do Méqui trouxemos a sobremesa que tem a cara do Brasil, composta por massa gelada de baunilha, calda de banana com");
						    System.out.println("um toque de canela, cobertura de caramelo e farofa crocante de amendoim. Você precisa experimentar!");
						    break;
			
					case 3:
						    System.out.println(" McEspanha ");
						    System.out.println(" 989 kcal ");
					     	System.out.println(" O maravilhoso McEspanha, mais um craque da Seleções do Méqui, é composto por pão tipo brioche");
						    System.out.println(" um hamburguer (carne 100% bovina), copa fatiada, molho temperado,alface e queijo sabor emental");
						    break;
					 case 4:
						    System.out.println(" McArgentina");
						    System.out.println(" 805 kcal ");
						    System.out.println(" Para compor a Seleção do Méqui trouxenos o maravilhoso McArgentina,composto por pão tipo brioche,");
						    System.out.println(" um hamburguer (carne 100% bovina),maionse sabor chimichurri,cebola fresca,alface,tomate,bacon,");
					     	System.out.println("e queijo sabor cheddar");
						    break;
					 case 5: 
						    System.out.println(" McAlemanha");
					        System.out.println(" 828 kcal ");
					        System.out.println(" O novo McAlemanha, parte da Seleções do Méqui, é composto por pão tipo brioche, um hamburger(carne 100% bovina)");
					        System.out.println(" salame com borda de pimenta, maionse,mostarda, cebola  fresta ");
					        System.out.println(" e queijo emental.");
					        break;
					    
					 case 6: 
					        System.out.println(" McMéxico");
					        System.out.println(" 629 kcal ");
					        System.out.println(" O McMexíco, parte da Seleções do Méqui, é especialmente composto por tipo brioche com batata, peito de frango ");
					        System.out.println(" temperado  empanado, a nova maionese sabor pimenta jalapeño, alface ");
					        System.out.println(" e queijo sabor cheddar. ");
					        break;
					 case 7:
					        System.out.println(" McFrança");
					        System.out.println(" 825 kcal ");
					        System.out.println(" Para compor a Seleção do Méqui, trouxemos o incrível MCFrança, composto por pão tipo briohce, um hammburger (carne 100% bovina)");
					        System.out.println(", molho sabor queijo brie, cebola crispy, tomate, bacon e queijoo sabor emental.");
					        break;
					 case 8: 
					        System.out.println(" McEua ");
					        System.out.println(" 675 kcal ");
					        System.out.println(" McEua, parte da Seleções do Méqui, é composto por pão tipo brioche com batata, peito de frango temperado emapanado");
					        System.out.println(" molho barbecue, cebola crispy, bacon, picles crinkie e queijo sabor cheddar ");
					        break;
					 case 9: 
						    System.out.println(" McCatar");
						    System.out.println(" 989 kcal ");
						    System.out.println(" O incrível McCatar é composto por pão tipo brioche, um hamburguer (carne 100% bovina), molho árabe,");
						    System.out.println(" cebola crispy, tomate e queijo sabor emental.");
						    break;
					 case 10:
						    System.out.println("McFlurry Espetáculo Kopenhagen Morango ");
						    System.out.println("613 kcal ");
						    System.out.println("A massa geladinha de baulinha, coberta de morango e o delisioso tablete Kopenhagen");
						    System.out.println("de chocolate ao leite compõe essa sobremesa e trazem o sabor único");
						    System.out.println(" que só o chocolate ao leite Kopenhagen têm ");
						    break;
					 case 11:
						    System.out.println("McFlurry Espetáculo Kopenhagen Chocolate");
						    System.out.println("633 kcal ");
						    System.out.println("A massa geladinha de baulinha, coberta de chocolate e o delisioso tablete Kopenhagen");
						    System.out.println("de chocolate ao leite compõe essa sobremesa e trazem o sabor único");
						    System.out.println(" que só o chocolate ao leite Kopenhagen têm ");
						    break;
					
					}
					
					
					
					
					}
					break;
					
				case 2:	
					System.out.println(" Lançamentos : ");
					System.out.println("1-McBrasil");
					System.out.println("2-McFlurry Brasil");
					System.out.println("3-McEspanha");
					System.out.println("4-McArgentina");
					System.out.println("5-McAlemanha");
					System.out.println("6-McMéxico");
					System.out.println("7-McFrança");
					System.out.println("8-McEUA");
					System.out.println("9-McCatar");
					System.out.println("10-McFlurry Espetáculo Kopenhagen Morango");
					System.out.println("11-McFlurry Espetáculo Kopenhagen Chocolate");
					System.out.println("12-McFlurry Espetáculo Kopenhagen Caramelo");
					System.out.println("13-Blister CBO");
					System.out.println("14-Blister Tasty");
					break;
				case 3:
						System.out.println(" Quem Somos : ");
						System.out.println("\n");
						System.out.println("1- institucional");
						System.out.println("2- franquias ");
						System.out.println("3- Trabalhe Conosco");
						System.out.println("4- Privacidade");
						System.out.println("5- Desenvolvimento sustentável e compromisso social");
						System.out.println("6- Publicidade social ");
						break;
				case 4:
						System.out.println(" Família : ");
						System.out.println("\n");
						System.out.println("1- Lançamentos");
						System.out.println("2- McLancheFeliz");
						System.out.println("3- Méqui-box");
						System.out.println("4- Méqui Lanche Feliz app");
						System.out.println("5- Compromissos com a Famílias");
						break;
				case 5:
						System.out.println(" Promoções : ");
						System.out.println("\n");
						System.out.println("1-  Promoções Ifood");
						System.out.println("2-  Promoções App");
						break;
				case 6:
						System.out.println(" Méqui pra você : ");
						System.out.println("\n");
						System.out.println(" 1- App do Méqui ");
						System.out.println(" 2- McDelivery ");
						System.out.println(" 3- Méqui no Ifood ");
						System.out.println(" 4- Peça e retire  ");
						System.out.println(" 5- Vale Méqui ");
						System.out.println(" 6- Méqui Zap ");
						System.out.println(" 7- Drive-Tudo ");
						System.out.println(" 8- Portas Abertas ");
						System.out.println(" 9- Projeto Grafite");
						break;
			
				case 7: 
						System.out.println(" Mc Dia Feliz ");
						System.out.println(" \n");
						System.out.println("1-  Sobre a Causa ");
						System.out.println("2-  Participe  ");
						System.out.println("3-  Contato");
						System.out.println("4-  Regulamentos e Restaurantes Participantes  ");
						System.out.println("5- Receita do Futuro ");
					    break;
					    default: System.out.println(" Favor escolher um valor válido");
					   
						
			 }	
		            
					 	
					 	ler.close();
				
					
					
					
		}
	}


		
		
			
			  
	

