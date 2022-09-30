/*!50001 ALTER ALGORITHM=UNDEFINED DEFINER=`click`@`localhost` SQL SECURITY DEFINER VIEW `cuadrecajafiscalventas` AS select cast(substr(`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdcuadre`.`Id` AS `Id`,if(isnull(`totalescuadrecontado`.`SumaDesubtotal`),0,`totalescuadrecontado`.`SumaDesubtotal`) AS `brutoContado`,if(isnull(`totalescuadrecontado`.`SumaDetotal`),0,`totalescuadrecontado`.`SumaDetotal`) AS `netoContado`,if(isnull(`totalescuadrecontado`.`SumaDedescuentos`),0,`totalescuadrecontado`.`SumaDedescuentos`) AS `descuentosContado`,if(isnull(`totalescuadrecredito`.`SumaDesubtotal`),0,`totalescuadrecredito`.`SumaDesubtotal`) AS `brutoCredito`,if(isnull(`totalescuadrecredito`.`SumaDetotal`),0,`totalescuadrecredito`.`SumaDetotal`) AS `netoCredito`,if(isnull(`totalescuadrecredito`.`SumaDedescuentos`),0,`totalescuadrecredito`.`SumaDedescuentos`) AS `descuentosCredito`,if(isnull(`totalanulacioncuadre`.`totalAnulacionCuadre`),0,`totalanulacioncuadre`.`totalAnulacionCuadre`) AS `totalAnulacion`,`bdcuadre`.`ncRealizadas` AS `ncRealizadas`,if(isnull(`totalanulacioncuadre`.`contAnuladas`),0,`totalanulacioncuadre`.`contAnuladas`) AS `contAnuladas`,`bdcuadre`.`contNcRealizadas` AS `contNcRealizadas`,`bdcuadre`.`contContado` AS `contContado`,`bdcuadre`.`contCredito` AS `contCredito`,`bdcuadre`.`sisteCredito` AS `sisteCredito`,if(isnull(`totalescuadrecontado`.`SumaDesubtotal`),(`totalescuadrecredito`.`SumaDesubtotal` - `bdcuadre`.`ncRealizadas`),if(isnull(`totalescuadrecredito`.`SumaDesubtotal`),(`totalescuadrecontado`.`SumaDesubtotal` - `bdcuadre`.`ncRealizadas`),((`totalescuadrecontado`.`SumaDesubtotal` + `totalescuadrecredito`.`SumaDesubtotal`) - `bdcuadre`.`ncRealizadas`))) AS `brutoVenta`,if(isnull(`totalescuadrecontado`.`SumaDetotal`),(`totalescuadrecredito`.`SumaDetotal` - `bdcuadre`.`ncRealizadas`),if(isnull(`totalescuadrecredito`.`SumaDetotal`),(`totalescuadrecontado`.`SumaDetotal` - `bdcuadre`.`ncRealizadas`),((`totalescuadrecontado`.`SumaDetotal` + `totalescuadrecredito`.`SumaDetotal`) - `bdcuadre`.`ncRealizadas`))) AS `netoVenta`,if(isnull(`totalescuadrecontado`.`SumaDedescuentos`),`totalescuadrecredito`.`SumaDedescuentos`,if(isnull(`totalescuadrecredito`.`SumaDedescuentos`),`totalescuadrecontado`.`SumaDedescuentos`,(`totalescuadrecontado`.`SumaDedescuentos` + `totalescuadrecredito`.`SumaDedescuentos`))) AS `totalDescuentoVenta`,(((`bdcuadre`.`contContado` + `bdcuadre`.`contCredito`) + if(isnull(`primeroultimonc`.`contNc`),0,`primeroultimonc`.`contNc`)) + if(isnull(`totalanulacioncuadre`.`contAnuladas`),0,`totalanulacioncuadre`.`contAnuladas`)) AS `contVentas`,if(isnull(`totalescuadresepare`.`SumaDesubtotal`),0,`totalescuadresepare`.`SumaDesubtotal`) AS `brutoSepare`,if(isnull(`totalescuadresepare`.`SumaDetotal`),0,`totalescuadresepare`.`SumaDetotal`) AS `netoSepare` from (((((((`bdcuadre` left join `bdusuario` on((`bdcuadre`.`usuario` = `bdusuario`.`usuario`))) left join `ivadiscriminadocuadres` on((`ivadiscriminadocuadres`.`red` = `bdcuadre`.`Id`))) left join `primeroultimonc` on((`bdcuadre`.`Id` = `primeroultimonc`.`cuadre`))) left join `totalescuadrecontado` on((`bdcuadre`.`Id` = `totalescuadrecontado`.`red`))) left join `totalescuadrecredito` on((`bdcuadre`.`Id` = `totalescuadrecredito`.`red`))) left join `totalanulacioncuadre` on((`bdcuadre`.`Id` = `totalanulacioncuadre`.`cuadreAnulacion`))) left join `totalescuadresepare` on((`bdcuadre`.`Id` = `totalescuadresepare`.`red`))) group by cast(substr(`bdcuadre`.`Id`,8,100) as signed),`bdcuadre`.`Id`,if(isnull(`totalescuadrecontado`.`SumaDesubtotal`),0,`totalescuadrecontado`.`SumaDesubtotal`),if(isnull(`totalescuadrecontado`.`SumaDetotal`),0,`totalescuadrecontado`.`SumaDetotal`),if(isnull(`totalescuadrecontado`.`SumaDedescuentos`),0,`totalescuadrecontado`.`SumaDedescuentos`),if(isnull(`totalescuadrecredito`.`SumaDesubtotal`),0,`totalescuadrecredito`.`SumaDesubtotal`),if(isnull(`totalescuadrecredito`.`SumaDetotal`),0,`totalescuadrecredito`.`SumaDetotal`),if(isnull(`totalescuadrecredito`.`SumaDedescuentos`),0,`totalescuadrecredito`.`SumaDedescuentos`),if(isnull(`totalanulacioncuadre`.`totalAnulacionCuadre`),0,`totalanulacioncuadre`.`totalAnulacionCuadre`),`bdcuadre`.`ncRealizadas`,if(isnull(`totalanulacioncuadre`.`contAnuladas`),0,`totalanulacioncuadre`.`contAnuladas`),`bdcuadre`.`contNcRealizadas`,`bdcuadre`.`contContado`,`bdcuadre`.`contCredito`,if(isnull(`totalescuadrecontado`.`SumaDesubtotal`),(`totalescuadrecredito`.`SumaDesubtotal` - `bdcuadre`.`ncRealizadas`),if(isnull(`totalescuadrecredito`.`SumaDesubtotal`),(`totalescuadrecontado`.`SumaDesubtotal` - `bdcuadre`.`ncRealizadas`),((`totalescuadrecontado`.`SumaDesubtotal` + `totalescuadrecredito`.`SumaDesubtotal`) - `bdcuadre`.`ncRealizadas`))),if(isnull(`totalescuadrecontado`.`SumaDetotal`),(`totalescuadrecredito`.`SumaDetotal` - `bdcuadre`.`ncRealizadas`),if(isnull(`totalescuadrecredito`.`SumaDetotal`),(`totalescuadrecontado`.`SumaDetotal` - `bdcuadre`.`ncRealizadas`),((`totalescuadrecontado`.`SumaDetotal` + `totalescuadrecredito`.`SumaDetotal`) - `bdcuadre`.`ncRealizadas`))),if(isnull(`totalescuadrecontado`.`SumaDedescuentos`),`totalescuadrecredito`.`SumaDedescuentos`,if(isnull(`totalescuadrecredito`.`SumaDedescuentos`),`totalescuadrecontado`.`SumaDedescuentos`,(`totalescuadrecontado`.`SumaDedescuentos` + `totalescuadrecredito`.`SumaDedescuentos`))),(((`bdcuadre`.`contContado` + `bdcuadre`.`contCredito`) + if(isnull(`primeroultimonc`.`contNc`),0,`primeroultimonc`.`contNc`)) + if(isnull(`totalanulacioncuadre`.`contAnuladas`),0,`totalanulacioncuadre`.`contAnuladas`)),if(isnull(`totalescuadresepare`.`SumaDesubtotal`),0,`totalescuadresepare`.`SumaDesubtotal`),if(isnull(`totalescuadresepare`.`SumaDetotal`),0,`totalescuadresepare`.`SumaDetotal`) order by cast(substr(`bdcuadre`.`Id`,8,100) as signed) */;

ALTER TABLE bdPreCompra ADD COLUMN usuario VARCHAR(255);
ALTER TABLE bdCompra ADD COLUMN usuario VARCHAR(255);
ALTER TABLE bdprefacturasptm ADD COLUMN idTxExterno VARCHAR(100);

/*!50001 ALTER ALGORITHM=UNDEFINED DEFINER=`click`@`localhost` SQL SECURITY DEFINER VIEW `cuadrecajafiscalventas` AS select cast(substr(`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdcuadre`.`Id` AS `Id`,if(isnull(`totalescuadrecontado`.`SumaDesubtotal`),0,`totalescuadrecontado`.`SumaDesubtotal`) AS `brutoContado`,if(isnull(`totalescuadrecontado`.`SumaDetotal`),0,`totalescuadrecontado`.`SumaDetotal`) AS `netoContado`,if(isnull(`totalescuadrecontado`.`SumaDedescuentos`),0,`totalescuadrecontado`.`SumaDedescuentos`) AS `descuentosContado`,if(isnull(`totalescuadrecredito`.`SumaDesubtotal`),0,`totalescuadrecredito`.`SumaDesubtotal`) AS `brutoCredito`,if(isnull(`totalescuadrecredito`.`SumaDetotal`),0,`totalescuadrecredito`.`SumaDetotal`) AS `netoCredito`,if(isnull(`totalescuadrecredito`.`SumaDedescuentos`),0,`totalescuadrecredito`.`SumaDedescuentos`) AS `descuentosCredito`,if(isnull(`totalanulacioncuadre`.`totalAnulacionCuadre`),0,`totalanulacioncuadre`.`totalAnulacionCuadre`) AS `totalAnulacion`,`bdcuadre`.`ncRealizadas` AS `ncRealizadas`,if(isnull(`totalanulacioncuadre`.`contAnuladas`),0,`totalanulacioncuadre`.`contAnuladas`) AS `contAnuladas`,`bdcuadre`.`contNcRealizadas` AS `contNcRealizadas`,`bdcuadre`.`contContado` AS `contContado`,`bdcuadre`.`contCredito` AS `contCredito`,`bdcuadre`.`sisteCredito` AS `sisteCredito`,if(isnull(`totalescuadrecontado`.`SumaDesubtotal`),(`totalescuadrecredito`.`SumaDesubtotal` - `bdcuadre`.`ncRealizadas`),if(isnull(`totalescuadrecredito`.`SumaDesubtotal`),(`totalescuadrecontado`.`SumaDesubtotal` - `bdcuadre`.`ncRealizadas`),((`totalescuadrecontado`.`SumaDesubtotal` + `totalescuadrecredito`.`SumaDesubtotal`) - `bdcuadre`.`ncRealizadas`))) AS `brutoVenta`,if(isnull(`totalescuadrecontado`.`SumaDetotal`),(`totalescuadrecredito`.`SumaDetotal` - `bdcuadre`.`ncRealizadas`),if(isnull(`totalescuadrecredito`.`SumaDetotal`),(`totalescuadrecontado`.`SumaDetotal` - `bdcuadre`.`ncRealizadas`),((`totalescuadrecontado`.`SumaDetotal` + `totalescuadrecredito`.`SumaDetotal`) - `bdcuadre`.`ncRealizadas`))) AS `netoVenta`,if(isnull(`totalescuadrecontado`.`SumaDedescuentos`),`totalescuadrecredito`.`SumaDedescuentos`,if(isnull(`totalescuadrecredito`.`SumaDedescuentos`),`totalescuadrecontado`.`SumaDedescuentos`,(`totalescuadrecontado`.`SumaDedescuentos` + `totalescuadrecredito`.`SumaDedescuentos`))) AS `totalDescuentoVenta`,(((`bdcuadre`.`contContado` + `bdcuadre`.`contCredito`) + if(isnull(`primeroultimonc`.`contNc`),0,`primeroultimonc`.`contNc`)) + if(isnull(`totalanulacioncuadre`.`contAnuladas`),0,`totalanulacioncuadre`.`contAnuladas`)) AS `contVentas`,if(isnull(`totalescuadresepare`.`SumaDesubtotal`),0,`totalescuadresepare`.`SumaDesubtotal`) AS `brutoSepare`,if(isnull(`totalescuadresepare`.`SumaDetotal`),0,`totalescuadresepare`.`SumaDetotal`) AS `netoSepare` from (((((((`bdcuadre` left join `bdusuario` on((`bdcuadre`.`usuario` = `bdusuario`.`usuario`))) left join `ivadiscriminadocuadres` on((`ivadiscriminadocuadres`.`red` = `bdcuadre`.`Id`))) left join `primeroultimonc` on((`bdcuadre`.`Id` = `primeroultimonc`.`cuadre`))) left join `totalescuadrecontado` on((`bdcuadre`.`Id` = `totalescuadrecontado`.`red`))) left join `totalescuadrecredito` on((`bdcuadre`.`Id` = `totalescuadrecredito`.`red`))) left join `totalanulacioncuadre` on((`bdcuadre`.`Id` = `totalanulacioncuadre`.`cuadreAnulacion`))) left join `totalescuadresepare` on((`bdcuadre`.`Id` = `totalescuadresepare`.`red`))) group by cast(substr(`bdcuadre`.`Id`,8,100) as signed),`bdcuadre`.`Id`,if(isnull(`totalescuadrecontado`.`SumaDesubtotal`),0,`totalescuadrecontado`.`SumaDesubtotal`),if(isnull(`totalescuadrecontado`.`SumaDetotal`),0,`totalescuadrecontado`.`SumaDetotal`),if(isnull(`totalescuadrecontado`.`SumaDedescuentos`),0,`totalescuadrecontado`.`SumaDedescuentos`),if(isnull(`totalescuadrecredito`.`SumaDesubtotal`),0,`totalescuadrecredito`.`SumaDesubtotal`),if(isnull(`totalescuadrecredito`.`SumaDetotal`),0,`totalescuadrecredito`.`SumaDetotal`),if(isnull(`totalescuadrecredito`.`SumaDedescuentos`),0,`totalescuadrecredito`.`SumaDedescuentos`),if(isnull(`totalanulacioncuadre`.`totalAnulacionCuadre`),0,`totalanulacioncuadre`.`totalAnulacionCuadre`),`bdcuadre`.`ncRealizadas`,if(isnull(`totalanulacioncuadre`.`contAnuladas`),0,`totalanulacioncuadre`.`contAnuladas`),`bdcuadre`.`contNcRealizadas`,`bdcuadre`.`contContado`,`bdcuadre`.`contCredito`,if(isnull(`totalescuadrecontado`.`SumaDesubtotal`),(`totalescuadrecredito`.`SumaDesubtotal` - `bdcuadre`.`ncRealizadas`),if(isnull(`totalescuadrecredito`.`SumaDesubtotal`),(`totalescuadrecontado`.`SumaDesubtotal` - `bdcuadre`.`ncRealizadas`),((`totalescuadrecontado`.`SumaDesubtotal` + `totalescuadrecredito`.`SumaDesubtotal`) - `bdcuadre`.`ncRealizadas`))),if(isnull(`totalescuadrecontado`.`SumaDetotal`),(`totalescuadrecredito`.`SumaDetotal` - `bdcuadre`.`ncRealizadas`),if(isnull(`totalescuadrecredito`.`SumaDetotal`),(`totalescuadrecontado`.`SumaDetotal` - `bdcuadre`.`ncRealizadas`),((`totalescuadrecontado`.`SumaDetotal` + `totalescuadrecredito`.`SumaDetotal`) - `bdcuadre`.`ncRealizadas`))),if(isnull(`totalescuadrecontado`.`SumaDedescuentos`),`totalescuadrecredito`.`SumaDedescuentos`,if(isnull(`totalescuadrecredito`.`SumaDedescuentos`),`totalescuadrecontado`.`SumaDedescuentos`,(`totalescuadrecontado`.`SumaDedescuentos` + `totalescuadrecredito`.`SumaDedescuentos`))),(((`bdcuadre`.`contContado` + `bdcuadre`.`contCredito`) + if(isnull(`primeroultimonc`.`contNc`),0,`primeroultimonc`.`contNc`)) + if(isnull(`totalanulacioncuadre`.`contAnuladas`),0,`totalanulacioncuadre`.`contAnuladas`)),if(isnull(`totalescuadresepare`.`SumaDesubtotal`),0,`totalescuadresepare`.`SumaDesubtotal`),if(isnull(`totalescuadresepare`.`SumaDetotal`),0,`totalescuadresepare`.`SumaDetotal`) order by cast(substr(`bdcuadre`.`Id`,8,100) as signed) */;

ALTER TABLE bdPreCompra ADD COLUMN usuario VARCHAR(255);
ALTER TABLE bdCompra ADD COLUMN usuario VARCHAR(255);
ALTER TABLE bdprefacturasptm MODIFY COLUMN idTxExterno VARCHAR(100);

ALTER TABLE configuracion ADD COLUMN `versionSistema` VARCHAR(5) DEFAULT 0;
ALTER TABLE configuracion ADD COLUMN `facturaElectronicaPTM` INT DEFAULT 0;
ALTER TABLE configuracion ADD COLUMN `manejaPreFactura` INT DEFAULT 0;

CREATE TABLE `bdenviospos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `factura` varchar(100) NOT NULL COMMENT 'prefijo y numero de factura',
  `idExterno` varchar(300) DEFAULT NULL COMMENT 'id de la api',
  `intentos` int(11) DEFAULT 3 COMMENT 'intentos de envio',
  `json` longtext DEFAULT NULL COMMENT 'json de envio',
  `fechaRegistro` timestamp NOT NULL DEFAULT current_timestamp() COMMENT 'fecha de registro',
  `estado` varchar(1) DEFAULT '0' COMMENT '0-pendiente 1-enviada 2-error',
  PRIMARY KEY (`id`)
);

  
ALTER TABLE bdlogsfacturaapi MODIFY COLUMN mensaje LONGBLOB;
ALTER TABLE bdlogsfacturaapi MODIFY COLUMN errorApp LONGBLOB;
ALTER TABLE bdlogsfacturaapi MODIFY COLUMN errorRespuesta LONGBLOB;

/*!50001 ALTER ALGORITHM=UNDEFINED DEFINER=`click`@`localhost` SQL SECURITY DEFINER VIEW `repcartera2` AS  SELECT `reppendientes`.`factura`      AS `fact`, `reppendientes`.`tipo`         AS `tipo`, `reppendientes`.`estado`       AS `estado`, `reppendientes`.`recibo`       AS `recibo`, `reppendientes`.`plazo`        AS `plazo`, `reppendientes`.`vencimiento`  AS `vencimiento`, `reppendientes`.`cliente`      AS `cliente`, `reppendientes`.`nombre`       AS `nombre`, `reppendientes`.`fechaFactura` AS `fechaFactura`, `reppendientes`.`anulada`      AS `anulada`, IF(`repcartera`.`valor` IS NULL,`reppendientes`.`valor`,`reppendientes`.`valor` - `repcartera`.`valor`) AS `Expr1`, `reppendientes`.`vendedor`     AS `vendedor`, `reppendientes`.`factura`      AS `factura`, `reppendientes`.`terminal`     AS `terminal`, `reppendientes`.`factura2`     AS `factura2`, `reppendientes`.`valor`        AS `valor`, `reppendientes`.`telefono`     AS `telefono`, TO_DAYS(`reppendientes`.`vencimiento` ) - TO_DAYS(CAST(CURRENT_TIMESTAMP() AS DATE)) AS `edadCartera`, IF(CAST(CURRENT_TIMESTAMP() AS DATE) >= `reppendientes`.`vencimiento`,'VENCIDA','OK') AS `estadoVenc`, `reppendientes`.`turno`        AS `turno`, `reppendientes`.`placa`        AS `placa`, `reppendientes`.`direccion`    AS `direccion`, `reppendientes`.`ciudad`       AS `ciudad`, `reppendientes`.`idSistema`    AS `idSistema`, `reppendientes`.`conseMesa`    AS `conseMesa` FROM (`reppendientes` LEFT JOIN `repcartera` ON (`reppendientes`.`factura2` = `repcartera`.`fact`)) GROUP BY `reppendientes`.`factura`,`reppendientes`.`tipo`,`reppendientes`.`estado`,`reppendientes`.`recibo`,`reppendientes`.`plazo`,`reppendientes`.`vencimiento`,`reppendientes`.`cliente`,`reppendientes`.`nombre`,`reppendientes`.`fechaFactura`,`reppendientes`.`anulada`,IF(`repcartera`.`valor` IS NULL,`reppendientes`.`valor`,`reppendientes`.`valor` - `repcartera`.`valor`),`reppendientes`.`vendedor`,`reppendientes`.`terminal`,`reppendientes`.`valor`,`reppendientes`.`telefono`,`reppendientes`.`turno`,`reppendientes`.`placa`,`reppendientes`.`direccion`,`reppendientes`.`idSistema`,`reppendientes`.`conseMesa` HAVING `reppendientes`.`tipo` = 'FACT' */;


ALTER TABLE bdterceros ADD COLUMN isFacturaElectronica VARCHAR(1) COMMENT '1- no factura electronica 0- si factura null-pendiente por decision';

/*!50001 ALTER ALGORITHM=UNDEFINED DEFINER=`click`@`localhost` SQL SECURITY DEFINER VIEW `plansepareagrupado` AS select `bdplansepare`.`idFactura` AS `idFactura`,`bdplansepare`.`factura` AS `id2`,cast(substr(`bdplansepare`.`idFactura`,8,100) as signed) AS `ordenId`,`bdplansepare`.`estadoGeneral` AS `estado`,`bdplansepare`.`placa` AS `placa`,`bdplansepare`.`efectivoGeneral` AS `efectivoGeneral`,`bdplansepare`.`targetaGeneral` AS `targetaGeneral`,`bdplansepare`.`ncGeneral` AS `ncGeneral`,`bdplansepare`.`chequeGeneral` AS `chequeGeneral`,`bdplansepare`.`fechaFactura` AS `fechaFactura`,`bdplansepare`.`fechaVencimiento` AS `fechaVencimiento`,`bdplansepare`.`totalGeneral` AS `totalGeneral`,`bdplansepare`.`factura` AS `factura`,0 AS `cuotaInicial2`,`bdplansepare`.`terminal` AS `terminal`,`bdplansepare`.`anulada` AS `anulada`,`bdterceros`.`idSistema` AS `idSistema`,`bdplansepare`.`comprobante` AS `comprobante`,`bdterceros`.`id` AS `cliente`,`bdplansepare`.`usuario` AS `usuario` from (`bdplansepare` join `bdterceros` on((`bdplansepare`.`cliente` = `bdterceros`.`idSistema`))) group by `bdplansepare`.`idFactura` order by cast(substr(`bdplansepare`.`idFactura`,8,100) as signed) */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`click`@`localhost` SQL SECURITY DEFINER VIEW `gastosegresos` AS select sum(`bdegreso`.`total`) AS `SumaDetotal`,`bdegreso`.`fecha` AS `fecha`,`bdegreso`.`anulada` AS `anulada`,count(`bdegreso`.`total`) AS `contGastos`,usuario from `bdegreso` where (`bdegreso`.`estado` = 'PENDIENTE') group by `bdegreso`.`fecha`,`bdegreso`.`anulada`,`bdegreso`.`usuario` having (`bdegreso`.`anulada` = 0) */;