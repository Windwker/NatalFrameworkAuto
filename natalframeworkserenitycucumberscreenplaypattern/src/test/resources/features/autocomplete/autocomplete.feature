#language: es
Característica: Autocomplete Simple

  Escenario: Seleccion Simple
    Dado me encuentro en la website de autocomplete seleccion simple
    Cuando comienzo a ingresar "farm" en el input
    Entonces deberia poder visualizar cada opcion disponible por criterio de busqueda
    Y al seleccionar alguna opcion
    Entonces deberia visualizar la opcion seleccionada


  Escenario: Seleccion Multiple
    Dado me encuentro en la website de autocomplete seleccion multiple
    Cuando ingreso el valor "1" en el input
    Entonces deberia poder visualizar cada opcion disponible que contiene el criterio de busqueda
    Y al seleccionar alguna opcion del selector
    Entonces deberia poder visualizar la opcion seleccionada
    Y deberia poder ingresar el valor "2" en el input
    Y deberia poder seleccionar un segundo valor de la lista
    Y deberia poder visualizar los valores previamente seleccionados


  Escenario: Seleccion Multiple - Eliminar Elementos
    Dado me encuentro en la website de autocomplete seleccion multiple
    Cuando ingreso el valor "1" en el input
    Y al seleccionar alguna opcion del selector
    Y al presionar la cruz para eliminar la opcion
    Entonces la opcion se elimina del selector

