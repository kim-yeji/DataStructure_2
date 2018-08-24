package test;

import java.util.*;

public class Main {
	private ArraySet set = new ArraySet();

	public void print(Set set) {
		
		System.out.print(set.getFirst());
		for(int i=1;i<set.size();i++) {
			System.out.print(","+set.getNext());
		}
		System.out.println("");
	}	
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		
		while (true) {

			System.out.println("---------------------------");

			System.out.println("1.�߰�");

			System.out.println("2.����");

			System.out.println("3.�������");

			System.out.println("4.���������");

			System.out.println("5.�ش� ������ �ִ��� Ȯ��");

			System.out.println("6.����");


			int menu = scan.nextInt();

			if(menu==6) break;
			switch (menu) {

			case 1:

				System.out.print("�߰��ϰ� ���� ����:");

				String addContent = scan.next();

				set.add(addContent);

				break;

			case 2:

				System.out.print("�����ϰ� ���� ����:");

				String delContent = scan.next();
				set.remove(delContent);

				break;

			case 3:
				
				print(set);

				break;

			case 4:

				System.out.println(set.size());
				break;

			case 5:

				System.out.print("Ȯ���ϰ� ���� ����:");

				String checkContent = scan.next();
				System.out.println(set.contains(checkContent));

				break;


			}

		}

	}


	
	public static void main(String[] args) {
		Main m = new Main();
		m.menu();
		
		
	}
		
}
