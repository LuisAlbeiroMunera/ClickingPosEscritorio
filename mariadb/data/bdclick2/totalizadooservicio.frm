TYPE=VIEW
query=select `bdclick2`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`oservicio3`.`cantidad`),\'0\',`oservicio3`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductos` left join `bdclick2`.`oservicio3` on((`bdclick2`.`bdproductos`.`idSistema` = `oservicio3`.`producto`))) where ((`oservicio3`.`bodega` = \'123-22\') or (`oservicio3`.`bodega` = \'\')) group by `bdclick2`.`bdproductos`.`idSistema`
md5=287461c1cb3f89de9724977be5a4dec2
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:50
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`oservicio3`.`cantidad`),\'0\',`oservicio3`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `oservicio3` on((`bdproductos`.`idSistema` = `oservicio3`.`producto`))) where ((`oservicio3`.`bodega` = \'123-22\') or (`oservicio3`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`oservicio3`.`cantidad`),\'0\',`oservicio3`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductos` left join `bdclick2`.`oservicio3` on((`bdclick2`.`bdproductos`.`idSistema` = `oservicio3`.`producto`))) where ((`oservicio3`.`bodega` = \'123-22\') or (`oservicio3`.`bodega` = \'\')) group by `bdclick2`.`bdproductos`.`idSistema`
mariadb-version=100135
