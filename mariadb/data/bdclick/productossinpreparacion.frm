TYPE=VIEW
query=select `bdclick`.`bdcomanda`.`Id` AS `Id`,`bdclick`.`bdcomanda`.`congelada` AS `congelada`,`bdclick`.`bdcomanda`.`factura` AS `factura`,`bdclick`.`bdcomanda`.`pedido` AS `pedido`,`bdclick`.`bdcomanda`.`cod` AS `cod`,`bdclick`.`bdcomanda`.`producto` AS `producto`,`bdclick`.`bdcomanda`.`opciones` AS `opciones`,`bdclick`.`bdcomanda`.`ingredientes` AS `ingredientes`,`bdclick`.`bdcomanda`.`aderezos` AS `aderezos`,`bdclick`.`bdcomanda`.`cant` AS `cant`,`bdclick`.`bdcomanda`.`observaciones` AS `observaciones`,`bdclick`.`bdcomanda`.`consecutivo` AS `consecutivo` from `bdclick`.`bdcomanda` where ((`bdclick`.`bdcomanda`.`opciones` = \'\') and (`bdclick`.`bdcomanda`.`ingredientes` = \'\') and (`bdclick`.`bdcomanda`.`aderezos` = \'\') and (`bdclick`.`bdcomanda`.`observaciones` = \'\'))
md5=46c2b498b8718ec0c39dce4fb1cb6c7c
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:26
create-version=2
source=select `bdcomanda`.`Id` AS `Id`,`bdcomanda`.`congelada` AS `congelada`,`bdcomanda`.`factura` AS `factura`,`bdcomanda`.`pedido` AS `pedido`,`bdcomanda`.`cod` AS `cod`,`bdcomanda`.`producto` AS `producto`,`bdcomanda`.`opciones` AS `opciones`,`bdcomanda`.`ingredientes` AS `ingredientes`,`bdcomanda`.`aderezos` AS `aderezos`,`bdcomanda`.`cant` AS `cant`,`bdcomanda`.`observaciones` AS `observaciones`,`bdcomanda`.`consecutivo` AS `consecutivo` from `bdcomanda` where ((`bdcomanda`.`opciones` = \'\') and (`bdcomanda`.`ingredientes` = \'\') and (`bdcomanda`.`aderezos` = \'\') and (`bdcomanda`.`observaciones` = \'\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdcomanda`.`Id` AS `Id`,`bdclick`.`bdcomanda`.`congelada` AS `congelada`,`bdclick`.`bdcomanda`.`factura` AS `factura`,`bdclick`.`bdcomanda`.`pedido` AS `pedido`,`bdclick`.`bdcomanda`.`cod` AS `cod`,`bdclick`.`bdcomanda`.`producto` AS `producto`,`bdclick`.`bdcomanda`.`opciones` AS `opciones`,`bdclick`.`bdcomanda`.`ingredientes` AS `ingredientes`,`bdclick`.`bdcomanda`.`aderezos` AS `aderezos`,`bdclick`.`bdcomanda`.`cant` AS `cant`,`bdclick`.`bdcomanda`.`observaciones` AS `observaciones`,`bdclick`.`bdcomanda`.`consecutivo` AS `consecutivo` from `bdclick`.`bdcomanda` where ((`bdclick`.`bdcomanda`.`opciones` = \'\') and (`bdclick`.`bdcomanda`.`ingredientes` = \'\') and (`bdclick`.`bdcomanda`.`aderezos` = \'\') and (`bdclick`.`bdcomanda`.`observaciones` = \'\'))
mariadb-version=100135
