TYPE=VIEW
query=select `bdclick`.`bdproductosbodega1`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdclick`.`bdproductosbodega1` left join `bdclick`.`costeos` on((`bdclick`.`bdproductosbodega1`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-1\') group by `bdclick`.`bdproductosbodega1`.`idSistema`
md5=f6cf457ff6d3aa2c9c749ddf119f06eb
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:29
create-version=2
source=select `bdproductosbodega1`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdproductosbodega1` left join `costeos` on((`bdproductosbodega1`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-1\') group by `bdproductosbodega1`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdproductosbodega1`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdclick`.`bdproductosbodega1` left join `bdclick`.`costeos` on((`bdclick`.`bdproductosbodega1`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-1\') group by `bdclick`.`bdproductosbodega1`.`idSistema`
mariadb-version=100135
