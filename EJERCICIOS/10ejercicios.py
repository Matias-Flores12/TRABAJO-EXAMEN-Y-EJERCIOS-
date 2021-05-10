
#ejercicio 3.1
def VotoElecciones():
  print ("Como saber si puedes votar por tu edad")
  mensaje=""
  edadP=int(input("ingrese la edad que tiene:"))
  if edadP>=18:
    mensaje="Usted tiene la edad necesaria para votar"
  else:
    mensaje="Usted no cumple con la edad minima para votar"
  print(mensaje)
#VotoElecciones()



#ejercicio 3.2
def pagoSemanaBase40horas():
  print ("Pago semanal del trabajador") 
  sueldoPagarSem=0.0
  #Datos de entrada 
  horasTra=int(input("Ingrese horas trabajadas a la semana:")) 
  horasPago=int(input("Ingrese el pago por hora:")) 
  #Proceso
  if horasTra>40:
    sueldoPagarSem=40*horasPago+(horasTra-40)*2*horasPago
  else:
    sueldoPagarSem=horasTra*horasPago
#Datos de salida
  print("El sueldo a pagar al trabajador es:", sueldoPagarSem)
#pagoSemanaBase40horas()


#ejercicio 3.3
def regalo14defebrero():
  print("cual sera el regalo por el dia del amor y la amistad") 
  #datos de dentrada
  dinero=float(input("ingrese la cantidad: "))
  #proceso
  if dinero<=10.00:
    print("puedes regalar una tarjeta")
  elif dinero>=11.00 and dinero<=100.00:
    print("puedes comprar unos chocolates")
  elif dinero>=101.00 and dinero<=250.00:
    print("puedes comprar una flor")
  elif dinero>=251.00:
    print("puedes comprar un anillo")
#regalo14defebrero()


#ejercicio 3.4
def costoestacionamiento():
  print("el costo que debe cobrar por el estacionamiento es")
  #variables
  costoE = 0.00
  #datos de entrada
  horasEstc=int(input("ingrese las horas estacionadas: "))
  #proceso
  if horasEstc<=2:
    costoE=horasEstc*5
  elif horasEstc>=3 and horasEstc<=5:
    costoE=horasEstc*4
  elif horasEstc>=6 and horasEstc<=10:
    costoE=horasEstc*3
  elif horasEstc>10:
    costoE=horasEstc*2
  #datos de salida
  print("costo del estacionamiento:", costoE)  
#costoestacionamiento()


#ejercicio 3.5
def edadnombre():
  print("nombre y edad de la persona menor")
  #datos de entrada
  Orson=int(input("ingrese la edad que tiene Orson: "))
  Mariana=int(input("ingrese la edad que tiene Mariana: "))
  Renata=int(input("ingrese la edad que tiene Renata: "))
  #proceso y fin
  if Orson<Mariana and Orson<Renata:
    print(f"el menor es Orson y tiene {Orson} año(s)")
  elif Mariana<Orson and carlos<Renata:
    print(f"el menor es Mariana y tiene {Mariana} año(s)")
  elif Renata<Orson and Renata<Mariana:
    print(f"el menor es Renata y tiene {Renata} año(s)")
  elif Orson==Mariana and Orson==Renata and Mariana==Renata:
    print("los tres son de la misma edad")
#edadnombre() 



#ejercicio 3.6
def descuentoypagodearticulo():
  print("monto que se debe pagar")
  #variables
  montoapagar = 0.00
  #datos de entrada
  costo=int(input("ingrese el costo del articulo: "))
  #proceso
  if costo>=200:
    montoapagar=costo-(costo*15/100)
  elif 100<=costo<200:
    montoapagar=costo-(costo*12/100)
  else:
    montoapagar=costo-(costo*10/100)
  #datos de salida
  print("\nla cantida a pagar es:", montoapagar)
#descuentoypagodearticulo()

#ejercicio 3.7
def asignaciondeBecas():
  print("ejercicio")
  #datos de entrada
  edad = int(input("poner edad:"))
  nota = float(input("poner la nota:"))
  #proceso
  if edad>18:
    if nota>=9:print("tienes una beca de $2000")
    if nota<9>=7.5:print("tienes una beca de $1000")
    if nota<7.5>=5.0:("tienes una beca de $500")
    if nota<5.0:print("estudie mas para el proximos siclo escolar")
  elif edad<=18:
    if nota>=9:print("tienes una beca de $3000")
    if nota<9>=8:print("tienes una beca de $2000")
    if nota<8>=6:print("tienes una beca de $100")
    if nota<6:print("estudie mas para el proximos siclo escolar")
#asignaciondeBecas()


#ejercicio 3.16
def bonoDocente():
  #definir Variables
  bonoObtenido=0.0
  #Datos de Endrada
  salarioMinimo=float(input("Ingrese el salario minimo:"))
  puntuacionObtenida=float(input("Ingrese la puntuación que ha obtenido:"))
  #Proceso
  if puntuacionObtenida<=100 and puntuacionObtenida>=0:
    bonoObtenido=salarioMinimo
  elif puntuacionObtenida >=101 and puntuacionObtenida<=150:
    bonoObtenido=salarioMinimo*2
  elif puntuacionObtenida>150:
    bonoObtenido=salarioMinimo*3  
  #Datos de salida
  print("El docente obtendra un bono de:", bonoObtenido )
#bonoDocente()


#ejercicio 3.17
def paquetes():
  #Definir Variables
  resultPaquete=""
  #Datos de entrada
  montoRvDic=float(input("Ingrese el monto que recibe en diciembre:"))
  #Proceso
  if montoRvDic>=50000:
    resultPaquete="Paquete A"
  elif montoRvDic>=20000 and montoRvDic<50000:
    resultPaquete="Paquete B"
  elif montoRvDic>=10000 and montoRvDic<20000:
    resultPaquete="Paquete C"
  else:
    resultPaquete="Paquete D"
  #Datos de salida
  print("La persona comprara el: ", resultPaquete)
#paquetes()  


#ejercicio 3.11
def bonodeantiguedadparaempleados():
  #datos de entrada
  añoselaborados=int(input("cantidad de años elaborados anteriormente:"))
  #proceso
  if añoselaborados:
    if añoselaborados==1:print("Recibi  $100")
    if añoselaborados==2:print("Recibir $200")
    if añoselaborados==3:print("Recibir $300")
    if añoselaborados==4:print("Recibir $400")
    if añoselaborados==5:print("Recibir $500")
    if añoselaborados>5:print("Recibir $1000")
#bonodeantiguedadparaempleados()
