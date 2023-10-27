package tp;

import bandeau.Bandeau;

public class HackingEffect extends Effect{
    private int numberOfChange;
    private String[] hackingChars;

    public HackingEffect(int numberOfChange, String[] hackingChars) {
        this.numberOfChange = numberOfChange;
        this.hackingChars = hackingChars;
    }

    @Override
    public void doEffect(Bandeau bandeau) {
        String baseMessage = bandeau.getMessage();

    }
}
