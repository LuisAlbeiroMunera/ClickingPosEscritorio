TYPE=VIEW
query=select `bdclick6`.`bdproductosbodega1`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdclick6`.`bdproductosbodega1` left join `bdclick6`.`costeos` on((`bdclick6`.`bdproductosbodega1`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-1\') group by `bdclick6`.`bdproductosbodega1`.`idSistema`
md5=d13c1042eae56f2669d1224b50fd6c3a
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:41
create-version=2
source=select `bdproductosbodega1`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdproductosbodega1` left join `costeos` on((`bdproductosbodega1`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-1\') group by `bdproductosbodega1`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdproductosbodega1`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdclick6`.`bdproductosbodega1` left join `bdclick6`.`costeos` on((`bdclick6`.`bdproductosbodega1`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-1\') group by `bdclick6`.`bdproductosbodega1`.`idSistema`
mariadb-version=100135
