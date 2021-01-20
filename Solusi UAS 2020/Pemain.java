package UAS.Java;

import java.util.Random;

public class Pemain {
    public int posisi;
    public String pemain;
    public boolean menang;
    public int temp_posisi;
    public int urutan;
    Random random = new Random();

    public Pemain(String pemain) {
        this.pemain = pemain;
        this.menang = false;
        this.posisi = 0;
        this.urutan = 0;
    }

    public static int lempar(Pemain yangmain) {
        Random random = new Random();
        int daduA = 1 + random.nextInt(6);
        System.out.println("Lemparan dadu awal " + yangmain.pemain+" " + daduA);
        return daduA;
    }

    public void cek() {
        if (this.posisi > 100) {
            temp_posisi = this.posisi - 100;
            System.out.println("kelebihan langkah sebanyak :" + (this.posisi - 100));
            this.posisi = 100 - (this.posisi - 100);
            System.out.println("mundur " + temp_posisi + " lamgkah");
            System.out.println("posisi " + this.pemain + " sekarang " + this.posisi);
            this.posisi = this.tangga(this.posisi);
            this.posisi = this.ular(this.posisi);
        }
        if (this.posisi == 100)
            this.menang = true;
    }

    public void bonus(int dadu) {
        Random random = new Random();
        while (dadu == 6 && !this.menang) {
            System.out.println("lemparan bonus (karena mendapat angka enam)");
            dadu = 1 + random.nextInt(6);
            System.out.println("dadu " + this.pemain + " : " + dadu);
            this.posisi += dadu;
            System.out.println("posisi " + this.pemain + " : " + this.posisi);
            this.posisi = this.tangga(this.posisi);
            this.posisi = this.ular(this.posisi);

        }
        this.cek();

    }

    public void bermain() {
        int dadu = 1 + random.nextInt(6);
        System.out.println("dadu " + this.pemain + " : " + dadu);
        this.posisi += dadu;
        System.out.println("posisi " + this.pemain + " : " + this.posisi);
        this.posisi = this.tangga(this.posisi);
        this.posisi = this.ular(this.posisi);
        this.cek();
        this.bonus(dadu);
    }

    public int tangga(int posisi) {
        this.posisi = posisi;
        switch (posisi) {
            case 3:
                this.posisi = 21;
                System.out.println("pemain " + this.pemain + " naik tangga ke " + this.posisi);
                break;
            case 8:
                this.posisi = 30;
                System.out.println("pemain " + this.pemain + " naik tangga ke " + this.posisi);
                break;
            case 28:
                this.posisi = 84;
                System.out.println("pemain " + this.pemain + " naik tangga ke " + this.posisi);
                break;
            case 58:
                this.posisi = 77;
                System.out.println("pemain " + this.pemain + " naik tangga ke " + this.posisi);
                break;
            case 75:
                this.posisi = 86;
                System.out.println("pemain " + this.pemain + " naik tangga ke " + this.posisi);
                break;
            case 80:
                this.posisi = 100;
                System.out.println("pemain " + this.pemain + " naik tangga ke " + this.posisi);
                break;
            case 90:
                this.posisi = 91;
                System.out.println("pemain " + this.pemain + " naik tangga ke " + this.posisi);
                break;

        }
        return this.posisi;

    }

    public int ular(int posisi) {
        this.posisi = posisi;
        switch (posisi) {
            case 17:
                this.posisi = 12;
                System.out.println("pemain" + this.pemain + " kena ular turun ke" + this.posisi);
                break;
            case 52:
                this.posisi = 29;
                System.out.println("pemain" + this.pemain + " kena ular turun ke" + this.posisi);
                break;
            case 57:
                this.posisi = 48;
                System.out.println("pemain" + this.pemain + " kena ular turun ke" + this.posisi);
                break;
            case 62:
                this.posisi = 22;
                System.out.println("pemain" + this.pemain + " kena ular turun ke" + this.posisi);
                break;
            case 88:
                this.posisi = 18;
                System.out.println("pemain" + this.pemain + " kena ular turun ke" + this.posisi);
                break;
            case 80:
                this.posisi = 100;
                System.out.println("pemain" + this.pemain + " kena ular turun ke" + this.posisi);
                break;
            case 95:
                this.posisi = 51;
                System.out.println("pemain" + this.pemain + " kena ular turun ke" + this.posisi);
                break;
            case 97:
                this.posisi = 79;
                System.out.println("pemain" + this.pemain + " kena ular turun ke" + this.posisi);
                break;
        }
        return this.posisi;

    }


}
