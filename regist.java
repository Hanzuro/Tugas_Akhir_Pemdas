import java.util.ArrayList;
import java.util.Scanner;
import java.text.NumberFormat;

public class regist {

    public static void masukBarang(){
        Scanner input = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getNumberInstance();

        int i = 0;
        ArrayList<String> listBarang = new ArrayList<>();

        String[] yrden = new String[100];
        String[] axii = new String[100];
        String[] agni = new String[100];

        String toko = "TG";
        int kode = 0, numer = 1;

        boolean start = true;
        while (start){

        System.out.println("Masukan nama barang: ");
        String nama = input.nextLine().toUpperCase();
        
        System.out.println("Masukan harga barang: ");
        int harga = input.nextInt();
        input.nextLine();
        
        System.out.println("Masukan jumlah barang (contoh : 12 pcs): ");
        String jumlah = input.nextLine();
        
        System.out.println("Masukan tanggal (HARI/BULAN/TAHUN) dalam angka:");
        String tanggal = input.nextLine();
        
        String [] order = tanggal.split("/");
        int hari = Integer.parseInt(order[0]), bulan = Integer.parseInt(order[1]), tahun = Integer.parseInt(order[2]);
        if (hari < 1 || hari > 31 || bulan < 1 || bulan >12){
            System.out.println("Tanggal tidak valid, tolong masukan kembali");
            continue;
        } else if ( tahun < 2024){
            System.out.println("Beneran nih masuk tahun segini? (Ya/Tidak)");
            String jawaban = input.nextLine();
            if (jawaban.equalsIgnoreCase("tidak")){
                System.out.println("Masukin lagi deh yang bener...\n");
                continue;
            } else if (jawaban.equalsIgnoreCase("ya")){
            }
        }
        String [] waser  = jumlah.split (" ");
        
        
        int banyak = Integer.parseInt(waser[0]);
        String jenis = waser[1].toUpperCase().substring(0,3);
        String rupiah = nf.format(harga);
        String inisial = nama.substring(0,2);

        yrden[i] = nama;
        axii[i] = rupiah;
        agni[i] = jumlah;


        System.out.printf("Nama barang : %s\n",yrden[i]);
        System.out.printf("Kode barang :%s%s%s%s|%s%02d%03d%s\n",toko,order[0],order[1],order[2],inisial,kode++,banyak,jenis);
        System.out.printf("Harga barang : Rp%s,00\n",axii[i]);
        System.out.printf("Banyak barang : %s\n",agni[i]);
        System.out.printf("Tanggal masuk : %s\n",tanggal);

        System.out.println("----------------------------------");
        System.out.println("\n");

        System.out.println("Apakah ada barang lain yang ingin dimasukan?");
        System.out.println("1. Ya");
        System.out.println("2. Tidak");
        int pilih1 = input.nextInt();
        if (pilih1==2){
            start = false;
            System.out.println("Data telah disimpan\nFIAT LUX!");
            System.out.println("List Barang:");
            System.out.println("----------------------------------");
            for (int j = 0 ; j<i+1;j++) {
                String list = yrden[j]+": Rp"+axii[j]+",00 "+"("+agni[j]+")";
                listBarang.add(list);
            }
            for (String zekrom : listBarang){
                System.out.printf("%d. %s\n",numer++,zekrom);
            }
            
            System.out.println("----------------------------------");
            System.out.println("Ingin kembali ke menu utama?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            int pilih2 = input.nextInt();
            if (pilih2==1){
                inventaris.main(null);
            } else if (pilih2 == 2){
                System.exit(0);
            }

        } else if (pilih1==1){
            input.nextLine();
            i++;
            continue;
        } else {
            System.out.println("Masukin yang bener lah...");
            continue;
        }
    }
    input.close();
    }
    
}
