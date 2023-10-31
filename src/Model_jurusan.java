import node.Node_jurusan;

import java.util.ArrayList;

public class Model_jurusan {
    ArrayList<Node_jurusan> departmens;

    public Model_jurusan (){
        this.departmens = new ArrayList<>();
    }
    public void InsertJurusan(String nama , String Fakultas){
        int index = departmens.size();
        this.departmens.add(new Node_jurusan(index+1 ,nama, Fakultas));
    }
    public void ViewallJurusan(){
        for (int i = 0 ; i < departmens.size();i++){
            this.departmens.get(i).viewJurusan();

        }
    }
    public void updateJurusan(String nama_jurusan , String newfakultas){
        for (int i = 0 ; i < departmens.size();i++){
            if (nama_jurusan.equals(departmens.get(i).getNama_jurusan())){
                departmens.get(i).setNama_fakultas(newfakultas);
            }
        }
    }
    public void deletejurusan(String nama_jurusan){
        for (int i = 0 ; i < departmens.size();i++){
            if (nama_jurusan.equals(departmens.get(i).getNama_jurusan())){
                departmens.remove(i);
            }
        }
    }

}
