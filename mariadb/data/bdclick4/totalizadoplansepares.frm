TYPE=VIEW
query=select `bdclick4`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdclick4`.`bdproductos` left join `bdclick4`.`plansepare1` on((`bdclick4`.`bdproductos`.`idSistema` = `plansepare1`.`producto`))) where ((`plansepare1`.`bodega` = \'123-22\') or (`plansepare1`.`bodega` = \'\')) group by `bdclick4`.`bdproductos`.`idSistema`
md5=b2823cec2c5bae3c08e391d52ab0aa44
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:33
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `plansepare1` on((`bdproductos`.`idSistema` = `plansepare1`.`producto`))) where ((`plansepare1`.`bodega` = \'123-22\') or (`plansepare1`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdclick4`.`bdproductos` left join `bdclick4`.`plansepare1` on((`bdclick4`.`bdproductos`.`idSistema` = `plansepare1`.`producto`))) where ((`plansepare1`.`bodega` = \'123-22\') or (`plansepare1`.`bodega` = \'\')) group by `bdclick4`.`bdproductos`.`idSistema`
mariadb-version=100135
