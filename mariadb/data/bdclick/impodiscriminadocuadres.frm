TYPE=VIEW
query=select `bdclick`.`bdfactura`.`red` AS `red`,`bdclick`.`bdfactura`.`porcImpo` AS `porcImpo`,sum(`bdclick`.`bdfactura`.`impoconsumo`) AS `totalImpoDiscriminandoImpo`,sum(`bdclick`.`bdfactura`.`subtotal`) AS `subTotalDiscriminadoImpo`,sum(`bdclick`.`bdfactura`.`total`) AS `totalDiscriminadoImpo`,sum(`bdclick`.`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoImpo` from `bdclick`.`bdfactura` group by `bdclick`.`bdfactura`.`red`,`bdclick`.`bdfactura`.`porcImpo`,`bdclick`.`bdfactura`.`anulada` having (`bdclick`.`bdfactura`.`anulada` = 0) order by `bdclick`.`bdfactura`.`red`
md5=aabfb6a41190b793a7827a0cae640197
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:24
create-version=2
source=select `bdfactura`.`red` AS `red`,`bdfactura`.`porcImpo` AS `porcImpo`,sum(`bdfactura`.`impoconsumo`) AS `totalImpoDiscriminandoImpo`,sum(`bdfactura`.`subtotal`) AS `subTotalDiscriminadoImpo`,sum(`bdfactura`.`total`) AS `totalDiscriminadoImpo`,sum(`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoImpo` from `bdfactura` group by `bdfactura`.`red`,`bdfactura`.`porcImpo`,`bdfactura`.`anulada` having (`bdfactura`.`anulada` = 0) order by `bdfactura`.`red`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdfactura`.`red` AS `red`,`bdclick`.`bdfactura`.`porcImpo` AS `porcImpo`,sum(`bdclick`.`bdfactura`.`impoconsumo`) AS `totalImpoDiscriminandoImpo`,sum(`bdclick`.`bdfactura`.`subtotal`) AS `subTotalDiscriminadoImpo`,sum(`bdclick`.`bdfactura`.`total`) AS `totalDiscriminadoImpo`,sum(`bdclick`.`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoImpo` from `bdclick`.`bdfactura` group by `bdclick`.`bdfactura`.`red`,`bdclick`.`bdfactura`.`porcImpo`,`bdclick`.`bdfactura`.`anulada` having (`bdclick`.`bdfactura`.`anulada` = 0) order by `bdclick`.`bdfactura`.`red`
mariadb-version=100135
