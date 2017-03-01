package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Objeto;

public class GestObjetos {
	ArrayList arr ;
	
	public GestObjetos(){
		arr =new ArrayList<>();
		addData();
		addCampo();
		showData();
	}
	
	public void addData(){			
		arr.add('b');
		arr.add(3);
		arr.add("Carruagens");
		arr.add(8.56);
		arr.add("caixas de armazenamento");	
	}
	
	public void addCampo(){
		int teste;
		Scanner sc = new Scanner(System.in); 
		System.out.println("Insira Valor");
		teste= sc.nextInt();
		arr.add(teste);	
	}
	
	 public void showData(){
		 for(int i=0;i<arr.size();i++){
			 System.out.println(arr.get(i));
		 }
		 

		 
	 }			
}