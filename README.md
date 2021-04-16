# POOB-TEST-SECOND-SABANA-RESEARCH
test
La Universidad de la Sabana quiere desarrollar un sistema de información para los grupos de interés de la comunidad de 
estudiantes. Estos grupos tienen como objetivo desarrollar proyectos innovadores en un área específica de conocimiento. 
Cada grupo tiene un líder responsable de aprobar y dar seguimiento a los proyectos que se ejecutan en su grupo. Los 
estudiantes pueden inscribirse a diferentes grupos de interés, si cumplen con los requisitos académicos definidos para 
cada uno de ellos, pero sólo pueden ser líderes de un grupo. La decanatura ha designado a los estudiantes de POOB de 
este semestre para construir la solución que permita.

* **Crear grupos de Interés:** La Universidad es la responsable de aprobar los grupos: su tema de investigación y los 
prerrequisitos definidos para sus miembros. Los grupos para crearse deben contar como mínimo con dos miembros, uno de 
ellos debe ser el líder.
* **Inscribir estudiantes**: Los líderes de los grupos deciden si aprueban o no a un estudiante después de verificar 
los requisitos académicos.
* **Crear proyectos:** Los líderes de los grupos se encargan de aprobar los proyectos propuestos por los estudiantes 
miembros. Los proyectos son ejecutados por varios estudiantes y se encuentran divididos en iteraciones, cada iteración 
tiene un conjunto de actividades. 
* **Evaluar proyectos:** Los líderes evalúan periódicamente el estado de avance de cada una de las actividades: el 
resultado de estas evaluaciones quedan en el log de seguimiento de las mismas. Las actividades pueden estar en cuatro 
diferentes estados: *pending*, *active*, *canceled*, *closed*. Cuando todas las actividades han finalizado se considera 
que un proyecto está terminado.

Las extensiones propuestas corresponden a las funcionalidades.

* **Crear proyectos:** Se desea manejar dos tipos de actividades. Las actividades normales están compuestas de un 
conjunto de pasos, cada uno de los cuales tiene una duración y un objetivo específico. Las actividades documentadas 
están compuestas de una actividad normal a la cual adiciona un conjunto de preguntas para evaluar su ejecución.
* **Evaluar proyectos:** Como herramienta administrativa, se desea permitir que los líderes puedan generar resúmenes de 
cada proyecto. Un resumen debe reportar el tiempo invertido en cada iteración o reportar el tiempo invertido por cada 
estudiante en un proyecto.

**Todos los contenedores son ArrayList**

![](img/class-diagram.svg)

## I. (30%) IMPLEMENTANDO

Implemente el siguiente método teniendo en cuenta que la duración de una actividad depende de sus pasos y de si se 
debe documentar el proceso. No olvide el manejo de excepciones.

1. Revise las pruebas adjuntas y los diagramas de secuencia propuestos.
2. Implemente el código necesario para que las pruebas pasen, no olvide documentar todos los métodos involucrados.
3. Ejecute las pruebas y agregue evidencia de su funcionamiento.


![](img/sequence-getDuration-proyect-diagram.svg)

![](img/sequence-getDuration-DocumentedActivity-diagram.svg)

## I. (25%) DISEÑANDO

Debido a que se desea poder presentar un resumen de la duración de los proyectos, se ha introducido el concepto 
de `ISynthesizer`. Inicialmente se tienen dos clases de sintetizadores. El estudiantil (`StudentSynthesizer`) resume la 
información del tiempo invertido por cada estudiante en el proyecto (Nombre, Duración). El ejecutivo 
(`ExecutiveSynthesizer`) presenta la duración de cada iteración de un proyecto (Objetivo, Duración). Presente el diseño 
completo (NO OLVIDE MDD) del método `summarize()` de la clase `Proyect`.

1. Escriba la especificación (documentación + firma del método) del método.
2. Construya el diagrama de secuencia.
3. Actualice el diagrama de clases con los nuevos elementos (clases, métodos, atributos, relaciones).
4. Escriba la especificación (documentación + firma del método) de todos los métodos de apoyo que haya identificado.

## I. (25%) EXTENDIENDO

Se desea extender el sistema para permitir que se puedan establecer las dependencias (Fin-a-Inicio) que tiene una 
actividad. Una dependencia (Fin-a-inicio) es un prerrequisito que tiene una actividad para poderse ejecutar. 
Una actividad puede tener múltiples dependencias, donde cada una puede puede ser otra actividad o una iteración 
completa. Cada dependencia debe estar en capacidad de notificar su fecha de finalización estimada.

* Realice los cambios necesarios en el diagrama de clases en dónde se indique que una actividad podra tener 
dependencias a otras actividades o iteraciones.
* De los diseños resultantes del punto I y II, ¿Qué debe cambiar? ¿Qué no debe cambiar?. Justifique su respuesta.
* Teniendo en cuenta los cambios necesarios ¿Que fue bueno y que fue malo de su diseño?

## I. (20%) CONCEPTOS

1. ¿Cuáles son las acciones los tres momentos importantes de las excepciones? ¿Cuál es el objetivo de cada una? 
¿Cómo se implementa en Java cada acción?.
2. ¿Qué es sobre-escritura de métodos? ¿Por qué aplicarla? ¿Cómo impedir que se sobre-escriba un método?.

## I. (50%) BONO

Implemente pruebas unitarias el código necesario para que las mismas pases sobre el método `summarize()` de la clase
`Project`, asegurese de probar el `ISynthesizer` de tipo `ExecutiveSynthesizer` y `StudentSynthesizer`, para cada uno 
sus casos de éxito y excepciones.

SI REALIZO EL BONO ASEGÚRESE DE INDICARLO EN EL ARCHIVO SOLUTIONS.md.

## Condiciones

1. La entrega debe realizarse en un archivo llamado SOLUTION.md, no se revisará documentación en ningún otro lugar.
2. Puede encontrar los editables de los diagramas en este [enlace](https://unisabanaedu-my.sharepoint.com/:u:/g/personal/diegopt_unisabana_edu_co/ESYDrd-h2lFDjnEWv7D6qmIBMd89yuTTzS1Q7P4d68IUjQ?e=g9OcpW).
3. Puede acceder a todos los recursos que considere necesarios, excepto pedirle ayuda a un tercero.
4. El examen se calificará contra un conjunto de pruebas que no esta adjunto al parcial, sin embargo el mismo cuenta con un conjunto de pruebas modelo, piense en casos que pueden no estar cubiertos en el mismo.
5. Revise la clase [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html) de Java.
5. Revise la clase [Duration](https://docs.oracle.com/javase/8/docs/api/java/time/Duration.html) de Java.

## Entrega

Siga al pie de la letra estas indicaciones para la entrega de este punto. EL HACER CASO OMISO DE ESTAS INSTRUCCIONES 
PENALIZARÁ LA NOTA.

1. Configure su usuario de GIT

```bash
$ git config --global user.name "Juan Perez"
$ git config --global user.email juan.perez@unisabana.edu.co
```

2. Desde el directorio raíz (donde está este archivo README.md), haga commit de lo realizado. Mantenga su repositorio 
privado hasta después de la entrega del parcial, entonces hagalo publico.

```bash
$ git add .
$ git commit -m "entrega parcial - Juan Perez"
```

3. Desde este mismo directorio, comprima todo con: (no olvide el punto al final de la instrucción)

```bash
$ zip -r APELLIDO.NOMBRE.zip .
```

4. Abra el archivo ZIP creado, y rectifique que contenga lo desarrollado.

5. Suba el archivo antes creado (APELLIDO.NOMBRE.zip) en el espacio de Teams correspondiente.

6. IMPORTANTE!. Conserve una copia de la carpeta y del archivo .ZIP.

7. Haga commits recurrentes para verificar su progreso, UN PARCIAL SOLUCIONADO EN 1 SOLO COMMIT SE CONSIDERA COPIA.
 
