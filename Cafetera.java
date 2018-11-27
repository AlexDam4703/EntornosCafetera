package ies.virgendelcarmen.cafetera;

import java.util.Arrays;

public class Cafetera {
	//he añadido encapsulado a la clase cafetera por lo tanto tambien he generado setters y getters para la modificacion y visualizacion de los atributos si esto fuera necesario
	private int vasos;
	private int nivelAgua;
	private float consumible [][];
	private int maximoCosumibles;
	public Cafetera(int vasos, int nivelAgua, float[][] consumible, int maximoCosumibles) {
		this.vasos = vasos;
		this.nivelAgua = nivelAgua;
		this.consumible = new float [5][4];
		this.maximoCosumibles = maximoCosumibles;
		recargarDatosCafetera(consumible);
	}
	public void recargarDatosCafetera (float recarga [][]) {
		for (int i = 0; i < maximoCosumibles; i++) {
			for (int j = 0; j < 4; j++) {
				consumible[i][j] = recarga[i][j];
			}

		}
	}
	//creamos este metodo que sera el encargado de poner los datos al vector, el cual incluye capsula,tiempo,temperatura,agua
	public static float[][] RecargarDatos(){
		float recargarDatos[][] = new float [5][4];
		for (int i =0; i<5; i ++) {
			//aqui he quitado el bucle dado que el resto de los datos estan siendo regargados
			//de forma manual, asi que no tendrias sentido el resto del bucle.
			//aqui se da el numero de capsulas, en este caso siempre serian dos
			recargarDatos[i][0]= 2;
		}
			//ponemos el agua que requiere cada capsula que se guarda en la posicion [i][1] del vector
			recargarDatos[0][1] = 0.15f;
			recargarDatos[1][1] = 0.2f;
			recargarDatos[2][1] = 0.25f;
			recargarDatos[3][1] = 0.3f;
			recargarDatos[4][1] = 0.25f;
			//ponemos la temperatura que requiere la capsula
			//la temperatura esta alojada en la posicion [i][2] del vector
			recargarDatos[0][2] = 80f;
			recargarDatos[1][2] = 60f;
			recargarDatos[2][2] = 95f;
			recargarDatos[3][2] = 90f;
			recargarDatos[4][2] = 84f;
			//ponemos el tiempo que requiere la capsula
			//el tiempo esta olojado en la posicion [i][3] del vector
			recargarDatos[0][3] = 0.15f;
			recargarDatos[1][3] = 0.15f;
			recargarDatos[2][3] = 0.15f;
			recargarDatos[3][3] = 0.15f;
			recargarDatos[4][3] = 0.15f;
		return recargarDatos;
	}
	//aqui estan los getters y setters
	public int getVasos() {
		return vasos;
	}
	public void setVasos(int vasos) {
		this.vasos = vasos;
	}
	public int getNivelAgua() {
		return nivelAgua;
	}
	public void setNivelAgua(int nivelAgua) {
		this.nivelAgua = nivelAgua;
	}
	public float[][] getConsumible() {
		return consumible;
	}
	public void setConsumible(float[][] consumible) {
		this.consumible = consumible;
	}
	public int getMaximoCosumibles() {
		return maximoCosumibles;
	}
	public void setMaximoCosumibles(int maximoCosumibles) {
		this.maximoCosumibles = maximoCosumibles;
	}
	/*aqui sobreescribimos el metodo toString para que nos muestre como cadena los datos que queremos y la forma
	que queramos */
	public String toString() {
		String cadena = "vasos ("+ vasos +") Agua ("+nivelAgua+")\n";
		for (int i=0; i< maximoCosumibles ; i ++)
			cadena = cadena +"Capsula ("+i+") es de "+ consumible[i][0]+"\n";
		for (int i=0; i< maximoCosumibles ; i ++)
			cadena = cadena +"Nivel de agua de la Capsula ("+i+") es de "+ consumible[i][1]+"\n";
		for (int i=0; i< maximoCosumibles ; i ++)
			cadena = cadena +"Temperatura de la Capsula("+i+") es de "+ consumible[i][2]+"\n";
		for (int i=0; i< maximoCosumibles ; i ++)
			cadena = cadena +"Tiempo de a Capsula ("+i+") es de "+ consumible[i][3]+"\n";
		return cadena;
	}
	
	//Aqui esta mi metodo toString que le he llamado miString para diferenciar los dos
	public String miString() {
		String cadena = "";
		for (int i = 0; i < maximoCosumibles ; i++) {
			cadena +="\nCapsula ("+i+") Tiene los siguientes parametros:\n"
					+ "tipo de capsula ("+consumible[i][0]+")\n"
							+ "Nivel de agua ("+consumible[i][1]+")\n"
									+ "Temperatura necesaria ("+ consumible[i][2]+"ºC)\n"
											+ "Tiempo necesario ("+ consumible[i][3]+"s)\n";
		}
		return "Cafetera [vasos=" + vasos + ", nivelAgua=" + nivelAgua + ", consumible="
				+ ", maximoCosumibles=" + maximoCosumibles + "]\n"
						+ cadena;
	}
	
	
	

}
