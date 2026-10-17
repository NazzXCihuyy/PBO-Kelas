package P4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Sepeda sepeda = new Sepeda();
        
        System.out.print("Masukkan Merk Sepeda\t: ");
        sepeda.merk = input.nextLine();
        
        sepeda.jarakTempuh = 0;
        
        System.out.println("Sepeda " + sepeda.merk + " Memiliki jarak awal : " + sepeda.jarakTempuh);
        
        
        int pil;
        do {
            System.out.println("\n\nMenu:");
            System.out.println("Maju (1)");
            System.out.println("Mundur (2)");
            System.out.println("Berhenti (3)");
            System.out.println("Keluar (0)");

            System.out.print("Pilihan : ");
            pil = input.nextInt();

            switch (pil) {
                case 1:
                    sepeda.Maju();
                    break;
                case 2:
                    sepeda.Mundur();
                    break;
                case 3:
                    sepeda.berhenti();
                    break;
                case 0:
                    System.out.println("Udahan Sepedahannya");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pil != 0);
        
    }
}

class Sepeda{
        String merk;
        int jarakTempuh;
        

        void Maju() {
            jarakTempuh += 10;
            System.out.println("- Bergerak Maju 10 Km");
            System.out.println("- Sepeda " + merk + ", Jarak tempuh " + jarakTempuh + " Km");
        }

        void Mundur() {
            jarakTempuh -= 5;
            System.out.println("- Bergerak Mundur 5 Km");
            System.out.println("- Sepeda " + merk + ", Jarak tempuh " + jarakTempuh + " Km");
        }

        void berhenti() {
            System.out.println("- Berhenti");
            System.out.println("- Jarak tempuh terakhir sepeda " + merk + " adalah " + jarakTempuh + " Km");
        }
}

