package net.salesianos.Mobs;

import net.salesianos.interfaces.Combate;

public abstract class MobHostil extends Mob implements Combate {
    
    public MobHostil(int salud) {
        super(salud);
    }

    protected int fuerza;

    @Override
    public int atacar(){
        return fuerza;
    }

    @Override
    public void recibirAtaque(int ataque){
        this.salud = this.salud - ataque;


        System.out.println("Daño recibido : " + ataque + " , Salud restante : " + this.salud);
    }

    @Override
    public void moverse(){    };

}
