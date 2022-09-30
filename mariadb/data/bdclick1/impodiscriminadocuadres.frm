TYPE=VIEW
query=select `bdclick1`.`bdfactura`.`red` AS `red`,`bdclick1`.`bdfactura`.`porcImpo` AS `porcImpo`,sum(`bdclick1`.`bdfactura`.`impoconsumo`) AS `totalImpoDiscriminandoImpo`,sum(`bdclick1`.`bdfactura`.`subtotal`) AS `subTotalDiscriminadoImpo`,sum(`bdclick1`.`bdfactura`.`total`) AS `totalDiscriminadoImpo`,sum(`bdclick1`.`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoImpo` from `bdclick1`.`bdfactura` group by `bdclick1`.`bdfactura`.`red`,`bdclick1`.`bdfactura`.`porcImpo`,`bdclick1`.`bdfactura`.`anulada` having (`bdclick1`.`bdfactura`.`anulada` = 0) order by `bdclick1`.`bdfactura`.`red`
md5=4ee48202bb76ad2bb4bdf3a64d45fc61
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:34
create-version=2
source=select `bdfactura`.`red` AS `red`,`bdfactura`.`porcImpo` AS `porcImpo`,sum(`bdfactura`.`impoconsumo`) AS `totalImpoDiscriminandoImpo`,sum(`bdfactura`.`subtotal`) AS `subTotalDiscriminadoImpo`,sum(`bdfactura`.`total`) AS `totalDiscriminadoImpo`,sum(`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoImpo` from `bdfactura` group by `bdfactura`.`red`,`bdfactura`.`porcImpo`,`bdfactura`.`anulada` having (`bdfactura`.`anulada` = 0) order by `bdfactura`.`red`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdfactura`.`red` AS `red`,`bdclick1`.`bdfactura`.`porcImpo` AS `porcImpo`,sum(`bdclick1`.`bdfactura`.`impoconsumo`) AS `totalImpoDiscriminandoImpo`,sum(`bdclick1`.`bdfactura`.`subtotal`) AS `subTotalDiscriminadoImpo`,sum(`bdclick1`.`bdfactura`.`total`) AS `totalDiscriminadoImpo`,sum(`bdclick1`.`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoImpo` from `bdclick1`.`bdfactura` group by `bdclick1`.`bdfactura`.`red`,`bdclick1`.`bdfactura`.`porcImpo`,`bdclick1`.`bdfactura`.`anulada` having (`bdclick1`.`bdfactura`.`anulada` = 0) order by `bdclick1`.`bdfactura`.`red`
mariadb-version=100135
