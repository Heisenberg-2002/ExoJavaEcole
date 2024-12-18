package Mp4;

    public class Main {
        public static void main(String[] args) {
            Mp4 mp4 = new Mp4("Contenu d'un fichier MP4".getBytes());
            Mp4ToMp3Adapter adapter = new Mp4ToMp3Adapter(mp4);

            Mp3Reader reader = new Mp3Reader();
            reader.read(adapter.adapt());
        }
    }
