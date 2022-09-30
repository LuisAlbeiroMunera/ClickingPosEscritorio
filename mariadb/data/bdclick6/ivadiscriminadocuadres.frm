TYPE=VIEW
query=(select `bdclick6`.`bdfactura`.`red` AS `red`,`bdclick6`.`bdfactura`.`porcIva` AS `porcIva`,sum(`bdclick6`.`bdfactura`.`iva`) AS `totalIvaDiscriminandoIva`,sum(`bdclick6`.`bdfactura`.`subtotal`) AS `subTotalDiscriminadoIva`,sum(`bdclick6`.`bdfactura`.`total`) AS `totalDiscriminadoIva`,sum(`bdclick6`.`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoIva` from `bdclick6`.`bdfactura` group by `bdclick6`.`bdfactura`.`red`,`bdclick6`.`bdfactura`.`porcIva`,`bdclick6`.`bdfactura`.`anulada` having (`bdclick6`.`bdfactura`.`anulada` = 0) order by `bdclick6`.`bdfactura`.`red`)
md5=dd850523a5ca353ea59c863c31a0d187
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:36
create-version=2
source=(select `bdfactura`.`red` AS `red`,`bdfactura`.`porcIva` AS `porcIva`,sum(`bdfactura`.`iva`) AS `totalIvaDiscriminandoIva`,sum(`bdfactura`.`subtotal`) AS `subTotalDiscriminadoIva`,sum(`bdfactura`.`total`) AS `totalDiscriminadoIva`,sum(`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoIva` from `bdfactura` group by `bdfactura`.`red`,`bdfactura`.`porcIva`,`bdfactura`.`anulada` having (`bdfactura`.`anulada` = 0) order by `bdfactura`.`red`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`bdfactura`.`red` AS `red`,`bdclick6`.`bdfactura`.`porcIva` AS `porcIva`,sum(`bdclick6`.`bdfactura`.`iva`) AS `totalIvaDiscriminandoIva`,sum(`bdclick6`.`bdfactura`.`subtotal`) AS `subTotalDiscriminadoIva`,sum(`bdclick6`.`bdfactura`.`total`) AS `totalDiscriminadoIva`,sum(`bdclick6`.`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoIva` from `bdclick6`.`bdfactura` group by `bdclick6`.`bdfactura`.`red`,`bdclick6`.`bdfactura`.`porcIva`,`bdclick6`.`bdfactura`.`anulada` having (`bdclick6`.`bdfactura`.`anulada` = 0) order by `bdclick6`.`bdfactura`.`red`)
mariadb-version=100135
