TYPE=VIEW
query=select `bdclick1`.`bdproductosbodega1`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega1` left join `bdclick1`.`costeos` on((`bdclick1`.`bdproductosbodega1`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-1\') group by `bdclick1`.`bdproductosbodega1`.`idSistema`
md5=a499f87341d4a028e761f4eebd571b7e
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:39
create-version=2
source=select `bdproductosbodega1`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdproductosbodega1` left join `costeos` on((`bdproductosbodega1`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-1\') group by `bdproductosbodega1`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdproductosbodega1`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega1` left join `bdclick1`.`costeos` on((`bdclick1`.`bdproductosbodega1`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-1\') group by `bdclick1`.`bdproductosbodega1`.`idSistema`
mariadb-version=100135
