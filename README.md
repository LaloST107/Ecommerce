# 🛒 E-Commerce Mexican file 🇲🇽 – Productos Mexicanos para el Extranjero

Este proyecto es un **E-commerce Inteligente** desarrollado con **React JS (frontend)** y **Spring Boot (backend)**, además de
que integrará **Inteligencia Artificial** para mejorar la experiencia de compra y facilitar la gestión del catálogo de productos mexicanos exportados al extranjero. 

---

## 🚀 Funcionalidades principales

✅ **Frontend (React + TailwindCSS)**
- Diseño moderno y responsive con TailwindCSS.
- Home dinámica con categorías, productos destacados y testimonios.
- Búsqueda de productos con **barra de búsqueda**.
- Páginas para catálogo, carrito, checkout y perfil de usuario.
- Animaciones con Framer Motion.
- Testing con Vitest, React Testing Library y Cypress.

✅ **Backend (Spring Boot)**
- API REST para productos, usuarios, categorías y pedidos.
- Seguridad con Spring Security + JWT.
- Test unitarios con JUnit5 y Mockito.
- Test de integración con Testcontainers y REST Assured.
- Migraciones de base de datos con Flyway.
- Documentación automática de API con Swagger/OpenAPI.

✅ **IA Integrada**
1. **Visual Catalog** → Clasificación automática de productos por imágenes (CNN con TensorFlow/Keras).
2. **Visual Search** → Búsqueda visual: el cliente sube una foto y se muestran productos similares (FAISS + embeddings).
3. **Recommendation Engine** → Recomendaciones personalizadas basadas en compras anteriores (scikit-learn + filtrado colaborativo).

✅ **Infraestructura y DevOps**
- Contenerización con Docker.
- Orquestación con Kubernetes.
- Mensajería asíncrona con Kafka o RabbitMQ.
- Cache de alto rendimiento con Redis.
- Monitoreo con Grafana + Prometheus.
- Análisis de calidad de código con SonarQube y Codana.

---

## 🏗️ Arquitectura

```mermaid
flowchart TD
  A[Frontend - React + Tailwind] -->|REST API| B[Backend - Spring Boot]
  B --> C[(PostgreSQL)]
  B --> D[(Redis)]
  B --> E[(Kafka/RabbitMQ)]
  B --> F[IA Services - Python]
  F -->|Clasificación CNN| G[Visual Catalog]
  F -->|Embeddings + FAISS| H[Visual Search]
  F -->|Filtrado Colaborativo| I[Recommendation Engine]
  B --> J[Swagger/OpenAPI]
  B --> K[Grafana + Prometheus]
