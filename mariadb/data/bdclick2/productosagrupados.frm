TYPE=VIEW
query=select `bdclick2`.`bdcomanda`.`congelada` AS `congelada`,`bdclick2`.`bdcomanda`.`factura` AS `factura`,`bdclick2`.`bdcomanda`.`pedido` AS `pedido`,`bdclick2`.`bdcomanda`.`cod` AS `cod`,`bdclick2`.`bdcomanda`.`producto` AS `producto`,sum(`bdclick2`.`bdcomanda`.`cant`) AS `cant1`,\'\' AS `opciones`,`bdclick2`.`bdcomanda`.`consecutivo` AS `consecutivo` from `bdclick2`.`bdcomanda` group by `bdclick2`.`bdcomanda`.`congelada`,`bdclick2`.`bdcomanda`.`factura`,`bdclick2`.`bdcomanda`.`pedido`,`bdclick2`.`bdcomanda`.`cod`,`bdclick2`.`bdcomanda`.`producto`,\'\',\'\'
md5=a5144c6d614c5b4c5cba22e142e98021
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:46
create-version=2
source=select `bdcomanda`.`congelada` AS `congelada`,`bdcomanda`.`factura` AS `factura`,`bdcomanda`.`pedido` AS `pedido`,`bdcomanda`.`cod` AS `cod`,`bdcomanda`.`producto` AS `producto`,sum(`bdcomanda`.`cant`) AS `cant1`,\'\' AS `opciones`,`bdcomanda`.`consecutivo` AS `consecutivo` from `bdcomanda` group by `bdcomanda`.`congelada`,`bdcomanda`.`factura`,`bdcomanda`.`pedido`,`bdcomanda`.`cod`,`bdcomanda`.`producto`,\'\',\'\'
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdcomanda`.`congelada` AS `congelada`,`bdclick2`.`bdcomanda`.`factura` AS `factura`,`bdclick2`.`bdcomanda`.`pedido` AS `pedido`,`bdclick2`.`bdcomanda`.`cod` AS `cod`,`bdclick2`.`bdcomanda`.`producto` AS `producto`,sum(`bdclick2`.`bdcomanda`.`cant`) AS `cant1`,\'\' AS `opciones`,`bdclick2`.`bdcomanda`.`consecutivo` AS `consecutivo` from `bdclick2`.`bdcomanda` group by `bdclick2`.`bdcomanda`.`congelada`,`bdclick2`.`bdcomanda`.`factura`,`bdclick2`.`bdcomanda`.`pedido`,`bdclick2`.`bdcomanda`.`cod`,`bdclick2`.`bdcomanda`.`producto`,\'\',\'\'
mariadb-version=100135