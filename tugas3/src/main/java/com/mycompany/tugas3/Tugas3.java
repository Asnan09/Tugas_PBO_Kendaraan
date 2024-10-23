/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tugas3;

/**
 *
 * @author LENOVO GK
 */

// Kelas induk (parent class)
class Kendaraan {
    protected String merk;
    protected int tahunProduksi;
    
    // Constructor kelas induk
    public Kendaraan(String merk, int tahunProduksi) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }
    
    // Method yang akan di-override oleh kelas anak
    public void bergerak() {
        System.out.println("Kendaraan bergerak");
    }
    
    // Method untuk menampilkan informasi kendaraan
    public void tampilInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }
}

// Kelas anak pertama - mendemonstrasikan inheritance
class Mobil extends Kendaraan {
    private String tipeBody;
    
    // Constructor kelas anak memanggil constructor parent menggunakan super()
    public Mobil(String merk, int tahunProduksi, String tipeBody) {
        super(merk, tahunProduksi);
        this.tipeBody = tipeBody;
    }
    
    // Override method bergerak - mendemonstrasikan polymorphism
    @Override
    public void bergerak() {
        System.out.println("Mobil melaju di jalan raya");
    }
    
    // Method tambahan khusus untuk Mobil
    public void klakson() {
        System.out.println(merk + " membunyikan klakson: Tin! Tin!");
    }
}

// Kelas anak kedua - mendemonstrasikan inheritance
class Motor extends Kendaraan {
    private String jenisMotor;
    
    // Constructor kelas anak
    public Motor(String merk, int tahunProduksi, String jenisMotor) {
        super(merk, tahunProduksi);
        this.jenisMotor = jenisMotor;
    }
    
    // Override method bergerak - mendemonstrasikan polymorphism
    @Override
    public void bergerak() {
        System.out.println("Motor bergerak dengan lincah");
    }
    
    // Method tambahan khusus untuk Motor
    public void wheelie() {
        System.out.println(merk + " melakukan wheelie!");
    }
}

public class Tugas3 {
    public static void main(String[] args) {
        // Membuat objek dari kelas-kelas turunan
        Mobil mobil = new Mobil("Toyota", 2022, "SUV");
        Motor motor = new Motor("Honda", 2023, "Sport");
        
        // Demonstrasi inheritance - mengakses method dari kelas induk
        System.out.println("=== Informasi Mobil ===");
        mobil.tampilInfo();  // Method dari kelas induk
        mobil.bergerak();    // Method yang di-override
        mobil.klakson();     // Method khusus Mobil
        
        System.out.println("\n=== Informasi Motor ===");
        motor.tampilInfo();   // Method dari kelas induk
        motor.bergerak();     // Method yang di-override
        motor.wheelie();      // Method khusus Motor
        
        // Demonstrasi polymorphism menggunakan array
        System.out.println("\n=== Demonstrasi Polymorphism ===");
        Kendaraan[] daftarKendaraan = {mobil, motor};
        
        for (Kendaraan kendaraan : daftarKendaraan) {
            kendaraan.bergerak();  // Setiap kendaraan akan bergerak sesuai jenisnya
        }
    }
}