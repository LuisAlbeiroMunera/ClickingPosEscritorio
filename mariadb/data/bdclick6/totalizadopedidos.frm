TYPE=VIEW
query=select `bdclick6`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`pedidos1`.`cantidad`),\'0\',`pedidos1`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductos` left join `bdclick6`.`pedidos1` on((`bdclick6`.`bdproductos`.`idSistema` = `pedidos1`.`producto`))) where ((`pedidos1`.`bodega` = \'123-22\') or (`pedidos1`.`bodega` = \'\')) group by `bdclick6`.`bdproductos`.`idSistema`
md5=35f341dd5de254fc7ed704713e92d939
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:41
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`pedidos1`.`cantidad`),\'0\',`pedidos1`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `pedidos1` on((`bdproductos`.`idSistema` = `pedidos1`.`producto`))) where ((`pedidos1`.`bodega` = \'123-22\') or (`pedidos1`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`pedidos1`.`cantidad`),\'0\',`pedidos1`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductos` left join `bdclick6`.`pedidos1` on((`bdclick6`.`bdproductos`.`idSistema` = `pedidos1`.`producto`))) where ((`pedidos1`.`bodega` = \'123-22\') or (`pedidos1`.`bodega` = \'\')) group by `bdclick6`.`bdproductos`.`idSistema`
mariadb-version=100135
