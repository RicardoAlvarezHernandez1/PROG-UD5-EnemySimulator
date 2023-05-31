public abstract class MobHostil extends Mob implements Combate {
    
    private int fuerza;

    @Override
    public int atacar(){
        return fuerza;
    }

    @Override
    public void recibirAtaque(int ataque){
        this.salud = this.salud - ataque;


        System.out.prinln("Daño recibido : " + ataque + " , Salud restante : " + this.salud);
    }

}
