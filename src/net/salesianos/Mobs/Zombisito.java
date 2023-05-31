package net.salesianos.Mobs;

public class Zombisito extends MobHostil{

    int fuerza;

    public Zombisito(int salud) {
        super(10);
        fuerza = 4;
    }

    @Override
    public void moverse() {
        System.out.println("Se mueve hacia el personaje (que coñazo dan los zombis en verdad) ");
    }


    
}
