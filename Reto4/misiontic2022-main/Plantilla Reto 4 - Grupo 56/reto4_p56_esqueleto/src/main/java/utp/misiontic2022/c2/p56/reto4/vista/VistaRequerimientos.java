package utp.misiontic2022.c2.p56.reto4.vista;

import java.util.ArrayList;

import utp.misiontic2022.c2.p56.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p56.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p56.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p56.reto4.modelo.vo.Requerimiento_3;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){
        try {
            ArrayList<Requerimiento_1> resultados = controlador.consultarRequerimiento1();
            // Por hacer
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2(){
        try {
            ArrayList<Requerimiento_2> resultados = controlador.consultarRequerimiento2();
            // Por hacer
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3(){
        try {
            ArrayList<Requerimiento_3> resultados = controlador.consultarRequerimiento3();
            // Por hacer
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
