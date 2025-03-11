import javax.sound.sampled.LineUnavailableException;
import sound.ToneGenerator;
import sound.ToneGenerator.Note;

public class PartA {
    public static void main(String[] args) throws LineUnavailableException {
        ToneGenerator tg = new ToneGenerator();
        tg.init();

        tg.play(Note.E5, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.E5, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.F5, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.G5, 1000);
        tg.play(Note.REST, 500);
        tg.play(Note.F5, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.E5, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.D5, 1000);
        tg.play(Note.REST, 500);
        tg.play(Note.E5, 500);
        tg.play(Note.REST, 50);
        tg.play(Note.D5, 500);
        tg.play(Note.REST, 100);
        tg.play(Note.C5, 1000);
        tg.close();
    }
}
