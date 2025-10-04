import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		SimpleDateFormat formatoNovo = new SimpleDateFormat("dd/MM/yyyy");
		//ARRAYLIST
		ArrayList<VeiculoAquatico> listaVeiculoAquatico = new ArrayList<>();
		ArrayList<VeiculoTerrestre> listaVeiculoTerrestre = new ArrayList<>();
		
		//SCANNER
		Scanner ler = new Scanner(System.in);
		Scanner entrada = new Scanner(System.in);
	    int opcao, i;
	    
	    try {
	    //INSERINDO CARROS
	    Carro carro1 = new Carro();
	    
	    carro1.setMarca("BMW");
	    carro1.setProprietario("dono unico");
	    carro1.setVelocidadeTerrestre(100);
	    carro1.setCodigoVeiculo(1);
	    SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy"); 
	    Date data1 = formato1.parse("23/11/2015");
	    carro1.setFabricacao(data1);
	    carro1.setPreco(11000);
	    carro1.setPeso(1000);
		
        Carro carro2 = new Carro();
	    
	    carro2.setMarca("Toyota");
	    carro2.setProprietario("duas pessoas");
	    carro2.setVelocidadeTerrestre(110);
	    carro2.setCodigoVeiculo(2);
	    SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy"); 
	    Date data2 = formato2.parse("12/10/2010");
	    carro2.setFabricacao(data2);
	    carro2.setPreco(13400);
	    carro2.setPeso(1100);
	    
        Carro carro3 = new Carro();
	    
	    carro3.setMarca("Chevrolet");
	    carro3.setProprietario("tres pessoas");
	    carro3.setVelocidadeTerrestre(120);
	    carro3.setCodigoVeiculo(3);
	    SimpleDateFormat formato3 = new SimpleDateFormat("dd/MM/yyyy"); 
	    Date data3 = formato3.parse("11/08/2006");
	    carro3.setFabricacao(data3);
	    carro3.setPreco(23000);
	    carro3.setPeso(1500);
	    
        Carro carro4 = new Carro();
	    
	    carro4.setMarca("Volkswagen");
	    carro4.setProprietario("dono unico");
	    carro4.setVelocidadeTerrestre(140);
	    carro4.setCodigoVeiculo(4);
	    SimpleDateFormat formato4 = new SimpleDateFormat("dd/MM/yyyy"); 
	    Date data4 = formato4.parse("24/02/2004");
	    carro4.setFabricacao(data4);
	    carro4.setPreco(24200);
	    carro4.setPeso(2000);
	    
        Carro carro5 = new Carro();
	    
	    carro5.setMarca("Ferrari");
	    carro5.setProprietario("duas pessoas");
	    carro5.setVelocidadeTerrestre(150);
	    carro5.setCodigoVeiculo(5);
	    SimpleDateFormat formato5 = new SimpleDateFormat("dd/MM/yyyy"); 
	    Date data5 = formato5.parse("01/03/2000");
	    carro5.setFabricacao(data5);
	    carro5.setPreco(21700);
	    carro5.setPeso(1300);
	    
	    //INSERINDO MOTOS
        Moto moto1 = new Moto();
	    
	    moto1.setMarca("Honda");
	    moto1.setProprietario("dono unico");
	    moto1.setVelocidadeTerrestre(200);
	    moto1.setCodigoVeiculo(6);
	    SimpleDateFormat formato6 = new SimpleDateFormat("dd/MM/yyyy"); 
	    Date data6 = formato6.parse("13/09/1999");
	    moto1.setFabricacao(data6);
	    moto1.setPreco(13780);
	    moto1.setPeso(800);
	    
        Moto moto2 = new Moto();
	    
	    moto2.setMarca("Yamaha");
	    moto2.setProprietario("duas pessoas");
	    moto2.setVelocidadeTerrestre(170);
	    moto2.setCodigoVeiculo(7);
	    SimpleDateFormat formato7 = new SimpleDateFormat("dd/MM/yyyy"); 
	    Date data7 = formato7.parse("30/01/2001");
	    moto2.setFabricacao(data7);
	    moto2.setPreco(24700);
	    moto2.setPeso(1200);
	    
        Moto moto3 = new Moto();
	    
	    moto3.setMarca("Suzuki");
	    moto3.setProprietario("tres pessoas");
	    moto3.setVelocidadeTerrestre(225);
	    moto3.setCodigoVeiculo(8);
	    SimpleDateFormat formato8 = new SimpleDateFormat("dd/MM/yyyy"); 
	    Date data8 = formato8.parse("19/09/1998");
	    moto3.setFabricacao(data8);
	    moto3.setPreco(21000);
	    moto3.setPeso(980);
	    
        Moto moto4 = new Moto();
	    
	    moto4.setMarca("Kawasaki");
	    moto4.setProprietario("dono unico");
	    moto4.setVelocidadeTerrestre(170);
	    moto4.setCodigoVeiculo(9);
	    SimpleDateFormat formato9 = new SimpleDateFormat("dd/MM/yyyy"); 
	    Date data9 = formato9.parse("07/08/2008");
	    moto4.setFabricacao(data9);
	    moto4.setPreco(17800);
	    moto4.setPeso(1250);
	    
        Moto moto5 = new Moto();
	    
	    moto5.setMarca("Dafra");
	    moto5.setProprietario("duas pessoas");
	    moto5.setVelocidadeTerrestre(190);
	    moto5.setCodigoVeiculo(10);
	    SimpleDateFormat formato10 = new SimpleDateFormat("dd/MM/yyyy"); 
	    Date data10 = formato10.parse("20/12/2020");
	    moto5.setFabricacao(data10);
	    moto5.setPreco(18900);
	    moto5.setPeso(1300);
	    
	    //INSERIR JETSKIS
	    Jetski jet1 = new Jetski();
	    
	    jet1.setVelocidadeNautica(100);
	    jet1.setCodigoVeiculo(11);
	    jet1.setMarcaJet("Kawasaki");
	    jet1.setProprietarioJet("dono unico");
	    SimpleDateFormat formato11 = new SimpleDateFormat("dd/MM/yyyy"); 
	    Date data11 = formato11.parse("29/10/2002");
	    jet1.setFabricacao(data11);
	    jet1.setPreco(35000);
	    jet1.setPeso(2400);
	    
        Jetski jet2 = new Jetski();
	    
	    jet2.setVelocidadeNautica(270);
	    jet2.setCodigoVeiculo(12);
	    jet2.setMarcaJet("Yamaha");
	    jet2.setProprietarioJet("duas pessoas");
	    SimpleDateFormat formato12 = new SimpleDateFormat("dd/MM/yyyy"); 
	    Date data12 = formato12.parse("17/09/2002");
	    jet2.setFabricacao(data12);
	    jet2.setPreco(42000);
	    jet2.setPeso(3100);
	    
        Jetski jet3 = new Jetski();
	    
	    jet3.setVelocidadeNautica(160);
	    jet3.setCodigoVeiculo(13);
	    jet3.setMarcaJet("Belasi");
	    jet3.setProprietarioJet("duas pessoas");
	    SimpleDateFormat formato13 = new SimpleDateFormat("dd/MM/yyyy"); 
	    Date data13 = formato13.parse("10/11/2006");
	    jet3.setFabricacao(data13);
	    jet3.setPreco(36900);
	    jet3.setPeso(1340);
	    
        Jetski jet4 = new Jetski();
	    
	    jet4.setVelocidadeNautica(230);
	    jet4.setCodigoVeiculo(14);
	    jet4.setMarcaJet("Sea-Doo");
	    jet4.setProprietarioJet("tres pessoas");
	    SimpleDateFormat formato14 = new SimpleDateFormat("dd/MM/yyyy"); 
	    Date data14 = formato14.parse("12/07/2009");
	    jet4.setFabricacao(data14);
	    jet4.setPreco(55000);
	    jet4.setPeso(1300);
	    
        Jetski jet5 = new Jetski();
	    
	    jet5.setVelocidadeNautica(240);
	    jet5.setCodigoVeiculo(15);
	    jet5.setMarcaJet("AQUALEO");
	    jet5.setProprietarioJet("casal");
	    SimpleDateFormat formato15 = new SimpleDateFormat("dd/MM/yyyy"); 
	    Date data15 = formato15.parse("28/04/1999");
	    jet5.setFabricacao(data15);
	    jet5.setPreco(33400);
	    jet5.setPeso(2500);
	    
	    //INSERINDO LANCHAS
	    Lancha lancha1 = new Lancha();
	    
	    lancha1.setVelocidadeNautica(340);
	    lancha1.setCodigoVeiculo(16);
	    lancha1.setMarcaLancha("Fibrafort");
	    lancha1.setProprietarioLancha("dono unico");
	    SimpleDateFormat formato16 = new SimpleDateFormat("dd/MM/yyyy"); 
	    Date data16 = formato16.parse("14/08/2008");
	    lancha1.setFabricacao(data16);
	    lancha1.setPreco(125000);
	    lancha1.setPeso(12000);
	    
        Lancha lancha2 = new Lancha();
	    
	    lancha2.setVelocidadeNautica(420);
	    lancha2.setCodigoVeiculo(17);
	    lancha2.setMarcaLancha("Sessa Marine");
	    lancha2.setProprietarioLancha("dono unico");
	    SimpleDateFormat formato17 = new SimpleDateFormat("dd/MM/yyyy"); 
	    Date data17 = formato17.parse("17/09/2002");
	    lancha2.setFabricacao(data17);
	    lancha2.setPreco(270000);
	    lancha2.setPeso(15000);
	    
        Lancha lancha3 = new Lancha();
	    
	    lancha3.setVelocidadeNautica(370);
	    lancha3.setCodigoVeiculo(18);
	    lancha3.setMarcaLancha("Azimut Yachts");
	    lancha3.setProprietarioLancha("casal");
	    SimpleDateFormat formato18 = new SimpleDateFormat("dd/MM/yyyy"); 
	    Date data18 = formato18.parse("04/05/2006");
	    lancha3.setFabricacao(data18);
	    lancha3.setPreco(280000);
	    lancha3.setPeso(20000);
	    
        Lancha lancha4 = new Lancha();
	    
	    lancha4.setVelocidadeNautica(290);
	    lancha4.setCodigoVeiculo(19);
	    lancha4.setMarcaLancha("Focker");
	    lancha4.setProprietarioLancha("duas pessoas");
	    SimpleDateFormat formato19 = new SimpleDateFormat("dd/MM/yyyy"); 
	    Date data19 = formato19.parse("02/07/1998");
	    lancha4.setFabricacao(data19);
	    lancha4.setPreco(127000);
	    lancha4.setPeso(17000);
	    
        Lancha lancha5 = new Lancha();
	    
	    lancha5.setVelocidadeNautica(320);
	    lancha5.setCodigoVeiculo(20);
	    lancha5.setMarcaLancha("Phatom");
	    lancha5.setProprietarioLancha("dono unico");
	    SimpleDateFormat formato20 = new SimpleDateFormat("dd/MM/yyyy"); 
	    Date data20 = formato20.parse("23/06/2000");
	    lancha5.setFabricacao(data20);
	    lancha5.setPreco(300000);
	    lancha5.setPeso(200000);
	    
	    
	    //ADICIONANDO NA LISTA DE TERRESTRES
	    listaVeiculoTerrestre.add(carro1);
	    listaVeiculoTerrestre.add(carro2);
	    listaVeiculoTerrestre.add(carro3);
	    listaVeiculoTerrestre.add(carro4);
	    listaVeiculoTerrestre.add(carro5);
	    
	    listaVeiculoTerrestre.add(moto1);
	    listaVeiculoTerrestre.add(moto2);
	    listaVeiculoTerrestre.add(moto3);
	    listaVeiculoTerrestre.add(moto4);
	    listaVeiculoTerrestre.add(moto5);
	    
	    //ADICIONANDO NA LISTA 
	    listaVeiculoAquatico.add(jet1);
	    listaVeiculoAquatico.add(jet2);
	    listaVeiculoAquatico.add(jet3);
	    listaVeiculoAquatico.add(jet4);
	    listaVeiculoAquatico.add(jet5);
	    
	    listaVeiculoAquatico.add(lancha1);
	    listaVeiculoAquatico.add(lancha2);
	    listaVeiculoAquatico.add(lancha3);
	    listaVeiculoAquatico.add(lancha4);
	    listaVeiculoAquatico.add(lancha5);
	    } catch (ParseException ex) {
			ex.printStackTrace();
		}  
	    
	   
	    
	    do {
		System.out.println("======== MENU ========");
		System.out.println("1 - Listagem de Carros em estoque");
		System.out.println("2 - Listagem de Motos em estoque");
		System.out.println("3 - Listagem de Jetski em estoque");
		System.out.println("4 - Listagem de Lancha em estoque");
		System.out.println("5 - Edição de motos");
		System.out.println("6 - Edição de lancha");
		System.out.println("7 - Cadastro de motos");
		System.out.println("8 - Cadastro de Lancha");
		System.out.println("9 - Remoção de moto");
		System.out.println("10 - Remoção de Lancha");
		System.out.println("11 - Listagem de veiculos Terrestre");
		System.out.println("12 - Listagem de Veiculos Aquaticos");
		System.out.println("13 - Sair");
		System.out.println(" ");
		System.out.println("Escolha uma opção: ");
		opcao = ler.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println(" ");
			System.out.println("========================= CARROS =============================");
			System.out.println(" ");
				for (VeiculoTerrestre veiculoTerrestreCarroOBJ : listaVeiculoTerrestre) {
					  if(veiculoTerrestreCarroOBJ instanceof Carro) {
						System.out.println("---------------------------------------------------------------------------------");
						System.out.println("Marca: " + ((Carro) veiculoTerrestreCarroOBJ).getMarca());
						System.out.println("Proprietario: " + ((Carro) veiculoTerrestreCarroOBJ).getProprietario());
						System.out.println("Código do carro: " + ((Carro) veiculoTerrestreCarroOBJ).getCodigoVeiculo());
						System.out.println("Data de fabricação: " + formatoNovo.format(veiculoTerrestreCarroOBJ.getFabricacao()));
						System.out.println("Peso: " + ((Carro) veiculoTerrestreCarroOBJ).getPeso());
						System.out.println("Velocidade do carro: " + ((Carro) veiculoTerrestreCarroOBJ).getVelocidadeTerrestre());
						System.out.println("Preço: " + ((Carro) veiculoTerrestreCarroOBJ).getPreco());
						System.out.println(" ");
					  }
					}
		break;
		case 2:
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println(" ");
			System.out.println("========================= MOTOS =============================");
			System.out.println(" ");
			for (VeiculoTerrestre veiculoTerrestreMotoOBJ : listaVeiculoTerrestre) {
				  if(veiculoTerrestreMotoOBJ instanceof Moto) {
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println("Marca: " + ((Moto) veiculoTerrestreMotoOBJ).getMarca());
					System.out.println("Proprietario: " + ((Moto) veiculoTerrestreMotoOBJ).getProprietario());
					System.out.println("Código da moto: " + ((Moto) veiculoTerrestreMotoOBJ).getCodigoVeiculo());
					System.out.println("Data de fabricação: " + formatoNovo.format(veiculoTerrestreMotoOBJ.getFabricacao()));
					System.out.println("Peso: " + ((Moto) veiculoTerrestreMotoOBJ).getPeso());
					System.out.println("Velocidade da moto: " + ((Moto) veiculoTerrestreMotoOBJ).getVelocidadeTerrestre());
					System.out.println("Preço: " + ((Moto) veiculoTerrestreMotoOBJ).getPreco());
					System.out.println(" ");
				  }
				}
		break;
		case 3:
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println(" ");
			System.out.println("========================= JETSKI =============================");
			System.out.println(" ");
			for (VeiculoAquatico veiculoAquaticoJetskiOBJ : listaVeiculoAquatico) {
				  if(veiculoAquaticoJetskiOBJ instanceof Jetski) {
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println("Marca: " + ((Jetski) veiculoAquaticoJetskiOBJ).getMarcaJet());
					System.out.println("Proprietario: " + ((Jetski) veiculoAquaticoJetskiOBJ).getProprietarioJet());
					System.out.println("Código do jetski: " + ((Jetski) veiculoAquaticoJetskiOBJ).getCodigoVeiculo());
					System.out.println("Data de fabricação: " + formatoNovo.format(veiculoAquaticoJetskiOBJ.getFabricacao()));
					System.out.println("Peso: " + ((Jetski) veiculoAquaticoJetskiOBJ).getPeso());
					System.out.println("Velocidade do jetski: " + ((Jetski) veiculoAquaticoJetskiOBJ).getVelocidadeNautica());
					System.out.println("Preço: " + ((Jetski) veiculoAquaticoJetskiOBJ).getPreco());
					System.out.println(" ");
				  }
				}
		break;
		case 4:
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println(" ");
			System.out.println("========================= LANCHA =============================");
			System.out.println(" ");
			for (VeiculoAquatico veiculoAquaticoLanchaOBJ : listaVeiculoAquatico) {
				  if(veiculoAquaticoLanchaOBJ instanceof Lancha) {
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println("Marca: " + ((Lancha) veiculoAquaticoLanchaOBJ).getMarcaLancha());
					System.out.println("Proprietario: " + ((Lancha) veiculoAquaticoLanchaOBJ).getProprietarioLancha());
					System.out.println("Código da lancha: " + ((Lancha) veiculoAquaticoLanchaOBJ).getCodigoVeiculo());
					System.out.println("Data de fabricação: " + formatoNovo.format(veiculoAquaticoLanchaOBJ.getFabricacao()));
					System.out.println("Peso: " + ((Lancha) veiculoAquaticoLanchaOBJ).getPeso());
					System.out.println("Velocidade da lancha: " + ((Lancha) veiculoAquaticoLanchaOBJ).getVelocidadeNautica());
					System.out.println("Preço: " + ((Lancha) veiculoAquaticoLanchaOBJ).getPreco());
					System.out.println(" ");
				  }
				}
		break;
		case 5:
			System.out.println("=================== EDIÇÃO DE MOTO ====================");
			System.out.println(" ");
			System.out.println("Informe o código da moto que deseja editar: ");
			long codigoAlvo = entrada.nextLong();
			for(i = 0; i < listaVeiculoTerrestre.size(); i++) {
				if(listaVeiculoTerrestre.get(i).getCodigoVeiculo() == codigoAlvo) {
				
					try{
						
						Moto motoNova = (Moto) listaVeiculoTerrestre.get(i);
							
						System.out.println("Insira a marca da moto {insira 0 para não alterar}: ");
						String marca = entrada.next();
						if(marca.equals("0")) {
    					
						} else {
							motoNova.setMarca(marca);
						}
						
						System.out.println("Insira proprietario da moto {insira 0 para não alterar}: ");
						String proprietario = entrada.next();
						if(proprietario.equals("0")) {
							
						} else {
							motoNova.setProprietario(proprietario);
						}
						
						System.out.println("Insira o código da moto {insira 0 para não alterar}: ");
						long codigoVeiculo = entrada.nextLong();
						if(codigoVeiculo == 0) {
							   	   
						} else {
							 motoNova.setCodigoVeiculo(codigoVeiculo);
					    }
						
						System.out.println("Insira a data de fabricação da moto {insira 0 para não alterar}: ");
						String data = entrada.next();
						if(data.equals("0")) {
							  	   
					    } else {
						    motoNova.setFabricacao(formatoNovo.parse(data));
						}
						   
						System.out.println("Insira o peso da moto {insira 0 para não alterar}: ");
						double peso = entrada.nextDouble();
						if(peso == 0) {
							 	  
					    } else {
						    motoNova.setPeso(peso);
						}
						   
						System.out.println("Insira a velocidade da moto {insira 0 para não alterar}: ");
						int velocidadeTerrestre = entrada.nextInt();
						if(velocidadeTerrestre == 0) {
							    
						} else {
							motoNova.setVelocidadeTerrestre(velocidadeTerrestre);
						}
						
						System.out.println("Insira o preço da moto {insira 0 para não alterar}: ");
						double preco = entrada.nextDouble();
						if(preco == 0) {
							   
					    System.out.println("EDIÇÃO REALIZADA!!!");
					    System.out.println(" ");
							   
						} else {
							 motoNova.setPreco(preco);
					    System.out.println("EDIÇÃO REALIZADA!!!");
					    System.out.println(" ");
						}
						break;
					
					} catch (ParseException ex) {
						ex.printStackTrace();
					}
				}				
			}

		break;
		case 6:
			System.out.println("=================== EDIÇÃO DE LANCHA ====================");
			System.out.println(" ");
			System.out.println("Informe o código da lancha que deseja editar: ");
			long codigoAlvoLancha = entrada.nextLong();
			for(i = 0; i < listaVeiculoAquatico.size(); i++) {
				if(listaVeiculoAquatico.get(i).getCodigoVeiculo() == codigoAlvoLancha) {
				
					try{
						
						Lancha lanchaNova = (Lancha) listaVeiculoAquatico.get(i);
						
						System.out.println("Insira a marca da lancha {insira 0 para não alterar}: ");
						String marcaLancha = entrada.next();
						if(marcaLancha.equals("0")) {
    					
						} else {
							lanchaNova.setMarcaLancha(marcaLancha);
						}
						
						System.out.println("Insira proprietario da lancha {insira 0 para não alterar}: ");
						String proprietarioLancha = entrada.next();
						if(proprietarioLancha.equals("0")) {
							
						} else {
							lanchaNova.setProprietarioLancha(proprietarioLancha);
						}
						
						System.out.println("Insira o código da lancha {insira 0 para não alterar}: ");
						long codigoVeiculo = entrada.nextLong();
						if(codigoVeiculo == 0) {
							   	   
						} else {
							lanchaNova.setCodigoVeiculo(codigoVeiculo);
					    }
						
						System.out.println("Insira a data de fabricação da lancha {insira 0 para não alterar}: ");
						String data = entrada.next();
						if(data.equals("0")) {
							  	   
					    } else {
					    	lanchaNova.setFabricacao(formatoNovo.parse(data));
						}
						   
						System.out.println("Insira o peso da lancha {insira 0 para não alterar}: ");
						double peso = entrada.nextDouble();
						if(peso == 0) {
							 	  
					    } else {
					    	lanchaNova.setPeso(peso);
						}
						   
						System.out.println("Insira a velocidade da lancha {insira 0 para não alterar}: ");
						int velocidadeNautica = entrada.nextInt();
						if(velocidadeNautica == 0) {
							    
						} else {
							lanchaNova.setVelocidadeNautica(velocidadeNautica);
						}
						
						System.out.println("Insira o preço da lancha {insira 0 para não alterar}: ");
						double preco = entrada.nextDouble();
						if(preco == 0) {
							   
					    System.out.println("EDIÇÃO REALIZADA!!!");
					    System.out.println(" ");
							   
						} else {
							lanchaNova.setPreco(preco);
					    System.out.println("EDIÇÃO REALIZADA!!!");
					    System.out.println(" ");
						}
						
						
						break;
					
					} catch (ParseException ex) {
						ex.printStackTrace();
					}
				}				
			}
		break;
		case 7:
			System.out.println("=================== CADASTRO MOTO ====================");
			try {
				Moto novaMoto = new Moto();
				
				System.out.println("Insira a marca da moto: ");
				novaMoto.setMarca(entrada.nextLine());
				entrada = new Scanner(System.in);
				System.out.println("Insira proprietario da moto: ");
				novaMoto.setProprietario(entrada.nextLine());
				entrada = new Scanner(System.in);
				System.out.println("Insira o código da moto: ");
				novaMoto.setCodigoVeiculo(entrada.nextLong());
				entrada = new Scanner(System.in);
				System.out.println("Insira a data de fabricação da moto: ");
				String data = entrada.nextLine();
				
				novaMoto.setFabricacao(formatoNovo.parse(data));
				
				entrada = new Scanner(System.in);
				System.out.println("Insira o peso da moto: ");
				novaMoto.setPeso(entrada.nextDouble());
				entrada = new Scanner(System.in);
				System.out.println("Insira a velocidade da moto: ");
				novaMoto.setVelocidadeTerrestre(entrada.nextInt());
				entrada = new Scanner(System.in);
				System.out.println("Insira o preço da moto: ");
				novaMoto.setPreco(entrada.nextDouble());
				entrada = new Scanner(System.in);
				
				listaVeiculoTerrestre.add(novaMoto);
				System.out.println(" ");
			} catch (ParseException ex) {
				ex.printStackTrace();
			}
			break;
		case 8:
			System.out.println("=================== CADASTRO LANCHA ====================");
			try {
				Lancha novaLancha = new Lancha();
				
				System.out.println("Insira a marca da Lancha: ");
				novaLancha.setMarcaLancha(entrada.nextLine());
				entrada = new Scanner(System.in);
				System.out.println("Insira proprietario da Lancha: ");
				novaLancha.setProprietarioLancha(entrada.nextLine());
				entrada = new Scanner(System.in);
				System.out.println("Insira o código da Lancha: ");
				novaLancha.setCodigoVeiculo(entrada.nextLong());
				entrada = new Scanner(System.in);
				System.out.println("Insira a data de fabricação da Lancha: ");
				String data = entrada.nextLine();
				
				novaLancha.setFabricacao(formatoNovo.parse(data));
				
				entrada = new Scanner(System.in);
				System.out.println("Insira o peso da Lancha: ");
				novaLancha.setPeso(entrada.nextDouble());
				entrada = new Scanner(System.in);
				System.out.println("Insira a velocidade da Lancha: ");
				novaLancha.setVelocidadeNautica(entrada.nextInt());
				entrada = new Scanner(System.in);
				System.out.println("Insira o preço da Lancha: ");
				novaLancha.setPreco(entrada.nextDouble());
				entrada = new Scanner(System.in);
				
				listaVeiculoAquatico.add(novaLancha);
				System.out.println(" ");
			} catch (ParseException ex) {
				ex.printStackTrace();
			}
		break;
		case 9:
			System.out.println("=================== REMOVENDO MOTO ====================");
			System.out.println(" ");
			System.out.println("Insira o código da moto: ");
			long removeCodigoMoto = entrada.nextLong();
			for (i = 0; i < listaVeiculoTerrestre.size(); i++) {
				if(listaVeiculoTerrestre.get(i).getCodigoVeiculo() == removeCodigoMoto) {
					listaVeiculoTerrestre.remove(listaVeiculoTerrestre.get(i));
				}
			}
		break;
		case 10:
			System.out.println("=================== REMOVENDO LANCHA ====================");
			System.out.println(" ");
			System.out.println("Insira o código da lancha: ");
			long removeCodigoLancha = entrada.nextLong();
			for (i = 0; i < listaVeiculoAquatico.size(); i++) {
				if(listaVeiculoAquatico.get(i).getCodigoVeiculo() == removeCodigoLancha) {
					listaVeiculoAquatico.remove(listaVeiculoAquatico.get(i));
				}
			}
		case 11:
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println(" ");
			System.out.println("========================= CARROS =============================");
			System.out.println(" ");
				for (VeiculoTerrestre veiculoTerrestreCarroOBJ : listaVeiculoTerrestre) {
					  if(veiculoTerrestreCarroOBJ instanceof Carro) {
						System.out.println("---------------------------------------------------------------------------------");
						System.out.println("Marca: " + ((Carro) veiculoTerrestreCarroOBJ).getMarca());
						System.out.println("Proprietario: " + ((Carro) veiculoTerrestreCarroOBJ).getProprietario());
						System.out.println("Código do carro: " + ((Carro) veiculoTerrestreCarroOBJ).getCodigoVeiculo());
						System.out.println("Data de fabricação: " + formatoNovo.format(veiculoTerrestreCarroOBJ.getFabricacao()));
						System.out.println("Peso: " + ((Carro) veiculoTerrestreCarroOBJ).getPeso());
						System.out.println("Velocidade do carro: " + ((Carro) veiculoTerrestreCarroOBJ).getVelocidadeTerrestre());
						System.out.println("Preço: " + ((Carro) veiculoTerrestreCarroOBJ).getPreco());
						System.out.println(" ");
					  }
					}
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println(" ");
			System.out.println("========================= MOTOS =============================");
			System.out.println(" ");
			for (VeiculoTerrestre veiculoTerrestreMotoOBJ : listaVeiculoTerrestre) {
				  if(veiculoTerrestreMotoOBJ instanceof Moto) {
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println("Marca: " + ((Moto) veiculoTerrestreMotoOBJ).getMarca());
					System.out.println("Proprietario: " + ((Moto) veiculoTerrestreMotoOBJ).getProprietario());
					System.out.println("Código da moto: " + ((Moto) veiculoTerrestreMotoOBJ).getCodigoVeiculo());
					System.out.println("Data de fabricação: " + formatoNovo.format(veiculoTerrestreMotoOBJ.getFabricacao()));
					System.out.println("Peso: " + ((Moto) veiculoTerrestreMotoOBJ).getPeso());
					System.out.println("Velocidade da moto: " + ((Moto) veiculoTerrestreMotoOBJ).getVelocidadeTerrestre());
					System.out.println("Preço: " + ((Moto) veiculoTerrestreMotoOBJ).getPreco());
					System.out.println(" ");
				  }
				}
	   break;
		case 12:
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println(" ");
			System.out.println("========================= JETSKI =============================");
			System.out.println(" ");
			for (VeiculoAquatico veiculoAquaticoJetskiOBJ : listaVeiculoAquatico) {
				  if(veiculoAquaticoJetskiOBJ instanceof Jetski) {
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println("Marca: " + ((Jetski) veiculoAquaticoJetskiOBJ).getMarcaJet());
					System.out.println("Proprietario: " + ((Jetski) veiculoAquaticoJetskiOBJ).getProprietarioJet());
					System.out.println("Código do jetski: " + ((Jetski) veiculoAquaticoJetskiOBJ).getCodigoVeiculo());
					System.out.println("Data de fabricação: " + formatoNovo.format(veiculoAquaticoJetskiOBJ.getFabricacao()));
					System.out.println("Peso: " + ((Jetski) veiculoAquaticoJetskiOBJ).getPeso());
					System.out.println("Velocidade do jetski: " + ((Jetski) veiculoAquaticoJetskiOBJ).getVelocidadeNautica());
					System.out.println("Preço: " + ((Jetski) veiculoAquaticoJetskiOBJ).getPreco());
					System.out.println(" ");
				  }
				}
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println(" ");
			System.out.println("========================= LANCHA =============================");
			System.out.println(" ");
			for (VeiculoAquatico veiculoAquaticoLanchaOBJ : listaVeiculoAquatico) {
				  if(veiculoAquaticoLanchaOBJ instanceof Lancha) {
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println("Marca: " + ((Lancha) veiculoAquaticoLanchaOBJ).getMarcaLancha());
					System.out.println("Proprietario: " + ((Lancha) veiculoAquaticoLanchaOBJ).getProprietarioLancha());
					System.out.println("Código da lancha: " + ((Lancha) veiculoAquaticoLanchaOBJ).getCodigoVeiculo());
					System.out.println("Data de fabricação: " + formatoNovo.format(veiculoAquaticoLanchaOBJ.getFabricacao()));
					System.out.println("Peso: " + ((Lancha) veiculoAquaticoLanchaOBJ).getPeso());
					System.out.println("Velocidade da lancha: " + ((Lancha) veiculoAquaticoLanchaOBJ).getVelocidadeNautica());
					System.out.println("Preço: " + ((Lancha) veiculoAquaticoLanchaOBJ).getPreco());
					System.out.println(" ");
				  }
				}
			break;
	  	 default:
	            System.out.println("SAIU");
	            break; 
				}
			
		opcao++;
	    }while (opcao <= 13);
	}

}
