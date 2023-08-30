/*Tania Sofia Torres*/
package calculadora;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class callculadora extends javax.swing.JFrame {

    private String cadenaNumeros = "";
    private String operacion = "nula";
    private double primerNumero, resultado ;
    private boolean activado = true;
    private boolean punto = true;
    
    public callculadora() {
        initComponents();
        this.setTitle("Calculadora Tania Sofia Torres Romero");
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonC = new javax.swing.JButton();
        botonRaiz = new javax.swing.JButton();
        botonDivision = new javax.swing.JButton();
        botonPotencia = new javax.swing.JButton();
        botonCE = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        botonSen = new javax.swing.JButton();
        botonSumar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        botonCos = new javax.swing.JButton();
        botonRestar = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        botonTan = new javax.swing.JButton();
        botonMultiplicar = new javax.swing.JButton();
        botonPi = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        botonPunto = new javax.swing.JButton();
        botonIVA = new javax.swing.JButton();
        botonIgual = new javax.swing.JButton();
        etiquetaNumeros = new javax.swing.JLabel();
        etiquetaMuestra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new java.awt.GridLayout(5, 4));

        botonC.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        botonC.setText("C");
        botonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCActionPerformed(evt);
            }
        });
        jPanel1.add(botonC);

        botonRaiz.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonRaiz.setText("√");
        botonRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRaizActionPerformed(evt);
            }
        });
        jPanel1.add(botonRaiz);

        botonDivision.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        botonDivision.setText("/");
        botonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDivisionActionPerformed(evt);
            }
        });
        jPanel1.add(botonDivision);

        botonPotencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonPotencia.setText("^");
        botonPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPotenciaActionPerformed(evt);
            }
        });
        jPanel1.add(botonPotencia);

        botonCE.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        botonCE.setText("CE");
        botonCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCEActionPerformed(evt);
            }
        });
        jPanel1.add(botonCE);

        jButton12.setBackground(new java.awt.Color(102, 102, 102));
        jButton12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jButton12.setText("7");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jButton2.setText("8");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        jButton3.setText("9");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        botonSen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonSen.setText("sen");
        botonSen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSenActionPerformed(evt);
            }
        });
        jPanel1.add(botonSen);

        botonSumar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        botonSumar.setText("+");
        botonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSumarActionPerformed(evt);
            }
        });
        jPanel1.add(botonSumar);

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jButton5.setText("4");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);

        jButton7.setBackground(new java.awt.Color(102, 102, 102));
        jButton7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jButton7.setText("5");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);

        jButton8.setBackground(new java.awt.Color(102, 102, 102));
        jButton8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jButton8.setText("6");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);

        botonCos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonCos.setText("cos");
        botonCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCosActionPerformed(evt);
            }
        });
        jPanel1.add(botonCos);

        botonRestar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonRestar.setText("-");
        botonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestarActionPerformed(evt);
            }
        });
        jPanel1.add(botonRestar);

        jButton10.setBackground(new java.awt.Color(102, 102, 102));
        jButton10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jButton10.setText("1");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);

        jButton13.setBackground(new java.awt.Color(102, 102, 102));
        jButton13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jButton13.setText("2");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13);

        jButton14.setBackground(new java.awt.Color(102, 102, 102));
        jButton14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jButton14.setText("3");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14);

        botonTan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonTan.setText("tan");
        botonTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTanActionPerformed(evt);
            }
        });
        jPanel1.add(botonTan);

        botonMultiplicar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        botonMultiplicar.setText("X");
        botonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMultiplicarActionPerformed(evt);
            }
        });
        jPanel1.add(botonMultiplicar);

        botonPi.setBackground(new java.awt.Color(102, 102, 102));
        botonPi.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        botonPi.setText("pi");
        botonPi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPiActionPerformed(evt);
            }
        });
        jPanel1.add(botonPi);

        jButton18.setBackground(new java.awt.Color(102, 102, 102));
        jButton18.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jButton18.setText("0");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton18);

        botonPunto.setBackground(new java.awt.Color(102, 102, 102));
        botonPunto.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        botonPunto.setText(".");
        botonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuntoActionPerformed(evt);
            }
        });
        jPanel1.add(botonPunto);

        botonIVA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonIVA.setText("IVA");
        botonIVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIVAActionPerformed(evt);
            }
        });
        jPanel1.add(botonIVA);

        botonIgual.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        botonIgual.setText("=");
        botonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIgualActionPerformed(evt);
            }
        });
        jPanel1.add(botonIgual);

        etiquetaNumeros.setBackground(new java.awt.Color(153, 153, 153));
        etiquetaNumeros.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        etiquetaNumeros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaNumeros.setText("0");

        etiquetaMuestra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaMuestra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaNumeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaMuestra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(etiquetaMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRaizActionPerformed
    double primerNumero = Double.parseDouble(cadenaNumeros);
    double raizEnesima = obtenerValorRaizEnesima(); 
    double resultado = Math.pow(primerNumero, 1.0 / raizEnesima);

    etiquetaMuestra.setText("raiz enesima(" + cadenaNumeros + ", " + raizEnesima + ")");
    etiquetaNumeros.setText(String.format("%.2f", resultado));
    cadenaNumeros = String.valueOf(resultado);
    punto = true;
    }//GEN-LAST:event_botonRaizActionPerformed

private double obtenerValorRaizEnesima() {
    String input = JOptionPane.showInputDialog("Ingrese el índice de la raíz enésima:");
    double valorRaizEnesima = Double.parseDouble(input);
    return valorRaizEnesima;
}

    private void botonCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCEActionPerformed
       int tamano = cadenaNumeros.length();
       if (tamano>0){
           if (tamano ==1){
               cadenaNumeros = "0";
           }else{
               cadenaNumeros = cadenaNumeros.substring(0,cadenaNumeros.length()-1);
           }
           etiquetaNumeros.setText(cadenaNumeros);
       }
    }//GEN-LAST:event_botonCEActionPerformed

    private void botonPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPotenciaActionPerformed
           double primerNumero = Double.parseDouble(cadenaNumeros);
    double potenciaEnesima = obtenerValorPotenciaEnesima(); 
    double resultado = Math.pow(primerNumero, potenciaEnesima);

    etiquetaMuestra.setText("potencia enesima(" + cadenaNumeros + ", " + potenciaEnesima + ")");
    etiquetaNumeros.setText(String.format("%.2f", resultado));
    cadenaNumeros = String.valueOf(resultado);
    punto = true;
}                                         

private double obtenerValorPotenciaEnesima() {
    String input = JOptionPane.showInputDialog("Ingrese el exponente de la potencia enésima:");
    double valorPotenciaEnesima = Double.parseDouble(input);
    return valorPotenciaEnesima;

    }//GEN-LAST:event_botonPotenciaActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
         if (etiquetaNumeros.getText().equals("0")){
             cadenaNumeros= "7";
         }else{
             cadenaNumeros += "7";
         }
         etiquetaNumeros.setText(cadenaNumeros);
         activado = true;
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (etiquetaNumeros.getText().equals("0")){
             cadenaNumeros= "8";
         }else{
             cadenaNumeros += "8";
         }
         etiquetaNumeros.setText(cadenaNumeros);
         activado = true;
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (etiquetaNumeros.getText().equals("0")){
             cadenaNumeros= "9";
         }else{
             cadenaNumeros += "9";
         }
         etiquetaNumeros.setText(cadenaNumeros);
         activado = true;
         
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (etiquetaNumeros.getText().equals("0")){
             cadenaNumeros= "4";
         }else{
             cadenaNumeros += "4";
         }
         etiquetaNumeros.setText(cadenaNumeros);
         activado = true;
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       if (etiquetaNumeros.getText().equals("0")){
             cadenaNumeros= "5";
         }else{
             cadenaNumeros += "5";
         }
         etiquetaNumeros.setText(cadenaNumeros);
         activado = true;
         
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (etiquetaNumeros.getText().equals("0")){
             cadenaNumeros= "6";
         }else{
             cadenaNumeros += "6";
         }
         etiquetaNumeros.setText(cadenaNumeros);
         activado = true;
         
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (etiquetaNumeros.getText().equals("0")){
             cadenaNumeros= "1";
         }else{
             cadenaNumeros += "1";
         }
         etiquetaNumeros.setText(cadenaNumeros);
         activado = true;
         
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        if (etiquetaNumeros.getText().equals("0")){
             cadenaNumeros= "2";
         }else{
             cadenaNumeros += "2";
         }
         etiquetaNumeros.setText(cadenaNumeros);
         activado = true;
       
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        if (etiquetaNumeros.getText().equals("0")){
             cadenaNumeros= "3";
         }else{
             cadenaNumeros += "3";
         }
         etiquetaNumeros.setText(cadenaNumeros);
         activado = true;
        
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        if (etiquetaNumeros.getText().equals("0")){
             cadenaNumeros= "0";
         }else{
             cadenaNumeros += "0";
         }
         etiquetaNumeros.setText(cadenaNumeros);
         activado = true;
         
    }//GEN-LAST:event_jButton18ActionPerformed

    private void botonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSumarActionPerformed
        if(activado == true){
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " + ");
            cadenaNumeros = "";
            operacion = "sumar";
            
            activado = false;
            punto = true;
        }
    }//GEN-LAST:event_botonSumarActionPerformed

    private void botonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIgualActionPerformed
       double segundoNumero;
       if (operacion.equals("nula")){
           etiquetaNumeros.setText(cadenaNumeros);
       }
       else if (operacion.equals("sumar")){
           segundoNumero= Double.parseDouble(cadenaNumeros);
           resultado = primerNumero + segundoNumero;
           etiquetaNumeros.setText(String.format("% .2f", resultado));
           cadenaNumeros = String.valueOf(resultado);
           operacion = "nula";  
       }
        else if (operacion.equals("restar")){
           segundoNumero= Double.parseDouble(cadenaNumeros);
           resultado = primerNumero - segundoNumero;
           etiquetaNumeros.setText(String.format("% .2f", resultado));
           cadenaNumeros = String.valueOf(resultado);
           operacion = "nula";  
       }
        else if (operacion.equals("multiplicar")){
           segundoNumero= Double.parseDouble(cadenaNumeros);
           resultado = primerNumero * segundoNumero;
           etiquetaNumeros.setText(String.format("% .2f", resultado));
           cadenaNumeros = String.valueOf(resultado);
           operacion = "nula";  
       }
        else if (operacion.equals("dividir")) {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            if (segundoNumero == 0) {
                etiquetaNumeros.setText("No se puede dividir entre cero");
            } else {
                resultado = primerNumero * segundoNumero;
                etiquetaNumeros.setText(String.format("% .2f", resultado));
                cadenaNumeros = String.valueOf(resultado);
                operacion = "nula";
            }
        }
       etiquetaMuestra.setText("");
       activado = true;
       punto = false;
    }//GEN-LAST:event_botonIgualActionPerformed

    private void botonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestarActionPerformed
         if(activado == true){
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " - ");
            cadenaNumeros = "";
            operacion = "restar";
            
            activado = false;
            punto = true;
            
        }
    }//GEN-LAST:event_botonRestarActionPerformed

    private void botonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMultiplicarActionPerformed
         if(activado == true){
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " * ");
            cadenaNumeros = "";
            operacion = "multiplicar";
            
            activado = false;
            punto = true;
            
        }
    }//GEN-LAST:event_botonMultiplicarActionPerformed

    private void botonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDivisionActionPerformed
         if(activado == true){
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " / ");
            cadenaNumeros = "";
            operacion = "dividir";
            
            activado = false;
            punto = true;
        }
    }//GEN-LAST:event_botonDivisionActionPerformed

    private void botonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntoActionPerformed
        if (punto == true){
            if (cadenaNumeros.equals("")){
                cadenaNumeros= "0.";
            }else{
                cadenaNumeros += ".";
            }
            etiquetaNumeros.setText(cadenaNumeros);
            punto= false;
        }
    }//GEN-LAST:event_botonPuntoActionPerformed

    private void botonPiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPiActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
    cadenaNumeros = String.valueOf(Math.PI);
    } else {
    cadenaNumeros += String.valueOf(Math.PI);
    }
    etiquetaNumeros.setText(cadenaNumeros);
    activado = true;

    }//GEN-LAST:event_botonPiActionPerformed

    private void botonTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTanActionPerformed
    double primerNumero = Double.parseDouble(cadenaNumeros);
    double tangente = calcularTangente(primerNumero);

    if (Double.isNaN(tangente)) {
        etiquetaMuestra.setText("tangente(" + cadenaNumeros + ") es indefinida");
        etiquetaNumeros.setText("Indefinido");
    } else {
        etiquetaMuestra.setText("tangente(" + cadenaNumeros + ")");
        etiquetaNumeros.setText(String.format("%.2f", tangente));
        cadenaNumeros = String.valueOf(tangente);
        punto = true;
    }
}                                         

private double calcularTangente(double numero) {
    double tangente = Math.tan(Math.toRadians(numero));
    return tangente;
    }//GEN-LAST:event_botonTanActionPerformed

    private void botonSenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSenActionPerformed
    double primerNumero = Double.parseDouble(cadenaNumeros);
    double seno = calcularSeno(primerNumero);

    etiquetaMuestra.setText("sen(" + cadenaNumeros + ")");
    etiquetaNumeros.setText(String.format("%.2f", seno));
    cadenaNumeros = String.valueOf(seno);
    punto = true;
    }                                         

    private double calcularSeno(double numero) {
    double seno = Math.sin(Math.toRadians(numero));
    return seno;
    }//GEN-LAST:event_botonSenActionPerformed

    private void botonCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCosActionPerformed
    double primerNumero = Double.parseDouble(cadenaNumeros);
    double coseno = calcularCoseno(primerNumero);

    etiquetaMuestra.setText("coseno(" + cadenaNumeros + ")");
    etiquetaNumeros.setText(String.format("%.2f", coseno));
    cadenaNumeros = String.valueOf(coseno);
    punto = true;
    }                                         

    private double calcularCoseno(double numero) {
    double coseno = Math.cos(Math.toRadians(numero));
    return coseno;
    }//GEN-LAST:event_botonCosActionPerformed

    private void botonIVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIVAActionPerformed
    double monto = Double.parseDouble(cadenaNumeros);
    double porcentajeIVA = 0.19; 

    double iva = calcularIVA(monto, porcentajeIVA);

    etiquetaMuestra.setText("IVA del " + (porcentajeIVA * 100) + "% en $" + cadenaNumeros);
    etiquetaNumeros.setText(String.format("%.2f", iva));
    cadenaNumeros = String.valueOf(iva);
    punto = true;
    }                                         

private double calcularIVA(double monto, double porcentajeIVA) {
    return monto * porcentajeIVA;
    }//GEN-LAST:event_botonIVAActionPerformed

    private void botonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCActionPerformed
        etiquetaMuestra.setText("");
        etiquetaNumeros.setText("0");
        operacion = "nula";
        cadenaNumeros = "";
        activado = true;
        punto = true;

    }//GEN-LAST:event_botonCActionPerformed

    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        
        UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new callculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonC;
    private javax.swing.JButton botonCE;
    private javax.swing.JButton botonCos;
    private javax.swing.JButton botonDivision;
    private javax.swing.JButton botonIVA;
    private javax.swing.JButton botonIgual;
    private javax.swing.JButton botonMultiplicar;
    private javax.swing.JButton botonPi;
    private javax.swing.JButton botonPotencia;
    private javax.swing.JButton botonPunto;
    private javax.swing.JButton botonRaiz;
    private javax.swing.JButton botonRestar;
    private javax.swing.JButton botonSen;
    private javax.swing.JButton botonSumar;
    private javax.swing.JButton botonTan;
    private javax.swing.JLabel etiquetaMuestra;
    private javax.swing.JLabel etiquetaNumeros;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
