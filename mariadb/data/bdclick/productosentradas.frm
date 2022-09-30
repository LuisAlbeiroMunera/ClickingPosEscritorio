TYPE=VIEW
query=select `bdclick`.`bdcomanda`.`Id` AS `Id`,`bdclick`.`bdcomanda`.`congelada` AS `congelada`,`bdclick`.`bdcomanda`.`factura` AS `factura`,`bdclick`.`bdcomanda`.`pedido` AS `pedido`,`bdclick`.`bdcomanda`.`cod` AS `cod`,`bdclick`.`bdcomanda`.`producto` AS `producto`,`bdclick`.`bdcomanda`.`opciones` AS `opciones`,`bdclick`.`bdcomanda`.`ingredientes` AS `ingredientes`,`bdclick`.`bdcomanda`.`aderezos` AS `aderezos`,`bdclick`.`bdcomanda`.`cant` AS `cant`,`bdclick`.`bdcomanda`.`observaciones` AS `observaciones`,`bdclick`.`bdcomanda`.`consecutivo` AS `consecutivo`,`bdclick`.`bdproductos`.`grupo` AS `Grupo` from (`bdclick`.`bdcomanda` left join `bdclick`.`bdproductos` on((`bdclick`.`bdcomanda`.`cod` = `bdclick`.`bdproductos`.`idSistema`))) where (`bdclick`.`bdproductos`.`grupo` = \'GRP-05\')
md5=f5a7988ea689e8930424e96cf4ddba4f
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:25
create-version=2
source=select `bdcomanda`.`Id` AS `Id`,`bdcomanda`.`congelada` AS `congelada`,`bdcomanda`.`factura` AS `factura`,`bdcomanda`.`pedido` AS `pedido`,`bdcomanda`.`cod` AS `cod`,`bdcomanda`.`producto` AS `producto`,`bdcomanda`.`opciones` AS `opciones`,`bdcomanda`.`ingredientes` AS `ingredientes`,`bdcomanda`.`aderezos` AS `aderezos`,`bdcomanda`.`cant` AS `cant`,`bdcomanda`.`observaciones` AS `observaciones`,`bdcomanda`.`consecutivo` AS `consecutivo`,`bdproductos`.`grupo` AS `Grupo` from (`bdcomanda` left join `bdproductos` on((`bdcomanda`.`cod` = `bdproductos`.`idSistema`))) where (`bdproductos`.`grupo` = \'GRP-05\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdcomanda`.`Id` AS `Id`,`bdclick`.`bdcomanda`.`congelada` AS `congelada`,`bdclick`.`bdcomanda`.`factura` AS `factura`,`bdclick`.`bdcomanda`.`pedido` AS `pedido`,`bdclick`.`bdcomanda`.`cod` AS `cod`,`bdclick`.`bdcomanda`.`producto` AS `producto`,`bdclick`.`bdcomanda`.`opciones` AS `opciones`,`bdclick`.`bdcomanda`.`ingredientes` AS `ingredientes`,`bdclick`.`bdcomanda`.`aderezos` AS `aderezos`,`bdclick`.`bdcomanda`.`cant` AS `cant`,`bdclick`.`bdcomanda`.`observaciones` AS `observaciones`,`bdclick`.`bdcomanda`.`consecutivo` AS `consecutivo`,`bdclick`.`bdproductos`.`grupo` AS `Grupo` from (`bdclick`.`bdcomanda` left join `bdclick`.`bdproductos` on((`bdclick`.`bdcomanda`.`cod` = `bdclick`.`bdproductos`.`idSistema`))) where (`bdclick`.`bdproductos`.`grupo` = \'GRP-05\')
mariadb-version=100135
