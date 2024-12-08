import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobranie rozmiaru tablicy
        System.out.print("Podaj rozmiar tablicy: ");
        int n = scanner.nextInt();

        // Utworzenie tablicy
        int[] tablica = new int[n];

        // Wczytanie elementów tablicy
        System.out.println("Wprowadź " + n + " liczb:");
        for (int i = 0; i < n; i++) {
            System.out.print("Liczba " + (i + 1) + ": ");
            tablica[i] = scanner.nextInt();
        }

        // Pobranie elementu do wyszukania
        System.out.print("Podaj liczbę do wyszukania: ");
        int x = scanner.nextInt();

        // Wyszukiwanie elementu w tablicy
        int indeks = -1;
        for (int i = 0; i < n; i++) {
            if (tablica[i] == x) {
                indeks = i;
                break; // Przerwij, gdy znajdziesz pierwszy pasujący element
            }
        }

        // Wyświetlenie wyniku
        if (indeks != -1) {
            System.out.println("Element " + x + " znajduje się na indeksie " + indeks + ".");
        } else {
            System.out.println("Element " + x + " nie istnieje w tablicy.");
        }

        scanner.close();
    }
}