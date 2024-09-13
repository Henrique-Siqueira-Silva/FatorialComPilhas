package controller;

import br.edu.fateczl.pilhasINT.PilhasINT;

public class PìlhasFatorial {

	public PìlhasFatorial() {
		super();
		
	}

	public long Fatorial (int n) {
		if ( n == 0) {
			return 1;
		}
 		PilhasINT p = new PilhasINT();
 		int fatorial = 1;
		for ( int i = 1; i <= n; i ++) {
			p.Push(i);
		}
		
		for ( int i = 1; i <= n; i ++) {
			fatorial = fatorial * p.Pop();
		}
		
		return fatorial;
		
	}
}
