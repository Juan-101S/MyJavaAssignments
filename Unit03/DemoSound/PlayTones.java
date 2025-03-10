import javax.sound.sampled.LineUnavailableException;
import sound.ToneGenerator;
import sound.ToneGenerator.Note;

public class PlayTones {
    public static void main(String[] args) {
        ToneGenerator tg = new ToneGenerator();

        try {
            tg.init();
        } catch (LineUnavailableException e) {
            System.err.println("Unable to initialize tone generator.");
            return;
        }

        tg.play(Note.G4, 200);
        tg.play(Note.REST, 100);
        tg.play(Note.G4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.G4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.D4, 200);
        tg.play(Note.REST, 100);
        tg.play(Note.E4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.E4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.D4, 200);
        tg.play(Note.REST, 350);
        tg.play(Note.B4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.B4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.A4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.A4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.G4, 400);
        tg.play(Note.REST, 100);
        tg.play(Note.D4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.G4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.G4, 200);
        tg.play(Note.REST, 100);
        tg.play(Note.G4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.D4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.E4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.E4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.D4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.B4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.B4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.A4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.A4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.G4, 400);
        tg.play(Note.REST, 100);
        tg.close();

    }
}
