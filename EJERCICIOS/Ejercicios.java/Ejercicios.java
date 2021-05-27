import java.util.Random;
import java.util.Scanner;

public class Ejercicios {
    static Scanner teclado=new Scanner(System.in);
    //ejercicio 4.1
    public static void salarioProfesor() {
        //Vafriables
        
       double salario;
        //datos de entrada
        int Sinicial=1500;
        double increm=0.1;//10%
        //proceso 
        System.out.println("su salario inicial es "+Sinicial);
        salario = Sinicial+(Sinicial*increm);
        for (int año = 1; año<=6; año++) {
            System.out.print("al termino del "+año+"° año ");
            System.out.println("sera: "+salario);
            salario = salario+(salario*increm);
        }
    }
    //ejercicio 4.2
    public static void costodeHamburgues(){
        int cantidadHam; double costoFinal=0; String pagoTarjeta;
        //datos de entrada y proceso 
        for(int tipoHam=1; tipoHam<=3; tipoHam++){
            if(tipoHam==1){
                  System.out.println("Cantidad de Hamburguesas de Tipo Simple:"); 
                  cantidadHam=teclado.nextInt();
                  costoFinal=costoFinal+cantidadHam*20;
            }else if(tipoHam==2){
                  System.out.println("Cantidad de Hamburguesas de Tipo Doble:");
                  cantidadHam=teclado.nextInt();
                  costoFinal=costoFinal+cantidadHam*25;
            }else{
                  System.out.println("Cantidad de Hamburguesas de Tipo Triple:"); 
                  cantidadHam=teclado.nextInt();
                  costoFinal=costoFinal+cantidadHam*28;                
            }
        }
        //Datos Salida, Proceso, Entrada
        System.out.println("El costo de las Hamburguesas hasta el momento es:"+costoFinal);  
        System.out.println("Desea Pagar con Tarjeta?");
        pagoTarjeta=teclado.next();
        if(pagoTarjeta.equals("SI")){
            costoFinal=costoFinal+costoFinal*0.05; 
        }
        System.out.println("El costo total de la Hamburguesa es:"+costoFinal);
    }
 
     //Ejercicio 4.3
    public static void contarNumerosNegPosCero() {
    //Daclarar Variables
    int nNumeros, cantCero=0, cantNeg=0, cantPost=0;
    double numeros;
    //datos de Entrada
    System.out.println("Ingrese N cantidad:");
    nNumeros=teclado.nextInt();
    Random numAleatorio = new Random();
    //Proceso
    for (int numero=1; numero<=nNumeros; numero++) {
        numeros = numAleatorio.nextInt(10)-4;
        System.out.println(numeros);
        if (numeros<0) {cantNeg++;} 
        if (numeros>0) {cantPost=cantPost+1;} 
        if (numeros==0) {cantCero+=1;}             
    }
    //datos de salida
    System.out.println("De total de numeros:\n"+cantCero+" es/son cero(s)"+
    "\n"+cantNeg+" es/son menor(es) de cero"+
    "\n"+cantPost+" es/son mayor(es) de cero"
    );
 }
    //Ejercicio 4.4
    public static void identificarColorFoco() {
    //definir Variables
    int nFocos, fVerde=0, fBlanco=0, fRojo=0;
    //Datos de entrada
    System.out.println("Ingrese N cantidad de Focos:");
    nFocos=teclado.nextInt();
    //Proceso
    for (int foco=1; foco<=nFocos; foco++) {
        System.out.print("Ingrese el color (V=Verde, B=Blanco y R=Rojo)"+
        "del foco # "+foco+":");
        String color=teclado.next();
        if(color.toUpperCase().equals("V")){ fVerde++; }
        if(color.toUpperCase().equals("B")){ fBlanco=fBlanco+1; }
        if(color.toUpperCase().equals("R")){ fRojo+=1; }
        System.out.println("");
    }
    //Datos de salida
    System.out.println("Del total de focos:\n"+fVerde+" son Verde(s)\n"+
    fBlanco+" son Blanco(s)\n"+fRojo+" son Rojo(s)\nEn total son:"+nFocos);
 }

   //ejercicio 4.5
   public static void AhorrodetodoslosdiasAnualmente() {
    //variables 
    double AhorrodetodoslosdiasAnualmente;
    //datos de entrada 
    double ahorro1Enero=3;//dia 1
   //sabiendo que un año tiene 365 dias
    for (int dia = 1; dia <= 365; dia++) {
        System.out.println("lo ahorrado en el");
        AhorrodetodoslosdiasAnualmente=Math.pow(ahorro1Enero,dia);
        System.out.println("dia "+dia+" es "+AhorrodetodoslosdiasAnualmente+ " pesos");
        
    }    
}

    //Ejercicio 4.19
    public static void impuestoVehiculos() {
        //definir variables
        double totalImpPagar=0, impuestoUniV=0, impuestoTotalCateg=0;
        //Proceso/Datos entra/Datos de salida
        for (int categ = 1; categ <= 3; categ++) {
            System.out.println("Ingrese la cantidad de Vehiculos de categoria "+categ+":");
            int cantidadV=teclado.nextInt();
            System.out.println("Ingrese el valor de Vehiculos de categoria "+categ+":");
            double valorV=teclado.nextInt(); 
            if (categ==1) {impuestoUniV=valorV*0.10;}
            if (categ==2) {impuestoUniV=valorV*0.07;}
            if (categ==3) {impuestoUniV=valorV*0.05;}

            impuestoTotalCateg=impuestoUniV*cantidadV;
            totalImpPagar+=impuestoTotalCateg;
            System.out.println("El impuesto a pagar por cada vehiculo de categoria "+categ+" es:"+impuestoUniV);
            System.out.println("El total impuesto de cateroria "+categ+" es:"+impuestoTotalCateg);
            System.out.println("\n\n");
        }
        System.out.println("El total de impuesto x todos los vehiculos es:"+totalImpPagar);
    }

    //Ejercicio 4.20
    public static int hallarFactorial(int numero) {
        int factorialResult=1;
        if(numero>1){
            for (int i = 2; i <= numero; i++) {
                factorialResult*=i;
            }
        }
        return factorialResult;        
    }

    public static void calcularFuncionExponecial() {
        //Declarar Variables
        int x, lfx;
        double fx=0;
        //Datos de entrada
        System.out.println("Ingrese un numero para calcular la funcion exponencial:");
        x=teclado.nextInt();
        System.out.println("Ingrese el limite de la funcion exponencial:");
        lfx=teclado.nextInt();    
        //Proceso
        if(x!=0){
            for (int i = 0; i < lfx; i++) {
                System.out.println(fx);
                //fx+=((Math.pow(x, i))/hallarFactorial(i));
                fx=fx+((Math.pow(x, i))/hallarFactorial(i));
            }
        }
        //Datos de salida
        System.out.println("La funcion exponencial de e^x es:"+fx);
    }


    public static void hallarSenoX() {
        //Declarar Variables
        int senx, lfunSenx;        
        //Datos de entrada
        System.out.println("Ingrese un numero X:");
        senx=teclado.nextInt();
        System.out.println("Ingrese el limite de la funcion x:");
        lfunSenx=teclado.nextInt();     
        double fresulSenX=0;
        //proceso        
        int contSigno=0;
        if(senx!=0){
            for (int i = 1; i < lfunSenx; i+=2) {                
                //fx+=((Math.pow(x, i))/hallarFactorial(i));
                System.out.println("i="+i);
                if (contSigno%2==0) {
                    System.out.println("signo +");
                    fresulSenX=fresulSenX+((Math.pow(senx, i))/hallarFactorial(i));
                } else {
                    fresulSenX=fresulSenX-((Math.pow(senx, i))/hallarFactorial(i));
                    System.out.println("signo -");
                }
                //System.out.println(fresulSenX);
                contSigno++;
            }
        }         
        //Datos de de salida
        System.out.println("Sen x es:"+fresulSenX);

        
}
  //ejercicio 4.8
  static void preciosdearticulos(){
    //Definir variables y otros
    System.out.println("cantidad de articulos los cuales se le descontara");
    String descuento=""; 
    //datos de entrada
    int precio= teclado.nextInt();
    if(precio<=200){
    descuento="0.15";
    }else if (precio>100 && precio<200){
    descuento="0.12";}
    else if (precio<100){
    descuento="0.10";}
     //Datos de salida:
    System.out.println("El descuento que recivira es de: "+descuento);
    }
   //ejercicio 4.15
    static void sueldosemanal(){
    //Definir variables y otros
    System.out.println("Sueldo semanal: ");
    String descuenta="";
    //datos de entrada
    int ganancias= teclado.nextInt();
    if(ganancias<=150){
    descuenta="0.5";
    }else if (ganancias>150 && ganancias<300){
    descuenta="0.7";}
    else if (ganancias>300 && ganancias<450){
    descuenta="0.9";}
    //Datos de salida:
    System.out.println("El descuento sera de : "+descuenta);
}
   //ejercicio 4.16
        static void Cubodenropositivo() {
        System.out.println("el cubo de los numeros naturales");
        //variables
        int CuboNum, Num= 0;
        do {
            System.out.print("digite el numero natural: ");
               Num= (int)teclado.nextDouble();
            if (Num>0) {

                CuboNum = (int)Math.pow(Num, 3);
                System.out.println("el cubo del numero "+Num+ " es: "+CuboNum);
            } else {
                System.out.println("el numero que digitaste es negativo");
            }
        } while (Num>0);
        
    }
    

     


   

    public static void main(String[] args) {
        //salarioProfesor() ; 
        //costodeHamburgues() ;
        //contarNumerosNegPosCero();
        //identificarColorFoco();
        //AhorrodetodoslosdiasAnualmente();
        //impuestoVehiculos ();
        //hallarSenoX ();
        //preciosdearticulos();
        //sueldosemanal();
        //Cubodenropositivo();






    }
}