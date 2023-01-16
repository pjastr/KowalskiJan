import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Biurko extends Mebel{

    public Biurko(String nazwa, double dlugosc, double szerokosc, Integer iloscNog, double przekatnaMonitora)
    {
        super(nazwa, dlugosc, szerokosc, iloscNog);
        this.przekatnaMonitora=przekatnaMonitora;
        this.dataProdukcji = LocalDate.now();
    }

    public void setDataProdukcji(int rok, int miesiac, int dzien) {
        this.dataProdukcji = LocalDate.of(rok, miesiac, dzien);
    }

    public LocalDate getDataProdukcji() {
        return this.dataProdukcji;
    }

    @Override
    public String toString()
    {
        DateTimeFormatter formatDaty = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return super.toString()+this.getClass().getName()+"["+this.dataProdukcji.format(formatDaty)+","+
                this.dataProdukcji.getDayOfWeek()+","+this.dataProdukcji.getDayOfYear()+"]";
    }

    @Override
    public boolean equals(Object otherObject)
    {
        return super.equals(otherObject);
    }

    private LocalDate dataProdukcji;
    private double przekatnaMonitora;
}
