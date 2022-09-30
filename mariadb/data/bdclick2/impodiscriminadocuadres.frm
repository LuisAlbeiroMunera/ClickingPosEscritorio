TYPE=VIEW
query=select `bdclick2`.`bdfactura`.`red` AS `red`,`bdclick2`.`bdfactura`.`porcImpo` AS `porcImpo`,sum(`bdclick2`.`bdfactura`.`impoconsumo`) AS `totalImpoDiscriminandoImpo`,sum(`bdclick2`.`bdfactura`.`subtotal`) AS `subTotalDiscriminadoImpo`,sum(`bdclick2`.`bdfactura`.`total`) AS `totalDiscriminadoImpo`,sum(`bdclick2`.`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoImpo` from `bdclick2`.`bdfactura` group by `bdclick2`.`bdfactura`.`red`,`bdclick2`.`bdfactura`.`porcImpo`,`bdclick2`.`bdfactura`.`anulada` having (`bdclick2`.`bdfactura`.`anulada` = 0) order by `bdclick2`.`bdfactura`.`red`
md5=4ee6a32b8231e38842969e9dc34ddc07
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:45
create-version=2
source=select `bdfactura`.`red` AS `red`,`bdfactura`.`porcImpo` AS `porcImpo`,sum(`bdfactura`.`impoconsumo`) AS `totalImpoDiscriminandoImpo`,sum(`bdfactura`.`subtotal`) AS `subTotalDiscriminadoImpo`,sum(`bdfactura`.`total`) AS `totalDiscriminadoImpo`,sum(`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoImpo` from `bdfactura` group by `bdfactura`.`red`,`bdfactura`.`porcImpo`,`bdfactura`.`anulada` having (`bdfactura`.`anulada` = 0) order by `bdfactura`.`red`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdfactura`.`red` AS `red`,`bdclick2`.`bdfactura`.`porcImpo` AS `porcImpo`,sum(`bdclick2`.`bdfactura`.`impoconsumo`) AS `totalImpoDiscriminandoImpo`,sum(`bdclick2`.`bdfactura`.`subtotal`) AS `subTotalDiscriminadoImpo`,sum(`bdclick2`.`bdfactura`.`total`) AS `totalDiscriminadoImpo`,sum(`bdclick2`.`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoImpo` from `bdclick2`.`bdfactura` group by `bdclick2`.`bdfactura`.`red`,`bdclick2`.`bdfactura`.`porcImpo`,`bdclick2`.`bdfactura`.`anulada` having (`bdclick2`.`bdfactura`.`anulada` = 0) order by `bdclick2`.`bdfactura`.`red`
mariadb-version=100135
