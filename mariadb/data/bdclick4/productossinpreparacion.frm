TYPE=VIEW
query=select `bdclick4`.`bdcomanda`.`Id` AS `Id`,`bdclick4`.`bdcomanda`.`congelada` AS `congelada`,`bdclick4`.`bdcomanda`.`factura` AS `factura`,`bdclick4`.`bdcomanda`.`pedido` AS `pedido`,`bdclick4`.`bdcomanda`.`cod` AS `cod`,`bdclick4`.`bdcomanda`.`producto` AS `producto`,`bdclick4`.`bdcomanda`.`opciones` AS `opciones`,`bdclick4`.`bdcomanda`.`ingredientes` AS `ingredientes`,`bdclick4`.`bdcomanda`.`aderezos` AS `aderezos`,`bdclick4`.`bdcomanda`.`cant` AS `cant`,`bdclick4`.`bdcomanda`.`observaciones` AS `observaciones`,`bdclick4`.`bdcomanda`.`consecutivo` AS `consecutivo` from `bdclick4`.`bdcomanda` where ((`bdclick4`.`bdcomanda`.`opciones` = \'\') and (`bdclick4`.`bdcomanda`.`ingredientes` = \'\') and (`bdclick4`.`bdcomanda`.`aderezos` = \'\') and (`bdclick4`.`bdcomanda`.`observaciones` = \'\'))
md5=0577c655c5e20f53e7af3a8ec62355cd
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:29
create-version=2
source=select `bdcomanda`.`Id` AS `Id`,`bdcomanda`.`congelada` AS `congelada`,`bdcomanda`.`factura` AS `factura`,`bdcomanda`.`pedido` AS `pedido`,`bdcomanda`.`cod` AS `cod`,`bdcomanda`.`producto` AS `producto`,`bdcomanda`.`opciones` AS `opciones`,`bdcomanda`.`ingredientes` AS `ingredientes`,`bdcomanda`.`aderezos` AS `aderezos`,`bdcomanda`.`cant` AS `cant`,`bdcomanda`.`observaciones` AS `observaciones`,`bdcomanda`.`consecutivo` AS `consecutivo` from `bdcomanda` where ((`bdcomanda`.`opciones` = \'\') and (`bdcomanda`.`ingredientes` = \'\') and (`bdcomanda`.`aderezos` = \'\') and (`bdcomanda`.`observaciones` = \'\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdcomanda`.`Id` AS `Id`,`bdclick4`.`bdcomanda`.`congelada` AS `congelada`,`bdclick4`.`bdcomanda`.`factura` AS `factura`,`bdclick4`.`bdcomanda`.`pedido` AS `pedido`,`bdclick4`.`bdcomanda`.`cod` AS `cod`,`bdclick4`.`bdcomanda`.`producto` AS `producto`,`bdclick4`.`bdcomanda`.`opciones` AS `opciones`,`bdclick4`.`bdcomanda`.`ingredientes` AS `ingredientes`,`bdclick4`.`bdcomanda`.`aderezos` AS `aderezos`,`bdclick4`.`bdcomanda`.`cant` AS `cant`,`bdclick4`.`bdcomanda`.`observaciones` AS `observaciones`,`bdclick4`.`bdcomanda`.`consecutivo` AS `consecutivo` from `bdclick4`.`bdcomanda` where ((`bdclick4`.`bdcomanda`.`opciones` = \'\') and (`bdclick4`.`bdcomanda`.`ingredientes` = \'\') and (`bdclick4`.`bdcomanda`.`aderezos` = \'\') and (`bdclick4`.`bdcomanda`.`observaciones` = \'\'))
mariadb-version=100135
