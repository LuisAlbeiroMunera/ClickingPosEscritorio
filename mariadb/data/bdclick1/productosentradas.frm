TYPE=VIEW
query=select `bdclick1`.`bdcomanda`.`Id` AS `Id`,`bdclick1`.`bdcomanda`.`congelada` AS `congelada`,`bdclick1`.`bdcomanda`.`factura` AS `factura`,`bdclick1`.`bdcomanda`.`pedido` AS `pedido`,`bdclick1`.`bdcomanda`.`cod` AS `cod`,`bdclick1`.`bdcomanda`.`producto` AS `producto`,`bdclick1`.`bdcomanda`.`opciones` AS `opciones`,`bdclick1`.`bdcomanda`.`ingredientes` AS `ingredientes`,`bdclick1`.`bdcomanda`.`aderezos` AS `aderezos`,`bdclick1`.`bdcomanda`.`cant` AS `cant`,`bdclick1`.`bdcomanda`.`observaciones` AS `observaciones`,`bdclick1`.`bdcomanda`.`consecutivo` AS `consecutivo`,`bdclick1`.`bdproductos`.`grupo` AS `Grupo` from (`bdclick1`.`bdcomanda` left join `bdclick1`.`bdproductos` on((`bdclick1`.`bdcomanda`.`cod` = `bdclick1`.`bdproductos`.`idSistema`))) where (`bdclick1`.`bdproductos`.`grupo` = \'GRP-05\')
md5=5fd67e63929ca64f131049b523f1da67
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:36
create-version=2
source=select `bdcomanda`.`Id` AS `Id`,`bdcomanda`.`congelada` AS `congelada`,`bdcomanda`.`factura` AS `factura`,`bdcomanda`.`pedido` AS `pedido`,`bdcomanda`.`cod` AS `cod`,`bdcomanda`.`producto` AS `producto`,`bdcomanda`.`opciones` AS `opciones`,`bdcomanda`.`ingredientes` AS `ingredientes`,`bdcomanda`.`aderezos` AS `aderezos`,`bdcomanda`.`cant` AS `cant`,`bdcomanda`.`observaciones` AS `observaciones`,`bdcomanda`.`consecutivo` AS `consecutivo`,`bdproductos`.`grupo` AS `Grupo` from (`bdcomanda` left join `bdproductos` on((`bdcomanda`.`cod` = `bdproductos`.`idSistema`))) where (`bdproductos`.`grupo` = \'GRP-05\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdcomanda`.`Id` AS `Id`,`bdclick1`.`bdcomanda`.`congelada` AS `congelada`,`bdclick1`.`bdcomanda`.`factura` AS `factura`,`bdclick1`.`bdcomanda`.`pedido` AS `pedido`,`bdclick1`.`bdcomanda`.`cod` AS `cod`,`bdclick1`.`bdcomanda`.`producto` AS `producto`,`bdclick1`.`bdcomanda`.`opciones` AS `opciones`,`bdclick1`.`bdcomanda`.`ingredientes` AS `ingredientes`,`bdclick1`.`bdcomanda`.`aderezos` AS `aderezos`,`bdclick1`.`bdcomanda`.`cant` AS `cant`,`bdclick1`.`bdcomanda`.`observaciones` AS `observaciones`,`bdclick1`.`bdcomanda`.`consecutivo` AS `consecutivo`,`bdclick1`.`bdproductos`.`grupo` AS `Grupo` from (`bdclick1`.`bdcomanda` left join `bdclick1`.`bdproductos` on((`bdclick1`.`bdcomanda`.`cod` = `bdclick1`.`bdproductos`.`idSistema`))) where (`bdclick1`.`bdproductos`.`grupo` = \'GRP-05\')
mariadb-version=100135
