TYPE=VIEW
query=select `bdclick3`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`oservicio3`.`cantidad`),\'0\',`oservicio3`.`cantidad`)) AS `Expr1` from (`bdclick3`.`bdproductos` left join `bdclick3`.`oservicio3` on((`bdclick3`.`bdproductos`.`idSistema` = `oservicio3`.`producto`))) where ((`oservicio3`.`bodega` = \'123-22\') or (`oservicio3`.`bodega` = \'\')) group by `bdclick3`.`bdproductos`.`idSistema`
md5=de3a803539335c7e865fac27c1729ad8
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:56
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`oservicio3`.`cantidad`),\'0\',`oservicio3`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `oservicio3` on((`bdproductos`.`idSistema` = `oservicio3`.`producto`))) where ((`oservicio3`.`bodega` = \'123-22\') or (`oservicio3`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`oservicio3`.`cantidad`),\'0\',`oservicio3`.`cantidad`)) AS `Expr1` from (`bdclick3`.`bdproductos` left join `bdclick3`.`oservicio3` on((`bdclick3`.`bdproductos`.`idSistema` = `oservicio3`.`producto`))) where ((`oservicio3`.`bodega` = \'123-22\') or (`oservicio3`.`bodega` = \'\')) group by `bdclick3`.`bdproductos`.`idSistema`
mariadb-version=100135
