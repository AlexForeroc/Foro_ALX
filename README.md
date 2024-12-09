
# Foro Alura Challenge

Este proyecto representa la implementación de una API REST como parte de la siguiente emtrega del Challenge de Oracle Next Education, enfocado en el desarrollo de una solución backend utilizando Java y el framework Spring Boot. La API está diseñada para gestionar tópicos en un foro, siguiendo las mejores prácticas de desarrollo y seguridad.

# Funcionalidades
# La API ofrece las siguientes funcionalidades clave:

# Gestión de Tópicos

Crear un nuevo tópico.
Mostrar todos los tópicos creados.
Mostrar un tópico específico.
Actualizar un tópico existente.
Eliminar un tópico.
Validaciones y Reglas de Negocio.

Validaciones implementadas para garantizar integridad y consistencia en los datos.
Gestión de errores con respuestas adecuadas según el estándar HTTP.
Persistencia de Datos

Base de datos configurada para almacenar información de tópicos y usuarios.
Cambios realizados en la base de datos para almacenar credenciales de autenticación de los usuarios.
Autenticación y Seguridad

Implementación de autenticación basada en tokens JWT (JSON Web Tokens).
Gestión segura de contraseñas utilizando el algoritmo de hashing BCrypt.
Configuración de seguridad con Spring Security.
Tecnologías Utilizadas.

# Las tecnologías y herramientas principales empleadas en este proyecto son:

Java: Lenguaje principal para la implementación del backend.
Spring Boot: Framework para la creación de aplicaciones robustas y escalables.
MySQL: Sistema de gestión de base de datos para la persistencia de datos.
Spring Security: Proporciona autenticación y autorización para la API.
JWT (JSON Web Token): Manejo seguro de tokens para la autenticación de usuarios.
BCrypt: Algoritmo de hashing utilizado para almacenar contraseñas de manera segura.
IntelliJ IDEA: Entorno de desarrollo integrado (IDE) para escribir y depurar el código.
Insomnia: Herramienta para pruebas y validación de endpoints de la API.
Endpoints Principales

# 1. Registro de Usuarios
Permite registrar nuevos usuarios en el sistema.
La contraseña proporcionada por el usuario se almacena de forma segura usando hashing con BCrypt.

Método: POST
Endpoint: /api/usuarios
Requisitos:
Nombre de usuario.
Email.
Contraseña (almacenada como hash).
Ejemplo de contraseña encriptada: admin → bcrypt-generated-hash.

# 2. Gestión de Tópicos
Endpoints para crear, leer, actualizar y eliminar tópicos en el foro.

# Contribuciones
Este proyecto es un desafío educativo y no está abierto a contribuciones externas. Sin embargo, cualquier sugerencia o mejora será bienvenida a través de issues en el repositorio.

# Licencia
Este proyecto está desarrollado para fines educativos bajo los términos del programa Oracle Next Education (ONE).

