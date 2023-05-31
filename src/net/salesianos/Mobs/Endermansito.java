package net.salesianos.Mobs;

public class Endermansito extends MobHostil{

    int fuerza;

    public Endermansito(int salud) {
        super(14);
        fuerza = 6;      
    }

    @Override
    public void moverse() {
        System.out.println("Se teletransporta epicamente detrás de ti (odio a los endermans por ninguna razón aparente)");
    }
    
    
}
