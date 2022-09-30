TYPE=VIEW
query=select `bdclick`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`pedidos1`.`cantidad`),\'0\',`pedidos1`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductosbodega2` left join `bdclick`.`pedidos1` on((`bdclick`.`bdproductosbodega2`.`idSistema` = `pedidos1`.`producto`))) where (`pedidos1`.`bodega` = \'BODEGA-2\') group by `bdclick`.`bdproductosbodega2`.`idSistema`
md5=fd605051d335bd3007ffa9c69f0414dd
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:29
create-version=2
source=select `bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`pedidos1`.`cantidad`),\'0\',`pedidos1`.`cantidad`)) AS `Expr1` from (`bdproductosbodega2` left join `pedidos1` on((`bdproductosbodega2`.`idSistema` = `pedidos1`.`producto`))) where (`pedidos1`.`bodega` = \'BODEGA-2\') group by `bdproductosbodega2`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`pedidos1`.`cantidad`),\'0\',`pedidos1`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductosbodega2` left join `bdclick`.`pedidos1` on((`bdclick`.`bdproductosbodega2`.`idSistema` = `pedidos1`.`producto`))) where (`pedidos1`.`bodega` = \'BODEGA-2\') group by `bdclick`.`bdproductosbodega2`.`idSistema`
mariadb-version=100135
