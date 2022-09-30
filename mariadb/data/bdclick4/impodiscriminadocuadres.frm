TYPE=VIEW
query=select `bdclick4`.`bdfactura`.`red` AS `red`,`bdclick4`.`bdfactura`.`porcImpo` AS `porcImpo`,sum(`bdclick4`.`bdfactura`.`impoconsumo`) AS `totalImpoDiscriminandoImpo`,sum(`bdclick4`.`bdfactura`.`subtotal`) AS `subTotalDiscriminadoImpo`,sum(`bdclick4`.`bdfactura`.`total`) AS `totalDiscriminadoImpo`,sum(`bdclick4`.`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoImpo` from `bdclick4`.`bdfactura` group by `bdclick4`.`bdfactura`.`red`,`bdclick4`.`bdfactura`.`porcImpo`,`bdclick4`.`bdfactura`.`anulada` having (`bdclick4`.`bdfactura`.`anulada` = 0) order by `bdclick4`.`bdfactura`.`red`
md5=ac6a3c286c31085ae2e861a2ebfe3227
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:27
create-version=2
source=select `bdfactura`.`red` AS `red`,`bdfactura`.`porcImpo` AS `porcImpo`,sum(`bdfactura`.`impoconsumo`) AS `totalImpoDiscriminandoImpo`,sum(`bdfactura`.`subtotal`) AS `subTotalDiscriminadoImpo`,sum(`bdfactura`.`total`) AS `totalDiscriminadoImpo`,sum(`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoImpo` from `bdfactura` group by `bdfactura`.`red`,`bdfactura`.`porcImpo`,`bdfactura`.`anulada` having (`bdfactura`.`anulada` = 0) order by `bdfactura`.`red`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdfactura`.`red` AS `red`,`bdclick4`.`bdfactura`.`porcImpo` AS `porcImpo`,sum(`bdclick4`.`bdfactura`.`impoconsumo`) AS `totalImpoDiscriminandoImpo`,sum(`bdclick4`.`bdfactura`.`subtotal`) AS `subTotalDiscriminadoImpo`,sum(`bdclick4`.`bdfactura`.`total`) AS `totalDiscriminadoImpo`,sum(`bdclick4`.`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoImpo` from `bdclick4`.`bdfactura` group by `bdclick4`.`bdfactura`.`red`,`bdclick4`.`bdfactura`.`porcImpo`,`bdclick4`.`bdfactura`.`anulada` having (`bdclick4`.`bdfactura`.`anulada` = 0) order by `bdclick4`.`bdfactura`.`red`
mariadb-version=100135
