package StructuralPatterns.bridge.after;

import StructuralPatterns.bridge.before.Champion;

public class App {

    public static void main(String[] args) {
        Champion kdaAri = new Ari(new KDA());
        kdaAri.skillQ();
        kdaAri.skillW();

        Champion poolParty = new Ari(new PoolParty());
        poolParty.skillQ();
        poolParty.skillW();


    }
}
