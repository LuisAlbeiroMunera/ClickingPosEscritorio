TYPE=VIEW
query=(select `bdclick3`.`bdfactura`.`factura` AS `idFactura`,if((`bdclick3`.`bdfactura`.`porcIva` = 0),\'Exento\',`bdclick3`.`bdfactura`.`porcIva`) AS `porcIva`,sum(`bdclick3`.`bdfactura`.`subtotal`) AS `SumaDeTotal`,sum(`bdclick3`.`bdfactura`.`iva`) AS `SumaDeiva` from (`bdclick3`.`bdfactura` left join `bdclick3`.`bdproductos` on((`bdclick3`.`bdfactura`.`producto` = `bdclick3`.`bdproductos`.`idSistema`))) group by `bdclick3`.`bdfactura`.`factura`,if((`bdclick3`.`bdfactura`.`porcIva` = 0),\'Exento\',`bdclick3`.`bdfactura`.`porcIva`))
md5=a10ac959080c26efce437f914fdccb31
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:50
create-version=2
source=(select `bdfactura`.`factura` AS `idFactura`,if((`bdfactura`.`porcIva` = 0),\'Exento\',`bdfactura`.`porcIva`) AS `porcIva`,sum(`bdfactura`.`subtotal`) AS `SumaDeTotal`,sum(`bdfactura`.`iva`) AS `SumaDeiva` from (`bdfactura` left join `bdproductos` on((`bdfactura`.`producto` = `bdproductos`.`idSistema`))) group by `bdfactura`.`factura`,if((`bdfactura`.`porcIva` = 0),\'Exento\',`bdfactura`.`porcIva`))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`bdfactura`.`factura` AS `idFactura`,if((`bdclick3`.`bdfactura`.`porcIva` = 0),\'Exento\',`bdclick3`.`bdfactura`.`porcIva`) AS `porcIva`,sum(`bdclick3`.`bdfactura`.`subtotal`) AS `SumaDeTotal`,sum(`bdclick3`.`bdfactura`.`iva`) AS `SumaDeiva` from (`bdclick3`.`bdfactura` left join `bdclick3`.`bdproductos` on((`bdclick3`.`bdfactura`.`producto` = `bdclick3`.`bdproductos`.`idSistema`))) group by `bdclick3`.`bdfactura`.`factura`,if((`bdclick3`.`bdfactura`.`porcIva` = 0),\'Exento\',`bdclick3`.`bdfactura`.`porcIva`))
mariadb-version=100135
