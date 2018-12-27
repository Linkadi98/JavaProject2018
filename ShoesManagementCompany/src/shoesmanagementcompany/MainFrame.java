/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoesmanagementcompany;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

/**
 *
 * @author Pham Ngoc Minh
 */
public class MainFrame extends javax.swing.JFrame {

    private JPanel pn0, pn1, pn2, pn3, pn4, pn5, pn6, pn7;
    public boolean clicked1 = false;
    public boolean clicked2 = false;
    public boolean clicked3 = false;
    public boolean clicked4 = false;
    public boolean clicked5 = false;
    public boolean clicked6 = false;
    public boolean clicked7 = false;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        FrameDragListener frameDragListener = new FrameDragListener(this);
        this.addMouseListener(frameDragListener);
        this.addMouseMotionListener(frameDragListener);
        this.setTitle("Quản lý bán giày - Nhóm 2 - 20181");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        setting = new javax.swing.JLabel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        emp = new javax.swing.JLabel();
        cus = new javax.swing.JLabel();
        prov = new javax.swing.JLabel();
        imp = new javax.swing.JLabel();
        prod = new javax.swing.JLabel();
        exp = new javax.swing.JLabel();
        statistic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setInheritsPopupMenu(true);
        jPanel1.setLayout(new java.awt.CardLayout());
        pn0 = new StartPanel();
        pn2 = new Customer();
        pn1 = new Employee();
        pn3 = new Supplier();
        pn4 = new Product();
        pn5 = new Import();
        pn6 = new Export();
        pn7 = new Statistics();

        jPanel1.add(pn0);
        jPanel1.add(pn1);
        jPanel1.add(pn2);
        jPanel1.add(pn3);
        jPanel1.add(pn4);
        jPanel1.add(pn5);
        jPanel1.add(pn6);
        jPanel1.add(pn7);
        pn0.setVisible(true);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 1220, 710));

        kGradientPanel2.setkBorderRadius(0);
        kGradientPanel2.setkEndColor(new java.awt.Color(8, 54, 124));
        kGradientPanel2.setkStartColor(new java.awt.Color(8, 54, 124));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoesmanagementcompany/Icon/icons8_Menu_32px_1.png"))); // NOI18N

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoesmanagementcompany/Icon/icons8_Contacts_32px.png"))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoesmanagementcompany/Icon/icons8_Secured_Letter_32px.png"))); // NOI18N

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoesmanagementcompany/Icon/icons8_Manager_32px.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        setting.setBackground(new java.awt.Color(35, 47, 52));
        setting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoesmanagementcompany/Icon/icons8_Settings_32px.png"))); // NOI18N
        setting.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setting.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                settingMouseWheelMoved(evt);
            }
        });
        setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                settingMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(setting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 417, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setting, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 710));

        kGradientPanel3.setkBorderRadius(0);
        kGradientPanel3.setkEndColor(new java.awt.Color(7, 71, 166));
        kGradientPanel3.setkStartColor(new java.awt.Color(7, 71, 166));

        jSeparator2.setBackground(new java.awt.Color(178, 178, 255));
        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoesmanagementcompany/Icon/icons8_Trainers_64px_1.png"))); // NOI18N
        jLabel6.setText("BKSSC");

        emp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        emp.setForeground(new java.awt.Color(222, 224, 221));
        emp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        emp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoesmanagementcompany/Icon/icons8_Employee_37px.png"))); // NOI18N
        emp.setText("Quản lý Nhân Viên");
        emp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                empMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                empMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                empMousePressed(evt);
            }
        });

        cus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cus.setForeground(new java.awt.Color(222, 224, 221));
        cus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoesmanagementcompany/Icon/icons8_Customer_37px.png"))); // NOI18N
        cus.setText("Quản lý Khách hàng");
        cus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cusMouseExited(evt);
            }
        });

        prov.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        prov.setForeground(new java.awt.Color(222, 224, 221));
        prov.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        prov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoesmanagementcompany/Icon/icons8_Supplier_37px.png"))); // NOI18N
        prov.setText("Quản lý Nhà cung cấp");
        prov.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                provMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                provMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                provMouseExited(evt);
            }
        });

        imp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        imp.setForeground(new java.awt.Color(222, 224, 221));
        imp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        imp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoesmanagementcompany/Icon/icons8_New_Product_37px.png"))); // NOI18N
        imp.setText("Quản lý Nhập hàng");
        imp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                impMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                impMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                impMouseExited(evt);
            }
        });

        prod.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        prod.setForeground(new java.awt.Color(222, 224, 221));
        prod.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        prod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoesmanagementcompany/Icon/icons8_Product_37px.png"))); // NOI18N
        prod.setText("Quản lý Sản phẩm");
        prod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prodMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                prodMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prodMouseExited(evt);
            }
        });

        exp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exp.setForeground(new java.awt.Color(222, 224, 221));
        exp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        exp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoesmanagementcompany/Icon/icons8_Buying_37px.png"))); // NOI18N
        exp.setText("Quản lý Xuất hàng");
        exp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                expMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                expMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                expMouseExited(evt);
            }
        });

        statistic.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        statistic.setForeground(new java.awt.Color(222, 224, 221));
        statistic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoesmanagementcompany/Icon/icons8_Combo_Chart_37px_1.png"))); // NOI18N
        statistic.setText("Thống kê");
        statistic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statisticMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                statisticMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                statisticMouseExited(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(emp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(prov, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(imp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(prod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(exp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addComponent(statistic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emp, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cus, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prov, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prod, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imp, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exp, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statistic, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206))
        );

        getContentPane().add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 230, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel3MouseClicked

    private void settingMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingMouseReleased
        // TODO add your handling code here:
//        setting.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseReleased(MouseEvent e) {
//                if(e.isPopupTrigger() && e.getComponent() instanceof JLabel) {
//                    JPopupMenu popup = new JPopupMenu();
//                    JMenuItem changeBackGround = new JMenuItem("Dark theme");
//                    JMenuItem update = new JMenuItem("Check new version here!");
//                    popup.add(changeBackGround);
//                    popup.add(update);
//                    popup.show(e.getComponent(), e.getX(), e.getY());
//                }
//            }
//        });


    }//GEN-LAST:event_settingMouseReleased

    private void settingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_settingMouseClicked

    private void settingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingMouseEntered
        // TODO add your handling code here:
        setting.setBackground(new Color(27, 70, 134));
        setting.setOpaque(true);
        setting.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger() && e.getComponent() instanceof JLabel) {
                    setting.setBackground(Color.DARK_GRAY);
                    JPopupMenu popup = new JPopupMenu();
                    JMenuItem changeBackGround = new JMenuItem("Dark theme");
                    JMenuItem update = new JMenuItem("Check new version here!");
                    popup.add(changeBackGround);
                    popup.add(update);
                    popup.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
    }//GEN-LAST:event_settingMouseEntered

    private void settingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingMouseExited
        // TODO add your handling code here:
        setting.setBackground(new Color(8, 54, 124));

    }//GEN-LAST:event_settingMouseExited

    private void settingMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_settingMouseWheelMoved
        // TODO add your handling code here:

    }//GEN-LAST:event_settingMouseWheelMoved

    private void empMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_empMousePressed

    private void empMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empMouseClicked
        // TODO add your handling code here:
        setClickedColor(emp);
        clicked1 = true;
        clicked2 = false;
        clicked3 = false;
        clicked4 = false;
        clicked5 = false;
        clicked6 = false;
        clicked7 = false;
        setOpaqueLabel(new JLabel[]{cus, imp, exp, prod, prov, statistic});
        pn0.setVisible(false);
        pn1.setVisible(true);
        pn2.setVisible(false);
        pn3.setVisible(false);
        pn4.setVisible(false);
        pn5.setVisible(false);
        pn6.setVisible(false);
        pn7.setVisible(false);
    }//GEN-LAST:event_empMouseClicked

    private void empMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empMouseEntered
        // TODO add your handling code here:
        setMoveColor(emp);

    }//GEN-LAST:event_empMouseEntered

    private void empMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empMouseExited
        // TODO add your handling code here:
        resetColor(emp, clicked1);
    }//GEN-LAST:event_empMouseExited

    private void cusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cusMouseClicked
        // TODO add your handling code here:
        setClickedColor(cus);
        clicked2 = true;
        clicked1 = false;
        clicked3 = false;
        clicked4 = false;
        clicked5 = false;
        clicked6 = false;
        clicked7 = false;
        setOpaqueLabel(new JLabel[]{emp, imp, exp, prod, prov, statistic});
        pn0.setVisible(false);
        pn1.setVisible(false);
        pn2.setVisible(true);
        pn3.setVisible(false);
        pn4.setVisible(false);
        pn5.setVisible(false);
        pn6.setVisible(false);
        pn7.setVisible(false);
    }//GEN-LAST:event_cusMouseClicked

    private void cusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cusMouseEntered
        // TODO add your handling code here:
        setMoveColor(cus);
    }//GEN-LAST:event_cusMouseEntered

    private void cusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cusMouseExited
        // TODO add your handling code here:
        resetColor(cus, clicked2);
    }//GEN-LAST:event_cusMouseExited

    private void provMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_provMouseClicked
        // TODO add your handling code here:
        setClickedColor(prov);
        clicked3 = true;
        clicked1 = false;
        clicked2 = false;
        clicked4 = false;
        clicked5 = false;
        clicked6 = false;
        clicked7 = false;
        setOpaqueLabel(new JLabel[]{emp, imp, exp, prod, cus, statistic});
        pn0.setVisible(false);
        pn1.setVisible(false);
        pn2.setVisible(false);
        pn3.setVisible(true);
        pn4.setVisible(false);
        pn5.setVisible(false);
        pn6.setVisible(false);
        pn7.setVisible(false);
    }//GEN-LAST:event_provMouseClicked

    private void provMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_provMouseEntered
        // TODO add your handling code here:
        setMoveColor(prov);
    }//GEN-LAST:event_provMouseEntered

    private void provMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_provMouseExited
        // TODO add your handling code here:
        resetColor(prov, clicked3);
    }//GEN-LAST:event_provMouseExited

    private void prodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prodMouseClicked
        // TODO add your handling code here:
        setClickedColor(prod);
        clicked4 = true;
        clicked1 = false;
        clicked2 = false;
        clicked3 = false;
        clicked5 = false;
        clicked6 = false;
        clicked7 = false;
        setOpaqueLabel(new JLabel[]{emp, imp, exp, prov, cus, statistic});
        pn0.setVisible(false);
        pn1.setVisible(false);
        pn2.setVisible(false);
        pn3.setVisible(false);
        pn4.setVisible(true);
        pn5.setVisible(false);
        pn6.setVisible(false);
        pn7.setVisible(false);
    }//GEN-LAST:event_prodMouseClicked

    private void prodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prodMouseEntered
        // TODO add your handling code here:
        setMoveColor(prod);
    }//GEN-LAST:event_prodMouseEntered

    private void prodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prodMouseExited
        // TODO add your handling code here:
        resetColor(prod, clicked4);
    }//GEN-LAST:event_prodMouseExited

    private void impMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_impMouseClicked
        // TODO add your handling code here:

        setClickedColor(imp);
        clicked5 = true;
        clicked1 = false;
        clicked2 = false;
        clicked3 = false;
        clicked4 = false;
        clicked6 = false;
        clicked7 = false;
        setOpaqueLabel(new JLabel[]{emp, prod, exp, prov, cus, statistic});
        pn0.setVisible(false);
        pn1.setVisible(false);
        pn2.setVisible(false);
        pn3.setVisible(false);
        pn4.setVisible(false);
        pn5.setVisible(true);
        pn6.setVisible(false);
        pn7.setVisible(false);
    }//GEN-LAST:event_impMouseClicked

    private void impMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_impMouseEntered
        // TODO add your handling code here:
        setMoveColor(imp);
    }//GEN-LAST:event_impMouseEntered

    private void impMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_impMouseExited
        // TODO add your handling code here:
        resetColor(imp, clicked5);
    }//GEN-LAST:event_impMouseExited

    private void expMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expMouseClicked
        // TODO add your handling code here:
        setClickedColor(exp);
        clicked6 = true;
        clicked1 = false;
        clicked2 = false;
        clicked3 = false;
        clicked4 = false;
        clicked5 = false;
        clicked7 = false;
        setOpaqueLabel(new JLabel[]{emp, prod, imp, prov, cus, statistic});
        pn0.setVisible(false);
        pn1.setVisible(false);
        pn2.setVisible(false);
        pn3.setVisible(false);
        pn4.setVisible(false);
        pn5.setVisible(false);
        pn6.setVisible(true);
        pn7.setVisible(false);
    }//GEN-LAST:event_expMouseClicked

    private void expMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expMouseEntered
        // TODO add your handling code here:
        setMoveColor(exp);
    }//GEN-LAST:event_expMouseEntered

    private void expMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expMouseExited
        // TODO add your handling code here:
        resetColor(exp, clicked6);
    }//GEN-LAST:event_expMouseExited

    private void statisticMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statisticMouseEntered
        // TODO add your handling code here:
        setMoveColor(statistic);

    }//GEN-LAST:event_statisticMouseEntered

    private void statisticMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statisticMouseExited
        // TODO add your handling code here:
        resetColor(statistic, clicked7);

    }//GEN-LAST:event_statisticMouseExited

    private void statisticMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statisticMouseClicked
        // TODO add your handling code here:
        setClickedColor(statistic);
        clicked6 = false;
        clicked1 = false;
        clicked2 = false;
        clicked3 = false;
        clicked4 = false;
        clicked5 = false;
        clicked7 = true;
        setOpaqueLabel(new JLabel[]{emp, prod, imp, prov, cus, exp});
        pn0.setVisible(false);
        pn1.setVisible(false);
        pn2.setVisible(false);
        pn3.setVisible(false);
        pn4.setVisible(false);
        pn5.setVisible(false);
        pn6.setVisible(false);
        pn7.setVisible(true);
    }//GEN-LAST:event_statisticMouseClicked

    private void setClickedColor(JLabel lb) {
        lb.setBackground(new Color(7, 61, 141));
        lb.setOpaque(true);
    }

    private void setMoveColor(JLabel lb) {
        lb.setBackground(new Color(8, 54, 124));
        lb.setOpaque(true);
    }

    private void resetColor(JLabel lb, boolean flag) {

        if (!flag) {
            lb.setBackground(new Color(7, 71, 166));
            lb.setOpaque(true);
        } else {
            lb.setBackground(new Color(7, 61, 141));
            lb.setOpaque(true);
        }
    }

    private void setOpaqueLabel(JLabel[] labels) {
        for (int i = 0; i < labels.length; i++) {
            JLabel label = labels[i];
            label.setBackground(new Color(7, 71, 166));
            label.setOpaque(true);
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cus;
    private javax.swing.JLabel emp;
    private javax.swing.JLabel exp;
    private javax.swing.JLabel imp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private javax.swing.JLabel prod;
    private javax.swing.JLabel prov;
    private javax.swing.JLabel setting;
    private javax.swing.JLabel statistic;
    // End of variables declaration//GEN-END:variables

    public static class FrameDragListener extends MouseAdapter {

        private final JFrame frame;
        private Point mouseDownCompCoords = null;

        public FrameDragListener(JFrame frame) {
            this.frame = frame;
        }

        public void mouseReleased(MouseEvent e) {
            mouseDownCompCoords = null;
        }

        public void mousePressed(MouseEvent e) {
            mouseDownCompCoords = e.getPoint();
        }

        public void mouseDragged(MouseEvent e) {
            Point currCoords = e.getLocationOnScreen();
            frame.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
        }
    }

}
