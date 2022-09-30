TYPE=VIEW
query=select `bdclick6`.`bdcomanda`.`Id` AS `Id`,`bdclick6`.`bdcomanda`.`congelada` AS `congelada`,`bdclick6`.`bdcomanda`.`factura` AS `factura`,`bdclick6`.`bdcomanda`.`pedido` AS `pedido`,`bdclick6`.`bdcomanda`.`cod` AS `cod`,`bdclick6`.`bdcomanda`.`producto` AS `producto`,`bdclick6`.`bdcomanda`.`opciones` AS `opciones`,`bdclick6`.`bdcomanda`.`ingredientes` AS `ingredientes`,`bdclick6`.`bdcomanda`.`aderezos` AS `aderezos`,`bdclick6`.`bdcomanda`.`cant` AS `cant`,`bdclick6`.`bdcomanda`.`observaciones` AS `observaciones`,`bdclick6`.`bdcomanda`.`consecutivo` AS `consecutivo` from `bdclick6`.`bdcomanda` where ((`bdclick6`.`bdcomanda`.`opciones` = \'\') and (`bdclick6`.`bdcomanda`.`ingredientes` = \'\') and (`bdclick6`.`bdcomanda`.`aderezos` = \'\') and (`bdclick6`.`bdcomanda`.`observaciones` = \'\'))
md5=6355c8689e997f271506b8654f1f67cc
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:37
create-version=2
source=select `bdcomanda`.`Id` AS `Id`,`bdcomanda`.`congelada` AS `congelada`,`bdcomanda`.`factura` AS `factura`,`bdcomanda`.`pedido` AS `pedido`,`bdcomanda`.`cod` AS `cod`,`bdcomanda`.`producto` AS `producto`,`bdcomanda`.`opciones` AS `opciones`,`bdcomanda`.`ingredientes` AS `ingredientes`,`bdcomanda`.`aderezos` AS `aderezos`,`bdcomanda`.`cant` AS `cant`,`bdcomanda`.`observaciones` AS `observaciones`,`bdcomanda`.`consecutivo` AS `consecutivo` from `bdcomanda` where ((`bdcomanda`.`opciones` = \'\') and (`bdcomanda`.`ingredientes` = \'\') and (`bdcomanda`.`aderezos` = \'\') and (`bdcomanda`.`observaciones` = \'\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdcomanda`.`Id` AS `Id`,`bdclick6`.`bdcomanda`.`congelada` AS `congelada`,`bdclick6`.`bdcomanda`.`factura` AS `factura`,`bdclick6`.`bdcomanda`.`pedido` AS `pedido`,`bdclick6`.`bdcomanda`.`cod` AS `cod`,`bdclick6`.`bdcomanda`.`producto` AS `producto`,`bdclick6`.`bdcomanda`.`opciones` AS `opciones`,`bdclick6`.`bdcomanda`.`ingredientes` AS `ingredientes`,`bdclick6`.`bdcomanda`.`aderezos` AS `aderezos`,`bdclick6`.`bdcomanda`.`cant` AS `cant`,`bdclick6`.`bdcomanda`.`observaciones` AS `observaciones`,`bdclick6`.`bdcomanda`.`consecutivo` AS `consecutivo` from `bdclick6`.`bdcomanda` where ((`bdclick6`.`bdcomanda`.`opciones` = \'\') and (`bdclick6`.`bdcomanda`.`ingredientes` = \'\') and (`bdclick6`.`bdcomanda`.`aderezos` = \'\') and (`bdclick6`.`bdcomanda`.`observaciones` = \'\'))
mariadb-version=100135
