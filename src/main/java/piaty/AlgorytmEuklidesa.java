package piaty;

public class AlgorytmEuklidesa {

    int liczba1;
    int liczba2;
    int wynik;

    int najwiekszyWpolnyDzielnik(int liczba1, int liczba2) {
        while (liczba2 != 0) {
            wynik = liczba1 % liczba2;
            liczba1 = liczba2;
            liczba2 = wynik;
            System.out.println("Najwiekszy wspolny dzielnik to : " + liczba1);
        }
        return liczba1;
    }

    public static void main(String[] args) {
        AlgorytmEuklidesa algorytmEuklidesa = new AlgorytmEuklidesa();
        algorytmEuklidesa.najwiekszyWpolnyDzielnik(100, 7);
    }
}