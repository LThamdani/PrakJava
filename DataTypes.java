import javax.swing.JOptionPane;

public class DataTypes{
 public static void main(String[] args){

  String namaDepan = "Muhammad";
  String namaTengah = "Hamdani";
  String namaBelakang ="X";
  int usia = 19;
  int targetTahunKuliah = 4;
  double ipk = 3.89764512;
  char nilaiAbjad = 'A';
  boolean tampan = true;

  System.out.println("Nama Lengkap : " + " "
 + namaDepan +" " 
 + namaTengah +" " 
 +namaBelakang);
  
  System.out.println("Usia : " + usia + " Tahun");
  System.out.println("Usia ketika lulus : " + (usia + targetTahunKuliah) + " Tahun");
  JOptionPane.showMessageDialog(null, "Hai " + namaDepan +" " + namaTengah +" " +namaBelakang);
 }
}