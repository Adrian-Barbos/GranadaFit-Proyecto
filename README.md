# 🏋️‍♂️ Granada-Fit 

**Granada-Fit** es una plataforma integral de gestión fitness desarrollada con Spring Boot. El sistema permite a los usuarios gestionar sus progresos, calcular su IMC y acceder a planes de entrenamiento personalizados según su suscripción.

---

## 🚀 Funcionalidades Principales

### 💳 Sistema de Planes (Suscripciones)
El acceso a las funcionalidades está segmentado mediante tres niveles de usuario:
* **Plan FREE (0€):** Acceso al catálogo de la tienda y perfil básico.
* **Plan PLUS (20€):** Incluye **Calculadora de IMC Pro**, registro de marcas personales (PRs) y acceso físico al gimnasio.
* **Plan PRO (200€):** El servicio definitivo con **Generador de Rutinas Personalizadas**, chat con entrenador y seguimiento de dieta.

### 🛠️ Herramientas Técnicas
* **Calculadora de IMC:** Lógica personalizada para el cálculo de salud metabólica.
* **Generador de Rutinas:** Algoritmo que filtra ejercicios según el objetivo y nivel del usuario.
* **Tienda Integrada:** Visualización de suplementación y ropa deportiva.

---

## 🛠️ Tecnologías Utilizadas

* **Backend:** Java 17+ con **Spring Boot 3**.
* **Persistencia:** Spring Data JPA con base de datos **H2/MySQL**.
* **Motor de Plantillas:** Thymeleaf (HTML5, CSS3, JavaScript).
* **Gestión de Dependencias:** Maven.
* **IDE:** IntelliJ IDEA.

---

## 📂 Estructura del Proyecto

El proyecto sigue una arquitectura multicapa estándar de Spring:

* `controller/`: Manejo de peticiones HTTP y rutas.
* `service/`: Lógica de negocio (generación de rutinas, validación de planes).
* `model/`: Entidades de la base de datos (Usuario, Plan, Ejercicio).
* `repository/`: Interfaces para la comunicación con la base de datos.
* `config/`: Configuraciones de seguridad y MVC.

---

## ⚙️ Instalación y Configuración

1. **Clonar el repositorio:**
   ```bash
   git clone [https://github.com/tu-usuario/granadafit.git](https://github.com/tu-usuario/granadafit.git)
