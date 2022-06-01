import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MangeSinhvien {
    Readerandwrite rd = new Readerandwrite();
    List<Sinhvien> sinhviens = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void Menu(){
        System.out.println("====Menu====");
        System.out.println("1:Hien thi danh sach sinh vien");
        System.out.println("2:Them moi");
        System.out.println("3:Cap Nhap");
        System.out.println("4:xoa");
        System.out.println("5:Sap xep");
        System.out.println("6: Doc tu file");
        System.out.println("7: ghi file");
        System.out.println("8:Thoat");
        System.out.println("");
        System.out.println("Nhap lua chon :");
        System.out.println("");
        switch (Integer.parseInt(sc.nextLine())){
            case 1:
                show();
                break;
            case 2:
                add(sinhviencread());
                rd.write(sinhviens);
                break;
            case 3:
                System.out.println("Nhap ma sinh vien :");
                String msv = sc.nextLine();
                if (checkindex(msv)!= -1) {
                    edit(checkindex(msv), sinhviencread());
                }else System.out.println("khong tim thay ma sinh vien ");
                break;
            case 4:
                System.out.println("Nhap ma sinh vien :");
                String msv1 = sc.nextLine();
                if (checkindex(msv1)!= -1) {
                    delete(checkindex(msv1));
                }else System.out.println("khong tim thay ma sinh vien ");
                break;
            case 5:
                System.out.println("----Sap xep sinh vien theo diem trung binh----");
                System.out.println("1: Sap xep theo diem tb tang dan ");
                System.out.println("2: Sap xep theo diem tb giam dan");
                System.out.println("3: Thoat ");
                System.out.println("Chon chuc nang");
                switch (Integer.parseInt(sc.nextLine())){
                    case 1:
                        sinhviens.sort(new sorttbtang());
                        break;
                    case 2:
                        sinhviens.sort(new Sorttbgiam());
                    case 3:
                        Menu();
                }
            case 6:
                System.out.println(rd.reader());
                break;

        }
    }

    public Sinhvien sinhviencread (){
        System.out.println("Nhap ma sinh vien :");
        String msv = sc.nextLine();
        System.out.println("Nhap ten sinh vien :");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi :");
        String tuoi = sc.nextLine();
        System.out.println("Nhap gioi tinh :");
        String gioitinh = sc.nextLine();
        System.out.println("Nhap dia chi :");
        String diachi = sc.nextLine();
        System.out.println("Nhap diem trung binh :");
        int diemtb = Integer.parseInt(sc.nextLine());
        return new  Sinhvien(msv,name,tuoi,gioitinh,diachi,diemtb);

    }
    public int checkindex(String msv){
        int index = -1;
        for (int i = 0; i < sinhviens.size(); i++) {
            if (sinhviens.get(i).getMasv().equals(msv)){
                index = i;
                return index;
            }
        }
        return index;
    }


    public void add(Sinhvien sv){
        sinhviens.add(sv);
    }
    public void show(){
        for (Sinhvien x: sinhviens) {
            System.out.println(x);
        }
    }

    public void edit(int index, Sinhvien s){
        sinhviens.set(index,s);
    }

    public void delete(int index){
        sinhviens.remove(index);
    }



}
