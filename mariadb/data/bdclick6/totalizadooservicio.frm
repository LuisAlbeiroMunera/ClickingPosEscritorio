TYPE=VIEW
query=select `bdclick6`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`oservicio3`.`cantidad`),\'0\',`oservicio3`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductos` left join `bdclick6`.`oservicio3` on((`bdclick6`.`bdproductos`.`idSistema` = `oservicio3`.`producto`))) where ((`oservicio3`.`bodega` = \'123-22\') or (`oservicio3`.`bodega` = \'\')) group by `bdclick6`.`bdproductos`.`idSistema`
md5=d32d81d525042fc47dd88fa2f1eace38
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:41
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`oservicio3`.`cantidad`),\'0\',`oservicio3`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `oservicio3` on((`bdproductos`.`idSistema` = `oservicio3`.`producto`))) where ((`oservicio3`.`bodega` = \'123-22\') or (`oservicio3`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`oservicio3`.`cantidad`),\'0\',`oservicio3`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductos` left join `bdclick6`.`oservicio3` on((`bdclick6`.`bdproductos`.`idSistema` = `oservicio3`.`producto`))) where ((`oservicio3`.`bodega` = \'123-22\') or (`oservicio3`.`bodega` = \'\')) group by `bdclick6`.`bdproductos`.`idSistema`
mariadb-version=100135
