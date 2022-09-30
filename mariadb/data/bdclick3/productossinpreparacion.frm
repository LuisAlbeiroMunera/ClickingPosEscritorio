TYPE=VIEW
query=select `bdclick3`.`bdcomanda`.`Id` AS `Id`,`bdclick3`.`bdcomanda`.`congelada` AS `congelada`,`bdclick3`.`bdcomanda`.`factura` AS `factura`,`bdclick3`.`bdcomanda`.`pedido` AS `pedido`,`bdclick3`.`bdcomanda`.`cod` AS `cod`,`bdclick3`.`bdcomanda`.`producto` AS `producto`,`bdclick3`.`bdcomanda`.`opciones` AS `opciones`,`bdclick3`.`bdcomanda`.`ingredientes` AS `ingredientes`,`bdclick3`.`bdcomanda`.`aderezos` AS `aderezos`,`bdclick3`.`bdcomanda`.`cant` AS `cant`,`bdclick3`.`bdcomanda`.`observaciones` AS `observaciones`,`bdclick3`.`bdcomanda`.`consecutivo` AS `consecutivo` from `bdclick3`.`bdcomanda` where ((`bdclick3`.`bdcomanda`.`opciones` = \'\') and (`bdclick3`.`bdcomanda`.`ingredientes` = \'\') and (`bdclick3`.`bdcomanda`.`aderezos` = \'\') and (`bdclick3`.`bdcomanda`.`observaciones` = \'\'))
md5=2d5d76f61c342d1cbb120d62dfcfe164
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:52
create-version=2
source=select `bdcomanda`.`Id` AS `Id`,`bdcomanda`.`congelada` AS `congelada`,`bdcomanda`.`factura` AS `factura`,`bdcomanda`.`pedido` AS `pedido`,`bdcomanda`.`cod` AS `cod`,`bdcomanda`.`producto` AS `producto`,`bdcomanda`.`opciones` AS `opciones`,`bdcomanda`.`ingredientes` AS `ingredientes`,`bdcomanda`.`aderezos` AS `aderezos`,`bdcomanda`.`cant` AS `cant`,`bdcomanda`.`observaciones` AS `observaciones`,`bdcomanda`.`consecutivo` AS `consecutivo` from `bdcomanda` where ((`bdcomanda`.`opciones` = \'\') and (`bdcomanda`.`ingredientes` = \'\') and (`bdcomanda`.`aderezos` = \'\') and (`bdcomanda`.`observaciones` = \'\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdcomanda`.`Id` AS `Id`,`bdclick3`.`bdcomanda`.`congelada` AS `congelada`,`bdclick3`.`bdcomanda`.`factura` AS `factura`,`bdclick3`.`bdcomanda`.`pedido` AS `pedido`,`bdclick3`.`bdcomanda`.`cod` AS `cod`,`bdclick3`.`bdcomanda`.`producto` AS `producto`,`bdclick3`.`bdcomanda`.`opciones` AS `opciones`,`bdclick3`.`bdcomanda`.`ingredientes` AS `ingredientes`,`bdclick3`.`bdcomanda`.`aderezos` AS `aderezos`,`bdclick3`.`bdcomanda`.`cant` AS `cant`,`bdclick3`.`bdcomanda`.`observaciones` AS `observaciones`,`bdclick3`.`bdcomanda`.`consecutivo` AS `consecutivo` from `bdclick3`.`bdcomanda` where ((`bdclick3`.`bdcomanda`.`opciones` = \'\') and (`bdclick3`.`bdcomanda`.`ingredientes` = \'\') and (`bdclick3`.`bdcomanda`.`aderezos` = \'\') and (`bdclick3`.`bdcomanda`.`observaciones` = \'\'))
mariadb-version=100135
