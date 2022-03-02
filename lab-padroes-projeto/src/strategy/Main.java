package strategy;

import facade.facade;
import dio.SingletonEager;
import dio.SingletonLazy;
import dio.SingletonLazyHolder;

public class Main {
	public static void main(String[] args) {
	
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		lazy = SingletonLazy.getInstancia();
		
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);

		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
	
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setStrategy(normal);
		robo.mover();
		robo.mover();
		robo.setStrategy(defensivo);
		robo.mover();
		robo.setStrategy(agressivo);
		robo.mover();
		
	
		
		facade facade = new facade();
		facade.migrarCliente("Will", "6834-9078");
	
	}
}
