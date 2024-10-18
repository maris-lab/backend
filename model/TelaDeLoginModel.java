package model;
import javax.swing.*;

import com.mysql.cj.xdevapi.Statement;

import java.awt.*;
import java.awt.event.*;


public class TelaDeLoginModel {
    public static void logarModel(String Email, String Senha) {

        try {onnection conexao = MySQLConnector.conectar();
                        String strSqlLogin = "select * from `db_senac`.`tbl_senac` where `email` = '" + txtLogin.getText() + "' and `senha` = '" + String.valueOf(txtSenha.getPassword()) + "';";
                        Statement stmSqlLogin = conexao.createStatement();
                        ResultSet rstSqlLogin = stmSqlLogin.executeQuery(strSqlLogin);
                        if (rstSqlLogin.next()) {
                            lblNotificacoes.setText(setHtmlFormat("Conectado com sucesso!!!"));
                            
                        }else {
                            lblNotificacoes.setText(setHtmlFormat("Login e/ou senha não encontrados! Por favor, verifique e tente novamente."));
                            
                        }stmSqlLogin.close();

        }catch (Exception e) {
            lblNotificacoes.setText(setHtmlFormat("Não foi possivel encontrar o login e/ou senha digitados/informados! Por favor, verifique novamente. Veja o erro: + e"));
        }
    }
    
       setSize(150,200);
       setVisible(true);

 }
private String setHtmlFormat(String strTexto) {
    return "<html><body>" + strTexto + "</body></html>";
 }
 public static void main(String[] args) {
    TelaDeLoginModel appTelaDeLogin = new TelaDeLoginModel();
    appTelaDeLogin.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

