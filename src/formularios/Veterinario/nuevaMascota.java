package formularios.Veterinario;

import clases.Instancias;
import clases.Veterinario.ndHistoria;
import clases.Veterinario.ndMascota;
import logs.Logs;
import clases.metodosGenerales;
import clases.terceros.ndTercero;
import formularios.terceros.buscClientes;
import java.awt.event.KeyEvent;

public class nuevaMascota extends javax.swing.JDialog {

    private metodosGenerales metodos;
    private Instancias instancias;
    private String opc;

    private infGuarderia guarderia;
//    private infAgenda agenda;
    private boolean nuevo = true;
    private infIngresoHospitalizacion ingresoHospitalizacion;

    public infIngresoHospitalizacion getIngresoHospitalizacion() {
        return ingresoHospitalizacion;
    }

    public void setIngresoHospitalizacion(infIngresoHospitalizacion ingresoHospitalizacion) {
        this.ingresoHospitalizacion = ingresoHospitalizacion;
    }

//    public infAgenda getAgenda() {
//        return agenda;
//    }
//
//    public void setAgenda(infAgenda agenda) {
//        this.agenda = agenda;
//    }
    public infGuarderia getGuarderia() {
        return guarderia;
    }

    public void setGuarderia(infGuarderia guarderia) {
        this.guarderia = guarderia;
    }

    public nuevaMascota(java.awt.Frame parent, boolean modal, metodosGenerales metodos, Instancias instancias, String opc, String cliente) {
        super(parent, modal);
        initComponents();
        this.instancias = instancias;
        this.metodos = metodos;
        this.opc = opc;
        this.setLocationRelativeTo(null);

        txtFecha.setSelectedDate(metodos.haciaDate(metodos.fecha2(metodosGenerales.fecha())));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lbRazon = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        lbNit = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        lbNit1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lbRazon1 = new javax.swing.JLabel();
        txtNombreMascota = new javax.swing.JTextField();
        lbDireccion2 = new javax.swing.JLabel();
        txtFecha = new datechooser.beans.DateChooserCombo();
        lbTelefono1 = new javax.swing.JLabel();
        cmbEspecie = new javax.swing.JComboBox();
        lbTelefono2 = new javax.swing.JLabel();
        txtRaza = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbTelefono.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTelefono.setText("Tel??fono: ");

        txtTelefono.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTelefono.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTelefono.setEnabled(false);
        txtTelefono.setName("Tel??fono"); // NOI18N
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNombre.setEnabled(false);
        txtNombre.setName("Raz??n social"); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });

        lbRazon.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbRazon.setText("Raz??n social: ");

        txtNit.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNit.setName("Nit"); // NOI18N
        txtNit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNitKeyReleased(evt);
            }
        });

        lbNit.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbNit.setText("CC/Nit: *");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbRazon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefono)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbRazon, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lbNit1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbNit1.setText("Mascota: *");

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo.setName("Codigo"); // NOI18N
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        lbRazon1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbRazon1.setText("Nombre: *");

        txtNombreMascota.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNombreMascota.setName("Nombre"); // NOI18N
        txtNombreMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreMascotaActionPerformed(evt);
            }
        });
        txtNombreMascota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreMascotaKeyReleased(evt);
            }
        });

        lbDireccion2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbDireccion2.setText("F.Nacimiento:*");

        try {
            txtFecha.setDefaultPeriods(new datechooser.model.multiple.PeriodSet());
        } catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
            e1.printStackTrace();
        }
        txtFecha.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 12));
        txtFecha.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
            public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
                txtFechaOnSelectionChange(evt);
            }
        });
        txtFecha.addCommitListener(new datechooser.events.CommitListener() {
            public void onCommit(datechooser.events.CommitEvent evt) {
                txtFechaOnCommit(evt);
            }
        });

        lbTelefono1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbTelefono1.setText("Especie: *");

        cmbEspecie.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmbEspecie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Perro", "Gato", "Ave" }));

        lbTelefono2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTelefono2.setText("Raza:");

        txtRaza.setBackground(new java.awt.Color(255, 204, 204));
        txtRaza.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtRaza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRazaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbNit1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(lbRazon1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTelefono2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreMascota)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lbDireccion2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNit1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRazon1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbDireccion2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        btnGuardar.setBackground(new java.awt.Color(46, 204, 113));
        btnGuardar.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("GUARDAR    ");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnGuardar.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(241, 148, 138));
        btnEliminar.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar2.png"))); // NOI18N
        btnEliminar.setText("CANCELAR");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnEliminar.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminar))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtTelefono.requestFocus();
        }
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased

    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        metodos.soloNum(evt);
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        Object[] campos = {txtNombreMascota};
        String faltantes = metodos.camposVacios(campos);

        if (!faltantes.equals("")) {
            metodos.msgAdvertencia(null, "No puede continuar, faltan los siguientes campos: " + faltantes);
            return;
        }

        if (metodos.msgPregunta(null, "??Desea continuar?") == 0) {

            //REGISTRAR UNA NUEVA MASCOTA;
            ndMascota nodoMascota = instancias.getSql().getDatosMascota(txtCodigo.getText());

            if (nodoMascota.getCliente() != null) {
                metodos.msgError(null, "La mascota ya existe");
                txtCodigo.requestFocus();
                return;
            }

            String especie = cmbEspecie.getSelectedItem().toString();
            Object[] vectorMascota = {txtNit.getText(), txtCodigo.getText(), txtNombreMascota.getText(), especie, txtRaza.getText(),
                "", txtFecha.getText(), "", "", "", "", "", "", ""};

            nodoMascota = metodos.llenarMascota(vectorMascota);

            if (!instancias.getSql().agregarMascota(nodoMascota)) {
                metodos.msgError(null, "Error al guardar la mascota");
                return;
            }

            Object[] vectorHist = {"HIST-" + instancias.getSql().getNumConsecutivo("HIST")[0], txtCodigo.getText(), "", "", "", "",
                "", "", instancias.getUsuarioLog().getUsuario(), metodos.fechaConsulta(metodosGenerales.fecha())};

            ndHistoria nodoHist = metodos.llenarHistoria(vectorHist);

            if (!instancias.getSql().agregarHistoria(nodoHist)) {
                metodos.msgError(null, "Error al abrir la historia");
                return;
            }

//            if (!instancias.getSql().aumentarConsecutivo("HIST", Integer.parseInt((String) instancias.getSql().getNumConsecutivo("HIST")[0]) + 1)) {
//                metodos.msgError(null, "Hubo un problema al guardar en el consecutivo de las historias clinicas");
//            }

            metodos.msgExito(null, "Mascota registrado con ??xito");

            Logs.log(opc);
            switch (opc) {
                case "agenda":
//                    instancias.getBuscMascotas().dispose();
//                    agenda.nuevaMascota(txtNombreMascota.getText());
//                    if (nuevo) {
//                        agenda.cargarNuevoPaciente(txtNit.getText(), txtNombre.getText(), txtTelefono.getText());
//                    }
//                    this.dispose();
                    break;
                case "guarderia":
                    instancias.getBuscMascotas().dispose();
//                    guarderia.nuevaMascota(txtCodigo.getText());
                    this.dispose();
                    break;
                case "ingresoHospital":
                    instancias.getBuscMascotas().dispose();
                    ingresoHospitalizacion.nuevaMascota(txtCodigo.getText());
                    this.dispose();
                    break;
                default:
                    this.dispose();
                    break;
            }

//            } catch (Exception e) {
//                metodos.msgError(null, "Hubo un problema al guardar el Tercero");
//            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        this.dispose();

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoKeyPressed

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cargarMascota(txtCodigo.getText());
        } else {
            txtNombreMascota.setText("");
            txtRaza.setText("");
            cmbEspecie.setSelectedIndex(0);
            txtFecha.setSelectedDate(metodos.haciaDate(metodos.fecha2(metodosGenerales.fecha())));
        }
    }//GEN-LAST:event_txtCodigoKeyReleased

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped

    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtNombreMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreMascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMascotaActionPerformed

    private void txtNombreMascotaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreMascotaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtFecha.requestFocus();
        }

        String nombre = "";

        try {
            nombre = txtNombreMascota.getText().substring(0, 3);
        } catch (IndexOutOfBoundsException e) {
            nombre = txtNombreMascota.getText();
        }
        txtCodigo.setText(txtNit.getText() + "-" + nombre);

    }//GEN-LAST:event_txtNombreMascotaKeyReleased

    private void txtFechaOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_txtFechaOnCommit
        cmbEspecie.requestFocus();
    }//GEN-LAST:event_txtFechaOnCommit

    private void txtFechaOnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_txtFechaOnSelectionChange

    }//GEN-LAST:event_txtFechaOnSelectionChange

    private void txtRazaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtRaza.getText().equals("")) {
                btnGuardar.requestFocus();
                instancias.getBuscRazas().dispose();
            } else {
                ventanaRazas(txtRaza.getText());
            }
        } else {
            txtRaza.setText("");
        }
    }//GEN-LAST:event_txtRazaKeyReleased

    private void txtNitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNitKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cargarCliente(txtNit.getText());
        } else {
            txtTelefono.setText("");
            txtNombre.setText("");
            txtCodigo.setText("");
        }
    }//GEN-LAST:event_txtNitKeyReleased

    public void cargarCliente(String nit) {
        ndTercero nodo = instancias.getSql().getDatosTercero(nit);
        if (nodo.getId() != null) {
            txtTelefono.setText(nodo.getTelefono());
            txtNombre.setText(nodo.getNombre());
            txtCodigo.setText(nodo.getId() + "-");
            txtNombreMascota.requestFocus();
            return;
        }
        ventanaTerceros(nit);
    }

    public void ventanaTerceros(String nit) {
        buscClientes buscar = new buscClientes(instancias.getMenu(), rootPaneCheckingEnabled, true, null, "");
        buscar.setLocationRelativeTo(null);
        instancias.setBusClientes(buscar);
        instancias.setCampoActual(txtNit);
        txtNit.requestFocus();
        buscar.noEncontrado(nit);
        buscar.show();
    }

    public void ventanaRazas(String nit) {
        String tipo = cmbEspecie.getSelectedItem().toString();
        buscRazas buscar = new buscRazas(instancias.getMenu(), rootPaneCheckingEnabled, tipo);
        buscar.setLocationRelativeTo(null);
        instancias.setBuscRazas(buscar);
        instancias.setCampoActual(txtRaza);
        txtRaza.requestFocus();
        buscar.setInstancia(instancias);
        buscar.noEncontrado(nit);
        buscar.show();
    }

    public void cargarMascota(String nit) {
        ndMascota nodo = instancias.getSql().getDatosMascota(nit);
        ndTercero cliente = instancias.getSql().getDatosTercero(nodo.getCliente());
        if (nodo.getCodigo() != null) {
            txtNombre.setText(cliente.getNombre());
            txtCodigo.setEditable(false);
            txtNombre.setText(nodo.getNombre());
            txtRaza.setText(nodo.getRaza());
            txtFecha.setSelectedDate(metodos.haciaDate(nodo.getEdad()));
            txtCodigo.setText(nit);
            btnGuardar.setEnabled(false);
            return;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox cmbEspecie;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbDireccion2;
    private javax.swing.JLabel lbNit;
    private javax.swing.JLabel lbNit1;
    private javax.swing.JLabel lbRazon;
    private javax.swing.JLabel lbRazon1;
    private javax.swing.JLabel lbTelefono;
    private javax.swing.JLabel lbTelefono1;
    private javax.swing.JLabel lbTelefono2;
    private javax.swing.JTextField txtCodigo;
    private datechooser.beans.DateChooserCombo txtFecha;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreMascota;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
