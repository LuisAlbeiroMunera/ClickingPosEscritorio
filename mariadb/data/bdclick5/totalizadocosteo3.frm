TYPE=VIEW
query=select `bdclick5`.`bdproductosbodega3`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdclick5`.`bdproductosbodega3` left join `bdclick5`.`costeos` on((`bdclick5`.`bdproductosbodega3`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-3\') group by `bdclick5`.`bdproductosbodega3`.`idSistema`
md5=4758eb80c28db4d5968fd8cb97f2384c
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:52
create-version=2
source=select `bdproductosbodega3`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdproductosbodega3` left join `costeos` on((`bdproductosbodega3`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-3\') group by `bdproductosbodega3`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdproductosbodega3`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdclick5`.`bdproductosbodega3` left join `bdclick5`.`costeos` on((`bdclick5`.`bdproductosbodega3`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-3\') group by `bdclick5`.`bdproductosbodega3`.`idSistema`
mariadb-version=100135
