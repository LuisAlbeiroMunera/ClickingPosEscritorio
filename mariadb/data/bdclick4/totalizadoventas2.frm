TYPE=VIEW
query=select `bdclick4`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick4`.`bdfactura`.`cantidad`),\'0\',`bdclick4`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick4`.`bdproductosbodega2` left join `bdclick4`.`bdfactura` on((`bdclick4`.`bdfactura`.`producto` = `bdclick4`.`bdproductosbodega2`.`idSistema`))) where (`bdclick4`.`bdfactura`.`bodega` = \'BODEGA-2\') group by `bdclick4`.`bdproductosbodega2`.`idSistema`
md5=b78d01f02739dca7bd8a01ac349ac632
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:33
create-version=2
source=select `bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`bdfactura`.`cantidad`),\'0\',`bdfactura`.`cantidad`)) AS `Expr1` from (`bdproductosbodega2` left join `bdfactura` on((`bdfactura`.`producto` = `bdproductosbodega2`.`idSistema`))) where (`bdfactura`.`bodega` = \'BODEGA-2\') group by `bdproductosbodega2`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick4`.`bdfactura`.`cantidad`),\'0\',`bdclick4`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick4`.`bdproductosbodega2` left join `bdclick4`.`bdfactura` on((`bdclick4`.`bdfactura`.`producto` = `bdclick4`.`bdproductosbodega2`.`idSistema`))) where (`bdclick4`.`bdfactura`.`bodega` = \'BODEGA-2\') group by `bdclick4`.`bdproductosbodega2`.`idSistema`
mariadb-version=100135
