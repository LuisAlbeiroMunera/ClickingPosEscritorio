TYPE=VIEW
query=select cast(substr(`bdclick5`.`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdclick5`.`bdcuadre`.`Id` AS `Id`,if(isnull(`bdclick5`.`totalescuadrecontado`.`SumaDesubtotal`),0,`bdclick5`.`totalescuadrecontado`.`SumaDesubtotal`) AS `brutoContado`,if(isnull(`bdclick5`.`totalescuadrecontado`.`SumaDetotal`),0,`bdclick5`.`totalescuadrecontado`.`SumaDetotal`) AS `netoContado`,if(isnull(`bdclick5`.`totalescuadrecontado`.`SumaDedescuentos`),0,`bdclick5`.`totalescuadrecontado`.`SumaDedescuentos`) AS `descuentosContado`,if(isnull(`bdclick5`.`totalescuadrecredito`.`SumaDesubtotal`),0,`bdclick5`.`totalescuadrecredito`.`SumaDesubtotal`) AS `brutoCredito`,if(isnull(`bdclick5`.`totalescuadrecredito`.`SumaDetotal`),0,`bdclick5`.`totalescuadrecredito`.`SumaDetotal`) AS `netoCredito`,if(isnull(`bdclick5`.`totalescuadrecredito`.`SumaDedescuentos`),0,`bdclick5`.`totalescuadrecredito`.`SumaDedescuentos`) AS `descuentosCredito`,if(isnull(`bdclick5`.`totalanulacioncuadre`.`totalAnulacionCuadre`),0,`bdclick5`.`totalanulacioncuadre`.`totalAnulacionCuadre`) AS `totalAnulacion`,`bdclick5`.`bdcuadre`.`ncRealizadas` AS `ncRealizadas`,if(isnull(`bdclick5`.`totalanulacioncuadre`.`contAnuladas`),0,`bdclick5`.`totalanulacioncuadre`.`contAnuladas`) AS `contAnuladas`,`bdclick5`.`bdcuadre`.`contNcRealizadas` AS `contNcRealizadas`,`bdclick5`.`bdcuadre`.`contContado` AS `contContado`,`bdclick5`.`bdcuadre`.`contCredito` AS `contCredito`,`bdclick5`.`bdcuadre`.`sisteCredito` AS `sisteCredito`,if(isnull(`bdclick5`.`totalescuadrecontado`.`SumaDesubtotal`),(`bdclick5`.`totalescuadrecredito`.`SumaDesubtotal` - `bdclick5`.`bdcuadre`.`ncRealizadas`),if(isnull(`bdclick5`.`totalescuadrecredito`.`SumaDesubtotal`),(`bdclick5`.`totalescuadrecontado`.`SumaDesubtotal` - `bdclick5`.`bdcuadre`.`ncRealizadas`),((`bdclick5`.`totalescuadrecontado`.`SumaDesubtotal` + `bdclick5`.`totalescuadrecredito`.`SumaDesubtotal`) - `bdclick5`.`bdcuadre`.`ncRealizadas`))) AS `brutoVenta`,if(isnull(`bdclick5`.`totalescuadrecontado`.`SumaDetotal`),(`bdclick5`.`totalescuadrecredito`.`SumaDetotal` - `bdclick5`.`bdcuadre`.`ncRealizadas`),if(isnull(`bdclick5`.`totalescuadrecredito`.`SumaDetotal`),(`bdclick5`.`totalescuadrecontado`.`SumaDetotal` - `bdclick5`.`bdcuadre`.`ncRealizadas`),((`bdclick5`.`totalescuadrecontado`.`SumaDetotal` + `bdclick5`.`totalescuadrecredito`.`SumaDetotal`) - `bdclick5`.`bdcuadre`.`ncRealizadas`))) AS `netoVenta`,if(isnull(`bdclick5`.`totalescuadrecontado`.`SumaDedescuentos`),`bdclick5`.`totalescuadrecredito`.`SumaDedescuentos`,if(isnull(`bdclick5`.`totalescuadrecredito`.`SumaDedescuentos`),`bdclick5`.`totalescuadrecontado`.`SumaDedescuentos`,(`bdclick5`.`totalescuadrecontado`.`SumaDedescuentos` + `bdclick5`.`totalescuadrecredito`.`SumaDedescuentos`))) AS `totalDescuentoVenta`,(((`bdclick5`.`bdcuadre`.`contContado` + `bdclick5`.`bdcuadre`.`contCredito`) + if(isnull(`bdclick5`.`primeroultimonc`.`contNc`),0,`bdclick5`.`primeroultimonc`.`contNc`)) + if(isnull(`bdclick5`.`totalanulacioncuadre`.`contAnuladas`),0,`bdclick5`.`totalanulacioncuadre`.`contAnuladas`)) AS `contVentas`,if(isnull(`bdclick5`.`totalescuadresepare`.`SumaDesubtotal`),0,`bdclick5`.`totalescuadresepare`.`SumaDesubtotal`) AS `brutoSepare`,if(isnull(`bdclick5`.`totalescuadresepare`.`SumaDetotal`),0,`bdclick5`.`totalescuadresepare`.`SumaDetotal`) AS `netoSepare` from (((((((`bdclick5`.`bdcuadre` left join `bdclick5`.`bdusuario` on((`bdclick5`.`bdcuadre`.`usuario` = `bdclick5`.`bdusuario`.`usuario`))) left join `bdclick5`.`ivadiscriminadocuadres` on((`bdclick5`.`ivadiscriminadocuadres`.`red` = `bdclick5`.`bdcuadre`.`Id`))) left join `bdclick5`.`primeroultimonc` on((`bdclick5`.`bdcuadre`.`Id` = `bdclick5`.`primeroultimonc`.`cuadre`))) left join `bdclick5`.`totalescuadrecontado` on((`bdclick5`.`bdcuadre`.`Id` = `bdclick5`.`totalescuadrecontado`.`red`))) left join `bdclick5`.`totalescuadrecredito` on((`bdclick5`.`bdcuadre`.`Id` = `bdclick5`.`totalescuadrecredito`.`red`))) left join `bdclick5`.`totalanulacioncuadre` on((`bdclick5`.`bdcuadre`.`Id` = `bdclick5`.`totalanulacioncuadre`.`cuadreAnulacion`))) left join `bdclick5`.`totalescuadresepare` on((`bdclick5`.`bdcuadre`.`Id` = `bdclick5`.`totalescuadresepare`.`red`))) group by cast(substr(`bdclick5`.`bdcuadre`.`Id`,8,100) as signed),`bdclick5`.`bdcuadre`.`Id`,if(isnull(`bdclick5`.`totalescuadrecontado`.`SumaDesubtotal`),0,`bdclick5`.`totalescuadrecontado`.`SumaDesubtotal`),if(isnull(`bdclick5`.`totalescuadrecontado`.`SumaDetotal`),0,`bdclick5`.`totalescuadrecontado`.`SumaDetotal`),if(isnull(`bdclick5`.`totalescuadrecontado`.`SumaDedescuentos`),0,`bdclick5`.`totalescuadrecontado`.`SumaDedescuentos`),if(isnull(`bdclick5`.`totalescuadrecredito`.`SumaDesubtotal`),0,`bdclick5`.`totalescuadrecredito`.`SumaDesubtotal`),if(isnull(`bdclick5`.`totalescuadrecredito`.`SumaDetotal`),0,`bdclick5`.`totalescuadrecredito`.`SumaDetotal`),if(isnull(`bdclick5`.`totalescuadrecredito`.`SumaDedescuentos`),0,`bdclick5`.`totalescuadrecredito`.`SumaDedescuentos`),if(isnull(`bdclick5`.`totalanulacioncuadre`.`totalAnulacionCuadre`),0,`bdclick5`.`totalanulacioncuadre`.`totalAnulacionCuadre`),`bdclick5`.`bdcuadre`.`ncRealizadas`,if(isnull(`bdclick5`.`totalanulacioncuadre`.`contAnuladas`),0,`bdclick5`.`totalanulacioncuadre`.`contAnuladas`),`bdclick5`.`bdcuadre`.`contNcRealizadas`,`bdclick5`.`bdcuadre`.`contContado`,`bdclick5`.`bdcuadre`.`contCredito`,if(isnull(`bdclick5`.`totalescuadrecontado`.`SumaDesubtotal`),(`bdclick5`.`totalescuadrecredito`.`SumaDesubtotal` - `bdclick5`.`bdcuadre`.`ncRealizadas`),if(isnull(`bdclick5`.`totalescuadrecredito`.`SumaDesubtotal`),(`bdclick5`.`totalescuadrecontado`.`SumaDesubtotal` - `bdclick5`.`bdcuadre`.`ncRealizadas`),((`bdclick5`.`totalescuadrecontado`.`SumaDesubtotal` + `bdclick5`.`totalescuadrecredito`.`SumaDesubtotal`) - `bdclick5`.`bdcuadre`.`ncRealizadas`))),if(isnull(`bdclick5`.`totalescuadrecontado`.`SumaDetotal`),(`bdclick5`.`totalescuadrecredito`.`SumaDetotal` - `bdclick5`.`bdcuadre`.`ncRealizadas`),if(isnull(`bdclick5`.`totalescuadrecredito`.`SumaDetotal`),(`bdclick5`.`totalescuadrecontado`.`SumaDetotal` - `bdclick5`.`bdcuadre`.`ncRealizadas`),((`bdclick5`.`totalescuadrecontado`.`SumaDetotal` + `bdclick5`.`totalescuadrecredito`.`SumaDetotal`) - `bdclick5`.`bdcuadre`.`ncRealizadas`))),if(isnull(`bdclick5`.`totalescuadrecontado`.`SumaDedescuentos`),`bdclick5`.`totalescuadrecredito`.`SumaDedescuentos`,if(isnull(`bdclick5`.`totalescuadrecredito`.`SumaDedescuentos`),`bdclick5`.`totalescuadrecontado`.`SumaDedescuentos`,(`bdclick5`.`totalescuadrecontado`.`SumaDedescuentos` + `bdclick5`.`totalescuadrecredito`.`SumaDedescuentos`))),(((`bdclick5`.`bdcuadre`.`contContado` + `bdclick5`.`bdcuadre`.`contCredito`) + if(isnull(`bdclick5`.`primeroultimonc`.`contNc`),0,`bdclick5`.`primeroultimonc`.`contNc`)) + if(isnull(`bdclick5`.`totalanulacioncuadre`.`contAnuladas`),0,`bdclick5`.`totalanulacioncuadre`.`contAnuladas`)),if(isnull(`bdclick5`.`totalescuadresepare`.`SumaDesubtotal`),0,`bdclick5`.`totalescuadresepare`.`SumaDesubtotal`),if(isnull(`bdclick5`.`totalescuadresepare`.`SumaDetotal`),0,`bdclick5`.`totalescuadresepare`.`SumaDetotal`) order by cast(substr(`bdclick5`.`bdcuadre`.`Id`,8,100) as signed)
md5=a0c0d119c3f08479e4df0422bdca9977
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:46
create-version=2
source=select cast(substr(`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdcuadre`.`Id` AS `Id`,if(isnull(`totalescuadrecontado`.`SumaDesubtotal`),0,`totalescuadrecontado`.`SumaDesubtotal`) AS `brutoContado`,if(isnull(`totalescuadrecontado`.`SumaDetotal`),0,`totalescuadrecontado`.`SumaDetotal`) AS `netoContado`,if(isnull(`totalescuadrecontado`.`SumaDedescuentos`),0,`totalescuadrecontado`.`SumaDedescuentos`) AS `descuentosContado`,if(isnull(`totalescuadrecredito`.`SumaDesubtotal`),0,`totalescuadrecredito`.`SumaDesubtotal`) AS `brutoCredito`,if(isnull(`totalescuadrecredito`.`SumaDetotal`),0,`totalescuadrecredito`.`SumaDetotal`) AS `netoCredito`,if(isnull(`totalescuadrecredito`.`SumaDedescuentos`),0,`totalescuadrecredito`.`SumaDedescuentos`) AS `descuentosCredito`,if(isnull(`totalanulacioncuadre`.`totalAnulacionCuadre`),0,`totalanulacioncuadre`.`totalAnulacionCuadre`) AS `totalAnulacion`,`bdcuadre`.`ncRealizadas` AS `ncRealizadas`,if(isnull(`totalanulacioncuadre`.`contAnuladas`),0,`totalanulacioncuadre`.`contAnuladas`) AS `contAnuladas`,`bdcuadre`.`contNcRealizadas` AS `contNcRealizadas`,`bdcuadre`.`contContado` AS `contContado`,`bdcuadre`.`contCredito` AS `contCredito`,`bdcuadre`.`sisteCredito` AS `sisteCredito`,if(isnull(`totalescuadrecontado`.`SumaDesubtotal`),(`totalescuadrecredito`.`SumaDesubtotal` - `bdcuadre`.`ncRealizadas`),if(isnull(`totalescuadrecredito`.`SumaDesubtotal`),(`totalescuadrecontado`.`SumaDesubtotal` - `bdcuadre`.`ncRealizadas`),((`totalescuadrecontado`.`SumaDesubtotal` + `totalescuadrecredito`.`SumaDesubtotal`) - `bdcuadre`.`ncRealizadas`))) AS `brutoVenta`,if(isnull(`totalescuadrecontado`.`SumaDetotal`),(`totalescuadrecredito`.`SumaDetotal` - `bdcuadre`.`ncRealizadas`),if(isnull(`totalescuadrecredito`.`SumaDetotal`),(`totalescuadrecontado`.`SumaDetotal` - `bdcuadre`.`ncRealizadas`),((`totalescuadrecontado`.`SumaDetotal` + `totalescuadrecredito`.`SumaDetotal`) - `bdcuadre`.`ncRealizadas`))) AS `netoVenta`,if(isnull(`totalescuadrecontado`.`SumaDedescuentos`),`totalescuadrecredito`.`SumaDedescuentos`,if(isnull(`totalescuadrecredito`.`SumaDedescuentos`),`totalescuadrecontado`.`SumaDedescuentos`,(`totalescuadrecontado`.`SumaDedescuentos` + `totalescuadrecredito`.`SumaDedescuentos`))) AS `totalDescuentoVenta`,(((`bdcuadre`.`contContado` + `bdcuadre`.`contCredito`) + if(isnull(`primeroultimonc`.`contNc`),0,`primeroultimonc`.`contNc`)) + if(isnull(`totalanulacioncuadre`.`contAnuladas`),0,`totalanulacioncuadre`.`contAnuladas`)) AS `contVentas`,if(isnull(`totalescuadresepare`.`SumaDesubtotal`),0,`totalescuadresepare`.`SumaDesubtotal`) AS `brutoSepare`,if(isnull(`totalescuadresepare`.`SumaDetotal`),0,`totalescuadresepare`.`SumaDetotal`) AS `netoSepare` from (((((((`bdcuadre` left join `bdusuario` on((`bdcuadre`.`usuario` = `bdusuario`.`usuario`))) left join `ivadiscriminadocuadres` on((`ivadiscriminadocuadres`.`red` = `bdcuadre`.`Id`))) left join `primeroultimonc` on((`bdcuadre`.`Id` = `primeroultimonc`.`cuadre`))) left join `totalescuadrecontado` on((`bdcuadre`.`Id` = `totalescuadrecontado`.`red`))) left join `totalescuadrecredito` on((`bdcuadre`.`Id` = `totalescuadrecredito`.`red`))) left join `totalanulacioncuadre` on((`bdcuadre`.`Id` = `totalanulacioncuadre`.`cuadreAnulacion`))) left join `totalescuadresepare` on((`bdcuadre`.`Id` = `totalescuadresepare`.`red`))) group by cast(substr(`bdcuadre`.`Id`,8,100) as signed),`bdcuadre`.`Id`,if(isnull(`totalescuadrecontado`.`SumaDesubtotal`),0,`totalescuadrecontado`.`SumaDesubtotal`),if(isnull(`totalescuadrecontado`.`SumaDetotal`),0,`totalescuadrecontado`.`SumaDetotal`),if(isnull(`totalescuadrecontado`.`SumaDedescuentos`),0,`totalescuadrecontado`.`SumaDedescuentos`),if(isnull(`totalescuadrecredito`.`SumaDesubtotal`),0,`totalescuadrecredito`.`SumaDesubtotal`),if(isnull(`totalescuadrecredito`.`SumaDetotal`),0,`totalescuadrecredito`.`SumaDetotal`),if(isnull(`totalescuadrecredito`.`SumaDedescuentos`),0,`totalescuadrecredito`.`SumaDedescuentos`),if(isnull(`totalanulacioncuadre`.`totalAnulacionCuadre`),0,`totalanulacioncuadre`.`totalAnulacionCuadre`),`bdcuadre`.`ncRealizadas`,if(isnull(`totalanulacioncuadre`.`contAnuladas`),0,`totalanulacioncuadre`.`contAnuladas`),`bdcuadre`.`contNcRealizadas`,`bdcuadre`.`contContado`,`bdcuadre`.`contCredito`,if(isnull(`totalescuadrecontado`.`SumaDesubtotal`),(`totalescuadrecredito`.`SumaDesubtotal` - `bdcuadre`.`ncRealizadas`),if(isnull(`totalescuadrecredito`.`SumaDesubtotal`),(`totalescuadrecontado`.`SumaDesubtotal` - `bdcuadre`.`ncRealizadas`),((`totalescuadrecontado`.`SumaDesubtotal` + `totalescuadrecredito`.`SumaDesubtotal`) - `bdcuadre`.`ncRealizadas`))),if(isnull(`totalescuadrecontado`.`SumaDetotal`),(`totalescuadrecredito`.`SumaDetotal` - `bdcuadre`.`ncRealizadas`),if(isnull(`totalescuadrecredito`.`SumaDetotal`),(`totalescuadrecontado`.`SumaDetotal` - `bdcuadre`.`ncRealizadas`),((`totalescuadrecontado`.`SumaDetotal` + `totalescuadrecredito`.`SumaDetotal`) - `bdcuadre`.`ncRealizadas`))),if(isnull(`totalescuadrecontado`.`SumaDedescuentos`),`totalescuadrecredito`.`SumaDedescuentos`,if(isnull(`totalescuadrecredito`.`SumaDedescuentos`),`totalescuadrecontado`.`SumaDedescuentos`,(`totalescuadrecontado`.`SumaDedescuentos` + `totalescuadrecredito`.`SumaDedescuentos`))),(((`bdcuadre`.`contContado` + `bdcuadre`.`contCredito`) + if(isnull(`primeroultimonc`.`contNc`),0,`primeroultimonc`.`contNc`)) + if(isnull(`totalanulacioncuadre`.`contAnuladas`),0,`totalanulacioncuadre`.`contAnuladas`)),if(isnull(`totalescuadresepare`.`SumaDesubtotal`),0,`totalescuadresepare`.`SumaDesubtotal`),if(isnull(`totalescuadresepare`.`SumaDetotal`),0,`totalescuadresepare`.`SumaDetotal`) order by cast(substr(`bdcuadre`.`Id`,8,100) as signed)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select cast(substr(`bdclick5`.`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdclick5`.`bdcuadre`.`Id` AS `Id`,if(isnull(`bdclick5`.`totalescuadrecontado`.`SumaDesubtotal`),0,`bdclick5`.`totalescuadrecontado`.`SumaDesubtotal`) AS `brutoContado`,if(isnull(`bdclick5`.`totalescuadrecontado`.`SumaDetotal`),0,`bdclick5`.`totalescuadrecontado`.`SumaDetotal`) AS `netoContado`,if(isnull(`bdclick5`.`totalescuadrecontado`.`SumaDedescuentos`),0,`bdclick5`.`totalescuadrecontado`.`SumaDedescuentos`) AS `descuentosContado`,if(isnull(`bdclick5`.`totalescuadrecredito`.`SumaDesubtotal`),0,`bdclick5`.`totalescuadrecredito`.`SumaDesubtotal`) AS `brutoCredito`,if(isnull(`bdclick5`.`totalescuadrecredito`.`SumaDetotal`),0,`bdclick5`.`totalescuadrecredito`.`SumaDetotal`) AS `netoCredito`,if(isnull(`bdclick5`.`totalescuadrecredito`.`SumaDedescuentos`),0,`bdclick5`.`totalescuadrecredito`.`SumaDedescuentos`) AS `descuentosCredito`,if(isnull(`bdclick5`.`totalanulacioncuadre`.`totalAnulacionCuadre`),0,`bdclick5`.`totalanulacioncuadre`.`totalAnulacionCuadre`) AS `totalAnulacion`,`bdclick5`.`bdcuadre`.`ncRealizadas` AS `ncRealizadas`,if(isnull(`bdclick5`.`totalanulacioncuadre`.`contAnuladas`),0,`bdclick5`.`totalanulacioncuadre`.`contAnuladas`) AS `contAnuladas`,`bdclick5`.`bdcuadre`.`contNcRealizadas` AS `contNcRealizadas`,`bdclick5`.`bdcuadre`.`contContado` AS `contContado`,`bdclick5`.`bdcuadre`.`contCredito` AS `contCredito`,`bdclick5`.`bdcuadre`.`sisteCredito` AS `sisteCredito`,if(isnull(`bdclick5`.`totalescuadrecontado`.`SumaDesubtotal`),(`bdclick5`.`totalescuadrecredito`.`SumaDesubtotal` - `bdclick5`.`bdcuadre`.`ncRealizadas`),if(isnull(`bdclick5`.`totalescuadrecredito`.`SumaDesubtotal`),(`bdclick5`.`totalescuadrecontado`.`SumaDesubtotal` - `bdclick5`.`bdcuadre`.`ncRealizadas`),((`bdclick5`.`totalescuadrecontado`.`SumaDesubtotal` + `bdclick5`.`totalescuadrecredito`.`SumaDesubtotal`) - `bdclick5`.`bdcuadre`.`ncRealizadas`))) AS `brutoVenta`,if(isnull(`bdclick5`.`totalescuadrecontado`.`SumaDetotal`),(`bdclick5`.`totalescuadrecredito`.`SumaDetotal` - `bdclick5`.`bdcuadre`.`ncRealizadas`),if(isnull(`bdclick5`.`totalescuadrecredito`.`SumaDetotal`),(`bdclick5`.`totalescuadrecontado`.`SumaDetotal` - `bdclick5`.`bdcuadre`.`ncRealizadas`),((`bdclick5`.`totalescuadrecontado`.`SumaDetotal` + `bdclick5`.`totalescuadrecredito`.`SumaDetotal`) - `bdclick5`.`bdcuadre`.`ncRealizadas`))) AS `netoVenta`,if(isnull(`bdclick5`.`totalescuadrecontado`.`SumaDedescuentos`),`bdclick5`.`totalescuadrecredito`.`SumaDedescuentos`,if(isnull(`bdclick5`.`totalescuadrecredito`.`SumaDedescuentos`),`bdclick5`.`totalescuadrecontado`.`SumaDedescuentos`,(`bdclick5`.`totalescuadrecontado`.`SumaDedescuentos` + `bdclick5`.`totalescuadrecredito`.`SumaDedescuentos`))) AS `totalDescuentoVenta`,(((`bdclick5`.`bdcuadre`.`contContado` + `bdclick5`.`bdcuadre`.`contCredito`) + if(isnull(`bdclick5`.`primeroultimonc`.`contNc`),0,`bdclick5`.`primeroultimonc`.`contNc`)) + if(isnull(`bdclick5`.`totalanulacioncuadre`.`contAnuladas`),0,`bdclick5`.`totalanulacioncuadre`.`contAnuladas`)) AS `contVentas`,if(isnull(`bdclick5`.`totalescuadresepare`.`SumaDesubtotal`),0,`bdclick5`.`totalescuadresepare`.`SumaDesubtotal`) AS `brutoSepare`,if(isnull(`bdclick5`.`totalescuadresepare`.`SumaDetotal`),0,`bdclick5`.`totalescuadresepare`.`SumaDetotal`) AS `netoSepare` from (((((((`bdclick5`.`bdcuadre` left join `bdclick5`.`bdusuario` on((`bdclick5`.`bdcuadre`.`usuario` = `bdclick5`.`bdusuario`.`usuario`))) left join `bdclick5`.`ivadiscriminadocuadres` on((`bdclick5`.`ivadiscriminadocuadres`.`red` = `bdclick5`.`bdcuadre`.`Id`))) left join `bdclick5`.`primeroultimonc` on((`bdclick5`.`bdcuadre`.`Id` = `bdclick5`.`primeroultimonc`.`cuadre`))) left join `bdclick5`.`totalescuadrecontado` on((`bdclick5`.`bdcuadre`.`Id` = `bdclick5`.`totalescuadrecontado`.`red`))) left join `bdclick5`.`totalescuadrecredito` on((`bdclick5`.`bdcuadre`.`Id` = `bdclick5`.`totalescuadrecredito`.`red`))) left join `bdclick5`.`totalanulacioncuadre` on((`bdclick5`.`bdcuadre`.`Id` = `bdclick5`.`totalanulacioncuadre`.`cuadreAnulacion`))) left join `bdclick5`.`totalescuadresepare` on((`bdclick5`.`bdcuadre`.`Id` = `bdclick5`.`totalescuadresepare`.`red`))) group by cast(substr(`bdclick5`.`bdcuadre`.`Id`,8,100) as signed),`bdclick5`.`bdcuadre`.`Id`,if(isnull(`bdclick5`.`totalescuadrecontado`.`SumaDesubtotal`),0,`bdclick5`.`totalescuadrecontado`.`SumaDesubtotal`),if(isnull(`bdclick5`.`totalescuadrecontado`.`SumaDetotal`),0,`bdclick5`.`totalescuadrecontado`.`SumaDetotal`),if(isnull(`bdclick5`.`totalescuadrecontado`.`SumaDedescuentos`),0,`bdclick5`.`totalescuadrecontado`.`SumaDedescuentos`),if(isnull(`bdclick5`.`totalescuadrecredito`.`SumaDesubtotal`),0,`bdclick5`.`totalescuadrecredito`.`SumaDesubtotal`),if(isnull(`bdclick5`.`totalescuadrecredito`.`SumaDetotal`),0,`bdclick5`.`totalescuadrecredito`.`SumaDetotal`),if(isnull(`bdclick5`.`totalescuadrecredito`.`SumaDedescuentos`),0,`bdclick5`.`totalescuadrecredito`.`SumaDedescuentos`),if(isnull(`bdclick5`.`totalanulacioncuadre`.`totalAnulacionCuadre`),0,`bdclick5`.`totalanulacioncuadre`.`totalAnulacionCuadre`),`bdclick5`.`bdcuadre`.`ncRealizadas`,if(isnull(`bdclick5`.`totalanulacioncuadre`.`contAnuladas`),0,`bdclick5`.`totalanulacioncuadre`.`contAnuladas`),`bdclick5`.`bdcuadre`.`contNcRealizadas`,`bdclick5`.`bdcuadre`.`contContado`,`bdclick5`.`bdcuadre`.`contCredito`,if(isnull(`bdclick5`.`totalescuadrecontado`.`SumaDesubtotal`),(`bdclick5`.`totalescuadrecredito`.`SumaDesubtotal` - `bdclick5`.`bdcuadre`.`ncRealizadas`),if(isnull(`bdclick5`.`totalescuadrecredito`.`SumaDesubtotal`),(`bdclick5`.`totalescuadrecontado`.`SumaDesubtotal` - `bdclick5`.`bdcuadre`.`ncRealizadas`),((`bdclick5`.`totalescuadrecontado`.`SumaDesubtotal` + `bdclick5`.`totalescuadrecredito`.`SumaDesubtotal`) - `bdclick5`.`bdcuadre`.`ncRealizadas`))),if(isnull(`bdclick5`.`totalescuadrecontado`.`SumaDetotal`),(`bdclick5`.`totalescuadrecredito`.`SumaDetotal` - `bdclick5`.`bdcuadre`.`ncRealizadas`),if(isnull(`bdclick5`.`totalescuadrecredito`.`SumaDetotal`),(`bdclick5`.`totalescuadrecontado`.`SumaDetotal` - `bdclick5`.`bdcuadre`.`ncRealizadas`),((`bdclick5`.`totalescuadrecontado`.`SumaDetotal` + `bdclick5`.`totalescuadrecredito`.`SumaDetotal`) - `bdclick5`.`bdcuadre`.`ncRealizadas`))),if(isnull(`bdclick5`.`totalescuadrecontado`.`SumaDedescuentos`),`bdclick5`.`totalescuadrecredito`.`SumaDedescuentos`,if(isnull(`bdclick5`.`totalescuadrecredito`.`SumaDedescuentos`),`bdclick5`.`totalescuadrecontado`.`SumaDedescuentos`,(`bdclick5`.`totalescuadrecontado`.`SumaDedescuentos` + `bdclick5`.`totalescuadrecredito`.`SumaDedescuentos`))),(((`bdclick5`.`bdcuadre`.`contContado` + `bdclick5`.`bdcuadre`.`contCredito`) + if(isnull(`bdclick5`.`primeroultimonc`.`contNc`),0,`bdclick5`.`primeroultimonc`.`contNc`)) + if(isnull(`bdclick5`.`totalanulacioncuadre`.`contAnuladas`),0,`bdclick5`.`totalanulacioncuadre`.`contAnuladas`)),if(isnull(`bdclick5`.`totalescuadresepare`.`SumaDesubtotal`),0,`bdclick5`.`totalescuadresepare`.`SumaDesubtotal`),if(isnull(`bdclick5`.`totalescuadresepare`.`SumaDetotal`),0,`bdclick5`.`totalescuadresepare`.`SumaDetotal`) order by cast(substr(`bdclick5`.`bdcuadre`.`Id`,8,100) as signed)
mariadb-version=100135
