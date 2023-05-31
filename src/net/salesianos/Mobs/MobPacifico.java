public abstract class MobPacifico extends Mob implements Danno {
    
    @Override
    public void recibirAtaque(int ataque){
        this.salud = this.salud - ataque;


        System.out.prinln("Daño recibido : " + ataque + " , Salud restante : " + this.salud);
    }
}
