package group8_java.school_business_tour_management.views;

import group8_java.school_business_tour_management.common.MessageDialog;
import group8_java.school_business_tour_management.dao.StudentDAO;
import group8_java.school_business_tour_management.models.Classroom;
import group8_java.school_business_tour_management.models.Student;
import group8_java.school_business_tour_management.services.ClassroomService;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ManageClassroom extends javax.swing.JFrame {
    public ManageClassroom() {
        initComponents();
        setLocationRelativeTo(null);
        initializeTable();
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
        turnBackHome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ClassroomTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ClassroomIdField = new javax.swing.JTextField();
        ClassroomNameField = new javax.swing.JTextField();
        ListStudentButton = new javax.swing.JButton();
        deleteClassroomButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        updateClassroomButton = new javax.swing.JButton();
        createClassroomButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý lớp học");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÍ THÔNG TIN LỚP HỌC");

        turnBackHome.setText("Quay lại trang chủ");
        turnBackHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnBackHomeActionPerformed(evt);
            }
        });

        ClassroomTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ClassroomTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClassroomTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ClassroomTable);

        jLabel2.setText("Mã lớp học :");

        jLabel3.setText("Tên lớp học: ");

        ClassroomIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassroomIdFieldActionPerformed(evt);
            }
        });

        ListStudentButton.setText("Danh sách sinh viên ");
        ListStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListStudentButtonActionPerformed(evt);
            }
        });

        deleteClassroomButton.setText("Xóa");
        deleteClassroomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteClassroomButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Nhập lại");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        updateClassroomButton.setText("Sửa");
        updateClassroomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateClassroomButtonActionPerformed(evt);
            }
        });

        createClassroomButton.setText("Thêm ");
        createClassroomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createClassroomButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(turnBackHome))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClassroomIdField, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(ClassroomNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(ListStudentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteClassroomButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updateClassroomButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(createClassroomButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(turnBackHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(ClassroomIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ClassroomNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(ListStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(createClassroomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(updateClassroomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteClassroomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void turnBackHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnBackHomeActionPerformed
        dispose();
        Home homeScreen = new Home();
        homeScreen.setLocationRelativeTo(null);
        homeScreen.setVisible(true);
    }//GEN-LAST:event_turnBackHomeActionPerformed

    private void ListStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListStudentButtonActionPerformed

        try {
            int index = ClassroomTable.getSelectedRow();
            if (index == -1) {
                MessageDialog.showInfoDialog(this, "Vui chọn lớp học để xem danh sách", "Thông báo");
                return;
            }
            Classroom selectedClassroom = ClassroomService.getClassroomByIndex(index);
            ClassroomIdField.setText(selectedClassroom.getCode());
            ClassroomNameField.setText(selectedClassroom.getName());

            dispose();
            ManageListStudentClass manageListStudentClass = new ManageListStudentClass(selectedClassroom);
            manageListStudentClass.setLocationRelativeTo(null);
            manageListStudentClass.setVisible(true);
        } catch (Exception ex) {
            MessageDialog.showErrorDialog(this, "Chuyển trang lỗi , chi tiết: " + ex.getMessage() + "\n" + ex.toString() + "\n", "Có lỗi xảy ra");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_ListStudentButtonActionPerformed

    private void clearAllFields() {
        ClassroomIdField.setText("");
        ClassroomNameField.setText("");
    }

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        clearAllFields();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void ClassroomTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClassroomTableMouseClicked
        try {
            int index = ClassroomTable.getSelectedRow();
            if (index == -1) {
                MessageDialog.showInfoDialog(this, "Vui chọn dòng trong bảng để sửa", "Thông báo");
                return;
            }
            Classroom selectedClassroom = ClassroomService.getClassroomByIndex(index);
            ClassroomIdField.setText(selectedClassroom.getCode());
            ClassroomNameField.setText(selectedClassroom.getName());
        } catch (Exception ex) {
            MessageDialog.showErrorDialog(this, "Cập nhật lớp học mới có lỗi, chi tiết: " + ex.getMessage() + "\n" + ex.toString() + "\n", "Có lỗi xảy ra");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_ClassroomTableMouseClicked

    private void deleteClassroomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteClassroomButtonActionPerformed
        try {
            int index = ClassroomTable.getSelectedRow();
            if (index == -1) {
                MessageDialog.showInfoDialog(this, "Vui chọn dòng trong bảng để xóa", "Thông báo");
                return;
            }
            Classroom selectedClassroom = ClassroomService.getClassroomByIndex(index);
            int count = 0;
            List<Student> data_students = StudentDAO.readFromFile();
            for (Student item : data_students) {
                if(item.getClassId() == selectedClassroom.getId())
                {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                int keyPress = MessageDialog.showConfirmDialog(this, "Bạn có chắc muốn xóa lớp học " + selectedClassroom.getName(), "Xác nhận");
                if (keyPress == 0) {
                    ClassroomService.deleteClassroom(selectedClassroom.getId());
                    loadTableData();
                    clearAllFields();
                }
                MessageDialog.showInfoDialog(jLabel1, "Xóa lớp học thành công", "Thông báo");
            }else{
                MessageDialog.showInfoDialog(jLabel1, "Không thể xóa lớp học này vì trong lớp học vẫn còn sinh viên", "Thông báo");
                return;
            }
        } catch (Exception ex) {
            MessageDialog.showErrorDialog(this, "Xóa Lớp học mới có lỗi, chi tiết: " + ex.getMessage() + "\n" + ex.toString() + "\n", "Có lỗi xảy ra");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_deleteClassroomButtonActionPerformed

    private void updateClassroomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateClassroomButtonActionPerformed
        try {
            int index = ClassroomTable.getSelectedRow();
            if (index == -1) {
                MessageDialog.showInfoDialog(this, "Vui chọn dòng trong bảng để sửa", "Thông báo");
                return;
            }
            Classroom selectedClassroom = ClassroomService.getClassroomByIndex(index);

            String classroomId = this.ClassroomIdField.getText().trim();
            String classroomName = this.ClassroomNameField.getText().trim();
            if (classroomId.equals("")) {
                MessageDialog.showInfoDialog(this, "Mã lớp học không được bỏ trống", "Thông báo");
                return;
            }
            if (classroomName.equals("")) {
                MessageDialog.showInfoDialog(this, "Tên lớp học không được bỏ trống", "Thông báo");
                return;
            }
            if (ClassroomService.isExistedCode(classroomId)) {
                MessageDialog.showInfoDialog(this, "Tên lớp học đã tồn tại trong hệ thống, vui lòng nhập lại", "Thông báo");
            }

            selectedClassroom.setCode(classroomId);
            selectedClassroom.setName(classroomName);
            ClassroomService.updateClassroom(selectedClassroom);
            MessageDialog.showInfoDialog(this, "Cập nhật lớp học thành công!", "Thông báo");
            clearAllFields();
            loadTableData();

        } catch (Exception ex) {
            MessageDialog.showErrorDialog(this, "Cập nhật lớp học mới có lỗi, chi tiết: " + ex.getMessage() + "\n" + ex.toString() + "\n", "Có lỗi xảy ra");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_updateClassroomButtonActionPerformed

    private void ClassroomIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassroomIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClassroomIdFieldActionPerformed

    private void createClassroomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createClassroomButtonActionPerformed
        try {
            String code = ClassroomIdField.getText().trim();
            String name = ClassroomNameField.getText().trim();
            if (code.equals("")) {
                MessageDialog.showInfoDialog(jLabel1, "Bạn chưa nhập mã lớp học", "Thông báo");
                return;
            }
            if (name.equals("")) {
                MessageDialog.showInfoDialog(jLabel1, "Bạn chưa nhập tên lớp học", "Thông báo");
                return;
            }
            if (ClassroomService.isExistedCode(code)) {
                MessageDialog.showInfoDialog(jLabel1, "Mã lớp học đã tồn tại", "Thông báo");
                return;
            }
            if (ClassroomService.isExistedName(name)) {
                MessageDialog.showInfoDialog(jLabel1, "Tên lớp học đã tồn tại", "Thông báo");
                return;
            }
            ClassroomService.createNewClassroom(code, name);
            loadTableData();
            MessageDialog.showInfoDialog(jLabel1, "Đã thêm mới một lóp học", "Thông báo");
        } catch (Exception ex) {
            MessageDialog.showErrorDialog(jLabel1, "Có lỗi, chi tiết: " + ex.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_createClassroomButtonActionPerformed

    private DefaultTableModel tableModel;

    private void initializeTable() {
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new String[]{"STT", "Mã lớp học", "Tên lớp học"});
        ClassroomTable.setModel(tableModel);

        loadTableData();
    }

    private void loadTableData() {
        try {
            List<Classroom> data = ClassroomService.getAllClassroom();
            tableModel.setRowCount(0);
            int count = 0;
            if (data != null) {
                for (Classroom item : data) {
                    count++;
                    tableModel.addRow(new Object[]{count, item.getCode(), item.getName()});
                }
            }
            tableModel.fireTableDataChanged();
        } catch (Exception ex) {
            MessageDialog.showErrorDialog(this, "Tải dữ liệu cho bảng có lỗi! Chi tiết: " + ex.getMessage(), "Có lỗi xảy ra");
            ex.printStackTrace();
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
            java.util.logging.Logger.getLogger(ManageClassroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageClassroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageClassroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageClassroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageClassroom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ClassroomIdField;
    private javax.swing.JTextField ClassroomNameField;
    private javax.swing.JTable ClassroomTable;
    private javax.swing.JButton ListStudentButton;
    private javax.swing.JButton createClassroomButton;
    private javax.swing.JButton deleteClassroomButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton turnBackHome;
    private javax.swing.JButton updateClassroomButton;
    // End of variables declaration//GEN-END:variables
}
