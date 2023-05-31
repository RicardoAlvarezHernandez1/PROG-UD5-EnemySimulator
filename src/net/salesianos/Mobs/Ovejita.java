package net.salesianos.Mobs;

public class Ovejita extends MobPacifico{
    
    public Ovejita(int salud) {
        super(0);
    }

    @Override
    public void moverse() {
        System.out.println("Se mueve por el campo");
    }
    
}
