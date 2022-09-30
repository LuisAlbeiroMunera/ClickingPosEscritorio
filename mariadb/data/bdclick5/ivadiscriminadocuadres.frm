TYPE=VIEW
query=(select `bdclick5`.`bdfactura`.`red` AS `red`,`bdclick5`.`bdfactura`.`porcIva` AS `porcIva`,sum(`bdclick5`.`bdfactura`.`iva`) AS `totalIvaDiscriminandoIva`,sum(`bdclick5`.`bdfactura`.`subtotal`) AS `subTotalDiscriminadoIva`,sum(`bdclick5`.`bdfactura`.`total`) AS `totalDiscriminadoIva`,sum(`bdclick5`.`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoIva` from `bdclick5`.`bdfactura` group by `bdclick5`.`bdfactura`.`red`,`bdclick5`.`bdfactura`.`porcIva`,`bdclick5`.`bdfactura`.`anulada` having (`bdclick5`.`bdfactura`.`anulada` = 0) order by `bdclick5`.`bdfactura`.`red`)
md5=a8fdcbff5fbd79bb6af288ac7d1ac646
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:47
create-version=2
source=(select `bdfactura`.`red` AS `red`,`bdfactura`.`porcIva` AS `porcIva`,sum(`bdfactura`.`iva`) AS `totalIvaDiscriminandoIva`,sum(`bdfactura`.`subtotal`) AS `subTotalDiscriminadoIva`,sum(`bdfactura`.`total`) AS `totalDiscriminadoIva`,sum(`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoIva` from `bdfactura` group by `bdfactura`.`red`,`bdfactura`.`porcIva`,`bdfactura`.`anulada` having (`bdfactura`.`anulada` = 0) order by `bdfactura`.`red`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`bdfactura`.`red` AS `red`,`bdclick5`.`bdfactura`.`porcIva` AS `porcIva`,sum(`bdclick5`.`bdfactura`.`iva`) AS `totalIvaDiscriminandoIva`,sum(`bdclick5`.`bdfactura`.`subtotal`) AS `subTotalDiscriminadoIva`,sum(`bdclick5`.`bdfactura`.`total`) AS `totalDiscriminadoIva`,sum(`bdclick5`.`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoIva` from `bdclick5`.`bdfactura` group by `bdclick5`.`bdfactura`.`red`,`bdclick5`.`bdfactura`.`porcIva`,`bdclick5`.`bdfactura`.`anulada` having (`bdclick5`.`bdfactura`.`anulada` = 0) order by `bdclick5`.`bdfactura`.`red`)
mariadb-version=100135
