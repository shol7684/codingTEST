package AWT;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;

public class Panel2 {
	public static void main(String[] args) {
		판넬();
	}
	
	static void 판넬() {
		Frame frame;
		List list;
		Panel panel1, panel2;
		Panel p1,p2,p3,p4,p5;
		TextField text1,name,height,weight,age;
		Button btnSearch, btnInsert, btnUpdate, btnDelete;
		Label lId, lName,lHegiht, lWeight, lAge;
		
		
		frame = new Frame("회원 관리창");
		
		lId = new Label("아이디",Label.RIGHT);
		lName = new Label("이름",Label.RIGHT);
		lHegiht = new Label("키" , Label.RIGHT);
		lWeight = new Label("몸무게" , Label.RIGHT);
		lAge = new Label("나이" , Label.RIGHT);
		
		lId.setAlignment(Label.CENTER);
		lName.setAlignment(Label.CENTER);
		lHegiht.setAlignment(Label.CENTER);
		lWeight.setAlignment(Label.CENTER);
		lAge.setAlignment(Label.CENTER);
		
		text1 = new TextField();
		name = new TextField();
		height = new TextField();
		weight = new TextField();
		age = new TextField();
		
		list = new List(2, false);
		list.setBackground(Color.green);
		
		btnSearch = new Button("검색");
		btnInsert = new Button("추가");
		btnUpdate = new Button("수정");
		btnDelete = new Button("삭제");
				
		
		p1 = new Panel();
		p1.setLayout(new GridLayout(1,0));
		p1.add(lId);
		p1.add(text1);
		
		p2 = new Panel();
		p2.setLayout(new GridLayout(1,0));
		p2.add(lName);
		p2.add(name);
		
		p3 = new Panel();
		p3.setLayout(new GridLayout(1,0));
		p3.add(lHegiht);
		p3.add(height);
		
		p4 = new Panel();
		p4.setLayout(new GridLayout(1,0));
		p4.add(lWeight);
		p4.add(weight);
		
		p5 = new Panel();
		p5.setLayout(new GridLayout(1,0));
		p5.add(lAge);
		p5.add(age);
		
		
		panel1 = new Panel();
		panel1.setLayout(new GridLayout(0,1));
		panel1.add(p1);
		panel1.add(p2);
		panel1.add(p3);
		panel1.add(p4);
		panel1.add(p5);
		
		panel2 = new Panel();

		panel2.add(btnSearch);
		panel2.add(btnInsert);
		panel2.add(btnUpdate);
		panel2.add(btnDelete);
		
		
		
		frame.add(panel1 , "North");
		frame.add(panel2 , "South");
		frame.add(list, "Center");
		
		
//		frame.add(lId);
//		frame.add(lName);
//		frame.add(lHegiht);
//		frame.add(list);
		frame.setVisible(true);
		frame.setSize(400,400);
		
		
		
	}
	
	
	
	
}

class BaseWinidow {
	public Panel p1,p2,p3,p4,p5;
	public TextField text1,name,height,weight,mage;
	public Button btnSearch, btnInsert, btnUpdate, btnDelete;
	public Label lId, lName,lHegiht, lWeight, lAge;
	
}