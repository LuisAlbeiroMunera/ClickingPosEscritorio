TYPE=VIEW
query=(select `bdclick1`.`bdfactura`.`factura` AS `idFactura`,if((`bdclick1`.`bdfactura`.`porcIva` = 0),\'Exento\',`bdclick1`.`bdfactura`.`porcIva`) AS `porcIva`,sum(`bdclick1`.`bdfactura`.`subtotal`) AS `SumaDeTotal`,sum(`bdclick1`.`bdfactura`.`iva`) AS `SumaDeiva` from (`bdclick1`.`bdfactura` left join `bdclick1`.`bdproductos` on((`bdclick1`.`bdfactura`.`producto` = `bdclick1`.`bdproductos`.`idSistema`))) group by `bdclick1`.`bdfactura`.`factura`,if((`bdclick1`.`bdfactura`.`porcIva` = 0),\'Exento\',`bdclick1`.`bdfactura`.`porcIva`))
md5=a39c91c1cc5cb76363fc8085463c73f1
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:34
create-version=2
source=(select `bdfactura`.`factura` AS `idFactura`,if((`bdfactura`.`porcIva` = 0),\'Exento\',`bdfactura`.`porcIva`) AS `porcIva`,sum(`bdfactura`.`subtotal`) AS `SumaDeTotal`,sum(`bdfactura`.`iva`) AS `SumaDeiva` from (`bdfactura` left join `bdproductos` on((`bdfactura`.`producto` = `bdproductos`.`idSistema`))) group by `bdfactura`.`factura`,if((`bdfactura`.`porcIva` = 0),\'Exento\',`bdfactura`.`porcIva`))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick1`.`bdfactura`.`factura` AS `idFactura`,if((`bdclick1`.`bdfactura`.`porcIva` = 0),\'Exento\',`bdclick1`.`bdfactura`.`porcIva`) AS `porcIva`,sum(`bdclick1`.`bdfactura`.`subtotal`) AS `SumaDeTotal`,sum(`bdclick1`.`bdfactura`.`iva`) AS `SumaDeiva` from (`bdclick1`.`bdfactura` left join `bdclick1`.`bdproductos` on((`bdclick1`.`bdfactura`.`producto` = `bdclick1`.`bdproductos`.`idSistema`))) group by `bdclick1`.`bdfactura`.`factura`,if((`bdclick1`.`bdfactura`.`porcIva` = 0),\'Exento\',`bdclick1`.`bdfactura`.`porcIva`))
mariadb-version=100135
