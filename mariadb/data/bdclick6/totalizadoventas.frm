TYPE=VIEW
query=select `bdclick6`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick6`.`bdfactura`.`cantidad`),\'0\',`bdclick6`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductos` left join `bdclick6`.`bdfactura` on((`bdclick6`.`bdfactura`.`producto` = `bdclick6`.`bdproductos`.`idSistema`))) where ((`bdclick6`.`bdfactura`.`bodega` = \'123-22\') or (`bdclick6`.`bdfactura`.`bodega` = \'\')) group by `bdclick6`.`bdproductos`.`idSistema`
md5=8b14a70e4ebf4e48c844c88b7ab63693
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:42
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdfactura`.`cantidad`),\'0\',`bdfactura`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `bdfactura` on((`bdfactura`.`producto` = `bdproductos`.`idSistema`))) where ((`bdfactura`.`bodega` = \'123-22\') or (`bdfactura`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick6`.`bdfactura`.`cantidad`),\'0\',`bdclick6`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductos` left join `bdclick6`.`bdfactura` on((`bdclick6`.`bdfactura`.`producto` = `bdclick6`.`bdproductos`.`idSistema`))) where ((`bdclick6`.`bdfactura`.`bodega` = \'123-22\') or (`bdclick6`.`bdfactura`.`bodega` = \'\')) group by `bdclick6`.`bdproductos`.`idSistema`
mariadb-version=100135
