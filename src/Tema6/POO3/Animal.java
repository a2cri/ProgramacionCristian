package POO3;

abstract class Animal {
    String nombre;
    int edad;

    abstract void comer();

    public void dormir() {
        System.out.println("Duerme");
    }

    abstract void hacerRuido();

    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
}