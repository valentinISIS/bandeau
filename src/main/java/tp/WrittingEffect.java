package tp;

import bandeau.Bandeau;

public class WrittingEffect extends Effect{
    private double eraseProbability;
    private String message;

    public WrittingEffect(double eraseProbability, String message) {
        this.eraseProbability = eraseProbability;
        this.message = message;
    }

    @Override
    public void doEffect(Bandeau bandeau) {
        int indiceChar = 0;
        String displayMessage = "|";
        while (indiceChar < message.length()){
            if (indiceChar > 4 && eraseProbability > Math.random()){
                indiceChar -= 4;
                for (int i = 0; i < 4; i++) {
                    displayMessage = displayMessage.substring(0, displayMessage.length()-1);
                    bandeau.sleep(100);
                    bandeau.setMessage(displayMessage);
                }
            }
            bandeau.sleep(100);
            displayMessage = displayMessage.substring(0, displayMessage.length()-1) + message.charAt(indiceChar) + "|";
            indiceChar += 1;
            bandeau.setMessage(displayMessage);
        }
        bandeau.setMessage(displayMessage.substring(0, displayMessage.length()-1));
    }
}
