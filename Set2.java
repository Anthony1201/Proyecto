/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tenis;
import tenis.Espanol;
/**
 *
 * @author Trainer Gold
 */

public class Set2 implements Juego {
    
    private int puntaje2;
    private int puntaje1;
    private String p1Nombre;
    private String p2Nombre;
    private String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty","-All","Deuce","Advantage ","Win for "};

    public Set2(String p1Nombre, String p2Nombre) {
        this.p1Nombre = p1Nombre;
        this.p2Nombre = p2Nombre;  
    }
    public void resetScore (){
    puntaje1 = 0;
    puntaje2 = 0;
    }
    public String getScore() {
        String s;   
        if (puntaje1 < 4 && puntaje2 < 4 && !(puntaje1 + puntaje2 == 6)) {
            s = p[puntaje1];
            return (puntaje1 == puntaje2) ? s + p[4] : s + "-" + p[puntaje2];
        } else {
            if (puntaje1 == puntaje2)
                return p[5];
            s = puntaje1 > puntaje2 ? p1Nombre : p2Nombre;
            return ((puntaje1-puntaje2)*(puntaje1-puntaje2) == 1) ? p[6] + s : p[7] + s;
        }
    }
    public void wonPoint(String playerName) {
        if (playerName == "player1")
            this.puntaje1 += 1;
        else
            this.puntaje2 += 1;
    }
}