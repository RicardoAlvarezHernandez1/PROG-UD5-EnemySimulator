package net.salesianos;

import net.salesianos.Personajes.*;

import java.util.Scanner;

import net.salesianos.Mobs.*;
import net.salesianos.interfaces.*;


public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        String msg = "";
        int fuerza = 0;
        int defensa = 0;
        int numeroAleatorio = (int)(Math.random() * 3);
        
            
            System.out.println("Bienvenido Adrián (corte de manga disimulado)" + "\n");

            System.out.println("¿Qué arma quieres mi niño?");
            System.out.println("1. Ningun arma (Modo imposible <:O )");
            System.out.println("2. Espada de madera (Que pringado)");
            System.out.println("3. Espada de hierro (Ojito se vienen cositas)");
            System.out.println("4. Espada de diamante (Adri no has ido a minar ni una sola vez , no seas tramposo que se que no te la puedes permitir ;) )");

            int opcion = teclado.nextInt(); 

            

            switch (opcion) {
                case 1:
                    fuerza = 1;
                    System.out.println("Eres dios -> Fuerza = 1");
                    break;
                case 2:
                    fuerza = 2;
                    System.out.println("¿No había presupuesto para una mejor , verdad? Venga vale me compadezco de ti -> Fuerza =  2");
                    break;
                case 3:
                    fuerza = 3;
                    System.out.println("Bueno , espero que hayas bajado a la capa 12 para poder permitirtela >:(  -> Fuerza = 3)");
                    break;
                case 4:
                    fuerza = 5;
                    System.out.println("¿Montado en el dolar eh? Venga voy a hacer como que no lo he visto -> Fuerza = 5");
                    break;
                default:
                    break;
            }

            System.out.println("¿Qué armadura quieres mi niño?");
            System.out.println("1. Ninguna (Con el pecho al aire)");
            System.out.println("2. De cuero (Que pringado X2)");
            System.out.println("3. De hierro (Chiquito titán estás hecho)");
            System.out.println("4. De diamante (No te pudiste permitir la espada de diamante , menos vas a poder permitirte una armadura)");

            int opcionSegunda = teclado.nextInt();

            switch (opcionSegunda) {
                case 1:
                    defensa = 0;
                    System.out.println("Chiquito caballo -> Defensa = 0");
                    break;
                case 2:
                    defensa = 1;
                    System.out.println("¿No había presupuesto para una mejor , verdad? Venga vale me compadezco de ti -> Defensa =  1");
                    break;
                case 3:
                    defensa = 2;
                    System.out.println("Los tanques de la segunda guerra mundial te tienen envidia >:)  -> Defensa = 2)");
                    break;
                case 4:
                    defensa = 3;
                    System.out.println("¿Montado en el dolar otra vez? No se lo cree nadie -> Defensa = 3");
                    break;
                default:
                    break;
            }

            Personaje stevesito = new Personaje(defensa, fuerza);

            Zombisito zombisisito = new Zombisito(10);
            Endermansito endermansisito = new Endermansito(14);
            Ovejita ovejijita = new Ovejita(5);
            int puntosDeEndermansito = 0;
            int puntosDeZombisito = 0;
            int puntosDeOvejita = 0;

            switch (numeroAleatorio) {
                case 0:
                    System.out.println("Los luchadores son stevesito y el endermansito");
                    do {
                        System.out.println("Stevesito ataca al endermansito (muy bien demostrando quien manda)");
                        endermansisito.recibirAtaque(stevesito.atacar());
                        int ataqueAleatorio = (int) (Math.random() * 2);
    
                        if (ataqueAleatorio == 0) {
                            System.out.println("Endermansito ataca a Stevesito (en verdad los endermans parecen jugadores de la nba)");
                            stevesito.recibirAtaque(endermansisito.atacar());
                        } else {
                            endermansisito.moverse();
                        }
                        puntosDeEndermansito++;
                    } while (stevesito.getSalud() >= 0 && endermansisito.getSalud() >= 0);
                    if (stevesito.getSalud() > 0) {
                        msg = "el ganador es stevesito";
                    } else {
                        msg = "el endermansisito es el ganador";
                    }
                    System.out.println("Han pasado " + puntosDeEndermansito + " turnos y " + msg);
                    break;
                case 1:
                    System.out.println("Los luchadores son stevesito y zombisito");
                    do {
                        System.out.println("Stevesito ataca a zombisito");
                        zombisisito.recibirAtaque(stevesito.atacar());
                        int ataqueAleatorio = (int)(Math.random() * 2);
    
                        if (ataqueAleatorio == 0) {
                            System.out.println("Zombisito ataca a Stevesito");
                            stevesito.recibirAtaque(zombisisito.atacar());
                        } else {
                            zombisisito.moverse();
                        }
                        puntosDeZombisito++;
                    } while (stevesito.getSalud() >= 0 && zombisisito.getSalud() >= 0);
                    if (stevesito.getSalud() > 0) {
                        msg = "el ganador es stevesito";
                    } else {
                        msg = "el zombisito es el ganador";
                    }
                    System.out.println("Han pasado " + puntosDeZombisito + " turnos y " + msg);
                    break;
                case 2:
                    System.out.println("Los luchadores son el stevesito y ovejita");
                    do {
                        System.out.println("Stevesito ataca a la ovejita (eso no es muy vegano por su parte *la ovejita sufre* )");
                        ovejijita.recibirAtaque(stevesito.atacar());
                        ovejijita.moverse();
                        puntosDeOvejita++;
                    } while (ovejijita.getSalud() >= 0);
                    if (stevesito.getSalud() > 0) {
                        msg = "el ganador es el stevesito";
                    }
                    System.out.println("Han pasado " + puntosDeOvejita + " turnos y " + msg);
                    break;
            }
            
        
    }


 }
    

