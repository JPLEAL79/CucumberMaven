Feature: Login
  Como usuario logueado debo poder ingresar al sistema

  Scenario Outline: login

    Given que navego a la página de Easy
    When  doy click en icono de inicio sesión
    Then  se despliega el formulario de login
    And   ingreso el <rut> y <contraseña>
    When  doy click en el botón iniciar sesión
    Then  me redirige al sitio privado


     Examples:

       | rut       | contraseña |
       | 13674531k | user12345  |
       |           |            |
       | perro     |            |