# API de Álbumes de The Strokes

Esta API proporciona un servicio para obtener información sobre los álbumes de la banda de rock The Strokes. Está construida con Java Spring Boot y ha sido configurada para ser desplegada en la plataforma Railway.

## Uso

### Obtener todos los álbumes

GET https://thestrokesapi-production.up.railway.app/api/album

Este endpoint devuelve una lista de todos los álbumes de The Strokes.

#### Ejemplo de respuesta:

```json
[
    {
        "id": 1,
        "titulo": "Is This It",
        "año": 2001,
        "canciones": 11
    },
    {
        "id": 2,
        "titulo": "Room on Fire",
        "año": 2003,
        "canciones": 11
    },
    // Otros álbumes...
]
```

Despliegue en Railway
---------------------

Esta API ha sido diseñada para ser desplegada en [Railway](https://railway.app/), una plataforma que simplifica el proceso de despliegue y gestión de aplicaciones.

### Pasos para desplegar en Railway

  **Clonar el repositorio:**
  git clone https://github.com/tu-usuario/tu-repositorio.git
*   **Configurar variables de entorno:**
    
    *   En Railway, asegúrate de configurar las variables de entorno necesarias, como credenciales de base de datos u otras configuraciones específicas de tu aplicación.
*   **Despliegue:**
    
    *   Sigue las instrucciones de Railway para desplegar tu aplicación. Asegúrate de tener configurado el entorno adecuado para Java Spring Boot.
    *   


Contribuir
----------

¡Las contribuciones son bienvenidas! Si tienes sugerencias, mejoras o correcciones, no dudes en abrir un issue o una solicitud de extracción (pull request).


