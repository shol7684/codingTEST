import java.util.Calendar;

class RentCar {

	public static void main(String[] args) {
		Member member = new Member();
		Car car = new Car();
		Reserve reservce = new Reserve();
		
		member.regMember();
		
		
		
		
		
	}
}

class Base {
	void displayDate(String data) {
		System.out.println("조회된 데이터 = " + data + "입니다");
		
	}
	String showTime() {
		
		Calendar cal = Calendar.getInstance();
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		int year  = cal.get(Calendar.YEAR);
		int month  = cal.get(Calendar.MONTH) + 1;
		int day  = cal.get(Calendar.DATE);
		
		return year + "년 " + month + "월 " + day + "일 "  + hour + "시 " + minute + "분 " + second + "초"; 
	}
}

class Member extends Base {
	
	String id;
	String password;
	String name;
	String addrerss;
	String phoneNum;
	
	void regMember() {
		System.out.println("회원 가입합니다");
		System.out.println(showTime());
	};
	
	String viewMember() {
		System.out.println("회원정보를 조회합니다");
		return null;
	}
	
	String modMember() {
		System.out.println("회원정보를 수정합니다");
		return null;
	}
	
	void delMember() {
		System.out.println("회원정보를 삭제합니다");
	}
}

class Car {
	String carNumber;
	String carName;
	String carColor;
	int carSize;
	String carMaker;
	
	String checkCarInfo() {
		System.out.println("렌트카 정보 조회");
		return null;
	}
	
	void regCarInfo(){
		System.out.println("렌트카 정보 등록");
		
	};
	
	void modCarInfo(){
		System.out.println("렌트카 정보 수정");
	};
	
	void delCarInfo() {
		System.out.println("렌트카 정보 삭제");
	};
}

class Reserve {
	String resCarNumber;
	String resDate;
	String useBeginDate;
	String retrurnDate;
	
	void reserveCar() {
		System.out.println("차를 예약합니다");
	};
	
	void modReserveInfo() {
		System.out.println("예약정보 수정");
	};
	
	void cancelReserveInfo() {
		System.out.println("예약 취소");
	};
}