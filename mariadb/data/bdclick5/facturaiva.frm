TYPE=VIEW
query=(select `bdclick5`.`bdfactura`.`factura` AS `idFactura`,if((`bdclick5`.`bdfactura`.`porcIva` = 0),\'Exento\',`bdclick5`.`bdfactura`.`porcIva`) AS `porcIva`,sum(`bdclick5`.`bdfactura`.`subtotal`) AS `SumaDeTotal`,sum(`bdclick5`.`bdfactura`.`iva`) AS `SumaDeiva` from (`bdclick5`.`bdfactura` left join `bdclick5`.`bdproductos` on((`bdclick5`.`bdfactura`.`producto` = `bdclick5`.`bdproductos`.`idSistema`))) group by `bdclick5`.`bdfactura`.`factura`,if((`bdclick5`.`bdfactura`.`porcIva` = 0),\'Exento\',`bdclick5`.`bdfactura`.`porcIva`))
md5=17f189454114274781107b13a7bdeb9b
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:46
create-version=2
source=(select `bdfactura`.`factura` AS `idFactura`,if((`bdfactura`.`porcIva` = 0),\'Exento\',`bdfactura`.`porcIva`) AS `porcIva`,sum(`bdfactura`.`subtotal`) AS `SumaDeTotal`,sum(`bdfactura`.`iva`) AS `SumaDeiva` from (`bdfactura` left join `bdproductos` on((`bdfactura`.`producto` = `bdproductos`.`idSistema`))) group by `bdfactura`.`factura`,if((`bdfactura`.`porcIva` = 0),\'Exento\',`bdfactura`.`porcIva`))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`bdfactura`.`factura` AS `idFactura`,if((`bdclick5`.`bdfactura`.`porcIva` = 0),\'Exento\',`bdclick5`.`bdfactura`.`porcIva`) AS `porcIva`,sum(`bdclick5`.`bdfactura`.`subtotal`) AS `SumaDeTotal`,sum(`bdclick5`.`bdfactura`.`iva`) AS `SumaDeiva` from (`bdclick5`.`bdfactura` left join `bdclick5`.`bdproductos` on((`bdclick5`.`bdfactura`.`producto` = `bdclick5`.`bdproductos`.`idSistema`))) group by `bdclick5`.`bdfactura`.`factura`,if((`bdclick5`.`bdfactura`.`porcIva` = 0),\'Exento\',`bdclick5`.`bdfactura`.`porcIva`))
mariadb-version=100135
