package com.tarea;

public class TareaFunciones {
    public static void main(String[] args){
        int Precio = 50;
        int PrecioConIva = Iva(Precio);
        System.out.println("El precio con IVA incluido es " + PrecioConIva);

    }

    static int Iva(int Precio){
        int ValorIva = Precio * 16 / 100;
        int r = Precio + ValorIva;
        return r;
    }

}
