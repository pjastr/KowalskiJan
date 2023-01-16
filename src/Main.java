import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Mebel m1 = new Mebel("Fotel",40, 50, 4);
        System.out.println(m1);
        // polecenie 1
        Mebel maly = new Mebel("Maly Mebel", 1 , 0.5, 4);
        //polecenie 2
        System.out.println(maly);
        // polecenie 3
        System.out.println(Mebel.getIle());
        // polecenie 4-5
        Mebel sredni = new Mebel(2,1, 4);
        System.out.println(sredni);
        // polecenie 6
        Biurko maleBiurko = new Biurko("Małe Biurko", 2,1,4,22);
        //polecenie 7
        maleBiurko.setDataProdukcji(2005, 2, 28);
        // polecenie 8
        System.out.println(maleBiurko);
        // polecenie 9
        System.out.println(Mebel.getIle());
        // polecenia 10-12
        Mebel[][] spis = new Mebel[2][2];
        spis[0][0] = sredni;
        spis[0][1] = maly;
        spis[1][0]= maleBiurko;
        spis[1][1] = sredni;
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.println(spis[i][j]);
            }
        }
        // polecenie 13-15
        String[] spisNazw = new String[4];
        spisNazw[0] = sredni.getNazwa();
        spisNazw[1] = maly.getNazwa();
        spisNazw[2] = maleBiurko.getNazwa();
        spisNazw[3] = sredni.getNazwa();
        for(var elem: spisNazw)
        {
            System.out.println(elem);
        }
        // polecenie 16
        System.out.println(sredni.equals(maly));
        System.out.println(sredni.equals(maleBiurko));
        // polecenie 17
        int licznik=0;
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                if (spis[i][j].getClass().getName().equals("Biurko"))
                {
                    licznik++;
                }
            }
        }
        System.out.println(licznik);
        // polecenie 18
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(spis[i][j].getClass().getName());
                System.out.print(",");
            }
        }
        System.out.println();
    }
}