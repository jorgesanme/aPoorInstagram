# aPoorInstagram.
Es un ejercicio para practicar la obtención de información desde una API y mostrar la misma al usuario.


## Explicación de la app:
Esta app muestra las imagenes en un RecycleView descarga desde la API https://api.imgur.com/.

Se muestran las imagenes más vistas "HOT" y las últimas "TOP" subidas a la plataforma.

Se usa una arquitectura MVVM. 

Para ello se ha usado las siguientes:

- **Okhttp3** 
- **Coroutines** 
- **Retropif**
- **Moshi** => Json library
- **Lificycle** => viewModel - MvvM
- **Glide**  => carga las imagenes desde http
- **Kodein** => DI - Injección de dependencias
- **Timber** => log de la app. 
- **Room** => capa intermedia almacenar en local con SQLite

## Imagenes de muestra
#### Hot Images |  Top Images|
<img src="https://github.com/jorgesanme/aPoorInstagram/blob/main/Images/apoorInstagram_1.gif" width="160" height="300" />|
<img src="https://github.com/jorgesanme/aPoorInstagram/blob/main/Images/apoorInstagram_2.gif" width="160" height="300" />
