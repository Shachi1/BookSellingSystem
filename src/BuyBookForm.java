
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mehja
 */
public class BuyBookForm extends javax.swing.JFrame {

    DefaultListModel defaultListModel=new DefaultListModel();
    String[] columnNames = {"Post No","BOOK NAME", "WRITER", "PRICE", "DESCRIPTION"};
     DefaultTableModel model = new DefaultTableModel();
     DefaultTableModel model2 = new DefaultTableModel();
     static int POSTID;
     int OrderId;
     int uId=FirstPage.UserID;
    /**
     * Creates new form BookQuery
     */
    public BuyBookForm() {
        initComponents();
        Show_All_POST();
        setSize(1047,739);
        setLocation(360,180);
    }
    public void closePage(){
        WindowEvent wev = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(wev);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        bookBox = new javax.swing.JTextField();
        writerBox = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Writer:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(550, 120, 80, 43);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Post No", "Book Name", "Writer", "Price", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(50, 260, 940, 170);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Book Name:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 120, 144, 43);

        bookBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBoxActionPerformed(evt);
            }
        });
        getContentPane().add(bookBox);
        bookBox.setBounds(200, 120, 330, 40);

        writerBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writerBoxActionPerformed(evt);
            }
        });
        getContentPane().add(writerBox);
        writerBox.setBounds(640, 120, 350, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Order Now");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(640, 190, 350, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(200, 190, 330, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Search Books");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 40, 250, 44);

        jButton3.setForeground(new java.awt.Color(51, 51, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/is.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(950, 40, 40, 40);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Post No", "Book Name", "Writer", "Price", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(50, 460, 940, 170);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1stBack.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(1080, 700));
        jLabel2.setMinimumSize(new java.awt.Dimension(1080, 700));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1080, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        show_searched_data();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void writerBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writerBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_writerBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
             LocalDateTime date = LocalDateTime.now(); 
        
        try
            {
                
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;user=sa;password=1234567";
            Connection con = DriverManager.getConnection(url);
           
            String sql5 = "UPDATE [Post] SET SellStatus = 1 where PostId="+POSTID+"";
            
           
             
            PreparedStatement pst4 = con.prepareStatement(sql5);
        
            pst4.executeUpdate();
            
            String sql2 = "Insert into [Order]"+"(UserId, OrderDate,PostId )"+"values(?,?, ?)";
            
           
             
            PreparedStatement pst = con.prepareStatement(sql2);
        
            String dt=date.toString();
            
            pst.setInt(1, uId);
            pst.setString(2, dt); 
            pst.setInt(3, POSTID); 
            
            
            pst.executeUpdate();
            
            getOrderId();
            String sql3 = "Insert into [Payment]"+"(PaymentStatus,OrderId )"+"values(?,?)";
            
           
             
            PreparedStatement pst2 = con.prepareStatement(sql3);
        
            
            pst2.setInt(1, 0);
            pst2.setInt(2, OrderId); 
             
            
            pst2.executeUpdate();
            
            String sql4 = "Insert into [Delivery]"+"(DeliveryStatus,OrderId )"+"values(?,?)";
            
           
             
            PreparedStatement pst3 = con.prepareStatement(sql4);
        
            
            pst3.setInt(1, 0);
            pst3.setInt(2, OrderId); 
             
            
            pst3.executeUpdate();
            
            con.close();
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } 
        //new Home().setVisible(true);
        //closePage();
        JOptionPane.showMessageDialog(null, "Successfully Ordered");
        //new BuyBookForm().setVisible(false);
        new Home().setVisible(true);
        closePage();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         new Home().setVisible(true);
        closePage();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int x=jTable1.getSelectedRow();
        //int y=jTable1.getSelectedColumn();
       // String Data=jTable1.getComponentAt(x, 0).toString();
        String tl=model.getValueAt(x, 0).toString();
        POSTID=Integer.parseInt(tl);
        System.out.println(tl);
        
        
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void bookBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookBoxActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int x=jTable2.getSelectedRow();
        //int y=jTable1.getSelectedColumn();
       // String Data=jTable1.getComponentAt(x, 0).toString();
        String tl=model2.getValueAt(x, 0).toString();
        POSTID=Integer.parseInt(tl);
        System.out.println(tl);
    }//GEN-LAST:event_jTable2MouseClicked
   public void getOrderId()
   {
       try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "1234567");
            
                   
           // System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());
          
            Statement statement = connection.createStatement();
          
            ResultSet resultSet = statement
                   .executeQuery("SELECT [Order].OrderId from [Order] ");
           
            
             
            
           
            while (resultSet.next()) 
            {
                OrderId=resultSet.getInt("OrderId");
                 
               
            }
            System.out.println(OrderId);
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
       
   }
   public void show_searched_data()
   {
        if(bookBox != null && writerBox != null){
          String bookname= bookBox.getText();
          String bookwriter= writerBox.getText();
          jTable2.setModel(model2);
          try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "1234567");
            
                   
           // System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());
          
            Statement statement = connection.createStatement();
          
            ResultSet resultSet = statement
                   .executeQuery("SELECT [Book].BookName, [Book].Writer, [Post].Price,[Post].PostId, [Book].Description from [Book] INNER JOIN [Post] ON [Book].PostId=[Post].PostId where [Post].SellStatus=0 and [Book].BookName='"+bookname+"' and [Book].Writer='"+bookwriter+"'");
           
            
             model2.setColumnIdentifiers(columnNames);
            
         //   BOOK NAME", "WRITER", "PRICE", "DESCRIPTION
            String BookName, Writer, Desc;
            int Price,PostId;
            //System.out.println("1");
            while (resultSet.next()) 
            {
                PostId=resultSet.getInt("PostId");
                BookName=resultSet.getString("BookName");
                Writer=resultSet.getString("Writer");
                Desc=resultSet.getString("Description");
                Price=resultSet.getInt("Price");
                
               model2.addRow(new Object[]{PostId,BookName, Writer, Price, Desc});
               
               
               
            }
            //System.out.println("Last");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
       }
        //else if()
       
   }
   public void Show_All_POST()
   {
      
         jTable1.setModel(model);
          try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "1234567");
            
                   
           // System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());
          
            Statement statement = connection.createStatement();
          
            ResultSet resultSet = statement
                   .executeQuery("SELECT [Book].BookName, [Book].Writer, [Post].Price,[Post].PostId, [Book].Description from [Book] INNER JOIN [Post] ON [Book].PostId=[Post].PostId where [Post].SellStatus=0 and ApproveStatus=1");
           
            
             model.setColumnIdentifiers(columnNames);
            
         //   BOOK NAME", "WRITER", "PRICE", "DESCRIPTION
            String BookName, Writer, Desc;
            int Price,PostId;
            //System.out.println("1");
            while (resultSet.next()) 
            {
                PostId=resultSet.getInt("PostId");
                BookName=resultSet.getString("BookName");
                Writer=resultSet.getString("Writer");
                Desc=resultSet.getString("Description");
                Price=resultSet.getInt("Price");
                
               model.addRow(new Object[]{PostId,BookName, Writer, Price, Desc});
               
               
               
            }
            //System.out.println("Last");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
            
   }

   
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(BuyBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuyBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuyBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuyBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuyBookForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField writerBox;
    // End of variables declaration//GEN-END:variables
}
