package Mp4;

public class Mp4 {
    private byte[] stream;

    public Mp4(byte[] stream) {
        this.stream = stream;
    }

    public byte[] getStream() {
        return stream;
    }
}
