TYPE=VIEW
query=select `bdclick5`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`armados`.`total`),\'0\',`armados`.`total`)) AS `Expr1` from (`bdclick5`.`bdproductos` left join `bdclick5`.`armados` on((`bdclick5`.`bdproductos`.`idSistema` = `armados`.`producto`))) where ((`armados`.`bodega` = \'123-22\') or (`armados`.`bodega` = \'\')) group by `bdclick5`.`bdproductos`.`idSistema`
md5=2a35ddfa143e7feb6ddf52dfd38b2696
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:51
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`armados`.`total`),\'0\',`armados`.`total`)) AS `Expr1` from (`bdproductos` left join `armados` on((`bdproductos`.`idSistema` = `armados`.`producto`))) where ((`armados`.`bodega` = \'123-22\') or (`armados`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`armados`.`total`),\'0\',`armados`.`total`)) AS `Expr1` from (`bdclick5`.`bdproductos` left join `bdclick5`.`armados` on((`bdclick5`.`bdproductos`.`idSistema` = `armados`.`producto`))) where ((`armados`.`bodega` = \'123-22\') or (`armados`.`bodega` = \'\')) group by `bdclick5`.`bdproductos`.`idSistema`
mariadb-version=100135
