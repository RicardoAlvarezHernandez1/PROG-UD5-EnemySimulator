package net.salesianos.Personajes;
 import net.salesianos.interfaces.*;

public class Personaje implements Combate{
    
    private int salud;
    private int defensa;
    private int fuerza;
   
    public Personaje(int defensa, int fuerza) {
        this.salud = 12;
        this.defensa = defensa;
        this.fuerza = fuerza;
    }

    @Override
    public int atacar(){
        return this.fuerza;
    }


    @Override
    public void recibirAtaque(int ataque){
        int daño = ataque - this.defensa;
        this.salud = this.salud - daño;


        System.out.println("Daño recibido : " + daño + " , Salud restante : " + this.salud);
    }

    
}
