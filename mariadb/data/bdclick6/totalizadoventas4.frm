TYPE=VIEW
query=select `bdclick6`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick6`.`bdfactura`.`cantidad`),\'0\',`bdclick6`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductosbodega4` left join `bdclick6`.`bdfactura` on((`bdclick6`.`bdfactura`.`producto` = `bdclick6`.`bdproductosbodega4`.`idSistema`))) where (`bdclick6`.`bdfactura`.`bodega` = \'BODEGA-4\') group by `bdclick6`.`bdproductosbodega4`.`idSistema`
md5=4a7ff37f17f9320d31acfd12075bafab
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:42
create-version=2
source=select `bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`bdfactura`.`cantidad`),\'0\',`bdfactura`.`cantidad`)) AS `Expr1` from (`bdproductosbodega4` left join `bdfactura` on((`bdfactura`.`producto` = `bdproductosbodega4`.`idSistema`))) where (`bdfactura`.`bodega` = \'BODEGA-4\') group by `bdproductosbodega4`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick6`.`bdfactura`.`cantidad`),\'0\',`bdclick6`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductosbodega4` left join `bdclick6`.`bdfactura` on((`bdclick6`.`bdfactura`.`producto` = `bdclick6`.`bdproductosbodega4`.`idSistema`))) where (`bdclick6`.`bdfactura`.`bodega` = \'BODEGA-4\') group by `bdclick6`.`bdproductosbodega4`.`idSistema`
mariadb-version=100135
