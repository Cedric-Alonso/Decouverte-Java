package demenagement;

public class Demenagement{
    public static void main(String[] args){

        int Camion = 0, nvLocal = 0, Local =34;


        while(Local!=0||nvLocal!=34){
            if (Camion<9 && Local !=0){
                Camion++;
                Local--;
                System.out.println("charger caisse");
            }
            else if (Camion == 9 || Local == 0){
                while (Camion != 0){
                    nvLocal++;
                    Camion--;
                    System.out.println("décharger caisse");
                }
            }
            else if (Camion == 9 && Local == 0){
                System.out.println("erreur");
                System.out.println(Local + " caisses dans Local");
                System.out.println(Camion + " caisses dans Camion");
                System.out.println(nvLocal + " caisses dans Nouveaux Local");
            }
        }
            if (Local == 0 && nvLocal == 34){
                System.out.println("travaille terminer");
                System.out.println(Local + " caisses dans Local");
                System.out.println(Camion + " caisses dans Camion");
                System.out.println(nvLocal + " caisses dans Nouveaux Local");
            }
            else {
                System.out.println("erreur");
                System.out.println(Local + " caisses dans Local");
                System.out.println(Camion + " caisses dans Camion");
                System.out.println(nvLocal + " caisses dans Nouveaux Local");
            }
    }
}


