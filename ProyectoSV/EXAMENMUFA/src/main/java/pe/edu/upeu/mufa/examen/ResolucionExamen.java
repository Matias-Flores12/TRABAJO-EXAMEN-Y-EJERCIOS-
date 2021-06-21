package pe.edu.upeu.mufa.examen;

import pe.edu.upeu.mufa.utils.TecladoRead;

public class ResolucionExamen {
 static TecladoRead   objeTec=new TecladoRead();
 //EJERCICIO 2
 public void impuestoVehiculos() {
    //definir variables
    double totalImpPagar=0, impuestoUniV=0, impuestoTotalCateg=0;
    //Proceso/Datos entra/Datos de salida
    for (int categ = 1; categ <= 3; categ++) {
        int cantidadV=objeTec.read(0,"Ingrese la cantidad de Vehiculos de categoria "+categ+":");
        double costoV=objeTec.read(0,"Ingrese el costo de Vehiculos de categoria "+categ+":"); 
        if (categ==1) {impuestoUniV=costoV*0.12;}
        if (categ==2) {impuestoUniV=costoV*0.08;}
        if (categ==3) {impuestoUniV=costoV*0.05;}

        impuestoTotalCateg=impuestoUniV*cantidadV;
        totalImpPagar+=impuestoTotalCateg;
        System.out.println("El impuesto a pagar por cada vehiculo de categoria "+categ+" es:"+impuestoUniV);
        System.out.println("El total impuesto de cateroria "+categ+" es:"+impuestoTotalCateg);
        System.out.println("\n\n");
    }
    System.out.println("El total de impuesto x todos los vehiculos es:"+totalImpPagar);
}
    //EJERCICIO 3
    public void MultiplicaciondeunNumeroENtero() {
        System.out.println("Tabla de multiplicación");
        //variables
        int n, multiplicador;
        //datos de entrada 
        n = objeTec.read(0,"\ningresar el numero entero positivo a multiplicar: ");
        multiplicador=objeTec.read(0,"\ningresar el limite de tu multiplicador");  
        
        if (n>0) {
            for (int i=1; i<=multiplicador; i++){
                System.out.println(n+"x"+i+" = "+n*i);
            }
        } else {
            System.out.println("el numero es incorrecto" ); 
        }
        
    }
    //EJERCICIO 4
    public void DeterminaciondenumerosPerfectos () {
        int a, b, suma;
        System.out.println("Números perfectos entre 1 y 1000000000: ");
        a=1;
        while(a <= 10000){      // a es el número que vamos a comprobar
            suma = 0;
            for(b = 1;b < a;b++){    // b son los divisores. Se divide desde 1 hasta i-1                          
                    if(a % b==0){
                    suma = suma + b; // si es divisor se suma
                    }
            }
            if(a == suma){             // si el numero es igual a la suma de sus divisores es perfecto              
                System.out.println(a);
            }
            a++;
        }
    }
    //EJERCICIO 5
    public int potencia(int b, int e) {
        if (e==1) {
            return b;
        } if (e==0) {
            return 1;
        } else{
            return b * potencia(b, e-1);
        }

    }
}

