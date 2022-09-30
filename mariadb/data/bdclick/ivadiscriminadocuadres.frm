TYPE=VIEW
query=(select `bdclick`.`bdfactura`.`red` AS `red`,`bdclick`.`bdfactura`.`porcIva` AS `porcIva`,sum(`bdclick`.`bdfactura`.`iva`) AS `totalIvaDiscriminandoIva`,sum(`bdclick`.`bdfactura`.`subtotal`) AS `subTotalDiscriminadoIva`,sum(`bdclick`.`bdfactura`.`total`) AS `totalDiscriminadoIva`,sum(`bdclick`.`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoIva` from `bdclick`.`bdfactura` group by `bdclick`.`bdfactura`.`red`,`bdclick`.`bdfactura`.`porcIva`,`bdclick`.`bdfactura`.`anulada` having (`bdclick`.`bdfactura`.`anulada` = 0) order by `bdclick`.`bdfactura`.`red`)
md5=e37c549f538c147b3a68295bc67af3dc
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:24
create-version=2
source=(select `bdfactura`.`red` AS `red`,`bdfactura`.`porcIva` AS `porcIva`,sum(`bdfactura`.`iva`) AS `totalIvaDiscriminandoIva`,sum(`bdfactura`.`subtotal`) AS `subTotalDiscriminadoIva`,sum(`bdfactura`.`total`) AS `totalDiscriminadoIva`,sum(`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoIva` from `bdfactura` group by `bdfactura`.`red`,`bdfactura`.`porcIva`,`bdfactura`.`anulada` having (`bdfactura`.`anulada` = 0) order by `bdfactura`.`red`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdfactura`.`red` AS `red`,`bdclick`.`bdfactura`.`porcIva` AS `porcIva`,sum(`bdclick`.`bdfactura`.`iva`) AS `totalIvaDiscriminandoIva`,sum(`bdclick`.`bdfactura`.`subtotal`) AS `subTotalDiscriminadoIva`,sum(`bdclick`.`bdfactura`.`total`) AS `totalDiscriminadoIva`,sum(`bdclick`.`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoIva` from `bdclick`.`bdfactura` group by `bdclick`.`bdfactura`.`red`,`bdclick`.`bdfactura`.`porcIva`,`bdclick`.`bdfactura`.`anulada` having (`bdclick`.`bdfactura`.`anulada` = 0) order by `bdclick`.`bdfactura`.`red`)
mariadb-version=100135
