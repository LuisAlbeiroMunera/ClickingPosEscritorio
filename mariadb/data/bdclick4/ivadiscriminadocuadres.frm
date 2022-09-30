TYPE=VIEW
query=(select `bdclick4`.`bdfactura`.`red` AS `red`,`bdclick4`.`bdfactura`.`porcIva` AS `porcIva`,sum(`bdclick4`.`bdfactura`.`iva`) AS `totalIvaDiscriminandoIva`,sum(`bdclick4`.`bdfactura`.`subtotal`) AS `subTotalDiscriminadoIva`,sum(`bdclick4`.`bdfactura`.`total`) AS `totalDiscriminadoIva`,sum(`bdclick4`.`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoIva` from `bdclick4`.`bdfactura` group by `bdclick4`.`bdfactura`.`red`,`bdclick4`.`bdfactura`.`porcIva`,`bdclick4`.`bdfactura`.`anulada` having (`bdclick4`.`bdfactura`.`anulada` = 0) order by `bdclick4`.`bdfactura`.`red`)
md5=7f620785cdafdaea260389c2929cfd23
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:28
create-version=2
source=(select `bdfactura`.`red` AS `red`,`bdfactura`.`porcIva` AS `porcIva`,sum(`bdfactura`.`iva`) AS `totalIvaDiscriminandoIva`,sum(`bdfactura`.`subtotal`) AS `subTotalDiscriminadoIva`,sum(`bdfactura`.`total`) AS `totalDiscriminadoIva`,sum(`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoIva` from `bdfactura` group by `bdfactura`.`red`,`bdfactura`.`porcIva`,`bdfactura`.`anulada` having (`bdfactura`.`anulada` = 0) order by `bdfactura`.`red`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick4`.`bdfactura`.`red` AS `red`,`bdclick4`.`bdfactura`.`porcIva` AS `porcIva`,sum(`bdclick4`.`bdfactura`.`iva`) AS `totalIvaDiscriminandoIva`,sum(`bdclick4`.`bdfactura`.`subtotal`) AS `subTotalDiscriminadoIva`,sum(`bdclick4`.`bdfactura`.`total`) AS `totalDiscriminadoIva`,sum(`bdclick4`.`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoIva` from `bdclick4`.`bdfactura` group by `bdclick4`.`bdfactura`.`red`,`bdclick4`.`bdfactura`.`porcIva`,`bdclick4`.`bdfactura`.`anulada` having (`bdclick4`.`bdfactura`.`anulada` = 0) order by `bdclick4`.`bdfactura`.`red`)
mariadb-version=100135
