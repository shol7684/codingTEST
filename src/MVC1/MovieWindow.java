package MVC1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MovieWindow extends JFrame implements ActionListener {

	String resultMsg = null;
	JTextField tMovieTitle = new JTextField(30);
	JButton btnTitleInsert = new JButton("영화제목 추가");
	JButton btnSave = new JButton("영화 제목 파일 저장");
	JButton btnExit = new JButton("종료");
	
	List movieList = new List();

	MovieController controller = new MovieController();
	
	public MovieWindow() {
		super("영화정보 관리 화면");
		movieList.setBackground(Color.green);
		Panel p = new Panel();
		p.add(new Label("영화 제목 입력"));
		p.add(tMovieTitle);
		p.add(btnTitleInsert);
		p.add(btnSave);
		
		add(BorderLayout.NORTH, p);
		add(BorderLayout.CENTER, movieList);
		add(BorderLayout.SOUTH, btnExit);
		
		setBounds(0, 0, 800, 600);
		setVisible(true);
		
		movieList.addActionListener(this);
		btnTitleInsert.addActionListener(this);
		btnSave.addActionListener(this);
		btnExit.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

			String mTitle = e.getActionCommand();
			
			if(e.getSource() == btnTitleInsert) {
				mTitle = tMovieTitle.getText().trim();
				controller.addTitle(mTitle,movieList);
				tMovieTitle.setText("");
				resultMsg = "영화 제목을 추가했습니다";
				
			} else if(e.getSource() == btnSave) {
				try {
					controller.saveTitles(movieList);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				resultMsg = "영화 제목을 저장했습니다";
			} else {
				controller.delTitle(mTitle, movieList);
				resultMsg = "영화 제목을 삭제했습니다";
			}
			
			JOptionPane.showMessageDialog(this, resultMsg, "메시지 박스", JOptionPane.INFORMATION_MESSAGE );
			
			if(e.getSource() == btnExit) {
				System.exit(1);
			}
	}
	
	public static void main(String[] args) {
		new MovieWindow();
	}

}
