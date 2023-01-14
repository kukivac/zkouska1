public class Policeman {
    private String name;
    private String hodnost;
    private int plat;
    private Policeman partak;

    Policeman(String name, String hodnost, int plat) {
        this.name = name;
        this.hodnost = hodnost;
        this.plat = plat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlat() {
        return plat;
    }

    public void setPlat(int plat) {
        this.plat = plat;
    }

    public Policeman getPartak() {
        return partak;
    }

    public void setPartak(Policeman partak) {
        this.partak = partak;
    }

    public String getHodnost() {
        return hodnost;
    }

    public void setHodnost(String hodnost) {
        this.hodnost = hodnost;
    }

    public String getNameWithHodnost() {
        return this.getHodnost() + " " + this.getName();
    }

    public boolean maPartaka() {

        return this.getPartak() == null;
    }

    public void overview() {
        System.out.println("Policista: " + this.getNameWithHodnost());
        if (!this.maPartaka()) {
            System.out.println("Parťák: " + this.getPartak().getNameWithHodnost());
        } else {
            System.out.println("Parťák neznámý/á");
        }
    }
}
