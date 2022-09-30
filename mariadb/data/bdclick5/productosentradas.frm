TYPE=VIEW
query=select `bdclick5`.`bdcomanda`.`Id` AS `Id`,`bdclick5`.`bdcomanda`.`congelada` AS `congelada`,`bdclick5`.`bdcomanda`.`factura` AS `factura`,`bdclick5`.`bdcomanda`.`pedido` AS `pedido`,`bdclick5`.`bdcomanda`.`cod` AS `cod`,`bdclick5`.`bdcomanda`.`producto` AS `producto`,`bdclick5`.`bdcomanda`.`opciones` AS `opciones`,`bdclick5`.`bdcomanda`.`ingredientes` AS `ingredientes`,`bdclick5`.`bdcomanda`.`aderezos` AS `aderezos`,`bdclick5`.`bdcomanda`.`cant` AS `cant`,`bdclick5`.`bdcomanda`.`observaciones` AS `observaciones`,`bdclick5`.`bdcomanda`.`consecutivo` AS `consecutivo`,`bdclick5`.`bdproductos`.`grupo` AS `Grupo` from (`bdclick5`.`bdcomanda` left join `bdclick5`.`bdproductos` on((`bdclick5`.`bdcomanda`.`cod` = `bdclick5`.`bdproductos`.`idSistema`))) where (`bdclick5`.`bdproductos`.`grupo` = \'GRP-05\')
md5=3d068ed850d986036233f484c9fcc675
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:49
create-version=2
source=select `bdcomanda`.`Id` AS `Id`,`bdcomanda`.`congelada` AS `congelada`,`bdcomanda`.`factura` AS `factura`,`bdcomanda`.`pedido` AS `pedido`,`bdcomanda`.`cod` AS `cod`,`bdcomanda`.`producto` AS `producto`,`bdcomanda`.`opciones` AS `opciones`,`bdcomanda`.`ingredientes` AS `ingredientes`,`bdcomanda`.`aderezos` AS `aderezos`,`bdcomanda`.`cant` AS `cant`,`bdcomanda`.`observaciones` AS `observaciones`,`bdcomanda`.`consecutivo` AS `consecutivo`,`bdproductos`.`grupo` AS `Grupo` from (`bdcomanda` left join `bdproductos` on((`bdcomanda`.`cod` = `bdproductos`.`idSistema`))) where (`bdproductos`.`grupo` = \'GRP-05\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdcomanda`.`Id` AS `Id`,`bdclick5`.`bdcomanda`.`congelada` AS `congelada`,`bdclick5`.`bdcomanda`.`factura` AS `factura`,`bdclick5`.`bdcomanda`.`pedido` AS `pedido`,`bdclick5`.`bdcomanda`.`cod` AS `cod`,`bdclick5`.`bdcomanda`.`producto` AS `producto`,`bdclick5`.`bdcomanda`.`opciones` AS `opciones`,`bdclick5`.`bdcomanda`.`ingredientes` AS `ingredientes`,`bdclick5`.`bdcomanda`.`aderezos` AS `aderezos`,`bdclick5`.`bdcomanda`.`cant` AS `cant`,`bdclick5`.`bdcomanda`.`observaciones` AS `observaciones`,`bdclick5`.`bdcomanda`.`consecutivo` AS `consecutivo`,`bdclick5`.`bdproductos`.`grupo` AS `Grupo` from (`bdclick5`.`bdcomanda` left join `bdclick5`.`bdproductos` on((`bdclick5`.`bdcomanda`.`cod` = `bdclick5`.`bdproductos`.`idSistema`))) where (`bdclick5`.`bdproductos`.`grupo` = \'GRP-05\')
mariadb-version=100135
