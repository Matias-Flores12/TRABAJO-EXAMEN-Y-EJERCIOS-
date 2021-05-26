
import java.util.Scanner;
class sueldo{
static Scanner teclado=new Scanner(System.in);
static void ejercicio03(){
//Definir variables y otros
System.out.println("Ingresar la cantidad del sueldo");
String sueldo="";
//datos de entrada
int sueldodelapersona= teclado.nextInt();
if(sueldodelapersona>5000){
sueldo="pagar impuestos";
}else if (sueldodelapersona<=5000){
 sueldo="no pagar impuestos";}

  //Datos de salida:
  System.out.println("la persona tiene que : "+sueldo);
}
public static void main(String[] arg){ejercicio03();}
}