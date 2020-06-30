package play;

import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class Key_Event extends JFrame{
	
	public Key_Event(){
	
		
		
	}
	
	public void keyPressed(KeyEvent e) {
		String s = e.getKeyChar() + " " +
					e.getKeyCode() + " " +
					"ALT " + e.isAltDown() + " " +
					"SHIFT " + e.isShiftDown() + " " +
					"CTRL " + e.isControlDown() + " " ;
		System.out.println(s);
	}

	// 키를 눌렀다 뗐을 때의 동작을 정의
	public void keyReleased(KeyEvent e) {
		
	}
	
	// 글자가 입력됐을 때의 동작을 정의
	public void keyTyped(KeyEvent e) {
		// TODO 자동 생성된 메소드 스텁
		
	}
}
