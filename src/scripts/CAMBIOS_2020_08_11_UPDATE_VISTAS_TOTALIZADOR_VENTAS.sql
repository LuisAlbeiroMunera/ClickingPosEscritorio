
/*!50001 DROP VIEW IF EXISTS `totalizadoventas` */;
/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`click`@`localhost` SQL SECURITY DEFINER VIEW `totalizadoventas` AS select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdfactura`.`cantidad`),'0',`bdfactura`.`cant2`)) AS `Expr1` from (`bdproductos` left join `bdfactura` on((`bdfactura`.`producto` = `bdproductos`.`idSistema`))) where ((`bdfactura`.`bodega` = '123-22') or (`bdfactura`.`bodega` = '')) group by `bdproductos`.`idSistema` */;

/*!50001 DROP VIEW IF EXISTS `totalizadoventas1` */;
/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`click`@`localhost` SQL SECURITY DEFINER VIEW `totalizadoventas1` AS select `bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`bdfactura`.`cantidad`),'0',`bdfactura`.`cant2`)) AS `Expr1` from (`bdproductosbodega1` left join `bdfactura` on((`bdfactura`.`producto` = `bdproductosbodega1`.`idSistema`))) where (`bdfactura`.`bodega` = 'BODEGA-1') group by `bdproductosbodega1`.`idSistema` */;

/*!50001 DROP VIEW IF EXISTS `totalizadoventas2` */;
/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`click`@`localhost` SQL SECURITY DEFINER VIEW `totalizadoventas2` AS select `bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`bdfactura`.`cantidad`),'0',`bdfactura`.`cant2`)) AS `Expr1` from (`bdproductosbodega2` left join `bdfactura` on((`bdfactura`.`producto` = `bdproductosbodega2`.`idSistema`))) where (`bdfactura`.`bodega` = 'BODEGA-2') group by `bdproductosbodega2`.`idSistema` */;

/*!50001 DROP VIEW IF EXISTS `totalizadoventas3` */;
/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`click`@`localhost` SQL SECURITY DEFINER VIEW `totalizadoventas3` AS select `bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`bdfactura`.`cantidad`),'0',`bdfactura`.`cant2`)) AS `Expr1` from (`bdproductosbodega3` left join `bdfactura` on((`bdfactura`.`producto` = `bdproductosbodega3`.`idSistema`))) where (`bdfactura`.`bodega` = 'BODEGA-3') group by `bdproductosbodega3`.`idSistema` */;

/*!50001 DROP VIEW IF EXISTS `totalizadoventas4` */;
/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`click`@`localhost` SQL SECURITY DEFINER VIEW `totalizadoventas4` AS select `bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`bdfactura`.`cantidad`),'0',`bdfactura`.`cant2`)) AS `Expr1` from (`bdproductosbodega4` left join `bdfactura` on((`bdfactura`.`producto` = `bdproductosbodega4`.`idSistema`))) where (`bdfactura`.`bodega` = 'BODEGA-4') group by `bdproductosbodega4`.`idSistema` */;

/*!50001 DROP VIEW IF EXISTS `ajustesentrada` */;
/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`click`@`localhost` SQL SECURITY DEFINER VIEW `ajustesentrada` AS (select `bdtraslados`.`Id` AS `Id`,`bdtraslados`.`tipo` AS `tipo`,`bdtraslados`.`anulada` AS `anulada`,`bdtrasladosprod`.`producto` AS `producto`,`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdtrasladosprod`.`cantidad2` AS `cantidad2`,`bdtrasladosprod`.`lista` AS `lista`,`bdtrasladosprod`.`total` AS `total`,`bdtraslados`.`fecha` AS `fecha`,`bdtraslados`.`usuario` AS `usuario`,`bdtraslados`.`bodega` AS `bodega` from (`bdtraslados` left join (`bdtrasladosprod` left join `bdproductos` on((`bdtrasladosprod`.`producto` = `bdproductos`.`Codigo`))) on((`bdtraslados`.`Id` = `bdtrasladosprod`.`traslado`))) where ((`bdtraslados`.`tipo` = 'Ajustes Entrada') and (`bdtraslados`.`anulada` = 0))) */;

/*!50001 DROP VIEW IF EXISTS `ajustessalida` */;
/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`click`@`localhost` SQL SECURITY DEFINER VIEW `ajustessalida` AS (select `bdtraslados`.`Id` AS `Id`,`bdtraslados`.`tipo` AS `tipo`,`bdtraslados`.`anulada` AS `anulada`,`bdtrasladosprod`.`producto` AS `producto`,`bdtrasladosprod`.`cantidad` AS `cantidad`,`bdtrasladosprod`.`cantidad2` AS `cantidad2`,`bdtrasladosprod`.`lista` AS `lista`,`bdtrasladosprod`.`total` AS `total`,`bdtraslados`.`usuario` AS `usuario`,`bdtraslados`.`fecha` AS `fecha`,`bdtraslados`.`bodega` AS `bodega` from (`bdtraslados` left join (`bdtrasladosprod` left join `bdproductos` on((`bdtrasladosprod`.`producto` = `bdproductos`.`idSistema`))) on((`bdtraslados`.`Id` = `bdtrasladosprod`.`traslado`))) where ((`bdtraslados`.`tipo` = 'Ajuste Salida') and (`bdtraslados`.`anulada` = 0))) */;

/*!50001 DROP VIEW IF EXISTS `totalizadoajusteentrada` */;
/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`click`@`localhost` SQL SECURITY DEFINER VIEW `totalizadoajusteentrada` AS select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`ajustesentrada`.`cantidad2`),'0',`ajustesentrada`.`cantidad2`)) AS `Expr1` from (`bdproductos` left join `ajustesentrada` on((`ajustesentrada`.`producto` = `bdproductos`.`idSistema`))) where ((`ajustesentrada`.`bodega` = '123-22') or (`ajustesentrada`.`bodega` = '')) group by `bdproductos`.`idSistema` */;

/*!50001 DROP VIEW IF EXISTS `totalizadoajusteentrada1` */;
/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`click`@`localhost` SQL SECURITY DEFINER VIEW `totalizadoajusteentrada1` AS select `bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`ajustesentrada`.`cantidad2`),'0',`ajustesentrada`.`cantidad2`)) AS `Expr1` from (`bdproductosbodega1` left join `ajustesentrada` on((`ajustesentrada`.`producto` = `bdproductosbodega1`.`idSistema`))) where (`ajustesentrada`.`bodega` = 'BODEGA-1') group by `bdproductosbodega1`.`idSistema` */;

/*!50001 DROP VIEW IF EXISTS `totalizadoajusteentrada2` */;
/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`click`@`localhost` SQL SECURITY DEFINER VIEW `totalizadoajusteentrada2` AS select `bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`ajustesentrada`.`cantidad2`),'0',`ajustesentrada`.`cantidad2`)) AS `Expr1` from (`bdproductosbodega2` left join `ajustesentrada` on((`ajustesentrada`.`producto` = `bdproductosbodega2`.`idSistema`))) where (`ajustesentrada`.`bodega` = 'BODEGA-2') group by `bdproductosbodega2`.`idSistema` */;

/*!50001 DROP VIEW IF EXISTS `totalizadoajusteentrada3` */;
/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`click`@`localhost` SQL SECURITY DEFINER VIEW `totalizadoajusteentrada3` AS select `bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`ajustesentrada`.`cantidad2`),'0',`ajustesentrada`.`cantidad2`)) AS `Expr1` from (`bdproductosbodega3` left join `ajustesentrada` on((`ajustesentrada`.`producto` = `bdproductosbodega3`.`idSistema`))) where (`ajustesentrada`.`bodega` = 'BODEGA-3') group by `bdproductosbodega3`.`idSistema` */;

/*!50001 DROP VIEW IF EXISTS `totalizadoajusteentrada4` */;
/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`click`@`localhost` SQL SECURITY DEFINER VIEW `totalizadoajusteentrada4` AS select `bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`ajustesentrada`.`cantidad2`),'0',`ajustesentrada`.`cantidad2`)) AS `Expr1` from (`bdproductosbodega4` left join `ajustesentrada` on((`ajustesentrada`.`producto` = `bdproductosbodega4`.`idSistema`))) where (`ajustesentrada`.`bodega` = 'BODEGA-4') group by `bdproductosbodega4`.`idSistema` */;
