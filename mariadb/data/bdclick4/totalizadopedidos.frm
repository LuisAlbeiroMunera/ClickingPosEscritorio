TYPE=VIEW
query=select `bdclick4`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`pedidos1`.`cantidad`),\'0\',`pedidos1`.`cantidad`)) AS `Expr1` from (`bdclick4`.`bdproductos` left join `bdclick4`.`pedidos1` on((`bdclick4`.`bdproductos`.`idSistema` = `pedidos1`.`producto`))) where ((`pedidos1`.`bodega` = \'123-22\') or (`pedidos1`.`bodega` = \'\')) group by `bdclick4`.`bdproductos`.`idSistema`
md5=5178ec34ddf528ae78580e240684fbd2
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:33
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`pedidos1`.`cantidad`),\'0\',`pedidos1`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `pedidos1` on((`bdproductos`.`idSistema` = `pedidos1`.`producto`))) where ((`pedidos1`.`bodega` = \'123-22\') or (`pedidos1`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`pedidos1`.`cantidad`),\'0\',`pedidos1`.`cantidad`)) AS `Expr1` from (`bdclick4`.`bdproductos` left join `bdclick4`.`pedidos1` on((`bdclick4`.`bdproductos`.`idSistema` = `pedidos1`.`producto`))) where ((`pedidos1`.`bodega` = \'123-22\') or (`pedidos1`.`bodega` = \'\')) group by `bdclick4`.`bdproductos`.`idSistema`
mariadb-version=100135
