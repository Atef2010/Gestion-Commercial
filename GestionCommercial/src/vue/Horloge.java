package vue;
import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.util.Calendar;
import javax.swing.*;




class Horloge extends JComponent implements ActionListener {
  private Timer timer = new Timer(100, this);
  private double heure; 
  private double minute, seconde;
   
  public Horloge() {
    setPreferredSize(new Dimension(150, 150));
    timer.start();
  }
   
  public void arrêt() {
    timer.stop();
  }
   
  @Override
  protected void paintComponent(Graphics g) {
    Graphics2D dessin = (Graphics2D) g;
    dessin.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    dessin.setStroke(new BasicStroke(5));      
    dessin.drawOval(5, 5, 181, 181);
    dessin.setStroke(new BasicStroke(2));
    dessin.drawLine(96, 5, 96, 183);
    dessin.drawLine(5, 96, 183, 96);
    dessin.setStroke(new BasicStroke(10, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
    dessin.setPaint(new Color(0.0F, 0.0F, 1.0F, 0.5F));
    dessin.drawLine(96, 96,
        (int) (96 + 50*Math.cos((heure-3) * 2.0 * Math.PI / 12)), 
        (int) (96 + 50*Math.sin((heure-3) * 2.0 * Math.PI / 12)));
    dessin.drawLine(96, 96,
        (int) (96 + 70*Math.cos((minute-15) * 2.0 * Math.PI / 60)), 
        (int) (96 + 70*Math.sin((minute-15) * 2.0 * Math.PI / 60)));
    dessin.setPaint(new Color(1.0F, 0.0F, 0.0F, 0.5F));
    dessin.drawLine(96, 96,
        (int) (96 + 80*Math.cos((seconde-15) * 2.0 * Math.PI / 60)), 
        (int) (96 + 80*Math.sin((seconde-15) * 2.0 * Math.PI / 60)));
  }

  public void actionPerformed(ActionEvent e) {
    Calendar horaire = Calendar.getInstance();      
    minute = horaire.get(Calendar.MINUTE);
    seconde = horaire.get(Calendar.SECOND);
    heure = horaire.get(Calendar.HOUR)+minute/60;
    repaint();
  }
  
   public static void main(String[] args) { 
    DateFormat aujourdhui = DateFormat.getDateInstance(DateFormat.FULL);
    Horloge horloge = new Horloge();
    JLabel date = new JLabel(aujourdhui.format(System.currentTimeMillis()));
    date.setFont(new Font("ARIAL", Font.BOLD+Font.ITALIC, 20));
    Object[] date_heure = {date, horloge};
//   JOptionPane.showMessageDialog(null, date_heure, "Horloge", JOptionPane.INFORMATION_MESSAGE);   
    horloge.arrêt();
  }
}