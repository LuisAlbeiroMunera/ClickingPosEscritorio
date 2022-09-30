TYPE=VIEW
query=(select `bdclick1`.`bdfactura`.`red` AS `red`,`bdclick1`.`bdfactura`.`porcIva` AS `porcIva`,sum(`bdclick1`.`bdfactura`.`iva`) AS `totalIvaDiscriminandoIva`,sum(`bdclick1`.`bdfactura`.`subtotal`) AS `subTotalDiscriminadoIva`,sum(`bdclick1`.`bdfactura`.`total`) AS `totalDiscriminadoIva`,sum(`bdclick1`.`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoIva` from `bdclick1`.`bdfactura` group by `bdclick1`.`bdfactura`.`red`,`bdclick1`.`bdfactura`.`porcIva`,`bdclick1`.`bdfactura`.`anulada` having (`bdclick1`.`bdfactura`.`anulada` = 0) order by `bdclick1`.`bdfactura`.`red`)
md5=117e0b6de5ad133c566821face6695a5
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:35
create-version=2
source=(select `bdfactura`.`red` AS `red`,`bdfactura`.`porcIva` AS `porcIva`,sum(`bdfactura`.`iva`) AS `totalIvaDiscriminandoIva`,sum(`bdfactura`.`subtotal`) AS `subTotalDiscriminadoIva`,sum(`bdfactura`.`total`) AS `totalDiscriminadoIva`,sum(`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoIva` from `bdfactura` group by `bdfactura`.`red`,`bdfactura`.`porcIva`,`bdfactura`.`anulada` having (`bdfactura`.`anulada` = 0) order by `bdfactura`.`red`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick1`.`bdfactura`.`red` AS `red`,`bdclick1`.`bdfactura`.`porcIva` AS `porcIva`,sum(`bdclick1`.`bdfactura`.`iva`) AS `totalIvaDiscriminandoIva`,sum(`bdclick1`.`bdfactura`.`subtotal`) AS `subTotalDiscriminadoIva`,sum(`bdclick1`.`bdfactura`.`total`) AS `totalDiscriminadoIva`,sum(`bdclick1`.`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoIva` from `bdclick1`.`bdfactura` group by `bdclick1`.`bdfactura`.`red`,`bdclick1`.`bdfactura`.`porcIva`,`bdclick1`.`bdfactura`.`anulada` having (`bdclick1`.`bdfactura`.`anulada` = 0) order by `bdclick1`.`bdfactura`.`red`)
mariadb-version=100135
