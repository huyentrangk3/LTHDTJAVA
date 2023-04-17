package bai3_2;

import java.util.Scanner;

//Lớp DIEM
class DIEM {
 protected int x, y;
 
 // Phương thức khởi tạo
 public DIEM() {
     x = 0;
     y = 0;
 }
 
 // Phương thức nhập tọa độ điểm
 public void nhapDiem() {
     Scanner sc = new Scanner(System.in);
     System.out.print("Nhap toa do x: ");
     x = sc.nextInt();
     System.out.print("Nhap toa do y: ");
     y = sc.nextInt();
 }
}

//Lớp TAMGIAC kế thừa từ lớp DIEM
class TAMGIAC extends DIEM {
 private DIEM A, B, C;

 // Phương thức khởi tạo
 public TAMGIAC() {
     A = new DIEM();
     B = new DIEM();
     C = new DIEM();
 }
 
 // Phương thức nhập tọa độ 3 đỉnh của tam giác
 public void nhapTG() {
     System.out.println("Nhap toa do 3 diem cua tam giac:");
     A.nhapDiem();
     B.nhapDiem();
     C.nhapDiem();
 }
 
 // Phương thức kiểm tra xem 3 điểm đã nhập có là 3 đỉnh của tam giác không
 public boolean kiemTra() {
     double AB = Math.sqrt((B.x - A.x)*(B.x - A.x) + (B.y - A.y)*(B.y - A.y));
     double AC = Math.sqrt((C.x - A.x)*(C.x - A.x) + (C.y - A.y)*(C.y - A.y));
     double BC = Math.sqrt((C.x - B.x)*(C.x - B.x) + (C.y - B.y)*(C.y - B.y));
     
     if (AB + AC > BC && AB + BC > AC && AC + BC > AB)
         return true;
     else
         return false;
 }
 
 // Phương thức tính chu vi của tam giác
 public double chuVi() {
     double AB = Math.sqrt((B.x - A.x)*(B.x - A.x) + (B.y - A.y)*(B.y - A.y));
     double AC = Math.sqrt((C.x - A.x)*(C.x - A.x) + (C.y - A.y)*(C.y - A.y));
     double BC = Math.sqrt((C.x - B.x)*(C.x - B.x) + (C.y - B.y)*(C.y - B.y));
     
     return AB + AC + BC;
 }
 
 // Phương thức tính diện tích của tam giác
 public double dienTich() {
     double AB = Math.sqrt((B.x - A.x)*(B.x - A.x) + (B.y - A.y)*(B.y - A.y));
     double AC = Math.sqrt((C.x - A.x)*(C.x - A.x) + (C.y - A.y)*(C.y - A.y));
     double BC = Math.sqrt((C.x - B.x)*(C.x - B.x) + (C.y - B.y)*(C.y - B.y));
     double p = (AB + AC + BC) / 2;
     
     return Math.sqrt(p * (p));
  }
 }
