package edu.escuelaing.arep.app;

import java.util.HashMap;
import java.util.Map;

public class MiniSpark {

    public static Map<String, service> getServicios = new HashMap<>();
    public static Map<String,service> postServicios = new HashMap<>();

    public static void main( String[] args ) throws Exception {
        get("/hello", str -> "Hola con get " + str);
        post("/hello", str -> "Hola con post " + str);
        get("/coseno", str -> "" + Math.cos(Double.parseDouble(str)));
        post("/coseno", str -> "" + Math.cos(Double.parseDouble(str)));
        get("/seno", str -> "" + Math.sin(Double.parseDouble(str)));
        post("/seno", str -> "" + Math.sin(Double.parseDouble(str)));

        HttpServer.start(args);
    }

    public static service search(String nombre, String accion) {
        if (accion.equals("GET")){
            return getServicios.get(nombre);
        } else if (accion.equals("POST")) {
            return postServicios.get(nombre);
        }
        return null;
    }


    public static void get(String str, service service){
        getServicios.put(str, service);
    }

    public static void post(String str, service service){
        postServicios.put(str, service);
    }


}
