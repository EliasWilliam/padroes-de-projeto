package dio;

public class SingletonEager {
	//primeira instancia
		private static SingletonEager instancia = new SingletonEager();
		
		private SingletonEager() {
			super();
		}
	    public static SingletonEager getInstancia() {
	    	
	    	return instancia;
	    }
}
