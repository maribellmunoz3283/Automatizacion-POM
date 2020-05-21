# language: es
@Regression
Característica:  Como Analista de una célula de pruebas, quiero utilizar la aplicación Trello
para realizar un control de las actividades planeadas, que se están realizando y finalizadas en mi
equipo de trabajo.


  Como usuario
  Solicito registrar datos
  para crear una cuenta
  en la plataforma de gestion Trello


  @Registrar
  Escenario: Registrar datos de usuario
    Dado que maribell requiere hacer registro
    Cuando ella ingresa datos como nombre, email y contraseña en la plataforma
    Entonces ella verifica respuesta exitosa Bienvenido a Trello motocicletas


  @CrearTablero
  Escenario: Crear Tableros
    Dado que maribell necesita crear un tablero en Trello
    Cuando  ingresa con su usario y contraseña busca la opcion crear tablero en a la plataforma
    Entonces maribell verifica validacion exitosa Tablero Prueba





