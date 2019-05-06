<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false" %>
<!DOCTYPE html>
<html title="Electro JP">
    <head>
        <title>Electro JP</title>
        <script src="https://code.jquery.com/jquery-1.10.2.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <script src="bootstrap/js/Myjs.js"></script>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">	
    </head>
    <body>
       
		<jsp:include page="templates/_NavBarView.jsp" /> 

        <div id="containerProductos" class="container-fluid text-center bg-grey">
            <h4>Inventario</h4><br>
            <div class="row text-center container-fluid">
            <c:forEach var="produc" items="${listProductos}" varStatus="tagStatus">
			    <div class="col-md-3">
                <div class="thumbnail">
                <img src="content/Images/${produc.getImagen()}" alt="diablo" width="400" height="300">
                 <p><strong>${produc.getDescripcion()}</strong></p> 
                <p>${produc.getPrecio()} &#8364;</p>
                </div>
            </div>
			</c:forEach>
            </div><br>
        </div>
		
	<jsp:include page="templates/_Footer.jsp" /> 
		
		<!-- MODAL CARRITO -->
		
		<div class="container">
		  

		  <!-- Modal -->
		  <div class="modal fade" id="myModalCarrito" role="dialog">
			<div class="modal-dialog modal-lg">
			  <div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">Su compra</h4>
				  <button type="button" class="close" data-dismiss="modal">&times;</button>
				</div>
				<div class="modal-body">
				  <p>This is a large modal.</p>
				</div>
				<div class="modal-footer">
				  <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				</div>
			  </div>
			</div>
		  </div>
		</div>
		
    </body>
</html>