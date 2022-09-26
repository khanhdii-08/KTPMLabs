package com.example.SpringDataJPA;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.SpringDataJPA.entity.ChuyenBay;
import com.example.SpringDataJPA.entity.MayBay;
import com.example.SpringDataJPA.entity.NhanVien;
import com.example.SpringDataJPA.repository.ChuyenBayRepository;
import com.example.SpringDataJPA.repository.MayBayRepository;
import com.example.SpringDataJPA.repository.NhanVienRepository;
import com.google.gson.Gson;

@SpringBootTest
class SpringDataJpaApplicationTests {

	Gson gson = new Gson();
	
	@Autowired
	private ChuyenBayRepository chuyenBayRepository;
	
	@Autowired
	private MayBayRepository mayBayRepository;
	
	@Autowired
	private NhanVienRepository nhanVienRepository;
	
	@Test
	void test_1() {		
		System.out.println("1.	Cho biết các chuyến bay đi Đà Lạt (DAD).");
		List<ChuyenBay> ls = chuyenBayRepository.findAllByGaDen("DAD");
		for (ChuyenBay cb : ls) {
			System.out.println(cb);
		}
	}
	@Test
	void test_2() {
		System.out.println("2.	Cho biết các loại máy bay có tầm bay lớn hơn 10,000km.");
		List<MayBay> ls = mayBayRepository.findAllLoaiByTamBay(10000);
		for (MayBay s : ls) {
			System.out.println(s.getLoai());
		}
	} 	
	
	@Test
	void test_3() {
		System.out.println("3.	Tìm các nhân viên có lương nhỏ hơn 10,000.");
		List<NhanVien> ls = nhanVienRepository.findAllByLuong(10000);
		for (NhanVien s : ls) {
			System.out.println(s);
		}
	}

	@Test
	void test_4() {
		System.out.println("4.	Cho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km.");
	}
	@Test
	void test_5() {
		System.out.println("5.	Cho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV).");
		List<ChuyenBay> ls = chuyenBayRepository.findCBByFromTo("SGN", "BMV");
		for (ChuyenBay cb : ls) {
			System.out.println(cb);
		}
	}
	
	@Test
	void test_6() {
		System.out.println("6.	Có bao nhiêu chuyến bay xuất phát từ Sài Gòn (SGN).");
		List<ChuyenBay> ls = chuyenBayRepository.findCBByFrom("SGN");
		for (ChuyenBay cb : ls) {
			System.out.println(cb);
		}
	}
//	@Test
//	void test_6() {
//		System.out.println("3.	Tìm các nhân viên có lương nhỏ hơn 10,000.");
//	}
//
//	@Test
//	void test_7() {
//		System.out.println("3.	Tìm các nhân viên có lương nhỏ hơn 10,000.");
//	}
//
//	@Test
//	void test_8() {
//		System.out.println("3.	Tìm các nhân viên có lương nhỏ hơn 10,000.");
//	}
//
//	@Test
//	void test_9() {
//		System.out.println("3.	Tìm các nhân viên có lương nhỏ hơn 10,000.");
//	}
//	@Test
//	void test_10() {
//		System.out.println("3.	Tìm các nhân viên có lương nhỏ hơn 10,000.");
//	}
//	@Test
//	void test_11() {
//		System.out.println("3.	Tìm các nhân viên có lương nhỏ hơn 10,000.");
//	}
//	@Test
//	void test_12() {
//		System.out.println("3.	Tìm các nhân viên có lương nhỏ hơn 10,000.");
//	}
//	@Test
//	void test_13() {
//		System.out.println("3.	Tìm các nhân viên có lương nhỏ hơn 10,000.");
//	}
//	@Test
//	void test_14() {
//		System.out.println("3.	Tìm các nhân viên có lương nhỏ hơn 10,000.");
//	}
//	@Test
//	void test_15() {
//		System.out.println("3.	Tìm các nhân viên có lương nhỏ hơn 10,000.");
//	}
}
