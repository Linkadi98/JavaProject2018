/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoesmanagementcompany;

import java.awt.Desktop;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.IBodyElement;
import org.apache.poi.xwpf.usermodel.TableRowAlign;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

/**
 *
 * @author Pham Ngoc Minh
 */
public class Employee extends javax.swing.JPanel {

    private int flagExportFile = 0;
    public boolean[] inserted = new boolean[100000];

    /**
     * Creates new form Panel2
     */
    public Employee() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar4 = new javax.swing.JToolBar();
        importFile = new javax.swing.JButton();
        exportFile = new javax.swing.JButton();
        jToolBar5 = new javax.swing.JToolBar();
        viewData = new javax.swing.JButton();
        insertData = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        properties = new javax.swing.JComboBox<>();
        searchBox = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1220, 710));
        setRequestFocusEnabled(false);

        jToolBar4.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar4.setRollover(true);

        importFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoesmanagementcompany/IconColor/icons8_Microsoft_Excel_37px.png"))); // NOI18N
        importFile.setToolTipText("Nhập file");
        importFile.setOpaque(false);
        importFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importFileActionPerformed(evt);
            }
        });
        jToolBar4.add(importFile);

        exportFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoesmanagementcompany/IconColor/icons8_Microsoft_Word_37px.png"))); // NOI18N
        exportFile.setToolTipText("Xuất file");
        exportFile.setOpaque(false);
        exportFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportFileActionPerformed(evt);
            }
        });
        jToolBar4.add(exportFile);

        jToolBar5.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar5.setRollover(true);

        viewData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoesmanagementcompany/IconColor/icons8_Database_View_37px.png"))); // NOI18N
        viewData.setToolTipText("Hiển thị ");
        viewData.setOpaque(false);
        viewData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDataActionPerformed(evt);
            }
        });
        jToolBar5.add(viewData);

        insertData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoesmanagementcompany/IconColor/icons8_Add_Database_37px.png"))); // NOI18N
        insertData.setToolTipText("Thêm");
        insertData.setOpaque(false);
        insertData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertDataActionPerformed(evt);
            }
        });
        jToolBar5.add(insertData);

        employeeTable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Họ tên ", "Ngày sinh", "Chức vụ", "Giới tính", "Điện thoại", "Email", "Địa chỉ", "CMND"
            }
        ));
        employeeTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        employeeTable.setGridColor(new java.awt.Color(153, 153, 153));
        employeeTable.setRowHeight(26);
        employeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                employeeTableMouseReleased(evt);
            }
        });
        employeeTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                employeeTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(employeeTable);

        properties.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tìm kiếm theo", "Mã nhân viên", "Họ tên", "Chức vụ", "Địa chỉ" }));
        properties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propertiesActionPerformed(evt);
            }
        });

        searchBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1176, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToolBar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(properties, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(properties, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void importFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importFileActionPerformed
        // TODO add your handling code here:
        String path = null;
        JFileChooser fileChooser = new JFileChooser();
        // show ra một bảng chọn file
        int rVal = fileChooser.showOpenDialog(null);
        // nếu nhấn nút ok (tuỳ chọn APPROVE_OPTION)
        if (rVal == JFileChooser.APPROVE_OPTION) {
            String fileName = fileChooser.getSelectedFile().getName();
            String dir = fileChooser.getCurrentDirectory().toString();
            path = dir + "\\" + fileName;
        } // nếu nhấn nút cancel trong bảng 
        else if (rVal == JFileChooser.CANCEL_OPTION) {
            return;
        }
        // chỗ này sẽ delete hết các dòng trước khi nhập dữ liệu từ file 
        ((DefaultTableModel) employeeTable.getModel()).setNumRows(0);
        // vector lưu tên cột
        Vector columns = new Vector();
        try {
            FileInputStream file = new FileInputStream(new File(path));
            // tạo một file excel
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            // tạo một sheet trong excel có số thứ tự là 0
            XSSFSheet sheet = workbook.getSheetAt(0);
            // con trỏ duyệt hàng trong excel 
            Iterator<Row> rowIt = sheet.iterator();
            // nếu vẫn còn dòng trong file
            while (rowIt.hasNext()) {
                // tạo một dòng mới 
                Row row = rowIt.next();
                // con trỏ trỏ vào các ô trong một dòng 
                Iterator<Cell> cellIt = row.cellIterator();
                // nếu là hàng 0 
                if (row.getRowNum() == 0) {
                    // add tên các cột vào trong bảng jtable 
                    while (cellIt.hasNext()) {
                        Cell cell = cellIt.next();
                        columns.add(cell.getStringCellValue());
                        ((DefaultTableModel) employeeTable.getModel()).setColumnIdentifiers(columns);
                    }
                } else {
                    //vector chứa dữ liệu trong 1 dòng để add vào bảng jtabel
                    Vector<String> rowData = new Vector<String>();
                    // nếu vẫn còn ô tiếp theo
                    while (cellIt.hasNext()) {
                        // lấy cell trong bảng excel
                        Cell cell = cellIt.next();
                        // nếu cell có kiểu dữ liệu là string
                        if (cell.getCellType() == CellType.STRING) {
                            rowData.add(cell.getStringCellValue());
                        } // nếu cell có kiểu dữ liệu là số
                        else if (cell.getCellType() == CellType.NUMERIC) {
                            rowData.add(Double.toString(cell.getNumericCellValue()));
                        }
                    }
                    // add dữ liệu vào trong bảng jtable 
                    ((DefaultTableModel) employeeTable.getModel()).addRow(rowData);
                }
            }
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_importFileActionPerformed

    private void exportFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportFileActionPerformed
        String f0 = System.getProperty("user.home");
        String f1 = "\\Documents\\NetBeansProjects\\ShoesManagementCompany\\Quản Lý Nhân Viên\\";
        String f2 = null;
        switch (flagExportFile) {
            case 0:
                f2 = "Thông tin tất cả nhân viên.docx";
                break;
            case 1:
                f2 = "Tìm kiếm theo mã nhân viên.docx";
                break;
            case 2:
                f2 = "Tìm kiếm theo họ tên.docx";
                break;
            case 3:
                f2 = "Tìm kiếm theo chức vụ.docx";
                break;
            case 4:
                f2 = "Tìm kiếm theo địa chỉ.docx";
                break;
        }
        String fileName = f0 + f1 + f2;
        try {
            InputStream file = new FileInputStream(fileName);
            XWPFDocument hdoc = new XWPFDocument(OPCPackage.open(file));
            Iterator bodyElementIterator = hdoc.getBodyElementsIterator();
            for (XWPFParagraph p : hdoc.getParagraphs()) {
                List<XWPFRun> runs = p.getRuns();
                if (runs != null) {
                    for (XWPFRun r : runs) {
                        r.setFontSize(12);
                        r.setFontFamily("Times New Roman");
                        String text = r.getText(0);
                        if (text != null && text.contains("ngayxxx")) {
                            SimpleDateFormat day = new SimpleDateFormat("dd");
                            SimpleDateFormat month = new SimpleDateFormat("MM");
                            SimpleDateFormat year = new SimpleDateFormat("yyyy");
                            Date date = new Date();
                            String ngay = day.format(date);
                            String thang = month.format(date);
                            String nam = year.format(date);
                            text = "Ngày  " + ngay + "  tháng  " + thang + "  năm  " + nam;
                            r.setText(text, 0);
                            break;
                        }
                    }
                }
            }

            while (bodyElementIterator.hasNext()) {
                IBodyElement element = (IBodyElement) bodyElementIterator.next();
                if ("TABLE".equalsIgnoreCase(element.getElementType().name())) {
                    //Danh sách tất cả Table trong file word
                    List<XWPFTable> tableList = element.getBody().getTables();
                    //Duyệt qua danh sách tất cả các table
                    for (XWPFTable table : tableList) {
                        //Căn bảng ở giữa file
                        table.setTableAlignment(TableRowAlign.CENTER);
                        //  Xóa các dòng thừa trước khi thêm mới
                        while (table.getRow(1) != null) {
                            table.removeRow(1);
                        }
                        //Thêm các dòng từ jTable vào table trong word
                        for (int i = 1; i <= employeeTable.getRowCount(); i++) {
                            XWPFTableRow newRow = table.createRow();
                            newRow.getCell(0).setText(i + "");
                            for (int j = 0; j < employeeTable.getColumnCount(); j++) {
                                newRow.getCell(j + 1).setText(employeeTable.getValueAt(i - 1, j).toString());
                            }
                        }
                    }
                }
            }

            OutputStream out = new FileOutputStream(f2);
            hdoc.write(out);
            out.close();
            //Mở file
            try {
                File myFile = new File(f0 + "\\Documents\\NetBeansProjects\\ShoesManagementCompany\\" + f2);
                Desktop.getDesktop().open(myFile);
            } catch (IOException ex) {
                // no application registered for PDFs
                JOptionPane.showConfirmDialog(null, ex.getMessage());
                ex.printStackTrace();
            }
        } catch (IOException | InvalidFormatException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_exportFileActionPerformed

    private void insertDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertDataActionPerformed
        // TODO add your handling code here:
        ConnectionDB connectDB = new ConnectionDB();
        Connection connection = connectDB.getConnect();

        //        DefaultTableModel tableModel = (DefaultTableModel) employeeTable.getModel();
        int rows = employeeTable.getRowCount();
        for (int row = 0; row < rows; row++) {
            if (!inserted[row] && !isEmptyRow(row)) {
                String sql = "INSERT INTO quanlybangiay.nhanvien VALUES (?,?,?,?,?,?,?,?,?)";
                try {
                    connection.setAutoCommit(false);
                    PreparedStatement pst = connection.prepareStatement(sql);
                    pst.setString(1, employeeTable.getValueAt(row, 0).toString());
                    pst.setString(2, employeeTable.getValueAt(row, 1).toString());
                    pst.setString(3, employeeTable.getValueAt(row, 2).toString());
                    pst.setString(4, employeeTable.getValueAt(row, 3).toString());
                    pst.setString(5, employeeTable.getValueAt(row, 4).toString());
                    pst.setString(6, employeeTable.getValueAt(row, 5).toString());
                    pst.setString(7, employeeTable.getValueAt(row, 6).toString());
                    pst.setString(8, employeeTable.getValueAt(row, 7).toString());
                    pst.setString(9, employeeTable.getValueAt(row, 8).toString());

                    pst.addBatch();
                    pst.executeUpdate();
                    connection.commit();

                } catch (HeadlessException | SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                    ((DefaultTableModel) employeeTable.getModel()).removeRow(row);
                    return;
                }
                inserted[row] = true;
            }
        }
        JOptionPane.showMessageDialog(null, "Successfully");
    }//GEN-LAST:event_insertDataActionPerformed

    private void viewDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDataActionPerformed
        // TODO add your handling code here:
        flagExportFile = 0;
        ConnectionDB connectDB = new ConnectionDB();
        Connection connection = connectDB.getConnect();
        DefaultTableModel tableModel = (DefaultTableModel) employeeTable.getModel();
        tableModel.setNumRows(0);
        String sql = "SELECT * FROM quanlybangiay.nhanvien";
        PreparedStatement pst;
        int row = 0;
        try {
            pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                tableModel.addRow(new Object[]{rs.getString(1), rs.getString(2),
                    rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)
                });
                inserted[row] = true;
                row++;
            }
            employeeTable.setModel(tableModel);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getErrorCode());
        }
    }//GEN-LAST:event_viewDataActionPerformed

    private void employeeTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_employeeTableKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && employeeTable.getSelectedRow() == employeeTable.getRowCount() - 1) {

            ((DefaultTableModel) employeeTable.getModel()).addRow(new Object[]{null});
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            employeeTable.requestFocus();
            employeeTable.changeSelection(employeeTable.getSelectedRow(), 0, false, false);
        }
    }//GEN-LAST:event_employeeTableKeyPressed

    private void employeeTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeTableMouseReleased
        // TODO add your handling code here:
        employeeTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                int r = employeeTable.rowAtPoint(e.getPoint());
                if (r >= 0 && r < employeeTable.getRowCount()) {
                    employeeTable.setRowSelectionAllowed(true);
                } else {
                    employeeTable.clearSelection();
                }

                int[] rowindex = employeeTable.getSelectedRows();
                for (int i = 0; i < rowindex.length; i++) {
                    int j = rowindex[i];
                    if (j < 0) {
                        return;
                    }
                }
                if (e.isPopupTrigger() && e.getComponent() instanceof JTable) {
                    JPopupMenu popup = popUp();
                    popup.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
    }//GEN-LAST:event_employeeTableMouseReleased

    private void searchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBoxActionPerformed

    private void propertiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propertiesActionPerformed
        // TODO add your handling code here:
        JComboBox<String> combo = (JComboBox<String>) evt.getSource();
        String selected = (String) combo.getSelectedItem();
        ConnectionDB connectionDB = new ConnectionDB();
        Connection con = connectionDB.getConnect();
        DefaultTableModel model = (DefaultTableModel) employeeTable.getModel();
        model.setNumRows(0);
        if (selected != null) {
            switch (selected) {
                case "Mã nhân viên":
                    flagExportFile = 1;
                    try {
                        String sql = "SELECT * FROM quanlybangiay.nhanvien WHERE maNV like '%" + searchBox.getText() + "%'";
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(sql);
                        while (rs.next()) {
                            Vector<String> vector = new Vector<>();
                            for (int i = 0; i < 9; i++) {
                                vector.add(rs.getString(i + 1));
                            }
                            model.addRow(vector);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case "Họ tên":
                    flagExportFile = 2;
                    try {
                        String sql = "select * from quanlybangiay.nhanvien where hoTen like '%" + searchBox.getText() + "%'";
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(sql);
                        while (rs.next()) {
                            Vector<String> vector = new Vector<>();
                            for (int i = 0; i < 9; i++) {
                                vector.add(rs.getString(i + 1));
                            }
                            ((DefaultTableModel) employeeTable.getModel()).addRow(vector);
                        }
                    } catch (Exception e) {
                    }
                    break;
                case "Chức vụ":
                    flagExportFile = 3;
                    try {

                        String sql = "select * from quanlybangiay.nhanvien where chucVu like '%" + searchBox.getText() + "%'";
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(sql);

                        while (rs.next()) {
                            Vector<String> vector = new Vector<>();
                            for (int i = 0; i < 9; i++) {
                                vector.add(rs.getString(i + 1));
                            }
                            model.addRow(vector);
                        }
                    } catch (Exception e) {
                    }
                    break;
                case "Địa chỉ":
                    flagExportFile = 4;
                    try {
                        String sql = "select * from quanlybangiay.nhanvien where diaChi like '%" + searchBox.getText() + "%'";
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(sql);
                        while (rs.next()) {
                            Vector<String> vector = new Vector<>();
                            for (int i = 0; i < 9; i++) {
                                vector.add(rs.getString(i + 1));
                            }
                            model.addRow(vector);
                        }
                    } catch (Exception e) {
                    }
                    break;

            }
        }


    }//GEN-LAST:event_propertiesActionPerformed

    private JPopupMenu popUp() {
        JPopupMenu popupMenu = new JPopupMenu();
        JMenu deleteMenu = new JMenu("Delete");
        JPopupMenu subPopupMenu = new JPopupMenu();
        JMenuItem deleteFromTb = new JMenuItem("From table");
        JMenuItem deleteFromDb = new JMenuItem("From database");
        JMenu insertMenu = new JMenu("Insert");
        JMenuItem insertAbove = new JMenuItem("Insert Above");
        JMenuItem insertBelow = new JMenuItem("Insert Below");
        JMenuItem update = new JMenuItem("Update");
        Icon icon = new ImageIcon(System.getProperty("user.home") + "\\Documents\\NetBeansProjects\\ShoesManagementCompany\\src\\shoesmanagementcompany\\IconColor\\icons8-cancel-16.png");
        Icon deleteDb = new ImageIcon(System.getProperty("user.home") + "\\Documents\\NetBeansProjects\\ShoesManagementCompany\\src\\shoesmanagementcompany\\IconColor\\icons8-delete-database-20.png");
        Icon deleteTb = new ImageIcon(System.getProperty("user.home") + "\\Documents\\NetBeansProjects\\ShoesManagementCompany\\src\\shoesmanagementcompany\\IconColor\\icons8-delete-table-25.png");
        Icon updateIcon = new ImageIcon(System.getProperty("user.home") + "\\Documents\\NetBeansProjects\\ShoesManagementCompany\\src\\shoesmanagementcompany\\IconColor\\icons8-downloading-updates-20.png");
        Icon insertIcon = new ImageIcon(System.getProperty("user.home") + "\\Documents\\NetBeansProjects\\ShoesManagementCompany\\src\\shoesmanagementcompany\\IconColor\\icons8-add-row-25.png");
        Icon insertBelowIcon = new ImageIcon(System.getProperty("user.home") + "\\Documents\\NetBeansProjects\\ShoesManagementCompany\\src\\shoesmanagementcompany\\IconColor\\icons8-down-arrow-25.png");
        Icon insertAboveIcon = new ImageIcon(System.getProperty("user.home") + "\\Documents\\NetBeansProjects\\ShoesManagementCompany\\src\\shoesmanagementcompany\\IconColor\\icons8-long-arrow-up-25.png");
        insertMenu.setIcon(insertIcon);
        insertAbove.setIcon(insertAboveIcon);
        insertBelow.setIcon(insertBelowIcon);
        deleteMenu.setIcon(icon);
        deleteFromDb.setIcon(deleteDb);
        deleteFromTb.setIcon(deleteTb);
        update.setIcon(updateIcon);
        deleteFromDb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                int[] rows = employeeTable.getSelectedRows();
                Arrays.sort(rows);
                for (int i = 0; i < rows.length; i++) {
                    int row = rows[i];
                    ConnectionDB connectDB = new ConnectionDB();
                    Connection connection = connectDB.getConnect();

                    DefaultTableModel tableModel = (DefaultTableModel) employeeTable.getModel();
                    String sql = "DELETE FROM quanlybangiay.nhanvien WHERE (maNV = ?)";
                    try {
                        connection.setAutoCommit(false);
                        PreparedStatement pst = connection.prepareStatement(sql);
                        String idBook = (String) tableModel.getValueAt(row, 0);
                        pst.setString(1, idBook);
                        pst.executeUpdate();
                        connection.commit();
                        ((DefaultTableModel) employeeTable.getModel()).removeRow(row);
                        for (int j = i + 1; j < rows.length; j++) {
                            rows[j] = rows[j] - 1;
                        }
                        JOptionPane.showMessageDialog(null, "Successfully delete");
                    } catch (HeadlessException | SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Can not delele!\n" + ex.getMessage());
                    }

                }

            }
        });
        deleteFromTb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {

                int[] rows = employeeTable.getSelectedRows();
                Arrays.sort(rows);

                for (int i = 0; i < rows.length; i++) {
                    int row = rows[i];
                    ((DefaultTableModel) employeeTable.getModel()).removeRow(row);
                    for (int j = i + 1; j < rows.length; j++) {
                        rows[j] = rows[j] - 1;
                    }
                }
            }
        });
        update.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {

                ConnectionDB connectDB = new ConnectionDB();
                Connection connection = connectDB.getConnect();

                DefaultTableModel tableModel = (DefaultTableModel) employeeTable.getModel();
                int[] rows = employeeTable.getSelectedRows();
                Arrays.sort(rows);
                for (int i = 0; i < rows.length; i++) {
                    int row = rows[i];

                    String temp = (String) tableModel.getValueAt(row, 0);
                    String sql = "UPDATE quanlybangiay.nhanvien SET maNV = ?, hoTen = ?, ngaySinh = ?, chucVu = ?,"
                            + " gioiTinh = ?, dienThoai = ?, email = ?, diaChi = ?, cmnd = ? "
                            + "WHERE (maNV = ?)";
                    try {
                        connection.setAutoCommit(false);
                        PreparedStatement pst = connection.prepareStatement(sql);
                        pst.setString(10, temp);
                        pst.setString(1, tableModel.getValueAt(row, 0).toString());
                        pst.setString(2, tableModel.getValueAt(row, 1).toString());
                        pst.setString(3, tableModel.getValueAt(row, 2).toString());
                        pst.setString(4, tableModel.getValueAt(row, 3).toString());
                        pst.setString(5, tableModel.getValueAt(row, 4).toString());
                        pst.setString(6, tableModel.getValueAt(row, 5).toString());
                        pst.setString(7, tableModel.getValueAt(row, 6).toString());
                        pst.setString(8, tableModel.getValueAt(row, 7).toString());
                        pst.setString(9, tableModel.getValueAt(row, 8).toString());
                        pst.addBatch();
                        pst.executeUpdate();
                        connection.commit();
                        JOptionPane.showMessageDialog(null, "Successfully update");
                    } catch (HeadlessException | SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Can not update!\n" + ex.getMessage());
                    }
                }

            }
        });
        insertAbove.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                ((DefaultTableModel) employeeTable.getModel()).insertRow(employeeTable.getSelectedRow(), new Object[]{null});
                employeeTable.removeRowSelectionInterval(employeeTable.getSelectedRow(), employeeTable.getSelectedRow());
            }
        });
        insertBelow.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                ((DefaultTableModel) employeeTable.getModel()).insertRow(employeeTable.getSelectedRow() + 1, new Object[]{null});
                employeeTable.removeRowSelectionInterval(employeeTable.getSelectedRow() + 1, employeeTable.getSelectedRow() + 1);
            }
        });
        subPopupMenu.add(deleteFromTb);
        subPopupMenu.add(deleteFromDb);
        insertMenu.add(insertBelow);
        insertMenu.add(insertAbove);
        deleteMenu.add(deleteFromTb);
        deleteMenu.add(deleteFromDb);
        popupMenu.add(insertMenu);
        popupMenu.add(deleteMenu);
        popupMenu.add(update);
        return popupMenu;

    }

    private boolean isEmptyRow(int row) {
        DefaultTableModel tableModel = (DefaultTableModel) employeeTable.getModel();
        for (int i = 0; i < employeeTable.getColumnCount(); i++) {
            String data = (String) employeeTable.getValueAt(row, i);
            if (data == null) {
                return true;
            }
        }
        return false;
    }

    private void addRowData(XWPFTable table, int lastRowPosition) {
        for (int i = lastRowPosition - 1; i < employeeTable.getRowCount(); i++) {
            XWPFTableRow newRow = table.createRow();
            for (int j = 0; j < table.getRow(i).getTableCells().size(); j++) {
                newRow.getCell(j).setText(employeeTable.getValueAt(i, j).toString());
            }

        }
    }

    private static void removeParagraphs(XWPFTableCell tableCell) {
        int count = tableCell.getParagraphs().size();
        for (int i = 0; i < count; i++) {
            tableCell.removeParagraph(i);
        }
    }

    private void setDefaultTable(XWPFTable table) {
        for (int i = 1; i < table.getRows().size(); i++) {
            table.removeRow(1);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable employeeTable;
    private javax.swing.JButton exportFile;
    private javax.swing.JButton importFile;
    private javax.swing.JButton insertData;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JToolBar jToolBar5;
    private javax.swing.JComboBox<String> properties;
    private javax.swing.JTextField searchBox;
    private javax.swing.JButton viewData;
    // End of variables declaration//GEN-END:variables
}
