package model;
package controller;
import model.*;
import view.*;

import java.sql.*;

public class TelaDePesquisaController extends TelaDePesquisaView {
    public static void notificarUsuario(String textoNotificacao) {
        lblNotificacoes.setText(setHtmlFormat(textoNotificacao));
    }

    public static void preencherCampos(String id, String nome, String email) {
        txtId.setText(id);
        txtNome.setText(nome);
        txtEmail.setText(email);
    }

    public static void registrarPesquisa() {
        txtUsuario = txtPesquisa.getText();
    }

    public static void pesquisar() {
        if (txtPesquisa.getText().trim().equals(txtUsuario) == false) {
            limparCampos("");
            TelaDePesquisaModel.pesquisarModel(textoPesquisa);
        }
    }

    public static void primeiroRegistro() {
        limparCampos("Você está no primeiro registro.");
        TelaDePesquisaModel.primeiroRegistroModel(txtPesquisa.getText());
    }

    public static void registroAnterior() {
        limparCampos("Registro anterior posicionando com sucesso");
        TelaDePesquisaModel.registroAnteriorModel(txtPesquisa.getText(), txtId.getText(), textNome.getText() , textEmail.getText());
    }
    public static void proximoRegistro() {
        limparCampos("proximo registro posicionado com sucesso.");
        TelaDePesquisaModel.proximoRegistroModel(textPesquisa.getText(), txtId.getText(), txtNome.getText(), txtEmail.getText());
    }    
     public static void ultimoRegistro() {
        limparCampos("");
        TelaDePesquisaModel.ultimoRegistroModel(txtPesquisa.getText(), txtId.getText(), txtNome.getText(), txtEmail.getText());

     } 
     public static void limparCamposController(String txt) {
        limparCampos(txt);
        
     }
     public static void desabilitarTodos() {
        btnPrimeiro.setEnabled(false);
        btnAnerior.setEnabled(false);
        btnProximo.setEnabled(false);
        btnUltimo.setEnabled(false);
     }  
     public static void habilitarVoltar() {
        desabilitarTodos();
        btnPrimeiro.setEnabled(true);
        btnAnerior.setEnabled(true);
     }
     public static void habilitarTodos() {
        btnPrimeiro.setEnabled(true);
        btnAnerior.setEnabled(true);
        btnProximo.setEnabled(true);
        btnUltimo.setEnabled(true);
     }
     public static void habilitarAvancar() {
        desabilitarTodos();
        btnProximo.setEnabled(true);
        btnUltimo.setEnabled(true);
     }
     public static void desabilitarPesquisar() {
        btnPesquisar.setEnabled(false);
     }
}
