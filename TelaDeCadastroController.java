package controller;
import model.*;
import view.*;

public class TelaDeCadastroController extends TelaDeCadastroView {
   public String[] retornoUsuario = { 
    "Email ja cadeastrado! Favor digitar outro email e tentar novamente." // resposta 0
    "Não foi possivel  reaizar o seu cadastro, por uma falha no servidor! Por favor, tente novamente mais tarde.", // resposta 1
    "Cadastro realizado com sucesso" // resposta 2 
   }; 
    public static void String cadastrarController(String nome, String email, String senha) {
      return retornoUsuario [TelaDeCadastroModel. cadastrarModel(nome, email, senha)]
    }
}
