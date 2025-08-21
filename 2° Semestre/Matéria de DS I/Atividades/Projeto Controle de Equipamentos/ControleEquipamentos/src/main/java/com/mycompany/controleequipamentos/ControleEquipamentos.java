/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controleequipamentos;

/**
 *
 * @author Admin
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class ControleEquipamentos extends JFrame {

    private JTextField txtNome, txtTipo, txtMarca;
    private DefaultTableModel tableModel;
    private JTable tabela;
    private JButton btnCadastrar, btnEditar, btnRemover;
    private int linhaSelecionada = -1;

    public ControleEquipamentos() {
        setTitle("Controle de Equipamentos");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Painel de entrada de dados
        JPanel painelFormulario = new JPanel(new GridLayout(4, 2));
        painelFormulario.setBorder(BorderFactory.createTitledBorder("Cadastro de Equipamentos"));

        txtNome = new JTextField();
        txtTipo = new JTextField();
        txtMarca = new JTextField();

        painelFormulario.add(new JLabel("Nome:"));
        painelFormulario.add(txtNome);
        painelFormulario.add(new JLabel("Tipo:"));
        painelFormulario.add(txtTipo);
        painelFormulario.add(new JLabel("Marca:"));
        painelFormulario.add(txtMarca);

        btnCadastrar = new JButton("Cadastrar");
        btnEditar = new JButton("Editar");
        btnRemover = new JButton("Remover");

        JPanel painelBotoes = new JPanel();
        painelBotoes.add(btnCadastrar);
        painelBotoes.add(btnEditar);
        painelBotoes.add(btnRemover);

        // Tabela
        tableModel = new DefaultTableModel(new String[]{"Nome", "Tipo", "Marca"}, 0);
        tabela = new JTable(tableModel);
        JScrollPane scroll = new JScrollPane(tabela);

        // Adiciona tudo à janela
        add(painelFormulario, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
        add(painelBotoes, BorderLayout.SOUTH);

        // Eventos
        btnCadastrar.addActionListener(e -> cadastrar());
        btnEditar.addActionListener(e -> editar());
        btnRemover.addActionListener(e -> remover());

        tabela.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                linhaSelecionada = tabela.getSelectedRow();
                if (linhaSelecionada >= 0) {
                    txtNome.setText(tableModel.getValueAt(linhaSelecionada, 0).toString());
                    txtTipo.setText(tableModel.getValueAt(linhaSelecionada, 1).toString());
                    txtMarca.setText(tableModel.getValueAt(linhaSelecionada, 2).toString());
                }
            }
        });
    }

    private void cadastrar() {
        if (!txtNome.getText().isEmpty() && !txtTipo.getText().isEmpty() && !txtMarca.getText().isEmpty()) {
            tableModel.addRow(new Object[]{txtNome.getText(), txtTipo.getText(), txtMarca.getText()});
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
        }
    }

    private void editar() {
        if (linhaSelecionada >= 0) {
            tableModel.setValueAt(txtNome.getText(), linhaSelecionada, 0);
            tableModel.setValueAt(txtTipo.getText(), linhaSelecionada, 1);
            tableModel.setValueAt(txtMarca.getText(), linhaSelecionada, 2);
            limparCampos();
            linhaSelecionada = -1;
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um equipamento para editar.");
        }
    }

    private void remover() {
        if (linhaSelecionada >= 0) {
            tableModel.removeRow(linhaSelecionada);
            limparCampos();
            linhaSelecionada = -1;
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um equipamento para remover.");
        }
    }

    private void limparCampos() {
        txtNome.setText("");
        txtTipo.setText("");
        txtMarca.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ControleEquipamentos().setVisible(true));
    }
}
