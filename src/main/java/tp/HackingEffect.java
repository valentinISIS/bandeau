package tp;

import bandeau.Bandeau;

import java.util.Random;

public class HackingEffect extends Effect{
    private int numberOfChange;
    private Character[] hackingChars;

    public HackingEffect(int numberOfChange, Character[] hackingChars) {
        this.numberOfChange = numberOfChange;
        this.hackingChars = hackingChars;
    }

    @Override
    public void doEffect(Bandeau bandeau) {
        String baseMessage = bandeau.getMessage();
        String displayMessage;
        Random random = new Random();
        for (int i = 0; i < numberOfChange; i++) {
            displayMessage = "";
            for (int j = 0; j < bandeau.getMessage().length(); j++) {
                displayMessage = displayMessage + hackingChars[random.nextInt(hackingChars.length)];
            }
            bandeau.setMessage(displayMessage);
            bandeau.sleep(50);
        }
        bandeau.setMessage(baseMessage);
    }
}
