import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Readerandwrite {

   public void write(List<Sinhvien> sv){
      File files = new File("Quanlysv.csv");
      try {
         FileWriter  fileWriter = new FileWriter(files,true);
         BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
         for (Sinhvien x:sv) {
          bufferedWriter.write(x.write());
         }
         bufferedWriter.close();
         fileWriter.close();
      } catch (IOException e) {
         throw new RuntimeException(e);
      }
   }

   public List<Sinhvien> reader(){
      List<Sinhvien> newsinhvien = new ArrayList<>();
      File file = new File("Quanlysv.csv");
      try {
         FileReader fileReader = new FileReader(file);
         BufferedReader bufferedReader = new BufferedReader(fileReader);
         String list = "";
         while ((list = bufferedReader.readLine())!=null){
            String arr [] = list.split(",");
            String masv = arr[0];
            String name = arr[1];
            String tuoi = arr[2];
            String gioitinh = arr[3];
            String diachi = arr[4];
            int diemtb = Integer.parseInt(arr[5]);
            newsinhvien.add(new Sinhvien(masv,name,tuoi,gioitinh,diachi,diemtb));
            bufferedReader.readLine();
         }
         bufferedReader.close();
         fileReader.close();

      } catch (FileNotFoundException e) {
         throw new RuntimeException(e);
      } catch (IOException e) {
         throw new RuntimeException(e);
      }
   return newsinhvien;

   }


}
