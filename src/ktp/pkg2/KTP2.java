/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktp.pkg2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class KTP2 {

   public static void main(String[] args) {


BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
int data =0;
String[] nik                = new String[30];
String[] rtrw               = new String[30];
String[] berlakuHingga      = new String[30];
String[] nama               = new String[30];
String[] tempat_TglLahir    = new String[50];
String[] jenisKelamin       = new String[30];
String[] kelDesa            = new String[50];
String[] Kecamatan          = new String[40];
String[] Agama              = new String[30];
String[] statusPerkawinan   = new String[30];
String[] Pekerjaan          = new String[30];
String[] kewarganegaraan    = new String[30];


System.out.println("BIODATA");
System.out.println("+=========================INPUTAN=========================+");
try{
    System.out.println("Masukkan banyak data = ");
    data = Integer.parseInt(input.readLine());
    for (int a=1;a<=data;a++){
         System.out.println("------Data ke-"+ a +"------");
         System.out.print("Masukan NIK                = ");
            nik[a] = input.readLine();
         System.out.print("Masukan Nama               = ");
            nama[a] = input.readLine();
         System.out.print("Masukan Tempat/Tgl.Lahir   = ");
            tempat_TglLahir[a] = input.readLine();
         System.out.print("Masukan Jenis Kelamin      = ");
            jenisKelamin[a] = input.readLine();
         System.out.print("Masukan RT/RW              = ");
            rtrw[a] = input.readLine();
         System.out.print("Masukan Kel./Desa          = ");
            kelDesa[a] = input.readLine();
         System.out.print("Masukan Kecamatan          = ");
            Kecamatan[a] = input.readLine();
         System.out.print("Masukan Agama              = ");
            Agama[a] = input.readLine();
         System.out.print("Masukan Status Perkawinan  = ");
            statusPerkawinan[a] = input.readLine();
         System.out.print("Masukan Pekerjaan          = ");
            Pekerjaan[a] = input.readLine();
         System.out.print("Masukan Kewarganegaraan    = ");
            kewarganegaraan[a] = input.readLine();
         System.out.print("Masukan Berlaku hingga     = ");
            berlakuHingga[a] = input.readLine();
     }
} catch (Exception e ){
  System.out.println("Error");
}
for (int a=1; a<=data;a++){
     System.out.println("Data ke- " + a);
}
    System.out.println("+=========================HASIL OUTPUT=========================+");
System.out.println("##SELAMAT KTP BERHASIL DI CETAK##\n");

for (int a=1; a<=data;a++){
    System.out.println("                PROVINSI JAWA TIMUR\n"
                     + "                 KABUPATEN JOMBANG");
    System.out.println("NIK               :"+nik[a]);
    System.out.println("Nama              :"+nama[a]);
    System.out.println("Tempat/Tgl.Lahir  :"+tempat_TglLahir[a]);
    System.out.println("Jenis Kelamin     :"+jenisKelamin[a] );
    System.out.println("RT/RW             :"+rtrw[a] );
    System.out.println("Kel./Desa         :"+kelDesa[a] );
    System.out.println("Kecamatan         :"+Kecamatan[a] );
    System.out.println("Agama             :"+Agama[a] );
    System.out.println("Status Perkawinan :"+statusPerkawinan[a] );
    System.out.println("Pekerjaan         :"+Pekerjaan[a] );
    System.out.println("Kewarganegaraan   :"+kewarganegaraan[a] );
    System.out.println("Berlaku hingga    :"+berlakuHingga[a] );
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
  }
}