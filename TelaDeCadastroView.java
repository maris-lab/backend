package view;
import controller.*;
import model.MySQLConnector;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.io.File.*;

public class TelaDeCadastroView extends JFrame
{
    private final JLabel lblNome;
    private final JTextField txtNome;

    private final JLabel lblEmail;
    private final JTextField txtEmail;

    private final JLabel lblSenha;
    private final JPasswordField txtSenha;

    private final JButton btnCadastrar;
    private final JButton btnCopiarImagem;
    private final JButton btnRemoverImagem;

    private final JLabel lblNotificacoes;
   

    public TelaDeCadastroView()
    {
        super("Tela de Cadastro");
        setLayout(new GridLayout(4,2,5,5));

        lblNome = new JLabel("Nome:");
        add(lblNome);

        txtNome = new JTextField(10);
        add(txtNome);

        lblEmail = new JLabel("Email:");
        add(lblEmail);

        txtEmail = new JTextField(10);
        add(txtEmail);

         lblSenha = new JLabel("Senha:");
        add(lblSenha);

        txtSenha = new JPasswordField(10);
        add(txtSenha);

        btnCadastrar = new JButton("Cadastrar");
        add(btnCadastrar);

        lblNotificacoes = new JLabel("Notificações", SwingConstants.CENTER);
        add(lblNotificacoes);

        btnCopiarImagem = new JButton("Copiar Imagem");
        add(btnCopiarImagem);

        btnRemoverImagem = new JButton("Remover Imagem");
        add(btnRemoverImagem);


        btnCadastrar.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    if (txtNome.getText().trim().length() <= 0) {
                        lblNotificacoes.setText(setHtmlFormat("É necessário digitar um Nome para o cadastro. Por favor, digite um nome e tente novamente."));
                        txtNome.requestFocus();
                        return;
                    }

                    if (txtEmail.getText().trim().length() <= 0) {
                        lblNotificacoes.setText(setHtmlFormat("É necessário digitar um Email para o cadastro. Por favor, digite um Email e tente novamente."));
                        txtEmail.requestFocus();
                        return;
                    }

                    if (String.valueOf(txtSenha.getPassword()).trim().length() <= 0) {
                        lblNotificacoes.setText(setHtmlFormat("É necessário digitar uma Senha para o cadastro. Por favor, digite uma Senha e tente novamente."));
                        txtSenha.requestFocus();
                        return;
                    }
                    lblNotificacoes.setText(TelaDeCadastroController.cadastrarController(textNome.getText(), txtEmail.getText(), String.valueOf(textSenha.getPassword())));
                   // aqui devera ser chamado o metodo da controller de cadastro
                }
            }
        );
        btnCopiarImagem.addActionListener(
            new ActionListener() {
               String copiarImagemOrigin = "copiar imagem" ;
               String copiarImagemDestino = "copiar imagem destino ";
               boolean sucesso = TelaDeCadastroView.copiarImagem(copiarImagemOrigin,copiarImagemDestino);
               if (sucesso) {
                lblNotificacoes.setText("Imagem copiada com sucesso!");
               } else {
                lblNotificacoes.setText("Falha ao copiar a imagem.");
               }
            };
        )
        btnRemoverImagem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String imagemRemover = "Remover imagem";
                boolean sucesso = removerImagem(imagemRemover);
                if (sucesso) {
                    lblNotificacoes.setText("Imagem removida com sucesso!");
                } else {
                    lblNotificacoes.setText("Falha ao remover a imagem, tente novamente");
                }
            }
        });
      

        setSize(300, 400);
        setVisible(true);
    }

    private String setHtmlFormat(String strTexto) {
        return "<html><body>" + strTexto + "</body></html>";
    }

    private boolean copiarImagem(String origin, Sting destination) {
        return true;
    }

    private boolean removerImagem(String imagem) {
        return true;
    }

    public static void main(String[] args) {
        TelaDeCadastroView appTelaDeCadastroView = new TelaDeCadastroView();
        appTelaDeCadastroView.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}