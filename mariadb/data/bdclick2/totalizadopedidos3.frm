TYPE=VIEW
query=select `bdclick2`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`pedidos1`.`cantidad`),\'0\',`pedidos1`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductosbodega3` left join `bdclick2`.`pedidos1` on((`bdclick2`.`bdproductosbodega3`.`idSistema` = `pedidos1`.`producto`))) where (`pedidos1`.`bodega` = \'BODEGA-3\') group by `bdclick2`.`bdproductosbodega3`.`idSistema`
md5=72a8396dafe2dc7b6016c48af737dd64
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:50
create-version=2
source=select `bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`pedidos1`.`cantidad`),\'0\',`pedidos1`.`cantidad`)) AS `Expr1` from (`bdproductosbodega3` left join `pedidos1` on((`bdproductosbodega3`.`idSistema` = `pedidos1`.`producto`))) where (`pedidos1`.`bodega` = \'BODEGA-3\') group by `bdproductosbodega3`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`pedidos1`.`cantidad`),\'0\',`pedidos1`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductosbodega3` left join `bdclick2`.`pedidos1` on((`bdclick2`.`bdproductosbodega3`.`idSistema` = `pedidos1`.`producto`))) where (`pedidos1`.`bodega` = \'BODEGA-3\') group by `bdclick2`.`bdproductosbodega3`.`idSistema`
mariadb-version=100135
