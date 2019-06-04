<!DOCTYPE html><html lang="es"><head>
    <meta charset="UTF-8">
    <title>Login&lt;&gt;Registro/Alta</title>
    <style>
        body {
            margin: 0;
            padding: 0;
        }
    </style>
<link rel="stylesheet" type="text/css" href="bootstrap/css/compiled-4.8.1.min.css"><style></style></head>
<body>


<div class="mask rgba-black-strong h-100">
  <div class="container py-5">
    <div class="row">
      <div class="col-xl-5 col-lg-6 col-md-10 col-sm-12 mx-auto">

        
        <!-- Rotating card -->
        <div class="card-wrapper">
          <div id="my-card" class="card card-rotating text-center">

            <!-- Front Side -->
            <div class="face front">
              <div class="card-body">

                <!-- Header -->
                <div class="form-header primary-color">
                  <h3 class="font-weight-500 my-2 py-1"><i class="fas">
                  <img src="content/Icons/glyph/svg/si-glyph-person-people.svg" height="30" width="30" />
                  </i> Iniciar sesi�n</h3>
                </div>

                <!-- Login Form -->
                <div class="md-form">
                  <i class="fas fa-envelope prefix grey-text d-flex"></i>
                  <input type="text" id="email" name="email" class="form-control">
                  <label for="email" class="d-flex">Su email</label>
                </div>

                <div class="md-form">
                  <i class="fas fa-lock prefix grey-text d-flex"></i>
                  <input type="password" id="password" name="password" class="form-control">
                  <label for="password" class="d-flex">Su contrase�a</label>
                </div>

                <div class="d-flex justify-content-between">
                  <!-- Triggering button -->
                  <a class="rotate-btn text-primary" tabindex="-1" data-card="my-card">crear cuenta nueva</a>
                  <a href="javascript:alert('Rasca y sigue buscando');" class="grey-text" tabindex="-2">�clave olvidada?</a>
                </div>
                <div class="text-center">
                  <button class="btn primary-color white-text btn-lg">Entrar</button>
                </div>
                <!-- Login Form -->

              </div>
            </div>
            <!-- Front Side -->

            <!-- Back Side -->
            <div class="face back">
              <div class="card-body">

                <!-- Header -->
                <div class="form-header primary-color">
                  <h3 class="font-weight-500 my-2 py-1"><i class="fas">
                  <img src="content/Icons/glyph/svg/si-glyph-person-people.svg" height="30" width="30" />
                  </i> Crear Nueva Cuenta</h3>
                </div>
                
                <!-- Register Form-->
                <div class="md-form">
                
                  <i class="fas fa-envelope prefix grey-text d-flex"></i>
                  <input type="text" id="email" name="email" class="form-control">
                  <label for="email" class="d-flex">Su email</label>
                </div>

                <div class="md-form">
                  <i class="fas fa-lock prefix grey-text d-flex"></i>
                  <input type="password" id="password" name="password" class="form-control">
                  <label for="password" class="d-flex">Su clave</label>
                </div>
                <div class="md-form">
                  <i class="fas fa-lock prefix grey-text d-flex"></i>
                  <input type="password" id="password2" name="password2" class="form-control">
                  <label for="password2" class="d-flex">Confirme clave</label>
                </div>

                <div class="d-flex justify-content-end">
                  <!-- Triggering button -->
                  <a class="rotate-btn text-primary" data-card="my-card" tabindex="-3">iniciar sesi�n</a>
                </div>

                <div class="text-center">
                  <button class="btn primary-color white-text btn-lg">Crear cuenta</button>
                </div>
                <!-- Register Form-->

              </div>
            </div>
            <!-- Back Side -->

          </div>
        </div>
        <!-- Rotating card -->

        
      </div>
    </div>
  </div>
</div><script src="bootstrap/js/compiled-4.8.1.min.js"></script><script></script></body></html>