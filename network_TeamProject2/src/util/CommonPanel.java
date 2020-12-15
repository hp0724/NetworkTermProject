/*
 * 배경이되는 공통 패널
 */
package util;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class CommonPanel extends JPanel {

  protected JLabel logoLabel;
  
  //로고사진 이용
  protected Image logoImg = UseImageFile.getImage("resources\\label.png");

  //배경색 설정
  protected CommonPanel() {

    setBackground(ColorSet.talkBackgroundColor);
    setLayout(null);
 
  }

}
