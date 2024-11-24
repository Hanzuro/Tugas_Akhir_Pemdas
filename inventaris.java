import java.util.Scanner;

public class inventaris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----SELAMAT DATANG DI TOKO GARDHISTA----\n");
        System.out.println("Silahkan pilih mode:");
        System.out.println("1. Masuk");
        System.out.println("2. Cari");
        System.out.println("3. Hapus");
        System.out.println("4. Keluar");
        int mode = input.nextInt();

        switch (mode){
            case 1 : 
                regist.masukBarang(); 
                break;
            
            case 2 : System.out.println("Maaf, mode belum tersedia :("); break;
            case 3 : System.out.println("Maaf, mode belum tersedia :("); break;
            case 4 : System.out.println("Sampai Jumpa Nanti!\nFIAT LUX!"); break;
            default : System.out.println("Mode tidak tersedia"); break;

        }
     input.close();   
    }
    
}