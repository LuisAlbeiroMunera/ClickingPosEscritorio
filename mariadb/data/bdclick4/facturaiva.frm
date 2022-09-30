TYPE=VIEW
query=(select `bdclick4`.`bdfactura`.`factura` AS `idFactura`,if((`bdclick4`.`bdfactura`.`porcIva` = 0),\'Exento\',`bdclick4`.`bdfactura`.`porcIva`) AS `porcIva`,sum(`bdclick4`.`bdfactura`.`subtotal`) AS `SumaDeTotal`,sum(`bdclick4`.`bdfactura`.`iva`) AS `SumaDeiva` from (`bdclick4`.`bdfactura` left join `bdclick4`.`bdproductos` on((`bdclick4`.`bdfactura`.`producto` = `bdclick4`.`bdproductos`.`idSistema`))) group by `bdclick4`.`bdfactura`.`factura`,if((`bdclick4`.`bdfactura`.`porcIva` = 0),\'Exento\',`bdclick4`.`bdfactura`.`porcIva`))
md5=f8dead1ad7d4292a07adff4e2c569713
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:27
create-version=2
source=(select `bdfactura`.`factura` AS `idFactura`,if((`bdfactura`.`porcIva` = 0),\'Exento\',`bdfactura`.`porcIva`) AS `porcIva`,sum(`bdfactura`.`subtotal`) AS `SumaDeTotal`,sum(`bdfactura`.`iva`) AS `SumaDeiva` from (`bdfactura` left join `bdproductos` on((`bdfactura`.`producto` = `bdproductos`.`idSistema`))) group by `bdfactura`.`factura`,if((`bdfactura`.`porcIva` = 0),\'Exento\',`bdfactura`.`porcIva`))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick4`.`bdfactura`.`factura` AS `idFactura`,if((`bdclick4`.`bdfactura`.`porcIva` = 0),\'Exento\',`bdclick4`.`bdfactura`.`porcIva`) AS `porcIva`,sum(`bdclick4`.`bdfactura`.`subtotal`) AS `SumaDeTotal`,sum(`bdclick4`.`bdfactura`.`iva`) AS `SumaDeiva` from (`bdclick4`.`bdfactura` left join `bdclick4`.`bdproductos` on((`bdclick4`.`bdfactura`.`producto` = `bdclick4`.`bdproductos`.`idSistema`))) group by `bdclick4`.`bdfactura`.`factura`,if((`bdclick4`.`bdfactura`.`porcIva` = 0),\'Exento\',`bdclick4`.`bdfactura`.`porcIva`))
mariadb-version=100135
