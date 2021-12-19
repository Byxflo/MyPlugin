package Exemples;

public class Moto implements Vehicule {

    @Override
    public int rouler(int nbHeures) {
        return nbHeures*100;
    }

}
