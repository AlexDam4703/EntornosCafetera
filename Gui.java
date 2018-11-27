package ies.virgendelcarmen.cafetera;

public class Gui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creamos el objeto Cafetera y le ponemos el apuntado cafetera
		Cafetera cafetera =  new Cafetera(10,5,Cafetera.RecargarDatos(),5);
		/*al llamar a este metodo nos mostrara los datos que tiene el objeto cafetera y que se hayan expecificado
		previamente el metodo toString()*/
		System.out.println(cafetera.toString());
		System.out.println(cafetera.miString());
	}

}
