TYPE=VIEW
query=select `bdclick`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick`.`bdcongelada`.`cantidad`),\'0\',`bdclick`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductos` left join `bdclick`.`bdcongelada` on((`bdclick`.`bdcongelada`.`producto` = `bdclick`.`bdproductos`.`idSistema`))) where (`bdclick`.`bdcongelada`.`bodega` = \'123-22\') group by `bdclick`.`bdproductos`.`idSistema`
md5=92fbea9df02fe2273f4e1b0d862f3c25
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:29
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdcongelada`.`cantidad`),\'0\',`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `bdcongelada` on((`bdcongelada`.`producto` = `bdproductos`.`idSistema`))) where (`bdcongelada`.`bodega` = \'123-22\') group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick`.`bdcongelada`.`cantidad`),\'0\',`bdclick`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductos` left join `bdclick`.`bdcongelada` on((`bdclick`.`bdcongelada`.`producto` = `bdclick`.`bdproductos`.`idSistema`))) where (`bdclick`.`bdcongelada`.`bodega` = \'123-22\') group by `bdclick`.`bdproductos`.`idSistema`
mariadb-version=100135
