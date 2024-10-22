package controller;
import view.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class TelaDeMenuController extends TelaDeMenuView {
    public static void abirTelaDeCadastroView() {
        TelaDeCadastroView.appTelaDeCadastroView = new TelaDeCadastroView();
        TelaDeCadastroView.appTelaDeCadastroView.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        appTelaDeMenuView.setVisible(false);

        TelaDeCadastroView.appTelaDeCadastroView.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                appTelaDeMenuView.setVisible(true);
            }
        } 
        
      );
        
    }
}
  public static void abirTelaDePesquisaView() {
    TelaDePesquisaView.appTelaDePesquisaView = new TelaDePesquisaView();
    TelaDePesquisaView.appTelaDePesquisaView.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    TelaDePesquisaView.appTelaDePesquisaView.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
            appTelaDePesquisaView.setVisible(true);
        }
    }
    
   );
} 
  public static void abirTelaDeAtualizarView() {
    TelaDeAtualizarView.appTelaDeAtualizarView = new TelaDeAtualizarView();
    TelaDeAtualizarView.appTelaDeAtualizarView.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    TelaDeAtualizarView.appTelaDeAtualizarView.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
            appTelaDeAtualizarView.setVisible(true);
        }
    }
    
   );
} 
  public static void abirTelaDeRemoverView() {
    TelaDeRemoverView.appTelaDeRemoverView = new TelaDeRemoverView();
    TelaDeRemoverView.appTelaDeRemoverView.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    TelaDeRemoverView.appTelaDeRemoverView.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
            appTelaDeRemoverView.setVisible(true);
        }
    }
    
   );
} 

