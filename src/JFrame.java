import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class JFrame extends javax.swing.JFrame {

    public JFrame() {
        initComponents();
    }
    Color marrone = new Color(205, 92, 92);
    Color bianco = new Color(98, 90, 70);
    JButton scacchiera[][]=new JButton[8][8];
    int posizioni[][]=new int[8][8];
    Pedina PedineBlu[]=new Pedina[12];
    Image imgBlu;
    Pedina PedineRosse[]=new Pedina[12];
    Image imgRossa;
    int ra, ca;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButtonInizioGioco = new javax.swing.JButton();

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 245, 215));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 70, 70));

        jButton2.setBackground(new java.awt.Color(141, 83, 31));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 70, 70));

        jButton3.setBackground(new java.awt.Color(255, 245, 215));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 70, 70));

        jButton4.setBackground(new java.awt.Color(141, 83, 31));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 70, 70));

        jButton5.setBackground(new java.awt.Color(255, 245, 215));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 70, 70));

        jButton6.setBackground(new java.awt.Color(141, 83, 31));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 70, 70));

        jButton7.setBackground(new java.awt.Color(255, 245, 215));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 70, 70));

        jButton8.setBackground(new java.awt.Color(141, 83, 31));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 70, 70));

        jButton9.setBackground(new java.awt.Color(141, 83, 31));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 70, 70));

        jButton10.setBackground(new java.awt.Color(255, 245, 215));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 70, 70));

        jButton11.setBackground(new java.awt.Color(141, 83, 31));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 70, 70));

        jButton12.setBackground(new java.awt.Color(255, 245, 215));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 70, 70));

        jButton13.setBackground(new java.awt.Color(141, 83, 31));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 70, 70));

        jButton14.setBackground(new java.awt.Color(255, 245, 215));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 70, 70));

        jButton15.setBackground(new java.awt.Color(141, 83, 31));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 70, 70));

        jButton16.setBackground(new java.awt.Color(255, 245, 215));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 70, 70));

        jButton17.setBackground(new java.awt.Color(255, 245, 215));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 70, 70));

        jButton18.setBackground(new java.awt.Color(141, 83, 31));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 70, 70));

        jButton19.setBackground(new java.awt.Color(255, 245, 215));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 70, 70));

        jButton20.setBackground(new java.awt.Color(141, 83, 31));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 70, 70));

        jButton21.setBackground(new java.awt.Color(255, 245, 215));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 70, 70));

        jButton22.setBackground(new java.awt.Color(141, 83, 31));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 70, 70));

        jButton23.setBackground(new java.awt.Color(255, 245, 215));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 70, 70));

        jButton24.setBackground(new java.awt.Color(141, 83, 31));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 70, 70));

        jButton25.setBackground(new java.awt.Color(141, 83, 31));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 70, 70));

        jButton26.setBackground(new java.awt.Color(255, 245, 215));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 70, 70));

        jButton27.setBackground(new java.awt.Color(141, 83, 31));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 70, 70));

        jButton28.setBackground(new java.awt.Color(255, 245, 215));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 70, 70));

        jButton29.setBackground(new java.awt.Color(141, 83, 31));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 70, 70));

        jButton30.setBackground(new java.awt.Color(255, 245, 215));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 70, 70));

        jButton31.setBackground(new java.awt.Color(141, 83, 31));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 70, 70));

        jButton32.setBackground(new java.awt.Color(255, 245, 215));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 70, 70));

        jButton33.setBackground(new java.awt.Color(255, 245, 215));
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 70, 70));

        jButton34.setBackground(new java.awt.Color(141, 83, 31));
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 70, 70));

        jButton35.setBackground(new java.awt.Color(255, 245, 215));
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 70, 70));

        jButton36.setBackground(new java.awt.Color(141, 83, 31));
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 70, 70));

        jButton37.setBackground(new java.awt.Color(255, 245, 215));
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 70, 70));

        jButton38.setBackground(new java.awt.Color(141, 83, 31));
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 70, 70));

        jButton39.setBackground(new java.awt.Color(255, 245, 215));
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 70, 70));

        jButton40.setBackground(new java.awt.Color(141, 83, 31));
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 70, 70));

        jButton41.setBackground(new java.awt.Color(141, 83, 31));
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton41, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 70, 70));

        jButton42.setBackground(new java.awt.Color(255, 245, 215));
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton42, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 70, 70));

        jButton43.setBackground(new java.awt.Color(141, 83, 31));
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton43, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 70, 70));

        jButton44.setBackground(new java.awt.Color(255, 245, 215));
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton44, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 70, 70));

        jButton45.setBackground(new java.awt.Color(141, 83, 31));
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton45, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 70, 70));

        jButton46.setBackground(new java.awt.Color(255, 245, 215));
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton46, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 70, 70));

        jButton47.setBackground(new java.awt.Color(141, 83, 31));
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton47, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 70, 70));

        jButton48.setBackground(new java.awt.Color(255, 245, 215));
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton48, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 70, 70));

        jButton49.setBackground(new java.awt.Color(255, 245, 215));
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton49, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 70, 70));

        jButton50.setBackground(new java.awt.Color(141, 83, 31));
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton50, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 70, 70));

        jButton51.setBackground(new java.awt.Color(255, 245, 215));
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton51, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 70, 70));

        jButton52.setBackground(new java.awt.Color(141, 83, 31));
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton52, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 70, 70));

        jButton53.setBackground(new java.awt.Color(255, 245, 215));
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton53, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 70, 70));

        jButton54.setBackground(new java.awt.Color(141, 83, 31));
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton54, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 70, 70));

        jButton55.setBackground(new java.awt.Color(255, 245, 215));
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton55, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 70, 70));

        jButton56.setBackground(new java.awt.Color(141, 83, 31));
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton56, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 70, 70));

        jButton57.setBackground(new java.awt.Color(141, 83, 31));
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton57, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 70, 70));

        jButton58.setBackground(new java.awt.Color(255, 245, 215));
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton58, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 70, 70));

        jButton59.setBackground(new java.awt.Color(141, 83, 31));
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton59, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 70, 70));

        jButton60.setBackground(new java.awt.Color(255, 245, 215));
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton60, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 70, 70));

        jButton61.setBackground(new java.awt.Color(141, 83, 31));
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton61, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 70, 70));

        jButton62.setBackground(new java.awt.Color(255, 245, 215));
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton62, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, 70, 70));

        jButton63.setBackground(new java.awt.Color(141, 83, 31));
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton63, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 70, 70));

        jButton64.setBackground(new java.awt.Color(255, 245, 215));
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosse(evt);
            }
        });
        getContentPane().add(jButton64, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 70, 70));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("5");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, 90));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("6");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, 90));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("8");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, 90));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("7");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, 90));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("4");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, 90));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("3");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, 90));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("2");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, 90));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, -1, 90));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("    D");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, 90, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("    A");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, 90, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("    B");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 90, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("    C");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 580, 90, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("    H");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 580, 90, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("    G");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 580, 90, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setText("    F");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 580, 90, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setText("    E");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 580, 90, -1));

        jButtonInizioGioco.setText("Inizio Gioco");
        jButtonInizioGioco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInizioGiocoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInizioGioco, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void JFrame(){
            
    }
    private void jButtonInizioGiocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInizioGiocoActionPerformed
        for(int i=0; i<12; i++){
            scacchiera[PedineBlu[i].getX()][PedineBlu[i].getY()].setIcon(new ImageIcon(imgBlu));
            scacchiera[PedineRosse[i].getX()][PedineRosse[i].getY()].setIcon(new ImageIcon(imgRossa));
        }
    }//GEN-LAST:event_jButtonInizioGiocoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Inizializzo bottoni
        scacchiera[0][0]=jButton1;    
        scacchiera[0][1]=jButton2;    
        scacchiera[0][2]=jButton3;    
        scacchiera[0][3]=jButton4;    
        scacchiera[0][4]=jButton5;    
        scacchiera[0][5]=jButton6;    
        scacchiera[0][6]=jButton7;    
        scacchiera[0][7]=jButton8;    
        scacchiera[1][0]=jButton9;    
        scacchiera[1][1]=jButton10;    
        scacchiera[1][2]=jButton11;    
        scacchiera[1][3]=jButton12;    
        scacchiera[1][4]=jButton13;    
        scacchiera[1][5]=jButton14;    
        scacchiera[1][6]=jButton15;    
        scacchiera[1][7]=jButton16;    
        scacchiera[2][0]=jButton17;    
        scacchiera[2][1]=jButton18;    
        scacchiera[2][2]=jButton19;    
        scacchiera[2][3]=jButton20;    
        scacchiera[2][4]=jButton21;    
        scacchiera[2][5]=jButton22;    
        scacchiera[2][6]=jButton23;    
        scacchiera[2][7]=jButton24;    
        scacchiera[3][0]=jButton25;    
        scacchiera[3][1]=jButton26;    
        scacchiera[3][2]=jButton27;    
        scacchiera[3][3]=jButton28;    
        scacchiera[3][4]=jButton29;    
        scacchiera[3][5]=jButton30;    
        scacchiera[3][6]=jButton31;    
        scacchiera[3][7]=jButton32;    
        scacchiera[4][0]=jButton33;    
        scacchiera[4][1]=jButton34;    
        scacchiera[4][2]=jButton35;    
        scacchiera[4][3]=jButton36;    
        scacchiera[4][4]=jButton37;    
        scacchiera[4][5]=jButton38;    
        scacchiera[4][6]=jButton39;    
        scacchiera[4][7]=jButton40;    
        scacchiera[5][0]=jButton41;    
        scacchiera[5][1]=jButton42;    
        scacchiera[5][2]=jButton43;    
        scacchiera[5][3]=jButton44;    
        scacchiera[5][4]=jButton45;    
        scacchiera[5][5]=jButton46;    
        scacchiera[5][6]=jButton47;    
        scacchiera[5][7]=jButton48;    
        scacchiera[6][0]=jButton49;    
        scacchiera[6][1]=jButton50;    
        scacchiera[6][2]=jButton51;    
        scacchiera[6][3]=jButton52;    
        scacchiera[6][4]=jButton53;    
        scacchiera[6][5]=jButton54;    
        scacchiera[6][6]=jButton55;    
        scacchiera[6][7]=jButton56;    
        scacchiera[7][0]=jButton57;    
        scacchiera[7][1]=jButton58;    
        scacchiera[7][2]=jButton59;    
        scacchiera[7][3]=jButton60;    
        scacchiera[7][4]=jButton61;    
        scacchiera[7][5]=jButton62;    
        scacchiera[7][6]=jButton63;    
        scacchiera[7][7]=jButton64;
        
        //Inizializzo pedineBlu
        PedineBlu[0]=new Pedina(0, 1, true, false);
        PedineBlu[1]=new Pedina(0, 3, true, false);
        PedineBlu[2]=new Pedina(0, 5, true, false);
        PedineBlu[3]=new Pedina(0, 7, true, false);
        PedineBlu[4]=new Pedina(1, 0, true, false);
        PedineBlu[5]=new Pedina(1, 2, true, false);
        PedineBlu[6]=new Pedina(1, 4, true, false);
        PedineBlu[7]=new Pedina(1, 6, true, false);
        PedineBlu[8]=new Pedina(2, 1, true, false);
        PedineBlu[9]=new Pedina(2, 3, true, false);
        PedineBlu[10]=new Pedina(2, 5, true, false);
        PedineBlu[11]=new Pedina(2, 7, true, false);
        
        //Inizializzo pedineRosse
        PedineRosse[0]=new Pedina(7, 0, true, false);
        PedineRosse[1]=new Pedina(7, 2, true, false);
        PedineRosse[2]=new Pedina(7, 4, true, false);
        PedineRosse[3]=new Pedina(7, 6, true, false);
        PedineRosse[4]=new Pedina(6, 1, true, false);
        PedineRosse[5]=new Pedina(6, 3, true, false);
        PedineRosse[6]=new Pedina(6, 5, true, false);
        PedineRosse[7]=new Pedina(6, 7, true, false);
        PedineRosse[8]=new Pedina(5, 0, true, false);
        PedineRosse[9]=new Pedina(5, 2, true, false);
        PedineRosse[10]=new Pedina(5, 4, true, false);
        PedineRosse[11]=new Pedina(5, 6, true, false);
        
        try {
            imgBlu = ImageIO.read(getClass().getResource("resources/blu.png"));
        } catch (IOException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            imgRossa = ImageIO.read(getClass().getResource("resources/rosso.png"));
        } catch (IOException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void mosse(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mosse
        for(int r=0; r<8; r++){
            for(int c=0; c<8; c++){
                if(evt.getActionCommand()==scacchiera[r][c].getActionCommand()){
                    ra=r;
                    ca=c;
                    System.out.println(" "+ r + " " + c);
                }
            }
        }
    }//GEN-LAST:event_mosse

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonInizioGioco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
