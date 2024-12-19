import java.util.Iterator;

// Classe qui implémente Iterable
public class StringWrapper implements Iterable<Character> {
    private final String str;
    private final boolean reverse;

    // Constructeur
    public StringWrapper(String str, boolean reverse) {
        this.str = str;
        this.reverse = reverse;
    }

    @Override
    public Iterator<Character> iterator() {
        return new StringIterator();
    }

    // Classe interne pour l'itérateur
    private class StringIterator implements Iterator<Character> {
        private int currentIndex;

        // Initialisation de l'indice selon le mode (normal ou inverse)
        public StringIterator() {
            this.currentIndex = reverse ? str.length() - 1 : 0;
        }

        @Override
        public boolean hasNext() {
            return reverse ? currentIndex >= 0 : currentIndex < str.length();
        }

        @Override
        public Character next() {
            char currentChar = str.charAt(currentIndex);
            currentIndex += reverse ? -1 : 1;
            return currentChar;
        }
    }

    // Méthode principale pour tester
    public static void main(String[] args) {
        StringWrapper wrapper = new StringWrapper("Hello", false); // Parcours normal
        System.out.println("Parcours normal:");
        for (char c : wrapper) {
            System.out.print(c + " ");
        }

        System.out.println("Parcours inversé:");
        StringWrapper reverseWrapper = new StringWrapper("Hello", true); // Parcours inversé
        for (char c : reverseWrapper) {
            System.out.print(c + " ");
        }
    }
}