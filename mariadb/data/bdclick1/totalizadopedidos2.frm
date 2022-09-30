TYPE=VIEW
query=select `bdclick1`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`pedidos1`.`cantidad`),\'0\',`pedidos1`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega2` left join `bdclick1`.`pedidos1` on((`bdclick1`.`bdproductosbodega2`.`idSistema` = `pedidos1`.`producto`))) where (`pedidos1`.`bodega` = \'BODEGA-2\') group by `bdclick1`.`bdproductosbodega2`.`idSistema`
md5=bc720db6aea7cc39f874c1074e8425a2
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:40
create-version=2
source=select `bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`pedidos1`.`cantidad`),\'0\',`pedidos1`.`cantidad`)) AS `Expr1` from (`bdproductosbodega2` left join `pedidos1` on((`bdproductosbodega2`.`idSistema` = `pedidos1`.`producto`))) where (`pedidos1`.`bodega` = \'BODEGA-2\') group by `bdproductosbodega2`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`pedidos1`.`cantidad`),\'0\',`pedidos1`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega2` left join `bdclick1`.`pedidos1` on((`bdclick1`.`bdproductosbodega2`.`idSistema` = `pedidos1`.`producto`))) where (`pedidos1`.`bodega` = \'BODEGA-2\') group by `bdclick1`.`bdproductosbodega2`.`idSistema`
mariadb-version=100135
