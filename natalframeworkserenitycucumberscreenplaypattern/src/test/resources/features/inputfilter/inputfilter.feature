#language:es

Característica: Input Filter


    Escenario: Input Filter
      Dado que me encuentro en el website input-filter
      Cuando ingreso el valor "HOLAMUNDO" en el filtro nombre
      Y presiono generar filtro
      Entonces se visualiza "HOLAMUNDO" en el filtro nombre
      Y se visualiza la consulta SQL formada
