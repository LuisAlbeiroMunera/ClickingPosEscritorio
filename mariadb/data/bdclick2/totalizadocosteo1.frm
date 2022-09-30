TYPE=VIEW
query=select `bdclick2`.`bdproductosbodega1`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdclick2`.`bdproductosbodega1` left join `bdclick2`.`costeos` on((`bdclick2`.`bdproductosbodega1`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-1\') group by `bdclick2`.`bdproductosbodega1`.`idSistema`
md5=ba66fa44eae36b981cbea0c0f93c115a
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:50
create-version=2
source=select `bdproductosbodega1`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdproductosbodega1` left join `costeos` on((`bdproductosbodega1`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-1\') group by `bdproductosbodega1`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdproductosbodega1`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdclick2`.`bdproductosbodega1` left join `bdclick2`.`costeos` on((`bdclick2`.`bdproductosbodega1`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-1\') group by `bdclick2`.`bdproductosbodega1`.`idSistema`
mariadb-version=100135
