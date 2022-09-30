TYPE=VIEW
query=select `bdclick2`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductos` left join `bdclick2`.`plansepare1` on((`bdclick2`.`bdproductos`.`idSistema` = `plansepare1`.`producto`))) where ((`plansepare1`.`bodega` = \'123-22\') or (`plansepare1`.`bodega` = \'\')) group by `bdclick2`.`bdproductos`.`idSistema`
md5=75cff4b598f3d60f93c36d6b9180c3b5
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:50
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `plansepare1` on((`bdproductos`.`idSistema` = `plansepare1`.`producto`))) where ((`plansepare1`.`bodega` = \'123-22\') or (`plansepare1`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductos` left join `bdclick2`.`plansepare1` on((`bdclick2`.`bdproductos`.`idSistema` = `plansepare1`.`producto`))) where ((`plansepare1`.`bodega` = \'123-22\') or (`plansepare1`.`bodega` = \'\')) group by `bdclick2`.`bdproductos`.`idSistema`
mariadb-version=100135
