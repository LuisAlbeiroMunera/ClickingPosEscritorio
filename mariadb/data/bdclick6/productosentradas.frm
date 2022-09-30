TYPE=VIEW
query=select `bdclick6`.`bdcomanda`.`Id` AS `Id`,`bdclick6`.`bdcomanda`.`congelada` AS `congelada`,`bdclick6`.`bdcomanda`.`factura` AS `factura`,`bdclick6`.`bdcomanda`.`pedido` AS `pedido`,`bdclick6`.`bdcomanda`.`cod` AS `cod`,`bdclick6`.`bdcomanda`.`producto` AS `producto`,`bdclick6`.`bdcomanda`.`opciones` AS `opciones`,`bdclick6`.`bdcomanda`.`ingredientes` AS `ingredientes`,`bdclick6`.`bdcomanda`.`aderezos` AS `aderezos`,`bdclick6`.`bdcomanda`.`cant` AS `cant`,`bdclick6`.`bdcomanda`.`observaciones` AS `observaciones`,`bdclick6`.`bdcomanda`.`consecutivo` AS `consecutivo`,`bdclick6`.`bdproductos`.`grupo` AS `Grupo` from (`bdclick6`.`bdcomanda` left join `bdclick6`.`bdproductos` on((`bdclick6`.`bdcomanda`.`cod` = `bdclick6`.`bdproductos`.`idSistema`))) where (`bdclick6`.`bdproductos`.`grupo` = \'GRP-05\')
md5=a3cb58eecfa2ad31a99e27a47cd4e48e
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:37
create-version=2
source=select `bdcomanda`.`Id` AS `Id`,`bdcomanda`.`congelada` AS `congelada`,`bdcomanda`.`factura` AS `factura`,`bdcomanda`.`pedido` AS `pedido`,`bdcomanda`.`cod` AS `cod`,`bdcomanda`.`producto` AS `producto`,`bdcomanda`.`opciones` AS `opciones`,`bdcomanda`.`ingredientes` AS `ingredientes`,`bdcomanda`.`aderezos` AS `aderezos`,`bdcomanda`.`cant` AS `cant`,`bdcomanda`.`observaciones` AS `observaciones`,`bdcomanda`.`consecutivo` AS `consecutivo`,`bdproductos`.`grupo` AS `Grupo` from (`bdcomanda` left join `bdproductos` on((`bdcomanda`.`cod` = `bdproductos`.`idSistema`))) where (`bdproductos`.`grupo` = \'GRP-05\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdcomanda`.`Id` AS `Id`,`bdclick6`.`bdcomanda`.`congelada` AS `congelada`,`bdclick6`.`bdcomanda`.`factura` AS `factura`,`bdclick6`.`bdcomanda`.`pedido` AS `pedido`,`bdclick6`.`bdcomanda`.`cod` AS `cod`,`bdclick6`.`bdcomanda`.`producto` AS `producto`,`bdclick6`.`bdcomanda`.`opciones` AS `opciones`,`bdclick6`.`bdcomanda`.`ingredientes` AS `ingredientes`,`bdclick6`.`bdcomanda`.`aderezos` AS `aderezos`,`bdclick6`.`bdcomanda`.`cant` AS `cant`,`bdclick6`.`bdcomanda`.`observaciones` AS `observaciones`,`bdclick6`.`bdcomanda`.`consecutivo` AS `consecutivo`,`bdclick6`.`bdproductos`.`grupo` AS `Grupo` from (`bdclick6`.`bdcomanda` left join `bdclick6`.`bdproductos` on((`bdclick6`.`bdcomanda`.`cod` = `bdclick6`.`bdproductos`.`idSistema`))) where (`bdclick6`.`bdproductos`.`grupo` = \'GRP-05\')
mariadb-version=100135
