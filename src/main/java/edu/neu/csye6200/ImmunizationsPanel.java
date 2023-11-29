package edu.neu.csye6200;

import edu.neu.csye6200.controller.StudentController;
import edu.neu.csye6200.controller.TeacherController;
import edu.neu.csye6200.controller.VaccinationController;
import edu.neu.csye6200.model.Immunization;
import edu.neu.csye6200.service.ClassroomFactory;

import java.util.Calendar;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ImmunizationsPanel extends javax.swing.JPanel {

    @Autowired
    TeacherController teacherController;
    @Autowired
    StudentController studentController;
    @Autowired
    VaccinationController vaccinationController;
    @Autowired
    ClassroomFactory classroomFactory;

    public ImmunizationsPanel() {
        initComponents();
    }

    @PostConstruct
    public void init() {
        try {
            this.populateBodyVaccinations();
        } catch (Exception c) {
            c.printStackTrace();
            System.out.println("Something went wrong!");
        }
    }

    public void populateBodyVaccinations() {
        List<Immunization> vaccinations = vaccinationController.getAllVaccines();

        if (vaccinations.size()<=1&&vaccinations.get(0).getV1t1()==null) {
            vaccinations.remove(0);
            vaccinationController.addTestData();
        } else {
            DefaultTableModel model = (DefaultTableModel) tableVaccines.getModel();

            if (model.getRowCount() == 0) {
                vaccinations.forEach(t -> {
                    model.addRow(new Object[]{t.getPersonID(), t.readVaccine(), t.getV1t1(), t.getV1t2(), t.readVaccine2(), t.getV2t1()});
                });
            }

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        tfPersonId = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tfv1t1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        tfv2t1 = new javax.swing.JTextField();
        addVacButton = new javax.swing.JButton();
        clearVacButton = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        tfVaccine2 = new javax.swing.JTextField();
        tfVaccine1 = new javax.swing.JTextField();
        tfv1t2 = new javax.swing.JTextField();
        deleteVacButton = new javax.swing.JButton();
        Renewal1 = new java.awt.Button();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableVaccines = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(1000, 800));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Immunization Record", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel5.setOpaque(false);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setText("ID");

        tfPersonId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfPersonId.setToolTipText("");
        tfPersonId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPersonIdActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setText("Vaccine 1");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setText("Dose 1");

        tfv1t1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfv1t1.setToolTipText("");
        tfv1t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfv1t1ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setText("Dose 2");

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setText("Vaccine 2");

        tfv2t1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfv2t1.setToolTipText("");
        tfv2t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfv2t1ActionPerformed(evt);
            }
        });

        addVacButton.setBackground(new java.awt.Color(204, 255, 255));
        addVacButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addVacButton.setText("Add");
        addVacButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVacButtonActionPerformed(evt);
            }
        });

        clearVacButton.setBackground(new java.awt.Color(204, 255, 255));
        clearVacButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clearVacButton.setText("Clear");
        clearVacButton.setPreferredSize(new java.awt.Dimension(89, 29));
        clearVacButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearVacButtonActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setText("Dose 1");

        tfVaccine2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfVaccine2.setToolTipText("");
        tfVaccine2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfVaccine2ActionPerformed(evt);
            }
        });

        tfVaccine1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfVaccine1.setToolTipText("");
        tfVaccine1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfVaccine1ActionPerformed(evt);
            }
        });

        tfv1t2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfv1t2.setToolTipText("");
        tfv1t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfv1t2ActionPerformed(evt);
            }
        });

        deleteVacButton.setBackground(new java.awt.Color(204, 255, 255));
        deleteVacButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        deleteVacButton.setText("Delete");
        deleteVacButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteVacButtonActionPerformed(evt);
            }
        });

        Renewal1.setActionCommand("alert");
        Renewal1.setBackground(new java.awt.Color(204, 204, 204));
        Renewal1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Renewal1.setForeground(new java.awt.Color(0, 0, 0));
        Renewal1.setLabel("Alert");
        Renewal1.setPreferredSize(new java.awt.Dimension(89, 29));
        Renewal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Renewal1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfv1t2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(tfv1t1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfVaccine1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPersonId, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfVaccine2)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfv2t1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(128, 128, 128))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(addVacButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteVacButton, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearVacButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Renewal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPersonId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(tfVaccine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfv1t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfv1t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfVaccine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(tfv2t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addVacButton)
                        .addComponent(deleteVacButton)
                        .addComponent(clearVacButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Renewal1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        tableVaccines.setBackground(new java.awt.Color(204, 204, 204));
        tableVaccines.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tableVaccines.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Vaccine 1", "Dose 1", "Dose 2", "Vaccine 2", "Dose 1"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableVaccines.setGridColor(new java.awt.Color(204, 204, 204));
        tableVaccines.setSelectionBackground(new java.awt.Color(153, 204, 255));
        jScrollPane3.setViewportView(tableVaccines);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfPersonIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPersonIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPersonIdActionPerformed

    private void tfVaccine1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfVaccine1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfVaccine1ActionPerformed

    private void tfv1t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfv1t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfv1t1ActionPerformed

    private void tfv1t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfv1t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfv1t2ActionPerformed

    private void tfv2t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfv2t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfv2t1ActionPerformed

    private void addVacButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVacButtonActionPerformed
        // TODO add your handling code here:
        String id = tfPersonId.getText();
        String vaccine1 = tfVaccine1.getText();
        String v1t1 = tfv1t1.getText();
        String v1t2 = tfv1t2.getText();
        String vaccine2 = tfVaccine2.getText();
        String v2t1 = tfv2t1.getText();

        if (id.isEmpty() || vaccine1.isEmpty() || v1t1.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter Atleast 1 vaccination info", "Try Again", JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) tableVaccines.getModel();
            model.addRow(new Object[]{id, vaccine1, v1t1, v1t2, vaccine2, v2t1});
        }

        tfPersonId.setText("");
        tfVaccine1.setText("");
        tfv1t1.setText("");
        tfv1t2.setText("");
        tfVaccine2.setText("");
        tfv2t1.setText("");

        String csv = id + "," + vaccine1 + "," + v1t1 + "," + v1t2 + "," + vaccine2 + "," + v2t1;
        System.err.println(csv + "is added to vaccine db");

        vaccinationController.addVaccine(csv);
    }//GEN-LAST:event_addVacButtonActionPerformed

    private void clearVacButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearVacButtonActionPerformed
        // TODO add your handling code here:
        tfPersonId.setText("");
        tfVaccine1.setText("");
        tfv1t1.setText("");
        tfv1t2.setText("");
        tfVaccine2.setText("");
        tfv2t1.setText("");
    }//GEN-LAST:event_clearVacButtonActionPerformed

    private void tfVaccine2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfVaccine2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfVaccine2ActionPerformed

    private void deleteVacButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteVacButtonActionPerformed
        // TODO add your handling code here:
        int row = tableVaccines.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "No Row is Selected", "Please Select Row", JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) tableVaccines.getModel();
           
            int pkid = Integer.parseInt(model.getValueAt(row, 0).toString());
            model.removeRow(row);

            System.err.println(pkid + " is deleted : " + row);
            vaccinationController.removeVaccineById(pkid);

        }
    }//GEN-LAST:event_deleteVacButtonActionPerformed

    private void Renewal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Renewal1ActionPerformed
        // TODO add your handling code here:
        int row = tableVaccines.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "No Row is Selected", "Please Select Row", JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) tableVaccines.getModel();
         

            int pkid = Integer.parseInt(model.getValueAt(row, 0).toString());

            System.err.println(pkid + " is selected : " + row);
            Immunization vaccination = vaccinationController.getVaccinesById(pkid).get();
            if (vaccination.readVaccine() == null && vaccination.readVaccine2() == null) {
                JOptionPane.showMessageDialog(this, "Student is to be vaccinated", "Vaccination alert", JOptionPane.ERROR_MESSAGE);
            } else if (vaccination.getV1t2() == null) {
                Calendar c = Calendar.getInstance();
                c.setTime(vaccination.getV1t1());
                c.add(Calendar.MONTH, 3);
                JOptionPane.showMessageDialog(this, c.getTime().toString(), " Next Immunization date(Dose 2)", JOptionPane.ERROR_MESSAGE);
            } else if (vaccination.readVaccine2() == null) {
                Calendar c = Calendar.getInstance();
                c.setTime(vaccination.getV1t1());
                c.add(Calendar.YEAR, 1);
                JOptionPane.showMessageDialog(this, c.getTime().toString(), " Next Immunization date(Vaccine 2)", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_Renewal1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Renewal1;
    private javax.swing.JButton addVacButton;
    private javax.swing.JButton clearVacButton;
    private javax.swing.JButton deleteVacButton;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tableVaccines;
    private javax.swing.JTextField tfPersonId;
    private javax.swing.JTextField tfVaccine1;
    private javax.swing.JTextField tfVaccine2;
    private javax.swing.JTextField tfv1t1;
    private javax.swing.JTextField tfv1t2;
    private javax.swing.JTextField tfv2t1;
    // End of variables declaration//GEN-END:variables
}
