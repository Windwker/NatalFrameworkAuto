#language: es
Característica: Wizard

  Escenario: Navegacion libre
    Dado que me encuentro en el website del wizard
    Cuando completo nombre apellido e email y presiono siguiente
    Entonces el sistema me posiciona en la pestana datos adicionales
    Y cuando ingreso "12/03/2019" como fecha  y selecciono sexo y presiono siguiente
    Entonces el sistema me informa que se creo la cuenta correctamente
    Y al presionar Finalizar
    Entonces el sistema despliega un popup indicando de la creacion exitosa de la cuenta
