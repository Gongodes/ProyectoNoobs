<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>BIENVENIDOS</title>



  <link
    href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i"
    rel="stylesheet">


  <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/vendor/icofont/icofont.min.css" rel="stylesheet">
  <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">
  <link href="assets/vendor/venobox/venobox.css" rel="stylesheet">
  <link href="assets/vendor/owl.carousel/assets/owl.carousel.min.css" rel="stylesheet">
  <link href="assets/vendor/aos/aos.css" rel="stylesheet">


  <link href="assets/css/style.css" rel="stylesheet">


</head>

<body>

  <header id="header" class="fixed-top d-flex align-items-center">
    <div class="container">
      <div class="header-container d-flex align-items-center">
        <div class="logo mr-auto">
          <h1 class="text-light"><a href="index.html"><span>COMUNIDAD A.M.</span></a></h1>

        </div>

        <nav class="nav-menu d-none d-lg-block">
          <ul>
            <li class="active"><a href="#header">INICIO</a></li>
            <li><a href="#noticias">MUNDO AL DÍA</a></li>
            <li><a href="#services">TIEMPO LIBRE</a></li>
            <li><a href="#portfolio">MÚSICA</a></li>
            <li><a href="#team">FORO</a></li>
            <li><a href="#auto">AUTOCUIDADO</a></li>
            <li><a href="#serv">SERVICIOS</a></li>

            <li><a href="#contact">CONTÁCTANOS</a></li>


          </ul>
        </nav>
      </div>
    </div>
  </header>

  <section id="hero" class="d-flex align-items-center">
    <div class="container text-center position-relative" data-aos="fade-in" data-aos-delay="200">
      <h1>UN ESPACIO PARA INFORMARSE Y RECREARSE</h1>
      <h2>ESTAMOS PARA ACOMPAÑARLE Y SER SU ALIADO TECNOLÓGICO</h2>
      <a href="#noticias" class="btn-get-started scrollto">INICIE SU VIAJE EN EL NUEVO SIGLO</a>
    </div>
  </section>
  
  <main>
    
    <%   %>
    
        <table class="table table-hover">
            <tr>
                <th><strong>Nombre / Sobrenombre</strong></th>
                
                <th><strong>Mensaje</strong></th> 
                
                <th><strong>Elminar y Modificar Usuario</strong></th>
            </tr>
            <c:forEach var="am" items="${mensajes}">
            <tr>
                <td><c:out value="${usr.getRun()}"></c:out></td>
                <td><c:out value="${usr.getNombre()}"></c:out></td>
                <td><c:out value="${usr.getTipo()}"></c:out></td>
                <td> <a href="editaradministrativo.html"> <img id="imgeditar" src="view/img/editar.png" title="editar"></a>
                &nbsp;
                &nbsp;
                &nbsp;
                <img id="imgeliminar" title="eliminar" src="view/img/eliminar.png"> </td>
            </tr>
            
            </c:forEach>
            
            
            
            
        </table>

    </main>
    
    <footer>        
        <p>© 2021 Comunidad A.M.</p> 
    </footer>
</body>
</html>
