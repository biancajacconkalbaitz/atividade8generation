package atividade8exercicio1;

public class TesteCliente {
	
		public static void main(String[] args){
		Cliente cliente1 = new Cliente();


		Cliente clientenovo = new Cliente();
		clientenovo.setEmail("biancakalbaitz@gmail.com");
		clientenovo.setNomeCompleto("Bianca Jaccon Kalbaitz");
		clientenovo.setSexo('F');
		clientenovo.setIdade(26);
		clientenovo.setAltura(147);
		clientenovo.setPeso(58);
		


		clientenovo.visualizar();
		System.out.println();
		clientenovo.visualizar();
		}
		}


