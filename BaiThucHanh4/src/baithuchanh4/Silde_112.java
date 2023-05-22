
package baithuchanh4;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Silde_112 {
  public static void main(String[] args) {
	String tenSinhVien, thongTin = null;
	String arrThongTin[];	
	double diemSinhVien;
		
	LinkedList<String> danhSachSV = new LinkedList<>();
		
	LinkedList<String> svThiLai = new LinkedList<>();
		
	LinkedList<String> svDiemCao = new LinkedList<>();
		
	LinkedList<String> svCanTim = new LinkedList<>();
		
	Scanner scanner = new Scanner(System.in);
		
	
	do {
		System.out.println("nhap vao ten sinh vien: ");
		tenSinhVien = scanner.nextLine();
		if (!tenSinhVien.isEmpty()) {
			System.out.println("nhap vao diem sinh vien: ");
			diemSinhVien = Double.parseDouble(scanner.nextLine());
			thongTin = tenSinhVien + "\t" + diemSinhVien;
			danhSachSV.add(thongTin);
		}
	} while (!tenSinhVien.isEmpty());	
		
	
	System.out.println("so sinh vien co trong danh sach: " + (danhSachSV.size()));
	System.out.println("thong tin cua nhung sinh vien vua nhap la: ");
	System.out.println("Ten sinh vien\t diem");
	Iterator<String> iterator = danhSachSV.iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
		
	
	for (int i = 0; i < danhSachSV.size(); i++) {
		
		String sv = danhSachSV.get(i);			
		arrThongTin = sv.split("\t");		
		double point = Double.parseDouble(arrThongTin[1]);					
		if (point <= 5) {
			svThiLai.add(sv);
		}
	}
			
	if (svThiLai.isEmpty()) {
		System.out.println("Không có sinh viên phải thi lại!");
	} else {
		System.out.println("Số sinh viên phải thi lại = " + (svThiLai.size()));
		System.out.println("Thông tin của các sinh viên phải thi lại là: ");
		System.out.println("Tên sinh viên\t Điểm");
		iterator = svThiLai.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
		
	double maxTemp = 0;	// số điểm lớn nhất
	int i = 0;	// chỉ số của phần tử
		
	// tìm điểm lớn nhất trong danh sách
	while (i < danhSachSV.size()) {
		arrThongTin = danhSachSV.get(i).split("\t");
		
		if (Double.parseDouble(arrThongTin[1]) >= maxTemp) {
			maxTemp = Double.parseDouble(arrThongTin[1]);
		}
		i++;
	}

	// tìm sinh viên có điểm cao nhất
	i = 0;
	while (i < danhSachSV.size()) {
		arrThongTin = danhSachSV.get(i).split("\t");
		// duyệt trong danhSachSV
		// nếu có sinh viên nào có số điểm bằng với maxTemp 
		// thì sẽ thêm sinh viên đó vào trong svDiemCao
		if (Double.parseDouble(arrThongTin[1]) == maxTemp) {
			svDiemCao.add(danhSachSV.get(i));
		}
		i++;
	}
		
	System.out.println("Thông tin của các sinh viên có điểm cao nhất là: ");
	System.out.println("Tên sinh viên\t Điểm");
	iterator = svDiemCao.iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
		
	// Tìm kiếm theo tên sinh viên
	System.out.println("Nhập tên sinh viên cần tìm: ");
	String search = scanner.nextLine();
		
	i = 0;
	while (i < danhSachSV.size()) {
		// tách thông tin của sinh viên thứ i trong danhSachSV
		// thành 2 mảng lưu trữ tên và điểm số sinh viên đó
		arrThongTin = danhSachSV.get(i).split("\t");
			
		// lấy tên sinh viên trong mảng arrThongTin
		// tên sẽ tương ứng với phần tử thứ 0 trong mảng
		tenSinhVien = arrThongTin[0];
			
		// so sánh tên sinh viên cần tìm với tenSinhVien
		// nếu trùng nhau thì sẽ thêm sinh viên đó vào trong svCanTim
		if (search.equalsIgnoreCase(tenSinhVien)) {
			svCanTim.add(danhSachSV.get(i));
		}
			
		i++;	// tăng i lên 1 và quay lại đầu vòng lặp
	}
		
	System.out.println("Thông tin của các sinh viên tên là " + search + ": ");
	System.out.println("Tên sinh viên\t Điểm");
	iterator = svCanTim.iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
}
  
}
