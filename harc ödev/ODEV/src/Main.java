public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Ogrenci[] ogrenciler = {
                new Ogrenci("2023141024", 0.0),
                new Ogrenci("İbadullah", "Bilgisayar Müh", "2023141039", 2.41, 2023),
                new Ogrenci("Sevim", "Makine Müh", "2017147027",2.17 , 2017),
                new Ogrenci("Kasım", "Elektrik-Elektronik Müh", "2018104011", 1.98, 2018)
        };

        System.out.println("Öğrenci Bilgileri");
        for (int i = 0; i < ogrenciler.length; i++) {
            ganoCont(ogrenciler[i].getGano());
            System.out.println("OGR-" + (i+1) + " " + ogrenciler[i]);
        }
        for (int i = 1; i < ogrenciler.length; i++) {
            if (ogrenciler[i].harcHesapla()>0) {
                System.out.println(i+". Öğrencinin Ödeyeceği harc: "+ ogrenciler[i].harcHesapla());
            }

        }
    }
    public static void ganoCont (double gano) throws IllegalAccessException {
        if (gano<0 || gano>4){
            throw new IllegalAccessException("Geçerli bir gano giriniz!");
        }
    }
}
