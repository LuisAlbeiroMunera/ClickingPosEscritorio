TYPE=VIEW
query=select `bdclick3`.`bdfactura`.`red` AS `red`,`bdclick3`.`bdfactura`.`porcImpo` AS `porcImpo`,sum(`bdclick3`.`bdfactura`.`impoconsumo`) AS `totalImpoDiscriminandoImpo`,sum(`bdclick3`.`bdfactura`.`subtotal`) AS `subTotalDiscriminadoImpo`,sum(`bdclick3`.`bdfactura`.`total`) AS `totalDiscriminadoImpo`,sum(`bdclick3`.`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoImpo` from `bdclick3`.`bdfactura` group by `bdclick3`.`bdfactura`.`red`,`bdclick3`.`bdfactura`.`porcImpo`,`bdclick3`.`bdfactura`.`anulada` having (`bdclick3`.`bdfactura`.`anulada` = 0) order by `bdclick3`.`bdfactura`.`red`
md5=7d74606398830844985fb0c725710d32
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:50
create-version=2
source=select `bdfactura`.`red` AS `red`,`bdfactura`.`porcImpo` AS `porcImpo`,sum(`bdfactura`.`impoconsumo`) AS `totalImpoDiscriminandoImpo`,sum(`bdfactura`.`subtotal`) AS `subTotalDiscriminadoImpo`,sum(`bdfactura`.`total`) AS `totalDiscriminadoImpo`,sum(`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoImpo` from `bdfactura` group by `bdfactura`.`red`,`bdfactura`.`porcImpo`,`bdfactura`.`anulada` having (`bdfactura`.`anulada` = 0) order by `bdfactura`.`red`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdfactura`.`red` AS `red`,`bdclick3`.`bdfactura`.`porcImpo` AS `porcImpo`,sum(`bdclick3`.`bdfactura`.`impoconsumo`) AS `totalImpoDiscriminandoImpo`,sum(`bdclick3`.`bdfactura`.`subtotal`) AS `subTotalDiscriminadoImpo`,sum(`bdclick3`.`bdfactura`.`total`) AS `totalDiscriminadoImpo`,sum(`bdclick3`.`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoImpo` from `bdclick3`.`bdfactura` group by `bdclick3`.`bdfactura`.`red`,`bdclick3`.`bdfactura`.`porcImpo`,`bdclick3`.`bdfactura`.`anulada` having (`bdclick3`.`bdfactura`.`anulada` = 0) order by `bdclick3`.`bdfactura`.`red`
mariadb-version=100135
