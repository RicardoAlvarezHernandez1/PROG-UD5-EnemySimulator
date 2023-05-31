package net.salesianos.Mobs;


public abstract class Mob {
    protected int salud;
    protected int fuerza;

    public Mob(int salud) {
        this.salud = salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getSalud() {
        return salud;
    }

    public abstract void moverse();

    



    

    
    
}