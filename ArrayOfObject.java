class Makanan{//nama class
public String namaMakanan;//deklarasi
public int harga,jml;//deklarasi
public Makanan(){};//konstruktor
public Makanan(String namaMakanan,int harga, int jml){//prosedure
this.namaMakanan = namaMakanan;//this = memilih variabel yang ada di prosedure ini
this.harga = harga;
this.jml = jml;
}
public String getnamaMakanan(){//Fungsi yang mengembalikan nilai namaMakanan
return namaMakanan;
}
public void setnamaMakanan(String namaMakanan){//prosedure
this.namaMakanan = namaMakanan;
}
// get and setter
public int getHarga(){
return harga;
}
public void setHarga(int harga){
this.harga = harga;
}
public int getJumlah(){
return jml;
}
public void setJumlah(int jml){
this.jml = jml;
}
}
public class ArrayOfObject{//class utama
public static void main(String[] args) {
Makanan[] makan = new Makanan[3];//membuat objek dari kelas Makanan
makan[0] = new Makanan();//mengisi indek ke-0 makan dengan Makanan
makan[0].setnamaMakanan("Mendhoan");//mengisi indeks ke-0 makan dengan nama Mendhoan
makan[0].setHarga(1000);//mengisi indeks ke-0 makan dengan 1000
makan[0].setJumlah(2);//mengisi indeks ke-0 makan dengan 2
makan[1] = new Makanan("Gethuk",2000,6);//mengisi indeks ke1 makan dengan nama Gethuk, harga 2000, dan Jumlah 6
makan[2] = new Makanan("Keripik Tempe",2500,3);//mengisi indeks ke-1 makan dengan nama keripik tempe, harga 2500, dan Jumlah 3
for(int i = 0; i<makan.length;i++){//mengulang sebanyak panjang indeks makan
System.out.println("Nama Makanan : " +makan[i].getnamaMakanan());
System.out.println("Harga Makanan : " +makan[i].getHarga());
System.out.println("Jumlah : "+makan[i].getJumlah());
}
}
}
