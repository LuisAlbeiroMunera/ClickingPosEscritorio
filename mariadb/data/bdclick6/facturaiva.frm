TYPE=VIEW
query=(select `bdclick6`.`bdfactura`.`factura` AS `idFactura`,if((`bdclick6`.`bdfactura`.`porcIva` = 0),\'Exento\',`bdclick6`.`bdfactura`.`porcIva`) AS `porcIva`,sum(`bdclick6`.`bdfactura`.`subtotal`) AS `SumaDeTotal`,sum(`bdclick6`.`bdfactura`.`iva`) AS `SumaDeiva` from (`bdclick6`.`bdfactura` left join `bdclick6`.`bdproductos` on((`bdclick6`.`bdfactura`.`producto` = `bdclick6`.`bdproductos`.`idSistema`))) group by `bdclick6`.`bdfactura`.`factura`,if((`bdclick6`.`bdfactura`.`porcIva` = 0),\'Exento\',`bdclick6`.`bdfactura`.`porcIva`))
md5=725d485ad152902ef5158ecd27d40958
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:35
create-version=2
source=(select `bdfactura`.`factura` AS `idFactura`,if((`bdfactura`.`porcIva` = 0),\'Exento\',`bdfactura`.`porcIva`) AS `porcIva`,sum(`bdfactura`.`subtotal`) AS `SumaDeTotal`,sum(`bdfactura`.`iva`) AS `SumaDeiva` from (`bdfactura` left join `bdproductos` on((`bdfactura`.`producto` = `bdproductos`.`idSistema`))) group by `bdfactura`.`factura`,if((`bdfactura`.`porcIva` = 0),\'Exento\',`bdfactura`.`porcIva`))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`bdfactura`.`factura` AS `idFactura`,if((`bdclick6`.`bdfactura`.`porcIva` = 0),\'Exento\',`bdclick6`.`bdfactura`.`porcIva`) AS `porcIva`,sum(`bdclick6`.`bdfactura`.`subtotal`) AS `SumaDeTotal`,sum(`bdclick6`.`bdfactura`.`iva`) AS `SumaDeiva` from (`bdclick6`.`bdfactura` left join `bdclick6`.`bdproductos` on((`bdclick6`.`bdfactura`.`producto` = `bdclick6`.`bdproductos`.`idSistema`))) group by `bdclick6`.`bdfactura`.`factura`,if((`bdclick6`.`bdfactura`.`porcIva` = 0),\'Exento\',`bdclick6`.`bdfactura`.`porcIva`))
mariadb-version=100135
