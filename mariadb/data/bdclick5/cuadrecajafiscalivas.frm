TYPE=VIEW
query=select cast(substr(`bdclick5`.`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdclick5`.`bdcuadre`.`Id` AS `Id`,`bdclick5`.`ivadiscriminadocuadres`.`porcIva` AS `porcIva`,`bdclick5`.`ivadiscriminadocuadres`.`totalIvaDiscriminandoIva` AS `totalIvaDiscriminandoIva`,`bdclick5`.`ivadiscriminadocuadres`.`subTotalDiscriminadoIva` AS `subTotalDiscriminadoIva`,`bdclick5`.`ivadiscriminadocuadres`.`totalDiscriminadoIva` AS `totalDiscriminadoIva`,`bdclick5`.`totalivacuadre`.`SumaDeiva` AS `SumaDeiva`,`bdclick5`.`totalivacuadre`.`SumaDesubtotal` AS `SumaDesubtotal`,`bdclick5`.`ivadiscriminadocuadres`.`totalDescuentoDiscriminadoIva` AS `totalDescuentoDiscriminadoIva` from (`bdclick5`.`totalivacuadre` join (`bdclick5`.`bdcuadre` left join `bdclick5`.`ivadiscriminadocuadres` on((`bdclick5`.`ivadiscriminadocuadres`.`red` = `bdclick5`.`bdcuadre`.`Id`))) on((`bdclick5`.`totalivacuadre`.`red` = `bdclick5`.`bdcuadre`.`Id`))) group by cast(substr(`bdclick5`.`bdcuadre`.`Id`,8,100) as signed),`bdclick5`.`bdcuadre`.`Id`,`bdclick5`.`ivadiscriminadocuadres`.`porcIva`,`bdclick5`.`ivadiscriminadocuadres`.`totalIvaDiscriminandoIva`,`bdclick5`.`ivadiscriminadocuadres`.`subTotalDiscriminadoIva`,`bdclick5`.`ivadiscriminadocuadres`.`totalDiscriminadoIva`,`bdclick5`.`totalivacuadre`.`SumaDeiva`,`bdclick5`.`totalivacuadre`.`SumaDesubtotal` order by cast(substr(`bdclick5`.`bdcuadre`.`Id`,8,100) as signed)
md5=525942901e2d8e4a9fb8d50d35ff2f0e
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:46
create-version=2
source=select cast(substr(`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdcuadre`.`Id` AS `Id`,`ivadiscriminadocuadres`.`porcIva` AS `porcIva`,`ivadiscriminadocuadres`.`totalIvaDiscriminandoIva` AS `totalIvaDiscriminandoIva`,`ivadiscriminadocuadres`.`subTotalDiscriminadoIva` AS `subTotalDiscriminadoIva`,`ivadiscriminadocuadres`.`totalDiscriminadoIva` AS `totalDiscriminadoIva`,`totalivacuadre`.`SumaDeiva` AS `SumaDeiva`,`totalivacuadre`.`SumaDesubtotal` AS `SumaDesubtotal`,`ivadiscriminadocuadres`.`totalDescuentoDiscriminadoIva` AS `totalDescuentoDiscriminadoIva` from (`totalivacuadre` join (`bdcuadre` left join `ivadiscriminadocuadres` on((`ivadiscriminadocuadres`.`red` = `bdcuadre`.`Id`))) on((`totalivacuadre`.`red` = `bdcuadre`.`Id`))) group by cast(substr(`bdcuadre`.`Id`,8,100) as signed),`bdcuadre`.`Id`,`ivadiscriminadocuadres`.`porcIva`,`ivadiscriminadocuadres`.`totalIvaDiscriminandoIva`,`ivadiscriminadocuadres`.`subTotalDiscriminadoIva`,`ivadiscriminadocuadres`.`totalDiscriminadoIva`,`totalivacuadre`.`SumaDeiva`,`totalivacuadre`.`SumaDesubtotal` order by cast(substr(`bdcuadre`.`Id`,8,100) as signed)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select cast(substr(`bdclick5`.`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdclick5`.`bdcuadre`.`Id` AS `Id`,`bdclick5`.`ivadiscriminadocuadres`.`porcIva` AS `porcIva`,`bdclick5`.`ivadiscriminadocuadres`.`totalIvaDiscriminandoIva` AS `totalIvaDiscriminandoIva`,`bdclick5`.`ivadiscriminadocuadres`.`subTotalDiscriminadoIva` AS `subTotalDiscriminadoIva`,`bdclick5`.`ivadiscriminadocuadres`.`totalDiscriminadoIva` AS `totalDiscriminadoIva`,`bdclick5`.`totalivacuadre`.`SumaDeiva` AS `SumaDeiva`,`bdclick5`.`totalivacuadre`.`SumaDesubtotal` AS `SumaDesubtotal`,`bdclick5`.`ivadiscriminadocuadres`.`totalDescuentoDiscriminadoIva` AS `totalDescuentoDiscriminadoIva` from (`bdclick5`.`totalivacuadre` join (`bdclick5`.`bdcuadre` left join `bdclick5`.`ivadiscriminadocuadres` on((`bdclick5`.`ivadiscriminadocuadres`.`red` = `bdclick5`.`bdcuadre`.`Id`))) on((`bdclick5`.`totalivacuadre`.`red` = `bdclick5`.`bdcuadre`.`Id`))) group by cast(substr(`bdclick5`.`bdcuadre`.`Id`,8,100) as signed),`bdclick5`.`bdcuadre`.`Id`,`bdclick5`.`ivadiscriminadocuadres`.`porcIva`,`bdclick5`.`ivadiscriminadocuadres`.`totalIvaDiscriminandoIva`,`bdclick5`.`ivadiscriminadocuadres`.`subTotalDiscriminadoIva`,`bdclick5`.`ivadiscriminadocuadres`.`totalDiscriminadoIva`,`bdclick5`.`totalivacuadre`.`SumaDeiva`,`bdclick5`.`totalivacuadre`.`SumaDesubtotal` order by cast(substr(`bdclick5`.`bdcuadre`.`Id`,8,100) as signed)
mariadb-version=100135