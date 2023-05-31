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

    

    public int getSalud() {
        return salud;
    }



    public void setSalud(int salud) {
        this.salud = salud;
    }



    public int getDefensa() {
        return defensa;
    }



    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }



    public int getFuerza() {
        return fuerza;
    }



    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }



    @Override
    public int atacar(){
        return this.fuerza;
    }


    @Override
    public void recibirAtaque(int ataque){
        int daño = ataque - this.defensa;
        
        if (daño < 0) {
            daño = 0;
        } else if (this.salud <= 0){
            this.salud = 0;
        } else {
            this.salud = this.salud - daño;
        }
            
        
        System.out.println("Daño recibido : " + daño + " , Salud restante : " + this.salud);
    }

    
}
