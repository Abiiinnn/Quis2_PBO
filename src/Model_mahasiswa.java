import node.Node_mahasiswa;

import java.util.ArrayList;

public class Model_mahasiswa {
    ArrayList<Node_mahasiswa> siswa;
    public Model_mahasiswa(){
        this.siswa = new ArrayList<>();
    }
    public void InsertMahasiswa(String nama , String npm,String  telp){
        int index = siswa.size();
        this.siswa.add(new Node_mahasiswa(nama,npm,telp));
    }
    public void ViewallMahasiswa(){
        for (int i = 0 ; i < siswa.size();i++){
            this.siswa.get(i).View_datadiri();

        }
    }

}
