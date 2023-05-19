
public class Animal {

	private String idAnimal;
	private int altura;
	private double peso;
	private int edad;
	private String nombre;
	private String tipo;
	private String especie;
	private int nivelFuerza;
	private Boolean mimoso;
	private String sonidoEmite;
	private String propietario;
	public Animal() {
		super();
	}
	public Animal(String idAnimal, int altura, double peso, int edad, String nombre, String tipo, String especie,
			int nivelFuerza, Boolean mimoso, String sonidoEmite, String propietario) {
		super();
		this.idAnimal = idAnimal;
		this.altura = altura;
		this.peso = peso;
		this.edad = edad;
		this.nombre = nombre;
		this.tipo = tipo;
		this.especie = especie;
		this.nivelFuerza = nivelFuerza;
		this.mimoso = mimoso;
		this.sonidoEmite = sonidoEmite;
		this.propietario = propietario;
	}
	public Animal(String idAnimal, int altura) { // HE AÑADIDO OTRO CONSTRUCTOR A LA CLASE ANIMAL
		super();
		this.idAnimal = idAnimal;
		this.altura = altura;
	}
	public String getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(String idAnimal) {
		this.idAnimal = idAnimal;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
		
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public int getNivelFuerza() {
		return nivelFuerza;
	}
	public void setNivelFuerza(int nivelFuerza) {
		this.nivelFuerza = nivelFuerza;
	}
	public Boolean getMimoso() {
		if(this.mimoso==true) {
			System.out.println("Si es mimoso.");
		}else {
			System.out.println("No es mimoso.");
		}
		return mimoso;
	}
	public void setMimoso(Boolean mimoso) {
		this.mimoso = mimoso;
	}
	public String getSonidoEmite() {
		return sonidoEmite;
	}
	public void setSonidoEmite(String sonidoEmite) {
		this.sonidoEmite = sonidoEmite;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
}
