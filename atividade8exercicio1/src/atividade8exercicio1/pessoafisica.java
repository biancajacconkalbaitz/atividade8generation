package atividade8exercicio1;

public abstract class pessoafisica extends Cliente {
	
		private static final String String = null;
		String CPF;
		
		public abstract void Cliente(String email, String nomecompleto, char sexo, int idade, float altura, float peso, String CPF); {
			
			float peso;
			float idade;
			int altura;
			char sexo;
			String nomecompleto;
			String email;
			
			super (email, nomecompleto, sexo, idade, altura, peso, CPF);
		
			
			this.CPF = CPF;
		}
		public String getCPF() {
			return CPF;
		}

		public void setCPF(String CPF) {
			this.CPF = CPF;
		}

		
		public void visualizar() {
			super.visualizar();
			System.out.println("CADASTRO PESSOA FÍSICA, EX: XXX.XXX.XXX-XX " + this.CPF);
		}
	}
		




