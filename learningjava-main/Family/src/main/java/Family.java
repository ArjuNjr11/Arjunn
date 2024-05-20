/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author User
 */
public class Family {
    public static void main(String[] args) {
        Person bapakAri = new Parent("Imam Mahdi As'Ari", "Temanggung", "31 Desember 1981", "Wiraswasta", "Jawa Tengah, Temanggung", "085701254851", "Laki-laki");
        Person ibuSri = new Parent("Sri Rejeki", "Temanggung", "10 juni 1980", "Guru", "Jawa Tengah, Temanggung", "08580932923", "Perempuan");
        Person Arju = new Child("Muhammad Arju Naja", "Temanggung", "08 Maret 2003", "Pelajar/Mahasiswa", "Magelang", "085865898164", "Laki-laki");
        Person Sahla = new Child("Sahla Kamila Putri", "Temanggung", "3 Juni 2014", "Pelajar", "", "085123456789", "Perempuan");

        System.out.println("Keluarga ku:");
        System.out.println("------ Bapak ------");
        System.out.println(bapakAri.getDetails());

        System.out.println("------ Ibu ------");
        System.out.println(ibuSri.getDetails());

        Person[] anak = new Person[]{Arju, Sahla};

        System.out.println("Mereka berdua memiliki 2 anak:");
        for (int i = 0; i < anak.length; i++) {
            if (anak[i] instanceof Child) {
                String jenisKelamin = (i == 0) ? "perempuan" : "laki-laki";
                int anakKe = i + 1;
                System.out.println("Anak ke-" + anakKe + " yaitu anak " + jenisKelamin);
                System.out.println(anak[i].getDetails());

                if (i == 0) {
                    System.out.println();
                }
            }
        }
    }
}
