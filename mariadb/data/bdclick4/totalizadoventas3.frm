TYPE=VIEW
query=select `bdclick4`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick4`.`bdfactura`.`cantidad`),\'0\',`bdclick4`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick4`.`bdproductosbodega3` left join `bdclick4`.`bdfactura` on((`bdclick4`.`bdfactura`.`producto` = `bdclick4`.`bdproductosbodega3`.`idSistema`))) where (`bdclick4`.`bdfactura`.`bodega` = \'BODEGA-3\') group by `bdclick4`.`bdproductosbodega3`.`idSistema`
md5=f6a560dcfd3495f12db2782d5ce70fa8
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:33
create-version=2
source=select `bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`bdfactura`.`cantidad`),\'0\',`bdfactura`.`cantidad`)) AS `Expr1` from (`bdproductosbodega3` left join `bdfactura` on((`bdfactura`.`producto` = `bdproductosbodega3`.`idSistema`))) where (`bdfactura`.`bodega` = \'BODEGA-3\') group by `bdproductosbodega3`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick4`.`bdfactura`.`cantidad`),\'0\',`bdclick4`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick4`.`bdproductosbodega3` left join `bdclick4`.`bdfactura` on((`bdclick4`.`bdfactura`.`producto` = `bdclick4`.`bdproductosbodega3`.`idSistema`))) where (`bdclick4`.`bdfactura`.`bodega` = \'BODEGA-3\') group by `bdclick4`.`bdproductosbodega3`.`idSistema`
mariadb-version=100135
