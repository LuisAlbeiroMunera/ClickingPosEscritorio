CREATE INDEX factura_ids ON `bdfactura` (`idFactura`);
CREATE INDEX bdproductos_index ON bdproductos (`Codigo`);
CREATE INDEX bdproductos_index2 ON bdproductos (`codigoBarras`);
CREATE INDEX bdproductos_index3 ON bdproductos (`idSistema`);
CREATE INDEX bdNc_index ON bdNc (`cliente`);
CREATE INDEX bdfactura_index ON bdfactura (`cotizacion`);
CREATE INDEX bdterceros_index ON bdterceros (`idSistema`);
CREATE INDEX bdTerceros_index ON bdterceros (`Id`);
CREATE INDEX bddiscosteo_index ON bddiscosteo (`codigo`,`usuario`);
CREATE INDEX bdLogErroresDetalle_index ON bdLogErroresDetalle (`Id`);
CREATE INDEX bdConsecutivos_index ON bdConsecutivos (`Id`);
CREATE INDEX bdpreparacion_index ON bdpreparacion (congelada,idCongelada);
CREATE INDEX bdultimoponderado_index ON bdultimoponderado (producto);

ALTER TABLE `configuracion` ADD COLUMN `responsableIva` TINYINT(1) DEFAULT 0;

/*!50001 ALTER ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `anulacion` AS  SELECT  `bdfactura`.`idFactura`        AS `idFactura`, CAST(SUBSTR(`bdfactura`.`idFactura`,6,100) AS SIGNED) AS `ordenId`, `bdfactura`.`cliente`          AS `cliente`, `bdfactura`.`vendedor`         AS `vendedor`, `bdfactura`.`red`              AS `red`, `bdfactura`.`fechaFactura`     AS `fechaFactura`, `bdfactura`.`fechaVencimiento` AS `fechaVencimiento`, `bdfactura`.`efectivoGeneral`  AS `efectivoGeneral`, `bdfactura`.`ncGeneral`        AS `ncGeneral`, `bdfactura`.`chequeGeneral`    AS `chequeGeneral`, `bdfactura`.`targetaGeneral`   AS `targetaGeneral`, `bdfactura`.`totalGeneral`     AS `totalGeneral`, `bdfactura`.`descuentoGeneral` AS `descuentoGeneral`, `bdfactura`.`ivaGeneral`       AS `ivaGeneral`, `bdfactura`.`subtotalGeneral`  AS `subtotalGeneral`, `bdfactura`.`comprobante`      AS `comprobante`, `bdfactura`.`cotizacion`       AS `cotizacion`, `bdfactura`.`anulada`          AS `anulada`, `bdfactura`.`anula`            AS `anula`, `bdfactura`.`credito`          AS `credito`, `bdfactura`.`cxc`              AS `cxc`, `bdfactura`.`usuario`          AS `usuario`, `bdfactura`.`rtIva`            AS `rtIva`, `bdfactura`.`rtIca`            AS `rtIca`, `bdfactura`.`rtFuente`         AS `rtFuente`, `bdfactura`.`otros`            AS `otros`, `bdfactura`.`observacion`      AS `observacion`, `bdfactura`.`anulada1`         AS `anulada1`, `bdfactura`.`anula1`           AS `anula1`, `bdfactura`.`credito1`         AS `credito1`, `bdfactura`.`cxc1`             AS `cxc1`, `bdfactura`.`usuario1`         AS `usuario1`, `bdfactura`.`fechaAlerta`      AS `fechaAlerta`, `bdfactura`.`terminal`         AS `terminal`, `bdfactura`.`estadoGeneral`    AS `estadoGeneral`, `bdfactura`.`estado2`          AS `estado2`, `bdfactura`.`devuelta`         AS `devuelta`, `bdfactura`.`factura`          AS `factura`, `bdfactura`.`resolucion`       AS `resolucion`, `bdfactura`.`fechaAnulacion`   AS `fechaAnulacion`, `bdfactura`.`cuadreAnulacion`  AS `cuadreAnulacion`, `bdfactura`.`usuarioAnula`     AS `usuarioAnula`, `bdfactura`.`copago`           AS `copago`, `bdfactura`.`placa`            AS `placa`, `bdfactura`.`garantia`         AS `garantia`, `bdfactura`.`diasGarantia`     AS `diasGarantia`, `bdfactura`.`rango`            AS `rango`, `bdfactura`.`terminos`         AS `terminos`, `bdfactura`.`notaAnulacion`    AS `notaAnulacion`, `bdfactura`.`conseMesa`        AS `conseMesa`, `bdfactura`.`producto`         AS `producto`, `bdfactura`.`lista`            AS `lista`, `bdfactura`.`cantidad`         AS `cantidad`, `bdfactura`.`descuento`        AS `descuento`, `bdfactura`.`total`            AS `total`, `bdfactura`.`iva`              AS `iva`, `bdfactura`.`subtotal`         AS `subtotal`, `bdfactura`.`NC`               AS `NC`, `bdfactura`.`utilidad`         AS `utilidad`, `bdfactura`.`concepto`         AS `concepto`, `bdfactura`.`porcDescuento`    AS `porcDescuento`, `bdfactura`.`descripcion`      AS `descripcion`, `bdfactura`.`plu`              AS `plu`, `bdfactura`.`cant2`            AS `cant2`, `bdfactura`.`estado`           AS `estado`, `bdfactura`.`porcIva`          AS `porcIva`, `bdfactura`.`tercero`          AS `tercero`, `bdfactura`.`utilidad1`        AS `utilidad1`, `bdterceros`.`nombre`          AS `nombre`, `bdterceros`.`telefono`        AS `telefono`, `bdcxc`.`plazo`                AS `plazo`, `bdterceros`.`direccion`       AS `direccion`, IF(`bdprestamo`.`cuotaInicial` IS NULL,0,`bdprestamo`.`cuotaInicial`) AS `cuotaInicial2`, `bdfactura`.`factura`          AS `id2`, (SELECT ubicacion1 FROM bdproductos WHERE `bdproductos`.`idSistema` = `bdfactura`.`producto`) AS ubicacion1,   (SELECT referencia FROM bdproductos WHERE `bdproductos`.`idSistema` = `bdfactura`.`producto`) AS referencia,   `bdfactura`.`cotizacion`       AS `documento2`, `bdfactura`.`impuesto`         AS `impuesto`, (SELECT Codigo FROM bdproductos WHERE `bdproductos`.`idSistema` = `bdfactura`.`producto`) AS Codigo, `bdterceros`.`id`              AS `IdCliente`, `bdfactura`.`imei`             AS `imei`, `bdfactura`.`hora`             AS `hora`, `bdfactura`.`bodega`           AS `bodega` FROM `bdfactura` LEFT JOIN `bdprestamo` ON (`bdfactura`.`idFactura` = `bdprestamo`.`factura`) LEFT JOIN `bdcxc` ON (`bdfactura`.`factura` = `bdcxc`.`factura2`) LEFT JOIN `bdterceros` ON (`bdfactura`.`cliente` = `bdterceros`.`idSistema`) WHERE `bdfactura`.`anulada` = 1 */;
/*!50001 ALTER ALGORITHM=UNDEFINED DEFINER=`click`@`localhost` SQL SECURITY DEFINER VIEW `facturacion` AS ( SELECT  DISTINCT  `bdfactura`.`idFactura`        AS `idFactura`, CAST(SUBSTR(`bdfactura`.`idFactura`,6,100) AS SIGNED) AS `ordenId`, `bdterceros`.`nombre`          AS `nombre`, `bdterceros`.`id`              AS `cliente`, `bdfactura`.`vendedor`         AS `vendedor`, `bdfactura`.`red`              AS `red`, `bdfactura`.`fechaVencimiento` AS `fechaVencimiento`, `bdfactura`.`efectivoGeneral`  AS `efectivoGeneral`, `bdfactura`.`ncGeneral`        AS `ncGeneral`, `bdfactura`.`chequeGeneral`    AS `chequeGeneral`, `bdfactura`.`targetaGeneral`   AS `targetaGeneral`, `bdfactura`.`totalGeneral`     AS `totalGeneral`, `bdfactura`.`descuentoGeneral` AS `descuentoGeneral`, `bdfactura`.`ivaGeneral`       AS `ivaGeneral`, `bdfactura`.`subtotalGeneral`  AS `subtotalGeneral`, `bdfactura`.`comprobante`      AS `comprobante`, `bdfactura`.`cotizacion`       AS `cotizacion`, `bdfactura`.`anulada`          AS `anulada`, `bdfactura`.`anula`            AS `anula`, `bdfactura`.`credito`          AS `credito`, `bdfactura`.`cxc`              AS `cxc`, `bdfactura`.`usuario`          AS `usuario`, `bdfactura`.`rtIva`            AS `rtIva`, `bdfactura`.`rtIca`            AS `rtIca`, `bdfactura`.`rtFuente`         AS `rtFuente`, `bdfactura`.`otros`            AS `otros`, `bdfactura`.`observacion`      AS `observacion`, `bdfactura`.`anulada1`         AS `anulada1`, `bdfactura`.`anula1`           AS `anula1`, `bdfactura`.`credito1`         AS `credito1`, `bdfactura`.`cxc1`             AS `cxc1`, `bdfactura`.`usuario1`         AS `usuario1`, `bdfactura`.`fechaAlerta`      AS `fechaAlerta`, `bdfactura`.`terminal`         AS `terminal`, `bdfactura`.`estadoGeneral`    AS `estadoGeneral`, `bdfactura`.`estado2`          AS `estado2`, `bdfactura`.`devuelta`         AS `devuelta`, `bdfactura`.`factura`          AS `factura`, `bdfactura`.`resolucion`       AS `resolucion`, `bdfactura`.`fechaAnulacion`   AS `fechaAnulacion`, `bdfactura`.`cuadreAnulacion`  AS `cuadreAnulacion`, `bdfactura`.`usuarioAnula`     AS `usuarioAnula`, `bdfactura`.`placa`            AS `placa`, `bdfactura`.`garantia`         AS `garantia`, `bdfactura`.`diasGarantia`     AS `diasGarantia`, ''                             AS `rango`, `bdfactura`.`terminos`         AS `terminos`, `bdfactura`.`notaAnulacion`    AS `notaAnulacion`, `bdfactura`.`conseMesa`        AS `conseMesa`, `bdfactura`.`factura`          AS `id2`, `bdfactura`.`copago`           AS `copago`, `bdprestamo`.`cuotaInicial`    AS `cuotaInicial2`, CAST(`bdfactura`.`fechaFactura` AS DATE) AS `fechaFactura`, `bdfactura`.`turno`            AS `turno`, `bdfactura`.`impuesto`         AS `impuesto`, `bdterceros`.`idSistema`       AS `idSistema`, CAST(`bdfactura`.`fechaFactura` AS DATE) AS `fechaFactura1`, `bdfactura`.`impoGeneral`      AS `impoconsumo`, `bdfactura`.`tarjetaCredito`   AS `tarjetaCredito`, `bdfactura`.`franquisia`       AS `franquisia`, `bdfactura`.`hora`             AS `hora`, `bdfactura`.`valorComision`    AS `valorComision`, `bdfactura`.`totalPropina`     AS `totalPropina`, `bdfactura`.`sisteCredito`     AS `sisteCredito`, `bdfactura`.`bodega`           AS `bodega`  FROM `bdfactura` LEFT JOIN `bdprestamo` ON (`bdfactura`.`idFactura` = `bdprestamo`.`factura`) LEFT JOIN `bdterceros` ON (`bdfactura`.`cliente` = `bdterceros`.`idSistema`)) */;