package node;

import java.util.Date;

public class Node_Pembayaran {
    String harga;
    Date Tanggal;
    String nama_kasir;
    public Node_Pembayaran(String harga, Date Tanggal , String nama_kasir){
       this.harga = harga;
       this.Tanggal = Tanggal;
       this.nama_kasir = nama_kasir;
    }
    public void ViewStruk(){
        System.out.println("Harga : " + this.harga);
        System.out.println("Tanggal Pembayaran : " + this.Tanggal);
        System.out.println("Nama Kasir : " + this.nama_kasir);
    }

}
