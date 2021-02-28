/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong02.shapelogic;

import java.awt.Graphics2D;

/**
 *
 * @author ttysa
 */
public class drawline {
    private Graphics2D gr;
    private line line;

    public drawline() {
    }

    public drawline(Graphics2D gr, line line) {
        this.gr = gr;
        this.line = line;
    }

    public Graphics2D getGr() {
        return gr;
    }

    public void setGr(Graphics2D gr) {
        this.gr = gr;
    }

    public line getLine() {
        return line;
    }

    public void setLine(line line) {
        this.line = line;
    }
    
    public void veDT(){
        gr.drawLine(line.getBegin_x(), line.getBegin_y(),
                    line.getEnd_x(), line.getEnd_y());
    }

    public void setGr() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
