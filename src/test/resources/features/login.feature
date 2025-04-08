#language: es

  Característica: Login en suace demo

    @Login
    Esquema del escenario: : Login exitoso con credenciales correctas

      Dado que jesus requiere ingresar a la pagina de sauce demo
      Cuando se autentica con sus credenciales
      |usuario  | password |
      |<usuario>|<password>|
      Entonces visualiza en la pagina el mensaje 'Swag Labs'

      Ejemplos:
      |usuario      |password     |
      |standard_user|secret_sauce |