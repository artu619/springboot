# Configuración de una app Spring mediante Java

Como hemos visto en el anterior ejemplo, podemos dar de alta un contexto de Spring sin necesidad de usar un xml.

En este ejemplo vamos a ver cómo podemos dar de alta objetos en el contexto de spring sin necesidad ni de xml ni de anotaciones. 

Esto se suele usar cuando queremos dar de alta objetos en nuestro contexto de Spring a nivel programático pero cuyas clases no tenemos el código fuente y no podemos anotar.

Todos estos objetos habría que darlos de alta en una clase de configuración, es decir, que este anota con @Configuration

