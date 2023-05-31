package net.salesianos.Mobs;

import net.salesianos.interfaces.Danno;

public abstract class MobPacifico extends Mob implements Danno {
    
    public MobPacifico(int salud) {
        super(salud);
        
    }

    @Override
    public void recibirAtaque(int ataque){
        this.salud = this.salud - ataque;


        System.out.println("Daño recibido : " + ataque + " , Salud restante : " + this.salud);
    }
}
