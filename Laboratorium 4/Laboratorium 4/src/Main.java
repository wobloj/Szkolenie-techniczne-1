import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static List zakresElementow(int a, int b, List set){
        List<Integer> zakres = set.stream()
                .flatMapToInt(i ->IntStream.rangeClosed(a, b))
                .boxed()
                .collect(Collectors.toList());
        return zakres;
    }

    public static void main(String[] args) {
        Interface1 op = (a, b) -> a + b;

        ArrayList<Integer> liczby = new ArrayList<>();
        for (int i = 0; i <= 50; i++){
            liczby.add(i);
        }

        Osoba os1 = new Osoba("Piotr", "Wojcicki", 1992);
        Osoba os2 = new Osoba("Karol", "Lucki", 1992);
        Osoba os3 = new Osoba("Wojtek", "Polak", 2001);

        ArrayList<Osoba> lista_osob = new ArrayList<>();
        lista_osob.add(os1);
        lista_osob.add(os2);
        lista_osob.add(os3);

        List<Osoba> osoba_urodzona_w_roku = lista_osob.stream()
                .parallel()
                .filter(wiek -> wiek.getWiek() == 1992)
                .collect(Collectors.toList());

        System.out.println(osoba_urodzona_w_roku);

        List<Osoba> osoba_zaczynajaca = lista_osob.stream()
                .filter(l -> l.getImie().startsWith("Pi"))
                .collect(Collectors.toList());

        System.out.println(osoba_zaczynajaca);

        Integer ile_jest = osoba_zaczynajaca.size();

        System.out.println(ile_jest);

        List<Integer> liczby_parzyste=liczby.stream()
                .filter(e -> e%2==0)
                .collect(Collectors.toList());
        System.out.println(liczby_parzyste);

        List<Integer> najmniejsza_z_parzystych = List.of(liczby_parzyste.stream()
                .min(Integer::compareTo).get());
        System.out.println(najmniejsza_z_parzystych);

        System.out.println(zakresElementow(1,7,liczby));

        int wynik = op.operacja(3,100);
        System.out.println(wynik);
    }

}

