/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author tazaz
 */
public class ViewMayor extends javax.swing.JPanel {

    /**
     * Creates new form ViewMayor
     */
    public ViewMayor() {
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

        jl_num1 = new javax.swing.JLabel();
        jl_num2 = new javax.swing.JLabel();
        jl_num3 = new javax.swing.JLabel();
        jl_resultado = new javax.swing.JLabel();
        jtf_num1 = new javax.swing.JTextField();
        jtf_num2 = new javax.swing.JTextField();
        jtf_num3 = new javax.swing.JTextField();
        jtf_resultado = new javax.swing.JTextField();
        jbtn_mayor = new javax.swing.JButton();
        jl_titulo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(340, 300));

        jl_num1.setText("Numero 1:");

        jl_num2.setText("Numero 2:");

        jl_num3.setText("Numero 3:");

        jl_resultado.setText("Resultado: ");

        jbtn_mayor.setText("Mayor");

        jl_titulo.setFont(new java.awt.Font("Gill Sans Ultra Bold", 3, 14)); // NOI18N
        jl_titulo.setText("Mayor de tres numeros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jl_resultado)
                                    .addGap(37, 37, 37)
                                    .addComponent(jtf_resultado))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jl_num1)
                                        .addComponent(jl_num3)
                                        .addComponent(jl_num2))
                                    .addGap(42, 42, 42)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtf_num1)
                                        .addComponent(jtf_num2)
                                        .addComponent(jtf_num3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jbtn_mayor)))
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jl_titulo)
                        .addGap(57, 57, 57))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jl_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_num1)
                    .addComponent(jtf_num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_num2)
                    .addComponent(jtf_num2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_num3)
                    .addComponent(jtf_num3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jbtn_mayor)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_resultado)
                    .addComponent(jtf_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jbtn_mayor;
    public javax.swing.JLabel jl_num1;
    public javax.swing.JLabel jl_num2;
    public javax.swing.JLabel jl_num3;
    public javax.swing.JLabel jl_resultado;
    private javax.swing.JLabel jl_titulo;
    public javax.swing.JTextField jtf_num1;
    public javax.swing.JTextField jtf_num2;
    public javax.swing.JTextField jtf_num3;
    public javax.swing.JTextField jtf_resultado;
    // End of variables declaration//GEN-END:variables
}
