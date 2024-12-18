package Mp4;

public class Mp3Reader {
    public void read(Mp3 mp3) {
        System.out.println("Lecture MP3 : " + new String(mp3.getStream()));
    }
}
