<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Universitas - Portal Académico</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" />
    <style>
        body {
            background-color: #ffffff;
        }
        .sidebar {
            height: 100vh;
            position: fixed;
            width: 250px;
            background-color: #004d00; /* Verde oscuro */
        }
        .sidebar .nav-link {
            color: #f8f9fa;
        }
        .sidebar .nav-link.active {
            background-color: #ffcc00; /* Amarillo */
            color: #004d00;
        }
        .sidebar .nav-link:hover {
            color: #ffcc00;
        }
        .content {
            margin-left: 250px;
            padding: 2rem;
        }
        .navbar-universitas {
            background-color: #ffcc00; /* Amarillo */
            color: #004d00;
        }
        .navbar-universitas .navbar-brand {
            color: #004d00;
        }
        .btn-universitas {
            background-color: #004d00;
            color: #ffffff;
            border: none;
        }
        .btn-universitas:hover {
            background-color: #003300;
        }
        footer {
            color: #004d00;
        }
    </style>
</head>
<body>

<!-- Sidebar -->
<nav class="sidebar d-flex flex-column p-3">
    <a href="#" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-white text-decoration-none">
        <img src="https://www.politecnicojic.edu.co/images/logo/logo.png" alt="Universitas Logo" class="me-2" style="width: 40%" />
        <span class="fs-4">Universitas</span>
    </a>
    <hr>
    <ul class="nav nav-pills flex-column mb-auto">
        <li>
            <a href="#" class="nav-link active">
                <i class="bi bi-house-door me-2"></i> Inicio
            </a>
        </li>
        <li>
            <a href="#" class="nav-link">
                <i class="bi bi-people me-2"></i> Estudiantes
            </a>
        </li>
        <li>
            <a href="#" class="nav-link">
                <i class="bi bi-person-badge me-2"></i> Docentes
            </a>
        </li>
        <li>
            <a href="#" class="nav-link">
                <i class="bi bi-journal-bookmark me-2"></i> Materias
            </a>
        </li>
        <li>
            <a href="#" class="nav-link">
                <i class="bi bi-calendar-event me-2"></i> Horarios
            </a>
        </li>
        <li>
            <a href="#" class="nav-link">
                <i class="bi bi-collection me-2"></i> Biblioteca
            </a>
        </li>
        <li>
            <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">
                <i class="bi bi-gear me-2"></i> Configuración
            </a>
            <ul class="dropdown-menu">
                <li><a class="dropdown-item" href="#">Perfil</a></li>
                <li><a class="dropdown-item" href="#">Ajustes</a></li>
                <li><a class="dropdown-item" href="#">Cerrar sesión</a></li>
            </ul>
        </li>
    </ul>
</nav>

<!-- Content -->
<div class="content">
    <nav class="navbar navbar-universitas mb-4">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Portal Universitas</a>
        </div>
    </nav>

    <h1 class="mb-4 text-success">Bienvenido a Universitas</h1>

    <div class="row mb-4">
        <div class="col-md-6">
            <div class="card">
                <img src="https://img.freepik.com/foto-gratis/comunicacion-linea_1098-15842.jpg?semt=ais_hybrid" class="card-img-top" alt="Estudiantes">
                <div class="card-body">
                    <h5 class="card-title">Estudiantes Universitas</h5>
                    <p class="card-text">Accede a tu información académica, inscripciones y servicios estudiantiles.</p>
                    <a href="#" class="btn btn-universitas">Ver más</a>
                </div>
            </div>
        </div>

        <div class="col-md-6">
            <div class="card">
                <img src="https://www.shutterstock.com/image-photo/teachers-day-teacher-school-classroom-600nw-2320930341.jpg" class="card-img-top" alt="Docentes">
                <div class="card-body">
                    <h5 class="card-title">Docentes Universitas</h5>
                    <p class="card-text">Consulta el plan de estudios, tu carga académica y recursos para docentes.</p>
                    <a href="#" class="btn btn-universitas">Ver más</a>
                </div>
            </div>
        </div>
    </div>

    <div class="row mb-4">
        <div class="col-md-4">
            <div class="card">
                <img src="https://www.centrocentro.org/sites/default/files/styles/imagenes_medianas/public/activity/image/banner%20850x450.jpg.webp?itok=0t8PISrY" style="width: 40%" class="card-img-top" alt="Materias">
                <div class="card-body">
                    <h5 class="card-title">Materias</h5>
                    <p class="card-text">Consulta las materias disponibles en Universitas para este semestre.</p>
                    <a href="#" class="btn btn-universitas">Ver Materias</a>
                </div>
            </div>
        </div>

        <div class="col-md-4">
            <div class="card">
                <img src="https://img.freepik.com/vector-gratis/reloj-oficina-pared-agujas-negras-rojas-esfera-blanca_1284-8992.jpg" style="width: 50%" class="card-img-top" alt="Horarios">
                <div class="card-body">
                    <h5 class="card-title">Horarios</h5>
                    <p class="card-text">Verifica tus horarios de clases y exámenes.</p>
                    <a href="#" class="btn btn-universitas">Ver Horarios</a>
                </div>
            </div>
        </div>

        <div class="col-md-4">
            <div class="card">
                <img src="https://via.placeholder.com/400x200/ffcc00/004d00?text=Biblioteca" class="card-img-top" alt="Biblioteca">
                <div class="card-body">
                    <h5 class="card-title">Biblioteca Virtual</h5>
                    <p class="card-text">Accede a recursos y libros digitales de Universitas.</p>
                    <a href="#" class="btn btn-universitas">Acceder</a>
                </div>
            </div>
        </div>
    </div>

    <!-- Footer -->
    <footer class="text-center mt-4">
        <p class="text-success">&copy; 2025 Universitas - Todos los derechos reservados.</p>
    </footer>
</div>

<!-- Bootstrap JS + Icons -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css" rel="stylesheet" />
</body>
</html>

<%
    int x = 15;
    int y = 8;

    if(x > y){
        %>
            <h2>Suma: </h2><%= x + y %>
        <%
    }
%>

