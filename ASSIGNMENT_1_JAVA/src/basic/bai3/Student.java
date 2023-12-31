package basic.bai3;

import java.util.Scanner;

public class Student {
	private String fullName, address, dob, gender;
	private float finalGrade;

	public void inputInfomation(Scanner scanner) {
		System.out.println("Input fullname");
		this.fullName = scanner.nextLine();

		System.out.println("Input address");
		this.address = scanner.nextLine();

		System.out.println("Input dob");
		this.dob = scanner.nextLine();

		System.out.println("Input gender");
		this.gender = scanner.nextLine();

		System.out.println("Input finalGrade");
		this.finalGrade = Float.parseFloat(scanner.nextLine());

	}

	public void showInfomation() {
		System.out.println("FullName: " + this.fullName);
		System.out.println("Address: " + this.address);
		System.out.println("DOB: " + this.dob);
		System.out.println("Gender: " + this.gender);
		System.out.println("FinalGrade: " + this.finalGrade);
	}

	public void showFinalGrade() {
		String name = "Hoc sinh " + this.finalGrade;
		String academicAbility = "";
		if (this.finalGrade < 4.0) {
			academicAbility = "Kem";
		} else if (this.finalGrade >= 4.0 && this.finalGrade < 5.0) {
			academicAbility = "Yeu";
		} else if (this.finalGrade >=5.0 && this.finalGrade < 5.5) {
			academicAbility = "Trung binh yeu";
		} else if (this.finalGrade >= 5.5 && this.finalGrade < 6.5) {
			academicAbility = "Trung binh";
		} else if (this.finalGrade >= 6.5 && this.finalGrade < 7.0) {
			academicAbility = "Trung binh kha";
		} else if (this.finalGrade >= 7.0 && this.finalGrade < 8.0) {
			academicAbility = "Kha";
		} else if (this.finalGrade >= 8.0 && this.finalGrade < 8.5) {
			academicAbility = "Kha gioi";
		} else if (this.finalGrade >= 8.5 && this.finalGrade <= 10.0) {
			academicAbility = "Gioi";
		}
		System.out.println(name+" "+ academicAbility);
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public float getFinalGrade() {
		return finalGrade;
	}

	public void setFinalGrade(float finalGrade) {
		this.finalGrade = finalGrade;
	}
}
