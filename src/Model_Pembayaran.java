import node.Node_Pembayaran;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;

public class Model_Pembayaran {
    ArrayList<Node_Pembayaran> bayar;
    public Model_Pembayaran(){
        this.bayar = new ArrayList<>();
    }
    public void InsertPembayaran(String harga,String nama_kasir){
        int index= bayar.size();
        this.bayar.add(new Node_Pembayaran(harga,new Date(),nama_kasir));
    }
    public void ViewStrukall (){
        for (int i = 0 ; i < bayar.size();i++){
            this.bayar.get(i).ViewStruk();
            System.out.println("_______________________");
        }
    }
}
