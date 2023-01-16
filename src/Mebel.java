class Mebel {

    public Mebel(String nazwa,double dlugosc, double szerokosc, Integer iloscNog)
    {
        this.nazwa= nazwa;
        this.dlugosc=dlugosc;
        this.szerokosc=szerokosc;
        this.iloscNog=iloscNog;
        ile++;
    }

    public Mebel(double dlugosc, double szerokosc, Integer iloscNog)
    {
        this("Jakis Mebel", dlugosc, szerokosc, iloscNog);
    }

    public String getNazwa() {
        return this.nazwa;
    }

    public double getDlugosc() {
        return this.dlugosc;
    }

    public double getSzerokosc() {
        return this.szerokosc;
    }

    public Integer getIloscNog() {
        return this.iloscNog;
    }

    public static int getIle() {
        return ile;
    }

    @Override
    public String toString()
    {
        if (this.nazwa.equals("Jakis Mebel"))
        {
            return this.getClass().getName() +"[" +
                    this.dlugosc+","+this.szerokosc+","+this.iloscNog+","+ile+"]";
        }
        return this.getClass().getName() +"[" +this.nazwa+","+
                this.dlugosc+","+this.szerokosc+","+this.iloscNog+","+ile+"]";
    }

    @Override
    public boolean equals(Object otherObject)
    {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null) {
            return false;
        }
        if (getClass() != otherObject.getClass()) {
            return false;
        }
        Mebel other = (Mebel) otherObject;
        return this.nazwa.equals(other.nazwa)
                && this.dlugosc == other.dlugosc
                && this.szerokosc ==other.szerokosc
                && this.iloscNog == other.iloscNog;
    }

    private String nazwa;
    private double dlugosc;
    private double szerokosc;
    private Integer iloscNog;
    private static int ile;
}
