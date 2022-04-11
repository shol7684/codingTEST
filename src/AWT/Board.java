package AWT;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.awt.TextField;

public class Board {
	public static void main(String[] args) {
		
//		FlowLayout();
//		그리드레이아웃();
//		판넬();
		
		
		
	}
	
	
	public static void FlowLayout() {
		Frame frame = new Frame("flowLayout");
		Button button1 = new Button("확인");
		Button button2 = new Button("열기");
		Button button3 = new Button("닫기");
		
		frame.setLayout(new FlowLayout());
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		
		frame.setSize(300 , 300);
		frame.setVisible(true);
	}
	
	public static void 그리드레이아웃() {
		Frame frame = new Frame("GridLayout");
		Button button1 = new Button("버튼1");
		Button button2 = new Button("버튼2");
		Button button3 = new Button("버튼3");
		
		TextField text1 = new TextField("입력창 1");
		TextField text2 = new TextField("입력창 2");
		TextField text3 = new TextField("입력창 3");
		
		frame.setLayout(new GridLayout(3,0));
		frame.add(button1);
		frame.add(text1);
		frame.add(button2);
		frame.add(text2);
		frame.add(button3);
		
		frame.add(text3);
		
		frame.pack();
		
		frame.setVisible(true);
		
	}
	
	static void 판넬() {
		Frame frame = new Frame("flowLayout");
		Button button1 = new Button("전송");
		Button button2 = new Button("삭제");
		TextField  text1 = new TextField("입력창"); 
		TextField  text2 = new TextField("안녕하세요"); 
		
//		frame.add(button1);
		frame.setVisible(true);
		frame.setSize(400, 400);
		Panel panel = new Panel();
		
		panel.add(button2);
		panel.add(button1);
//		panel.add(text1 , "North");
		panel.setBackground(Color.green);
		frame.add(panel);
		frame.add(panel);
	}
	
	
}
	