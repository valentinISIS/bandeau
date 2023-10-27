package tp;

import bandeau.Bandeau;

public class Main {
    public static void main(String[] args) {
        Bandeau b = new Bandeau();
        WrittingEffect e1 = new WrittingEffect(0.1, "Un message random pas trop long");
        DiscoEffect e2 = new DiscoEffect(100);
        HackingEffect e3 = new HackingEffect(100, new Character[] {'%', '$', '£', '*', '*', 'µ', '¤', ')', '}', '{', 'ç', '#'});

        Scenario scenario = new Scenario(b);
        scenario.addEffect(e1);
        scenario.addEffect(e2);
        scenario.addEffect(e3);
        scenario.play();
    }
}
