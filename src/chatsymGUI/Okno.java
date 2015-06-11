/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatsymGUI;

import chatsym.Chatsym;
import java.util.ArrayList;
import java.util.Random;
import kontener.Kontener;

/**
 *
 * @author Mateusz
 */
public class Okno extends javax.swing.JFrame {

    /**
     * Creates new form Okno
     */
    public Okno() {
        initComponents();
    }

    //Tree t = new Tree();
    Kontener k = new Kontener();
    ArrayList<String> gen = new ArrayList<>();
    private static int ngram = 3;
    private static int odpowiedz = 5;
    
    //String tmp;
    //tmp = Chatsym.readFile("abc");

    Random rand = new Random();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        poleTekstowe = new javax.swing.JTextField();
        wyslij = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        oknoCzatu = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        zakoncz = new javax.swing.JButton();
        opcje = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        statSlowa = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        statNgramy = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        statGraf = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        poleTekstowe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poleTekstoweActionPerformed(evt);
            }
        });

        wyslij.setText("Wyślij");
        wyslij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wyslijActionPerformed(evt);
            }
        });

        oknoCzatu.setEditable(false);
        oknoCzatu.setColumns(20);
        oknoCzatu.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        oknoCzatu.setLineWrap(true);
        oknoCzatu.setRows(5);
        jScrollPane1.setViewportView(oknoCzatu);

        jLabel1.setText("Okno czatu");

        jLabel2.setText("Statystyki");

        zakoncz.setText("Zakończ");
        zakoncz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zakonczActionPerformed(evt);
            }
        });

        opcje.setText("Opcje");
        opcje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcjeActionPerformed(evt);
            }
        });

        statSlowa.setEditable(false);
        statSlowa.setColumns(10);
        statSlowa.setRows(5);
        jScrollPane2.setViewportView(statSlowa);

        jLabel3.setText("Najczęstsze słowa");

        jLabel4.setText("Najczęstsze n-gramy");

        statNgramy.setEditable(false);
        statNgramy.setColumns(10);
        statNgramy.setRows(5);
        jScrollPane3.setViewportView(statNgramy);

        jLabel5.setText("Graf przejść");

        statGraf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout statGrafLayout = new javax.swing.GroupLayout(statGraf);
        statGraf.setLayout(statGrafLayout);
        statGrafLayout.setHorizontalGroup(
            statGrafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 292, Short.MAX_VALUE)
        );
        statGrafLayout.setVerticalGroup(
            statGrafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(zakoncz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opcje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                        .addComponent(wyslij))
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1)
                    .addComponent(poleTekstowe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(statGraf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(poleTekstowe, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(wyslij)
                            .addComponent(zakoncz)
                            .addComponent(opcje)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(statGraf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void poleTekstoweActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poleTekstoweActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_poleTekstoweActionPerformed

    private void wyslijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wyslijActionPerformed
        // dodanie wpisanego tekstu
        String s = poleTekstowe.getText();
        String[] arr = s.split(" ");
        ArrayList<String> prefiks = new ArrayList<>();
        int size = arr.length;

        for (int i = 0; i < size - 2; i++) {
            prefiks.clear();
            prefiks.add(arr[i]);
            prefiks.add(arr[i + 1]);
            k.dodaj(prefiks, arr[i + 2]);
        }

        oknoCzatu.append("Użytkownik:\n" + s + "\n\n");

        //generacja
        Random random = new Random();
        ArrayList<ArrayList<String>> keys = new ArrayList<>(k.map.keySet());
        ArrayList<String> randomKey = keys.get(rand.nextInt(keys.size()));
        ArrayList<String> value = k.map.get(randomKey);
        
        //oknoCzatu.append("\n\n" + "programTEST:\n" + gen);
        poleTekstowe.setText("");
        for (int l = 0; l < ngram-1; l++) { // k < ngram-1
            gen.add(arr[l]);
        }
        int j = ngram; //j = ngram
        while (!k.map.containsKey(gen) && j < arr.length) {
            gen.remove(0);
            gen.add(arr[j]);
            j++;
        }
        int n = 0;
        while (n < odpowiedz) {//TODO max dł. odp.
            /*value = k.map.get(gen);
             if(value==null){
             value = k.map.get(randomKey);
             for (int i = 0; i < randomKey.size(); i++) {
             oknoCzatu.append(n + randomKey.get(i) + "/ ");
             gen.add(randomKey.get(i));
             }
             String suf = value.get(rand.nextInt(value.size()));
             oknoCzatu.append(suf + " ");
             n += 3;//TODO dł. ngramu
             gen.add(suf);
             gen.remove(0);
             */

            if (!k.map.containsKey(gen)) {
                keys = new ArrayList<>(k.map.keySet());
                System.out.println("dl keys   " + keys.size());
                randomKey = keys.get(rand.nextInt(keys.size()));
                for (int i = 0; i < randomKey.size(); i++) {
                    oknoCzatu.append(n + randomKey.get(i) + "/ ");
                    gen.add(randomKey.get(i));
                }
                String suf = value.get(rand.nextInt(value.size()));
                oknoCzatu.append(suf + " ");
                n += ngram;//TODO dł. ngramu
                gen.remove(0);
                gen.add(suf);
            } else {
                value = k.map.get(gen);
                String suf = value.get(rand.nextInt(value.size()));
                oknoCzatu.append("+" + n + suf + "+ ");
                gen.remove(0);
                gen.add(suf);
                n++;
            }
        }
        oknoCzatu.append("\n\n");
    }//GEN-LAST:event_wyslijActionPerformed

    private void zakonczActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zakonczActionPerformed
        System.exit(0);
    }//GEN-LAST:event_zakonczActionPerformed

    private void opcjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcjeActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Opcje().setVisible(true);
            }
        });
    }//GEN-LAST:event_opcjeActionPerformed

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
            java.util.logging.Logger.getLogger(Okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Okno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea oknoCzatu;
    private javax.swing.JButton opcje;
    private javax.swing.JTextField poleTekstowe;
    private javax.swing.JPanel statGraf;
    private javax.swing.JTextArea statNgramy;
    private javax.swing.JTextArea statSlowa;
    private javax.swing.JButton wyslij;
    private javax.swing.JButton zakoncz;
    // End of variables declaration//GEN-END:variables
    public static void setNgram(int n) {
        Okno.ngram = n;
    }

    public static void setOdpowiedz(int odp) {
        Okno.odpowiedz = odp;
    }
}
