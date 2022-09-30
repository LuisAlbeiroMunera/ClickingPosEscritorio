TYPE=VIEW
query=select `bdclick`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick`.`bdfactura`.`cantidad`),\'0\',`bdclick`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductosbodega4` left join `bdclick`.`bdfactura` on((`bdclick`.`bdfactura`.`producto` = `bdclick`.`bdproductosbodega4`.`idSistema`))) where (`bdclick`.`bdfactura`.`bodega` = \'BODEGA-4\') group by `bdclick`.`bdproductosbodega4`.`idSistema`
md5=154840ff61406fef2a50f9191bf84a32
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:30
create-version=2
source=select `bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`bdfactura`.`cantidad`),\'0\',`bdfactura`.`cantidad`)) AS `Expr1` from (`bdproductosbodega4` left join `bdfactura` on((`bdfactura`.`producto` = `bdproductosbodega4`.`idSistema`))) where (`bdfactura`.`bodega` = \'BODEGA-4\') group by `bdproductosbodega4`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick`.`bdfactura`.`cantidad`),\'0\',`bdclick`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductosbodega4` left join `bdclick`.`bdfactura` on((`bdclick`.`bdfactura`.`producto` = `bdclick`.`bdproductosbodega4`.`idSistema`))) where (`bdclick`.`bdfactura`.`bodega` = \'BODEGA-4\') group by `bdclick`.`bdproductosbodega4`.`idSistema`
mariadb-version=100135
