package Mp4;

public class Mp4ToMp3Adapter {
    private Mp4 mp4;

    public Mp4ToMp3Adapter(Mp4 mp4) {
        this.mp4 = mp4;
    }

    public Mp3 adapt() {
        return new Mp3(mp4.getStream());
    }
}