TYPE=VIEW
query=(select `bdclick`.`bdfactura`.`factura` AS `idFactura`,if((`bdclick`.`bdfactura`.`porcIva` = 0),\'Exento\',`bdclick`.`bdfactura`.`porcIva`) AS `porcIva`,sum(`bdclick`.`bdfactura`.`subtotal`) AS `SumaDeTotal`,sum(`bdclick`.`bdfactura`.`iva`) AS `SumaDeiva` from (`bdclick`.`bdfactura` left join `bdclick`.`bdproductos` on((`bdclick`.`bdfactura`.`producto` = `bdclick`.`bdproductos`.`idSistema`))) group by `bdclick`.`bdfactura`.`factura`,if((`bdclick`.`bdfactura`.`porcIva` = 0),\'Exento\',`bdclick`.`bdfactura`.`porcIva`))
md5=8a13637962658fd621576146f2069fcb
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:23
create-version=2
source=(select `bdfactura`.`factura` AS `idFactura`,if((`bdfactura`.`porcIva` = 0),\'Exento\',`bdfactura`.`porcIva`) AS `porcIva`,sum(`bdfactura`.`subtotal`) AS `SumaDeTotal`,sum(`bdfactura`.`iva`) AS `SumaDeiva` from (`bdfactura` left join `bdproductos` on((`bdfactura`.`producto` = `bdproductos`.`idSistema`))) group by `bdfactura`.`factura`,if((`bdfactura`.`porcIva` = 0),\'Exento\',`bdfactura`.`porcIva`))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdfactura`.`factura` AS `idFactura`,if((`bdclick`.`bdfactura`.`porcIva` = 0),\'Exento\',`bdclick`.`bdfactura`.`porcIva`) AS `porcIva`,sum(`bdclick`.`bdfactura`.`subtotal`) AS `SumaDeTotal`,sum(`bdclick`.`bdfactura`.`iva`) AS `SumaDeiva` from (`bdclick`.`bdfactura` left join `bdclick`.`bdproductos` on((`bdclick`.`bdfactura`.`producto` = `bdclick`.`bdproductos`.`idSistema`))) group by `bdclick`.`bdfactura`.`factura`,if((`bdclick`.`bdfactura`.`porcIva` = 0),\'Exento\',`bdclick`.`bdfactura`.`porcIva`))
mariadb-version=100135
