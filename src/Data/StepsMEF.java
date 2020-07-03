/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author Mac
 */
public class StepsMEF {
    
    private String imagenPaso;
    private int Step;

    public String getImagenPaso() {
        return imagenPaso;
    }

    public void setImagenPaso(String imagenPaso) {
        this.imagenPaso = imagenPaso;
    }

    public int getStep() {
        return Step;
    }

    public void setStep(int Step) {
        this.Step = Step;
    }

    public StepsMEF(String imagenPaso, int Step) {
        this.imagenPaso = imagenPaso;
        this.Step = Step;
    }

    public StepsMEF() {
        
    }
    
    
}
