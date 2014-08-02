/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Sandra Milena Guevara Morales
 */
public class logica {

    static int x1, x2, y1, y2;

    public static void señal(String cadena,Graphics g){
        x1=60;
        y1=20;
        x2=x1+40;
        g.setColor(Color.yellow);
        for(int i=0;i<cadena.length();i++){
            g.drawString(cadena.charAt(i)+"", x1, y1);
            x1=x2;
            x2=x2+40;
        }
    }

    public static void dibujarNiveles (Graphics g){
        x1 = 20;
        y1 = 142;
        y2 = y1 - 20;
        g.setColor(Color.orange);
        g.drawString("+v", x1, y1);
        g.drawString("0", x1, y2);
        g.drawString("-v", x1, y2-20);
    }

    public static void dibujarLineaHorizontal(Graphics g){
        x1=40;
        y1=120;
        x2=x1+5;
        for(int i=0;i<120;i++){
            g.setColor(Color.darkGray);
             g.drawLine(x1, y1, x2, y1);
             x1=x2+3;
             x2=x1+5;
        }
    }

    public static void dibujarLineasVerticales(String cadena, Graphics g) {
        int constanteY = 50;
        x1 = 40;
        y1 = 0;
        y2 = 5;
        for (int j = 0; j <= cadena.length(); j++) {
            for (int i = 0; i < constanteY; i++) {
                g.setColor(Color.darkGray);
                g.drawLine(x1, y1, x1, y2);
                y1 = y2 + 3;
                y2 = y1 + 5;
            }
            x1 = x1 + 40;
            y1 = 0;
            y2 = 5;
        }
    }

    public static void reloj(String cadena, Graphics g) {
        x1 = 40;
        y1 = 60;
        x2 = 60;
        y2 = y1 - 20;
        for (int i = 0; i < cadena.length(); i++) {
            g.setColor(Color.GREEN);
            g.drawLine(x1, y1, x2, y1);
            g.drawLine(x2, y1, x2, y2);
            g.drawLine(x2, y2, x2 + 20, y2);
            g.drawLine(x2 + 20, y2, x2 + 20, y1);
            x1 = (x2 + 20);
            x2 = (x2 + 40);
        }
    }

    public static void up_nrz(String cadena, Graphics g) {
        x1 = 40;
        y1 = 120;
        x2 = 80;
        y2 = y1 - 20;
        g.setColor(Color.white);
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '0') {
                g.drawLine(x1, y1, x2, y1);
                if (i < cadena.length() - 1) {
                    if (cadena.charAt(i + 1) == '1') {
                        g.drawLine(x2, y1, x2, y2);
                    }
                }
            } else {
                g.drawLine(x1, y2, x2, y2);
                if (i < cadena.length() - 1) {
                    if (cadena.charAt(i + 1) == '0') {
                        g.drawLine(x2, y2, x2, y1);
                    }
                }
            }
            x1 = x2;
            x2 = x2 + 40;
        }
    }

    public static void up_rz(String cadena, Graphics g) {
        x1 = 40;
        y1 = 120;
        x2 = 60;
        y2 = y1 - 20;
        g.setColor(Color.white);
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '0') {
                g.drawLine(x1, y1, x1 + 40, y1);
                if (i < cadena.length() - 1) {
                    if (cadena.charAt(i + 1) == '1') {
                        g.drawLine(x1 + 40, y1, x1 + 40, y2);
                    }
                    x1 = x1 + 40;
                    x2 = x1 + 20;
                }
            } else {
                g.drawLine(x1, y2, x2, y2);
                g.drawLine(x2, y2, x2, y1);
                g.drawLine(x2, y1, x2 + 20, y1);
                if (i < cadena.length() - 1) {
                    if (cadena.charAt(i + 1) == '1') {
                        g.drawLine(x2 + 20, y1, x2 + 20, y2);
                    }
                    x1 = x2 + 20;
                    x2 = x1 + 20;
                }
            }
        }
    }

    public static void p_nrz_l(String cadena, Graphics g) {
        x1 = 40;
        y1 = 140;
        x2 = 80;
        y2 = y1 - 40;
        g.setColor(Color.white);
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '0') {
                g.drawLine(x1, y1, x2, y1);
                if (i < cadena.length() - 1) {
                    if (cadena.charAt(i + 1) == '1') {
                        g.drawLine(x2, y1, x2, y2);
                    }
                }
            } else {
                g.drawLine(x1, y2, x2, y2);
                if (i < cadena.length() - 1) {
                    if (cadena.charAt(i + 1) == '0') {
                        g.drawLine(x2, y2, x2, y1);
                    }
                }
            }
            x1 = x2;
            x2 = x2 + 40;
        }
    }

    public static void p_nrz_i(String cadena, Graphics g) {
        x1 = 40;
        y1 = 140;
        x2 = 80;
        y2 = y1 - 40;
        int estado = 0;
        g.setColor(Color.white);
        for (int i = 0; i < cadena.length(); i++) {
            if (estado == 1) {
                g.drawLine(x1, y2, x2, y2);
                if (i < cadena.length() - 1) {
                    if (cadena.charAt(i + 1) == '1') {
                        g.drawLine(x2, y2, x2, y1);
                        estado = 0;
                    }
                }
            } else {
                g.drawLine(x1, y1, x2, y1);
                if (i < cadena.length() - 1) {
                    if (cadena.charAt(i + 1) == '1') {
                        g.drawLine(x2, y2, x2, y1);
                        estado = 1;
                    }
                }
            }
            x1 = x2;
            x2 = x2 + 40;
        }
    }

    public static void p_rz(String cadena, Graphics g) {
        x1 = 40;
        y1 = 140;
        x2 = 60;
        y2 = y1 - 20;
        g.setColor(Color.white);
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '0') {
                g.drawLine(x1, y1, x2, y1);
                g.drawLine(x2, y1, x2, y2);
                g.drawLine(x2, y2, x2 + 20, y2);
                if (i < cadena.length() - 1) {
                    if (cadena.charAt(i + 1) == '1') {
                        g.drawLine(x2 + 20, y2, x2 + 20, y2 - 20);
                    } else if (cadena.charAt(i + 1) == '0') {
                        g.drawLine(x2 + 20, y2, x2 + 20, y1);
                    }
                }
            } else {
                g.drawLine(x1, y2 - 20, x2, y2 - 20);
                g.drawLine(x2, y2 - 20, x2, y2);
                g.drawLine(x2, y2, x2 + 20, y2);
                if (i < cadena.length() - 1) {
                    if (cadena.charAt(i + 1) == '1') {
                        g.drawLine(x2 + 20, y2, x2 + 20, y2 - 20);
                    } else if (cadena.charAt(i + 1) == '0') {
                        g.drawLine(x2 + 20, y2, x2 + 20, y1);
                    }
                }
            }
            x1 = x2 + 20;
            x2 = x1 + 20;
        }
    }

    public static void manchester(String cadena, Graphics g) {
        x1 = 40;
        y1 = 140;
        x2 = 60;
        y2 = y1 - 40;
        g.setColor(Color.white);
        
            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i) == '0') {
                    g.drawLine(x1, y1, x2, y1);
                    g.drawLine(x2, y1, x2, y2);
                    g.drawLine(x2, y2, x2 + 20, y2);
                    if (i < cadena.length() - 1) {
                        if (cadena.charAt(i + 1) == '0') {
                            g.drawLine(x2 + 20, y2, x2 + 20, y1);
                        }
                    }
                } else if (cadena.charAt(i) == '1') {
                    g.drawLine(x1, y2, x2, y2);
                    g.drawLine(x2, y2, x2, y1);
                    g.drawLine(x2, y1, x2 + 20, y1);
                    if (i < cadena.length() - 1) {
                        if (cadena.charAt(i + 1) == '1') {
                            g.drawLine(x2 + 20, y1, x2 + 20, y2);
                        }
                    }
                }
                x1 = x2 + 20;
                x2 = x1 + 20;
            }
        
    }

    public static void manchester_Diferencial(String cadena, Graphics g) {
        x1 = 40;
        y1 = 140;
        x2 = 60;
        y2 = y1 - 40;
        int estadoDif = 0;
        g.setColor(Color.white);
        for (int i = 0; i < cadena.length(); i++) {
            if (estadoDif == 1) {
                if (cadena.charAt(i) == '0') {
                    g.drawLine(x1, y1, x2, y1);
                    g.drawLine(x2, y1, x2, y2);
                    g.drawLine(x2, y2, x2 + 20, y2);
                    estadoDif = 0;
                    if (i < cadena.length() - 1) {
                        if (cadena.charAt(i + 1) == '0') {
                            g.drawLine(x2 + 20, y2, x2 + 20, y1);
                        }
                        if (cadena.charAt(i + 1) == '1') {
                            estadoDif = 1;
                        }
                    }
                } else {
                    g.drawLine(x1, y2, x2, y2);
                    g.drawLine(x2, y2, x2, y1);
                    g.drawLine(x2, y1, x2 + 20, y1);
                    estadoDif = 0;
                    if (i < cadena.length() - 1) {
                        if (cadena.charAt(i + 1) == '0') {
                            g.drawLine(x2 + 20, y2, x2 + 20, y1);
                        }
                    }
                }
            } else if (estadoDif == 0) {
                if (cadena.charAt(i) == '0') {
                    g.drawLine(x1, y2, x2, y2);
                    g.drawLine(x2, y2, x2, y1);
                    g.drawLine(x2, y1, x2 + 20, y1);
                    estadoDif = 0;
                    if (i < cadena.length() - 1) {
                        if (cadena.charAt(i + 1) == '0') {
                            g.drawLine(x2 + 20, y2, x2 + 20, y1);
                        }
                    }
                } else {
                    g.drawLine(x1, y1, x2, y1);
                    g.drawLine(x2, y1, x2, y2);
                    g.drawLine(x2, y2, x2 + 20, y2);
                    estadoDif = 1;
                    if (i < cadena.length() - 1) {
                        if (cadena.charAt(i + 1) == '0') {
                            g.drawLine(x2 + 20, y2, x2 + 20, y1);
                        }
                    }
                }
            }
            x1 = x2 + 20;
            x2 = x1 + 20;
        }
    }

    public static void ami(String cadena, Graphics g) {
        x1 = 40;
        y1 = 140;
        x2 = 80;
        y2 = y1 - 20;
        int estadoAmi = 1;
        g.setColor(Color.white);
        for (int i = 0; i < cadena.length(); i++) {
            if (estadoAmi == 1) {
                if (cadena.charAt(i) == '0') {
                    g.drawLine(x1, y2, x2, y2);
                    if (i < cadena.length() - 1) {
                        if (cadena.charAt(i + 1) == '1') {
                            g.drawLine(x2, y2, x2, y2 - 20);
                        }
                    }
                } else {
                    g.drawLine(x1, y2 - 20, x2, y2 - 20);
                    if (i < cadena.length() - 1) {
                        if (cadena.charAt(i + 1) == '1') {
                            g.drawLine(x2, y2 - 20, x2, y1);
                            estadoAmi = 0;
                        } else if (cadena.charAt(i + 1) == '0') {
                            g.drawLine(x2, y2 - 20, x2, y2);
                            estadoAmi = 0;
                        }
                    }
                }
            } else {
                if (cadena.charAt(i) == '0') {
                    g.drawLine(x1, y2, x2, y2);
                    if (i < cadena.length() - 1) {
                        if (cadena.charAt(i + 1) == '1') {
                            g.drawLine(x2, y2, x2, y1);
                        }
                    }
                } else {
                    g.drawLine(x1, y1, x2, y1);
                    if (i < cadena.length() - 1) {
                        if (cadena.charAt(i + 1) == '1') {
                            g.drawLine(x2, y1, x2, y2 - 20);
                            estadoAmi = 1;
                        } else {
                            g.drawLine(x2, y1, x2, y2);
                            estadoAmi = 1;
                        }
                    }
                }
            }
            x1 = x2;
            x2 = x2 + 40;
        }
    }

    public static void hdb3(String cadena, Graphics g) {
        x1 = 40;
        y1 = 140;
        x2 = 80;
        y2 = y1 - 20;
        int estadoH = 1;
        int contador = 0;
        g.setColor(Color.white);
        int i = 0;
        while (i < cadena.length()) {
            if (estadoH == 1) {
                if (cadena.charAt(i) == '0') {
                    if (i < cadena.length() - 3) {
                        if (cadena.charAt(i) == '0' && cadena.charAt(i + 1) == '0' && cadena.charAt(i + 2) == '0' && cadena.charAt(i + 3) == '0') {
                            if (contador % 2 == 0 || contador == 0) {
                                //negativo par
                                g.drawLine(x1, y2, x1, y2 - 20);
                                g.drawLine(x1, y2 - 20, x2, y2 - 20);
                                g.drawLine(x2, y2 - 20, x2, y2);
                                g.drawLine(x2, y2, x2 + 80, y2);
                                g.drawLine(x2 + 80, y2, x2 + 80, y2 - 20);
                                g.drawLine(x2 + 80, y2 - 20, x2 + 120, y2 - 20);
                                g.drawLine(x2 + 80, y2 - 20, x2 + 120, y2 - 20);
                                g.drawLine(x2 + 120, y2 - 20, x2 + 120, y2);
                                estadoH = 0;
                            } else {
                                //negativo impar
                                g.drawLine(x1, y2, x2 + 80, y2);
                                g.drawLine(x2 + 80, y2, x2 + 80, y1);
                                g.drawLine(x2 + 80, y1, x2 + 120, y1);
                                g.drawLine(x2 + 120, y1, x2 + 120, y2);
                            }
                            i = i + 3;
                            contador = 0;
                            x1 = x2 + 120;
                            x2 = x2 + 160;
                        } else if (cadena.charAt(i) == '0') {
                            g.drawLine(x1, y2, x2, y2);
                            x1 = x2;
                            x2 = x2 + 40;
                        }
                    } else if (cadena.charAt(i) == '0') {
                        g.drawLine(x1, y2, x2, y2);
                        x1 = x2;
                        x2 = x2 + 40;
                    }
                    if (i < cadena.length() - 1) {
                        if (cadena.charAt(i + 1) == '1') {
                            g.drawLine(x2, y2, x2, y2 - 20);
                        }
                    }
                } else {
                    g.drawLine(x1, y2, x1, y2 - 20);
                    g.drawLine(x1, y2 - 20, x2, y2 - 20);
                    if (i < cadena.length() - 1) {
                        if (cadena.charAt(i + 1) == '1') {
                            g.drawLine(x2, y2 - 20, x2, y1);
                            estadoH = 0;
                        } else {
                            g.drawLine(x2, y2 - 20, x2, y2);
                            estadoH = 0;
                        }
                    }
                    contador++;
                    x1 = x2;
                    x2 = x2 + 40;
                }
            } else {
                if (cadena.charAt(i) == '0') {
                    if (i < cadena.length() - 3) {
                        if (cadena.charAt(i) == '0' && cadena.charAt(i + 1) == '0' && cadena.charAt(i + 2) == '0' && cadena.charAt(i + 3) == '0') {
                            if (contador % 2 == 0) {
                                //positivo par
                                g.drawLine(x1, y2, x1, y1);
                                g.drawLine(x1, y1, x2, y1);
                                g.drawLine(x2, y1, x2, y2);
                                g.drawLine(x2, y2, x2 + 80, y2);
                                g.drawLine(x2 + 80, y2, x2 + 80, y1);
                                g.drawLine(x2 + 80, y1, x2 + 120, y1);
                                g.drawLine(x2 + 120, y1, x2 + 120, y2);
                                estadoH = 1;
                            } else {
                                //positivo impar
                                g.drawLine(x1, y2, x2 + 80, y2);
                                g.drawLine(x2 + 80, y2, x2 + 80, y2 - 20);
                                g.drawLine(x2 + 80, y2 - 20, x2 + 120, y2 - 20);
                                g.drawLine(x2 + 120, y2 - 20, x2 + 120, y2);
                            }
                            i = i + 3;
                            contador = 0;
                            x1 = x2 + 120;
                            x2 = x2 + 160;
                        } else if (cadena.charAt(i) == '0') {
                            g.drawLine(x1, y2, x2, y2);
                            x1 = x2;
                            x2 = x2 + 40;
                        }
                    } else if (cadena.charAt(i) == '0') {
                        g.drawLine(x1, y2, x2, y2);
                        x1 = x2;
                        x2 = x2 + 40;
                    }
                } else {
                    g.drawLine(x1, y2, x1, y1);
                    g.drawLine(x1, y1, x2, y1);
                    if (i < cadena.length() - 1) {
                        if (cadena.charAt(i + 1) == '1') {
                            g.drawLine(x2, y1, x2, y2 - 20);
                            estadoH = 1;
                        } else {
                            g.drawLine(x2, y1, x2, y2);
                            estadoH = 1;
                        }
                    }
                    contador++;
                    x1 = x2;
                    x2 = x2 + 40;
                }
            }
            i++;
        }
    }

    public static void db8z(String cadena, Graphics g) {
        x1 = 40;
        y1 = 140;
        x2 = 80;
        y2 = y1 - 20;
        int estadoD = 1;
        int i = 0;
        g.setColor(Color.white);
        while (i < cadena.length()) {
            if (estadoD == 1) {
                if (cadena.charAt(i) == '0') {
                    if (i < cadena.length() - 7) {
                        if (cadena.charAt(i) == '0' && cadena.charAt(i + 1) == '0' && cadena.charAt(i + 2) == '0' && cadena.charAt(i + 3) == '0' && cadena.charAt(i + 4) == '0' && cadena.charAt(i + 5) == '0' && cadena.charAt(i + 6) == '0' && cadena.charAt(i + 7) == '0') {
                            g.drawLine(x1, y2, x2 + 80, y2);
                            g.drawLine(x2 + 80, y2, x2 + 80, y1);
                            g.drawLine(x2 + 80, y1, x2 + 120, y1);
                            g.drawLine(x2 + 120, y1, x2 + 120, y2 - 20);
                            g.drawLine(x2 + 120, y2 - 20, x2 + 160, y2 - 20);
                            g.drawLine(x2 + 160, y2 - 20, x2 + 160, y2);
                            g.drawLine(x2 + 160, y2, x2 + 200, y2);
                            g.drawLine(x2 + 200, y2, x2 + 200, y2 - 20);
                            g.drawLine(x2 + 200, y2 - 20, x2 + 240, y2 - 20);
                            g.drawLine(x2 + 240, y2 - 20, x2 + 240, y1);
                            g.drawLine(x2 + 240, y1, x2 + 280, y1);
                            g.drawLine(x2 + 280, y1, x2 + 280, y2);
                            i = i + 7;
                            x1 = x2 + 280;
                            x2 = x1 + 40;
                        } else if (cadena.charAt(i) == '0') {
                            g.drawLine(x1, y2, x2, y2);
                            x1 = x2;
                            x2 = x2 + 40;
                        }
                    } else if (cadena.charAt(i) == '0') {
                        g.drawLine(x1, y2, x2, y2);
                        x1 = x2;
                        x2 = x2 + 40;
                    }
                    if (i < cadena.length() - 1) {
                        if (cadena.charAt(i + 1) == '1') {
                            g.drawLine(x2, y2, x2, y2 - 20);
                        }
                    }
                } else {
                    g.drawLine(x1, y2, x1, y2 - 20);
                    g.drawLine(x1, y2 - 20, x2, y2 - 20);
                    if (i < cadena.length() - 1) {
                        if (cadena.charAt(i + 1) == '1') {
                            g.drawLine(x2, y2 - 20, x2, y1);
                            estadoD = 0;
                        } else if (cadena.charAt(i + 1) == '0') {
                            g.drawLine(x2, y2 - 20, x2, y2);
                            estadoD = 0;
                        }
                    }
                    x1 = x2;
                    x2 = x2 + 40;
                }
            } else {
                if (cadena.charAt(i) == '0') {
                    if (i < cadena.length() - 7) {
                        if (cadena.charAt(i) == '0' && cadena.charAt(i + 1) == '0' && cadena.charAt(i + 2) == '0' && cadena.charAt(i + 3) == '0' && cadena.charAt(i + 4) == '0' && cadena.charAt(i + 5) == '0' && cadena.charAt(i + 6) == '0' && cadena.charAt(i + 7) == '0') {
                            g.drawLine(x1, y2, x2 + 80, y2);
                            g.drawLine(x2 + 80, y2, x2 + 80, y2 - 20);
                            g.drawLine(x2 + 80, y2 - 20, x2 + 120, y2 - 20);
                            g.drawLine(x2 + 120, y2 - 20, x2 + 120, y1);
                            g.drawLine(x2 + 120, y1, x2 + 160, y1);
                            g.drawLine(x2 + 160, y1, x2 + 160, y2);
                            g.drawLine(x2 + 160, y2, x2 + 200, y2);
                            g.drawLine(x2 + 200, y2, x2 + 200, y1);
                            g.drawLine(x2 + 200, y1, x2 + 240, y1);
                            g.drawLine(x2 + 240, y1, x2 + 240, y2 - 20);
                            g.drawLine(x2 + 240, y2 - 20, x2 + 280, y2 - 20);
                            g.drawLine(x2 + 280, y2 - 20, x2 + 280, y2);
                            i = i + 7;
                            x1 = x2 + 280;
                            x2 = x1 + 40;
                            // estadoD=1;
                        } else if (cadena.charAt(i) == '0') {
                            g.drawLine(x1, y2, x2, y2);
                            x1 = x2;
                            x2 = x2 + 40;
                        }
                    } else if (cadena.charAt(i) == '0') {
                        g.drawLine(x1, y2, x2, y2);
                        x1 = x2;
                        x2 = x2 + 40;
                    }
                } else {
                    g.drawLine(x1, y2, x1, y1);
                    g.drawLine(x1, y1, x2, y1);
                    if (i < cadena.length() - 1) {
                        if (cadena.charAt(i + 1) == '1') {
                            g.drawLine(x2, y1, x2, y2 - 20);
                            estadoD = 1;
                        } else {
                            g.drawLine(x2, y1, x2, y2);
                            estadoD = 1;
                        }
                    }
                    x1 = x2;
                    x2 = x2 + 40;
                }
            }
            i++;
        }
    }
}