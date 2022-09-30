TYPE=VIEW
query=select `bdclick`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductos` left join `bdclick`.`plansepare1` on((`bdclick`.`bdproductos`.`idSistema` = `plansepare1`.`producto`))) where ((`plansepare1`.`bodega` = \'123-22\') or (`plansepare1`.`bodega` = \'\')) group by `bdclick`.`bdproductos`.`idSistema`
md5=1e461e9a32ba2e558c4d45e72bd7fa02
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:29
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `plansepare1` on((`bdproductos`.`idSistema` = `plansepare1`.`producto`))) where ((`plansepare1`.`bodega` = \'123-22\') or (`plansepare1`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductos` left join `bdclick`.`plansepare1` on((`bdclick`.`bdproductos`.`idSistema` = `plansepare1`.`producto`))) where ((`plansepare1`.`bodega` = \'123-22\') or (`plansepare1`.`bodega` = \'\')) group by `bdclick`.`bdproductos`.`idSistema`
mariadb-version=100135
