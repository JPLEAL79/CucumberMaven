Feature:  Caja de busqueda
  como usuario quiero buscar articulos en la caja de busqueda para poder comprar


  Scenario: Buscar articulo en la caja de busqueda desde la página home

    Given el usuario se encuentra en la página principal
    When  ingresa un articulo en la caja de busquedad
     And  hace click sombre la lupa
    Then  se despliega un formulario con las categorias y marcas
