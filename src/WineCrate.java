public class WineCrate {
    private String name;
    private int ammountOfBottles;
    private int bottleVolume;

    WineCrate(String name, int ammountOfBottles, int bottleVolume) {
        this.name = name;
        this.ammountOfBottles = ammountOfBottles;
        this.bottleVolume = bottleVolume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmmountOfBottles() {
        return ammountOfBottles;
    }

    public void setAmmountOfBottles(int ammountOfBottles) {
        this.ammountOfBottles = ammountOfBottles;
    }

    public int getBottleVolume() {
        return bottleVolume;
    }

    public void setBottleVolume(int bottleVolume) {
        this.bottleVolume = bottleVolume;
    }

    public int getTotalVolume() {
        return this.ammountOfBottles * this.bottleVolume;
    }

    public void overview() {
        System.out.println("Bedna typu: " + this.getName() + ". Objem: " + this.getTotalVolume() + "l");
    }

    public void compare(WineCrate otherWineCrate) {
        if (this.getTotalVolume() > otherWineCrate.getTotalVolume()) {
            System.out.println("Typ " + this.getName() + " je větší než " + otherWineCrate.getName());
        } else {
            System.out.println("Typ " + this.getName() + " je menší než " + otherWineCrate.getName());
        }
    }
}
