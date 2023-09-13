package atividade8exercicio1;

public abstract class pessoajuridica extends Cliente {
	
		private static final String String = null;
		String CNPJ;
		
		public abstract void Cliente(String email, String nomecompleto, char sexo, int idade, float altura, float peso, String CNPJ); {
			
			float peso;
			float idade;
			int altura;
			char sexo;
			String nomecompleto;
			String email;
			
			super (email, nomecompleto, sexo, idade, altura, peso, CNPJ);
			
			this.CNPJ = CNPJ;
		}
		public String getCNPJ() {
			return CNPJ;
		}

		public void setCPF(String CNPJ) {
			this.CNPJ = CNPJ;
		}

		
		public void visualizar() {
			super.visualizar();
			System.out.println("CADASTRO PESSOA JURÍDICA, EX: XX. XXX. XXX/0001-XX " + this.CNPJ);
		}
	}
		



