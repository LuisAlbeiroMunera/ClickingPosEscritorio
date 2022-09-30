TYPE=VIEW
query=select `bdclick2`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick2`.`bdcongelada`.`cantidad`),\'0\',`bdclick2`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductos` left join `bdclick2`.`bdcongelada` on((`bdclick2`.`bdcongelada`.`producto` = `bdclick2`.`bdproductos`.`idSistema`))) where (`bdclick2`.`bdcongelada`.`bodega` = \'123-22\') group by `bdclick2`.`bdproductos`.`idSistema`
md5=a55ab4182b80906a4326450f135717fa
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:49
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdcongelada`.`cantidad`),\'0\',`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `bdcongelada` on((`bdcongelada`.`producto` = `bdproductos`.`idSistema`))) where (`bdcongelada`.`bodega` = \'123-22\') group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick2`.`bdcongelada`.`cantidad`),\'0\',`bdclick2`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductos` left join `bdclick2`.`bdcongelada` on((`bdclick2`.`bdcongelada`.`producto` = `bdclick2`.`bdproductos`.`idSistema`))) where (`bdclick2`.`bdcongelada`.`bodega` = \'123-22\') group by `bdclick2`.`bdproductos`.`idSistema`
mariadb-version=100135
