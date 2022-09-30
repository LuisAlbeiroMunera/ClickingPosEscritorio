TYPE=VIEW
query=select `bdclick5`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdclick5`.`bdproductos` left join `bdclick5`.`plansepare1` on((`bdclick5`.`bdproductos`.`idSistema` = `plansepare1`.`producto`))) where ((`plansepare1`.`bodega` = \'123-22\') or (`plansepare1`.`bodega` = \'\')) group by `bdclick5`.`bdproductos`.`idSistema`
md5=e0a9beffc8b713505ead3f9959bda944
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:53
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `plansepare1` on((`bdproductos`.`idSistema` = `plansepare1`.`producto`))) where ((`plansepare1`.`bodega` = \'123-22\') or (`plansepare1`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdclick5`.`bdproductos` left join `bdclick5`.`plansepare1` on((`bdclick5`.`bdproductos`.`idSistema` = `plansepare1`.`producto`))) where ((`plansepare1`.`bodega` = \'123-22\') or (`plansepare1`.`bodega` = \'\')) group by `bdclick5`.`bdproductos`.`idSistema`
mariadb-version=100135
