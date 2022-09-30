TYPE=VIEW
query=(select `bdclick2`.`bdfactura`.`red` AS `red`,`bdclick2`.`bdfactura`.`porcIva` AS `porcIva`,sum(`bdclick2`.`bdfactura`.`iva`) AS `totalIvaDiscriminandoIva`,sum(`bdclick2`.`bdfactura`.`subtotal`) AS `subTotalDiscriminadoIva`,sum(`bdclick2`.`bdfactura`.`total`) AS `totalDiscriminadoIva`,sum(`bdclick2`.`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoIva` from `bdclick2`.`bdfactura` group by `bdclick2`.`bdfactura`.`red`,`bdclick2`.`bdfactura`.`porcIva`,`bdclick2`.`bdfactura`.`anulada` having (`bdclick2`.`bdfactura`.`anulada` = 0) order by `bdclick2`.`bdfactura`.`red`)
md5=29315669a3d8c08ca58e608ec0b9a37a
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:45
create-version=2
source=(select `bdfactura`.`red` AS `red`,`bdfactura`.`porcIva` AS `porcIva`,sum(`bdfactura`.`iva`) AS `totalIvaDiscriminandoIva`,sum(`bdfactura`.`subtotal`) AS `subTotalDiscriminadoIva`,sum(`bdfactura`.`total`) AS `totalDiscriminadoIva`,sum(`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoIva` from `bdfactura` group by `bdfactura`.`red`,`bdfactura`.`porcIva`,`bdfactura`.`anulada` having (`bdfactura`.`anulada` = 0) order by `bdfactura`.`red`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick2`.`bdfactura`.`red` AS `red`,`bdclick2`.`bdfactura`.`porcIva` AS `porcIva`,sum(`bdclick2`.`bdfactura`.`iva`) AS `totalIvaDiscriminandoIva`,sum(`bdclick2`.`bdfactura`.`subtotal`) AS `subTotalDiscriminadoIva`,sum(`bdclick2`.`bdfactura`.`total`) AS `totalDiscriminadoIva`,sum(`bdclick2`.`bdfactura`.`descuento`) AS `totalDescuentoDiscriminadoIva` from `bdclick2`.`bdfactura` group by `bdclick2`.`bdfactura`.`red`,`bdclick2`.`bdfactura`.`porcIva`,`bdclick2`.`bdfactura`.`anulada` having (`bdclick2`.`bdfactura`.`anulada` = 0) order by `bdclick2`.`bdfactura`.`red`)
mariadb-version=100135
