package tp;

import bandeau.Bandeau;
import exemple.ExempleDUtilisation;

public class Main {
    public static void main(String[] args) {
        Bandeau bandeau = new Bandeau();
        WrittingEffect e1 = new WrittingEffect(0.1, "Un message random pas trop long");
        DiscoEffect e2 = new DiscoEffect(100);
        e1.doEffect(bandeau);
        e2.doEffect(bandeau);
    }
}
