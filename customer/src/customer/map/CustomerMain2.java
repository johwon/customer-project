package customer.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerMain2 {
	public static Scanner sc = new Scanner(System.in);
	public static final String INSERT = "1", FIND = "2", DELETE = "3", CHANGE = "4", PRINT = "5", SORT = "6",
			REVERSE = "7", EXIT = "8";

	public static void main(String[] args) {
		HashMap<Integer, CustomerInfo> hashMap = new HashMap<>();
		boolean flag = false;
		while (!flag) {
			dispMenu();
			String menuNum = sc.nextLine();
			Pattern pattern = Pattern.compile("[1-8]");
			Matcher match = pattern.matcher(menuNum);
			boolean bool = match.matches();
			while (bool == false) {
				if (bool == false) {
					System.out.print("1-8까지의 숫자를 입력해주세요 : ");
					menuNum = sc.nextLine();
					match = pattern.matcher(menuNum);
					bool = match.matches();
				}
			}

			switch (menuNum) {
			case INSERT:
				insertCustomer(hashMap);
				break;
			case FIND:
				findCustomer(hashMap);
				break;
			case DELETE:
				deleteCustomer(hashMap);
				break;
			case CHANGE:
				changeCustomer(hashMap);
				break;
			case PRINT:
				printCustomer(hashMap);
				break;
			case SORT:
				sortCustomer(hashMap);
				break;
			case REVERSE:
				reverseOrderCustomer(hashMap);
				break;
			case EXIT:
				System.out.println("프로그램을 종료합니다");
				flag = true;
				break;

			}
		}

	}

	private static void changeCustomer(HashMap<Integer, CustomerInfo> hashMap) {
		System.out.print("고객번호를 입력해주세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		Set set = hashMap.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			int intNum = it.next();
			if(intNum==num) {
				it.remove();
				System.out.print("수정할 이름 : ");
				String name = sc.nextLine();
				System.out.print("수정할 고객 번호 : ");
				int num1 = sc.nextInt();
				sc.nextLine();
				hashMap.put(num1, new CustomerInfo(name, num1));
				System.out.println("수정이 완료되었습니다.");
				System.out.println(hashMap.get(num1));
			}
		}
	}

	private static void reverseOrderCustomer(HashMap<Integer, CustomerInfo> hashMap) {
		ArrayList<Integer> list = new ArrayList<Integer>(hashMap.keySet());
		Collections.sort(list,Collections.reverseOrder());
		for(int i=0;i<list.size();i++) {
			System.out.println(hashMap.get(list.get(i)));
		}
	}

	private static void sortCustomer(HashMap<Integer, CustomerInfo> hashMap) {
		Set set = hashMap.keySet();
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(hashMap.get(list.get(i)));
		}

	}

	private static void deleteCustomer(HashMap<Integer, CustomerInfo> hashMap) {
		System.out.print("번호를 입력해주세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		Set set = hashMap.keySet();
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			int intNum = it.next();
			if (intNum == num) {
				it.remove();
				System.out.println("삭제가 완료되었습니다.");
			}
		}
	}

	private static void findCustomer(HashMap<Integer, CustomerInfo> hashMap) {
		System.out.print("번호를 입력해주세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		Set set = hashMap.keySet();
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			if (it.next() == num) {
				System.out.println("고객을 찾았습니다.");
				System.out.println(hashMap.get(num));
			}
		}
	}

	private static void printCustomer(HashMap<Integer, CustomerInfo> hashMap) {
		Set set = hashMap.keySet();
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			int intNum = it.next();
			System.out.println(hashMap.get(intNum));
		}
	}

	private static void insertCustomer(HashMap<Integer, CustomerInfo> hashMap) {
		String name = makeName();
		int num = (int) (Math.random() * (9999 - 1000 + 1) + 1000);
		hashMap.put(num, new CustomerInfo(name, num));
		System.out.println("고객 정보를 입력합니다.");
		System.out.println(hashMap.get(num).toString());

	}

	public static void dispMenu() {
		System.out.println("=================");
		System.out.println("1. 고객정보 입력");
		System.out.println("2. 고객정보 검색");
		System.out.println("3. 고객정보 삭제");
		System.out.println("4. 고객정보 수정");
		System.out.println("5. 모든 고객정보 출력");
		System.out.println("6. 고객정보 정렬");
		System.out.println("7. 고객정보 역정렬");
		System.out.println("8. 프로그램 종료");
		System.out.println("=================");
		System.out.print("번호를 입력해주세요 : ");
	}

	public static String makeName() {
		List<String> 성 = Arrays.asList("김", "이", "박", "최", "정", "강", "조", "윤", "장", "임", "한", "오", "서", "신", "권", "황",
				"안", "송", "류", "전", "홍", "고", "문", "양", "손", "배", "조", "백", "허", "유", "남", "심", "노", "정", "하", "곽", "성",
				"차", "주", "우", "구", "신", "임", "나", "전", "민", "유", "진", "지", "엄", "채", "원", "천", "방", "공", "강", "현", "함",
				"변", "염", "양", "변", "여", "추", "노", "도", "소", "신", "석", "선", "설", "마", "길", "주", "연", "방", "위", "표", "명",
				"기", "반", "왕", "금", "옥", "육", "인", "맹", "제", "모", "장", "남", "탁", "국", "여", "진", "어", "은", "편", "구",
				"용");

		List<String> 이름 = Arrays.asList("가", "강", "건", "경", "고", "관", "광", "구", "규", "근", "기", "길", "나", "남", "노", "누",
				"다", "단", "달", "담", "대", "덕", "도", "동", "두", "라", "래", "로", "루", "리", "마", "만", "명", "무", "문", "미", "민",
				"바", "박", "백", "범", "별", "병", "보", "빛", "사", "산", "상", "새", "서", "석", "선", "설", "섭", "성", "세", "소", "솔",
				"수", "숙", "순", "숭", "슬", "승", "시", "신", "아", "안", "애", "엄", "여", "연", "영", "예", "오", "옥", "완", "요", "용",
				"우", "원", "월", "위", "유", "윤", "율", "으", "은", "의", "이", "익", "인", "일", "잎", "자", "잔", "장", "재", "전", "정",
				"제", "조", "종", "주", "준", "중", "지", "진", "찬", "창", "채", "천", "철", "초", "춘", "충", "치", "탐", "태", "택", "판",
				"하", "한", "해", "혁", "현", "형", "혜", "호", "홍", "화", "환", "회", "효", "훈", "휘", "희", "운", "모", "배", "부", "림",
				"봉", "혼", "황", "량", "린", "을", "비", "솜", "공", "면", "탁", "온", "디", "항", "후", "려", "균", "묵", "송", "욱", "휴",
				"언", "령", "섬", "들", "견", "추", "걸", "삼", "열", "웅", "분", "변", "양", "출", "타", "흥", "겸", "곤", "번", "식", "란",
				"더", "손", "술", "훔", "반", "빈", "실", "직", "흠", "흔", "악", "람", "뜸", "권", "복", "심", "헌", "엽", "학", "개", "롱",
				"평", "늘", "늬", "랑", "얀", "향", "울", "련");
		Collections.shuffle(성);
		Collections.shuffle(이름);
		return 성.get(0) + 이름.get(0) + 이름.get(1);

	}
}
