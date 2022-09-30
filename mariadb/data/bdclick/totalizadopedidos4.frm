TYPE=VIEW
query=select `bdclick`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`pedidos1`.`cantidad`),\'0\',`pedidos1`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductosbodega4` left join `bdclick`.`pedidos1` on((`bdclick`.`bdproductosbodega4`.`idSistema` = `pedidos1`.`producto`))) where (`pedidos1`.`bodega` = \'BODEGA-4\') group by `bdclick`.`bdproductosbodega4`.`idSistema`
md5=2f6ee167d10e8b4f9cbb24d74f8e57f6
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:29
create-version=2
source=select `bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`pedidos1`.`cantidad`),\'0\',`pedidos1`.`cantidad`)) AS `Expr1` from (`bdproductosbodega4` left join `pedidos1` on((`bdproductosbodega4`.`idSistema` = `pedidos1`.`producto`))) where (`pedidos1`.`bodega` = \'BODEGA-4\') group by `bdproductosbodega4`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`pedidos1`.`cantidad`),\'0\',`pedidos1`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductosbodega4` left join `bdclick`.`pedidos1` on((`bdclick`.`bdproductosbodega4`.`idSistema` = `pedidos1`.`producto`))) where (`pedidos1`.`bodega` = \'BODEGA-4\') group by `bdclick`.`bdproductosbodega4`.`idSistema`
mariadb-version=100135
