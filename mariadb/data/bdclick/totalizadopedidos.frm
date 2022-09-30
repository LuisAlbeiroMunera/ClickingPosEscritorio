TYPE=VIEW
query=select `bdclick`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`pedidos1`.`cantidad`),\'0\',`pedidos1`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductos` left join `bdclick`.`pedidos1` on((`bdclick`.`bdproductos`.`idSistema` = `pedidos1`.`producto`))) where ((`pedidos1`.`bodega` = \'123-22\') or (`pedidos1`.`bodega` = \'\')) group by `bdclick`.`bdproductos`.`idSistema`
md5=b31c6e8f9bf1efde0923b7e9f4efc595
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:29
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`pedidos1`.`cantidad`),\'0\',`pedidos1`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `pedidos1` on((`bdproductos`.`idSistema` = `pedidos1`.`producto`))) where ((`pedidos1`.`bodega` = \'123-22\') or (`pedidos1`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`pedidos1`.`cantidad`),\'0\',`pedidos1`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductos` left join `bdclick`.`pedidos1` on((`bdclick`.`bdproductos`.`idSistema` = `pedidos1`.`producto`))) where ((`pedidos1`.`bodega` = \'123-22\') or (`pedidos1`.`bodega` = \'\')) group by `bdclick`.`bdproductos`.`idSistema`
mariadb-version=100135
