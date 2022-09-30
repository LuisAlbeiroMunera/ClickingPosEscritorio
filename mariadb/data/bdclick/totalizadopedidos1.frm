TYPE=VIEW
query=select `bdclick`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`pedidos1`.`cantidad`),\'0\',`pedidos1`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductosbodega1` left join `bdclick`.`pedidos1` on((`bdclick`.`bdproductosbodega1`.`idSistema` = `pedidos1`.`producto`))) where (`pedidos1`.`bodega` = \'BODEGA-1\') group by `bdclick`.`bdproductosbodega1`.`idSistema`
md5=d5dfa225a8543d24ad58e3a874e63ab4
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:29
create-version=2
source=select `bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`pedidos1`.`cantidad`),\'0\',`pedidos1`.`cantidad`)) AS `Expr1` from (`bdproductosbodega1` left join `pedidos1` on((`bdproductosbodega1`.`idSistema` = `pedidos1`.`producto`))) where (`pedidos1`.`bodega` = \'BODEGA-1\') group by `bdproductosbodega1`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`pedidos1`.`cantidad`),\'0\',`pedidos1`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductosbodega1` left join `bdclick`.`pedidos1` on((`bdclick`.`bdproductosbodega1`.`idSistema` = `pedidos1`.`producto`))) where (`pedidos1`.`bodega` = \'BODEGA-1\') group by `bdclick`.`bdproductosbodega1`.`idSistema`
mariadb-version=100135
