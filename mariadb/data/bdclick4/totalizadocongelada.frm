TYPE=VIEW
query=select `bdclick4`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick4`.`bdcongelada`.`cantidad`),\'0\',`bdclick4`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick4`.`bdproductos` left join `bdclick4`.`bdcongelada` on((`bdclick4`.`bdcongelada`.`producto` = `bdclick4`.`bdproductos`.`idSistema`))) where (`bdclick4`.`bdcongelada`.`bodega` = \'123-22\') group by `bdclick4`.`bdproductos`.`idSistema`
md5=640c94cdc2995ecc716b995a9f19179a
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:32
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdcongelada`.`cantidad`),\'0\',`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `bdcongelada` on((`bdcongelada`.`producto` = `bdproductos`.`idSistema`))) where (`bdcongelada`.`bodega` = \'123-22\') group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick4`.`bdcongelada`.`cantidad`),\'0\',`bdclick4`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick4`.`bdproductos` left join `bdclick4`.`bdcongelada` on((`bdclick4`.`bdcongelada`.`producto` = `bdclick4`.`bdproductos`.`idSistema`))) where (`bdclick4`.`bdcongelada`.`bodega` = \'123-22\') group by `bdclick4`.`bdproductos`.`idSistema`
mariadb-version=100135
