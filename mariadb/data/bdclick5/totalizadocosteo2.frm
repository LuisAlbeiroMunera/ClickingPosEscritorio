TYPE=VIEW
query=select `bdclick5`.`bdproductosbodega2`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdclick5`.`bdproductosbodega2` left join `bdclick5`.`costeos` on((`bdclick5`.`bdproductosbodega2`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-2\') group by `bdclick5`.`bdproductosbodega2`.`idSistema`
md5=78089af168d77fc26df496c4698deedb
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:52
create-version=2
source=select `bdproductosbodega2`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdproductosbodega2` left join `costeos` on((`bdproductosbodega2`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-2\') group by `bdproductosbodega2`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdproductosbodega2`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdclick5`.`bdproductosbodega2` left join `bdclick5`.`costeos` on((`bdclick5`.`bdproductosbodega2`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-2\') group by `bdclick5`.`bdproductosbodega2`.`idSistema`
mariadb-version=100135
