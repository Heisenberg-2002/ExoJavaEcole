package Iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Classe générique pour créer un tableau avec un itérateur inversé
public class ReverseArray<T> implements Iterable<T> {
    private T[] array;

    // Constructeur
    public ReverseArray(T[] array) {
        this.array = array;
    }

    @Override
    public Iterator<T> iterator() {
        return new ReverseIterator();
    }

    // Implémentation de l'itérateur pour parcourir de dernier au premier
    private class ReverseIterator implements Iterator<T> {
        private int currentIndex;

        // Initialiser l'indice à la dernière position
        public ReverseIterator() {
            this.currentIndex = array.length - 1;
        }

        @Override
        public boolean hasNext() {
            return currentIndex >= 0;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException("Aucun élément restant.");
            }
            return array[currentIndex--];
        }
    }

    // Exemple d'utilisation
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        ReverseArray<Integer> reverseArray = new ReverseArray<>(numbers);

        System.out.println("Parcours du tableau de dernier au premier :");
        for (Integer number : reverseArray) {
            System.out.println(number);
        }
    }
}
