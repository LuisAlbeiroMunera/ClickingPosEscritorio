TYPE=VIEW
query=select `bdclick4`.`bdcomanda`.`congelada` AS `congelada`,`bdclick4`.`bdcomanda`.`factura` AS `factura`,`bdclick4`.`bdcomanda`.`pedido` AS `pedido`,`bdclick4`.`bdcomanda`.`cod` AS `cod`,`bdclick4`.`bdcomanda`.`producto` AS `producto`,sum(`bdclick4`.`bdcomanda`.`cant`) AS `cant1`,\'\' AS `opciones`,`bdclick4`.`bdcomanda`.`consecutivo` AS `consecutivo` from `bdclick4`.`bdcomanda` group by `bdclick4`.`bdcomanda`.`congelada`,`bdclick4`.`bdcomanda`.`factura`,`bdclick4`.`bdcomanda`.`pedido`,`bdclick4`.`bdcomanda`.`cod`,`bdclick4`.`bdcomanda`.`producto`,\'\',\'\'
md5=f2f070b5479b69d8f48b2de11f815c8d
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:29
create-version=2
source=select `bdcomanda`.`congelada` AS `congelada`,`bdcomanda`.`factura` AS `factura`,`bdcomanda`.`pedido` AS `pedido`,`bdcomanda`.`cod` AS `cod`,`bdcomanda`.`producto` AS `producto`,sum(`bdcomanda`.`cant`) AS `cant1`,\'\' AS `opciones`,`bdcomanda`.`consecutivo` AS `consecutivo` from `bdcomanda` group by `bdcomanda`.`congelada`,`bdcomanda`.`factura`,`bdcomanda`.`pedido`,`bdcomanda`.`cod`,`bdcomanda`.`producto`,\'\',\'\'
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdcomanda`.`congelada` AS `congelada`,`bdclick4`.`bdcomanda`.`factura` AS `factura`,`bdclick4`.`bdcomanda`.`pedido` AS `pedido`,`bdclick4`.`bdcomanda`.`cod` AS `cod`,`bdclick4`.`bdcomanda`.`producto` AS `producto`,sum(`bdclick4`.`bdcomanda`.`cant`) AS `cant1`,\'\' AS `opciones`,`bdclick4`.`bdcomanda`.`consecutivo` AS `consecutivo` from `bdclick4`.`bdcomanda` group by `bdclick4`.`bdcomanda`.`congelada`,`bdclick4`.`bdcomanda`.`factura`,`bdclick4`.`bdcomanda`.`pedido`,`bdclick4`.`bdcomanda`.`cod`,`bdclick4`.`bdcomanda`.`producto`,\'\',\'\'
mariadb-version=100135
