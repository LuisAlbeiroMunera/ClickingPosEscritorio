TYPE=VIEW
query=select `bdclick6`.`bdfactura`.`red` AS `red`,`bdclick6`.`bdfactura`.`porcImpo` AS `porcImpo`,sum(`bdclick6`.`bdfactura`.`impoconsumo`) AS `totalImpoDiscriminandoImpo`,sum(`bdclick6`.`bdfactura`.`subtotal`) AS `subTotalDiscriminadoImpo`,sum(`bdclick6`.`bdfactura`.`total`) AS `totalDiscriminadoImpo`,sum(`bdclick6`.`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoImpo` from `bdclick6`.`bdfactura` group by `bdclick6`.`bdfactura`.`red`,`bdclick6`.`bdfactura`.`porcImpo`,`bdclick6`.`bdfactura`.`anulada` having (`bdclick6`.`bdfactura`.`anulada` = 0) order by `bdclick6`.`bdfactura`.`red`
md5=a308b5622ea07afa8fdc35569cad9f9c
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:35
create-version=2
source=select `bdfactura`.`red` AS `red`,`bdfactura`.`porcImpo` AS `porcImpo`,sum(`bdfactura`.`impoconsumo`) AS `totalImpoDiscriminandoImpo`,sum(`bdfactura`.`subtotal`) AS `subTotalDiscriminadoImpo`,sum(`bdfactura`.`total`) AS `totalDiscriminadoImpo`,sum(`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoImpo` from `bdfactura` group by `bdfactura`.`red`,`bdfactura`.`porcImpo`,`bdfactura`.`anulada` having (`bdfactura`.`anulada` = 0) order by `bdfactura`.`red`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdfactura`.`red` AS `red`,`bdclick6`.`bdfactura`.`porcImpo` AS `porcImpo`,sum(`bdclick6`.`bdfactura`.`impoconsumo`) AS `totalImpoDiscriminandoImpo`,sum(`bdclick6`.`bdfactura`.`subtotal`) AS `subTotalDiscriminadoImpo`,sum(`bdclick6`.`bdfactura`.`total`) AS `totalDiscriminadoImpo`,sum(`bdclick6`.`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoImpo` from `bdclick6`.`bdfactura` group by `bdclick6`.`bdfactura`.`red`,`bdclick6`.`bdfactura`.`porcImpo`,`bdclick6`.`bdfactura`.`anulada` having (`bdclick6`.`bdfactura`.`anulada` = 0) order by `bdclick6`.`bdfactura`.`red`
mariadb-version=100135
