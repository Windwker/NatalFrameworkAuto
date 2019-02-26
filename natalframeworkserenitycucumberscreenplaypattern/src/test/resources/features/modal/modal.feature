#language:es
  Característica: Modal
    Escenario: Verificar el comportamiento del modal
      Dado que me encuentro en el website del modal
      Cuando presiono Abrir modal
      Entonces el modal se abre con las siguientes secciones
      |header|
      |body|
      |footer|
      Y presiono cerrar
      Entonces el modal se cierra
