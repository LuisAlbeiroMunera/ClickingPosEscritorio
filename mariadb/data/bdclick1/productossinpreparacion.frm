TYPE=VIEW
query=select `bdclick1`.`bdcomanda`.`Id` AS `Id`,`bdclick1`.`bdcomanda`.`congelada` AS `congelada`,`bdclick1`.`bdcomanda`.`factura` AS `factura`,`bdclick1`.`bdcomanda`.`pedido` AS `pedido`,`bdclick1`.`bdcomanda`.`cod` AS `cod`,`bdclick1`.`bdcomanda`.`producto` AS `producto`,`bdclick1`.`bdcomanda`.`opciones` AS `opciones`,`bdclick1`.`bdcomanda`.`ingredientes` AS `ingredientes`,`bdclick1`.`bdcomanda`.`aderezos` AS `aderezos`,`bdclick1`.`bdcomanda`.`cant` AS `cant`,`bdclick1`.`bdcomanda`.`observaciones` AS `observaciones`,`bdclick1`.`bdcomanda`.`consecutivo` AS `consecutivo` from `bdclick1`.`bdcomanda` where ((`bdclick1`.`bdcomanda`.`opciones` = \'\') and (`bdclick1`.`bdcomanda`.`ingredientes` = \'\') and (`bdclick1`.`bdcomanda`.`aderezos` = \'\') and (`bdclick1`.`bdcomanda`.`observaciones` = \'\'))
md5=a7f4faf19a145aea9720346734ba62a8
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:36
create-version=2
source=select `bdcomanda`.`Id` AS `Id`,`bdcomanda`.`congelada` AS `congelada`,`bdcomanda`.`factura` AS `factura`,`bdcomanda`.`pedido` AS `pedido`,`bdcomanda`.`cod` AS `cod`,`bdcomanda`.`producto` AS `producto`,`bdcomanda`.`opciones` AS `opciones`,`bdcomanda`.`ingredientes` AS `ingredientes`,`bdcomanda`.`aderezos` AS `aderezos`,`bdcomanda`.`cant` AS `cant`,`bdcomanda`.`observaciones` AS `observaciones`,`bdcomanda`.`consecutivo` AS `consecutivo` from `bdcomanda` where ((`bdcomanda`.`opciones` = \'\') and (`bdcomanda`.`ingredientes` = \'\') and (`bdcomanda`.`aderezos` = \'\') and (`bdcomanda`.`observaciones` = \'\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdcomanda`.`Id` AS `Id`,`bdclick1`.`bdcomanda`.`congelada` AS `congelada`,`bdclick1`.`bdcomanda`.`factura` AS `factura`,`bdclick1`.`bdcomanda`.`pedido` AS `pedido`,`bdclick1`.`bdcomanda`.`cod` AS `cod`,`bdclick1`.`bdcomanda`.`producto` AS `producto`,`bdclick1`.`bdcomanda`.`opciones` AS `opciones`,`bdclick1`.`bdcomanda`.`ingredientes` AS `ingredientes`,`bdclick1`.`bdcomanda`.`aderezos` AS `aderezos`,`bdclick1`.`bdcomanda`.`cant` AS `cant`,`bdclick1`.`bdcomanda`.`observaciones` AS `observaciones`,`bdclick1`.`bdcomanda`.`consecutivo` AS `consecutivo` from `bdclick1`.`bdcomanda` where ((`bdclick1`.`bdcomanda`.`opciones` = \'\') and (`bdclick1`.`bdcomanda`.`ingredientes` = \'\') and (`bdclick1`.`bdcomanda`.`aderezos` = \'\') and (`bdclick1`.`bdcomanda`.`observaciones` = \'\'))
mariadb-version=100135
