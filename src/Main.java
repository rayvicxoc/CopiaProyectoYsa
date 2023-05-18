import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Animal> animales = new ArrayList<Animal>();
		String ruta = "animalitos.txt";
		File archivo = new File(ruta);
		
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int opc = 0;
		
		
		if(!archivo.exists()) {
			try {
				archivo.createNewFile();
				do {
					mostrarMenu();
					opc = sn.nextInt();
					switch(opc) {
						case 1:
							String tipoAnimal = "", idAnimal = "", nombre="", tipo="", especie="", sonidoEmite="",propietario="";
							int altura = 0, edad=0, nivelFuerza=0;
							double peso;
							String esmimoso = "";
							boolean mimoso = false;
							System.out.println("Introduzca si es Doméstico o Salvaje: ");
							tipoAnimal = sc.nextLine();
							if(tipoAnimal.equalsIgnoreCase("Doméstico") || tipoAnimal.equalsIgnoreCase("Domestico")) {
								System.out.println("Introduce id: ");
								idAnimal = sc.nextLine();
								System.out.println("Introduce altura: ");
								altura = sn.nextInt();
								System.out.println("Introduce peso: ");
								peso = sn.nextDouble();
								System.out.println("Introduce edad");
								edad = sn.nextInt();
								System.out.println("Introduce Nombre: ");
								nombre = sc.nextLine();
								System.out.println("Introduce especie: ");
								especie = sc.nextLine();
								System.out.println("Introduce si es mimoso: ");
								esmimoso = sc.nextLine();
								if(!esmimoso.equalsIgnoreCase("Si") || !esmimoso.equalsIgnoreCase("No")) {
									System.out.println("Solo puedes responder si o no.");
									esmimoso = sc.nextLine();
								}
								if(esmimoso.equalsIgnoreCase("Si")) {
									mimoso = true;
								}else if(esmimoso.equalsIgnoreCase("No")) {
									mimoso = false;
								}
								System.out.println("Introduce propietario: ");
								propietario = sc.nextLine();
								altaAnimal(tipoAnimal, idAnimal, altura, peso, edad, nombre, especie, nivelFuerza, mimoso, sonidoEmite, propietario, animales);
								//escribir directamente
								escribirEnArchivo(archivo, animales, idAnimal);
							}else if(tipoAnimal.equalsIgnoreCase("Salvaje")) {
								System.out.println("Introduce id: ");
								idAnimal = sc.nextLine();
								System.out.println("Introduce altura: ");
								altura = sn.nextInt();
								System.out.println("Introduce peso: ");
								peso = sn.nextDouble();
								System.out.println("Introduce edad");
								edad = sn.nextInt();
								System.out.println("Introduce Nombre: ");
								nombre = sc.nextLine();
								System.out.println("Introduce especie: ");
								especie = sc.nextLine();
								System.out.println("Introduce fuerza: ");
								nivelFuerza = sn.nextInt();
								System.out.println("Introduce si es mimoso: ");
								esmimoso = sc.nextLine();
								if(!esmimoso.equalsIgnoreCase("Si") || !esmimoso.equalsIgnoreCase("No")) {
									System.out.println("Solo puedes responder si o no.");
									esmimoso = sc.nextLine();
								}
								if(esmimoso.equalsIgnoreCase("Si")) {
									mimoso = true;
								}else if(esmimoso.equalsIgnoreCase("No")) {
									mimoso = false;
								}
								altaAnimal(tipoAnimal, idAnimal, altura, peso, edad, nombre, especie, nivelFuerza, mimoso, sonidoEmite, propietario, animales);
								//escribe directamente al archivo.
								escribirEnArchivo(archivo, animales, idAnimal);
							}
							break;
						case 2:
							idAnimal = "";
							System.out.println("Introduce el id del animal: ");
							idAnimal = sc.nextLine();
							for(Animal a: animales) {
								if(a.getIdAnimal().equalsIgnoreCase(idAnimal)) {
									animales.remove(a);
								}
							}
							
					}
					
					
				}while(opc!=6);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			
		}
		
		
		
		
		
		
	}

	
	
	
	
	//mostrar menu
	public static void mostrarMenu() {
		System.out.println("Elija una opción: \n"+"1. Alta animal.\n"
				+ "2. Baja animal.\n"
				+ "3. Modificación de dato de animal.\n"
				+ "4. Listado de todos los animales domésticos por pantalla ordenados por edad.\n"
				+ "5. Listado de todos los animales salvajes y domésticos juntos por pantalla ordenados por peso.\n"
				+ "6. Salir.");
	}
	
	//1
	public static void altaAnimal(String tipoAnimal, String idAnimal, int altura, double peso, int edad, String nombre, String especie, int fuerza, boolean mimoso, String sonido, String propietario, ArrayList<Animal> alta) {
		if(tipoAnimal.equalsIgnoreCase("Domestico")|| tipoAnimal.equalsIgnoreCase("Doméstico")) {
			fuerza = 0;
			alta.add(new Animal(idAnimal, altura, peso, edad, nombre, tipoAnimal, especie, fuerza, mimoso, sonido, propietario));
		}else if(tipoAnimal.equalsIgnoreCase("Salvaje")) {
			propietario = null;
			alta.add(new Animal(idAnimal, altura, peso, edad, nombre, tipoAnimal, especie, fuerza, mimoso, sonido, propietario));
		}
	}
	
	//escribir en el archivo
	public static void escribirEnArchivo(File archivo, ArrayList<Animal> animales, String idAnimal) {
		try {
			for(Animal a: animales) {
				if(a.getIdAnimal().equalsIgnoreCase(idAnimal)) {
					String escribirAnimal = a.getIdAnimal() + "-"+ a.getAltura()+ "-"+ a.getPeso()+ "-"+ a.getEdad()+ "-"+ a.getNombre()+ "-"+ a.getTipo()+ "-"+ a.getEspecie()+ "-"+ a.getNivelFuerza()+ "-"+ a.getMimoso()+ "-"+ a.getSonidoEmite()+ "-"+ a.getPropietario(); 
					BufferedWriter bw = new BufferedWriter(new FileWriter(archivo.getAbsolutePath(), true));
					bw.write(escribirAnimal);
					bw.newLine();
					bw.close();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//lectura de archivo para bajas de animales
	

}
