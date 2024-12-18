package Mp4;

public class Mp3 {
    private byte[] stream;

    public Mp3(byte[] stream) {
        this.stream = stream;
    }

    public byte[] getStream() {
        return stream;
    }
}