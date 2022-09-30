TYPE=VIEW
query=select `bdclick1`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductos` left join `bdclick1`.`plansepare1` on((`bdclick1`.`bdproductos`.`idSistema` = `plansepare1`.`producto`))) where ((`plansepare1`.`bodega` = \'123-22\') or (`plansepare1`.`bodega` = \'\')) group by `bdclick1`.`bdproductos`.`idSistema`
md5=0d5c19a652cb877043c0d0a1f1a60fe7
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:40
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `plansepare1` on((`bdproductos`.`idSistema` = `plansepare1`.`producto`))) where ((`plansepare1`.`bodega` = \'123-22\') or (`plansepare1`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductos` left join `bdclick1`.`plansepare1` on((`bdclick1`.`bdproductos`.`idSistema` = `plansepare1`.`producto`))) where ((`plansepare1`.`bodega` = \'123-22\') or (`plansepare1`.`bodega` = \'\')) group by `bdclick1`.`bdproductos`.`idSistema`
mariadb-version=100135
