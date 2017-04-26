package controller.sjf;

import controller.capturarDados.ReceberDadosView;

public class Sjf {

	public int[]array;
	
	public Sjf(){
		ReceberDadosView objReceber=new ReceberDadosView();
		
		array=objReceber.fornecerDadosView();
		//array[0]--->Counter of process
	}

}
