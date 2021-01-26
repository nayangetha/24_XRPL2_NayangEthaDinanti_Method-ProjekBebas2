package bebas2;

//fungsi scanner untuk menginputkan dari user
import java.util.Scanner;

public class voidclass {
    
    //scanner input untuk memasukkan input dari user
    Scanner input = new Scanner(System.in);
    
    //deklarasi variabel lokal
    String ktp, nama, panggilan, kelamin,ttl, agama, alamat, tinggi, darah,
            telp, sd, smp, sma, kerja;
    
    //method nonvoid string data pertama
    String data1(){
        return " # Data Personal" ;
    }
    
    //method void personal berisikan input user untuk data personal
    void personal(){
        
        System.out.println("");
        
        System.out.print("No KTP                    : ");
        ktp = input.nextLine();
        
        System.out.print("Nama Lengkap              : ");
        nama = input.nextLine();
        
        System.out.print("Nama Panggilan            : ");
        panggilan = input.nextLine();
        
        System.out.print("Jenis Kelamin             : ");
        kelamin = input.nextLine();
        
        System.out.print("Tempat/Tanggal Lahir      : ");
        ttl = input.nextLine();
        
        System.out.print("Agama                     : ");
        agama = input.nextLine();
        
        System.out.print("Alamat Lengkap            : ");
        alamat = input.nextLine();
        
        System.out.print("Tinggi Badan (dalam cm)   : ");
        tinggi = input.nextLine();
        
        System.out.print("Golongan Darah            : ");
        darah = input.nextLine();
        
        System.out.print("No Telp                   : ");
        telp = input.nextLine();
    }
    
    //method nonvoid string data kedua
    String data2(){
        return " # Riwayat Pendidikan";
    }
    
    //method void pendidikan berisikan input user untuk data pendidikan
    void pendidikan(){
        
        System.out.println("");
        
        System.out.print("SD                        : ");
        sd = input.nextLine();
        
        System.out.print("SMP/MTS                   : ");
        smp = input.nextLine();
        
        System.out.print("SMA/SMK/MA                : ");
        sma = input.nextLine();
    }
    
    //method non void data ketiga
    String data3(){
        return " # Pengalaman Kerja";
    }
    
    //method void kerja berisikan input user untuk data pekerjaan
    void kerja(){
        
        System.out.println("");
        
        System.out.print("Pengalaman Kerja Terakhir : ");
        kerja = input.nextLine();
    }
    
    //method nonvoid string untuk mengembalikan nilai ktp yang telah di input user
    String ktp(){
        return ktp;
    }
    
    //method nonvoid string untuk mengembalikan nilai nama yang telah di input user
    String nama(){
        return nama;
    }
    
    //method nonvoid string untuk mengembalikan nilai panggilan yang telah di input user
    String panggilan(){
        return panggilan;
    }
    
    //method nonvoid string untuk mengembalikan nilai kelamin yang telah di input user
    String kelamin(){
        return kelamin;
    }
    
    //method nonvoid string untuk mengembalikan nilai ttl yang telah di input user
    String ttl(){
        return ttl;
    }
    
    //method nonvoid string untuk mengembalikan nilai agama yang telah di input user
    String agama(){
        return agama;
    }
    
    //method nonvoid string untuk mengembalikan nilai alamat yang telah di input user
    String alamat(){
        return alamat;
    }
    
    //method nonvoid string untuk mengembalikan nilai tinggi yang telah di input user
    String tinggi(){
        return tinggi;
    }
    
    //method nonvoid string untuk mengembalikan nilai darah yang telah di input user
    String darah(){
        return darah;
    }
    
    //method nonvoid string untuk mengembalikan nilai telp yang telah di input user
    String telp(){
        return telp;
    }
    
    //method nonvoid string untuk mengembalikan nilai sd yang telah di input user
    String sd(){
        return sd;
    }
    
    //method nonvoid string untuk mengembalikan nilai smp yang telah di input user
    String smp(){
        return smp;
    }
    
    //method nonvoid string untuk mengembalikan nilai sma yang telah di input user
    String sma(){
        return sma;
    }
    
    //method nonvoid string untuk mengembalikan nilai kerja yang telah di input user
    String pkerja(){
        return kerja;
    }
}


