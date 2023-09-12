package atividade8exercicio1;

public class Cliente {
	
	    private String email;
	    private String nomecompleto;
	    private char sexo;
	    private int idade;
	    private float altura;
	    private float peso;
	    

	    public Cliente(String email, String nomecompleto, char sexo, int idade, float altura, float peso){
	        

	        this.email = email;
	        this.nomecompleto = nomecompleto;
	        this.sexo = Character.toUpperCase(sexo);
	        this.idade = idade;
	        this.altura = altura;
	        this.peso = peso;
	      
	    }

	    public Cliente(){}

	    public void visualizar(){
	        System.out.println("Cadastro de novo cliente da academia");
	        System.out.println("E-mail: " + this.getEmail());
	        System.out.println("Nome Completo: " + this.getNomeCompleto());
	        System.out.println("Sexo: " + this.getSexo());
	        System.out.println("Idade: " + this.getIdade()); 
	    System.out.println ("Altura" + this.getAltura());
 	    System.out.println("Peso" + this.getPeso());}
	        

	    public String getEmail(){
	        return this.email;
	    }

	    public String getNomeCompleto(){
	        return this.nomecompleto;
	    }

	    public String getSexo(){
	        String sexo = this.sexo == 'M' ? "Masculino" : "Feminino";
	        return sexo;
	    }

	    public int getIdade(){
	        return this.idade;
	    }

	    
	    public void setEmail(String email){
	        
	        this.email = email;
	    }

	    public void setNomeCompleto(String nomecompleto){
	        this.nomecompleto = nomecompleto;
	    }

	    public void setSexo(char sexo){
	        
	        this.sexo = Character.toUpperCase(sexo);
	    }

	    public void setIdade(int idade){
	        this.idade = idade;
	    }

	    public float getAltura() {
	    	return peso;
	    	}


	    	public void setAltura(float altura) {
	    	this.altura = altura;
	    	}

public float getPeso() {
return peso;
}

public void setPeso(float peso) {
this.peso = peso;
}
}
