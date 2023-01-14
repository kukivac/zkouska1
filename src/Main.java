public class Main {
    public static void main(String[] args) {
        WineCrate bedna_a = new WineCrate("Mattoni", 10, 2);
        WineCrate bedna_b = new WineCrate("Morava", 8, 6);
        WineCrate bedna_c = new WineCrate("Braníček", 22, 1);

        bedna_a.overview();
        bedna_b.overview();
        bedna_c.overview();

        bedna_a.compare(bedna_b);
        bedna_c.compare(bedna_b);
        bedna_b.compare(bedna_a);

        System.out.println(" ");

        Policeman policajt_a = new Policeman("Kouba", "mj.", 25000);
        Policeman policajt_b = new Policeman("Pavel", "gen.", 84000);
        Policeman policajt_c = new Policeman("Opálka", "nrot.", 32500);

        policajt_a.setPartak(policajt_b);
        policajt_c.setPartak(policajt_a);

        policajt_a.overview();
        policajt_b.overview();
        policajt_c.overview();
    }
}

