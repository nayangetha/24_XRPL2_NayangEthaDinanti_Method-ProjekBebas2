package bebas2;

//fungsi scanner untuk menginputkan dari user
import java.util.Scanner;

public class mainclass {
    
    //method static
    static void tampilan(){
        
        //scanner input untuk memasukkan input dari user
        Scanner input=new Scanner(System.in);
        
        System.out.println("Isilah data dibawah ini dengan benar!");
        System.out.println("=====================================");
        System.out.println("");
        
        //objek
        voidclass tampil = new voidclass();
        
        //pemanggilan method void dari kelas voidclass menggunakan objek tampil
        System.out.println(tampil.data1());    //pemanggilan method nonvoid string data1
        tampil.personal();                     // pemanggilan method void personal
        System.out.println("");                
        System.out.println(tampil.data2());    //pemanggilan method nonvoid string data2
        tampil.pendidikan();                   //pemanggilan method void pendidikan
        System.out.println("");
        System.out.println(tampil.data3());    //pemanggilan method nonvoid string data3
        tampil.kerja();                        //pemanggilan method void kerja
        System.out.println("=====================================");
        System.out.println("");
        
        System.out.println("Apakah anda yakin data tersebut sudah benar? (Ya/Tidak)");
        String jawab = input.nextLine();
        
        System.out.println("");
        System.out.println("=====================================");
        System.out.println("");
        
        //percabangan dan equals string
        if(jawab.equalsIgnoreCase("Ya")){
            System.out.println("    ╔══════════════════╗");
            System.out.println("            BIODATA PRIBADI     ");
            System.out.println("    ╚══════════════════╝");
            System.out.println("");
            System.out.println(tampil.data1());        //pemanggilan method nonvoid data1
            System.out.println("");
            System.out.println("► No KTP               = "+tampil.ktp());          //pemanggilan method nonvoid string ktp       
            System.out.println("► Nama Lengkap         = "+tampil.nama());         //pemanggilan method nonvoid string nama
            System.out.println("► Nama Panggilan       = "+tampil.panggilan());    //pemanggilan method nonvoid string panggilan
            System.out.println("► Jenis Kelamin        = "+tampil.kelamin());      //pemanggilan method nonvoid string kelamin
            System.out.println("► Tempat/Tanggal Lahir = "+tampil.ttl());          //pemanggilan method nonvoid string ttl
            System.out.println("► Agama                = "+tampil.agama());        //pemanggilan method nonvoid string agama
            System.out.println("► Alamat Lengkap       = "+tampil.alamat());       //pemanggilan method nonvoid string alamat
            System.out.println("► Tinggi Badan         = "+tampil.tinggi()+" cm"); //pemanggilan method nonvoid string tinggi
            System.out.println("► Golongan Darah       = "+tampil.darah());        //pemanggilan method nonvoid string darah
            System.out.println("► Nomor Telepon        = "+tampil.telp());         //pemanggilan method nonvoid string telp
            System.out.println("");
            System.out.println(tampil.data2());        //pemanggilan method nonvoid data 2
            System.out.println("");
            System.out.println("► Sekolah Dasar (SD)   = "+tampil.sd());           //pemanggilan method nonvoid string sd
            System.out.println("► SMP / MTS            = "+tampil.smp());          //pemanggilan method nonvoid string smp
            System.out.println("► SMA / SMK / MA       = "+tampil.sma());          //pemanggilan method nonvoid sstring ma
            System.out.println("");
            System.out.println(tampil.data3());        //pemanggilan method nonvoid data3
            System.out.println("");
            System.out.println("► Pengalaman Kerja     = "+tampil.pkerja());       //pemanggilan method nonvoid string pkerja
            System.out.println("");
            
            
        }
        else if(jawab.equalsIgnoreCase("Tidak")){
            System.out.println("Silahkan Mengulang Kembali!");
        }
    }
}
