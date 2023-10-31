import node.Node_OrtuMahasiswa;

import java.util.ArrayList;

public class Model_OrtuMahasiswa {
    ArrayList<Node_OrtuMahasiswa> wali;

    public Model_OrtuMahasiswa() {
        this.wali = new ArrayList<>();
    }

    public void InsertWali(String noktp, String nama, String alamat, String notelp) {
        int index = wali.size();
        this.wali.add(new Node_OrtuMahasiswa(noktp, nama, alamat, notelp));
    }

    public void ViewDataDiriOrtu() {
        for (int i = 0; i < wali.size(); i++) {
            this.wali.get(i).ViewDataortu();
        }
    }
}
