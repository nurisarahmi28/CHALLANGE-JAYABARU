/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokoSepatuJayaBaru;

import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


/**
 *
 * @author humankyuti.
 */

public class kasir {

    public static void main(String[] args) {
        String r;
        int warna;
        int size;
        int choice;
        int b;
        int jumlahbarang;
        int diskon;
        int harga;
        int total;
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        Scanner hallo = new Scanner(System.in);
        System.out.println("=== Mesin Kasir toko jayaBaru ===");
        System.out.println("-----------------------------------------------");
        System.out.println("  ...........................................  ");
        System.out.print("masukkan nama pembeli : ");
        r = hallo.next();
        System.out.println("Pilih kategori sepatu ");
        System.out.println("1.sepatu lari ");
        System.out.println("2.sepatu santai ");
        System.out.println("3.sepatu olahraga ");
        System.out.println("4.sepatu kantoran ");
        System.out.println("barang kosong");
        System.out.println("1.sepatu lari adidas cowok ukuran 30");
        System.out.println("2.sepatu santai vans cewek ukuran 25");
        System.out.println("3.sepatu olahraga puma cewek ukuran 26");
        System.out.print("pilihan Anda : ");
        choice = hallo.nextInt();
        switch (choice) {
            case 1:
                System.out.println("pilih merk : ");
                System.out.println("1.adidas");
                System.out.println("2.nike ");
                System.out.println("3.puma");
                System.out.print("pilihan Anda : ");
                choice = hallo.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("pilih kategori : ");
                        System.out.println("1.cowok ");
                        System.out.println("2.cewek ");
                        System.out.print("pilihan Anda : ");
                        choice = hallo.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("pilih size : ");
                                System.out.println("1.30");
                                System.out.println("2.31");
                                System.out.println("3.32");
                                System.out.println("4.33");
                                System.out.println("5.34");
                                System.out.print("pilihan Anda : ");
                                choice = hallo.nextInt();
                                switch (choice) {
                                    case 1:
                                        
                                        System.out.println("===warna yang tersedia=== : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.white ");
                                        System.out.print("pilihan Anda : ");
                                        warna = hallo.nextInt();

                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 9000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli : " + r);
                                        System.out.println("jenis sepatu : lari ");
                                        System.out.println("merk sepati : adidas");
                                        System.out.println("size sepatu : 30");
                                        System.out.println("warna sepatu : black");
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 000000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();

                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        }
                                        break;

                                    case 2:
                                        System.out.println("------warna yang tersedia : ---------");
                                        System.out.println("1.black ");
                                        System.out.println("2.white ");
                                        System.out.println("3.blue ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 9000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli : " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        }
                                        break;
                                    case 3:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.gold ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 9000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli : " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        }
                                        break;
                                    case 4:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("maaf kosong");

                                        break;
                                    case 5:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 9000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli : " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        }
                                        break;
                                    default:
                                        System.out.println("maaf, pilihan Anda illegal");
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("pilih size : ");
                                System.out.println("1.25");
                                System.out.println("2.26");
                                System.out.println("3.27");
                                System.out.println("4.28");
                                System.out.println("5.29");
                                System.out.println("pilihan Anda : ");
                                choice = hallo.nextInt();
                                switch (choice) {
                                    case 1:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.yellow ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 9000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        }
                                        break;
                                    case 2:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.red");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 9000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        }
                                        break;
                                    case 3:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.red ");
                                        System.out.println("2.blue ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 9000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        }
                                        break;
                                    case 4:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.green ");
                                        System.out.println("2.black ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 9000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        }
                                        break;
                                    case 5:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.orange");
                                        System.out.println("2.black ");
                                        System.out.println("3.red");
                                        System.out.println("4.white");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 9000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        }
                                    default:
                                        System.out.println("maaf, pilihan Anda illegal");
                                        break;

                                }

                        }
                        break;
                    case 2:
                        System.out.println("pilih kategori : ");
                        System.out.println("1.cowok ");
                        System.out.println("2.cewek ");
                        System.out.print("pilihan Anda : ");
                        choice = hallo.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("pilih size : ");
                                System.out.println("1.30");
                                System.out.println("2.31");
                                System.out.println("3.32");
                                System.out.println("4.33");
                                System.out.println("5.34");
                                System.out.print("pilihan Anda : ");
                                choice = hallo.nextInt();
                                switch (choice) {
                                    case 1:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.white ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 8000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        }
                                        break;

                                    case 2:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.white ");

                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 8000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow .info();
                                        }
                                        break;
                                    case 3:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");

                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 8000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow  = new barang(harga, diskon, total, jumlahbarang);
                                            glow .info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow  = new barang(harga, diskon, total, jumlahbarang);
                                            glow .info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow  = new barang(harga, diskon, total, jumlahbarang);
                                            glow .info();
                                        }
                                        break;
                                    case 4:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 8000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow  = new barang(harga, diskon, total, jumlahbarang);
                                            glow .info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow  = new barang(harga, diskon, total, jumlahbarang);
                                            glow .info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow .info();
                                        }
                                        break;
                                    case 5:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.white ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 8000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow .info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow  = new barang(harga, diskon, total, jumlahbarang);
                                            glow .info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow  = new barang(harga, diskon, total, jumlahbarang);
                                            glow .info();
                                        }
                                    default:
                                        System.out.println("maaf, pilihan Anda illegal");
                                        break;
                                }
                                break;
                         case 2:
                                System.out.println("pilih size : ");
                                System.out.println("1.25");
                                System.out.println("2.26");
                                System.out.println("3.27");
                                System.out.println("4.28");
                                System.out.println("5.29");
                                System.out.println("pilihan Anda : ");
                                choice = hallo.nextInt();
                                switch (choice) {
                              case 1:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.yellow ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 8000000 * jumlahbarang;
                                        System.out.println("===== kasir reza====");
                                         System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 3) {
                                             System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        }
                                        break;
                                case 2:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.red");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 8000000 * jumlahbarang;
                                        System.out.println("===== kasir reza====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        }
                                        break;
                                case 3:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.red ");
                                        System.out.println("2.blue ");
                                        System.out.print("pilihan Anda : ");
                                 b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 8000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                             total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                             total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                        }
                                break;
                                case 4:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.green ");
                                        System.out.println("2.black ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 8000000 * jumlahbarang;
                                System.out.println("===== kasir reza====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 3) {
                                             System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        }
                                        break;
                                        }
                         case 5:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.orange");
                                        System.out.println("2.black ");
                                        System.out.println("3.red");
                                        System.out.println("4.white");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                     System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 8000000 * jumlahbarang;
                                        System.out.println("===== kasir reza====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                             barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                             } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        }
                                    default:
                                        System.out.println("maaf, pilihan Anda illegal");
                                        break;
                                        }
                
                }
        break;
            case 3:
        System.out.println("pilih kategori : ");
                        System.out.println("1.cowok ");
                        System.out.println("2.cewek ");
                        System.out.print("pilihan Anda : ");
                        choice = hallo.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("pilih size : ");
                                System.out.println("1.30");
                                System.out.println("2.31");
                                System.out.println("3.32");
                                System.out.println("4.33");
                                System.out.println("5.34");
                                System.out.print("pilihan Anda : ");
                                choice = hallo.nextInt();
                                switch (choice) {
                                    case 1:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.white ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 5000000 * jumlahbarang;
                                        System.out.println("===== kasir reza====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                             total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                             } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                             total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        }
                                        break;
                                        
                                         case 2:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.white ");

                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 5000000 * jumlahbarang;
                                        System.out.println("===== kasir reza====");
                                        System.out.println("nama pembeli " + r);
                                          if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        }
                                          break;
                                          case 3:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");

                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 5000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                             diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                             } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        }
                                        break;
                                        case 4:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 5000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                         System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        }
                                        break;
                                        case 5:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.white ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                         harga = 5000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                             total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        }
                                         default:
                                        System.out.println("maaf, pilihan Anda illegal");
                                        break;

                                }
                                break;
                                case 2:
                                System.out.println("pilih size : ");
                                System.out.println("1.25");
                                System.out.println("2.26");
                                System.out.println("3.27");
                                System.out.println("4.28");
                                System.out.println("5.29");
                                System.out.print("pilihan Anda : ");
                                choice = hallo.nextInt();
                                switch (choice) {
                                    case 1:
                                         System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.yellow ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 5000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                         System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang (harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                             diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                             } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                             }
                                        break;
                                        case 2:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.red");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 5000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang (harga, diskon, total, jumlahbarang);
                                            glow.info();
                                             } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                              } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        }
                                        break;
                                        case 3:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.red ");
                                        System.out.println("2.blue ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 5000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                         System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                             diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                             } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        }
                                        break;
                                        case 4:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.green ");
                                        System.out.println("2.black ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 5000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                             barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 3) {
                                             System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        }
                                        break;
                                        case 5:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.orange");
                                        System.out.println("2.black ");
                                        System.out.println("3.red");
                                        System.out.println("4.white");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 5000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                             } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                            } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                             barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                            }
                                        default:
                                            System.out.println("maaf, pilihan anda not available");
                                            break;
                                }
                                
        }
        break;
            case 2:
                System.out.println(" pilih merk : ");
                System.out.println("1.vans");
                System.out.println("2.converse ");
                System.out.println("3.skechers");
                System.out.print("pilihan Anda : ");
                choice = hallo.nextInt();
                 switch (choice) {
                    case 1:
                        System.out.println("pilih kategori : ");
                        System.out.println("1.cowok ");
                        System.out.println("2.cewek ");
                        System.out.print("pilihan Anda : ");
                        choice = hallo.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("pilih size : ");
                                System.out.println("1.30");
                                System.out.println("2.31");
                                System.out.println("3.32");
                                System.out.println("4.33");
                                System.out.println("5.34");
                                System.out.print("pilihan Anda : ");
                                choice = hallo.nextInt();
                                switch (choice) {
                                    case 1:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.white ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        }
                                        break;
                                        case 2:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.white ");

                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        }
                                        break;
                                         case 3:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.white");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                         if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                              barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                             } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                             }
                                         break;
                                           case 4:

                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                             } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                             } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                             }
                                        break;
                                         case 5:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                              System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                             } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                            } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                              barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                            
                                        }
                                         default:
                                             System.out.println("maaf, pilihan Anda tidak ada");
                                        break;
                                }
                                break;
                                   case 2:
                                System.out.println("pilih size : ");
                                System.out.println("1.25");
                                System.out.println("2.26");
                                System.out.println("3.27");
                                System.out.println("4.28");
                                System.out.println("5.29");
                                System.out.print("pilihan Anda : ");
                                choice = hallo.nextInt();
                                switch (choice) {
                                      case 1:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("===== kasir reza====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                             } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                             } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                             barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                             }
                                        break;
                                           case 2:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("maaf kosong");

                                        break;
                                         case 3:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.red ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                         System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                             barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                             } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                             } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                             barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                             }
                                        break;
                                         case 4:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.gold ");
                                        System.out.println("2.silver ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                               barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                             } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                             barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                             } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                             barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                             }
                                        break;
                                         case 5:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.gold");
                                        System.out.println("2.silver ");
                                        System.out.println("3.black");
                                        System.out.println("4.white");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("===== kasir reza====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                              System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                            } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                             barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                              } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                             barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                              }
                                         default:
                                               System.out.println("maaf, pilihan Anda illegal");
                                        break;
                                }
                                
                        }
                        break;
                         case 2:
                        System.out.println("pilih kategori : ");
                        System.out.println("1.cowok ");
                        System.out.println("2.cewek ");
                        System.out.print("pilihan Anda : ");
                        choice = hallo.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("pilih size : ");
                                System.out.println("1.30");
                                System.out.println("2.31");
                                 System.out.println("3.32");
                                System.out.println("4.33");
                                System.out.println("5.34");
                                System.out.print("pilihan Anda : ");
                                choice = hallo.nextInt();
                                switch (choice) {
                                    case 1:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                         System.out.println("2.white ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 3000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                              System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                             barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                             } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                            } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                            }
                                        break;
                                        
                                         case 2:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.white ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 3000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                             barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                             } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                             barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                             } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                             barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                             }
                                        break;
                                        
                                         case 3:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                         jumlahbarang = hallo.nextInt();
                                        harga = 3000000 * jumlahbarang;
                                        System.out.println("===== kasir reza====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                              } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                               } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                               }
                                        break;
                                         case 4:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 3000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                             } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                             } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                             barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                             }
                                        break;
                                          case 5:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.white ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 3000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                         System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                    default:
                                        System.out.println("maaf, pilihan Anda illegal");
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("pilih size : ");
                                System.out.println("1.25");
                                System.out.println("2.26");
                                System.out.println("3.27");
                                System.out.println("4.28");
                                System.out.println("5.29");
                                System.out.print("pilihan Anda : ");
                                choice = hallo.nextInt();
                                switch (choice) {
                                    case 1:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.yellow ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 3000000 * jumlahbarang;
                                        System.out.println("===== kasir reza====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                            glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 2:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.red");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 3000000 * jumlahbarang;
                                        System.out.println("===== kasir reza====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 3:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.red ");
                                        System.out.println("2.blue ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 3000000 * jumlahbarang;
                                        System.out.println("===== kasir reza====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 4:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.green ");
                                        System.out.println("2.black ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 3000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 5:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.orange");
                                        System.out.println("2.black ");
                                        System.out.println("3.red");
                                        System.out.println("4.white");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 3000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                    default:
                                        System.out.println("maaf, pilihan Anda illegal");
                                        break;

                                }
                            default:
                                System.out.println("maaf, pilihan Anda illegal");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("pilih kategori : ");
                        System.out.println("1.cowok ");
                        System.out.println("2.cewek ");
                        System.out.print("pilihan Anda : ");
                        choice = hallo.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("pilih size : ");
                                System.out.println("1.30");
                                System.out.println("2.31");
                                System.out.println("3.32");
                                System.out.println("4.33");
                                System.out.println("5.34");
                                System.out.print("pilihan Anda : ");
                                choice = hallo.nextInt();
                                switch (choice) {
                                    case 1:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.white ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 200000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;

                                    case 2:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.white ");

                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 200000 * jumlahbarang;
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 3:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");

                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 200000 * jumlahbarang;
                                        System.out.println("===== kasir reza====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 4:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 200000 * jumlahbarang;
                                        System.out.println("===== kasir reza====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 5:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.white ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 200000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("pilih size : ");
                                System.out.println("1.25");
                                System.out.println("2.26");
                                System.out.println("3.27");
                                System.out.println("4.28");
                                System.out.println("5.29");
                                System.out.print("pilihan Anda : ");
                                choice = hallo.nextInt();
                                switch (choice) {
                                    case 1:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.yellow ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 200000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 2:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.red");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 200000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 3:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.red ");
                                        System.out.println("2.blue ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 7000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 4:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.green ");
                                        System.out.println("2.black ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 7000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 5:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.orange");
                                        System.out.println("2.black ");
                                        System.out.println("3.red");
                                        System.out.println("4.white");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 7000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;

                                }
                                break;

                    case 3:
                        System.out.println("pilih kategori : ");
                        System.out.println("1.cowok ");
                        System.out.println("2.cewek ");
                        System.out.print("pilihan Anda : ");
                        choice = hallo.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("pilih size : ");
                                System.out.println("1.30");
                                System.out.println("2.31");
                                System.out.println("3.32");
                                System.out.println("4.33");
                                System.out.println("5.34");
                                System.out.print("pilihan Anda : ");
                                choice = hallo.nextInt();
                                switch (choice) {
                                    case 1:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.white ");
                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 8000000 * jumlahbarang;
                                        System.out.println("===== kasir risa====");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;

                                    case 2:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.white ");

                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 8000000 * jumlahbarang;
                                        System.out.println("=========================== kasir risa ==========================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();                                        }
                                        break;
                                    case 3:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");

                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 8000000 * jumlahbarang;
                                        System.out.println("===================== kasir risa ===================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 4:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 8000000 * jumlahbarang;
                                        System.out.println("=========================== kasir risa ==============================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 5:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.white ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 8000000 * jumlahbarang;
                                        System.out.println("============================= kasir risa ===================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("pilih size : ");
                                System.out.println("1.25");
                                System.out.println("2.26");
                                System.out.println("3.27");
                                System.out.println("4.28");
                                System.out.println("5.29");
                                System.out.println("pilihan Anda : ");
                                choice = hallo.nextInt();
                                switch (choice) {
                                    case 1:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.yellow ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 8000000 * jumlahbarang;
                                        System.out.println("============================ kasir risa ============================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                          barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 2:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.red");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 8000000 * jumlahbarang;
                                        System.out.println("============================= kasir risa =======================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 3:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.red ");
                                        System.out.println("2.blue ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 8000000 * jumlahbarang;
                                        System.out.println("============================ kasir risa =======================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 4:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.green ");
                                        System.out.println("2.black ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 8000000 * jumlahbarang;
                                        System.out.println("=========================== kasir risa ===================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 5:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.orange");
                                        System.out.println("2.black ");
                                        System.out.println("3.red");
                                        System.out.println("4.white");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 8000000 * jumlahbarang;
                                        System.out.println("========================= kasir risa ==============================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                         break;
                                }
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("pilih kategori : ");
                        System.out.println("1.cowok ");
                        System.out.println("2.cewek ");
                        System.out.println("pilihan Anda : ");
                        choice = hallo.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("pilih size : ");
                                System.out.println("1.30");
                                System.out.println("2.31");
                                System.out.println("3.32");
                                System.out.println("4.33");
                                System.out.println("5.34");
                                System.out.println("pilihan Anda : ");
                                choice = hallo.nextInt();
                                switch (choice) {
                                    case 1:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.white ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 4000000 * jumlahbarang;
                                        System.out.println("========================= kasir risa =================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;

                                    case 2:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.white ");

                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 4000000 * jumlahbarang;
                                        System.out.println("======================= kasir risa ===================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 3:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");

                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 4000000 * jumlahbarang;
                                        System.out.println("======================= kasir risa ===========================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 4:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 4000000 * jumlahbarang;
                                        System.out.println("======================== kasir risa ===============================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 5:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.white ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 4000000 * jumlahbarang;
                                        System.out.println("========================= kasir risa ==============================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("pilih size : ");
                                System.out.println("1.25");
                                System.out.println("2.26");
                                System.out.println("3.27");
                                System.out.println("4.28");
                                System.out.println("5.29");
                                System.out.println("pilihan Anda : ");
                                choice = hallo.nextInt();
                                switch (choice) {
                                    case 1:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.yellow ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 4000000 * jumlahbarang;
                                        System.out.println("======================= kasir risa ===========================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 2:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.red");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 4000000 * jumlahbarang;
                                        System.out.println("============================ kasir risa ================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 3:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.red ");
                                        System.out.println("2.blue ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 4000000 * jumlahbarang;
                                        System.out.println("========================== kasir risa ==============================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 4:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.green ");
                                        System.out.println("2.black ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 4000000 * jumlahbarang;
                                        System.out.println("=========================== kasir risa ===========================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 5:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.orange");
                                        System.out.println("2.black ");
                                        System.out.println("3.red");
                                        System.out.println("4.white");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 4000000 * jumlahbarang;
                                        System.out.println("======================= kasir risa ==============================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                }
                                   }

                        }

                }
                break;
            case 4:
                System.out.println(" pilih merk : ");
                System.out.println("1.910");
                System.out.println("2.skechers ");
                System.out.println("3.vans ");
                System.out.println("4.converse ");
                System.out.println("5.fila");
                System.out.println("pilihan Anda : ");
                choice = hallo.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("pilih kategori : ");
                        System.out.println("1.cowok ");
                        System.out.println("2.cewek ");
                        System.out.println("pilihan Anda : ");
                        choice = hallo.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("pilih size : ");
                                System.out.println("1.30");
                                System.out.println("2.31");
                                System.out.println("3.32");
                                System.out.println("4.33");
                                System.out.println("5.34");
                                System.out.println("pilihan Anda : ");
                                choice = hallo.nextInt();
                                switch (choice) {
                                    case 1:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.white ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();

                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 200000 * jumlahbarang;
                                        System.out.println("============================= kasir risa ==========================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;

                                    case 2:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.white ");

                                        System.out.print("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.print("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 200000 * jumlahbarang;
                                        System.out.println("======================== kasir risa ==========================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 3:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.white");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("=========================== kasir risa =================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 4:

                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("========================== kasir risa =============================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                          barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 5:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("======================= kasir ris ======================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("pilih size : ");
                                System.out.println("1.25");
                                System.out.println("2.26");
                                System.out.println("3.27");
                                System.out.println("4.28");
                                System.out.println("5.29");
                                System.out.println("pilihan Anda : ");
                                choice = hallo.nextInt();
                                switch (choice) {
                                    case 1:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("==================== kasir risa ==========================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 2:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("maaf kosong");

                                        break;
                                    case 3:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.red ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("===================== kasir risa ===================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                          barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 4:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.gold ");
                                        System.out.println("2.silver ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("====================== kasir risa ======================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 5:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.gold");
                                        System.out.println("2.silver ");
                                        System.out.println("3.black");
                                        System.out.println("4.white");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("==================== kasir risa =======================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("pilih kategori : ");
                        System.out.println("1.cowok ");
                        System.out.println("2.cewek ");
                        System.out.println("pilihan Anda : ");
                        choice = hallo.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("pilih size : ");
                                System.out.println("1.30");
                                System.out.println("2.31");
                                System.out.println("3.32");
                                System.out.println("4.33");
                                System.out.println("5.34");
                                System.out.println("pilihan Anda : ");
                                choice = hallo.nextInt();
                                switch (choice) {
                                    case 1:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.white ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("==================== kasir risa ======================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                
                                        break;

                                    case 2:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.white ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("==================== kasir risa ========================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 3:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("=========================== kasir risa ============================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 4:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("======================= kasir risa ==============================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 5:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.white ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                         System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("==================== kasir risa ===========================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("pilih size : ");
                                System.out.println("1.25");
                                System.out.println("2.26");
                                System.out.println("3.27");
                                System.out.println("4.28");
                                System.out.println("5.29");
                                System.out.println("pilihan Anda : ");
                                choice = hallo.nextInt();
                                switch (choice) {
                                    case 1:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.yellow ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("============================= kasir risa ====================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 2:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.red");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("================================== kasir risa ===================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 3:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.red ");
                                        System.out.println("2.blue ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("=============================== kasir risa =================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 4:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.green ");
                                        System.out.println("2.black ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("=============================== kasir risa ============================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 5:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.orange");
                                        System.out.println("2.black ");
                                        System.out.println("3.red");
                                        System.out.println("4.white");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("=========================== kasir risa ===================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;

                                }
                                break;

                        }
                        break;
                    case 3:
                        System.out.println("pilih kategori : ");
                        System.out.println("1.cowok ");
                        System.out.println("2.cewek ");
                        System.out.println("pilihan Anda : ");
                        choice = hallo.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("pilih size : ");
                                System.out.println("1.30");
                                System.out.println("2.31");
                                System.out.println("3.32");
                                System.out.println("4.33");
                                System.out.println("5.34");
                                System.out.println("pilihan Anda : ");
                                choice = hallo.nextInt();
                                switch (choice) {
                                    case 1:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.white ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 3000000 * jumlahbarang;
                                        System.out.println("============================= kasir risa =================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;

                                    case 2:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.white ");

                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 3000000 * jumlahbarang;
                                        System.out.println("====================== kasir risa ================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 3:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");

                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 3000000 * jumlahbarang;
                                        System.out.println("======================== kasir risa ============================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 4:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 3000000 * jumlahbarang;
                                        System.out.println("================================ kasir risa ====================================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                          barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 5:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.white ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 3000000 * jumlahbarang;
                                        System.out.println("======================== kasir risoles ======================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                             } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("pilih size : ");
                                System.out.println("1.25");
                                System.out.println("2.26");
                                System.out.println("3.27");
                                System.out.println("4.28");
                                System.out.println("5.29");
                                System.out.println("pilihan Anda : ");
                                choice = hallo.nextInt();
                                switch (choice) {
                                    case 1:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.yellow ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 3000000 * jumlahbarang;
                                        System.out.println("============================= kasir risa ============================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                          barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 2:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.red");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 3000000 * jumlahbarang;
                                        System.out.println("================================ kasir risa ==============================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 3:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.red ");
                                        System.out.println("2.blue ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 3000000 * jumlahbarang;
                                        System.out.println("=========================== kasir risol ==========================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                        barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 4:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.green ");
                                        System.out.println("2.black ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 3000000 * jumlahbarang;
                                        System.out.println("============================== kasir risa ==========================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                          barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                          barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 5:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.orange");
                                        System.out.println("2.black ");
                                        System.out.println("3.red");
                                        System.out.println("4.white");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 3000000 * jumlahbarang;
                                        System.out.println("===================================== kasir risa =============================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                          barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                         barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("pilih kategori : ");
                        System.out.println("1.cowok ");
                        System.out.println("2.cewek ");
                        System.out.println("pilihan Anda : ");
                        choice = hallo.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("pilih size : ");
                                System.out.println("1.30");
                                System.out.println("2.31");
                                System.out.println("3.32");
                                System.out.println("4.33");
                                System.out.println("5.34");
                                System.out.println("pilihan Anda : ");
                                choice = hallo.nextInt();
                                switch (choice) {
                                    case 1:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.white ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 3000000 * jumlahbarang;
                                        System.out.println("=============================== kasir risa ==========================================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;

                                    case 2:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.white ");

                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 3000000 * jumlahbarang;
                                        System.out.println("==================================== kasir ris ======================================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 3:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 3000000 * jumlahbarang;
                                        System.out.println("======================================== kasir risa =================================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                         barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 4:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 3000000 * jumlahbarang;
                                        System.out.println("==================================== kasir risa ==========================================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                            
                                        }
                                        break;
                                    case 5:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.white ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 3000000 * jumlahbarang;
                                        System.out.println("======================================== kasir risa =================================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                          barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("pilih size : ");
                                System.out.println("1.25");
                                System.out.println("2.26");
                                System.out.println("3.27");
                                System.out.println("4.28");
                                System.out.println("5.29");
                                System.out.println("pilihan Anda : ");
                                choice = hallo.nextInt();
                                switch (choice) {
                                    case 1:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.yellow ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 3000000 * jumlahbarang;
                                        System.out.println("========================================= kasir risa ===================================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 2:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.red");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 3000000 * jumlahbarang;
                                        System.out.println("==================================== kasir risa ==================================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 3:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.red ");
                                        System.out.println("2.blue ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 3000000 * jumlahbarang;
                                        System.out.println("=================================== kasir risa ====================================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 4:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.green ");
                                        System.out.println("2.black ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 3000000 * jumlahbarang;
                                        System.out.println("========================= kasir risa ===============================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 5:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.orange");
                                        System.out.println("2.black ");
                                        System.out.println("3.red");
                                        System.out.println("4.white");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 3000000 * jumlahbarang;
                                        System.out.println("============================ kasir risa ===============================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                    case 5:
                        System.out.println("pilih kategori : ");
                        System.out.println("1.cowok ");
                        System.out.println("2.cewek ");
                        System.out.println("pilihan Anda : ");
                        choice = hallo.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("pilih size : ");
                                System.out.println("1.30");
                                System.out.println("2.31");
                                System.out.println("3.32");
                                System.out.println("4.33");
                                System.out.println("5.34");
                                System.out.println("pilihan Anda : ");
                                choice = hallo.nextInt();
                                switch (choice) {
                                    case 1:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.white ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("==================== kasir risa ===========================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;

                                    case 2:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.white ");

                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("============================= kasir risa =============================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                           barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 3:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.white");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("============================= kasir risa =================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                             barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 4:

                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("==================================== kasir risa ======================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                             barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                             barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                             barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 5:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("========================================== kasir risa ===========================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                         System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                             barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                             barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("pilih size : ");
                                System.out.println("1.25");
                                System.out.println("2.26");
                                System.out.println("3.27");
                                System.out.println("4.28");
                                System.out.println("5.29");
                                System.out.println("pilihan Anda : ");
                                choice = hallo.nextInt();
                                switch (choice) {
                                    case 1:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("===================================== kasir risa ====================================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                            barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 2:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("maaf kosong");

                                        break;
                                    case 3:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.black ");
                                        System.out.println("2.red ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("=========================== kasir risa ====================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                             barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                             barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                             barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 4:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("1.gold ");
                                        System.out.println("2.silver ");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;
                                        System.out.println("================================= kasir risa ============================================");
                                        System.out.println("nama pembeli " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                             barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                             barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                             barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                        break;
                                    case 5:
                                        System.out.println("warna yang tersedia : ");
                                        System.out.println("||  1.gold  ||");
                                        System.out.println("||  2.silver   ||");
                                        System.out.println("||  3.black  ||");
                                        System.out.println("||  4.white  ||");
                                        System.out.println("pilihan Anda : ");
                                        b = hallo.nextInt();
                                        System.out.println("jumlah barang yang ingin di beli :");
                                        jumlahbarang = hallo.nextInt();
                                        harga = 2000000 * jumlahbarang;

                                        System.out.println("Kertas Casier");
                                        System.out.println("Nama Casier : risol cantekk");
                                        System.out.println("nama pembeli : " + r);
                                        if (jumlahbarang == 1) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 00000;
                                            total = harga - diskon;
                                             barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 2) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 50000;
                                            total = harga - diskon;
                                             barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        } else if (jumlahbarang == 3) {
                                            System.out.print("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                                            diskon = 100000;
                                            total = harga - diskon;
                                             barang glow = new barang(harga, diskon, total, jumlahbarang);
                                           glow.info();
                                        }
                                    default:
                                        System.out.println("maaf, pilihan Anda illegal");
                                        break;

                                }
                            default:
                                System.out.println("maaf, pilihan Anda illegal");
                                break;

                }
            default:
                System.out.println("maaf, pilihan Anda illegal");
                break;
        }
        System.out.println("==Terima kasih telah berbelanja dan ditunggu kedatangannya kembali==");
        System.out.println("===========================================================================");

    }
    }
}
