
package server;

import javax.swing.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Dimension;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Window.Type;
import java.awt.Cursor;
import java.awt.FlowLayout;


public class Serverr extends JFrame {

    ServerSocket ss;
    Socket s;
    ObjectOutputStream out;
    ObjectInputStream in;

    public Serverr() throws IOException {
    	setMinimumSize(new Dimension(640, 480));
    	setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
    	getContentPane().setBackground(new Color(255, 255, 128));
        try {
            initComponents();
            ss = new ServerSocket(9999);
            s = ss.accept();
            out = new ObjectOutputStream(s.getOutputStream());
            in = new ObjectInputStream(s.getInputStream());
        } catch (IOException ex) {
            Logger.getLogger(Serverr.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @SuppressWarnings("unchecked")

    private void initComponents() {

        jScrollPane1 = new JScrollPane();
        jScrollPane1.setBorder(new LineBorder(new Color(255, 255, 255), 5, true));
        jScrollPane1.setBackground(new Color(255, 255, 255));
        jTextArea1 = new JTextArea();
        jTextArea1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
        jTextArea1.setMinimumSize(new Dimension(20, 16));
        jTextArea1.setBackground(new Color(255, 255, 255));
        jButton1 = new JButton();
        jButton1.setBorder(new LineBorder(new Color(153, 255, 102), 4));
        jTextField1 = new JTextField();
        jTextField1.setBorder(new LineBorder(new Color(153, 255, 102), 5));

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chatie-Server");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Gönder");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        
        tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setBorder(null);
        JPanel p1=new JPanel();
        JPanel p2=new JPanel();  
        JPanel p3=new JPanel();  
        tabbedPane.add("Kişiler",p1);  
        
        lblNewLabel = new JLabel("Siz");
        
        lblNewLabel_1 = new JLabel("Karşı Taraf");
        GroupLayout gl_p1 = new GroupLayout(p1);
        gl_p1.setHorizontalGroup(
        	gl_p1.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_p1.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_p1.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblNewLabel_1)
        				.addComponent(lblNewLabel))
        			.addContainerGap(110, Short.MAX_VALUE))
        );
        gl_p1.setVerticalGroup(
        	gl_p1.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_p1.createSequentialGroup()
        			.addGap(5)
        			.addComponent(lblNewLabel)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lblNewLabel_1)
        			.addContainerGap(300, Short.MAX_VALUE))
        );
        p1.setLayout(gl_p1);
        tabbedPane.add("Gruplar",p2);  
        
        lblNewLabel_2 = new JLabel("Rumeli-Öğrenci");
        
        lblNewLabel_3 = new JLabel("Bilgisayar Programcılığı");
        lblNewLabel_3.setBackground(new Color(192, 192, 192));
        GroupLayout gl_p2 = new GroupLayout(p2);
        gl_p2.setHorizontalGroup(
        	gl_p2.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_p2.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_p2.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblNewLabel_3)
        				.addComponent(lblNewLabel_2))
        			.addContainerGap(49, Short.MAX_VALUE))
        );
        gl_p2.setVerticalGroup(
        	gl_p2.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_p2.createSequentialGroup()
        			.addGap(5)
        			.addComponent(lblNewLabel_2)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lblNewLabel_3)
        			.addContainerGap(481, Short.MAX_VALUE))
        );
        p2.setLayout(gl_p2);
        tabbedPane.add("Durum",p3);
        
  lblNewLabel_4 = new JLabel("Eralp (yeni bildirim var)");
        
        lblNewLabel_5 = new JLabel("Kağan (yeni bildirim yok)");
 JLabel lblNewLabel_6 = new JLabel("Eren (2 yeni bildirim var)");
        
        JLabel lblNewLabel_7 = new JLabel("Umut (yeni bildirim yok)");
        GroupLayout gl_p3 = new GroupLayout(p3);
        gl_p3.setHorizontalGroup(
        	gl_p3.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_p3.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_p3.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblNewLabel_5)
        				.addComponent(lblNewLabel_4))
        			.addContainerGap(110, Short.MAX_VALUE))
        );
        gl_p3.setVerticalGroup(
        	gl_p3.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_p3.createSequentialGroup()
        			.addGap(10)
        			.addComponent(lblNewLabel_4)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lblNewLabel_5)
        			.addContainerGap(295, Short.MAX_VALUE))
        );
        p3.setLayout(gl_p3);
        
        JButton btnNewButton = new JButton("");
        btnNewButton.setIcon(new ImageIcon("C:\\Users\\Kullanıcı\\Downloads\\mail-chat-bubble-text-square.png"));
        
        JButton btnNewButton_1 = new JButton("");
        btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Kullanıcı\\Downloads\\phone-telephone-call-ringing.png"));
        
        JButton btnNewButton_1_1 = new JButton("");
        btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\Kullanıcı\\Downloads\\computer-connection-video-camera.png"));
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(25)
        					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(18)
        							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 55, Short.MAX_VALUE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
        							.addGap(314))
        						.addGroup(layout.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE))))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 481, GroupLayout.PREFERRED_SIZE)
        					.addGap(32)
        					.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
        			.addGap(28))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(btnNewButton_1_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 495, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(29)
        					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 548, GroupLayout.PREFERRED_SIZE)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
        			.addGap(27))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
      
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        
        if (!jTextField1.getText().equals("")) { 
            String msg = jTextField1.getText();
            SendMessage(msg); 
            jTextField1.setText("");
        }
    }
    public static void main(String args[]) throws IOException {
        Serverr ser = new Serverr();
        ser.setVisible(true);
        ser.ReciveMessage();
    }

    private void SendMessage(String msg) {
  
        try {
            out.writeObject(msg);
            jTextArea1.append("Siz: " + msg + "\t"  + "\n");
        } catch (Exception e) {
        }
    }

    private void ReciveMessage() {
        String msg;
       
        while (true) {
            try {
                msg = (String) in.readObject();
                jTextArea1.append("Karşı Taraf: " + msg + "\t"  + "\n");
            } catch (Exception e) {
            }
        }
    }

    
    private JButton jButton1;
    private JScrollPane jScrollPane1;
    private JTextArea jTextArea1;
    private JTextField jTextField1;
    private JTabbedPane tabbedPane;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_4;
    private JLabel lblNewLabel_5;
}
