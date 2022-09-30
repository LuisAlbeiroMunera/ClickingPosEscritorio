TYPE=VIEW
query=select `bdclick5`.`bdfactura`.`red` AS `red`,`bdclick5`.`bdfactura`.`porcImpo` AS `porcImpo`,sum(`bdclick5`.`bdfactura`.`impoconsumo`) AS `totalImpoDiscriminandoImpo`,sum(`bdclick5`.`bdfactura`.`subtotal`) AS `subTotalDiscriminadoImpo`,sum(`bdclick5`.`bdfactura`.`total`) AS `totalDiscriminadoImpo`,sum(`bdclick5`.`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoImpo` from `bdclick5`.`bdfactura` group by `bdclick5`.`bdfactura`.`red`,`bdclick5`.`bdfactura`.`porcImpo`,`bdclick5`.`bdfactura`.`anulada` having (`bdclick5`.`bdfactura`.`anulada` = 0) order by `bdclick5`.`bdfactura`.`red`
md5=dbfa063fdf574b7134ec73d9d98e0926
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:47
create-version=2
source=select `bdfactura`.`red` AS `red`,`bdfactura`.`porcImpo` AS `porcImpo`,sum(`bdfactura`.`impoconsumo`) AS `totalImpoDiscriminandoImpo`,sum(`bdfactura`.`subtotal`) AS `subTotalDiscriminadoImpo`,sum(`bdfactura`.`total`) AS `totalDiscriminadoImpo`,sum(`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoImpo` from `bdfactura` group by `bdfactura`.`red`,`bdfactura`.`porcImpo`,`bdfactura`.`anulada` having (`bdfactura`.`anulada` = 0) order by `bdfactura`.`red`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdfactura`.`red` AS `red`,`bdclick5`.`bdfactura`.`porcImpo` AS `porcImpo`,sum(`bdclick5`.`bdfactura`.`impoconsumo`) AS `totalImpoDiscriminandoImpo`,sum(`bdclick5`.`bdfactura`.`subtotal`) AS `subTotalDiscriminadoImpo`,sum(`bdclick5`.`bdfactura`.`total`) AS `totalDiscriminadoImpo`,sum(`bdclick5`.`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoImpo` from `bdclick5`.`bdfactura` group by `bdclick5`.`bdfactura`.`red`,`bdclick5`.`bdfactura`.`porcImpo`,`bdclick5`.`bdfactura`.`anulada` having (`bdclick5`.`bdfactura`.`anulada` = 0) order by `bdclick5`.`bdfactura`.`red`
mariadb-version=100135
