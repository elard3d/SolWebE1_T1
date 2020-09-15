package N00017745;


public class ClassNumeros{
	

	private int vectorNumeros100 [];
	private int vectorNumeros5 [];
	
	public ClassNumeros() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int[] getVectorNumeros100() {
		return vectorNumeros100;
	}


	public void setVectorNumeros100(int[] vectorNumeros100) {
		this.vectorNumeros100 = vectorNumeros100;
	}


	public int[] getVectorNumeros5() {
		return vectorNumeros5;
	}


	public void setVectorNumeros5(int[] vectorNumeros5) {
		this.vectorNumeros5 = vectorNumeros5;
	}
	
	public void generarNumeros() {
		
			int[] vector = new int [100];
			
	        for( int i=0; i < 100; i++ ) {
	         
	        	vector[i] = i+1;
	       
	        }
	        this.vectorNumeros100=vector;
		}
	
	
	public void obtenerNumeros() {
		
		int[] vector = new int [5];
		int numeroAleatorio;
		
        for( int i=0; i < 5; i++ ) {
        	
        	numeroAleatorio = (int) Math.floor(Math.random()*(this.vectorNumeros100.length));
        	
        	vector[i] = numeroAleatorio;
       
        }
        this.vectorNumeros5=vector;
	}

}
