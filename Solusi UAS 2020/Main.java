package UAS.Java;

public class main {

    public static void main(String[] args) {
        Pemain pemain1 = new Pemain("A");
        Pemain pemain2 = new Pemain("B");
        int a = Pemain.lempar(pemain1);
        int b = Pemain.lempar(pemain2);
        while (pemain1.urutan == 0 && pemain2.urutan == 0) {
            if (a > b) {
                pemain1.urutan = 1;
                pemain2.urutan = 2;
                System.out.println("Pemain A mendapat giliran pertama");
                System.out.println("Pemain B mendapat giliran kedua");
            } else if (a == b) {
                System.out.println("Karena Dadu awal sama maka lemparan diulang");
                a = Pemain.lempar(pemain1);
                b = Pemain.lempar(pemain2);
            } else {
                pemain2.urutan = 1;
                pemain1.urutan = 2;
                System.out.println("Pemain B mendapat giliran pertama");
                System.out.println("Pemain A mendapat giliran kedua");

            }
        }

        int putaran = 1;
        System.out.println("============================");
        System.out.println("Posisi awal pemain: " + pemain1.pemain + ":" + pemain1.posisi);
        System.out.println("Posisi awal pemain: " + pemain2.pemain + ":" + pemain2.posisi);
        while (!pemain1.menang && !pemain2.menang) {
            System.out.println("============================");
            System.out.println("Putaran ke " + putaran);
            System.out.println("----");
            putaran += 1;
            if (pemain1.urutan == 1) {
                pemain1.bermain();
                pemain2.bermain();
            } else {
                pemain2.bermain();
                pemain1.bermain();
            }
        }


        System.out.println("============================");
        if (pemain1.menang) {
            System.out.println("Pemain " + pemain1.pemain + " menang");
            System.out.println("Posisi " + pemain2.pemain + " "+pemain2.posisi);
        } else if (pemain2.menang) {
            System.out.println("Pemain " + pemain2.pemain + " menang");
            System.out.println("Posisi " + pemain1.pemain + " "+pemain1.posisi);
        }


    }


}
