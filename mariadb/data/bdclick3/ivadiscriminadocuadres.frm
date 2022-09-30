TYPE=VIEW
query=(select `bdclick3`.`bdfactura`.`red` AS `red`,`bdclick3`.`bdfactura`.`porcIva` AS `porcIva`,sum(`bdclick3`.`bdfactura`.`iva`) AS `totalIvaDiscriminandoIva`,sum(`bdclick3`.`bdfactura`.`subtotal`) AS `subTotalDiscriminadoIva`,sum(`bdclick3`.`bdfactura`.`total`) AS `totalDiscriminadoIva`,sum(`bdclick3`.`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoIva` from `bdclick3`.`bdfactura` group by `bdclick3`.`bdfactura`.`red`,`bdclick3`.`bdfactura`.`porcIva`,`bdclick3`.`bdfactura`.`anulada` having (`bdclick3`.`bdfactura`.`anulada` = 0) order by `bdclick3`.`bdfactura`.`red`)
md5=35ef074aa9effd3ab245cf287559644c
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:51
create-version=2
source=(select `bdfactura`.`red` AS `red`,`bdfactura`.`porcIva` AS `porcIva`,sum(`bdfactura`.`iva`) AS `totalIvaDiscriminandoIva`,sum(`bdfactura`.`subtotal`) AS `subTotalDiscriminadoIva`,sum(`bdfactura`.`total`) AS `totalDiscriminadoIva`,sum(`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoIva` from `bdfactura` group by `bdfactura`.`red`,`bdfactura`.`porcIva`,`bdfactura`.`anulada` having (`bdfactura`.`anulada` = 0) order by `bdfactura`.`red`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`bdfactura`.`red` AS `red`,`bdclick3`.`bdfactura`.`porcIva` AS `porcIva`,sum(`bdclick3`.`bdfactura`.`iva`) AS `totalIvaDiscriminandoIva`,sum(`bdclick3`.`bdfactura`.`subtotal`) AS `subTotalDiscriminadoIva`,sum(`bdclick3`.`bdfactura`.`total`) AS `totalDiscriminadoIva`,sum(`bdclick3`.`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoIva` from `bdclick3`.`bdfactura` group by `bdclick3`.`bdfactura`.`red`,`bdclick3`.`bdfactura`.`porcIva`,`bdclick3`.`bdfactura`.`anulada` having (`bdclick3`.`bdfactura`.`anulada` = 0) order by `bdclick3`.`bdfactura`.`red`)
mariadb-version=100135
