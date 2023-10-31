package node;

public class Node_OrtuMahasiswa {
    String noktp;
    String nama;
    String alamat;
    String notelp;

    public Node_OrtuMahasiswa(String noktp , String nama , String alamat , String notelp){
        this.noktp = noktp;
        this.nama = nama;
        this.alamat = alamat;
        this.notelp = notelp;
    }
    public void ViewDataortu (){
        System.out.println("No KTP : " + this.noktp);
        System.out.println("Nawa Wali : " + this.nama);
        System.out.println("Alamat : "+ this.alamat);
        System.out.println("No Telp Wali : " + this.notelp);
    }
}
