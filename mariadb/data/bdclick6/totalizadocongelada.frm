TYPE=VIEW
query=select `bdclick6`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick6`.`bdcongelada`.`cantidad`),\'0\',`bdclick6`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductos` left join `bdclick6`.`bdcongelada` on((`bdclick6`.`bdcongelada`.`producto` = `bdclick6`.`bdproductos`.`idSistema`))) where (`bdclick6`.`bdcongelada`.`bodega` = \'123-22\') group by `bdclick6`.`bdproductos`.`idSistema`
md5=a9e2066edfc24d18ac62adf78004b83a
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:40
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdcongelada`.`cantidad`),\'0\',`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `bdcongelada` on((`bdcongelada`.`producto` = `bdproductos`.`idSistema`))) where (`bdcongelada`.`bodega` = \'123-22\') group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick6`.`bdcongelada`.`cantidad`),\'0\',`bdclick6`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductos` left join `bdclick6`.`bdcongelada` on((`bdclick6`.`bdcongelada`.`producto` = `bdclick6`.`bdproductos`.`idSistema`))) where (`bdclick6`.`bdcongelada`.`bodega` = \'123-22\') group by `bdclick6`.`bdproductos`.`idSistema`
mariadb-version=100135
