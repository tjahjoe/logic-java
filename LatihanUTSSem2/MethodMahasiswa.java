package LatihanUTSSem2;

public class MethodMahasiswa {
    Mahasiswa[] data = null;
    int top;
    
Mahasiswa nextKurangMahasiswa(){
        if(data != null && top - 1 > 0){
            top--;
            Mahasiswa[] temp = new Mahasiswa[top];
            for (int i = 0; i < top; i++) {
                temp[i] = data[i];
            }
            data = temp;
            return data[top];
        } else if (top == 1) {
            Mahasiswa temp = data[top - 1];
            top--;
            return temp;
        }
        System.out.println(data);
        return null;
    }

    void tambahMahasiswa(Mahasiswa data) {
        System.out.println(data);
        top++;
        Mahasiswa[] temp = new Mahasiswa[top];
        if (this.data != null) {
            for (int i = 0; i < this.data.length; i++) {
                temp[i] = this.data[i];
            }
        }
        temp[top - 1] = data;
        this.data = temp;
    }

    

    String kurangMahasiswa(){
        Mahasiswa cek = nextKurangMahasiswa();
        return (cek == null) ? "Tidak ada mahasiswa" : cek.nama;
    }

    void tampilMahasiswaPalingAtas(){
        // if(data != null) {
        //     System.out.println(data[top - 1].nama);
        // }
    }

    void tampilMahasiswa() {
        System.out.println(data);
        if (data != null) {
            for (int i = 0; i < top; i++) {
                System.out.println(data[i].nama);
            }
        } else {
            System.out.println("data tidak tersedia");
        }
    }
}
