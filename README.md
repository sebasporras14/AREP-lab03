# MICROFRAMEWORKS WEB

Este proyecto busca crear aplicaciones web por medio de funciones lamda explorando la arquitectura del microframework denominado sparkweb

## Corriendo el proyecto

Una vez clonado el proyecto y generado el jar con los siguientes comandos:

~~~
git clone https://github.com/sebasporras14/AREP-lab03.git
~~~
~~~
mvn package
~~~

se puede ejecutar con:

~~~
java -cp "./target/classes" edu.escuelaing.arep.app.MiniSpark
~~~
una vez aparezca "Listo para recibir", en su navegador ingrese:

~~~
Http://LocalHost:35000/"el archivo html, imagen o js"
~~~

### prueba POST Y GET

Al colocar los siguiente:
~~~
Http://LocalHost:35000/index.html"
~~~
Se abre un formulario que te saludara de acuerdo al nombre escrito utilizando metedos get y post respectivamente.

![test](https://github.com/sebasporras14/AREP-lab03/blob/master/imagenes/pruebanewhtml.png)

## Construido con 
* [Maven](https://maven.apache.org/) - Dependency Management
* [java](https://rometools.github.io/rome/) - Used to generate RSS Feeds


## Autor

* **Sebastian Porras**

### Fecha

09/06/2023 

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
