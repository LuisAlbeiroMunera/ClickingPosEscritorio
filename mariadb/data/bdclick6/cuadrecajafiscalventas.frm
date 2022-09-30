TYPE=VIEW
query=select cast(substr(`bdclick6`.`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdclick6`.`bdcuadre`.`Id` AS `Id`,if(isnull(`bdclick6`.`totalescuadrecontado`.`SumaDesubtotal`),0,`bdclick6`.`totalescuadrecontado`.`SumaDesubtotal`) AS `brutoContado`,if(isnull(`bdclick6`.`totalescuadrecontado`.`SumaDetotal`),0,`bdclick6`.`totalescuadrecontado`.`SumaDetotal`) AS `netoContado`,if(isnull(`bdclick6`.`totalescuadrecontado`.`SumaDedescuentos`),0,`bdclick6`.`totalescuadrecontado`.`SumaDedescuentos`) AS `descuentosContado`,if(isnull(`bdclick6`.`totalescuadrecredito`.`SumaDesubtotal`),0,`bdclick6`.`totalescuadrecredito`.`SumaDesubtotal`) AS `brutoCredito`,if(isnull(`bdclick6`.`totalescuadrecredito`.`SumaDetotal`),0,`bdclick6`.`totalescuadrecredito`.`SumaDetotal`) AS `netoCredito`,if(isnull(`bdclick6`.`totalescuadrecredito`.`SumaDedescuentos`),0,`bdclick6`.`totalescuadrecredito`.`SumaDedescuentos`) AS `descuentosCredito`,if(isnull(`bdclick6`.`totalanulacioncuadre`.`totalAnulacionCuadre`),0,`bdclick6`.`totalanulacioncuadre`.`totalAnulacionCuadre`) AS `totalAnulacion`,`bdclick6`.`bdcuadre`.`ncRealizadas` AS `ncRealizadas`,if(isnull(`bdclick6`.`totalanulacioncuadre`.`contAnuladas`),0,`bdclick6`.`totalanulacioncuadre`.`contAnuladas`) AS `contAnuladas`,`bdclick6`.`bdcuadre`.`contNcRealizadas` AS `contNcRealizadas`,`bdclick6`.`bdcuadre`.`contContado` AS `contContado`,`bdclick6`.`bdcuadre`.`contCredito` AS `contCredito`,`bdclick6`.`bdcuadre`.`sisteCredito` AS `sisteCredito`,if(isnull(`bdclick6`.`totalescuadrecontado`.`SumaDesubtotal`),(`bdclick6`.`totalescuadrecredito`.`SumaDesubtotal` - `bdclick6`.`bdcuadre`.`ncRealizadas`),if(isnull(`bdclick6`.`totalescuadrecredito`.`SumaDesubtotal`),(`bdclick6`.`totalescuadrecontado`.`SumaDesubtotal` - `bdclick6`.`bdcuadre`.`ncRealizadas`),((`bdclick6`.`totalescuadrecontado`.`SumaDesubtotal` + `bdclick6`.`totalescuadrecredito`.`SumaDesubtotal`) - `bdclick6`.`bdcuadre`.`ncRealizadas`))) AS `brutoVenta`,if(isnull(`bdclick6`.`totalescuadrecontado`.`SumaDetotal`),(`bdclick6`.`totalescuadrecredito`.`SumaDetotal` - `bdclick6`.`bdcuadre`.`ncRealizadas`),if(isnull(`bdclick6`.`totalescuadrecredito`.`SumaDetotal`),(`bdclick6`.`totalescuadrecontado`.`SumaDetotal` - `bdclick6`.`bdcuadre`.`ncRealizadas`),((`bdclick6`.`totalescuadrecontado`.`SumaDetotal` + `bdclick6`.`totalescuadrecredito`.`SumaDetotal`) - `bdclick6`.`bdcuadre`.`ncRealizadas`))) AS `netoVenta`,if(isnull(`bdclick6`.`totalescuadrecontado`.`SumaDedescuentos`),`bdclick6`.`totalescuadrecredito`.`SumaDedescuentos`,if(isnull(`bdclick6`.`totalescuadrecredito`.`SumaDedescuentos`),`bdclick6`.`totalescuadrecontado`.`SumaDedescuentos`,(`bdclick6`.`totalescuadrecontado`.`SumaDedescuentos` + `bdclick6`.`totalescuadrecredito`.`SumaDedescuentos`))) AS `totalDescuentoVenta`,(((`bdclick6`.`bdcuadre`.`contContado` + `bdclick6`.`bdcuadre`.`contCredito`) + if(isnull(`bdclick6`.`primeroultimonc`.`contNc`),0,`bdclick6`.`primeroultimonc`.`contNc`)) + if(isnull(`bdclick6`.`totalanulacioncuadre`.`contAnuladas`),0,`bdclick6`.`totalanulacioncuadre`.`contAnuladas`)) AS `contVentas`,if(isnull(`bdclick6`.`totalescuadresepare`.`SumaDesubtotal`),0,`bdclick6`.`totalescuadresepare`.`SumaDesubtotal`) AS `brutoSepare`,if(isnull(`bdclick6`.`totalescuadresepare`.`SumaDetotal`),0,`bdclick6`.`totalescuadresepare`.`SumaDetotal`) AS `netoSepare` from (((((((`bdclick6`.`bdcuadre` left join `bdclick6`.`bdusuario` on((`bdclick6`.`bdcuadre`.`usuario` = `bdclick6`.`bdusuario`.`usuario`))) left join `bdclick6`.`ivadiscriminadocuadres` on((`bdclick6`.`ivadiscriminadocuadres`.`red` = `bdclick6`.`bdcuadre`.`Id`))) left join `bdclick6`.`primeroultimonc` on((`bdclick6`.`bdcuadre`.`Id` = `bdclick6`.`primeroultimonc`.`cuadre`))) left join `bdclick6`.`totalescuadrecontado` on((`bdclick6`.`bdcuadre`.`Id` = `bdclick6`.`totalescuadrecontado`.`red`))) left join `bdclick6`.`totalescuadrecredito` on((`bdclick6`.`bdcuadre`.`Id` = `bdclick6`.`totalescuadrecredito`.`red`))) left join `bdclick6`.`totalanulacioncuadre` on((`bdclick6`.`bdcuadre`.`Id` = `bdclick6`.`totalanulacioncuadre`.`cuadreAnulacion`))) left join `bdclick6`.`totalescuadresepare` on((`bdclick6`.`bdcuadre`.`Id` = `bdclick6`.`totalescuadresepare`.`red`))) group by cast(substr(`bdclick6`.`bdcuadre`.`Id`,8,100) as signed),`bdclick6`.`bdcuadre`.`Id`,if(isnull(`bdclick6`.`totalescuadrecontado`.`SumaDesubtotal`),0,`bdclick6`.`totalescuadrecontado`.`SumaDesubtotal`),if(isnull(`bdclick6`.`totalescuadrecontado`.`SumaDetotal`),0,`bdclick6`.`totalescuadrecontado`.`SumaDetotal`),if(isnull(`bdclick6`.`totalescuadrecontado`.`SumaDedescuentos`),0,`bdclick6`.`totalescuadrecontado`.`SumaDedescuentos`),if(isnull(`bdclick6`.`totalescuadrecredito`.`SumaDesubtotal`),0,`bdclick6`.`totalescuadrecredito`.`SumaDesubtotal`),if(isnull(`bdclick6`.`totalescuadrecredito`.`SumaDetotal`),0,`bdclick6`.`totalescuadrecredito`.`SumaDetotal`),if(isnull(`bdclick6`.`totalescuadrecredito`.`SumaDedescuentos`),0,`bdclick6`.`totalescuadrecredito`.`SumaDedescuentos`),if(isnull(`bdclick6`.`totalanulacioncuadre`.`totalAnulacionCuadre`),0,`bdclick6`.`totalanulacioncuadre`.`totalAnulacionCuadre`),`bdclick6`.`bdcuadre`.`ncRealizadas`,if(isnull(`bdclick6`.`totalanulacioncuadre`.`contAnuladas`),0,`bdclick6`.`totalanulacioncuadre`.`contAnuladas`),`bdclick6`.`bdcuadre`.`contNcRealizadas`,`bdclick6`.`bdcuadre`.`contContado`,`bdclick6`.`bdcuadre`.`contCredito`,if(isnull(`bdclick6`.`totalescuadrecontado`.`SumaDesubtotal`),(`bdclick6`.`totalescuadrecredito`.`SumaDesubtotal` - `bdclick6`.`bdcuadre`.`ncRealizadas`),if(isnull(`bdclick6`.`totalescuadrecredito`.`SumaDesubtotal`),(`bdclick6`.`totalescuadrecontado`.`SumaDesubtotal` - `bdclick6`.`bdcuadre`.`ncRealizadas`),((`bdclick6`.`totalescuadrecontado`.`SumaDesubtotal` + `bdclick6`.`totalescuadrecredito`.`SumaDesubtotal`) - `bdclick6`.`bdcuadre`.`ncRealizadas`))),if(isnull(`bdclick6`.`totalescuadrecontado`.`SumaDetotal`),(`bdclick6`.`totalescuadrecredito`.`SumaDetotal` - `bdclick6`.`bdcuadre`.`ncRealizadas`),if(isnull(`bdclick6`.`totalescuadrecredito`.`SumaDetotal`),(`bdclick6`.`totalescuadrecontado`.`SumaDetotal` - `bdclick6`.`bdcuadre`.`ncRealizadas`),((`bdclick6`.`totalescuadrecontado`.`SumaDetotal` + `bdclick6`.`totalescuadrecredito`.`SumaDetotal`) - `bdclick6`.`bdcuadre`.`ncRealizadas`))),if(isnull(`bdclick6`.`totalescuadrecontado`.`SumaDedescuentos`),`bdclick6`.`totalescuadrecredito`.`SumaDedescuentos`,if(isnull(`bdclick6`.`totalescuadrecredito`.`SumaDedescuentos`),`bdclick6`.`totalescuadrecontado`.`SumaDedescuentos`,(`bdclick6`.`totalescuadrecontado`.`SumaDedescuentos` + `bdclick6`.`totalescuadrecredito`.`SumaDedescuentos`))),(((`bdclick6`.`bdcuadre`.`contContado` + `bdclick6`.`bdcuadre`.`contCredito`) + if(isnull(`bdclick6`.`primeroultimonc`.`contNc`),0,`bdclick6`.`primeroultimonc`.`contNc`)) + if(isnull(`bdclick6`.`totalanulacioncuadre`.`contAnuladas`),0,`bdclick6`.`totalanulacioncuadre`.`contAnuladas`)),if(isnull(`bdclick6`.`totalescuadresepare`.`SumaDesubtotal`),0,`bdclick6`.`totalescuadresepare`.`SumaDesubtotal`),if(isnull(`bdclick6`.`totalescuadresepare`.`SumaDetotal`),0,`bdclick6`.`totalescuadresepare`.`SumaDetotal`) order by cast(substr(`bdclick6`.`bdcuadre`.`Id`,8,100) as signed)
md5=4b195e76c955aefd06d0b99bf5b785e2
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:34
create-version=2
source=select cast(substr(`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdcuadre`.`Id` AS `Id`,if(isnull(`totalescuadrecontado`.`SumaDesubtotal`),0,`totalescuadrecontado`.`SumaDesubtotal`) AS `brutoContado`,if(isnull(`totalescuadrecontado`.`SumaDetotal`),0,`totalescuadrecontado`.`SumaDetotal`) AS `netoContado`,if(isnull(`totalescuadrecontado`.`SumaDedescuentos`),0,`totalescuadrecontado`.`SumaDedescuentos`) AS `descuentosContado`,if(isnull(`totalescuadrecredito`.`SumaDesubtotal`),0,`totalescuadrecredito`.`SumaDesubtotal`) AS `brutoCredito`,if(isnull(`totalescuadrecredito`.`SumaDetotal`),0,`totalescuadrecredito`.`SumaDetotal`) AS `netoCredito`,if(isnull(`totalescuadrecredito`.`SumaDedescuentos`),0,`totalescuadrecredito`.`SumaDedescuentos`) AS `descuentosCredito`,if(isnull(`totalanulacioncuadre`.`totalAnulacionCuadre`),0,`totalanulacioncuadre`.`totalAnulacionCuadre`) AS `totalAnulacion`,`bdcuadre`.`ncRealizadas` AS `ncRealizadas`,if(isnull(`totalanulacioncuadre`.`contAnuladas`),0,`totalanulacioncuadre`.`contAnuladas`) AS `contAnuladas`,`bdcuadre`.`contNcRealizadas` AS `contNcRealizadas`,`bdcuadre`.`contContado` AS `contContado`,`bdcuadre`.`contCredito` AS `contCredito`,`bdcuadre`.`sisteCredito` AS `sisteCredito`,if(isnull(`totalescuadrecontado`.`SumaDesubtotal`),(`totalescuadrecredito`.`SumaDesubtotal` - `bdcuadre`.`ncRealizadas`),if(isnull(`totalescuadrecredito`.`SumaDesubtotal`),(`totalescuadrecontado`.`SumaDesubtotal` - `bdcuadre`.`ncRealizadas`),((`totalescuadrecontado`.`SumaDesubtotal` + `totalescuadrecredito`.`SumaDesubtotal`) - `bdcuadre`.`ncRealizadas`))) AS `brutoVenta`,if(isnull(`totalescuadrecontado`.`SumaDetotal`),(`totalescuadrecredito`.`SumaDetotal` - `bdcuadre`.`ncRealizadas`),if(isnull(`totalescuadrecredito`.`SumaDetotal`),(`totalescuadrecontado`.`SumaDetotal` - `bdcuadre`.`ncRealizadas`),((`totalescuadrecontado`.`SumaDetotal` + `totalescuadrecredito`.`SumaDetotal`) - `bdcuadre`.`ncRealizadas`))) AS `netoVenta`,if(isnull(`totalescuadrecontado`.`SumaDedescuentos`),`totalescuadrecredito`.`SumaDedescuentos`,if(isnull(`totalescuadrecredito`.`SumaDedescuentos`),`totalescuadrecontado`.`SumaDedescuentos`,(`totalescuadrecontado`.`SumaDedescuentos` + `totalescuadrecredito`.`SumaDedescuentos`))) AS `totalDescuentoVenta`,(((`bdcuadre`.`contContado` + `bdcuadre`.`contCredito`) + if(isnull(`primeroultimonc`.`contNc`),0,`primeroultimonc`.`contNc`)) + if(isnull(`totalanulacioncuadre`.`contAnuladas`),0,`totalanulacioncuadre`.`contAnuladas`)) AS `contVentas`,if(isnull(`totalescuadresepare`.`SumaDesubtotal`),0,`totalescuadresepare`.`SumaDesubtotal`) AS `brutoSepare`,if(isnull(`totalescuadresepare`.`SumaDetotal`),0,`totalescuadresepare`.`SumaDetotal`) AS `netoSepare` from (((((((`bdcuadre` left join `bdusuario` on((`bdcuadre`.`usuario` = `bdusuario`.`usuario`))) left join `ivadiscriminadocuadres` on((`ivadiscriminadocuadres`.`red` = `bdcuadre`.`Id`))) left join `primeroultimonc` on((`bdcuadre`.`Id` = `primeroultimonc`.`cuadre`))) left join `totalescuadrecontado` on((`bdcuadre`.`Id` = `totalescuadrecontado`.`red`))) left join `totalescuadrecredito` on((`bdcuadre`.`Id` = `totalescuadrecredito`.`red`))) left join `totalanulacioncuadre` on((`bdcuadre`.`Id` = `totalanulacioncuadre`.`cuadreAnulacion`))) left join `totalescuadresepare` on((`bdcuadre`.`Id` = `totalescuadresepare`.`red`))) group by cast(substr(`bdcuadre`.`Id`,8,100) as signed),`bdcuadre`.`Id`,if(isnull(`totalescuadrecontado`.`SumaDesubtotal`),0,`totalescuadrecontado`.`SumaDesubtotal`),if(isnull(`totalescuadrecontado`.`SumaDetotal`),0,`totalescuadrecontado`.`SumaDetotal`),if(isnull(`totalescuadrecontado`.`SumaDedescuentos`),0,`totalescuadrecontado`.`SumaDedescuentos`),if(isnull(`totalescuadrecredito`.`SumaDesubtotal`),0,`totalescuadrecredito`.`SumaDesubtotal`),if(isnull(`totalescuadrecredito`.`SumaDetotal`),0,`totalescuadrecredito`.`SumaDetotal`),if(isnull(`totalescuadrecredito`.`SumaDedescuentos`),0,`totalescuadrecredito`.`SumaDedescuentos`),if(isnull(`totalanulacioncuadre`.`totalAnulacionCuadre`),0,`totalanulacioncuadre`.`totalAnulacionCuadre`),`bdcuadre`.`ncRealizadas`,if(isnull(`totalanulacioncuadre`.`contAnuladas`),0,`totalanulacioncuadre`.`contAnuladas`),`bdcuadre`.`contNcRealizadas`,`bdcuadre`.`contContado`,`bdcuadre`.`contCredito`,if(isnull(`totalescuadrecontado`.`SumaDesubtotal`),(`totalescuadrecredito`.`SumaDesubtotal` - `bdcuadre`.`ncRealizadas`),if(isnull(`totalescuadrecredito`.`SumaDesubtotal`),(`totalescuadrecontado`.`SumaDesubtotal` - `bdcuadre`.`ncRealizadas`),((`totalescuadrecontado`.`SumaDesubtotal` + `totalescuadrecredito`.`SumaDesubtotal`) - `bdcuadre`.`ncRealizadas`))),if(isnull(`totalescuadrecontado`.`SumaDetotal`),(`totalescuadrecredito`.`SumaDetotal` - `bdcuadre`.`ncRealizadas`),if(isnull(`totalescuadrecredito`.`SumaDetotal`),(`totalescuadrecontado`.`SumaDetotal` - `bdcuadre`.`ncRealizadas`),((`totalescuadrecontado`.`SumaDetotal` + `totalescuadrecredito`.`SumaDetotal`) - `bdcuadre`.`ncRealizadas`))),if(isnull(`totalescuadrecontado`.`SumaDedescuentos`),`totalescuadrecredito`.`SumaDedescuentos`,if(isnull(`totalescuadrecredito`.`SumaDedescuentos`),`totalescuadrecontado`.`SumaDedescuentos`,(`totalescuadrecontado`.`SumaDedescuentos` + `totalescuadrecredito`.`SumaDedescuentos`))),(((`bdcuadre`.`contContado` + `bdcuadre`.`contCredito`) + if(isnull(`primeroultimonc`.`contNc`),0,`primeroultimonc`.`contNc`)) + if(isnull(`totalanulacioncuadre`.`contAnuladas`),0,`totalanulacioncuadre`.`contAnuladas`)),if(isnull(`totalescuadresepare`.`SumaDesubtotal`),0,`totalescuadresepare`.`SumaDesubtotal`),if(isnull(`totalescuadresepare`.`SumaDetotal`),0,`totalescuadresepare`.`SumaDetotal`) order by cast(substr(`bdcuadre`.`Id`,8,100) as signed)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select cast(substr(`bdclick6`.`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdclick6`.`bdcuadre`.`Id` AS `Id`,if(isnull(`bdclick6`.`totalescuadrecontado`.`SumaDesubtotal`),0,`bdclick6`.`totalescuadrecontado`.`SumaDesubtotal`) AS `brutoContado`,if(isnull(`bdclick6`.`totalescuadrecontado`.`SumaDetotal`),0,`bdclick6`.`totalescuadrecontado`.`SumaDetotal`) AS `netoContado`,if(isnull(`bdclick6`.`totalescuadrecontado`.`SumaDedescuentos`),0,`bdclick6`.`totalescuadrecontado`.`SumaDedescuentos`) AS `descuentosContado`,if(isnull(`bdclick6`.`totalescuadrecredito`.`SumaDesubtotal`),0,`bdclick6`.`totalescuadrecredito`.`SumaDesubtotal`) AS `brutoCredito`,if(isnull(`bdclick6`.`totalescuadrecredito`.`SumaDetotal`),0,`bdclick6`.`totalescuadrecredito`.`SumaDetotal`) AS `netoCredito`,if(isnull(`bdclick6`.`totalescuadrecredito`.`SumaDedescuentos`),0,`bdclick6`.`totalescuadrecredito`.`SumaDedescuentos`) AS `descuentosCredito`,if(isnull(`bdclick6`.`totalanulacioncuadre`.`totalAnulacionCuadre`),0,`bdclick6`.`totalanulacioncuadre`.`totalAnulacionCuadre`) AS `totalAnulacion`,`bdclick6`.`bdcuadre`.`ncRealizadas` AS `ncRealizadas`,if(isnull(`bdclick6`.`totalanulacioncuadre`.`contAnuladas`),0,`bdclick6`.`totalanulacioncuadre`.`contAnuladas`) AS `contAnuladas`,`bdclick6`.`bdcuadre`.`contNcRealizadas` AS `contNcRealizadas`,`bdclick6`.`bdcuadre`.`contContado` AS `contContado`,`bdclick6`.`bdcuadre`.`contCredito` AS `contCredito`,`bdclick6`.`bdcuadre`.`sisteCredito` AS `sisteCredito`,if(isnull(`bdclick6`.`totalescuadrecontado`.`SumaDesubtotal`),(`bdclick6`.`totalescuadrecredito`.`SumaDesubtotal` - `bdclick6`.`bdcuadre`.`ncRealizadas`),if(isnull(`bdclick6`.`totalescuadrecredito`.`SumaDesubtotal`),(`bdclick6`.`totalescuadrecontado`.`SumaDesubtotal` - `bdclick6`.`bdcuadre`.`ncRealizadas`),((`bdclick6`.`totalescuadrecontado`.`SumaDesubtotal` + `bdclick6`.`totalescuadrecredito`.`SumaDesubtotal`) - `bdclick6`.`bdcuadre`.`ncRealizadas`))) AS `brutoVenta`,if(isnull(`bdclick6`.`totalescuadrecontado`.`SumaDetotal`),(`bdclick6`.`totalescuadrecredito`.`SumaDetotal` - `bdclick6`.`bdcuadre`.`ncRealizadas`),if(isnull(`bdclick6`.`totalescuadrecredito`.`SumaDetotal`),(`bdclick6`.`totalescuadrecontado`.`SumaDetotal` - `bdclick6`.`bdcuadre`.`ncRealizadas`),((`bdclick6`.`totalescuadrecontado`.`SumaDetotal` + `bdclick6`.`totalescuadrecredito`.`SumaDetotal`) - `bdclick6`.`bdcuadre`.`ncRealizadas`))) AS `netoVenta`,if(isnull(`bdclick6`.`totalescuadrecontado`.`SumaDedescuentos`),`bdclick6`.`totalescuadrecredito`.`SumaDedescuentos`,if(isnull(`bdclick6`.`totalescuadrecredito`.`SumaDedescuentos`),`bdclick6`.`totalescuadrecontado`.`SumaDedescuentos`,(`bdclick6`.`totalescuadrecontado`.`SumaDedescuentos` + `bdclick6`.`totalescuadrecredito`.`SumaDedescuentos`))) AS `totalDescuentoVenta`,(((`bdclick6`.`bdcuadre`.`contContado` + `bdclick6`.`bdcuadre`.`contCredito`) + if(isnull(`bdclick6`.`primeroultimonc`.`contNc`),0,`bdclick6`.`primeroultimonc`.`contNc`)) + if(isnull(`bdclick6`.`totalanulacioncuadre`.`contAnuladas`),0,`bdclick6`.`totalanulacioncuadre`.`contAnuladas`)) AS `contVentas`,if(isnull(`bdclick6`.`totalescuadresepare`.`SumaDesubtotal`),0,`bdclick6`.`totalescuadresepare`.`SumaDesubtotal`) AS `brutoSepare`,if(isnull(`bdclick6`.`totalescuadresepare`.`SumaDetotal`),0,`bdclick6`.`totalescuadresepare`.`SumaDetotal`) AS `netoSepare` from (((((((`bdclick6`.`bdcuadre` left join `bdclick6`.`bdusuario` on((`bdclick6`.`bdcuadre`.`usuario` = `bdclick6`.`bdusuario`.`usuario`))) left join `bdclick6`.`ivadiscriminadocuadres` on((`bdclick6`.`ivadiscriminadocuadres`.`red` = `bdclick6`.`bdcuadre`.`Id`))) left join `bdclick6`.`primeroultimonc` on((`bdclick6`.`bdcuadre`.`Id` = `bdclick6`.`primeroultimonc`.`cuadre`))) left join `bdclick6`.`totalescuadrecontado` on((`bdclick6`.`bdcuadre`.`Id` = `bdclick6`.`totalescuadrecontado`.`red`))) left join `bdclick6`.`totalescuadrecredito` on((`bdclick6`.`bdcuadre`.`Id` = `bdclick6`.`totalescuadrecredito`.`red`))) left join `bdclick6`.`totalanulacioncuadre` on((`bdclick6`.`bdcuadre`.`Id` = `bdclick6`.`totalanulacioncuadre`.`cuadreAnulacion`))) left join `bdclick6`.`totalescuadresepare` on((`bdclick6`.`bdcuadre`.`Id` = `bdclick6`.`totalescuadresepare`.`red`))) group by cast(substr(`bdclick6`.`bdcuadre`.`Id`,8,100) as signed),`bdclick6`.`bdcuadre`.`Id`,if(isnull(`bdclick6`.`totalescuadrecontado`.`SumaDesubtotal`),0,`bdclick6`.`totalescuadrecontado`.`SumaDesubtotal`),if(isnull(`bdclick6`.`totalescuadrecontado`.`SumaDetotal`),0,`bdclick6`.`totalescuadrecontado`.`SumaDetotal`),if(isnull(`bdclick6`.`totalescuadrecontado`.`SumaDedescuentos`),0,`bdclick6`.`totalescuadrecontado`.`SumaDedescuentos`),if(isnull(`bdclick6`.`totalescuadrecredito`.`SumaDesubtotal`),0,`bdclick6`.`totalescuadrecredito`.`SumaDesubtotal`),if(isnull(`bdclick6`.`totalescuadrecredito`.`SumaDetotal`),0,`bdclick6`.`totalescuadrecredito`.`SumaDetotal`),if(isnull(`bdclick6`.`totalescuadrecredito`.`SumaDedescuentos`),0,`bdclick6`.`totalescuadrecredito`.`SumaDedescuentos`),if(isnull(`bdclick6`.`totalanulacioncuadre`.`totalAnulacionCuadre`),0,`bdclick6`.`totalanulacioncuadre`.`totalAnulacionCuadre`),`bdclick6`.`bdcuadre`.`ncRealizadas`,if(isnull(`bdclick6`.`totalanulacioncuadre`.`contAnuladas`),0,`bdclick6`.`totalanulacioncuadre`.`contAnuladas`),`bdclick6`.`bdcuadre`.`contNcRealizadas`,`bdclick6`.`bdcuadre`.`contContado`,`bdclick6`.`bdcuadre`.`contCredito`,if(isnull(`bdclick6`.`totalescuadrecontado`.`SumaDesubtotal`),(`bdclick6`.`totalescuadrecredito`.`SumaDesubtotal` - `bdclick6`.`bdcuadre`.`ncRealizadas`),if(isnull(`bdclick6`.`totalescuadrecredito`.`SumaDesubtotal`),(`bdclick6`.`totalescuadrecontado`.`SumaDesubtotal` - `bdclick6`.`bdcuadre`.`ncRealizadas`),((`bdclick6`.`totalescuadrecontado`.`SumaDesubtotal` + `bdclick6`.`totalescuadrecredito`.`SumaDesubtotal`) - `bdclick6`.`bdcuadre`.`ncRealizadas`))),if(isnull(`bdclick6`.`totalescuadrecontado`.`SumaDetotal`),(`bdclick6`.`totalescuadrecredito`.`SumaDetotal` - `bdclick6`.`bdcuadre`.`ncRealizadas`),if(isnull(`bdclick6`.`totalescuadrecredito`.`SumaDetotal`),(`bdclick6`.`totalescuadrecontado`.`SumaDetotal` - `bdclick6`.`bdcuadre`.`ncRealizadas`),((`bdclick6`.`totalescuadrecontado`.`SumaDetotal` + `bdclick6`.`totalescuadrecredito`.`SumaDetotal`) - `bdclick6`.`bdcuadre`.`ncRealizadas`))),if(isnull(`bdclick6`.`totalescuadrecontado`.`SumaDedescuentos`),`bdclick6`.`totalescuadrecredito`.`SumaDedescuentos`,if(isnull(`bdclick6`.`totalescuadrecredito`.`SumaDedescuentos`),`bdclick6`.`totalescuadrecontado`.`SumaDedescuentos`,(`bdclick6`.`totalescuadrecontado`.`SumaDedescuentos` + `bdclick6`.`totalescuadrecredito`.`SumaDedescuentos`))),(((`bdclick6`.`bdcuadre`.`contContado` + `bdclick6`.`bdcuadre`.`contCredito`) + if(isnull(`bdclick6`.`primeroultimonc`.`contNc`),0,`bdclick6`.`primeroultimonc`.`contNc`)) + if(isnull(`bdclick6`.`totalanulacioncuadre`.`contAnuladas`),0,`bdclick6`.`totalanulacioncuadre`.`contAnuladas`)),if(isnull(`bdclick6`.`totalescuadresepare`.`SumaDesubtotal`),0,`bdclick6`.`totalescuadresepare`.`SumaDesubtotal`),if(isnull(`bdclick6`.`totalescuadresepare`.`SumaDetotal`),0,`bdclick6`.`totalescuadresepare`.`SumaDetotal`) order by cast(substr(`bdclick6`.`bdcuadre`.`Id`,8,100) as signed)
mariadb-version=100135