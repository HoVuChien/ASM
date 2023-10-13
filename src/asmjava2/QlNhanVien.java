    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asmjava2;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QlNhanVien {
    ArrayList<NhanVienASM> listNhanVien = new ArrayList<>();

    public QlNhanVien() {
        listNhanVien.add(new NhanVienASM("NV01", "Ho vu Chien","Chien@m.com", 2300, 18));
     listNhanVien.add(new NhanVienASM("NV02", "Ho Van Chien","Chien@m.com", 2300, 19));
     listNhanVien.add(new NhanVienASM("NV03", "Ho vu Nam","Chien@m.com", 2300, 28));
     listNhanVien.add(new NhanVienASM("NV04", "Thuy Trang","Chien@m.com", 2300, 19));
     
    }
    
     ArrayList<NhanVienASM> getlist (){    
      return listNhanVien;
     }
      ArrayList<NhanVienASM> timkiem(String macantim){
       ArrayList<NhanVienASM> ketqua = new ArrayList<>();
          for (NhanVienASM nhanVienASM : listNhanVien) {
              if (nhanVienASM.getMa().equals(macantim)) {
                  ketqua.add(nhanVienASM);
              }
          }
      return ketqua;
      }
      
      Boolean Add(NhanVienASM nhanvien){
      listNhanVien.add(nhanvien);
      return true;
      } 
      Boolean updateI(int row,NhanVienASM nhanvien){
      listNhanVien.set(row, nhanvien);
      return true;
      }
     ArrayList<NhanVienASM> delema(String ma){
      for (NhanVienASM nv : listNhanVien) {
            if (nv.getMa().equals(ma)) {
                listNhanVien.remove(nv);
            }
      }
        return listNhanVien;
      }
        
    Boolean xoama(String macantim){
        for (int i = 0; i < listNhanVien.size(); i++) {
            if (listNhanVien.get(i).getMa().equals(macantim)) {
                listNhanVien.remove(listNhanVien.get(i));
            }
        }
      return true;
      }
}
