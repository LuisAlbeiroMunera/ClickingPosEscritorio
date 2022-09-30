TYPE=VIEW
query=select `bdclick2`.`bdcomanda`.`Id` AS `Id`,`bdclick2`.`bdcomanda`.`congelada` AS `congelada`,`bdclick2`.`bdcomanda`.`factura` AS `factura`,`bdclick2`.`bdcomanda`.`pedido` AS `pedido`,`bdclick2`.`bdcomanda`.`cod` AS `cod`,`bdclick2`.`bdcomanda`.`producto` AS `producto`,`bdclick2`.`bdcomanda`.`opciones` AS `opciones`,`bdclick2`.`bdcomanda`.`ingredientes` AS `ingredientes`,`bdclick2`.`bdcomanda`.`aderezos` AS `aderezos`,`bdclick2`.`bdcomanda`.`cant` AS `cant`,`bdclick2`.`bdcomanda`.`observaciones` AS `observaciones`,`bdclick2`.`bdcomanda`.`consecutivo` AS `consecutivo`,`bdclick2`.`bdproductos`.`grupo` AS `Grupo` from (`bdclick2`.`bdcomanda` left join `bdclick2`.`bdproductos` on((`bdclick2`.`bdcomanda`.`cod` = `bdclick2`.`bdproductos`.`idSistema`))) where (`bdclick2`.`bdproductos`.`grupo` = \'GRP-05\')
md5=a92f1af3010ee9429ab6c5fb6e20d887
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:47
create-version=2
source=select `bdcomanda`.`Id` AS `Id`,`bdcomanda`.`congelada` AS `congelada`,`bdcomanda`.`factura` AS `factura`,`bdcomanda`.`pedido` AS `pedido`,`bdcomanda`.`cod` AS `cod`,`bdcomanda`.`producto` AS `producto`,`bdcomanda`.`opciones` AS `opciones`,`bdcomanda`.`ingredientes` AS `ingredientes`,`bdcomanda`.`aderezos` AS `aderezos`,`bdcomanda`.`cant` AS `cant`,`bdcomanda`.`observaciones` AS `observaciones`,`bdcomanda`.`consecutivo` AS `consecutivo`,`bdproductos`.`grupo` AS `Grupo` from (`bdcomanda` left join `bdproductos` on((`bdcomanda`.`cod` = `bdproductos`.`idSistema`))) where (`bdproductos`.`grupo` = \'GRP-05\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdcomanda`.`Id` AS `Id`,`bdclick2`.`bdcomanda`.`congelada` AS `congelada`,`bdclick2`.`bdcomanda`.`factura` AS `factura`,`bdclick2`.`bdcomanda`.`pedido` AS `pedido`,`bdclick2`.`bdcomanda`.`cod` AS `cod`,`bdclick2`.`bdcomanda`.`producto` AS `producto`,`bdclick2`.`bdcomanda`.`opciones` AS `opciones`,`bdclick2`.`bdcomanda`.`ingredientes` AS `ingredientes`,`bdclick2`.`bdcomanda`.`aderezos` AS `aderezos`,`bdclick2`.`bdcomanda`.`cant` AS `cant`,`bdclick2`.`bdcomanda`.`observaciones` AS `observaciones`,`bdclick2`.`bdcomanda`.`consecutivo` AS `consecutivo`,`bdclick2`.`bdproductos`.`grupo` AS `Grupo` from (`bdclick2`.`bdcomanda` left join `bdclick2`.`bdproductos` on((`bdclick2`.`bdcomanda`.`cod` = `bdclick2`.`bdproductos`.`idSistema`))) where (`bdclick2`.`bdproductos`.`grupo` = \'GRP-05\')
mariadb-version=100135
