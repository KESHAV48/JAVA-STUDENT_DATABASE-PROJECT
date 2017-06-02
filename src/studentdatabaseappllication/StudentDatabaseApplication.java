package studentdatabaseappllication;

public class StudentDatabaseApplication extends javax.swing.JFrame {
    
    databaseConnection db=new databaseConnection();

    
    public StudentDatabaseApplication() {
        initComponents();
        db.createTable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Ladd = new javax.swing.JLabel();
        Lname = new javax.swing.JLabel();
        Lroll_no = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 550));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("ROLL_NO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(43, 38, 109, 41);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setText("STUDENT_NAME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(43, 90, 170, 30);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(219, 45, 166, 30);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(219, 90, 166, 30);

        jButton1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(130, 140, 170, 41);

        jButton2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton2.setText("REMOVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(550, 270, 120, 30);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("SELECT ROLL_NO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 270, 169, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(230, 270, 166, 30);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setText("ROLL NO       :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 320, 129, 30);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setText("NAME           :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(43, 363, 126, 30);

        jButton3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton3.setText("DISPLAY");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(410, 270, 130, 32);

        Ladd.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        getContentPane().add(Ladd);
        Ladd.setBounds(43, 205, 250, 29);

        Lname.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        getContentPane().add(Lname);
        Lname.setBounds(220, 360, 350, 30);

        Lroll_no.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        getContentPane().add(Lroll_no);
        Lroll_no.setBounds(220, 330, 170, 29);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(110, 404, 320, 40);

        pack();
    }// </editor-fold>                        

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Ladd.setText("");
        Lroll_no.setText("");
        Lname.setText("");
        jLabel6.setText("");
        
        
        int roll_no=Integer.parseInt(jTextField1.getText());
        String name=jTextField2.getText();
        
        db.insertIntoTable(roll_no, name);
        
        Ladd.setText("Student added");
        jTextField1.setText("");
        jTextField2.setText("");
        
        
        
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Ladd.setText("");
        Lroll_no.setText("");
        Lname.setText("");
        jLabel6.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        
        int roll_no=Integer.parseInt(jTextField3.getText());
        String result=db.remove(roll_no);
        jTextField3.setText("");
        jLabel6.setText(result);
        
        
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Ladd.setText("");
        Lroll_no.setText("");
        Lname.setText("");
        jLabel6.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        
        
        
        int roll_no=Integer.parseInt(jTextField3.getText());
        String name=db.printAll(roll_no);
        
        Lroll_no.setText(""+roll_no);
        Lname.setText(name);
        jTextField3.setText("");
    }                                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentDatabaseApplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel Ladd;
    private javax.swing.JLabel Lname;
    private javax.swing.JLabel Lroll_no;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration                   
}
