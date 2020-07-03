/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiosimulacion00055913;

import VentanasMEF.MenuPrincipal;
import VentanasMEF.PreCargaApp;

/**
 *
 * @author Mac
 */
public class DesafioSimulacion00055913 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PreCargaApp splashApp = new PreCargaApp();
        splashApp.setVisible(true);
        
        try{
            
            for(int i=0;i<=100;i++){
                Thread.sleep(40);
                PreCargaApp.jLabel2.setText(i+"%");
                PreCargaApp.jProgressBar1.setValue(i);
                
                if(i==100){
                    MenuPrincipal menu = new MenuPrincipal();
                    splashApp.setVisible(false);
                    menu.setVisible(true);
                }
            }
        }catch(Exception e){
        
        }
        
    }
    
}
