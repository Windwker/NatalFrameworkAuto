#language: es

Característica: CheckBox


  Escenario: CheckBox Basico
    Dado me encuentro en la website de checkbox basico
    Cuando hago click en el checkbox
    Entonces el checkbox se deselecciona
    Y hago click en el checkbox
    Entonces el checkbox se selecciona

  Escenario: Checkbox Multiple
    Dado me encuentro en la website de checkbox multiple
    Cuando hago click en todos los checkbox
    Entonces los checkbox se seleccionan
    Y se muestra la seleccion en la seccion Los que te gustan son
